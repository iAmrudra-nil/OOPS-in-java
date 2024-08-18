class area{
    float rad;
    void display(){
        System.out.println("Area of the circle is:"+3.14*rad*rad);
    }
}
 class def{
    public static void main(String args[]){
        area circle=new area();//default constructor which is internally created by JVM
        circle.rad=4f;
        circle.display();//display area of circle
    }
}
