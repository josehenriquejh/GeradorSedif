package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import model.empresa;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/

public class apachepoi {
	
	/*
    public static void readXLSXFile() throws IOException
    {
        InputStream ExcelFileToRead = new FileInputStream("E:\\Lista de Empresas Teste.xlsx");
        HSSFWorkbook  wb = new HSSFWorkbook(ExcelFileToRead);
        HSSFWorkbook test = new HSSFWorkbook(); 
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFRow row; 
        HSSFCell cell;
        Iterator rows = sheet.rowIterator();
        while (rows.hasNext())
        {	
            row=(HSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            while (cells.hasNext())
            {
                cell=(HSSFCell) cells.next();   
                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
                {
                //    System.out.print(cell.getStringCellValue()+" ");
                }
                else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
                {
                //    System.out.print(cell.getNumericCellValue()+" ");
                }
                else
                {
                }
            }
            
        }
        System.out.println(wb.getSheetAt(0).getRow(9).getCell(5));
        //wb.getSheetAt(0).getRow(9).getCell(4);
        
    }   */
    //mes, ano, numero do id da empresa no excel
    
    public static int getlines() throws Exception{
        InputStream ExcelFileToRead = new FileInputStream("E:\\Lista de Empresas Teste.xlsx");
        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
        XSSFRow row;
        XSSFCell cell;
        XSSFSheet sheet = wb.getSheetAt(0);
        Iterator rows = sheet.rowIterator();
        
       int lines = 0;
        while (rows.hasNext())
        {	
            row=(XSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            lines++;
            cell=(XSSFCell) cells.next();
            System.out.println(cell.getStringCellValue()+" ");
           
              if (cell.toString().trim().isEmpty()) {
              break;}             
            
       }
        
    return lines;
    }
 
    
    
    
    public static String getdata(int m, int a, int idempresa) throws Exception{
    	InputStream ExcelFileToRead = new FileInputStream("E:\\Lista de Empresas Teste.xlsx");
        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
        
        return (wb.getSheetAt(0).getRow(idempresa+1).getCell(((a - 2016)*12) + m + 5)).toString();
    }
    
    public void setdata(int m, int a, int idempresa) throws Exception{
    	InputStream ExcelFileToRead = new FileInputStream("E:\\Lista de Empresas Teste.xlsx");
        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
        XSSFSheet sheet = wb.getSheetAt(0);
        
        Row row = sheet.getRow(idempresa+1);
        Cell cell = row.getCell(((a - 2016)*12) + m + 5);
        
        if (cell == null) {
            cell = row.createCell(((a - 2016)*12) + m + 5);
        }
        //cell.setCellType(Cell.CELL_TYPE_STRING);
        cell.setCellValue("X");
        //cell.setCellType(CellType.STRING);

        //cell.setCellFormula("");
        
        try (FileOutputStream fos = new FileOutputStream("E:\\Lista de Empresas Teste.xlsx")) {
            wb.write(fos);
        }
    }
    
    //T = Preenchido e Tansmitido, X = Preenchido.
    public boolean consultar(int m, int a, int idempresa) throws Exception{
    	try{    return getdata(m, a ,idempresa).equals("T")||getdata(m, a, idempresa).equals("X");
} catch (Exception e){
    		return false;
    	}
    		    	
    }
   
        public static String consultarempresa() throws Exception{
        InputStream ExcelFileToRead = new FileInputStream("E:\\Lista de Empresas Teste.xlsx");
        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
        
        return (wb.getSheetAt(0).getRow(0).getCell(0)).toString();
   
    }
        
        public static int consultarcnpj() throws Exception{
        InputStream ExcelFileToRead = new FileInputStream("E:\\Lista de Empresas Teste.xlsx");
        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
        
        return (int) (wb.getSheetAt(0).getRow(0).getCell(1)).getNumericCellValue();
   
    }
        public static int consultarcpf() throws Exception{
        InputStream ExcelFileToRead = new FileInputStream("E:\\Lista de Empresas Teste.x");
        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
        
        return (int) (wb.getSheetAt(0).getRow(0).getCell(2)).getNumericCellValue();
   
    }
        public int consultarcodigo() throws Exception{
        InputStream ExcelFileToRead = new FileInputStream("E:\\Lista de Empresas Teste.xlsx");
        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
        
        return (int) (wb.getSheetAt(0).getRow(0).getCell(3)).getNumericCellValue();
   
    }
      public ArrayList consultar() throws Exception{
       ArrayList<empresa> resultado = new ArrayList<>();
       // formatter = new DataFormatter();ArrayList<String> a = new ArrayList<String>()

       InputStream ExcelFileToRead = new FileInputStream("E:\\Lista de Empresas Teste.xlsx");
       XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
       XSSFRow row;
       XSSFSheet sheet = wb.getSheetAt(0);
       Iterator rows = sheet.rowIterator();
       XSSFCell cell;
       /*
       while(rows.hasNext()){
       row=(HSSFRow) rows.next();
       empresa e = new empresa();
       e.setNome((wb.getSheetAt(0).getRow(1).getCell(0)).toString());
       e.setCnpj(formatter.formatCellValue(wb.getSheetAt(0).getRow(1).getCell(1)));
       e.setCodigo(formatter.formatCellValue(wb.getSheetAt(0).getRow(1).getCell(2)));
       e.setCpf(formatter.formatCellValue(wb.getSheetAt(0).getRow(1).getCell(3)));
       resultado.add(e);
       }
      */
       
      int lines = 0;
        while (rows.hasNext())
        {	
            row=(XSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            lines++;
            cell=(XSSFCell) cells.next();
            empresa e = new empresa();
            e.setNome((wb.getSheetAt(0).getRow(1).getCell(0)).toString());
            e.setCnpj(String.valueOf(wb.getSheetAt(0).getRow(1).getCell(1)));
            e.setCodigo(String.valueOf(wb.getSheetAt(0).getRow(1).getCell(2)));
            e.setCpf(String.valueOf(wb.getSheetAt(0).getRow(1).getCell(3)));
            e.setIE(String.valueOf(wb.getSheetAt(0).getRow(1).getCell(4)));
            resultado.add(e);
            
              if (cell.toString().trim().isEmpty()) {
              break;}             
            
       } 
       
          System.out.println(lines+" Linhas.");
      //
       return resultado;
      }  
   
}