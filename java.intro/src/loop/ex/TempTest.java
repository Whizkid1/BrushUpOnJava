package loop.ex;

public class TempTest {
    public static void main(String[] args) {
        int whileCount = 1;
        int forCount = 1;
        while (true) {
            System.out.println("whileCount: " + whileCount);
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println("forCount: " + forCount);
                forCount++;
            }
            whileCount++;
            if (whileCount == 3) {
                break;
            }
        }
    }
}
