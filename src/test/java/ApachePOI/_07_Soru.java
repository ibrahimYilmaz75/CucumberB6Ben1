package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_Soru {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/Carpim.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet= workbook.getSheetAt(0);

        int enSonSatir=0;// sheet.getPhysicalNumberOfRows();
        for (int i = 1; i <=10; i++) {
            Row yeniSatir=sheet.createRow(enSonSatir++);

            Cell hucre1= yeniSatir.createCell(0);hucre1.setCellValue(1);
            Cell hucre2= yeniSatir.createCell(0);hucre2.setCellValue("x");
            Cell hucre3= yeniSatir.createCell(0);hucre3.setCellValue(i);
            Cell hucre4= yeniSatir.createCell(0);hucre4.setCellValue("=");
            Cell hucre5= yeniSatir.createCell(0);hucre5.setCellValue(i*1);
        }
        fileInputStream.close();
        FileOutputStream outputStream= new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();
        System.out.println("işlem tamamlandı");
    }
}
