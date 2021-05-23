package HomeworkLesson3;

public class HomeworkLesson3 {
    public static void main(String[] args) {
        swap01();
        massiv100();
        freeArray();
        squareArray();
        newArray(7, 3);
        maxMinArray();
        sumLeftRight(new int[]{3, 1, 4, 2, 6});


    }

    public static void swap01() {
        System.out.println("Задание №1");
        int[] binary = {0, 1, 0, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0) {
                binary[i] = 1;
                System.out.print(binary [i]+ ", ");
            } else {
                binary [i] = 0;
                System.out.print(  binary [i]+ ", ");
            }
        }
        System.out.println();
    }

    public static void massiv100() {
        System.out.println("Задание №2");
        int [] a = new int[100] ;
        for (int i = 0; i <a.length ; i++) {
            a [i] = i +1;
            System.out.print(a [i] +" ");
        }
        System.out.println();
    }

    public static void freeArray() {
        System.out.println("Задание №3");
        int [] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < b.length ; i++) {
            if(b [i] < 6){
                b [i] = b [i]*2;
                System.out.print( b [i] + ", ");
            }else {
                System.out.print( b [i] + ", ");
            }
        }
        System.out.println();
    }

    public static void squareArray() {
        System.out.println("Задание №4");
        int [] [] square = new int[5][5];
        for (int i = 0; i <square.length ; i++) {
            for (int j = 0; j <square[i].length ; j++) {
                if( i == j || j + i == 4 ){
                    square[i] [j] = 1;
                    System.out.print(square[i] [j] + "  ");
                }else {
                    System.out.print(square[i] [j] + "  ");
                }
            }
            System.out.println();

        }
        System.out.println();
    }

    public static void newArray(int len, int initialValue ) {
        System.out.println("Задание №5");

        int[] n = new int [len];
        for (int i = 0; i <n.length ; i++) {
            n[i] = initialValue;
            System.out.print(n[i] + ", ");
        }
        System.out.println();
    }

    public static void maxMinArray() {
        System.out.println("Задание №6");
        int [] arrays = { 4, 6,2,45,23,78,34,-67,94, 26};
        int max = arrays[0];
        int min = arrays [0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i <arrays.length ; i++) {
            if(arrays[i] > max){
                max = arrays[i];;
                maxIndex =i;
            }
            else if(arrays[i]< min) {
                min = arrays[i];
                minIndex = i;
            }
        }

        System.out.println("Максимальный индекс - " + maxIndex+ "  " + arrays[maxIndex] );
        System.out.println("Минимальный  индекс - " + minIndex +"  " +arrays[minIndex]);
    }

    public static void sumLeftRight(int [] t) {
        System.out.println("Задание №7");
        int array = t.length;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array -1; i++) {
            for (int j = 0; j <=i ; j++) {
                sumLeft += t[j];
            }
            for (int k = i+1; k <array ; k++) {
                sumRight += t[k];
            }
            if (sumLeft == sumRight) {
                System.out.println( "1");
            }else {
                System.out.println('2');
            }

        }

    }
}

