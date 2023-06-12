package com.coea.api.domain.feedback;

import com.coea.api.domain.employee.Employee;

public record DataDetailsFeedback(
        long id,
        String name_employee,
        String skill_employee,
        String pep,
        String manager,
        String feedback_date,
        String feedback,
        String employee_score

) {

    public DataDetailsFeedback(Feedback feedback){
        this(feedback.getId(), feedback.getName_employee(), feedback.getSkill_employee(), feedback.getPep(), feedback.getFeedback(), feedback.getFeedback_date(), feedback.getManager(), feedback.getEmployee_score());
    }
}
