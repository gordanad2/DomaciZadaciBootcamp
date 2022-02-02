package domaci9Nedelja;

import java.io.IOException;

public class SumaIzExcelTabele {
    public static void main(String[] args) throws IOException {

        ExcelReader excelReader = new ExcelReader("C:\\Users\\Goca\\IdeaProjects\\SelenijumProjekat\\src\\test\\java\\domaci9Nedelja\\Brojevi.xlsx");
        try {
            double suma = 0;
            for (int i = 1; i <= excelReader.getLastRow("Brojevi1"); i++) {
                int n = excelReader.getIntegerData("Brojevi1", i, 0);
                suma += n;
            }
            System.out.println("Suma svih brojeva u tabeli je: " + suma);
        }
        catch(IllegalStateException ise){
            System.out.println(ise.getMessage());
        }

    }
}
