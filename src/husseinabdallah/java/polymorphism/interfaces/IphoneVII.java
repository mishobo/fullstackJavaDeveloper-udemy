package husseinabdallah.java.polymorphism.interfaces;

public class IphoneVII implements Phone{

	@Override
	public String processor() {
		return "A11";
	}

	@Override
	public String os() {
		return "IOS";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

}
