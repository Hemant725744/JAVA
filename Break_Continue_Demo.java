public class Break_Continue_Demo 
{
    public static void main(String[] args) 
    {
        int i;

        System.out.println("Break Demo");
        for(i=1;i<=10;i++)
        {
            if(i==7)
            {
                break;                    //Terminate the loop
                
            }
             System.out.println(i);
        }

        System.out.println("Continue Demo");
        for(i=1;i<=10;i++)
        {
            if(i==7)
            {
                continue;                   //Skip the Loop
                
            }
             System.out.println(i);
        }
        
    }
    
}
