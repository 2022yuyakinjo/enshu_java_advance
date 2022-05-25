

public abstract class GameApp implements App {
	// create a field
	public String item;    //ゲームに使⽤する道具名を表す⽂字列

	//create a play-abstract method（１）
	public abstract String play();
	//戻り値がString
	//抽象クラスは必ず子クラスで使用する
	//抽象メソッドではstaticはつけらない

	// create a constracter    //引数なしのコンストラクタ
	public GameApp() {

	}

	public GameApp(String i) {   //GameAppクラスのitemフィールドにiを代入
		item = i;
	}


	//override method to start app
	public String start (String p) {
		//Stringで値を持たせて、オーバーライト（上書きする）
		String startMessage = p + "さんと" + item + "でゲームを開始します。";
		String playMessage = play();

		return startMessage + playMessage;

	}
	//　staticを使うとクラスになる	
}