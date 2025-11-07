public class scenerio0 {
    static void main() {
        int[] myArr = {4, 8, 15, 16, 23, 42};
        // the length of the my arry is 6
        //the value of the first element is 4
        //last number index is 5
        // the value of the third element is 15
        //myArr[3] is 16
        //it will give arrayidexoutofboundsexception error
        System.out.println("a) Length of myArr: " + myArr.length);
        System.out.println("b) First element: " + myArr[0]);
        System.out.println("c) Index of last element: " + (myArr.length - 1));
        System.out.println("d) Third element: " + myArr[2]);
        System.out.println("e) Value of myArr[3]: " + myArr[3]);
    }

    // Error explanation
    // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

}
