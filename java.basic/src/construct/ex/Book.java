package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    //TODO 코드를 완성하세요.
    // 기본생성자
    Book() {
        // 정답 -> null이 나오면 안되니까....
        this("", "", 0);
    }

    // title과 author 만을 매개변수로 받는 생성자
    Book (String title, String author) {
        // 정답
        // -> 또한 this() 함수는 맨 윗줄에만 사용 가능
        // (System.out.println(); 과 같은 함수도 위에 있어서는 안된다.)
        //this(title, author, 0);
        this.title = title;
        this.author = author;
    }

    Book (String title, String author, int page) {
        // 정답
        //this(title, author, page);
        this.page = page;
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
