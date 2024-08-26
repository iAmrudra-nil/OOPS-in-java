/*poly means many and morph means form so polymorphism means extisting in many form 
 * there are basically two types of polymorphism exist-->
 *      1.compile time(static binding)
 *          method overloading and operator overloading(doesnot support by java)
 *      2.run time(dynamic binding)
 *          method overriding
*/
//example:
class car{
    //the given example in below is basically the example of method overloading we will discuss furthue
    void classname(){
        System.out.println("this is car class");
    }
    void classname(String name){
        System.out.println("This is car class of:"+name);
    }
}

class definition {
    public static void main(String args[]){
        car c1=new car();
        c1.classname();//same method name but their parameter are different by which they can be extinguished
        c1.classname("BMW");
    }
}