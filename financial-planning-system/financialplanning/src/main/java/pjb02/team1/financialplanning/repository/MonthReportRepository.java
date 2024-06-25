package pjb02.team1.financialplanning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pjb02.team1.financialplanning.entities.MonthReport;
import pjb02.team1.financialplanning.entities.MonthReportPK;

public interface MonthReportRepository extends JpaRepository<MonthReport, MonthReportPK> {

}

