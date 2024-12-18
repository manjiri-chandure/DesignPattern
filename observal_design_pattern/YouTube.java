import java.util.ArrayList;
import java.util.List;

public class YouTube implements Subject{
    //has list of subscriber
    private List<Observer> subscribers = new ArrayList<>();

    // it has same number of function had be interface so can create object of type Interface
    public void suscribe(Observer observer){
        subscribers.add(observer);
    }

    public void unSuscribe(Observer observer){
        subscribers.remove(observer);
    }

    public void uploadNewVideo(String videoName){
        for(Observer s : subscribers){
            s.notifiy(videoName);
        }
    }
}
