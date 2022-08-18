//Sarah Plazio 
//CMSC 412    Fall 2021
//Homework 6

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class FileDirectoryApp {
  private static String input; 
  static File choice;
  private static File[] choiceArray; 
  private static boolean okDirectory = false;
  private static List <File> directories = new ArrayList<File>();
  private static List <File> files = new ArrayList<File>();
  private static File[] directories1;
  private static File[] files1;
  private static int selection;
  private static String password = "Qwertyuiop[123$4$567]";
  private static String fileName = "";
  private static String outputString;
  private static String fileString = "";
  private static String encName = "";
 
  public static void main(String[] args) throws InterruptedException, IOException {
      do {
        selection = menu();
        switch(selection){
          case 1: selectDirectory();
          break;
          case 2: listLvlOne();
          break;
          case 3: listAll();
          break;
          case 4: deleteFile();
          break;
          case 5: displayHexa();
          break;
          case 6: encryptFile();
          break;
          case 7: decryptFile();
          break;
          //default: System.out.println("\n\nprogram terminated");
          //break;
        }
      }while (selection != 0);
      if (selection == 0) {
        exitApp();
      }
  }

  public static int menu() {
    int selection = -1;
    Scanner scan = new Scanner(System.in);
    System.out.print("\n   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
        "\n\t0 – Exit" +
        "\n\t1 – Select directory" +
        "\n\t2 – List directory content (first level)" +
        "\n\t3 – List directory content (all levels)" +
        "\n\t4 – Delete file" +
        "\n\t5 – Display file (hexadecimal view)" +
        "\n\t6 – Encrypt file (XOR with password)" +
        "\n\t7 – Decrypt file (XOR with password)" +
        "\n\n\tSelect option: ");
    try {
      selection = scan.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Enter a number 0-7.");
    }
    if ((selection < 0) || (selection > 7)) {
      System.out.println("Invalid entry. Try again.");
      selection = scan.nextInt();
    }
    return selection;
  }
  
  //derived from https://www.geeksforgeeks.org/xor-cipher/
  static String encryptDecrypt(String inputString)
  {
      // Define XOR key
      // Any character value will work
      String xorKey = password;

      // Define String to store encrypted/decrypted String
      outputString = "";

      // calculate length of input string
      int len = inputString.length();
      System.out.println("length: " + len + "\ncyphering...");
      // perform XOR operation of key
      // with every character in string
      int keyItr = 0;
      for (int i = 0; i < len; i++)
      {
          outputString = outputString +
          Character.toString((char) (inputString.charAt(i) ^ xorKey.charAt(keyItr)));
          keyItr++;
          //System.out.println("keyItr: " + keyItr + " i: " + i);
          //repeat key
          if(keyItr >= xorKey.length()) {
            keyItr = 0;
          }
      }
      System.out.println("cipher complete");
      System.out.println(outputString);
      return outputString;
  }
  
  private static void decryptFile() {
    int flag2 = 0;
    String pwAttempt;
    if (okDirectory) {
      System.out.println("\nDECRYPT FILE");
      Scanner sc1 = new Scanner(System.in);
      System.out.println("\nEnter the password (hint: Qwertyuiop[123$4$567]): ");
      pwAttempt = sc1.nextLine();
      
      //checks if password requirements are met
      while(!isValid(pwAttempt)) {
        System.out.println("Password requirements unmet. Try again.");
        pwAttempt = sc1.nextLine();
      }
      while(!pwAttempt.equals(password)) {
        System.out.println("Invalid password. Try again.");
        pwAttempt = sc1.nextLine();
      }
      if(pwAttempt.equals(password)) {
        System.out.println("Password correct");
      }
      System.out.println("\nEnter a file to decrypt: ");
      input = sc1.nextLine();
      if(encName == "" || !encName.equals(input)){
        System.out.println("No file encrypted or file " + input + " is not encrypted."
            + "\nSelect option 6 to encrypt file.");
        menu();
      }
      
      for (int i = 0; i < choiceArray.length; i++) {
        fileName = choiceArray[i].getName();
        if (fileName.equalsIgnoreCase(input)) {
          System.out.println(fileName + " found");
          flag2 = 1;
          System.out.println("\ndecrypt filename: " + fileName);
          encryptDecrypt(outputString);
        }
      }
      if (flag2 == 0) {
        System.out.println("File Not Found");
      }
    }
    else
    {
      System.out.println("No directory selected. Select 1 first to enter a directory.");
    } 
  }
    
  private static void encryptFile() throws IOException {
    int flag1 = 0;
    
    String pwAttempt;
    if (okDirectory) {
      System.out.println("\nENCRYPT FILE");
      Scanner sc = new Scanner(System.in);
      System.out.println("\nEnter the password (hint: Qwertyuiop[123$4$567]): ");
      pwAttempt = sc.nextLine();
      
      //checks if password requirements are met
      while(!isValid(pwAttempt)) {
        System.out.println("Password requirements unmet. Try again.");
        pwAttempt = sc.nextLine();
      }
      
      //checks that password is correct
      while(!pwAttempt.equals(password)) {
        System.out.println("Invalid password. Try again.");
        pwAttempt = sc.nextLine();
      }
      if(pwAttempt.equals(password)) {
        System.out.println("Password correct");
        System.out.println("\nEnter a file to encrypt: ");
        input = sc.nextLine();
        
        //search for file from user
        for (int i = 0; i < choiceArray.length; i++) {
          fileName = choiceArray[i].getName();
          if (fileName.equalsIgnoreCase(input)) {
            System.out.println(fileName + " found");
            flag1 = 1;
            System.out.println("encrypt filename: " + fileName);
            encName = (String)fileName;
            //take file's data into String to encrypt
            fileString = new String(Files.readAllBytes(Paths.get(choiceArray[i].getCanonicalPath())));
            encryptDecrypt(fileString);
          }
        }
      }
      if (flag1 == 0) {
        System.out.println("File Not Found");
      }
    }
    else
    {
      System.out.println("No directory selected. Select 1 first to enter a directory.");
    }    
  }

  private static boolean isValid(String pwAttempt) {
    //Regex to check valid string. Derived from: 
    //https://www.geeksforgeeks.org/how-to-validate-a-username-using-regular-expressions-in-java/
    // Regex from https://www.regexlib.com/REDetails.aspx?regexp_id=3760
    //except changed {6,50} to {6,256} for the 256 byte requirement,
    //since 1 byte = 1 character
    String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W_]).{6,256})";

    // Compile the ReGex
    Pattern p = Pattern.compile(regex);

    // If the string is empty
    // return false
    if (pwAttempt == null) {
        return false;
    }

    // Pattern class contains matcher() method
    // to find matching between given username
    // and regular expression.
    Matcher m = p.matcher(pwAttempt);

    // Return if the String
    // matched the ReGex
    return m.matches();
  }

  private static void displayHexa() {
    //I tried numerous ways to get the hex rep to print correctly. 
    //I decided to leave here and work on the last two options.
    //Any suggestions to better code, would be appreciated. 
    if (okDirectory) {
      System.out.println("\nDISPLAY HEXADECIMAL"); 
      Scanner scIn = new Scanner(System.in);
      System.out.println("\nEnter a file to display hexadecimal view: ");
      input = scIn.nextLine();
      File file2Hexa;
      //derived from Second approach on: 
      //https://www.geeksforgeeks.org/java-program-to-search-for-a-file-in-a-directory/
      int flag = 0;
      if (choiceArray == null) {
          System.out.println("Empty directory.");
      }
      else {
          // Linear search in the array
          for (int i = 0; i < choiceArray.length; i++) {
              String fileName = choiceArray[i].getName();
              if (fileName.equalsIgnoreCase(input)) {
                  System.out.println(fileName + " found");
                  flag = 1;
                  
                  //get file path and read to array
                  file2Hexa= choiceArray[i].getAbsoluteFile();
                  Path path;
                  byte [] xArray;
                  try {
                    path = Paths.get(file2Hexa.getCanonicalPath());
                    xArray = Files.readAllBytes(path);
                    for (int j = 0; j < xArray.length; j++) {
                      if (j % 16 == 0) {
                          System.out.print(String.format("\n%08X", j) + " ");
                      }
                      System.out.print(String.format("%02X ", xArray[j]));
                    }
                  } catch (IOException e1) {
                      System.out.println("error hexidecimal path");
                  }
              }
          }
      }
      if (flag == 0) {
          System.out.println("File Not Found");
      }  
    }
    else
    {
      System.out.println("No directory selected. Select 1 first to enter a directory.");
    }   
  }
  
  private static void deleteFile() {
    if (okDirectory) {
      System.out.println("\nDELETE FILE"); 
      Scanner scInput = new Scanner(System.in);
      System.out.println("\nEnter a file to delete: ");
      input = scInput.nextLine();
      File file2Delete; 
      
      //derived from Second approach on: 
      //https://www.geeksforgeeks.org/java-program-to-search-for-a-file-in-a-directory/
      int flag = 0;
      if (choiceArray == null) {
          System.out.println("Empty directory.");
      }
      else {
          // Linear search in the array
          for (int i = 0; i < choiceArray.length; i++) {
              String fileName = choiceArray[i].getName();
              if (fileName.equalsIgnoreCase(input)) {
                  System.out.println(fileName + " found");
                  file2Delete = choiceArray[i].getAbsoluteFile();
                  if(file2Delete.delete()) {
                    System.out.println("File deleted.");
                  }
                  flag = 1;
              }
          }
      }
      if (flag == 0) {
          System.out.println("File Not Found");
      }     
    }
    else
    {
      System.out.println("No directory selected. Select 1 first to enter a directory.");
    }
  }
  
  private static void listAll() {
    if (okDirectory) {
    System.out.println("\nLIST ALL\n");  
    //RecursiveList(choiceArray, 0, 0);
    PrintAll();
    }
    else
    {
      System.out.println("No directory selected. Select 1 first to enter a directory.");
    }
  }

  private static void PrintAll() {
    System.out.println("\n\nDirectories:"); 
    directories.forEach(System.out::println);
    System.out.println("\n\nFiles:"); 
    files.forEach(System.out::println);
  }

  private static void RecursiveList(File[] choiceArray, int index, int level) {
    //method derived from:
    //https://www.geeksforgeeks.org/java-program-list-files-directory-nested-sub-directories-recursive-approach/
   
    // terminate condition
    if(index == choiceArray.length)
        return;
       
    // Space for internal levels
    for (int i = 0; i < level; i++)
        //System.out.print("    ");
     
    // for sub-directories
    if(choiceArray[index].isDirectory())
    {
      directories.add(choiceArray[index]);      
      /*if(level == 0) {
        System.out.println("Directory [" + choiceArray[index].getName() + "]");
        
      }
      if(level > 0){
        System.out.println("Subdirectory [" + choiceArray[index].getName() + "]");
      }  */  
        // recursion for sub-directories
        RecursiveList(choiceArray[index].listFiles(), 0, level + 1);
    } 
    
    // for files
    if(choiceArray[index].isFile()) {
        files.add(choiceArray[index]);
        //System.out.println(choiceArray[index].getName());
    } 
         
    // recursion for main directory
    RecursiveList(choiceArray, ++index, level);
  }

  private static void listLvlOne() {
    
    if (okDirectory) {
    System.out.println("LIST FIRST LEVEL");    
       
    directories1 = new File(choice.getPath()).listFiles(File::isDirectory);
    files1 = new File(choice.getPath()).listFiles(File::isFile);
    
    System.out.println("\nDirectories:\n");
    for (int i = 0; i < directories1.length; i++) {
      System.out.println((i+1) +" " + directories1[i]);
    }
    System.out.println("\nFiles:\n");
    for (int i = 0; i < files1.length; i++) {
      System.out.println((i+1) +" " + files1[i]);
    }
   }
    else {
      System.out.println("No directory selected. Select 1 first to enter a directory.");
    }
  }

  private static void selectDirectory() {
    Scanner scInput = new Scanner(System.in);
    System.out.println("SELECT DIRECTORY");
    System.out.println("\nEnter a directory to work with: ");
    input = scInput.nextLine();
    
    try {
      choice = new File(input);
      if (choice.isDirectory()) {
        System.out.println(choice.getAbsolutePath() + " is a directory.");
        okDirectory = true;
        choiceArray = choice.listFiles();
        RecursiveList(choiceArray, 0, 0);
      }
      else {
        System.out.println(choice + " is not a directory. Try again.");
      }
    } catch (NullPointerException e) {
      System.out.println("Null. Try again.");
    }
  }
  
  private static void exitApp() throws InterruptedException {
    System.out.println("exit"); 
    Thread.sleep(3000);
    System.exit(0);   
  }
}
