/**
 * Book는 도서관 책에 대한 클래스로, Collection의 요소가 되기 위하여 CollectionElem을 상속한다.
 *
 * @author (2024320052 오번가 수영)
 * @version (2025.11.03)
 */
public class Book extends CollectionElem{
    private String title;
    private String author;
    private String publisher;
    private int publishYear;

    public Book(int id, String title, String author, String publisher, int publishYear){
        super(id);

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
    }

    String getTitle(){ return this.title; }
    String getAuthor(){ return this.author; }
    String getPublisher(){ return this.publisher; }
    int getPublishYear(){ return this.publishYear; }

    /*
    @param 없음
    
    @return 문자열
    
    자신의 아이디, 제목과 같은 정보들을 문자열의 형태로 정리하여 반환하는 메소드이다
    */
    public String toString() { return "책 아이디:" + this.id + " " + "제목:" + this.title + " " + "저자:" + this.author + " " + "출판사:" + this.publisher + " " + "출판년도:" + this.publishYear; }
}