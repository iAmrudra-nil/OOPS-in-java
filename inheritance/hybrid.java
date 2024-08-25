
/*this is the the combination of more than one ingheritance */
class animal{
    void kingdom(){
        System.out.println("This is animal kingdom...");
    }
}
class mammal extends animal{
    void Class(){
    System.out.println("This is under mammal class..");
    }
}
class dog extends mammal{
    void type(){
        System.out.println("This type is dog..");
    }
}
class cat extends mammal{
    void type(){
        System.out.println("This type is cat..");
    }
}
/*the upper given example is the combination of hierarchical as well as multilvel inheritance */
public class hybrid {
    public static void main(String args[]){
        dog d1=new dog();
        d1.kingdom();
        d1.Class();
        d1.type();
        cat c1=new cat();
        c1.kingdom();
        c1.Class();
        c1.type();
    }
}
