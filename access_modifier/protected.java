/*protected access modifier can use to protect content from everone only child class or subclass
  of the same package as well as different package can access protected methods or variables.
 */
class library{
    protected int std_id=341;
    public String books="Java for dummies";
     
}
class student extends library{
        void display(){
                System.out.println("Student id:"+std_id);
        }
}
class p {
    public static void main(String[] args) {
       student s1=new student();
       s1.display();
    }
}
