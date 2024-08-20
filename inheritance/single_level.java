/*when there are only one class which is derived from parent class then it is called single level inheritance */
class car{
    String name;
    int mileage;
    float price;
    car(String name,int mileage,float price){
        this.name=name;
        this.mileage=mileage;
        this.price=price;
    }
}
class tata extends car{
    int capacity;
    tata(String nane,int mileage, float price,int capacity){
        super(nane, mileage, price);//super() method is used to call parent level constructor
        this.capacity=capacity;

    }
    void display(){
        System.out.println("Name of car:"+name);
        System.out.println("Mileage:"+mileage);
        System.out.println("Price of the car:"+price);
        System.out.println("Capacity of car:"+capacity);
    }
}
class single_level {
    public static void main(String[] args) {
        tata c1=new tata("nano",22,700000, 4);
        c1.display();
    }
}
