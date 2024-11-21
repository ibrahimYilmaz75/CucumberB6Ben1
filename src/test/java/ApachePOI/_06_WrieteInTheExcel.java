package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WrieteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet= workbook.getSheetAt(0);
        int enSonSatir= sheet.getPhysicalNumberOfRows();
        Row yeniSatir= sheet.createRow(enSonSatir);
        Cell yeniHucre= yeniSatir.getCell(0);

        yeniHucre.setCellValue("Merhaba dünya");
        fileInputStream.close();


        FileOutputStream outputStream= new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();

        System.out.println("İşlem tamamlandı");

    }
}
