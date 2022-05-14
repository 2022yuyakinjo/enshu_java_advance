package app;

//	      request.setCharacterEncoding("UTF-8");
//	      String name = request.getParameter("name");  //HTMLのnameを表示
//	      GameApp name1 = new GameApp("何か");
//	      
//
//	      String result = "未実施";
//
//	      if (name != null && !name.isEmpty()) {
//	      	
//	      	result = name1.start(name);
//	      	// このif分の中で、GameAppクラスのstartメソッドを呼び出し、
//	      	// 戻り値をresultに代入してください。
//	      	
//
//	      }
//	
	
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")             //アノテーションで対応するURLを確認できる！ ""内にURLを記入
public class StartAppServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
	  
     response.getWriter().append("Served at: ").append(request.getContextPath());
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
	// TODO Auto-generated method stub
    // doGet(request, response);
      //入力値取得
	  ((HttpServletRequest) request).setCharacterEncoding("UTF-8");             //appStartの文字コードを取得する
      String name = request.getParameter("name");        //nameをリクエストし、新しくname変数に代入

     if (name != null && !name.isEmpty()) {
      	//GameAppクラスのオブジェクト
    	//引数つきコンストラクタで、itemフィールドに"何か"をセット）
    	  GameApp app = new GameApp("何か");
    	  
		//GameAppオブジェクトのstartメソッドを呼ぶ
    	  String result = app.start(name);                    //appフォルダにあるstartのファイル
    	  	//request scope
        request.setAttribute("result", result);
        

       

     }
     
     (request.getRequestDispatcher("appStart.jsp")).forward(request, response);

}

	


}