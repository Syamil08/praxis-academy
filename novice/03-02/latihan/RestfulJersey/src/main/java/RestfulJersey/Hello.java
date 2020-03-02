package RestfulJersey;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class Hello{
    
    // method untuk memanggil TEXT_PLAIN
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello(){
        return "hello";
    }
    
    // method untuk menerima request jika XML dipanggil
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello(){
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
    }

    // method untuk menerima request jika HTML dipanggil
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello(){
        return "<html>" + "<title>" + "Hello Jersey" + "</title>" + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html>";
    }

}