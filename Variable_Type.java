public class Variable_Type {

    int result;                          // Instance Variable (Global )
    int sum()
    {
        int a=10,b=20;                   // Local variable (The scope of a and b is for int sum())                
        result = a+b;
        return result;
    }

    int sub()
    {
        int a=10,b=20;                   // Local variable (The scope of a and b is for int sub())                
        result = a-b;
        return result;
    }

    int multi()
    {
        int a=10,b=20;                   // Local variable (The scope of a and b is for int multi())                
        result = a*b;
        return result;
    }

    int div()
    {
        int a=10,b=20;                   // Local variable (The scope of a and b is for int div())                 
        result = b/a;
        return result;
    }
    public static void main(String[] args) {
    Variable_Type vt = new Variable_Type();
    System.out.println("Addition is= " +vt.sum());
    System.out.println("Subtraction = " +vt.sub());
    System.out.println("Multiplication is  = " +vt.multi());
    System.out.println("Divison = " +vt.div());

    }
    
}
