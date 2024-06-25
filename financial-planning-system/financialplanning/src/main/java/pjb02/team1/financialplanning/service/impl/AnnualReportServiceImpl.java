package pjb02.team1.financialplanning.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pjb02.team1.financialplanning.dto.AnnualReportDTO;
import pjb02.team1.financialplanning.entities.MonthReport;
import pjb02.team1.financialplanning.entities.MonthReportDetail;
import pjb02.team1.financialplanning.repository.MonthReportDetailRepository;
import pjb02.team1.financialplanning.repository.MonthReportRepository;
import pjb02.team1.financialplanning.service.AnnualReportService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AnnualReportServiceImpl implements AnnualReportService {

    @Autowired
    private MonthReportRepository monthReportRepository;

    @Autowired
    private MonthReportDetailRepository monthReportDetailRepository;

    @Override
    public List<AnnualReportDTO> getALl() {

        List<MonthReport> monthReports = monthReportRepository.findAll();

        Map<Integer, List<MonthReport>> monthReportsByYear = monthReports.stream()
                .collect(Collectors.groupingBy(monthReport -> monthReport.getMonth().getYear()));

        List<AnnualReportDTO> annualReports = new ArrayList<>();

        int id =1;
        for (Map.Entry<Integer, List<MonthReport>> entry : monthReportsByYear.entrySet()) {
            int year = entry.getKey();
            List<MonthReport> monthReportsOfYear = entry.getValue();

            long totalExpense = 0;
            int totalDepartment = (int) monthReportsOfYear.stream()
                    .map(MonthReport::getDepartmentId)
                    .distinct()
                    .count();

            for (MonthReport monthReport : monthReportsOfYear) {
                List<MonthReportDetail> monthReportDetails = monthReportDetailRepository.findByMonthReport(monthReport);

                totalExpense += monthReportDetails.stream()
                        .mapToLong(detail -> detail.getUnitPrice() * detail.getAmount())
                        .sum();
            }

            AnnualReportDTO annualReport = AnnualReportDTO.builder()
                    .annualReportId(id++)
                    .year(year)
                    .totalExpense(totalExpense)
                    .totalDepartment(totalDepartment)
                    .createdDate(LocalDate.of(year, 1, 5))
                    .build();

            log.info(annualReport.toString());
            annualReports.add(annualReport);
        }

        return annualReports;
    }
}
