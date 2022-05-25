package app;

public class DartsGameApp extends GameApp {
	//No field
	
	// constracta(引数なし)
	public DartsGameApp() {
		super();
	}
	
	//引数あり
	public DartsGameApp(String i) {
		super(i);
	}
	
	public String play() {
		return "10回投げて合計点を競います。";
	}
	
}