/*constructor is not the property of OOPs it is the property of java language but we have to know what is constructor-->
def: constructor means a method in the class which have no return type and the name of the method is 
same as the name of the class having some parameter or no parameter.
In the time of creation of an object of a class we have to call the constructor by new keyword
construct are 3 types-->
    1.default constructor(automatically created by JDK during compile time)
    2.No parameterized constructor(constructor having no parameter)
    3.parameterized constructor(Having some parameter)*/
class  std{
    String name;
    float sgpa;
    std(){
        System.out.println("This is non-parameterized constructor");
    }
    std(String name,float sgpa){
        this.name=name;//this is a keyword which tell us the the object whose method or constructor are being called
        this.sgpa=sgpa;
        System.out.println("This is parameterized constructor");
    }

} 
class definition{
    public static void main(String[] args) {
        std s1=new std();//it calls non parameterized constructor
        std s2=new std("Rudra", 8.6f);
    }
}

