import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserStudent
{

    public static void main(String[] args)
    {
        
        try
        {
            File inputFile = new File("students.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("------------------------------");

            for(int temp = 0; temp < nList.getLength(); temp++)
            {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if(nNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no :" + eElement.getAttribute("rollno"));
                    System.out.println("First name :" + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last name :" + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Nick name :" + eElement.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Marks :" + eElement.getElementsByTagName("marks").item(0).getTextContent());
                }
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}