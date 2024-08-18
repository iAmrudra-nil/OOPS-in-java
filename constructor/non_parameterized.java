class area{
    float rad;
    /*if we create our own constructor then default constructor is of no use. */
    area(){
        System.out.println("This is non-parameterized constructor");
    }
    void display(){
        System.out.println("Area of circle:"+3.14*rad*rad);
    }
}
public class non_parameterized {
    public static void main(String[] args) {
        area circle=new area();//non-parameterized constructor which have no parameter
        circle.rad=4f;
        circle.display();//display area of circle
    }
}
