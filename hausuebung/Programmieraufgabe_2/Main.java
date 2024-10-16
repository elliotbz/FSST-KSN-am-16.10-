package hausuebung.Programmieraufgabe_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // 1.
        ArrayList<String> al = new ArrayList<>();

        al.add("It");
        al.add("was");
        al.add("a");
        al.add("stormy");
        al.add("night");

        System.out.println(al);

        // 2.
        al.add(3, "dark");
        al.add(4, "and");

        System.out.println(al);

        // 3.
        al.set(1, "IS");

        System.out.println(al);

        // 4.
        for(int i = 0; i < al.size(); i++){
            String s = al.get(i);
            if(s.contains("a")){
                al.remove(s);
                i--;
            }
        }

        System.out.println(al);

        System.out.println("Max Length: " + maxLength(al));

        // 6.
        for(String s : al){
            System.out.println(s.toUpperCase());
        }
    }

    // 5.
    public static int maxLength(ArrayList<String> al){
        int max = 0;
        for(String s : al){
            if(s.length() > max)
                max = s.length();
        }
        return max;
    }
}
