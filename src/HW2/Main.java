package HW2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arrayNumbers = {
                {"11", "22", "33", "44"},
                {"55", "66", "77", "88"},
                {"99", "111", "222", "333"},
                {"444", "555", "666", "777"}
        };

        String[][] wrongArrayNumbersE1 = {
                {"11", "22", "33", "44"},
                {"55", "66", "77", "88"},
                {"99", "111", "222", "333"},
                {"444", "555", "test", "777"}
        };

        String[][] wrongArrayNumbersE2 = {
                {"11", "22", "33"},
                {"55", "66", "77"},
                {"99", "111", "222"}
        };

        System.out.println("Корректный массив 4 * 4");
        changeToIntAndSum(arrayNumbers);
        System.out.println("Ошибки:");
        System.out.println("В данном массиве имеется не число (слово или иные символы)");
        try {
            changeToIntAndSum(wrongArrayNumbersE1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        System.out.println("Массив имеет некорректную длину, должно быть 4 * 4");
        try {
            changeToIntAndSum(wrongArrayNumbersE2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    private static void changeToIntAndSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int numberOfSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 && array[i].length != 4) {
                    throw new MyArraySizeException("Array size is not correct size: [4] [4]. Current size array: [" + array.length + "][" + array[i].length + "].");
                }
                try {
                    Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("In the line " + i + ", in the column " + j + " there is not a number.\n");
                }
                numberOfSum += Integer.parseInt(array[j][j]);
            }
        }
        System.out.println("Общая сумма чисел в массиве составляет " + numberOfSum);
    }
}
