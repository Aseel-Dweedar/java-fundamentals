import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        flipNHeads(3);
        pluralize("dog", 1);
        clock();
    }
    public static void pluralize(String wordInput , int numberInput) {
        if (numberInput > 1 || numberInput == 0 )
            System.out.println("I own " + numberInput + " " + wordInput + "s" + ".");
        else
            System.out.println("I own " + numberInput + " " + wordInput + ".");
    }

    public static void flipNHeads( int n) {
        int counter = 0;
        int flips = 0;
        String result = "";
        while (n != counter) {
            double randomNumber = Math.random();
            if (randomNumber < 0.5 ){
                flips++;
                result = "tails";
                System.out.println(result);
            } else {
                if (result.equals("tails")){
                    counter = 0;
                }
                counter++;
                flips++;
                result = "heads";
                System.out.println(result);
            }
        }
        System.out.println("It took " + flips + " flips to flip " + n + "  heads in a row.");
    }

    public static void clock() {
        LocalDateTime nowDate = LocalDateTime.now();
        int second = nowDate.getSecond();
        while (true) {
            nowDate = LocalDateTime.now();
            if (nowDate.getSecond() - second == 1 || nowDate.getSecond() - second == -59) {
                second = nowDate.getSecond();
                String time = nowDate.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
            }
        }
    }
}