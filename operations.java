public class operations {
    
    public static void main (String[] args) {



System.out.println("\n");
//كتب برنامج مهمته جمع جميع الأعداد المفردة بين 1 و 10.

int r = 0;
for(int i=1;i<=10;i++){
    if(i%2==1){
            System.out.println("R = "+r+" + "+i+" = "+(r+i));
        r=r+i;
    }
}

System.out.println("_______________________");
System.out.println(".......................\n");




// لا تستخدم الـ Modulo.

// int t=1;
// for(int i=1; i<10;)//3
// {
//     System.out.println(t);//total 
//     // System.out.println(i);//odd number
//     i=i+2;//3+2=5
//     t=t+i;//3+5=8
//     // System.out.println(t);//total 
//     // System.out.println(i);//odd number
// }

// System.out.println("_______________________");
// System.out.println(".......................\n");

// برنامج مهمته جمع جميع الأعداد المفردة بين 1 و 10.

// لا تستخدم الـ Modulo.

int q=0;
for(int i=1;i<11;i=i+2){

    System.out.println("Q = "+q+" + "+i+" = "+(q+i));
    q=q+1;
}

System.out.println("_______________________");
System.out.println(".......................\n");

//كتب برنامج مهمته جمع جميع الأعداد الزوجية بين 1 و 10.

//without Modoule 

int S = 0;
for(int i=2;i<=10;i=i+2){
    System.out.println("S = "+S+" + "+i+" = "+(S+i));
    S=S+i;
}


System.out.println("_______________________");
System.out.println(".......................\n");

//كتب برنامج مهمته جمع جميع الأعداد الزوجية بين 1 و 10.

//with  Mudoule 

int R =0;
for(int i=2 ; i<=10;i++){
    if(i%2==0){
        System.out.println("R = "+R+" + "+i+" = "+(R+i));
        R=R+i;
    }
    
}

System.out.println("_______________________");
System.out.println(".......................\n");
System.out.println("اذا كان العداد فردي سيتم اضافتة لقيمة المتغير واذا كان زوجي سيتم طرحة من قيمة المتغير \n " );

int F=0;
for(int i=1;i<=10;i++){

    if(i%2==1){
        System.out.println("F = "+F+" + "+i+" = "+(F+i));
        F=F+i;
    }else {
    // if(i%2==0){//يمكن الاستغناء عن else if والاكتفاء ب ال else فقط 
        System.out.println("F = "+F+" - "+i+" = "+(F-i));
        F=F-i;

    }
}
System.out.println("_______________________");
System.out.println(".......................\n");
System.out.println("جمع العداد الفردي وطرح العداد الزوجي");

double P=0;
for(double i=1;i<=100;i++){

    if(i%2==1){
        P=P+1/i;
    }else {
    // if(i%2==0){//يمكن الاستغناء عن else if والاكتفاء ب ال else فقط 
        P=P-1/i;

    }
}
System.out.println("P ="+P);


    }

}
