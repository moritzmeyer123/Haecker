package de.dhbw.rh.exceptions.haeckercode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputFile
{
    FileInputStream m_Fis;

    InputFile(String p_FileName) {
        try {
			m_Fis = new FileInputStream(p_FileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }

    String getLine()
    {
        int l_Char;
        StringBuffer l_Buffer = new StringBuffer();
        try {
	        do {
	            l_Char = m_Fis.read();
	            if (l_Char == '\n')             // UNIX new line
	                return l_Buffer.toString();
	            else if (l_Char == '\r') 
	            {      // Windows 95/NT new line
	                l_Char = m_Fis.read();
	                if (l_Char == '\n')
	                    return l_Buffer.toString();
	                else 
	                {
	                    l_Buffer.append('\r');
	                    l_Buffer.append((char)l_Char);
	                }
	            } 
	            else
	                l_Buffer.append((char)l_Char);
	        } 
	        while (l_Char != -1);
		} 
		catch(IOException ioe) {
        	ioe.printStackTrace();
        }

        return null;
    }
}