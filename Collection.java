import java.util.HashMap;

/**
 * Collection은 Book, Borrower, Loan에 대한 제각각의 Collection을 제작 할 수 있도록 설계된 제네릭 클래스 이다.
 *
 * @author (2022320032 정윤성)
 * @version (2025.11.03)
 */
public class Collection<T extends CollectionElem>{
    private HashMap<Integer, T> elems;

    public Collection(HashMap<Integer, T> elems){
        this.elems = elems;
    }

    public boolean addElem(T elem){
        if(this.elems.containsKey(elem.getID())){
            return false;
        }

        this.elems.put(elem.getID(), elem);

        return true;
    }

    /*
    @param 없음
    
    @return 문자열
    
    현재 자신이 Book, Borrower, Loan중 어떤 클래스에 대한 Collection으로 사용되는지 알 수는 없으나
    이들 모두 CollectionElem을 상속 받으며, 그 안에 toString()이 추상 메소드로 작성되어 있기에
    Book, Borrower, Loan은 무조건 자신만의 전용 toString()을 가지는 것이 전제가 된다
    그리고 Collection의 toString()은 단지 자신이 지니고 있는 모든 요소들의 toString()을 쭉 실행시키기만 할 뿐이다
    */
    public String toString(){
        String content = "";

        for(T elem : elems.values()){
            content += elem + "\n";
        }

        return content;
    }
}