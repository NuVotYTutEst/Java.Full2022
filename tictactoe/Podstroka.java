package tictactoe;

public class Podstroka {
    public static void main(String[] args) {
        String str = "qweeukfgeefrtysaee";
        String str1 = "";
        String max = "";
        int k = str.length(); //длина строки
        for (int i = 0; i <= k; i++) { //перебераеться строка
            char result1 = str.charAt(i);
            if (i == k - 2) { //равно ли предпоследнему
                if (str.charAt(i) != str.charAt(k-1)) { //предпоследнее не равно последнему
                    str1 += str.charAt(i); //добавляеться предпоследний
                    str1 += str.charAt(k-1); //добавляеться последний
                }
                    if (max.length() < str1.length()) { //сравниваеться самая большая подстрока с последней
                    	str1 += str.charAt(i);
                        max = str1;
                    }
                    break;
            }
            char result2 = str.charAt(i + 1); //второй символ по порядку
                if (result1 != result2) { //если не равны числа по порядку
                    str1 = str1 + str.charAt(i); //в переменую записываеться символ
                }
                if (result1 == result2) { //если одинавковые символы по порядку
                    str1 += str.charAt(i); 
                    if (max.length() < str1.length()) { //в главную переменую записываються символы
                        max = str1;
                    }
                    str1 = ""; //обновляеться переменая
                }
            }
        System.out.println(max);
        System.out.println(max.length());
        }
    }
