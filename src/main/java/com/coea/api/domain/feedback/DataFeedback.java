package com.coea.api.domain.feedback;

import jakarta.validation.constraints.NotBlank;

public record DataFeedback(
        @NotBlank
        String name_employee,
        @NotBlank
        String skill_employee,
        @NotBlank
        String pep,
        @NotBlank
        String manager,
        @NotBlank
        String feedback_date,
        @NotBlank
        String feedback,
        @NotBlank
        String employee_score
) {
}
