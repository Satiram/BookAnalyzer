package analyzer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)  {
        File file = new File("/home/cd-user/Myprojects/BookAnalyzer/src/books/frankenstein.txt");

     //   int wordCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/cd-user/Myprojects/BookAnalyzer/src/books/frankenstein.txt"));
            String line;
            int wordCount = 0;
            Map<Character,Integer>map=new HashMap<>();

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String w:words
                     ) {
                    for (int j=0;j<w.length();j++)
                    {
                        char c=w.toLowerCase().charAt(j);
                      if(map.containsKey(c))
                          map.put(c,map.get(c)+1);
                      else
                          map.put(c,1);
                    }
                }
                wordCount += words.length;

            }
            System.out.println("Total number of words: " + wordCount);
          //  for(Map.Entry<Character,Integer>entry:map.entrySet())
            for(Map.Entry<Character,Integer>entry:map.entrySet())
            {
                System.out.println("no of "+entry.getKey()+" is "+entry.getValue());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

//        try {
//            // create a Scanner object to read the file
//            Scanner scanner = new Scanner(file);
//
//            // iterate through each word in the file
//            while (scanner.hasNext()) {
//                String word = scanner.next();
//                wordCount++;
//            }
//
//            // close the scanner
//            scanner.close();
//
//            // print the word count
//            System.out.println("Word count: " + wordCount);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }
}
