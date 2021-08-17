<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    /* "height1"、"height2"それぞれに格納されている値を取得し"value1"、"value2"へ格納する */
    String value1 = request.getParameter("height1");
    String value2 = request.getParameter("weight1");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMIの計算結果</title>
</head>
<body>
<h1>あなたのBMIの計算結果</h1>

<%
    double height, weight, bmi; // 変数定義
    height = Double.parseDouble(value1); // "value1"の値を実数に変換し"height"へ格納する
    weight = Double.parseDouble(value2); // "value2"の値を実数に変換し"weight"へ格納する
    height /= 100; // heightをcmからmに変換する

    bmi = weight / (height * height); // BMIを計算し"bmi"に格納する

    out.println("あなたのBMIの計算結果は、" + bmi + "です。"); // 計算結果の出力
%>

</body>
</html>