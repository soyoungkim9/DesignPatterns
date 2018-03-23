
public class Exam {

    public static void main(String[] args) {
        
        // Sigleton s = new Sigleton() // 컴파일오류!
        // -> Sigleton 클래스의 생성자에 접근 할 수 없다(private)
        Sigleton s1 = Sigleton.getSigleton();
        Sigleton s2 = Sigleton.getSigleton();
        Sigleton s3 = Sigleton.getSigleton();
        
        s1.n = 1;
        s2.n = 2;
        s3.n = 3;
        
        if(s1 == s2)
            System.out.println("s1의 주소와 s2의 주소가 같다");
        if(s1 == s3)
            System.out.println("s1의 주소와 s3의 주소가 같다");
        
        // 그렇기 때문에 변수 이름이 다른 곳에 각각 다른 값을 집어 넣어도
        // s1, s2, s3는 모두 같은 주소를 가르키기 때문에
        // 같은 값을 가르킬 수 밖에 없다.
        System.out.printf("%d, %d, %d", s1.n, s2.n, s3.n);
    }

}
