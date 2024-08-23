/*In hierarchical inheritance more than one class will be derived from sa single base class */
class animal{
    void cell(){
        System.out.println("Animal cell type is eukaryotic");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Dogs can bark");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("Cats can meows");
    }
}
class hierarchical {
    public static void main(String args[]){
        dog d1=new dog();
        cat c1=new cat();
        d1.cell();
        d1.bark();/*Here dog and cat inherit the property of animal so they have cell types method and they have some additional methods */
        c1.cell();
        c1.meow();
    }
}
