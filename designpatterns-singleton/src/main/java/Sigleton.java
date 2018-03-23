// Sigleton 패턴 적용
// => 강제로 인스턴스를 한번만 생성하고자 할때 사용한다.
public class Sigleton {

    // Sigleton 객체를 생성하면 다음 스태틱 변수에 보관 해 둔다.
    private static Sigleton instance;
    int n;
    
    // 외부에서 생성자를 호출하지 못하도록 private으로 접근을 제한다.
    private Sigleton() {
        System.out.println("Sigleton : 인스턴스를 한번만 생성합니다.");
    }
    
    public static Sigleton getSigleton() {
        if(instance == null)
            instance = new Sigleton();
        return instance;
    }
}
