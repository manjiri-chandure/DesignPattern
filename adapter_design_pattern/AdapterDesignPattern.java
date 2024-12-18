public class AdapterDesignPattern {
    public static void main(String args[]){
        AppleCharger appleCharger = new AppleChargerXYZ();
        Iphone13 iPhone13  = new Iphone13(appleCharger);
        iPhone13.chargeIphone();

        AndroidCharger androidCharger = new XYACharger();
        AppleCharger adapterCharger = new AdapterCharger(androidCharger);
        Iphone13 iphone132 = new Iphone13(adapterCharger);
        iphone132.chargeIphone();
    }
}
