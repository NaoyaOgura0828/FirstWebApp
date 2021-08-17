package jp.learningdesign.javastudy;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BmiCalc
 */
@WebServlet("/bmi")
public class BmiCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BmiCalc() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath()); // 未使用の為コメントアウト
		response.setContentType("text/html;charset=UTF-8"); // レスポンスのヘッダーを送信するメソッドの呼び出し
		PrintWriter out = response.getWriter(); // データを書き出すインスタンスの作成
		out.println("<html><body>");
		out.println("<h1>こんにちは、サーブレットの世界へようこそ！</h1>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response); // 未使用の為コメントアウト
		response.setContentType("text/html;charset=UTF-8"); // レスポンスのヘッダーを送信するメソッドの呼び出し
		PrintWriter out = response.getWriter(); // データを書き出すインスタンスの作成
		String height_in, weight_in; // 入力値を格納するインスタンスの定義
		double height, weight, bmi; // 実数変換後の変数の定義
		height_in = request.getParameter("height1"); // 入力された身長の取得し"height_in"へ格納する
		weight_in = request.getParameter("weight1"); // 入力された体重の取得"weight_in"へ格納する
		height = Double.parseDouble(height_in); // 身長を実数に変換し"height"へ格納する
		weight = Double.parseDouble(weight_in); // 体重を実数に変換し"weight"へ格納する
		height /= 100; // 身長をcmからmに変換
		bmi = weight / (height * height); // BMIの計算
		out.println("<html><body>");
		out.println("あなたのBMI、体格指数は、" + bmi + "です。"); // 計算結果の表示
		out.println("</body></html>");
	}

}
