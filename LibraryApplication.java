import java.util.ArrayList;
import java.util.HashMap;

/**
 * LibraryApplication은 실질적인 대출, 반납, 분실처리 등을 수행하는 클래스이다.
 *
 * @author (2024320003 니시 야스히로)
 * @version (2025.11.03)
 */
public class LibraryApplication{
    // 주요 Collection들, 이용자와 책
    private Collection<Book> bookCollection = new Collection(new HashMap<Integer, Book>());
    private Collection<Borrower> borrowerCollection = new Collection(new HashMap<Integer, Borrower>());
    
    // 하위 Collection들, 이용자와 책 대출 관계, 이용자와 책 예약 관계, 이용자와 책 분실 관계
    private Collection<Loan> loanCollection = new Collection(new HashMap<Integer, Loan>());
    // private Collection<예약> 추가 예정
    // private Collection<분실> 추가 예정
    
    LibraryApplication(){
        // 아직 파일 입출력을 구현하지 않았기에 보고서 iteration2에서 추가할 예정
        // 그러므로 생성자에서 파일 입출력을 했다는 가정하에 아래와 같이 하드 코딩으로 예시 데이터를 생성
        
        // 사용자 정보 불러오기 대체
        Borrower borrower1 = new Borrower(1, "홍길동");
        Borrower borrower2 = new Borrower(2, "자바");
        Borrower borrower3 = new Borrower(3, "파이썬");
        Borrower borrower4 = new Borrower(4, "홍길동"); // 이름은 중복 가능
        
        // borrowerCollection에 사용자들 추가
        this.borrowerCollection.addElem(borrower1);
        this.borrowerCollection.addElem(borrower2);
        this.borrowerCollection.addElem(borrower3);
        this.borrowerCollection.addElem(borrower4);
        
        
        
        // 책 정보 불러오기 대체
        Book book1 = new Book(1, "책 제목1", "저자1", "출판사A", 2005);
        Book book2 = new Book(2, "책 제목2", "저자2", "출판사B", 2015);
        Book book3 = new Book(3, "책 제목3", "저자3", "출판사C", 2024);
        Book book4 = new Book(4, "책 제목4", "저자4", "출판사D", 2022);
        Book book5 = new Book(5, "책 제목5", "저자5", "출판사E", 2018);
        Book book6 = new Book(6, "책 제목6", "저자6", "출판사F", 1997);
        
        // bookCollection에 책들 추가
        this.bookCollection.addElem(book1);
        this.bookCollection.addElem(book2);
        this.bookCollection.addElem(book3);
        this.bookCollection.addElem(book4);
        this.bookCollection.addElem(book5);
        this.bookCollection.addElem(book6);
        
        // 대출 상태 불러오기 대체
        // 대출될 책들 추가
        ArrayList<Book> books1 = new ArrayList<Book>(); books1.add(book1); books1.add(book2);
        ArrayList<Book> books2 = new ArrayList<Book>(); books2.add(book3);
        ArrayList<Book> books3 = new ArrayList<Book>(); books2.add(book4); books3.add(book5); books3.add(book6);
        
        // 이용자와 대출될 책들 관계 정의(대출 정의)
        Loan loan1 = new Loan(1, borrower1, books1);
        Loan loan2 = new Loan(2, borrower2, books2);
        Loan loan3 = new Loan(3, borrower3, books3);
        
        // loanCollection에 대출 관계 추가
        this.loanCollection.addElem(loan1);
        this.loanCollection.addElem(loan2);
        this.loanCollection.addElem(loan3);
    }
    
    public void printBooks(){ System.out.println(this.bookCollection); }
    public void printBorrowers(){ System.out.println(this.borrowerCollection); }
    public void printLoans(){ System.out.println(this.loanCollection); }
    
    // borrowBook 대출 메소드 작성 필요(클래스 다이어 그램에서 입력, 반환 타입 고민한뒤 추가하기)
    // returnBook 반납 메소드 작성 필요(조건 -> 추후에 예약, 분실을 추가해야 하니)
    
    // 등록된 이용자 삭제 메소드 작성 필요
    // 등록된 책 삭제 메소드 작성 필요
}