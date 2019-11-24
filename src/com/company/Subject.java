package com.company;

public class Subject {
    String name;
    boolean isNormative;
    int hours;
    boolean isExam;
    private  OKR okr;

    public enum OKR {
        master,
        bachelor,
        specialist};


    public Subject(){}



    public Subject(String name, boolean isNormative, int hours, boolean isExam, OKR okr){

        this.setName(name);
        this.setNormative(isNormative);
        this.setHours(hours);
        this.setExam(isExam);
        this.setOkr(okr);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNormative() {
        return isNormative;
    }

    public void setNormative(boolean normative) {
        isNormative = normative;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isExam() {
        return isExam;
    }

    public void setExam(boolean exam) {
        isExam = exam;
    }

    public OKR getOkr() {
        return okr;
    }

    public void setOkr(OKR okr) {
        this.okr = okr;
    }
}
