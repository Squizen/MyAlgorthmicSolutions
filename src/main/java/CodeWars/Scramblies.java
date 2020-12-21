package CodeWars;

public class Scramblies {

    /*
    Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

    scramble('rkqodlw', 'world') ==> True
    scramble('cedewaraaossoqqyt', 'codewars') ==> True
    scramble('katas', 'steak') ==> False

    */
    public static void main(String[] args) {
        System.out.println(scramble("qwerty", "ytrewqq"));
    }
    public static boolean scramble(String letters, String word){
        boolean letterExistsInSetOfLetters = false;
        for (int i = 0; i < word.length(); i++) {
            letterExistsInSetOfLetters = false;
            for (int j = 0; j < letters.length(); j++) {
                if(word.charAt(i) == letters.charAt(j)){
                    letters = letters.substring(0, j) + letters.substring(j + 1);
                    letterExistsInSetOfLetters = true;
                    break;
                } else {
                    letterExistsInSetOfLetters = false;
                }
            }
            if(!letterExistsInSetOfLetters){
                return false;
            }
        }
        return true;
    }
}
