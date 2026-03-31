import java.io.*;
import java.util.*;

 class Main5 {
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);
        Map<String, Integer> map = new HashMap<>();

        while (sc.hasNext()) {
            String word = sc.next();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        sc.close();
    }
}