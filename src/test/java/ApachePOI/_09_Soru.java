package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Soru {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/merhaba123.xlsx";
        File dosya = new File(path);
        if (!dosya.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sayfa1");

            String merhaba = "Merhaba dünya";
            int enSonSatir = 0;
            Row yeniSatir = sheet.createRow(0);
            Cell yeniHucre1 = yeniSatir.createCell(0);
            yeniHucre1.setCellValue(merhaba);
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        }
        else{
            FileInputStream inputStream= new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(inputStream);
            Sheet sheet= workbook.getSheetAt(0);
            int enSonSatir= sheet.getPhysicalNumberOfRows();
            Row yeniSatir= sheet.createRow(enSonSatir);
            Cell yeniHucre= yeniSatir.createCell(0);
            yeniHucre.setCellValue("Merhaba Dünya"+(enSonSatir+1));
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        }

        System.out.println("İşlem Tamamlandı");
    }
}
