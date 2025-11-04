import java.util.ArrayList;

/**
 * Loan는 도서관 이용자와 책 사이의 대출 관계를 나타내는 클래스로, Collection의 요소가 되기 위하여 CollectionElem을 상속한다.
 *
 * @author (2024320001 윈파파한)
 * @version (2025.11.03)
 */
public class Loan extends CollectionElem{
    private Borrower borrower;
    private ArrayList<Book> books;    

    public Loan(int id, Borrower borrower, ArrayList<Book> books){
        super(id);

        this.borrower = borrower;
        this.books = books;
    }

    public Borrower getBorrwer(){ return this.borrower; }

    public ArrayList<Book> getBooks() { return this.books; }

    /*
    @param 없음
    
    @return 문자열
    
    특정 이용자와 책 사이의 대출 관계를 문자열의 형태로 정리한뒤 반환하는 메소드이다
    반환되는 문자열에는 대출 객체의 아이디, 대출자, 대출자가 대출한 책들에 대한 정보가 포함된다
    */
    public String toString() {
        String content = "";

        content += "대출 아이디:" + this.id + "\n";

        content += "    대출자 -> " + borrower.toString() + "\n";
        content += "    대출책 : " + "총 " + this.books.size() + "권\n";
        for(int idx=0; idx<this.books.size(); idx++){
            content += "         -> " + this.books.get(idx).toString() + "\n";
        }

        return content;
    }
}