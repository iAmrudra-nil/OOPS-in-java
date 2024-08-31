class student{
    String name;
    int roll;
    String dept;
    student(String name){
        this.name=name;
        display(name);
    }
    student(String name,int roll){
        this.name=name;
        this.roll=roll;
        display(name, roll);
    }
    student(String name,int roll,String dept){
        this.name=name;
        this.roll=roll;
        this.dept=dept;
        display(name, roll, dept);
    }
    void display(String name){
        System.out.println("Name of student is:"+name);
    }
    void display(String name,int roll){
        System.out.println("Name of the student is:"+name);
        System.out.println("Roll of the student is:"+roll);
    } 
    void display(String name,int roll,String dept){
        System.out.println("Name of the student is:"+name);
        System.out.println("Roll of the student is:"+roll);
        System.out.println("Department of the student is:"+dept);
    }
}
class  constructor_overloading {
    public static void main(String[] args) {
        student s1=new student("aman");
        student s2=new student("Raju", 10);
        student s3=new student("Kamal", 12, "Cse");

    }
}
