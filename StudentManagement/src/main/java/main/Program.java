package main;

import model.Student;

public class Program {

    public static void main(String[] args) {
        Student aluno1 = new Student("Lucas", 12345);

        aluno1.setGrade1(8.0);
        aluno1.setGrade2(6.0);
        aluno1.setGrade3(7.0);

        aluno1.displayinformation();

    }
}
