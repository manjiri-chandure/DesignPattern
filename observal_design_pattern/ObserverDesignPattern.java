public class ObserverDesignPattern {
    public static void main(String args[]){  
        // new Ychannel
        Subject subject = new YouTube();

        // observers
        Observer Manjiri = new Subscriber("Manjiri");
        Observer Suyash = new Subscriber("Suyash");

        subject.suscribe(Manjiri);
        subject.suscribe(Suyash);

        subject.uploadNewVideo("Learn Spring boot");

        subject.uploadNewVideo("Interview Preparation");
    }
}
