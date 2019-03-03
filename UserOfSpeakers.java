public class UserOfSpeakers{
    public static void main(String[] commandLine){
	Animal pup = new Retriever();
	System.out.println(pup.speak());

	//error message when trying to instantiate an abstract class
	System.out.println("UserOfSpeakers.java:5: error: Animal is abstract; cannot be instantiated"); 
    }
}

