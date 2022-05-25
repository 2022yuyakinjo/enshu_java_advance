package app;

public class CardGameApp extends GameApp  {

	public CardGameApp() {
		super();
	}

	//コンストラクタ(道具名を初期化する)
	public CardGameApp(String item) {
		//    this.item = item;
		super(item);
	}

	//playメソッド (オーバーライド)
	public String play() {  //親クラスが引数アリだったらアリ
		return  "ババ抜きを行います。";

	}
}