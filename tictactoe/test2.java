package tictactoe;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* 
Количество букв
- занести 10 строк с клавиатуры
- занести в список введенные строки, разделенные на символы
- сравнить каждый символ из списка strSToArray с каждым символом из спика alphabet
- если буквы совпадают, создать новый список и занести туда
- отсортировать получившееся списки по алфавиту(не понимаю как)
попыталась создать новый ArrayList, в который занесла получившееся списки. не получилось отсортировать по алфавиту
- вевести в консоль кол-во всех букв в виде (имя списка + " " + длина списка)
*/
public class test2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strSToArray = new ArrayList<>();
        for(int i = 0; i  < 1; i++){
            // вводим с клавиатуры 10 строк и заносим в массив букв strSToArray
            strSToArray.add(reader.readLine());
        }

        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        //str - strSToArray
        //alph - alphabet
        for(int str = 0; str < 32; str++){
            for(int alph = 0; alph < strSToArray.size(); alph++){
                if(strSToArray.get(str).equals(alphabet.get(alph))){
                    List<String> a1 = new ArrayList<String>(str);
                    System.out.println(alphabet.get(alph) + " " + a1.size());
                }
            }
        }
    }
}