public class IteratorDesignPattern{
    public static void main(String args[]){
        UserManagement userManagement = new UserManagement();

        User user = new User("Manjiri", "123");
        User user2 = new User("Suaysh", "12");

        userManagement.addUser(user);
        userManagement.addUser(user2);

        MyIterator iterator = userManagement.getIterator();  // user don't care about iternal imp of collections of user

        while(iterator.hasNext()){
            User tempUser = (User) iterator.next();
            System.out.println(tempUser.getUserName());
        }
    }
}