public class Variables_Demo {
    public static void main(String[] args) {
       
       // Initialization and Assiging of variable
        boolean male = true;       //  2 byte   0 (false) or 1 (true)
        char key = 'H';            //  1 byte   -128 to 127 or 0 to 255
        short s = 1001;            //  2 byte   -32,768 to 32,767
        int i = 23;                //  4 byte   -32,768 to 32,767 
        long l = 100101;           //  8 byte   -9223372036854775808 to 9223372036854775807
        float pi = 3.14f;          //  4 byte   1.2E-38 to 3.4E+38
        double d = 3.141414d;      //  8 byte   2.3E-308 to 1.7E+308

        System.out.println("Boolean is = "+male);
        System.out.println("Char is = "+key);
        System.out.println("short is = "+s);
        System.out.println("Int is = "+i);
        System.out.println("long is = "+l);
        System.out.println("float is = "+pi);
        System.out.println("double is = "+d);       

        
    }
    
}
