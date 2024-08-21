/*The inheritance in which a class can be derived from another derived class
 * ex:base class-->derived class -->derived class
 */
class vehicle{
    float price;
    vehicle(Float price){
        this.price=price;
    }
}
class car extends vehicle{
    String name;
    car(float price,String name){
        super(price);
        this.name=name;
    }
}
class sportscar extends car{
    int speed;
    sportscar(float price,String name,int speed){
        super(price, name);
        this.speed=speed;
    }
    void display(){
        System.out.println("Price of the car:"+price);
        System.out.println("Name of the car:"+name);
        System.out.printf("Speed of the car %d KM\n",speed);
    }

}
class multilevel {
    public static void main(String[] args) {
        sportscar obj1=new sportscar(12000000,"Ferrai" , 250);
        obj1.display();
    }
}
