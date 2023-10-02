
 //Default Constructor
 
 class Bank1
{
    String name;
    String branch;
    int turnOver;
//default Constructor
   Bank1()
    {
        System.out.println("I am in default Constructor");
        name = "SBI";
        branch = "Kharghar";
        turnOver = 23;
    } 

    void display()
    {
        System.out.println("Name of bank "+name);
        System.out.println("Branch of bank "+branch);
        System.out.println("Turnover of bank "+turnOver);
    }
}

public class RBI {
    public static void main(String[] args) {
        Bank1 s = new Bank1();
        s.display();
    }
}
