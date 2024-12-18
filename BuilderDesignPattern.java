public class BuilderDesignPattern {
    public static void main(String args[]){
        User2 user = new User2.UserBuilder()
                            .setUserId("174M")
                            .setUserName("Manjiri Chandure")
                            .setUserAge(22)
                            .build();
        
        
        System.out.println(user);

        // creating obj of UserBuilder which is static we are able to use it before creating obj of User
        //this UserBuilder obj gives/ return obj of User
        // both classes having same memebers varibles

        //*******
        //User user2 = new User.UserBuilder();  // now we can not because it is return obj of Builder class not User

        // can create obj of User without creating obj of UserBuilder just making 
        // builder() making static but it internally creating obj of UserBuilder class beacuse we are using
        //copy constructor
        //coping values from obj UserBuilder to User and return new User Obj

        User2 user2 = User2.UserBuilder.builder()
                         .setUserId("123S")
                         .setUserName("Suyash Chanvan")
                         .setUserAge(22)
                         .build();


        System.out.println(user2);

    }
}
