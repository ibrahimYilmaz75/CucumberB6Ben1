package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**

 Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 bulup ve sonucun döndürülmesi için metod kullanınız.
 src/test/java/ApachePOI/resources/LoginData.xlsx*/
public class _05_Soru {
    public static void main(String[] args) throws IOException
    {

        Scanner scanner= new Scanner(System.in);
        String path= "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        System.out.print("Aranacak kelime = ");
        String aranacakKelime= scanner.nextLine();

        String donenData= ExceldenGetir(aranacakKelime, path);
        System.out.println("donenData = " + donenData);

    }
    public static String ExceldenGetir(String aranacakKelime, String path) throws IOException {
        String donecekData="";

        FileInputStream inputStream= new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranacakKelime)){

                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    donecekData = donecekData +" "+ sheet.getRow(i).getCell(j);
                }
            }
        }

        return donecekData;

    }
}
