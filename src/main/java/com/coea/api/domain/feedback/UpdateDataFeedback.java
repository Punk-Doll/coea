package com.coea.api.domain.feedback;

import jakarta.validation.constraints.NotNull;

public record UpdateDataFeedback(
        @NotNull
        long id,
        String name_employee,
        String skill_employee,
        String pep,
        String manager,
        String feedback_date,
        String feedback,
        String employee_score) {
}
