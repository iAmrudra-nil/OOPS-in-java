class dog{
    //A class is an instance of object which have some methods and property.

    // Here dog is a class where dog have some attributes like weight and typs. 
    float weight = 15.0f;
    String types="Bull Dog";
    //Dog class have some methods -->
    //M1-->eat
    void eat(){
        System.out.println("Dogs like meat..");
    }
    //M2 -->bark
    void bark(){
        System.out.println("Dogs can bark..");
    }
}
class c1{
    public static void main(String[] args) {
        //creating an object of dog
        dog d1=new dog();//This is constructor concept will inform you later
        System.out.println("Weight:"+d1.weight);//here dog weight is shown which is predifined or initialize
        System.out.println("Type:"+d1.types);//here dog type will be visualize
        d1.eat();//it's a method that what dogs eat
        d1.bark();
    }
}