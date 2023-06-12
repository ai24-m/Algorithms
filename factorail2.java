import java.util.Scanner;
public class factorail2 {


    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        
        int N;
        int F;
        double S=0;
        
        System.out.println("Enter number :");
        N = input.nextInt();
        
        // for(int i =1;i<=N;i++){
        //     F=F*i;
        //     S=S+F;
            
        // }
        
        for(int i =1;i<=N ;i++){
            
            F=1;
            for(int j=1; j<=i;j++){
                
            F=F*j;
            }
            
            if(i%2==1){
                S=S+F;
            }
            else{
                S=S-F;
            }
           
        }
        
     
        
        System.out.println(S);
    }

    
}
