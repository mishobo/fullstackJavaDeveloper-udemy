package husseinabdallah.java.staticelements;

public class StaticTest {
	private static int staticVariable = 0;

	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		StaticTest.staticVariable = staticVariable;
	}

}
