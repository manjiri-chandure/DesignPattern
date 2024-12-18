public class NetworkDesignPattern {
    public static void main(String args[]) throws InterruptedException{
        NetworkConnection networkConnection = new NetworkConnection();
        // consider creating this obj is costly loading huge data
        // trying to add sleep in loadImportantData
        networkConnection.setIp("192.62.10.0");
        networkConnection.loadImportantData();

        System.out.println(networkConnection);

        //cloning for another object

        try{
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone(); 
            //this clone returning Object not NetworkConnection Obj
            System.out.println(networkConnection2);
            //trying to remove from obj networkConnecction2 but removed from all 
            //using same reference and shallow copy
            networkConnection2.getDomains().remove(0);
            System.out.println(networkConnection2);
            // print old CN
            System.out.println(networkConnection);

            // next for shollow and deep
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone(); 
            System.out.println(networkConnection3);

        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
