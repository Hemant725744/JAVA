//Parameterized constructor
class Bank
{
    String name;
    String branch;
    int turnOver;


    Bank(String n,String l,int t)
    {
        System.out.println("I am in parameterized Construction");
        name=n;
        branch=l;
        turnOver=t;
    }

    void display()
    {
        System.out.println("Name of bank "+name);
        System.out.println("Branch of bank "+branch);
        System.out.println("Turnover of bank "+turnOver);
    }
}

public class SBI{

    public static void main(String[] args) {
        Bank s= new Bank("HDFC", "Kharghar", 23);
        s.display();
    }
}

