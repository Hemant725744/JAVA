public class Pattern_4 
{
    public static void main(String[] args) 
    {
        int i,j;
        for(i=1;i<=4;i++)                   //Outter loop for row (Control loop)
        {
            for(j=1;j<=i;j++)               //Outter loop for Colown or (Printing loop)
            {
                System.out.print(j);
            }
            System.out.println();
        } 
        
        for(i=3;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        
    }
    
}
