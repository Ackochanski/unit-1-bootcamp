/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {

        Person person = new Person();
        Person person1 = new Person();
        person.setName("Anne");
        person1.setName("Samantha");

        System.out.println(isOdd(24));
        System.out.println(multipleOfThree(27));
        System.out.println(isOddAndIsMultipleOfThree(30));
        System.out.println(isOddAndIsMultipleOfThree2(27));
        fizzMultipleOfThree(22);
        printName(person);
        printName(person1);
        System.out.println(caughtSpeeding(60, false));
        System.out.println(alarmClock(1,false));



    }

    public static boolean isOdd(int n) {
        if (n % 2 == 1) {
            return true;
        }
        return false;

    }

    public static boolean multipleOfThree(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if (n % 2 == 0 && n % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOddAndIsMultipleOfThree2(int n) {
        if (isOdd(n) && multipleOfThree(n)) {
            return true;
        }
        return false;
    }

    public static void fizzMultipleOfThree(int n) {
        if (multipleOfThree(n)) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    public static boolean fromLondon(Person a){
        if(a.getCity().equals("London")){
            return true;
        }
        return false;
    }

    public static void printName(Person a){
        if(a.getName().length() > 5){
            System.out.println(a);
        }else{
            System.out.println("Name is too short");
        }

    }

    public static boolean cigarParty(int cigars, boolean isWeekend){
        if(cigars >= 40 && cigars <= 60 || isWeekend){
            return true;
        }
        return false;

    }

    public static int caughtSpeeding(int speed, boolean isBirthday){
        if(speed >= 81 && !isBirthday){
            return 2;
        } else if (speed >= 61 && speed <= 80 && !isBirthday) {
            return 1;
        } else if(speed < 60 && !isBirthday){
            return 0;
        }else{
            return 0;
        }

    }
    public static String alarmClock(int day, boolean onVacation){
        int sun = 0;
        int[] weekdayArray = {1,2,3,4,5};
        int sat = 6;
        String timeToWakeUp = "";

        for (int i = 0; i < weekdayArray.length; i++) {
            if(day == weekdayArray[i] && !onVacation){
                timeToWakeUp = "7:00";
            } else if(day == sun || day == sat && !onVacation){
                timeToWakeUp = "10:00";
            } else if(day == weekdayArray[i] && onVacation){
                timeToWakeUp = "10:00";
            } else {
                timeToWakeUp = "off";
            }

        }
        return timeToWakeUp;
    }
}

