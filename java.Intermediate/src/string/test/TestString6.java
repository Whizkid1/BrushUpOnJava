package string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // code writing
        System.out.println(str.indexOf("hi"));
        System.out.println(str.indexOf(key));
        System.out.println(str.indexOf(key, 11, 32));
        System.out.println(str.lastIndexOf(key));

        int firstIndex = str.indexOf(key);
        int lastIndex = str.lastIndexOf(key);

        int count = 0;

        if (firstIndex != -1) {
            count += 1;
            while (true) {
                int middleIndex = str.indexOf(key, (firstIndex + 5));
                if (middleIndex == -1) {
                    break;
                } else if (middleIndex == lastIndex) {
                    count += 1;
                    break;
                } else {
                    count += 1;
                    firstIndex = middleIndex;
                }
            }
        }

        // 정답지
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index+1);
            count++;
        }
        System.out.println("count = " + count);

    }
}
