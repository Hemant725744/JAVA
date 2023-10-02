package Constructor_Overloading;

public class Student {
    String name,email;
    int marks,rollNo;

    Student(int marks,String name)
    {
        System.out.println("I am in 1st Constructor");
        this.marks=marks;
        this.name=name;
    }

    Student(int marks,String name,int rollNo)
    {
        System.out.println("I am in 2nd Constructor");
        this.marks=marks;
        this.name=name;
        this.rollNo=rollNo;
    }

     Student(int marks,int rollNo,String email)
    {
        System.out.println("I am in 2nd Constructor");
        this.marks=marks;
        this.email=email;
        this.rollNo=rollNo;
    }

    void display()
    {
        System.out.println("Name of Student is "+name);
        System.out.println("Marks of Student is "+marks);
        System.out.println("Roll no of Student is "+rollNo);
        System.out.println("Email of Student is "+email);
    }

    public static void main(String[] args) {
        Student s1 = new Student(100,07,"bhem@gmail.com");
        s1.display();
        System.out.println("****************");

        Student s2 = new Student(100,"Hemant",07);
        s2.display();
         System.out.println("****************");

        Student s3 = new Student(100,"Hemant");
        s3.display();
         System.out.println("****************");
    }
    
}
