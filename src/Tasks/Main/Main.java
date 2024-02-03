package Tasks.Main;

import Tasks.Section_2_The_program.HelloWorld;
import Tasks.Section_3_Data_Types_Literals.DataType;
import Tasks.Section_4_Arrays.Arrays;
import Tasks.Section_6_Decision_making_operators.AvgCalc;
import Tasks.Section_6_Decision_making_operators.Calculator;
import Tasks.Section_6_Decision_making_operators.Converter;
import Tasks.Section_7_Cycles.ArrayConstants;
import Tasks.Section_7_Cycles.AverageMultiply;
import Tasks.Section_7_Cycles.MatrixOperation;
import Tasks.Section_7_Cycles.SumOddNumbers;
import Tasks.Section_8_Working_with_data.CompareNumbers;
import Tasks.Section_8_Working_with_data.LatinWords;
import Tasks.Section_8_Working_with_data.RandomArray;
import Tasks.Section_8_Working_with_data.StringOperations;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1_Первая программа");
        HelloWorld.HelloWorld(); //Задача №1_Первая программа
        System.out.println("Задача №2_Типы данных");
        DataType.DataType(); // Задача №2_Типы данных
        System.out.println("Задача №3_Массивы");
        Arrays.Arrays(); // Задача №3_Массивы
        System.out.println("Задача №4_Операторы");
        AvgCalc.AvgCalc(); // Задача №4_Операторы
        System.out.println("Задача №5_Операторы");
        Calculator.Calc(); // Задача №5_Операторы
        System.out.println("Задача №6_Операторы");
        Converter.Conv();//Задача №6_Операторы
        System.out.println("Задача №7_Циклы");
        ArrayConstants.ArrCons(); //Задача №7_Циклы
        System.out.println("Задача №8_Циклы");
        SumOddNumbers.SumOdd();//Задача №8_Циклы
        System.out.println("Задача №9_Циклы");
        AverageMultiply.AvgMult();//Задача №9_Циклы
        System.out.println("Задача №10_Циклы");
        MatrixOperation.MatrixOp();//Задача №10_Циклы
        System.out.println("Задача №11_Работа с данными");
        CompareNumbers.CompNum();//Задача №11_Работа с данными
        System.out.println("Задача №12_Работа с данными");
        StringOperations.StrOp();//Задача №12_Работа с данными
        System.out.println("Задача №13_ Работа с данными");
        LatinWords.LatWord();//Задача №13_ Работа с данными
        System.out.println("Задача №14_ Работа с данными");
        RandomArray.RndArr();//Задача №14_ Работа с данными
    }
}