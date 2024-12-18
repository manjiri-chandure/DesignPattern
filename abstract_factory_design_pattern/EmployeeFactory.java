public class EmployeeFactory {
        // call abstract factory
        //added one more level of abtraction
        
        public static Employee getEmployee(AbstractEmployeeFactory abstractEmployeeFactory){
                return abstractEmployeeFactory.createEmployee();
        }
}
