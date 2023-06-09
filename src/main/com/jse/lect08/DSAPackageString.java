package main.com.jse.lect08;

import java.util.*;
import java.io.*;

public class DSAPackageString {
    public static boolean validAnagramWay1(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] charArrStr1 = s1.toCharArray();
            char[] charArrStr2 = s2.toCharArray();
            Arrays.sort(charArrStr1);
            Arrays.sort(charArrStr2);
            return (Arrays.equals(charArrStr1, charArrStr2));
        }

    }

    public static boolean validAnagramWay2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < s1.length(); i++) {
                map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
                map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);

            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() != 0) {
                    return false;
                }
            }
            return true;

        }

    }

    public static boolean validAnagramWay3(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            int[] freqArray = new int[256];
            char[] charArr1 = s1.toLowerCase().toCharArray();
            char[] charArr2 = s2.toLowerCase().toCharArray();

            for (int i = 0; i < charArr1.length; i++) {
                freqArray[charArr1[i] - 'a']++;
                freqArray[charArr2[i] - 'a']--;
            }

            for (int i : freqArray) {
                if (i != 0) {
                    return false;
                }


            }
            return true;
        }
    }

    public static void findVowels(String str) {
        int counter = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                counter++;
        }
        System.out.println("Total vowels in the given String is:" + counter);
    }

    public static void reverseSentenceWords(String str) {
        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : strArray) {
            int high = s.length() - 1;
            StringBuilder sbTemp = new StringBuilder();

            while (high >= 0) {
                sbTemp.append(s.charAt(high--));
            }
            sb.append(sbTemp).append(" ");

        }
        System.out.println(sb.toString().trim());
    }

    public static void subStringRotated(String s1, String s2) {
        if(s1.length() != s2.length()){
            System.out.println("Strings differ in length");

        }else{
            String coupledStringS1 = s1 + s1;
            System.out.println(coupledStringS1.contains(s2));{
                System.out.println(coupledStringS1.contains(s2));

            }
        }

    }

    public static void csvReaderSorter() {
        List<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("student.csv"))) {
            if (!scanner.hasNextLine())
                System.out.println("No data found!");
            else
            while (scanner.hasNextLine()) {
                String stuLine = scanner.nextLine();
                if (!stuLine.equals("")) {
                    String[] line = stuLine.split(" ");
                    double gpa = Double.isNaN(Double.parseDouble(line[2])) ? 0 : Double.parseDouble(line[2]);
                    Student student = new Student(line[0], line[1], gpa);
                    students.add(student);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getLastName());
        }
    }

    public static void main(String... str) {
        System.out.println("Counting Vowels...");
        findVowels("Student@1d44bcfa");
        System.out.println("Rotated Substrings...");
        subStringRotated("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee");
        System.out.println("Reversing words in a sentence...");
        reverseSentenceWords("Java J2EE Reverse Me");
        System.out.println("Valid anagram if the strings contain only alphabets...");
        System.out.println(validAnagramWay3("gaurav", "varuaG"));
        System.out.println("Reading CSV file...");
        csvReaderSorter();
    }
}