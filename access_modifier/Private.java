/*We can use private access modifier to method and attributes or variables. private access
 * modifier has a scope in the same class that means in same class we can access any private methods 
 * or private attributes out of that class it has no scpoe
 */
 class Private {
    private  int a=67;
    private static void display(){
        System.out.println("This is private method..");
    }
    public static void main(String[] args) {
        System.out.println(a);//another hacks is that a static method cannot 
        display();
    }
    
}
