package oop;
import java.io.*;
import java.util.Scanner;
public class zak {
	    public static void main(String[] args) throws IOException {
	        File file = new File("c://Papka//файл.txt");
	        file.createNewFile();
	        System.out.println("Файл был создан");

	        FileWriter fileWriter = new FileWriter(file);
	        fileWriter.write("Волков М ");
	        fileWriter.write("\n");
	        fileWriter.write("Группа: ИС-219");
	        fileWriter.close();

	        System.out.println("Данные успешно сохранены");
	        FileReader fileReader = new FileReader(file);
	        Scanner scanner1 = new Scanner(fileReader);
	        System.out.println("Данные в файле: ");
	        while (scanner1.hasNextLine()){
	            System.out.println(scanner1.nextLine());
	        }
	        fileReader.close();
	    }
}
