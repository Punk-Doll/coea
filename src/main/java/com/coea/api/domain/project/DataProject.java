package com.coea.api.domain.project;
import jakarta.validation.constraints.NotBlank;
public record DataProject(
        @NotBlank
        String proposal,
        @NotBlank
        String pep,
        @NotBlank
        String describe_project,
        @NotBlank
        String start_date,
        @NotBlank
        String start_end,
        @NotBlank
        String amount_hours,
        @NotBlank
        String amount_hours_profile,
        @NotBlank
        String hours_month,
        @NotBlank
        String hours_month_profile,
        @NotBlank
        String score_profile,
        @NotBlank
        String final_estimate,
        @NotBlank
        String final_estimate_profile,
        @NotBlank
        String score_project,
        @NotBlank
        String responsible_project,
        @NotBlank
        String manager_client,
        @NotBlank
        String active_revenue
) {
}
