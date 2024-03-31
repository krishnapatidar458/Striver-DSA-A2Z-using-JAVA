import java.io.*;
import java.util.Scanner;   // Scanner class is used to read the user's input
class User_Input_Output{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Scanner class object 
        int input = sc.nextInt();    //Reads the next integer present in the console and assigns it to variable 'input'
        
        //INPUT USING BufferedReader class
        InputStreamReader in = new InputStreamReader(System.in);  
        BufferedReader br = new BufferedReader(in);  
        String num1 = br.readLine();     //Reading integer value from user using BufferedReader class
        System.out.println(input);      //Printing the message to user for input

        System.out.println(Integer.parseInt(num1));  
    }
}