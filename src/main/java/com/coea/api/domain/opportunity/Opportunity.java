package com.coea.api.domain.opportunity;

import com.coea.api.domain.employee.DataEmployee;
import com.coea.api.domain.employee.UpdateDataEmployee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "opportunity")
@Entity(name = "opportunity")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Opportunity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String title;
    private String project_name;
    private String project_describe;
    private String R2D2;
    private String location;
    private String grade;
    private String requirements;
    private String status;
    private String candidate;
    private String manager;
    private String curriculum;


    public Opportunity(DataOpportunity opportunity) {
        this.title = opportunity.title();
        this.project_name = opportunity.project_name();
        this.project_describe = opportunity.project_describe();
        this.R2D2 = opportunity.R2D2();
        this.location = opportunity.location();
        this.grade = opportunity.grade();
        this.requirements = opportunity.requirements();
        this.status = opportunity.status();
        this.candidate = opportunity.candidate();
        this.manager = opportunity.manager();
        this.curriculum = opportunity.curriculum();
    }

    public void updateDataOpportunity(UpdateDataOpportunity request) {
        if(request.title() != null){
            this.title = request.title();
        }
        if(request.project_name() != null){
            this.project_name = request.project_name();
        }
        if(request.project_describe() != null){
            this.project_describe = request.project_describe();
        }
        if(request.R2D2() != null){
            this.R2D2 = request.R2D2();
        }
        if(request.location() != null){
            this.location = request.location();
        }
        if(request.grade() != null){
            this.grade = request.grade();
        }
        if(request.requirements() != null){
            this.requirements = request.requirements();
        }
        if(request.status() != null){
            this.status = request.status();
        }
        if(request.candidate() != null){
            this.candidate = request.candidate();
        }
        if(request.manager() != null){
            this.manager = request.manager();
        }
        if(request.curriculum() != null){
            this.curriculum = request.curriculum();
        }
    }
}
