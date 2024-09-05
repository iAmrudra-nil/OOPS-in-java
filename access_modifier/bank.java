/*Public can be anything that means a class a variable and a method can be public.public class or methods ca
 * access by same class and same package and as well as different package class also.
 */

public class bank{
        public int id;
        public String b_name;
        bank(int id,String name){
            this.id=id;
            this.b_name=name;
        }
        public void interest(){
            System.out.println("Amount of interest is given by the bank in saving acc is 3%");
        }
        public void displaydetails(){
            System.out.println("Branch id "+id);
            System.out.println("Branch name "+b_name);
        }

        public static void main(String[] args) {
            bank sbi=new bank(23,"Tamluk");
            sbi.interest();
            sbi.displaydetails();
       
        }
    }
    

