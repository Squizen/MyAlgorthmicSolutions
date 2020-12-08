package OtherSolutions;

public class NumberConverter {

    /*
        This class has solutions for converting positive numbers between systems without broker methods
        Author : Jakub Rucki

        decimal -> binary
        binary -> decimal

        binary -> octal
        octal -> binary

        octal -> decimal
        decimal -> octal



    */
    public static void main(String[] args) {

//        System.out.println(convertDecimalIntoBinary(7));
//        System.out.println(convertBinaryIntoDecimal("110111"));

        System.out.println(convertBinaryIntoOctal("1011011"));
        System.out.println(convertOctalToBinary("16"));

        System.out.println(convertOctalToDecimal("7014"));

        System.out.println(convertDecimalToOctal(327));


    }

    // decimal -> binary
    public static String convertDecimalIntoBinary(long number){
        if(number < 0){
            return "Wrong input";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(number != 0){
            if(number % 2 == 0){
                stringBuilder.append("0");
                number /= 2;
            } else {
                stringBuilder.append("1");
                number /= 2;
            }
        }
        stringBuilder.reverse();
        if(stringBuilder.length() == 0){
            return "0";
        }
        return stringBuilder.toString();
    }

    // binary -> decimal
    public static long convertBinaryIntoDecimal(String binaryNumber){
        StringBuilder stringBuilder = new StringBuilder(binaryNumber);
        stringBuilder.reverse();
        char[] binaryNumberInArr = stringBuilder.toString().toCharArray();
        int result = 0;
        for (int i = 0; i < binaryNumberInArr.length; i++) {
            if(binaryNumberInArr[i] == '0' || binaryNumberInArr[i] == '1'){
                if(Character.getNumericValue(binaryNumberInArr[i]) == 1){
                    result += Math.pow(2, i);
                }
            } else {
                return -1;
            }
        }
        return result;
    }

    // binary -> octal
    public static String convertBinaryIntoOctal(String binaryNumber){
        StringBuilder stringBuilder = new StringBuilder(binaryNumber);
        char[] binaryNumberInArr = stringBuilder.reverse().toString().toCharArray();

        double parts = (double) binaryNumber.length() / 3;
        int index = 0;
        StringBuilder resultAsString = new StringBuilder();
        for (int i = 0; i <= parts; i++) {
            int result = 0;
            for (int j = 0; j < 3; j++) {
                if(index <= binaryNumberInArr.length -1){
                    if(binaryNumberInArr[index] == '0' || binaryNumberInArr[index] == '1'){
                        if(Character.getNumericValue(binaryNumberInArr[index]) == 1){
                            result += Math.pow(2, j);
                        }
                        index++;
                    } else {
                        return "Wrong input";
                    }
                }
            }
            resultAsString.append(result);
        }
        resultAsString = resultAsString.reverse();
        for (int i = 0; i < resultAsString.length(); i++) {
            if(resultAsString.toString().charAt(i) == '0'){
                resultAsString = new StringBuilder(resultAsString.substring(i+1, resultAsString.length()));
                i = -1;
            } else {
                break;
            }
        }
        if(resultAsString.toString().isEmpty()){
            return "0";
        } else {
            return resultAsString.toString();
        }
    }

    // octal -> binary
    public static String convertOctalToBinary(String octalNumber){
        StringBuilder stringBuilder = new StringBuilder(octalNumber).reverse();
        char[] octalInArr = stringBuilder.toString().toCharArray();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < octalInArr.length; i++) {
            if(octalInArr[i] >= '0' && octalInArr[i] <= '8'){
                StringBuilder tempResult = new StringBuilder();
                int number = Character.getNumericValue(octalInArr[i]);
                while(number != 0){
                    if(number % 2 == 0){
                        tempResult.append("0");
                    } else {
                        tempResult.append("1");
                    }
                    number /= 2;
                }
                for (int j = tempResult.length(); j < 3; j++) {
                    tempResult.append("0");
                }
                result.append(tempResult);
            } else {
                return "Wrong input";
            }
        }
        if(!result.toString().contains("1")){
            return "0";
        } else {
            result = result.reverse();
            for (int i = 0; i < result.length(); i++) {
                if(result.toString().charAt(i) == '0'){
                    result = new StringBuilder(result.substring(i+1, result.length()));
                    i = -1;
                } else {
                    break;
                }
            }
            return result.toString();
        }
    }

    // octal -> decimal
    public static long convertOctalToDecimal(String octalNumber){
        StringBuilder stringBuilder = new StringBuilder(octalNumber);
        char[] octalInArr = stringBuilder.reverse().toString().toCharArray();
        long result = 0;
        for (int i = 0; i < octalInArr.length; i++) {
            if(octalInArr[i] >= '0' && octalInArr[i] <= '8'){
                result += Character.getNumericValue(octalInArr[i]) * Math.pow(8, i);
            } else {
                return -1;
            }
        }
        return result;
    }

    // decimal -> octal
    public static String convertDecimalToOctal(long decimalNumber){
        if(decimalNumber > 0){
            double highestPower = 0;
            int pow = 0;
            while(highestPower < decimalNumber){
                highestPower = Math.pow(8, pow);
                if(highestPower > decimalNumber){
                    highestPower = Math.pow(8,--pow);
                    break;
                } else {
                    pow++;
                }
            }

            int mod = 0;
            int whole = 0;
            StringBuilder stringBuilder = new StringBuilder();
            do{
                mod = (int) decimalNumber % (int) highestPower;
                whole = (int) decimalNumber / (int) highestPower;
                decimalNumber = mod;
                stringBuilder.append(whole);
                highestPower = Math.pow(8, --pow);
            }while(mod != 0);
            return stringBuilder.toString();
        } else if (decimalNumber == 0){
            return "0";
        } else {
            return "Wrong input";
        }
    }


}
