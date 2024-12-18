public class DeveloperFactory {

    public static Developer getDeveloper(String DeveloperType){
            if(DeveloperType.equals("Frontend"))
                return new FrontendDeveloper();
            else if(DeveloperType.trim().equalsIgnoreCase("Backend"))
                return new BackendDeveloper();
            else
                return null;
    }

}
