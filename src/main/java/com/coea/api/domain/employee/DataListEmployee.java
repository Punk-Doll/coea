package com.coea.api.domain.employee;
public record DataListEmployee(Long id, String register,String name,String phone,String email, String gender, String skill, String position, String location, String unit){

    public DataListEmployee(Employee employee){
        this(employee.getId(), employee.getRegister(), employee.getName(), employee.getPhone(), employee.getEmail(), employee.getGender(), employee.getSkill(),employee.getPosition(), employee.getLocation(), employee.getUnit());
    }

}
