import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxUseHandler extends DefaultHandler
{
    boolean bFirstname = false;
    boolean bLastname = false;
    boolean bNickName = false;
    boolean bMarks = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {

        if(qName.equalsIgnoreCase("student"))
        {
            String rollNo = attributes.getValue("rollno");
            System.out.println("Roll No :" + rollNo);
        } else if(qName.equalsIgnoreCase("firstname")) {
            bFirstname = true;
        } else if(qName.equalsIgnoreCase("lastname")) {
            bLastname = true;
        } else if(qName.equalsIgnoreCase("nickname")) {
            bNickName = true;
        } else if(qName.equalsIgnoreCase("marks")) {
            bMarks = true;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException
    {
        if(qName.equalsIgnoreCase("student"))
        {
            System.out.println("End Element :" + qName);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException
    {
        if(bFirstname)
        {
            System.out.println("First Name :" + new String(ch,start,length));
            bFirstname = false;
        } else if(bLastname) {
            System.out.println("Last Name :" + new String(ch,start,length));
            bLastname = false;
        } else if(bNickName) {
            System.out.println("Nick Name :" + new String(ch,start,length));
            bNickName = false;
        } else if(bMarks){
            System.out.println("Marks :" + new String(ch,start,length));
            bMarks = false;
        }

    }
}
