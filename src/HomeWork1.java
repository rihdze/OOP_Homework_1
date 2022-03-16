import java.util.ArrayList;
import java.util.Scanner;
/*
Made by: Rihards Dzerkals, Group 1.
Task explanation:
1. Read a set of integers into a vector. Print the sum of each pair of adjacent elements. Change your program so that it prints the sum of the first and last elements, followed by the sum of the second and second-to-last, and so on.
2. Read a sequence of words from cin and store the values a vector. After you’ve read all the words, process the vector and change each word to uppercase. Print the transformed elements, eight words to a line. (Hint: use <cctype> library to convert symbols to uppercase)
3. Write a program that uses a while to sum the even numbers from 50 to 100.

 */
public class HomeWork1 {

    public static void main(String[] args) {
    //Either comment out the tasks if you want to test them one by one or just run the program and they will run one after another.
        task1();
        task2();
        task3();



    }
    //Task 1
    public static void task1(){
        Scanner reader = new Scanner(System.in); //For reading the input data.
        System.out.println("Please input your numbers (Enter any string to quit this): "); //Just to notify user what to do

        int num; //Integer will be stored in this variable.

        ArrayList<Integer> ListOfIntegers = new ArrayList<Integer>(); //List to store integers.

        //Reads the given numbers adds them to num variable and adds them to the list, to quit this step just simply write any string.
        while(reader.hasNextInt()){
            num = reader.nextInt();
            ListOfIntegers.add(num);
        }
        //Iterates through the list of integers and sums up first + last, second + second to last etc. if the list is not even, then it will skip the last number.
        for(int i = 0; i < (ListOfIntegers.size()/2); i++){
            //Prints out the sum of numbers, gets the value from the list with index of i and sums it up with the value from list with index of (size of the list -1-i)
            System.out.println(ListOfIntegers.get(i) + ListOfIntegers.get(ListOfIntegers.size()-1-i));
        }

    }

    //Task 2
    public static void task2(){
        //For reading the input data
        Scanner reader = new Scanner(System.in);
        //For informing user what to do
        System.out.println("Please input words separated by space (Enter 'quit' quit): ");
        //List for saving the words
        ArrayList<String> ListOfWords = new ArrayList<String>();
        //Variable to store the strings in
        String word;
        //Integer for counting words per line
        int loopCount = 0;

        //Loop that reads the input and splits the input when there is a space, enter 'quit' to quit the loop
        while(reader.hasNext()){
            word = reader.next();
            if(word.equalsIgnoreCase("quit")){
                break;
            }
            word.split(" ");
            ListOfWords.add(word);
        }

        //Iterate through the List of words, add them to print statement and at the same time
        // make them uppercase, if word count reaches 8, puts a new line and repeats the sequence.
        for(String s : ListOfWords){
            System.out.print(s.toUpperCase() + " ");
            loopCount++;
            if(loopCount == 8){
                loopCount = 0;
                System.out.println();
            }
        }

    }

    public static void task3(){
        //Variable for current value
        int current = 50;
        //Variable for sum
        int sum = 0;
        //While loop, loops until start equals 100
        while(current <= 100){
            //Checks if number is even or odd, if current%2 returns 0 it's even, if it returns 1 then it's odd.
            if(current%2 == 0){
                sum=sum+current;
            }
            //Increments the value by 1
            current++;

        }
        //Prints out the result
        System.out.println(sum);
    }




}
