package Igor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskForInterviewIgor {

    public static void task20() {
        System.out.println();
        System.out.println("Задание 20");
        bar();
    }

    static void bar() {
        int x;
        int[] nums = {1, 2, 3};
        for (x = 0; x < nums.length; x++) {
            x += nums[x];
        }
        System.out.println(x);
    }

    public static void task21() {

        System.out.println();
        System.out.println("Задание 21");
        foo();
    }

    static void foo() {
        String m = "Hello";
        System.out.print(m);
        bar(m);
        System.out.print(m);
    }

    static void bar(String m) {
        m += " World!";
    }

    public static void task22() {

        System.out.println();
        System.out.println();
        System.out.println("Задание 22");
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("s1 == s3 ? " + (s1 == s3));
        System.out.println("s1 equals s3 ? " + (s1.equals(s3)));
    }

    //task23
    public abstract static class OurAbstractClass {
        public OurAbstractClass() {
            System.out.println("This is abstract class constructor");
        }
    }

    static class OurDemoClass extends OurAbstractClass {
        public OurDemoClass() {
            System.out.println("This is demo class constructor");
        }

        public static void main(String[] args) {
            OurDemoClass ourDemoClass = new OurDemoClass();
        }
    }

    public static void task26() {

        System.out.println();
        System.out.println("Задание 26");

        //слова, которые ищем в строке
        String first = "первый";
        String second = "второй";
        String third = "третий";
        String forth = "четвёртый";

        // хешмапа слов, которые ищем в строке
        HashMap<String, Integer> wordsForFinding = new HashMap<>();
        wordsForFinding.put(first, 0);
        wordsForFinding.put(second, 0);
        wordsForFinding.put(third, 0);
        wordsForFinding.put(forth, 0);

        //строка, в которой ищем нужные слова
        String text = first + " " + second + " " + third + " " + first + " " + second + " " + first;
        System.out.println("text = " + text);

        //хэшмапа слов в строке, в которой ищем нужные слова
        HashMap<Integer, String> inputWords = new HashMap<>();

        String[] words = text.split(" ");//разделяем слова в строке
        for (int i = 0; i < words.length; i++) {
            inputWords.put(i, words[i]);//заполняем хэшмапу словами из строки
        }
        System.out.println("inputWords = " + inputWords);
        System.out.println("wordsForFinding = " + wordsForFinding);

        //считаем количество найденных слов в исходной строке и выводим на экран
        for (Map.Entry<String, Integer> word : wordsForFinding.entrySet()) {
            for (String value : inputWords.values()) {
                if (word.getKey().equals(value)) {
                    Integer count = word.getValue();
                    count++;
                    word.setValue(count);
                }
            }
            System.out.println(word);
        }
    }

    public static void task27() {

        System.out.println();
        System.out.println("Задание 27");
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "first");
        hashMap.put(2, "second");
        hashMap.put(3, "third");
        hashMap.put(4, "forth");
        hashMap.put(5, "fifth");

        System.out.println("hashMap = " + hashMap);

        Iterator<Map.Entry<Integer, String>> itr = hashMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("entry = " + entry);

        }

        for (Map.Entry<Integer, String> integerStringEntry : hashMap.entrySet()) {
            System.out.println("integerStringEntry = " + integerStringEntry);
        }
    }
}
