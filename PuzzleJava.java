import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{
    public ArrayList<Integer> CreateSumGreater10(int[] arr){
        int sum = 0;
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            if(arr[i] > 10){
                greaterThan10.add(arr[i]);
            }
        }
        System.out.println(sum);
        return greaterThan10;
    }

    public ArrayList<String> RandomNinja(ArrayList<String> arr){
        ArrayList<String> longerThan5 = new ArrayList<String>();
        Collections.shuffle(arr);
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
            if(arr.get(i).length() > 5){
                longerThan5.add(arr.get(i));
            }
        }
        return longerThan5;
    }

    public String Letters(ArrayList<String> arr){
        Collections.shuffle(arr);
        System.out.println("last letter: " + arr.get(arr.size()-1));
        System.out.println("first letter: " + arr.get(0));
        if(arr.get(0) == "a" || arr.get(0) == "e" || arr.get(0) == "i" || arr.get(0) == "o" || arr.get(0) == "u"){
            return "the first letter is a vowel";
        }
        else{
            return "the first letter is a consonant";
        }
    }

    public ArrayList<Integer> RandomNumbers(){
        ArrayList<Integer> randomNumList = new ArrayList<Integer>();
        int x = 0;
        while(x<10){
            Random r = new Random();
            randomNumList.add((r.nextInt(45)+55));
            x++;
        }
        return randomNumList;
    }
    public ArrayList<Integer> RandomNumbersSorted(){
        ArrayList<Integer> randomNumListSorted = new ArrayList<Integer>();
        int y = 0;
        while(y<10){
            Random r = new Random();
            randomNumListSorted.add((r.nextInt(45)+55));
            y++;
        }
        Collections.sort(randomNumListSorted);
        return randomNumListSorted;
    }

    public String RandomString(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int x = 0;
        String newStr = "";
        while(x<5){
            Random r = new Random();
            String letter = alphabet[r.nextInt(25)];
            // System.out.println(letter);
            newStr += letter;
            // System.out.println(newStr);
            x++;
        }
        return newStr;
    }
    public ArrayList<String> ArrayOfRandomStrings(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> newArray = new ArrayList<String>();
        for(int i=0; i<10; i++){
            int x = 0;
            String newStr = "";
            while(x<5){
                Random r = new Random();
                String letter = alphabet[r.nextInt(26)];
                // System.out.println(letter);
                newStr += letter;
                // System.out.println(newStr);
                x++;
            }
            newArray.add(newStr);
        }
        return newArray;
    }
}