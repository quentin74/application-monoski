package fichier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

class LireLigne 
{
			
	
	//public static String Timestamp ="Timestamp";
	public static String P ="P";
	public static String T ="T";
	public static String H ="H";
	public static String AccX ="AccX";
	public static String AccY ="AccY";
	public static String AccZ ="AccZ";
	public  static String GyrX ="GyrX";
	public static String GyrY ="GyrY";
	public static String GyrZ ="GyrZ";
	public static String MagX ="MagX";
	public static String MagY ="MagY";
	public static String MagZ ="MagZ";
	public static long  times ;
	
	private static PrintWriter out;
	 static BufferedReader lecteurAvecBuffer = null;
	 BufferedReader EcritureFichier = null;
	
	
 public static void main(String[] argv) throws IOException
 {
	
	
	 
	 times =System.currentTimeMillis();
	 out = new PrintWriter("monfichier.sh");
	
	
   
	 String ligne;

   try
     {
	lecteurAvecBuffer = new BufferedReader(new FileReader(argv[0]));
     }
   catch(FileNotFoundException exc)
     {
	System.out.println("Erreur d'ouverture");
     }
  
   
  
   
   ligne = lecteurAvecBuffer.readLine();
   String s1;
   
int i;
i=0;
while ((s1 = lecteurAvecBuffer.readLine()) != null){
	try {
		
		 Thread.sleep(100L);    // one second
		
		}
	
		catch (Exception e) {}    
	times= System.currentTimeMillis();
	
	i++;
	 

	
	  //ton traitement par exemple ici avec ton fichier csv
	
	// chaque valeur du tableau str est une valeur de ta ligne ex: str[0]=M392060... Comme ça tu peux faire les traitements que tu veux
	
	
	String str[];
		str=s1.split("	");
			
	  // String s0 = str[0];
	   String s2 = str[0];
	   String s3 = str[1];
	   String s4 = str[2];
	   String s5 = str[3];
	   String s6 = str[4];
	   String s7 = str[5];
	   String s8 = str[6];
	   String s9 = str[7];
	   String s10 = str[8];
	   String s11 = str[9];
	   String s12 = str[10];
	   String s13 = str[11];
		  out.print("curl -X POST -d '"+" [{"+'"'+"name"+'"'+':'+'"'+"capteurs3"+'"'+','+'"'+"columns"+'"'+':'+'['+'"'+"time"+'"'+','+'"'+P+'"'+','+'"'+T+'"'+','+'"'+H+'"'+','+'"'+AccX+'"'+','+'"'+AccY+'"'+','+'"'+AccZ+'"'+','+'"'+GyrX+'"'+','+'"'+GyrY+'"'+','+'"'+GyrZ+'"'+','+'"'+MagX+'"'+','+'"'+MagY+'"'+','+'"'+MagZ+'"'+']'+','+'"'+"points"+'"'+':'+"[["+times+','+s2+','+s3+','+s4+','+s5+','+s6+','+s7+','+s8+','+s9+','+s10+','+s11+','+s12+','+s13+"]]"+'}'+']'+"' 'http://54.93.89.31:8086/db/monoski-data/series?u=quentin74100&p=monoski2015' \n\n");
		  out.print("echo ligne "+i+"\n");
	   
		 
	   System.out.println(times);
	  // System.out.println("curl -X POST -d ' [{");
	  // monFichier.writeChars(" curl -X POST -d '");
	  // System.out.println('"'+"name"+'"'+':'+'"'+"capeurs"+'"'+','+'"'+"columns"+'"'+':'+'['+'"'+P+'"'+','+'"'+T+'"'+','+'"'+H+'"'+','+'"'+AccX+'"'+','+'"'+AccY+'"'+','+'"'+AccZ+'"'+','+'"'+GyrX+'"'+','+'"'+GyrY+'"'+','+'"'+GyrZ+'"'+','+'"'+MagX+'"'+','+'"'+MagY+'"'+','+'"'+MagZ+'"'+']'+','+'"'+"points"+'"'+':'+'['+s2+','+s3+','+s4+','+s5+','+s6+','+s7+','+s8+','+s9+','+s10+','+s11+','+s12+','+s13+']'+'}'+']');
	  // monFichier.writeChars(" curl -X POST -d '"+" [{");
	  // out.print("echo "+s1+'\n');
		 System.out.println(times);
	//  out.print("curl -X POST -d '"+" [{"+'"'+"name"+'"'+':'+'"'+"capteurs3"+'"'+','+'"'+"columns"+'"'+':'+'['+'"'+P+'"'+','+'"'+T+'"'+','+'"'+H+'"'+','+'"'+AccX+'"'+','+'"'+AccY+'"'+','+'"'+AccZ+'"'+','+'"'+GyrX+'"'+','+'"'+GyrY+'"'+','+'"'+GyrZ+'"'+','+'"'+MagX+'"'+','+'"'+MagY+'"'+','+'"'+MagZ+'"'+']'+','+'"'+"points"+'"'+':'+"[["+s2+','+s3+','+s4+','+s5+','+s6+','+s7+','+s8+','+s9+','+s10+','+s11+','+s12+','+s13+"]]"+'}'+']'+"' 'http://54.93.89.31:8086/db/monoski-data/series?u=quentin74100&p=monoski2015' \n\n");
	  // monFichier.writeChars("' 'http://54.93.89.31:8086/db/monoski-data/series?u=quentin74100&p=monoski2015' \n");
	 
}
   
	//monFichier.writeChars("' 'http://54.93.89.31:8086/db/monoski-data/series?u=quentin74100&p=monoski2015'");
   lecteurAvecBuffer.close();
   
  
 }
 	
 
} 









