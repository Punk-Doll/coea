package com.coea.api.domain.employee;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DataEmployee(
        @NotBlank
        String start_date,
        @NotBlank
        String end_date,
        @NotBlank(message = "Register é obrigatório")
        String register,
        @NotBlank
        String employee_name,
        @NotBlank
        String phone,
        @NotBlank @Email(message = "{email.invalido}")
        String email,
        @NotBlank
        String gender,
        @NotBlank
        String skill,
        @NotBlank
        String employee_position,
        @NotBlank
        String location,
        @NotBlank
        String unit,
        String cost_center,
        String contract_manager,
        String pep,
        String project_manager,
        String squad,
        String last_review_score,
        String date_last_feedback,
        String feedback,
        String start_date_vacation,
        String end_date_vacation,
        String date_order_promotion,
        String reason_promotion,
        String refuse_promotion) {
}
