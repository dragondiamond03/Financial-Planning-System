package pjb02.team1.financialplanning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pjb02.team1.financialplanning.entities.MonthReport;
import pjb02.team1.financialplanning.entities.MonthReportDetail;
import pjb02.team1.financialplanning.entities.MonthReportDetailPK;

import java.util.List;

public interface MonthReportDetailRepository extends JpaRepository<MonthReportDetail, MonthReportDetailPK> {
    List<MonthReportDetail> findByMonthReport(MonthReport monthReport);
}
