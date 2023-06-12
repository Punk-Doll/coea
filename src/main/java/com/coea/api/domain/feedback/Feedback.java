package com.coea.api.domain.feedback;

import com.coea.api.domain.employee.DataEmployee;
import com.coea.api.domain.employee.UpdateDataEmployee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "feedback")
@Entity(name = "feedback")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name_employee;
    private String skill_employee;
    private String pep;
    private String manager;
    private String feedback_date;
    private String feedback;
    private String employee_score;

    public Feedback(DataFeedback feedback) {
        this.name_employee = feedback.name_employee();
        this.skill_employee = feedback.skill_employee();
        this.pep = feedback.pep();
        this.manager = feedback.manager();
        this.feedback_date = feedback.feedback_date();
        this.feedback = feedback.feedback();
        this.employee_score = feedback.employee_score();
    }


    public void updateDataFeedback(UpdateDataFeedback feedback) {
        if(feedback.name_employee() != null){
            this.name_employee = feedback.name_employee();
        }
        if(feedback.skill_employee() != null){
            this.skill_employee = feedback.skill_employee();
        }
        if(feedback.pep() != null){
            this.pep = feedback.pep();
        }
        if(feedback.manager() != null){
            this.manager = feedback.manager();
        }
        if(feedback.feedback_date() != null){
            this.feedback_date = feedback.feedback_date();
        }
        if(feedback.feedback() != null){
            this.feedback = feedback.feedback();
        }
        if(feedback.employee_score() != null){
            this.employee_score = feedback.employee_score();
        }
    }
}
