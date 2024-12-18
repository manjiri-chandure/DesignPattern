public class FactoryDesignPattern {
    public static void main(String args[]){
        // Developer developer = new BackendDeveloper();  // tightly couple maually assigned typeof class object
        // System.out.println(developer.salary());

        //created objs for interface not creating obj of classes by client // just need to deals 
        //about method in interface
        Developer developer = DeveloperFactory.getDeveloper("backend");  // here I used ignore case in factory class
        System.out.println(developer.salary());

        Developer developer2 = DeveloperFactory.getDeveloper("Frontend");
        System.out.println(developer2.salary());
    }
}
