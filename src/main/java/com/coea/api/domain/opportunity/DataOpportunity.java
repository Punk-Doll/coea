package com.coea.api.domain.opportunity;
import jakarta.validation.constraints.NotBlank;

public record DataOpportunity(

        @NotBlank
        String title,
        @NotBlank
        String project_name,
        @NotBlank
        String project_describe,
        @NotBlank
        String R2D2,
        @NotBlank
        String location,
        @NotBlank
        String grade,
        @NotBlank
        String requirements,
        @NotBlank
        String status,
        @NotBlank
        String manager
        ) {
}
