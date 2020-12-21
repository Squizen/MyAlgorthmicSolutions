package OtherSolutions;

public class ReversingStrings {

    public static void main(String[] args) {
        System.out.println(reversingStringUsingRecursion("dupa"));
    }
    public static String reverseStringUsingLoop(String word){
        if(!word.isEmpty()){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = word.length()-1; i >= 0; i--) {
                stringBuilder.append(word.charAt(i));
            }
            return stringBuilder.toString();
        } else {
            return "This word is empty !";
        }
    }
    public static String reversingStringUsingRecursion(String word){
        if(word.isEmpty()){
            return word;
        } else {
            return reversingStringUsingRecursion(word.substring(1)) + word.charAt(0);
        }
    }
}
