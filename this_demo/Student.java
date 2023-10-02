package this_demo;

    class Hemant {
    String name;
    int marks;

    Hemant(int marks, String name)
    {
        System.out.println("I am in parameterized constructor");
        this.name=name;
        this.marks=marks;
    }
    
    void display()
    {
        System.out.println("Name of student "+name);
        System.out.println("Marks of student "+marks);
    }
}

public class Student{
    public static void main(String[] args) {
        Hemant s =new Hemant(100,"Hemant");
        s.display();
        
    }
}



/* This
 * -referce keyword
 * mapping between local - instance variable
 */

