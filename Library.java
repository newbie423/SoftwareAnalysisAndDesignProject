import java.util.ArrayList;
import java.util.HashMap;
/**
 * Library는 도서관으로 LibraryApplication이라는 클래스로 생성한 객체를 통해 대출, 반납, 분실처리 등을 수행하도록 요청하는 클래스이다.
 *
 * @author (2024320003 니시 야스히로)
 * @version (2025.11.03)
 */
public class Library{
    public static void main(String[] args){
        LibraryApplication LA = new LibraryApplication();

        LA.printBorrowers(); // 등록된 모든 이용자 출력
        LA.printBooks(); // 등록된 모든 책 출력
        LA.printLoans(); // 등록된 모든 대출 관계 출력
    }
}