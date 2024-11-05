package extends1.ex;

public class Book extends Item {

    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        // override 후 부모의 함수를 일부 사용하고 싶으면 super.함수명() 을 통해서 사용
        super.print();
        // 현재 클래스에 메서드가 존재하지 않으면, 부모 클래스에서 확인 후 사용
        pprint();
        // java: cannot find symbol method ppprint();
        // ppprint();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }

    // java: finalPrint() in extends1.ex.Book cannot override finalPrint() in extends1.ex.Item
    //  overridden method is final
//    @Override
//    public void finalPrint() {
//        System.out.println("final override 테스트");
//    }
}
