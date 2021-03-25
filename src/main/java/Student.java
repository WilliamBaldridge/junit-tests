import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;



    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void addGrade(int grade) {

        grades.add(grade);

    }

    public ArrayList<Integer> getGrades() {

        return this.grades;
    }

    public double getGradeAverage() {

        double numOfGrades = grades.size();
        double sumOfGrades = grades.stream().mapToDouble(Integer::doubleValue).sum();

        return sumOfGrades / numOfGrades;

    }


//    public static void main(String[] args) {
//
//        Student myself = new Student(178762,"William");
//        myself.addGrade(70);
//        myself.addGrade(90);
//        myself.addGrade(93);
//
//        System.out.printf("%.2f", myself.getGradeAverage());
//    }


}
