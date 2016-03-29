package testtxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        try{
            BufferedReader buf = new BufferedReader(new FileReader("C:\\Users\\Allen Yan\\Desktop\\day01.txt"));
            ArrayList<String> words = new ArrayList<>();
            String lineJustFetched = null;
            String[] wordsArray;

            while(true){
                lineJustFetched = buf.readLine();
                if(lineJustFetched == null){  
                    break; 
                }else{
                    wordsArray = lineJustFetched.split("\t");
                    for(String each : wordsArray){
                        if(!"".equals(each)){
                            words.add(each);
                        }
                    }
                }
            }

            for(String each : words){
                System.out.println(each);
            }

            buf.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}    