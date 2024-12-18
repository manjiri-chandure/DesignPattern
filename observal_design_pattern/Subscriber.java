public class Subscriber implements Observer{
    private String name;
    
    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notifiy(String newVideoName){
            System.out.println("Hi " + this.name + " -> "+ newVideoName + " video get Uploaded!");
    }

}
