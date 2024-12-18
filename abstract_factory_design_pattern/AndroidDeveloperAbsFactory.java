public class AndroidDeveloperAbsFactory extends AbstractEmployeeFactory {
    public Employee createEmployee(){
        return new AndroidDeveloper();
    }
}
