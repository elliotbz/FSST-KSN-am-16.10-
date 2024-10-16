package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class ReadHtm {
    public static void main(String[] args){
        InputStream is=null;    //Varialbendeklaration auf dem Stack   // leere Referenz

        try{
            URL url = new URL("http://127.0.0.1/FSST/start.htm");
            //Verbindung zu Webserver über URL

            is = url.openStream();
            System.out.println(new Scanner(is).useDelimiter("\\Z").next());
            //stringweises auslesen des Streamobjektes bis zum Dateiende \Z
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{            //nicht unbedingt notwendig, unterer code auch ohne finally ausgeführt
            if(is!=null){   //Verbindung hergestellt
                try{        // Falls der Stream nicht schließbar ist (unnötig)
                    is.close(); 
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    
    }
}

// Test: grundsätzlich wissen, wie auf webserver dateien zugreifen
// wie können sie mit py/java programm verbindung über webserver erreichen, um im anschluss eine datei auszulesen und diese auf der systemkonsole auszugeben?
// Antwort: 1. Wir brauchen eine Verbindung zum Webserver über HTTP (Methoden: GET zum Lesen oder POST zum Senden). (auf die jeweilige Adresse)
// 2. Bei Python: bekommt Dateinobjekt zurück, Java holt einen Stream. -> Dateiobjekt oder Streamobjekt instanziieren
// 3. Zeilenweise auslesen oder Streamweise auslesen