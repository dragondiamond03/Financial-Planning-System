package pjb02.team1.financialplanning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pjb02.team1.financialplanning.dto.AnnualReportDTO;
import pjb02.team1.financialplanning.dto.MonthReportDTO;
import pjb02.team1.financialplanning.entities.MonthReport;
import pjb02.team1.financialplanning.entities.Term;
import pjb02.team1.financialplanning.repository.MonthReportRepository;
import pjb02.team1.financialplanning.repository.TermRepository;
import pjb02.team1.financialplanning.service.AnnualReportService;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/annual")
public class AnnualReportController {

    @Autowired
    private AnnualReportService annualReportService;

    @Autowired
    private TermRepository termRepository;

    @GetMapping("/annual-report")
    public String showAnnualReport() {
        return "annual";
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<AnnualReportDTO> getAll() {
        return annualReportService.getALl() ;
    }

}
