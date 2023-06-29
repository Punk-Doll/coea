package com.coea.api.domain.opportunity;

import com.coea.api.domain.employee.Employee;

public record DataDetailsOpportunity(
        long id,
        String title,
        String project_name,
        String project_describe,
        String R2D2,
        String location,
        String grade,
        String requirements,
        String status,
        String manager) {


    public DataDetailsOpportunity(Opportunity opportunity){
        this(opportunity.getId(), opportunity.getTitle(), opportunity.getProject_name(), opportunity.getProject_describe(), opportunity.getR2D2(), opportunity.getLocation(), opportunity.getGrade(), opportunity.getRequirements(), opportunity.getStatus(), opportunity.getManager());
    }
}
