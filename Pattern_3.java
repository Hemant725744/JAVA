public class Pattern_3 
{
    public static void main(String[] args) 
    {
        int i,j,k=1;
        for(i=1;i<=4;i++)                   //Outter loop for row (Control loop)
        {
            for(j=1;j<=i;j++)               //Outter loop for Colown or (Printing loop)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }    

     

        
    }
    
}
