import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int overTime = 5;

        NullableMap map = new NullableMap(new HashMap(), overTime);
        map.put(0, 1);
        map.put(1, 2);
        map.put(2, 3);

        System.out.println("Время до удаления данных: " + overTime + "секунд");

        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));

        System.out.println("Ждём 4 секунды");
        Thread.sleep(4000);

        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));

        System.out.println("Добавляем элемент, тем самым обновляя время до уничтожения и ждём 4 секунды");
        map.put(3, 4);
        Thread.sleep(4000);

        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        System.out.println("Ждём ещё 4 секунды и данные удаляются");
        Thread.sleep(4000);

        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        System.out.println("Добавляем элемент и данные снова востановились");
        map.put(4, 5);

        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
    }
}