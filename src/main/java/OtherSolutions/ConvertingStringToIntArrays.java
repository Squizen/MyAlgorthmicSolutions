package OtherSolutions;

import java.util.StringTokenizer;

    /*
    This class has two solutions for converting String into one and two dimensional non-ragged arrays
    Author : Jakub Rucki
    */

public class ConvertingStringToIntArrays {

    public static void main(String[] args) {

        String someNumbers1D = "1 2 10 4 15 18";

        String someNumbers2D =
                "1 10 17 44\n" +
                "3 24 27 22\n" +
                "7 13 17 17";

        int[] tab1D = convertStringToOneDimensionalArray(someNumbers1D);
        System.out.println("1D Tab" );
        for (int index = 0; index < tab1D.length; index++) {
            System.out.print(tab1D[index] + " ");
        }

        System.out.println();
        System.out.println();

        int[][] tab2D = convertStringToTwoDimensionalArray(someNumbers2D);
        System.out.println("2D Tab");
        for (int rowIndex = 0; rowIndex < tab2D.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < tab2D[rowIndex].length; columnIndex++) {
                System.out.print(tab2D[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }

    public static int[] convertStringToOneDimensionalArray(String someNumbers1D){
        StringTokenizer tokenizerLengthCounter = new StringTokenizer(someNumbers1D, " ");
        int tableLength = 0;
        while(tokenizerLengthCounter.hasMoreElements()){
            tokenizerLengthCounter.nextToken();
            tableLength++;
        }
        StringTokenizer tokenizer = new StringTokenizer(someNumbers1D, " ");
        int[] tableOfIntegers = new int[tableLength];
        int index = 0;
        while(tokenizer.hasMoreElements()){
            tableOfIntegers[index] = Integer.parseInt(tokenizer.nextToken());
            index++;
        }
        return tableOfIntegers;
    }

    public static int[][] convertStringToTwoDimensionalArray(String someNumbers2D){
        StringTokenizer tokenizerComputeLengthOfRow = new StringTokenizer(someNumbers2D, " ");
        int lengthOfRow = 0;
        while(tokenizerComputeLengthOfRow.hasMoreElements()){
            lengthOfRow++;
            String elem = tokenizerComputeLengthOfRow.nextToken();
            if(elem.contains("\n")){
                break;
            }
        }
        StringTokenizer tokenizerComputeLengthOfColumn = new StringTokenizer(someNumbers2D, "\n");
        int lengthOfColumn = 0;
        while(tokenizerComputeLengthOfColumn.hasMoreElements()){
            lengthOfColumn++;
            tokenizerComputeLengthOfColumn.nextToken();
        }
        StringTokenizer tokenizer = new StringTokenizer(someNumbers2D, " ");
        int[][] tabOfNumbers = new int[lengthOfColumn][lengthOfRow];
        int row = 0;
        for (int rowLength = 0; rowLength < lengthOfRow; rowLength++) {
            String elem = tokenizer.nextToken();
            if(elem.contains("\n")){
                String[] twoElems = elem.split("\n");
                tabOfNumbers[row][rowLength] = Integer.parseInt(twoElems[0]);
                row++;
                tabOfNumbers[row][0] = Integer.parseInt(twoElems[1]);
                rowLength = 0;
            } else {
                tabOfNumbers[row][rowLength] = Integer.parseInt(elem);
            }
        }
        return tabOfNumbers;
    }
}
