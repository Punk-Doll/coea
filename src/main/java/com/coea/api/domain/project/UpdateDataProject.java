package com.coea.api.domain.project;

public record UpdateDataProject(
        long id,
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
        String active_revenue

) {
}
