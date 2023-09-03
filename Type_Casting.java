public class Type_Casting {
    public static void main(String[] args) {
       //Implicit (Lower to Higher)
       
        /* 
        int a,b;
        a=23;
        b=7;
        div = a/b;
        System.out.println("Division is = "+div);*/
        
        int a,b;
        a=23;
        b=7;
        //Int to float type castiong 
        float a1,b1,div;
        a1=a;
        b1=b;
        div = a1/b1;
        System.out.println("Division is = "+div);

        //Explicit (Higher to lower)

        float pi =3.14f;
        System.out.println("Before Casting pi value is = "+pi);
        
        int s=(int)pi;  //Syntax = Destination variable = (Destination data type )source variable

        System.out.println("After Casting pi value is = "+s );


    }
    
}
