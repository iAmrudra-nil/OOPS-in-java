/*static binding or we can say compile time polymorphism is like in compile time compiler will distinguish by type of parameter method declaration or 
 * multiple use of constructor is an example of compile time polymorphism
 * NOTE:method overloading is not acehivable by differentiate between return type only
 */
class emp{
    emp(){
        System.out.println("Basic employee..");
    }
    emp(String name){
        System.out.println("HR manager name is:"+name);
    }
    void display(){
        System.out.println("THis method show basic employee details..");
    }
    void display(String name){
        System.out.println("This method show HR manager details of "+name);
    }
}
class static_binding{
    public static void main(String[] args) {
        emp e1=new emp();
        e1.display();
        e1=new emp("Anuj");
        e1.display("Anuj");
    }
}