package array.ex;

public class TempTest {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        // 1. 자료에서 대입이 불가능 하다는 뜻이 뭘까???
        System.out.println(students.length);
        int studentsLength = students.length;
        System.out.println(studentsLength);

        // 대입이 불가능 하다는 뜻
        // java: cannot assign a value to final variable length
        //students.length = 3;

        // 2. 2차원 배열의 for each 문
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        //java: incompatible types: int[] cannot be converted to int
        //for (int i : arr) {
        //    System.out.println(i);
        //}

        // 출력 성공 -> [I@10f87f48 [I@b4c966a 각 행의 참조값을 뱉음.
        //for (int[] i : arr) {
        //    System.out.println(i);
        //}

        // 불가능... 당연히....
        //for (int[][] i: arr) {
        //    System.out.println(i);
        //}

        for (int[] i: arr) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
