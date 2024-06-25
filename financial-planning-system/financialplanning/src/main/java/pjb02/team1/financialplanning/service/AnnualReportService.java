package pjb02.team1.financialplanning.service;

import pjb02.team1.financialplanning.dto.AnnualReportDTO;

import java.util.List;

public interface AnnualReportService {

    /**
     * Get all annual reports
     *
     * @return List<AnnualReportDTO>
     */
     List<AnnualReportDTO> getALl();
}
