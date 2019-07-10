import java.util.List;

public class Main {

    public static void main(String[] args) {
        DisctFinder disctFinder = new DisctFinder();

        String fileName = "C:/sample.txt";

        List<String> wordList = disctFinder.getDisct(fileName);
        for(String str:wordList){
            System.out.println(str);
        }
    }
}
