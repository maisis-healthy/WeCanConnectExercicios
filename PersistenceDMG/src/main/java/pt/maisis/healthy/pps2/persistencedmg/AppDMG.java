/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.maisis.healthy.pps2.persistencedmg;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import healthy.PersonArchetype;
import healthy.rim.Person;
import healthy.rim.Role;
import healthy.rim.type.AD; 
import healthy.rim.type.AddressPurpose;
import healthy.rim.type.AddressType;
import healthy.rim.type.EN; 
import healthy.rim.type.EntityNamePurpose;
import healthy.rim.type.EntityNameType;
import healthy.rim.type.II; 
import healthy.rim.type.IVL; 
import healthy.rim.type.TEL; 
import healthy.rim.type.TS; 
import healthy.rim.type.TelecomEquipment;
import healthy.rim.type.TelecomPurpose;
import healthy.rim.type.TelecomType;

/**
 *
 * @author Carlos Cardoso <carlos.cardoso@maisis.pt>
 */
public class AppDMG {

    public static void main(String[] args) {

        // Entity
        // instanciar a classe Person do EntityAPI
        // IDS
        
        //NAMES
       
        //ADDRESSES 
        
        // TELECOMS 
        
        // ROLES - quando utente ou paciente
        // instanciar a classe Role do EntityAPI
        // IDS 
       
        //NAMES
       
        //ADDRESSES 
       
        // TELECOMS  
        
        //adicionar a role ao entity 
        
        //Instancia PersonArchetype será necessário passar o entity preenchido
        //descomentar 
//        PersonArchetype personArchetype = new PersonArchetype(object);
        
        
        //seriço para a persistencia
        // onde é passado o personArchetype
        try {
            Client client = Client.create();
            WebResource webResourceDmgRim = client.resource("http://healthy.oobian.com/EntityManager/webresources/person");
            ClientResponse response;
            //descomentar quando tiverem o objeto PersonArchetype preenchido
//            response = webResourceDmgRim.type("application/xml").post(ClientResponse.class, personArchetype);
//            System.out.println("Server Response: " + response.getStatus());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
