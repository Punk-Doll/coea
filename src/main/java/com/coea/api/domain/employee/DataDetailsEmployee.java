package com.coea.api.domain.employee;

public record DataDetailsEmployee(Long id, String start_date,String end_date, String register, String employee_name, String phone, String email, String gender, String skill, String employee_position, String location, String Unit, String cost_center, String contract_manager, String pep, String project_manager, String squad, String last_review_score, String date_last_feedback, String feedback, String start_date_vacation, String end_date_vacation, String date_order_promotion, String reason_promotion, String Refuse_promotion) {

    public DataDetailsEmployee(Employee employee){
        this(employee.getId(), employee.getStart_date(),employee.getEnd_date(),employee.getRegister(), employee.getEmployee_name(), employee.getPhone(), employee.getEmail(), employee.getGender(), employee.getSkill(), employee.getEmployee_position(), employee.getLocation(), employee.getUnit(), employee.getCost_center(), employee.getContract_manager(), employee.getPep(), employee.getProject_manager(), employee.getSquad(), employee.getLast_review_score(), employee.getDate_last_feedback(), employee.getFeedback(), employee.getStart_date_vacation(), employee.getEnd_date_vacation(), employee.getDate_order_promotion(), employee.getReason_promotion(), employee.getRefuse_promotion());
    }
}
