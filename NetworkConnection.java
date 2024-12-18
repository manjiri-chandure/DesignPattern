import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    // implements cloneable interface
    private String ip;
    private String importantData;
    // for shallow and  deep concept
    private List<String> domains = new ArrayList<>();

    public NetworkConnection(){
        System.out.println("Network Connection Obj Created!");
    }

    public String getIp(){
        return this.ip;
    }

    public void setIp(String ip){
        this.ip = ip;
    }

    public String getImportantData(){
        return this.importantData;
    }

    public void setImportantData(String importantData){
        this.importantData = importantData;
    }
    // for shallow and deep
    public List<String> getDomains(){
        return this.domains;
    }

    public void setDomains(List<String> domains){
        this.domains = domains;
    }
    
    public void loadImportantData() throws InterruptedException{
        this.importantData = "Loaded Very Important Data";
        this.domains.add("ManjiriD");
        this.domains.add("SuyashD");
        Thread.sleep(3000);
        // System.out.println(this.importantData);
    }

    @Override
    public String toString(){
        return this.ip + " " + this.importantData + " : " + this.domains;
    }

        // make it deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException{
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.ip);
        networkConnection.setImportantData(this.importantData);
        // networkConnection.setDomains(this.domains);  // shallow
        for(String d : this.domains){
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }

    // default shallow copy
    // @Override
    // protected Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }
}
