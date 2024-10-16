package array_list;

import java.util.ArrayList;

public class ArrayListWrapper {
    public static void main(String[] args){
        //Integer-ArrayList
        ArrayList<Integer> ali = new ArrayList<Integer>();
        //<int> funktioniert nicht, da int kein Objektdatentyp
        ali.add(4);     //Autoboxing, d.h. aus dem Integerwert 4 wird ein Objekt
        ali.add(44);
        int geloescht = ali.remove(1);  //2-tes Integer-Objekt wird gelöscht und zurückgeliefert
        //automatisches Unboxing, d.h. aus dem Integerobjekt wird wieder ein Integerwert
        System.out.println("Integer-Objekt: " + ali);

        //Ausgabe der 2-ten Integerzahl
        System.out.println("Gelöschte Zahl: " + geloescht);
        System.out.println("Gelöschte Zahl: " + ali.remove(0));
    }
}
