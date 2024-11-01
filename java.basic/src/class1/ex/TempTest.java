package class1.ex;

public class TempTest {
    String stringInitTest;
    int intInitTest;
    public static void main(String[] args) {
        testInitPrint();
    }
    public static void testInitPrint() {
        TempTest tempTest = new TempTest();
        System.out.println(tempTest.stringInitTest);
        System.out.println(tempTest.intInitTest);
    }
}
