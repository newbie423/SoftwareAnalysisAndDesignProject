/**
 * CollectionElem은 Collection에서 실질적인 요소로써 사용될 수 있는 클래스들이 상속받아야 하는 클래스 이다.
 *
 * @author (2022320032 정윤성)
 * @version (2025.11.03)
 */
public abstract class CollectionElem{
    protected int id;

    CollectionElem(int id){ this.id = id; }

    int getID(){ return this.id; }
    
    public abstract String toString();
}