

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StartAppServlet")             
//アノテーションで対応するURLを確認できる！ ""内にURLを記入
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	public StartAppServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//入力値取得
		request.setCharacterEncoding("UTF-8");
		//appStartの文字コードを取得する
		String name = request.getParameter("name");
		//nameをリクエストし、新しくname変数に代入
		
		
		//ラジオボタンの選択肢を格納するための変数
		String appType = request.getParameter("g");


		if(name == null || name.isEmpty()) {
			//nameが未入力の場合は、appStart.jspへ遷移する
			request.getRequestDispatcher("appStart.jsp").forward(request, response);
			return;
		}


		App app = null;  
		//下のほうで、ポリモーフィズムを使用したい。ので、
		//親クラスのフィールドとして設定しているだけ。
		//nullは初期値。（new appでもOK）


		//ラジオボタンの選択肢で選択されたオブジェクト
		switch (appType) {
		case "card":
			app = new CardGameApp("トランプ");//ポリモーフィズムで、インスタンスの中身を変えている。
			break;

		case "darts":
			app = new DartsGameApp("ダーツ");//ポリモーフィズムで、インスタンスの中身を変えている。
			break;

		case "clock":
			app = new ClockApp();//ポリモーフィズムで、インスタンスの中身を変えている。
			break;
		}
		
		//アプリの実行結果のメッセージを入れる変数
		String result = "";
		
		try {
			result = app.start(name);  //appクラスのstartメソッドの戻り値を、resultへ代入する
		} catch (Exception ex) {
			result = "アプリの実行に失敗しました"; //例外発生時のエラーメッセージ
		}
		
		
		

		//      String g = request.getParameter("g");
		//     if (name != null && !name.isEmpty()) {
		//      	//GameAppクラスのオブジェクト
		//    	//引数つきコンストラクタで、itemフィールドに"何か"をセット）
		//    	 GameApp app;   //appをif文の外で宣言
		//    	 if(g.equals("trump")){
		//       	  app = new CardGameApp("トランプ");
		//    	 }else {
		//    	  app = new GameApp("何か");
		//    	 }


		//GameAppオブジェクトのstartメソッドを呼ぶ
		//appフォルダにあるstartのファイル
		//request scope
		request.setAttribute("result", result);
		(request.getRequestDispatcher("appStart.jsp")).forward(request, response);
	}
}