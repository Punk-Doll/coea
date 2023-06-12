package com.coea.api.domain.project;

public record DataListProject(long id,
                              String proposal,
                              String pep,
                              String describe_project,
                              String start_date,
                              String start_end,
                              String amount_hours,
                              String amount_hours_profile,
                              String hours_month,
                              String hours_month_profile,
                              String score_profile,
                              String final_estimate,
                              String final_estimate_profile,
                              String score_project,
                              String responsible_project,
                              String manager_client,
                              String active_revenue) {

    public DataListProject(Project project){
        this(project.getId(), project.getProposal(), project.getPep(), project.getDescribe_project(), project.getStart_date(), project.getStart_end(),project.getAmount_hours(),project.getAmount_hours_profile(), project.getHours_month(), project.getHours_month_profile(), project.getScore_profile(), project.getFinal_estimate(), project.getFinal_estimate_profile(), project.getScore_project(),project.getResponsible_project(),project.getManager_client(), project.getActive_revenue() );
    }

}
