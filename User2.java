public class User2 {
    private final String UserId;
    private final String UserName;
    private final int UserAge;
    //final need to initialized while creation of obj else null
    private User2(UserBuilder userBuilder){  // outside this class no one can call constrcutor and create object except only through builder class
        // copy constrcutor
        this.UserId = userBuilder.UserId;
        this.UserName = userBuilder.UserName;
        this.UserAge = userBuilder.UserAge;
    }

    // only getter not setter so that after creating obj of this class no one can set value again
    // immutable object

    public String getUserId(){
        return this.UserId;
    }

    public String getUserName(){
        return this.UserName;
    }

    public int getUserAge(){
        return this.UserAge;
    }

    //inner builder class
    @Override
    public String toString(){
        return "UserId: " + UserId + " UserName: " + UserName + " UserAge: " + UserAge;
    }

    static class UserBuilder{
        
        private String UserId;
        private String UserName;
        private int UserAge;

        public UserBuilder(){ // public constructor

        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder setUserId(String UserId){
            this.UserId = UserId;
            return this;
        }

        public UserBuilder setUserName(String UserName){
            this.UserName = UserName;
            return this;
        }

        public UserBuilder setUserAge(int userAge){
            this.UserAge = userAge;
            return this;
        }

        public User2 build(){
            User2 user = new User2(this);
            return user;
        }
    }

}
