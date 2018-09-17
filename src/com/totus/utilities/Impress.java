/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totus.utilities;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

/**
 *
 * @author Mikaelo
 */
public class Impress {
    
    public void impress(String dato) throws PrintException{
        String comando = "N\n"
            + "B035,40,0,1,4,4,100,S,\""+dato+"\"\n"
            + "A080,150,0,1,2,1,N,\""+dato+"\"\n"
            + "P1\n";

        PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
        PrintService printService = null;
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        PrintService[] pservices =
                         PrintServiceLookup.lookupPrintServices(flavor, aset);
        for(PrintService p : pservices){
            if(p.getName().startsWith("ZDesigner")){
                printService = p;
            }
        }
        
        Doc doc = new SimpleDoc(comando.getBytes(), flavor, null);
        DocPrintJob docPrintJob = printService.createPrintJob();

        docPrintJob.print(doc, null);

    }
}
