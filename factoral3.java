import java.util.Scanner;



public class factoral3 {


    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        
        int N;
        int F;
        double S=0;
        double T=0;
        
        System.out.println("Enter number :");
        N = input.nextInt();
        

        
        for(int i =1;i<=N ;i++){
            
            F=1;
            for(int j=1; j<=i;j++){
                
            F=F*j;
            }
            
            if(i%2==1){
                S=S+F;
            }
            if(i%2==0){
                T=T+F;
            }
           
        }
        
     
        
        System.out.println("S = "+S);
        System.out.println("T = "+T);

        
    }

    
}
