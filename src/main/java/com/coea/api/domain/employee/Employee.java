package com.coea.api.domain.employee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "employee")
@Entity(name = "employee")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String start_date;
    private String end_date;
    private String register;
    private String name;
    private String phone;
    private String email;
    private String gender;
    private String skill;
    private String position;
    private String location;
    private String unit;
    private String cost_center;
//    @Table(name = "grade")
//    private Grade grade;
    private String contract_manager;
    private String pep;
    private String project_manager;
    private String squad;
    private String last_review_score;
    private String start_date_vacation;
    private String end_date_vacation;
    private String date_order_promotion;
    private String reason_promotion;
    private String refuse_promotion;
//    private String curriculum;

    public Employee(DataEmployee employee) {
        this.start_date = employee.start_date();
        this.end_date = employee.end_date();
        this.register = employee.register();
        this.name = employee.name();
        this.phone = employee.phone();
        this.email = employee.email();
        this.gender = employee.gender();
        this.skill = employee.skill();
        this.position = employee.position();
        this.location = employee.location();
        this.unit = employee.unit();
        this.cost_center = employee.cost_center();
//        this.grade = new Grade(employee.grade());
        this.contract_manager = employee.contract_manager();
        this.pep = employee.pep();
        this.project_manager = employee.project_manager();
        this.squad = employee.squad();
        this.last_review_score = employee.last_review_score();
        this.start_date_vacation = employee.start_date_vacation();
        this.end_date_vacation = employee.end_date_vacation();
        this.date_order_promotion = employee.date_order_promotion();
        this.reason_promotion = employee.reason_promotion();
        this.refuse_promotion = employee.refuse_promotion();
        //his.curriculum = employee.curriculum();
    }

    public void updateDataEmployee(UpdateDataEmployee request) {

        if(request.name() != null){
            this.name = request.name();
        }
        if(request.end_date() != null){
            this.end_date = request.end_date();
        }
        if(request.phone() != null){
            this.phone = request.phone();
        }
        if(request.email() != null){
            this.email = request.email();
        }
        if(request.unit() != null){
            this.unit = request.unit();
        }
        if(request.cost_center() != null){
            this.cost_center = request.cost_center();
        }
        if(request.contract_manager() != null){
            this.contract_manager = request.contract_manager();
        }
        if(request.pep() != null){
            this.pep = request.pep();
        }
        if(request.squad() != null){
            this.squad = request.squad();
        }
        if(request.project_manager() != null){
            this.project_manager = request.project_manager();
        }
    }
}