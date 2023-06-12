package com.coea.api.domain.feedback;
public record DataListFeedback(
        long id,
        String name_employee,
        String skill_employee,
        String pep,
        String manager,
        String feedback_date,
        String feedback,
        String employee_score) {


    public DataListFeedback(Feedback feedback){
        this(feedback.getId(), feedback.getName_employee(), feedback.getSkill_employee(), feedback.getPep(), feedback.getManager(), feedback.getFeedback_date(), feedback.getFeedback(), feedback.getEmployee_score());
    }
}
