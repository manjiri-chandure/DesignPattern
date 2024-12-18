public class AdapterCharger implements AppleCharger{

    private AndroidCharger acharger;

    public AdapterCharger(AndroidCharger acharger){
        this.acharger = acharger;
    }

    public void chargePhone(){
        acharger.chargeAPhone();
        System.out.println("Iphone is charging using Adapter");
    }

}
