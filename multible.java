public class multible {

    public static void main (String[] args) {
        
       // the result of multiple numbers from 1 to 10 with for loop
        int i =1;
        int total=1;
        for(i=1;i<=10;i++){
            total=total*i;
        }
        System.out.println("the result of multiple is "+total);
        System.out.print("-----------------------------------\n");


        //the result of multiple numbers from 1 to 10 with while loop

        int a=1;
        int totl=1;
        while(a<=10){
            totl=totl*a;
            a++;

        }
        System.out.println("the total of multiple numbers in while is "+totl);
        System.out.print("-----------------------------------\n");




        //the result of multiple numbers from 1 to 10 with do while loop

        int c = 1;
        int tot =1;
        do{
            tot=tot*c;
            c++;
        }while(c<=10);

        System.out.println("the total in do while is "+tot);

        System.out.print("-----------------------------------\n");



        // هنا قمنا بتعريف المتغيرات في أول البرنامج لأننا سنستخدمهم نفسهم في جميع الحلقات
        int k = 1;
        int M = 1;
    
        // " for " الطريقة الأولى باستخدام الحلقة
        System.out.print("1- using for loop:\n");
        for ( ; k <=10; k=k+1 )
        {
            M = M * k;
        }
        System.out.print("The multiple is: " + M + "\n");
        System.out.print("-----------------------------------\n");
    
    
        // " while " الطريقة الثانية باستخدام الحلقة
        System.out.print("2- using while loop:\n");
        int r = 1;
        int  v = 1;
        while ( r <=10 )
        {
            v = v * r;
            r = r + 1;
        }
        System.out.print("The multiple is: " + v + "\n");
        System.out.print("-----------------------------------\n");
    
    
    
        // " do while " الطريقة الثالثة باستخدام الحلقة
        System.out.print("3- using do while loop:\n");
        int y = 1;
        int x  = 1;
        do
        {
            x = x * y;
            y = y + 1;
        }
        while ( y <=10 );
        System.out.print("The multiple is: " + x + "\n");
        System.out.print("-----------------------------------\n");


        // المطلوب في الخوارزمية ناتج مجموع ١ مقسوم على الارقام من١ الى ١٠٠ 
        //My algorithm in for loop
        double f=0;
        for(double s= 1;s <= 100;s++){

            f=f+(1/s);
        }
        System.out.println("the result is "+f);

        //MyAlgorithm in while loop

        double l=0;
        double e=1;
        while(e<=100){
            l=l+1/e;
            e++;
        }

        System.out.println("the result in the while loop is "+v);

        //MyAlgorithm in do while 

        double d=0;//متغير نخزن فيه القيمة النهائية 
        double q=1;//العداد ويبدا من ١ 
        do{
            d=d+(1/q);//قيمة المتغير دي تتغير مع كل حلقة وتخزن الناتج الجديد حتى اكمال الحلقة 
            q++;
        }while(q<=100);

        System.out.println("the result of the algorithm in do while is "+d);


    }
    
}
