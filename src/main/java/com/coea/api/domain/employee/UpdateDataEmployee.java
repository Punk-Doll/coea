package com.coea.api.domain.employee;

import jakarta.validation.constraints.NotNull;

public record UpdateDataEmployee(
        @NotNull Long id,

        String name,
        String end_date,
        String phone,
        String email,
        String unit,
        String cost_center,
        String contract_manager,
        String pep,
        String squad,
        String project_manager) {

}


