import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxMain
{

    public static void main(String[] args)
    {

        try{
           File inputFile = new File("SaxParserStudents.xml");
           SAXParserFactory factory = SAXParserFactory.newInstance();
           SAXParser saxParser = factory.newSAXParser();
           SaxUseHandler saxUseHandler = new SaxUseHandler();
           saxParser.parse(inputFile, saxUseHandler);
        } catch(Exception e){
            e.printStackTrace();
        }

    }

}