public class SingletoneSamosa{   // lazy initialization\
    
    private static SingletoneSamosa samosa; // step 2

    private SingletoneSamosa(){  // step 1
        System.out.println("Samosa is Ready!");
    }

    // public static SingletoneSamosa getSingletoneSamosa(){ // step 3 single threads
    //     if(samosa == null){
    //         samosa = new SingletoneSamosa();
    //     }
    //     return samosa;
    // }


    public void readyMessage(){
        System.out.println("Samosa is Ready!");
    }

    // public synchronized static SingletoneSamosa getSingletoneSamosa(){ // step 3 for multiple threads
    //     if(samosa == null){
    //         samosa = new SingletoneSamosa();
    //     }

    //     return samosa;
    // }

    public static SingletoneSamosa getSingletoneSamosa(){ // step 3 for multiple threads
        // can be many lines
        if(samosa == null){  // only paraller threads can go for syn not all threads 
            synchronized(SingletoneSamosa.class){  // make only block of code syn which is required 
                if(samosa == null)
                  samosa = new SingletoneSamosa();
            }
           
        }
        //here can be many lines too
        return samosa;
    }
}