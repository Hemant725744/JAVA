package Method_Overloading;

public class Operation {

    void add(int a, int b)
    {
        System.out.println("!st method = "+(a+b));
    }

    void add(int a, int b,int c)
    {
        System.out.println("!st method = "+(a+b+c));
    }
    void add(float a, int b)
    {
        System.out.println("!st method = "+(a+b));
    }

    void add(int a, float b)
    {
        System.out.println("!st method = "+(a+b));
    }

    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.add(10, 20);

    }
    
}
