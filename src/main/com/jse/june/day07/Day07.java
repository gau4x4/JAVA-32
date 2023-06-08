import java.util.*;
import java.io.*;
public class Day07{
    public static boolean validAnagramWay1(String s1,String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        else{
            char[] charArrStr1 = s1.toCharArray();
            char[] charArrStr2 = s2.toCharArray();
            Arrays.sort(charArrStr1);
            Arrays.sort(charArrStr2);
            return (Arrays.equals(charArrStr1,charArrStr2));
        }

    }

    public static boolean validAnagramWay2(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        else {
            Map<Character,Integer> map = new HashMap<>();

            for (int i = 0; i < s1.length(); i++) {
                map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
                map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);

            }
            int counter = 0;
            for (Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue()>0||entry.getValue()<0){
                    return false;
                }
            }
            return true;

        }

    }

    public static boolean validAnagramWay3(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
       else{
            int[] charArray = new int[26];

            for(int i = 0;i<s1.length();i++){
                charArray[s1.charAt(i) - 'a']++;
                charArray[s2.charAt(i) - 'a']--;
            }

            int counter = 0;
            for(int i:charArray){
                if(i > 0||i < 0){
                    return false;
                }


            }
            return true;
        }
    }

    public static void findVowels(String str){
        int counter = 0;
        for(char c:str.toLowerCase().toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                counter++;
        }
        System.out.println("Total vowels in the given String is:"+counter);
    }

    public static void reverseSentenceWords(String str){
        String[] strArray= str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s:strArray){
            int high = s.length()-1;
            StringBuilder sbTemp = new StringBuilder();

            while(high >= 0){
                sbTemp.append(s.charAt(high--));
            }
            sb.append(sbTemp+" ");

        }
        System.out.println(sb.toString().trim());
    }
    public static void subStringRotated(String s1, String s2){
        String coupledStringS1 = s1+s1;
        if(coupledStringS1.indexOf(s2) >= 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static void csvReaderSorter(){
        List<String> records = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("student.csv"))) {
            while (scanner.hasNextLine()) {
                records.add(scanner.nextLine());
            }
        }catch(Exception e){
            System.out.println(e);
        }
        for(String str:records){
            String[] line = str.split(" ");
            Student student = new Student(line[0],line[1],Double.valueOf(line[2]));
            students.add(student);
        }
        Collections.sort(students);
        for(Student student:students){
            System.out.println(student.getLastName());
        }
    }
    public static void main(String ...str){
        findVowels("Student@1d44bcfa");
        subStringRotated("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee");
        reverseSentenceWords("Java J2EE Reverse Me");
        System.out.println(validAnagramWay3("gaurav","varuag"));
        csvReaderSorter();
    }
}