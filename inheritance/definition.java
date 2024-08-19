/*when a class can inherit  the properties of another class then it is called inheritance.

 * the class which properties are inherited is called super class/base class/parent class
 * and that class who inherit the properties is called sub class/derived class/child class 
 * 
 * There are 5 types of inheritance-->
 *      1.single level inheritance
 *      2.multiple inheritance(not available in java)
 *      3.multilevel inheritance
 *      4.hierarchical inheritance
 *      5.hybrid inheritance
*/
class animal{
    String type;
    void eat(){
        System.out.println("animals eat");
    }
}
class dog extends animal{
    dog(String type){
        this.type=type;
    }
    void bark(){
        System.out.println("Dogs can bark");
    }
}
class inherit{
    public static void main(String[] args) {
        dog d1=new dog("mammals");//dog inherit the properties of animal so all the properties of animal exist in dog
        d1.eat();
    }
}