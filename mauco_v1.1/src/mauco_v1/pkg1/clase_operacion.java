package mauco_v1.pkg1; 
import formularios.frm_inicio;

import java.io.*; 
import jxl.*;

public class clase_operacion {
    
    public String rut="";
    public String respuesta1="";
    public String respuesta2="";
    public String respuesta3="";
    public String respuesta4="";

   
    private static String e_salud="C:\\Program Files (x86)\\mauco_verificador\\bd\\mauco encuesta_salud.xls";
    private static String f1f2="C:\\Program Files (x86)\\mauco_verificador\\bd\\mauco f1f2.xls";
    private static String v30="C:\\Program Files (x86)\\mauco_verificador\\bd\\mauco v30.xls";
    private static String examenes="C:\\Program Files (x86)\\mauco_verificador\\bd\\mauco resultados_examen.xls";
    
    
    public void setRut(String rut) {
        this.rut = rut;
    }

   
    public void limpiar(){
this.respuesta1="";
this.respuesta2="";
this.respuesta3="";
this.respuesta4="";
this.rut="";

}
    
    //frm_inicio inicio = new frm_inicio();
    
    public void e_salud(){
    //String respuesta="";
    try { 
Workbook archivoExcel = Workbook.getWorkbook(new File(this.e_salud)); 
    for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++){  
Sheet hoja = archivoExcel.getSheet(sheetNo); 
int numFilas = hoja.getRows(); 
String data; 
for (int fila = 1; fila < numFilas; fila++) {
int columna =6;
data = hoja.getCell(columna, fila).getContents(); 
    
if (data.equalsIgnoreCase(rut)){
    
  respuesta1="Se realizó: Encuesta de Salud -- "+ hoja.getCell(0, fila).getContents()+"\n";
}

} 
    }
//System.out.println(respuesta1);

} catch (Exception ioe) { 
ioe.printStackTrace(); 
}
} 
    
     public void f1f2(){
    //String respuesta="";
    try { 
Workbook archivoExcel = Workbook.getWorkbook(new File(this.f1f2)); 
    for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++){  
Sheet hoja = archivoExcel.getSheet(sheetNo); 
int numFilas = hoja.getRows(); 
String data; 
for (int fila = 1; fila < numFilas; fila++) {
int columna =6;

data = hoja.getCell(columna, fila).getContents(); 
//System.out.println(data+"---"+rut);
if (data.equalsIgnoreCase(rut)){
    
respuesta2="Se realizó: F1-F2 -- "+ hoja.getCell(0, fila).getContents()+"\n";

}

}  
    }
    

} catch (Exception ioe) { 
ioe.printStackTrace(); 
}//return respuesta2;
}
    
      public void v30(){
    //String respuesta="";
    try { 
Workbook archivoExcel = Workbook.getWorkbook(new File(this.v30)); 
    for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++){  
Sheet hoja = archivoExcel.getSheet(sheetNo); 
int numFilas = hoja.getRows(); 
String data; 
for (int fila = 1; fila < numFilas; fila++) {
int columna =6;

data = hoja.getCell(columna, fila).getContents(); 
//System.out.println(data+" - "+this.rut);
if (data.equalsIgnoreCase(rut)){
respuesta3="Se realizó: V 3.0 -- "+ hoja.getCell(0, fila).getContents()+"\n";
}

}  
    }
    //System.out.println(respuesta3);

} catch (Exception ioe) { 
ioe.printStackTrace(); 
}//return respuesta3;
}
      
      public void examenes(){

    
    try { 
Workbook archivoExcel = Workbook.getWorkbook(new File(this.examenes)); 
    for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++){  
        Sheet hoja = archivoExcel.getSheet(sheetNo); 
        int numFilas = hoja.getRows(); 
        String data; 
        for (int fila = 1; fila < numFilas; fila++) {
            int columna =1;
            data = hoja.getCell(columna, fila).getContents(); 
            if (data.equalsIgnoreCase(rut)){
                respuesta4="El Participante se realizó examenes\n";
                }
            
        }          
}
    
} catch (Exception ioe) { 
ioe.printStackTrace(); 
} 
 //return respuesta4;
 
}
public void main() { 
        e_salud();
        f1f2();
        v30();
        examenes();
        
   } 
}