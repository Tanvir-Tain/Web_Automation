package Excel_Technologies_Ltd.com.Excel_Technologies_Ltd;
import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.awt.print.Printable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


/**
 * Hello world!
 *
 */
public class App 
{
	static String csvFile = "E:\\SQA\\selenium revised\\practice\\sampleDataset.csv";
	
    public static void main( String[] args ) throws CsvValidationException, IOException
    {
    	CSVReader reader = new CSVReader(new FileReader(csvFile));
    	String[] cell;
    	while ((cell=reader.readNext())!=null)
    	{
    		for (int i=0 ; i<=cell.length ; i++) 
    		
    		{
    			String weightString  = cell[i+3];
    			String HightString  = cell[i+4];
    			String TemperatureString  = cell[i+5];
    			String SystolicString  = cell[i+6];
    			String DiastolictString  = cell[i+7];
    			String PulseString  = cell[i+8];
    			String RespiratoryRateString  = cell[i+9];
    			String OxygenString  = cell[i+10]; 
  			
    	System.out.print(weightString + " ");
    	System.out.print(HightString+ " ");
    	System.out.print(TemperatureString+ " ");
    	
    	break;
    			}
    		
    		System.out.print("new button ");
    		
    	
    	}
    	
    }
    
}
