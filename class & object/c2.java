import java.util.Scanner;
//importing util java library class to execute Scanner class 
class car{
    //car class have 3 properties of price,name,milage
    float price;
    String name;
    int milage;
}
class c2 {
    public static void main(String[] args) {
        car c1=new car();//making an object of car class

        Scanner sc=new Scanner(System.in);//scanner class object to take input from user

        System.out.print("Enter car price:");
        float price=sc.nextFloat();
        System.out.print("Enter car name:");
        String name=sc.next();
        System.out.print("Enter car milage:");
        int milage=sc.nextInt();

        //assigning car object value
        c1.price=price;
        c1.milage=milage;
        c1.name=name;
        //showing result what it gives
        System.out.println("Price:"+c1.price+"  "+"Name:"+ c1.name+"  "+"Mileage:"+c1.milage);
    }
}
