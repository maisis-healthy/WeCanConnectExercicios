package pt.maisis.healthy.pps2.persistencerim;

import healthy.Archetype;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

/**
 * classe para leitura do campo body e escrita no campo data do arquétipo 
 * que está a ser consumido
 *
 * @author Carlos Cardoso <carlos.cardoso@maisis.pt>
 */
public class XMLfields {

    private Document xmlData;

    /**
     * *
     * O archetypeResponse é o arquétipo completo
     * 
     * @param archetypeResponse
     * @return Document
     */
    public Document setXMLfields(Archetype archetypeResponse) {
        try {
            xmlData = DocumentHelper.parseText(archetypeResponse.getData());
            //descubrir os nós a preencher 
            //
            return xmlData;
        } catch (DocumentException ex) {
            Logger.getLogger(XMLfields.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Document getXmlData() {
        return xmlData;
    }
}
