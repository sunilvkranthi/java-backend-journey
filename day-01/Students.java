import java.util.Arrays;

class Student{
    int id;
    String name;
    int[] marks;

    Student(int id, String name, int[] marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void displayStudent(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(Arrays.toString(marks));
    }

    double calculateAverage(){
        double sum = 0;
        for(int m : marks){
            sum+=m;
        }
        return (double)sum/marks.length;
    }

    String calculateGrade(){
        double avg = this.calculateAverage();
        if(avg>=80){
            // System.out.println("A");
            return "A";
        }else if(avg >= 60){
            // System.out.println("B");
            return "B";
        }else{
            // System.out.println("FAIL");
            return "FAIL";
        }
    }
}

public class Students{
    public static void main(String[] args){
        int[] marks = {10,20,30,40,50};
        Student std1 = new Student(1234,"kranthi",marks);
        std1.displayStudent();
        Student std2 = new Student(345, "sunil", marks);
        System.out.println(std2.calculateAverage());
        System.out.println(std1 == std2);
    }
}