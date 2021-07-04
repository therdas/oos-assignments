import java.util.Scanner;

public class WrittenRunner {
    public static void main(String[] args) {
        WrittenShow[] arr = new WrittenShow[3];

        arr[0] = new WrittenArticle("September 24 marks six years since the Indian Space Research Organisation’s (ISRO’s) Mangalyaan spacecraft – part of the Mars Orbiter Mission – entered into orbit around the red planet, making India the first Asian country to do so.", "ISRO’s Mangalyaan Orbiter Completes Six Years Around Mars", "Jatan Mehta");
        arr[1] = new WrittenPoem("Do not go gentle into that good night,\nOld age should burn and rage at close of day;\nRage, rage against the dying of the light.", "That Good Night", "Dylan Thomas");
        arr[2] = new WrittenQuote("We are trying to prove ourselves wrong as quickly as possible, because only in that way can we find progress.", "Richard Feynman's lectures", "Richard P. Feynman");

        for(WrittenShow i: arr) {
            System.out.println("\n\n");
            i.show();
        }
    }
}
