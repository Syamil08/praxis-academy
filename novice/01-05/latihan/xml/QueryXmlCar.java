import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class QueryXmlCar
{

    public static void main(String[] args)
    {
        
        try
        {
            File inputFile = new File("cars.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("supercars");
            System.out.println("--------------------------------");

            for(int temp = 0; temp < nList.getLength(); temp++)
            {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if(nNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) nNode;
                    System.out.println("Company :" + eElement.getAttribute("company"));
                    
                    // Node untuk mengambil nama mobil yang ada 
                    NodeList carNameList = eElement.getElementsByTagName("carname");

                    // perulangan untuk mengambil semua list nama mobil yang ada
                    for(int count = 0; count < carNameList.getLength(); count++)
                    {
                        Node node1 = carNameList.item(count);
                        
                        if(node1.getNodeType() == Node.ELEMENT_NODE)
                        {
                            Element car = (Element) node1;
                            System.out.println("Car name :" + car.getTextContent());
                            System.out.println("Car type :" + car.getAttribute("type"));
                        }
                    }
                }
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}