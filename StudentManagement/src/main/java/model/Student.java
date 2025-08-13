package model;

public class Student {

    private String name;
    private Integer enrollmentId;
    private double grade1, grade2, grade3;

    public Student(String name, Integer enrollmentId){
        this.name = name;
        this.enrollmentId = enrollmentId;
        this.grade1 = 0.0;
        this.grade2 = 0.0;
        this.grade3 = 0.0;
    }

    public Integer getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public double calculateAverage(){
        return (this.grade1 + this.grade3 + this.grade2) / 3;
    }

    public void displayinformation(){
        System.out.println("Nome do Aluno: "+ getName());
        System.out.println("Mátricula do Aluno:" +getEnrollmentId());
        System.out.println("Média do Aluno: "+ calculateAverage());
    }

}
