package Assignment;

public class StudentClass {
    String student_name;
    int studentroll_no;
    int student_phonenumber;
    String student_address;
    public StudentClass(String name, int roll_no, int phonenumber, String address){
        student_name = name;
        studentroll_no = roll_no;
        student_phonenumber = phonenumber;
        student_address = address;
    }

    public static void main(String[] args) {
        StudentClass name1 = new StudentClass("John",354, 703564789 , "P.O. BOX 265");
        StudentClass name2 = new StudentClass("Sam", 126, 765987546 , "P.O. BOX 659");
        System.out.println(name1.student_name);
        System.out.println(name1.studentroll_no);
        System.out.println(name1.student_phonenumber);
        System.out.println(name1.student_address);
        System.out.println(name2.student_name);
        System.out.println(name2.studentroll_no);
        System.out.println(name2.student_phonenumber);
        System.out.println(name2.student_address);

    }
}
