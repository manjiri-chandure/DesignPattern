 public class AbtsractFactoryPattern {
    public static void main(String args[]){

        Employee employee = EmployeeFactory.getEmployee(new AndroidDeveloperAbsFactory());
        employee.name();

        Employee employee2 = EmployeeFactory.getEmployee(new WebDeveloperAbsFactory());
        employee2.name();

    }
   
}
