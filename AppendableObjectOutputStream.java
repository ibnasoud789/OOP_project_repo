/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ottprojectf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Asif
 */
public class AppendableObjectOutputStream extends ObjectOutputStream{
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
        }
     @Override
         protected void writeStreamHeader() throws IOException { 
        
    }
    
}
