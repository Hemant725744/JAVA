import java.util.Scanner;


public class SwitchDemo 
{
    public static void main(String[] args) 
    {
        String type,time;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Greating");
        type = s.nextLine();
        System.out.println("Enter time");
        time = s.nextLine();
        

        switch(type)                                     //Switch 1
        {
            case "Good Morning"  : 
                                  System.out.println("Good Morning");
                                  switch(time)                                              //Switch 2
                                  {
                                        case "am":
                                                  System.out.println("Valid");  
                                                  break;
                                        default  :
                                                  System.out.println("Not Valid");
                                                  break;
                                  }  
                                  break;
            case "Good Afternoon": 
                                 System.out.println("Good Afternoon");
                                  switch(time)
                                  {
                                        case "noon":
                                                  System.out.println("Valid"); 
                                                   break;
                                        default  :
                                                  System.out.println("Not Valid");
                                                  break;
                                  }   
                                   
                                 break;                   
            case "Good Evening"  : 
                                 System.out.println("Good Evening");
                                  switch(time)
                                  {
                                        case "Evening":
                                                  System.out.println("Valid"); 
                                                   break;
                                        default  :
                                                  System.out.println("Not Valid");
                                                  break;
                                  }   
                                                 
                                 break; 
            case "Good Night"    : 
                                 System.out.println("Good Night");
                                  switch(time)
                                  {
                                        case "pm":
                                                  System.out.println("Valid");  
                                                   break;
                                        default  :
                                                  System.out.println("Not Valid");
                                                  break;
                                  }  
                                   
                                 break;
            default              :
                                 System.out.println("You Enter invalid Greeting");
                                 break;
            
        }
        s.close();
    }
    
    
}
