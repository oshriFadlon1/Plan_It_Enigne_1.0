package com.example.planit.model.mongo.user;

import com.example.planit.model.exam.Exam;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class StudyPlan {
    @Field(name = "scanned_exams")
    private List<Exam> scannedExams;
    @Field(name = "start_datetime_of_plan")
    private String startDateTimeOfPlan;
    @Field(name = "end_datetime_of_plan")
    private String endDataTimeOfPlan;
    @Field(name = "number_of_sessions")
    private int totalNumberOfStudySessions;

    public StudyPlan() {
    }

    public void setScannedExams(List<Exam> scannedExams) {
        this.scannedExams = scannedExams;
    }

    public void setStartDateTimeOfPlan(String startDateTimeOfPlan) {
        this.startDateTimeOfPlan = startDateTimeOfPlan;
    }

    public void setEndDataTimeOfPlan(String endDataTimeOfPlan) {
        this.endDataTimeOfPlan = endDataTimeOfPlan;
    }

    public void setTotalNumberOfStudySessions(int totalNumberOfStudySessions) {
        this.totalNumberOfStudySessions = totalNumberOfStudySessions;
    }

    public List<Exam> getScannedExams() {
        return scannedExams;
    }

    public String getStartDateTimeOfPlan() {
        return startDateTimeOfPlan;
    }

    public String getEndDataTimeOfPlan() {
        return endDataTimeOfPlan;
    }

    public int getTotalNumberOfStudySessions() {
        return totalNumberOfStudySessions;
    }
}
