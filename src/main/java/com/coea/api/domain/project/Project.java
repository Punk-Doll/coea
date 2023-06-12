package com.coea.api.domain.project;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "project")
@Entity(name = "project")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String proposal;
    private String pep;
    private String describe_project;
    private String start_date;
    private String start_end;
    private String amount_hours;
    private String amount_hours_profile;
    private String hours_month;
    private String hours_month_profile;
    private String score_profile;
    private String final_estimate;
    private String final_estimate_profile;
    private String score_project;
    private String responsible_project;
    private String manager_client;
    private String active_revenue;

    public Project(DataProject project) {
        this.proposal = project.proposal();
        this.pep = project.pep();
        this.describe_project = project.describe_project();
        this.start_date = project.start_date();
        this.start_end = project.start_end();
        this.amount_hours = project.amount_hours();
        this.amount_hours_profile = project.amount_hours_profile();
        this.hours_month = project.hours_month();
        this.hours_month_profile = project.hours_month_profile();
        this.score_profile = project.score_profile();
        this.final_estimate = project.final_estimate();
        this.final_estimate_profile = project.final_estimate_profile();
        this.score_project = project.score_project();
        this.responsible_project = project.responsible_project();
        this.manager_client = project.manager_client();
        this.active_revenue = project.active_revenue();

    }

//    public void updateDataFeedback(UpdateDataFeedback feedback) {
//        if(feedback.name_employee() != null){
//            this.name_employee = feedback.name_employee();
//        }
//        if(feedback.skill_employee() != null){
//            this.skill_employee = feedback.skill_employee();
//        }
//        if(feedback.pep() != null){
//            this.pep = feedback.pep();
//        }
//        if(feedback.manager() != null){
//            this.manager = feedback.manager();
//        }
//        if(feedback.feedback_date() != null){
//            this.feedback_date = feedback.feedback_date();
//        }
//        if(feedback.feedback() != null){
//            this.feedback = feedback.feedback();
//        }
//        if(feedback.employee_score() != null){
//            this.employee_score = feedback.employee_score();
//        }
//    }

}
