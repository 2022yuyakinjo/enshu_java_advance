<%@ page import="app.GameApp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--   <% --%>
<!-- //     request.setCharacterEncoding("UTF-8"); -->
<!-- //     String name = request.getParameter("name"); -->
<!-- //     String result = "未実施"; -->
<!-- //     if (name != null && !name.isEmpty()) { -->
<!-- //         // GameAppクラスのオブジェクトを作成 -->
<!-- //         // (引数付きコンストラクタで、itemフィールドに "何か" をセット) -->
<!-- //         GameApp app = new GameApp("何か"); -->
<!-- //         // GameAppオブジェクトのstartメソッドを呼ぶ -->
<!-- //         result = app.start(name); -->
<!-- //     } -->
<%-- %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題1</title>
<style>
body {
  border: solid 2px #000080;
  padding:5px;
}
.result {
  background: #fffacd;
  display: inline-block;
  margin: 5px;
  padding: 10px;
}
</style>
</head>
<body>
  <h1>Java応用 - 演習問題1</h1>
  <h2>ゲームアプリ実行</h2>
<!--       <h3>アプリの実行結果</h3> -->

  <c:if test="${not empty result}"> 
<!--  result内が空でないとき、resultを -->
    <div class="result">    <!--     クラスresultにCSSを入力-->
    <p>${requestScope.result}</p>
      </div>
	</c:if>


<form action="StartAppServlet" method="post">

    <label>名前：</label>
    <input type="text" name="name" value=""><br>
	<label>アプリ：</label>
	<input type="radio" name="g" value="trump" checked>トランプ
<!-- 	選択肢を一つだけに選ばせるにはnameの値を同じにする -->
	<input type="radio" name="g" value="game">ゲーム

    <br>
    <button type="submit">実行</button>
  </form>
</body>
</html>

