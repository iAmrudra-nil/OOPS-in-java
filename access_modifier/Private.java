/*We can use private access modifier in methods and variables but not in classes. private access
 * modifier has a scope in the same class that means in same class we can access any private methods 
 * or private attributes out of that class it has no scpoe.
 */
 class Private {
    private  int a=67;
    private static void display(){
        System.out.println("This is private method..");
    }
    public static void main(String[] args) {
        System.out.println(a);//another hacks is that non-static variable or methods cannot be referenced from a static context
        display();//therefore as main class is by convension is static so if we have to reffer any method or variable we have to convert them into satic
    }
    
}
