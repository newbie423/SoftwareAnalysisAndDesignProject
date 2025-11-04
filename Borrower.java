
/**
 * Borrower는 도서관 이용자에 대한 클래스로, Collection의 요소가 되기 위하여 CollectionElem을 상속한다.
 *
 * @author (2024320052 오번가 수영)
 * @version (2025.11.03)
 */
public class Borrower extends CollectionElem{
    private String name;

    public Borrower(int id, String name){
        super(id);

        this.name = name;
    }

    public String getName(){ return this.name; }

    /*
    @param 없음
    
    @return 문자열
    
    자신의 아이디, 이름과 같은 정보들을 문자열의 형태로 정리하여 반환하는 메소드이다
    */
    public String toString() { return "이용자 아이디:" + this.id + " " + "이름:" + this.name; }
}