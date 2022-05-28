package jp.co.axiz.util;

import app.App;
import app.CardGameApp;
import app.ClockApp;
import app.DartsGameApp;
import app.GameApp;

public class AppUtil {
	
	App app =null;
	String result = "";
	
	public static boolean isGameApp(App app) {
//AppはGameAppで作成したインターフェース（抽象メソッド）
		
//	引数(app)で受け取ったオブジェクトの型がGameAppかを判定する。 
//	GameAppか、GameAppを継承したクラス(CardGameApp、DartsGameApp)ならtrueを返却する。
//	それ以外ならfalseを返却する。
	
		if(app instanceof GameApp) {
//CardGameAppとDartsGameAppはGameAppを継承しているので、GameApp型であるといえる

			return true; 
		}else {
			return false;
		}
	}
	
	public static boolean isCardGameApp(App app) {//AppはCardGameAppで作成したインターフェース（抽象メソッド）
		
//	引数で受け取ったオブジェクトの型がCardGameAppかを判定する。
//	CardGameAppならtrueを返却する。
//	それ以外ならfalseを返却する。
		if(app instanceof CardGameApp) {
			
			return true;
		}else {
			return false;
		}
	}
		
	public static boolean isDartsGameApp(App app) {//AppはDartsGameAppで作成したインターフェース（抽象メソッド）

//	引数で受け取ったオブジェクトの型がDartsGameAppかを判定する。
//	DartsGameAppならtrueを返却する。
//	それ以外ならfalseを返却する。
		
		if(app instanceof DartsGameApp) {
			
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isClockApp(App app) {//AppはClockAppで作成したインターフェース（抽象メソッド）
		
//	引数で受け取ったオブジェクトの型がClockAppかを判定する。
//	ClockAppならtrueを返却する。
//	それ以外ならfalseを返却する。
		
		if(app instanceof ClockApp) {
			return true;
		}else {
			return false;
	    }
	}
	
	public static String getAppName(App app) {
		String appName = "";
		
//		引数で受け取ったオブジェクトの型に応じて、下記の文字列を返却する。 
//		・CardGameApp　 …　「ゲーム:カード」
//		・DartsGameApp　 …　「ゲーム:ダーツ」
//		(GameAppを継承したクラスの型の場合は、文字列は「ゲーム：〇〇」となる〇〇の値は、各クラスによって、異なる)
//		・ClockApp　　　　…　「時計」
		if(isGameApp(app)) {
			appName = "ゲーム:";
			if(isCardGameApp(app)) {
				appName += "カード";
			}else if(isDartsGameApp(app)) {
				appName += "ダーツ";
			}	
		}else if(isClockApp(app)) {
			appName = "時計";
		}
			
		return appName;
	}
	
}