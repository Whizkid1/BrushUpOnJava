package construct.ex;

public class TempTest {
    private int value;

    // 'TempTest(int)' has private access in 'construct.ex.TempTest'
    // 음... 생성자를 자기 자신만 사용하는 경우가 있나....?? -> pdf 자료에 링크 추가
    // 생성자의 접근제어자는 인스턴스를 생성할 수 있는 범위를 설정하는 요소!!
//    private TempTest(int value) {
//        this.value = value;
//    }

    // default 부터는 같은 패키지 내에서 사용 가능
    TempTest(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

}
