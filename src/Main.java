import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Написать метод, проверяющий что в слове все буквы уникальные (не повторяются).   Строка состоит только из букв,
без пробелов. При решении использовать HashSet.
public static boolean isUnique (String word)
Hello -> false
World -> true
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isUnique("hello"));
        System.out.println(isUnique("world"));
    }

    public static boolean isUnique (String word){
        word = word.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char ch:word.toCharArray()){
            if(!set.add(ch)){
                return false;
            }
        }
        return true;
    }

}

