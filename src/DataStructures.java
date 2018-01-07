import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {

        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(22);
        myArray.add(35);
        myArray.add(44);

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Tati", 21);
        myMap.put("Ashley", 24);
        myMap.put("Kevin", 25);
        myMap.put("Darnell", 26);

        for (String name : myMap.keySet()) {
            System.out.println(name + " " + myMap.get(name));
        }

        System.out.println(canRentACar(myMap));


        ArrayList<Cat> myCats = new ArrayList<>();
        myCats.add(new Cat("Garfield"));
        myCats.add(new Cat("Fiona"));
        myCats.add(new Cat("Pink Panther"));
        myCats.add(new Cat("Melissa"));
        myCats.add(new Cat("Catwoman"));

        for (Cat name : myCats) {
            System.out.println(name.toString());

        }
        String[] myArray2 = {"Anne", "Lola", "Max"};
//        wordsWithoutList(myArray2, 3);

       sortSentence("How are you today?");
    }

    public static void mostFrequentElement(int[] myList) {
        int count = 0;
        int num = myList[0];

//            for (int i = 0; i < myList.size(); i++) {
//                System.out.println(myList.get(i));
//
//            }
//
//        }

    }

    public static boolean canRentACar(HashMap<String, Integer> myMap) {
        for (int age : myMap.values()) {
            if (age > 25) {
                return true;
            }
        }
        return false;
    }

//    public static List wordsWithoutList(String[] myArray, int x) {
//        List<String> myList = new ArrayList<>();
//
//        for (int i = 0; i < myArray.length; i++) {
//            myList.add(myArray[i]);
//            if (myArray[i].length() == x) {
//                myList.remove(myArray[i]);
//                System.out.println(myList);
//
//            }
//
//
//        }
//        return myList;
//
//    }

//    public static int countClumps(ArrayList<Integer> myList){
//
//    }

    public static void sortSentence(String sentence){
        List<String> myList = new ArrayList<>();
        for(String word : sentence.split("")){
            myList.add(word);
            System.out.println(myList);
        }

        }

    }





