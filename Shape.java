/**
 * Shape 클래스는 도형의 개념을 나타내기 위한 추상 클래스이다.
 * 추상 클래스이므로 이 클래스의 인스턴스는 생성할 수 없다.
 * 구체적인 도형 클래스는 이 클래스로부터 파생된다.
 * 
 * @author 홍길동
 * @see Object
 */



    public abstract class Shape {

/**
 * 도형 정보를 나타내는 문자열을 반환하는 추상 매서드.
 * Shape 클래스에서 파생되는 클래스에서 이 매서드를 구현한다.
 * 이 매서드는 java.lang.Object 클래스의 매서드를 추상 매서드로
 * 오버라이드한 매서드이다.
 * 
 */

    public abstract String toString();


/**
 * draw 매서드는 도형을 그리기 위한 추상매서드이다.
 * Shape 클래스에서 파생되는 클래스에서 이 매서드를 구현한다.
 */

    public abstract void draw();


/**
 * print 매서드는 도형 정보의 정보를 표시하고 도형 자체를 그린다.
 * 구체적으로는 다음 두 단계를 따른다.
 * 1. toString 매서드가 반환하는 문자열을 표시하고 줄바꾼다.
 * 2. draw 매서드를 호출해서 도형을 그린다.
 */

    public void print() {
        System.out.println(toString());
    }
}
