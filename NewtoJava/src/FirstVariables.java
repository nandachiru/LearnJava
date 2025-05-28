public class FirstVariables {
    public static void main (String[] args){
        // Declaring variables
        int score=100;
        double pi=3.14159;
        boolean gameInProgress = true;
        char firstletter='c';
        String message = "Welcome to Java!";

        // printing the values of the variables
        System.out.println("score:"+score);
        System.out.println("value of PI:" +pi);
        System.out.println("Game Status:"+ gameInProgress);
        System.out.println("First Letter" + firstletter);
        System.out.println("Message: " + message);


        // you can change variable value
        score=500;
        gameInProgress = false;
        firstletter='d';
        message = "Learning Java";

        // printing the new values of the variables
        System.out.println("score:"+score);
        System.out.println("value of PI:" +pi);
        System.out.println("Is Game in Progress?"+ gameInProgress);
        System.out.println("Favourite letter" + firstletter);
        System.out.println("Message: " + message);


    }

}
