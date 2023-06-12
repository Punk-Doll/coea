package com.coea.api.domain.employee;
public record DataListEmployee(Long id, String register,String employee_name,String phone,String email, String gender, String skill, String employee_position, String location, String unit){

    public DataListEmployee(Employee employee){
        this(employee.getId(), employee.getRegister(), employee.getEmployee_name(), employee.getPhone(), employee.getEmail(), employee.getGender(), employee.getSkill(),employee.getEmployee_position(), employee.getLocation(), employee.getUnit());
    }

}
