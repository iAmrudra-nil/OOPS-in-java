class area{
    float rad;
    /*we can create & use multiple constructor but they must be different from each other */
    area(){
        System.out.println("This is non-parameterized constructor");
    }
    area(float rad){
        this.rad=rad;
        System.out.println("This is parameterized constructor");
    }
    void display(){
        System.out.println("Area of circle:"+3.14*rad*rad);
    }
}
class parameterized {
    public static void main(String[] args) {
        area circle=new area();//non-parameterized constructor which have no parameter
        circle.rad=4f;
        circle.display();//display area of circle
        area circle2=new area(6.0f);//parameterized constructor
        circle2.display();//display area of circle2
    }
}
