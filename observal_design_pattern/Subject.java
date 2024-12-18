public interface Subject {

    public void suscribe(Observer observer);
    public void unSuscribe(Observer observer);
    public void uploadNewVideo(String newVideoName);

}