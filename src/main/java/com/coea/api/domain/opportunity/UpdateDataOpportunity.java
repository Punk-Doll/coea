package com.coea.api.domain.opportunity;

import jakarta.validation.constraints.NotNull;

public record UpdateDataOpportunity(@NotNull Long id, String title,
                                    String project_name,
                                    String project_describe,
                                    String R2D2,
                                    String location,
                                    String grade,
                                    String requirements,
                                    String status,
                                    String manager

) {
}
