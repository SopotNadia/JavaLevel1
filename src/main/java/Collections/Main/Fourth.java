package Collections.Main;

import java.util.ArrayList;
import java.util.Comparator;

public class Fourth {
    public static void main(String[] args) {
        //Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
        ArrayList<String> listWithPoem = new ArrayList<>();
        listWithPoem.add("Я узнал что у меня");
        listWithPoem.add("Есть огромная семья");
        listWithPoem.add("Монитор, системный блок");
        listWithPoem.add("В сеть воткну я проводок...");
        listWithPoem.add("Windows, небо голубое");
        listWithPoem.add("Это всё моё, родное!");
        Comparator comparator = new Comparator<String>() {
            @Override
            public int compare(String  string, String otherString) {
                return string.length() - otherString.length();
            }
        };
        listWithPoem.sort(comparator);
        System.out.println(listWithPoem);
    }
}
