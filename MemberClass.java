public class MemberClass {
    String name;
    int rollNo;
    String studentId;

    void initializedStudent()
    {
        name="Hemant Bhatt";
        rollNo=07;
        studentId = "hemantbb22hcompe@student.mes.ac.in";
    }
                                                        
    void displayStudent()                               //2 member method
    {
        System.out.println("Student name = " +name);
        System.out.println("Student Roll No = " +rollNo);
        System.out.println("Student Id = "+studentId);
    }

    public static void main(String[] args) {
        MemberClass s = new MemberClass();
        s.initializedStudent();
        s.displayStudent();
    }
}
