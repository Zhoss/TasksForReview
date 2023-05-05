package Denis;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TasksForInterviewDenis {
    public static void task1() {
        List<String> strings = new ArrayList<>(List.of("Объединение",
                "Статья",
                "Описание",
                "Пост",
                "Строй",
                "Отношение",
                "Проверка",
                "Месяц",
                "Принятие",
                "Ученик"));
        List<String> stringsWithoutFirstLetter = strings.stream()
                .map(e -> e.substring(1))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringsWithoutFirstLetter);
    }

    public static void task2() {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(10) + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 10) + 1);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length / 2; i++) {
            int c = numbers[i];
            numbers[i] = numbers[(numbers.length - 1) - i];
            numbers[numbers.length - 1 - i] = c;
        }
        System.out.println(Arrays.toString(numbers));

//        int[] ints = Arrays.copyOf(numbers, numbers.length);
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = ints[(numbers.length - 1) - i];
//        }
//        System.out.println(Arrays.toString(numbers));

//        int[] newNumbers = IntStream.rangeClosed(1, numbers.length)
//                .map(i -> numbers[numbers.length - i])
//                .toArray();
//        System.out.println(Arrays.toString(newNumbers));
    }

    public static void task5() {
        enum Transport {
            CAR("легковой автомобиль"),
            BUS("автобус"),
            TRUCK("грузовик");

            private final String type;

            Transport(String type) {
                this.type = type;
            }

            public String getType() {
                return type;
            }

        }
    }

    public static void task6() {
        class Student {
            String name;
            int age;

            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                Student student = (Student) o;
                return age == student.age && name.equals(student.name);
            }

            @Override
            public int hashCode() {
                return 31 * (name.hashCode() + age);
            }
        }
    }

    public static void task7() {
        try {
            IllegalArgumentException();
        } catch (IllegalArgumentException i) {
            System.out.println("exception = " + i.getMessage());
        }
    }

    public static void IllegalArgumentException() {
        throw new IllegalArgumentException("Исключение некорректного аргумента");
    }

    public static void task8() {
        iOexception();
    }

    public static void iOexception() {
        try {
            throw new IOException("Исключение input/output");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task9() {
        try {
            numberNotFoundException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void numberNotFoundException() throws Exception {
        class NumberNotFoundException extends Exception {
            public NumberNotFoundException(String message) {
                super(message);
            }
        }
        throw new NumberNotFoundException("Число не найдено");
    }

    public static void task10() {
        try {
            nullPointerException();
            classCastException();
        } catch (NullPointerException | ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void nullPointerException() {
        throw new NullPointerException("Исключение, вызванное вызовом метода у null");
    }

    private static void classCastException() {
        throw new ClassCastException("Исключение приведения одного класса к другому");
    }

    public static void task11() {
        String[] strings = new String[20];
        strings[0] = "депутат";
        strings[1] = "крест";
        strings[2] = "кровать";
        strings[3] = "природа";
        strings[4] = "концепция";
        strings[5] = "природа"; // повтор
        strings[6] = "кровать"; // повтор
        strings[7] = "оборудование";
        strings[8] = "план";
        strings[9] = "ученый";
        strings[10] = "рука";
        strings[11] = "еда";
        strings[12] = "окно";
        strings[13] = "природа"; // повтор
        strings[14] = "музей";
        strings[15] = "состояние";
        strings[16] = "план"; // повтор
        strings[17] = "действительность";
        strings[18] = "обеспечение";
        strings[19] = "план"; // повтор

        Set<String> stringSet = new LinkedHashSet<>(Arrays.asList(strings));
        StringBuilder sb = new StringBuilder();
        for (String str : stringSet) {
            sb.append(str).append("|");
        }
        System.out.println(sb);

        Stream<String> stream = Arrays.stream(strings);
        String result = stream.distinct()
                .collect(Collectors.joining("|"));
        System.out.println(result);
    }
}
