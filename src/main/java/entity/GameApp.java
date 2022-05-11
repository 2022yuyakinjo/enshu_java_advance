package app;

public class GameApp {
	// create a field
	public String item;    //ゲームに使⽤する道具名を表す⽂字列
	
	// create a constracter
	public GameApp() {}
	public GameApp(String item) {   //GameAppクラスのitemフィールドにiを代入
		this.item = item;
	}
		
	public String start (String p) {
		return p + "さんと"  + this.item + "でゲームを開始します";
	
//		今回は、"〇〇さんと××でゲームを開始します"という⽂字列を返却し、 
//		〇〇は引数の値、××はitemフィールドの値を入力するとあるので、
//		引数pとitemフィールドであるthis.itemを入れる。
		
	}
	//　staticを使うとクラスになる
}