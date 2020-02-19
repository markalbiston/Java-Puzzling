import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PuzzleJavaTest{
    public static void main (String[] args){
        PuzzleJava greater10 = new PuzzleJava();
        int[] inputArray = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> output = greater10.CreateSumGreater10(inputArray);
        System.out.println(output);

        PuzzleJava randomName = new PuzzleJava();
        ArrayList<String> inputArrayNames = new ArrayList<String>();
        inputArrayNames.add("Nancy");
        inputArrayNames.add("Jinichi");
        inputArrayNames.add("Fujibayashi");
        inputArrayNames.add("Momochi");
        inputArrayNames.add("Ishikawa");
        ArrayList<String> outputNames = randomName.RandomNinja(inputArrayNames);
        System.out.println(outputNames);

        PuzzleJava shuffleLetters = new PuzzleJava();
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> letterlist = new ArrayList<String>();
        Collections.addAll(letterlist, alphabet);
        // ArrayList<String> letterlist = Arrays.asList(alphabet);
        String message = shuffleLetters.Letters(letterlist);
        System.out.println(message);

        PuzzleJava randomNumbers = new PuzzleJava();
        ArrayList<Integer> outputRandom = randomNumbers.RandomNumbers();
        System.out.println(outputRandom);

        PuzzleJava randomNumbersSorted = new PuzzleJava();
        ArrayList<Integer> outputRandomSorted = randomNumbersSorted.RandomNumbersSorted();
        System.out.println(outputRandomSorted);

        PuzzleJava randString = new PuzzleJava();
        String randomString = randString.RandomString();
        System.out.println(randomString);

        PuzzleJava randArray = new PuzzleJava();
        ArrayList<String> newArray = randArray.ArrayOfRandomStrings();
        System.out.println(newArray);
    }

}