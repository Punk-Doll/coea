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

    public void updateDataProject(UpdateDataProject project) {
        if(project.proposal() != null){
            this.proposal = project.proposal();
        }
        if(project.pep() != null){
            this.pep = project.pep();
        }
        if(project.describe_project() != null){
            this.describe_project = project.describe_project();
        }
        if(project.start_date() != null){
            this.start_date = project.start_date();
        }
        if(project.start_end() != null){
            this.start_end = project.start_end();
        }
        if(project.amount_hours() != null){
            this.amount_hours = project.amount_hours();
        }
        if(project.amount_hours_profile() != null){
            this.amount_hours_profile = project.amount_hours_profile();
        }
        if(project.hours_month() != null){
            this.hours_month = project.hours_month();
        }
        if(project.hours_month_profile() != null){
            this.hours_month_profile = project.hours_month_profile();
        }
        if(project.score_profile() != null){
            this.score_profile = project.score_profile();
        }
        if(project.final_estimate() != null){
            this.final_estimate = project.final_estimate();
        }
        if(project.final_estimate_profile() != null){
            this.final_estimate_profile = project.final_estimate_profile();
        }
        if(project.score_project() != null){
            this.score_project = project.score_project();
        }
        if(project.responsible_project() != null){
            this.responsible_project = project.responsible_project();
        }
        if(project.manager_client() != null){
            this.manager_client = project.manager_client();
        }
        if(project.active_revenue() != null){
            this.active_revenue = project.active_revenue();
        }
    }

}
