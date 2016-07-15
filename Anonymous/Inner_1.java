
public class Inner_1 {

	Object iv = new Object() { void method() {} }; // 익명 클래스.
	Object cv = new Object() { void method() {} }; // 익명 클래스.

	void myMethod() {
		Object lv = new Object() {
			void method() {
			}
		}; // 익명 클래스.
	}
}