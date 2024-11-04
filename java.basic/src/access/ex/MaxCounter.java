package access.ex;

public class MaxCounter {
    private int count;
    private int max;

     MaxCounter (int max) {
        this.count = 0;
        this.max = max;
    }

    public void increment() {
        if (max == count){
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count += 1;
        }

        // 정답
//        if (count >= max) {
//            System.out.println("최대값을 초과할 수 없습니다.");
//            return;
//        }
//        count++;
    }

    public int getCount() {
        return count;
    }
}
