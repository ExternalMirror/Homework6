package HomeTask6.Methods;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Ele bir method yaradin ki, bu method 2 setrin arasinda en uzun setri qaytarsin" +
                "\n2.Ele mir method yaradin ki, bu method dexil edilmis setirdeki bosluqlarin sayini qaytarsin" +
                "\n3.Ele bir method yaradin ki, bu method daxil edilmis ededler massivindeki ededlerin camini qaytarsin ki" +
                "\n4.Ele bir method yaradin ki, bu method daxil edilmis setirler massivinden, en uzun sozu qaytarsin" +
                "\n5.Ele bir method yaradin ki, bu method daxil edilmis setirden baslangic herfi ile son herfi eyni olan sozleri qaytarsin, nezere alin ki setirde sozler bosluq simvolu ile ayrilmisdir" +
                "\n6.Ele bir method yaradin ki, bu method daxil edilmis setirden en cox sait olan sozu qaytarsiin" +
                "\n7.Ele bir method yaradin ki, bu method daxil edilmis ededin sade ve ya murekkeb eded olunmasini mueyyen etsin" +
                "\n8.Ele bir method yaradin ki, bu method soyadin Azerbaycanli olub olmamasini tapsin");
        System.out.println("Enter number of which task you want to make");
        System.out.print("Task ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                System.out.print("Enter text1: ");
                try {
                    String text1 = sc.nextLine();
                    System.out.print("Enter text2: ");
                    String text2 = sc.nextLine();
                    System.out.println(Methods.findLongestTextAndPrint(text1, text2));
                } catch (Exception ex) {
                    System.out.println("Inside error");
                    ex.printStackTrace();
                }
                break;
            case 2:
                System.out.print("Enter text: ");
                try {
                    String text3 = sc.nextLine();
                    int count = Methods.findEmptySpacesInText(text3);
                    System.out.println("Amount of empty spaces in text is " + count);
                } catch (Exception ex) {
                    System.out.println("Inside error");
                    ex.printStackTrace();                }
                break;
            case 3:
                //exception catch data that is String
                System.out.print("Enter Amount of Numbers in Array: ");
                try {
                    int amount = sc.nextInt();
                    int[] numbers = new int[amount];
                    int sum = Methods.findSumOfNumberInArray(amount, numbers, sc);
                    System.out.println("Sum of numbers is " + sum);
                }catch (InputMismatchException ex){
                    System.out.println("Input data can't contain String");
                }catch (Exception ex){
                    System.out.println("inside error");
                    ex.printStackTrace();
                }
                break;
            case 4:
                System.out.print("Enter text: ");
                try {
                    String text4 = sc.nextLine();
                    String longestWord = Methods.findLongestWordInText(text4);
                    System.out.println(longestWord);
                } catch (Exception ex) {
                    System.out.println("Inside error");
                    ex.printStackTrace();                }
                break;
            case 5:
                System.out.print("Enter text: ");
                try {
                    String text5 = sc.nextLine();
                    String result = Methods.findWordWithSameLetterEndAndStart(text5);
                    System.out.println(result);
                } catch (Exception ex) {
                    System.out.println("Inside error");
                    ex.printStackTrace();                }
                break;
            case 6:
                System.out.print("Enter text: ");
                try {
                    String text6 = sc.nextLine();
                    String[] wordsCase6 = text6.trim().split(" ");
                    Methods.findMaxVowelWordAndCount(wordsCase6);
                } catch (Exception ex) {
                    System.out.println("Inside error");
                    ex.printStackTrace();                }
                break;
            case 7:
                try {
                    System.out.print("Enter value of num: ");
                    double num = sc.nextDouble();
                    String prime = Methods.isPrime(num);
                    System.out.println(prime);
                } catch (InputMismatchException ex) {
                    System.out.println("Input must be numerical ");
                } catch (Exception ex) {
                    System.out.println("Inside error");
                    ex.printStackTrace();
                }
                break;
            case 8:
                System.out.print("Enter the person's surname: ");
                try {
                    String surname = sc.nextLine();
                    System.out.println(Methods.checkNationality(surname));
                } catch (Exception ex) {
                    System.out.println("Inside error");
                    ex.printStackTrace();
                }
                break;
            default:
                System.out.println("There is only 8 Task please enter from [1-8]");
        }
    }
}

//Instead of putting try catch on each just put try catch on all switch