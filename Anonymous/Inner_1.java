
public class Inner_1 {

	Object iv = new Object() { void method() {} }; // �͸� Ŭ����.
	Object cv = new Object() { void method() {} }; // �͸� Ŭ����.

	void myMethod() {
		Object lv = new Object() {
			void method() {
			}
		}; // �͸� Ŭ����.
	}
}