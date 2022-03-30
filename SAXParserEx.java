package enc;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class SAXParserEx {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		 SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		 File inputFile = new File("9919_1.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         Element root = doc.getDocumentElement();
   NodeList nodes = root.getChildNodes();
 Node item =   nodes.item(0);
 System.out.println(item.getNodeName()+" "+item.getNodeValue());
		    }

		}