package HomeTask6.Methods;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Methods {
    //Find the longest text and prints and shows its length

    public static String findLongestTextAndPrint(String text1, String text2) {
        if (text1.length() > text2.length()) {
            return "Longest text is "+text1+", and Its length is "+text1.length();
        } else if (text1.length() < text2.length()) {
            return "Longest text is "+text2+", Its length is "+text2.length();
        } else {
            return "Both of "+text1+" and "+text2+" length are same, It is "+ text1.length();
        }
    }
    // Finds empty spaces and counts them
    public static int findEmptySpacesInText(String text3) {
        int count = 0;
        for (int i = 0; i < text3.length(); i++) {
            if (text3.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    // find sum of numbers in array
    public static int findSumOfNumberInArray(int amount, int[] numbers, Scanner sc) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            System.out.print("Number " + (i + 1) + ":");
            // Only accepts numeric value for sum
            try {
                numbers[i] = sc.nextInt();
                sum += numbers[i];
            }catch (InputMismatchException ex){
                System.out.println("Input data can't be String");
                sc.next();
                i--;
            }catch (Exception ex){
                System.out.println("Inside error");
                ex.printStackTrace();
            }
        }
        System.out.println("Numbers are " + Arrays.toString(numbers));
        return sum;
    }

    // finds Longest word in sentence
    public static String findLongestWordInText(String text4) {
        if (text4 == null) {
            // can't keep being null
            throw new IllegalArgumentException("Input data can't be null");
        }
        if (text4.trim().isEmpty()) {
            // can't keep being empty
            throw new IllegalArgumentException("Input data can't be empty");
        }
        String[] words = text4.trim().split(" ");
        int maxWordLength = 0;
        String maxWord = "";
        for (String word : words) {
            if (maxWordLength < word.length()) {
                maxWordLength = word.length();
                maxWord = word;
            } else if (maxWordLength == word.length()) {
                maxWord += " , " + word;
            }
        }
        return maxWord;
    }

    //find word in sentence that start and ends with same letter
    public static String findWordWithSameLetterEndAndStart(String text5) {
        if (text5 == null) {
            // can't keep being null
            throw new IllegalArgumentException("Input text can't be null");
        }
        if (text5.trim().isEmpty()) {
            // can't keep being empty
            throw new IllegalArgumentException("Input text can't be empty");
        }
        String[] words5 = text5.trim().split(" ");
        String result = " ";
        for (String word5 : words5){
            if (word5.length()>1 && word5.charAt(0)==word5.charAt(word5.length()-1)){
                result += word5+ " , ";
            }
        }
        return result.trim();
    }
    //find max vowel word in text
 public static void findMaxVowelWordAndCount(String[] wordsCase6) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    try {
        String maxVowelWord = "";
        int maxVowelCount = 0;

        for (String wordCase6 : wordsCase6) {
            int vowelCount = countVowels(wordCase6, vowels);

            if (vowelCount > maxVowelCount) {
                maxVowelCount = vowelCount;
                maxVowelWord = wordCase6;
            } else if (vowelCount == maxVowelCount) {
                maxVowelWord += ", " + wordCase6;
            }
            System.out.println("Word with the most vowels: " + maxVowelWord);
            System.out.println("Number of vowels: " + maxVowelCount);
        }
    }catch (ArrayIndexOutOfBoundsException ex){
        System.err.println("Array index out of bounds");
        ex.printStackTrace();
    }catch (Exception ex){
        System.out.println("Inside error");
        ex.printStackTrace();
    }

}
// counting vowel in text
    private static int countVowels(String word, char[] vowels) { //throws IllegalArgumentException
        if (word == null) {
            throw new IllegalArgumentException("Input can't be null");
        }
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = Character.toLowerCase(word.charAt(i));
            vowelCount += countSingleVowel(currentChar, vowels);
        }
        return vowelCount;
    }
// counting single vowel in each word
    private static int countSingleVowel(char currentChar, char[] vowels) {
        int count = 0;

        for (char vowel : vowels) {
            if (currentChar == vowel) {
                count++;
            }
        }

        return count;
    }
    // Method to check if the number is prime
    public static String isPrime(double num) {
        if (num % 1 != 0) {
            throw new IllegalArgumentException("Input must be a whole number");
        }
        if (num < 0 || num == 1 || num == 0) {
            throw new IllegalArgumentException("Input mist be other than negative, 0 and 1");
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return "This is non-prime number";
            }
        }
        return "This is prime number";
    }

//     Method to check if the surname is Azerbaijani
    public static String checkNationality(String surname){
        if (surname == null) {
            throw new IllegalArgumentException("Surname cannot be null");
        }
        if (surname.length()>=4){
            throw new IllegalArgumentException("Surname contains more than than 4 letter, please write surname");
        }
        String lowerCaseSurname = surname.toLowerCase();
        if (lowerCaseSurname.matches("(.*)ov")||lowerCaseSurname.matches("(.*)ova")||
                lowerCaseSurname.matches("(.*)yev")||lowerCaseSurname.matches("(.*)yeva")||
                lowerCaseSurname.matches("(.*)li")||lowerCaseSurname.matches("(.*)lu")){
            return "This person is from Azerbaijan";
        }else {
            return "This person isn't from Azerbaijan";
        }

    }
}
