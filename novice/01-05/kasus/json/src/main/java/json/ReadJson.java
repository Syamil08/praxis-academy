package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson
{

    public static void main(String[] args)
    {
        JSONParser jsonparser = new JSONParser();

        try{
            FileReader reader = new FileReader("/Users/syamil/Sites/praxis-academy/novice/01-05/kasus/universitas.json");

            // Membaca file json
            Object obj = jsonparser.parse(reader);

            JSONArray listuniv = new JSONArray();
            listuniv.add(obj);
            System.out.println(listuniv);
            
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch(ParseException e){
            e.printStackTrace();
        }
    }

}