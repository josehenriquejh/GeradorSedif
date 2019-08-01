
package model;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class empresa {
    
   
    
    
    
   DataFormatter formatter = new DataFormatter();
   DataFormatter formatercnpj = new DataFormatter();

      

        
    
  
   
    private String nome;
    private String cnpj;
    private String cpf;
    private String codigo;
    private String ie;
    public empresa() {
    }
    
    public empresa(String nome, String cnpj,String cpf, String codigo, String ie){
    this.nome = nome;
    this.cnpj = cnpj;
    this.cpf = cpf;
    this.codigo = codigo;
    this.ie = ie;
        }

    public String getCnpj() {
        return cnpj;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    
    public String getIE(){
        return ie;}

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

     public void setIE(String ie) {
        this.ie = ie;
    }
     
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(int i,XSSFWorkbook wb) throws Exception {
       return (wb.getSheetAt(0).getRow(i).getCell(0)).toString();
    }

    public String getCnpj(int i,XSSFWorkbook wb) throws Exception { 
       //return Double.parseDouble(formatter.formatCellValue(wb.getSheetAt(0).getRow(i).getCell(1)));
       return formatter.formatCellValue(wb.getSheetAt(0).getRow(i).getCell(1));
     }

    public String getCpf(int i, XSSFWorkbook wb) throws Exception {
       return formatter.formatCellValue(wb.getSheetAt(0).getRow(i).getCell(2));
      }

    public String getCodigo(int i,XSSFWorkbook wb) throws Exception{ 
        return formatter.formatCellValue(wb.getSheetAt(0).getRow(i).getCell(3));
    }
    
    public String getIE(int i,XSSFWorkbook wb) throws Exception{ 
        return formatter.formatCellValue(wb.getSheetAt(0).getRow(i).getCell(4));
    }
}
