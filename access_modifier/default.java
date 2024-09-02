/*default access modifier  scope is in the same package.We can create default classes, objects and variables.
we can type default keyword or write no keyword to show default access modifier
 */
class abc{
    private int n=90;
     int a=67;
}
class d extends abc{
    int b=9;
}
class def{
    public static void main(String[] args) {
        d ob1=new d();
        System.out.println(ob1.a);
        System.out.println(ob1.b);
        //System.out.println(ob1.n);it gives error as private variables or method  does not inherit to subclass

    }
}
