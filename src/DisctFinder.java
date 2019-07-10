import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Write a program to find all distinct words from a text file. Ignore chars like ".,/-;:" and
Ignore case sensitivity.
*/
public class DisctFinder {

    public List<String> getDisct(String fileName){

        FileInputStream fileStream = null;
        DataInputStream dataStream = null;
        BufferedReader bReader = null;

        List<String> wordList = new ArrayList<String>();
        try {
            fileStream = new FileInputStream(fileName);
            dataStream = new DataInputStream(fileStream);
            bReader = new BufferedReader(new InputStreamReader(dataStream));
            String line = null;
            while((line = bReader.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, ",.;:\"/-");
                while(st.hasMoreTokens()){
                    String tmp = st.nextToken().toLowerCase();
                    if(!wordList.contains(tmp)){
                        wordList.add(tmp);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{if(bReader != null) bReader.close();}catch(Exception ex){}
        }

        return wordList;
    }


}
