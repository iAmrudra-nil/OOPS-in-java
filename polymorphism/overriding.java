/*when child class override the same methods of parent during the runtime allocation of memory then it
is called dynamic binding or runtime polymorphism.we can check that one method is overwritten or not by 
@Override keyword
 */
class doctor{
   
    void department(){
        System.out.println("This is general department of doctor..");
    }
}
class seargeant extends doctor{
    @Override
    void department(){
        System.out.println("This is sergeant department of doctor.. ");
    }
}
class overriding {
    public static void main(String[] args) {
       doctor d1=new seargeant();/*we can make an instance variable of parent class by calling the child class object
                                 but vice versa is not possible as child has no access to call parent*/
        d1.department();//but in the runtime memory allocation time child class method override parent class method
        //so our result should be--> 
            
    }
}
