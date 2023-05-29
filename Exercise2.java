import java.util.Scanner;




public class Exercise2 {
    
    public static void main(String[] args) {
        
        
        
        // اطلب من المستخدم ادخال رقم صحيح ثم قم بجمع جميع الارقام من واحد الى الرقم المدخل 
        System.out.println("ـــــــــ مجموع الارقام  ــــــــــــ\n");   
        System.out.println(".....................................\n");

        Scanner input = new Scanner(System.in);

        int S = 0;
        int N;

        System.out.println("Enter a number : ");
        N = input.nextInt();

        for(int i = 1;i<=N;i++){
            S= S+i;
        }


        System.out.println("The sum of numbers is "+S);


        System.out.println("ــــــ مجموع الارقام المفردة ـــــــــ\n");   
        System.out.println(".....................................\n");
        // اطلب من المستخدم ادخال رقم صحيح ثم قم بجمع جميع الارقام المفردة 

        Scanner OddNumber = new Scanner(System.in);

        int Total = 0;
        int OddNum;

        System.out.println("Enter u number :");
        OddNum = OddNumber.nextInt();

        for(int i = 1; i<=OddNum;i++){
            if(i%2==1){
                Total=Total+i;
            }
        }
        System.out.println("The odd number sum is "+Total);

        System.out.println("ـــ مجموع الارقام الزوجية بين رقمين ــــ\n");   
        System.out.println(".....................................\n");   

    //اطلب من المستخدم ادخال رقمين صحيحة ثم اطبع الارقام الزوجية بين الرقمين 

    Scanner evenNum = new Scanner(System.in);

    int num1;
    int num2;

    System.out.print("Enter 1st  number : ");
    num1 = evenNum.nextInt();
    System.out.print("Enter 2nd number : ");
    num2 = evenNum.nextInt();
    
    System.out.println("-------------------------------------\n");   

    System.out.println("The even number between "+num1+" and "+num2);   
    for(int i = num1; i<=num2;i++){
        if(i%2==0){
    System.out.println(i+" "); 

            }


        }
    //اطلب من المستخدم ادخال رقمين صحيحة قارن بين الرقمين واطبع النتيجة  


        Scanner compNum = new Scanner(System.in);

        int num3;
        int num4;
    
        System.out.print("Enter 1st  number : ");
        num3 = compNum.nextInt();
        System.out.print("Enter 2nd number : ");
        num4 = compNum.nextInt();
        
        System.out.println("-------------------------------------\n");
        System.out.print("Result: ");
    
        if(num3<num4){
            System.out.print(num3+" < "+num4);   
    
        }
        else if (num3>num4){
            System.out.print(num3+" > " +num4);   
    
        }else{
            System.out.print(num3+" = " +num4);   
    
        }

    }
}



