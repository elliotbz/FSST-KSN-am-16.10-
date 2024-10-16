package array_list;

import java.util.ArrayList;

public class ArrayListIO {
    public static void main(String[] args){
        ArrayList<String> als = new ArrayList<String>();
        //ArrayList mit 10 Elementen, die alle vom Typ String sind
        //schneller: ArrayList<String> als = new ArrayList<>();

        als.add("2BHELS");
        als.add("3BHELS");

        System.out.println("Abgeschlossene Jahrgänge: " + als); //nur ArrayList-Name => automatisch toString()

        als.add(0, "1BHELS");   //an 1. Position neues Element hinzufügen
        als.remove("3BHELS");
        als.remove(1);                  //String an 2. Position löschen

        als.set(0, "4BHELS");
                
        System.out.println("Abgeschlossene Jahrgänge: " + als);
        System.out.println("ArrayList-Elementeanzahl: " + als.size());
        System.out.println("An welcher Stelle kommt die 3BHELS vor? " + (als.indexOf("3BHELS")+1));

        //Ziel: Gesamtlänge aller Jahrgangsstrings der ArrayList

        int sum = 0;

        // for(int i = 0; i < als.size(); i++){
        //     String s = als.get(i);
        //     sum = sum + s.length();
        // }
        //Alternative besondere for-Schleife mit 2 Zeilen
        for(String s : als)
            sum += s.length();

        System.out.println(sum);

    }
}
