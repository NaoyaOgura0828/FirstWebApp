<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>はじめてのJSP</title>
</head>
<body>
<h1>こんにちは、From Java Server Pages!</h1><!--ヘッダー表示-->

<!--記述方法変更の為コメントアウト-->
<%--<%=Calendar.getInstance().getTime()%>--%>

<%
    Calendar gcal = Calendar.getInstance(); // gcalインスタンスの作成
    SimpleDateFormat format1 = new SimpleDateFormat("Gyyyy年 MM月 dd日 (E)"); // format1の書式を宣言（日付）
    SimpleDateFormat format2 = new SimpleDateFormat("ahh時 mm分"); // format2の書式を宣言（時刻）

    String string1 = format1.format(gcal.getTime()); // string1にformat1形式で現在日付を格納
    String string2 = format2.format(gcal.getTime()); // string2にformat2形式で現在時刻を格納

    out.println("本日の日付: " + string1 + "<br>現在の時刻: " + string2); // ブラウザへ出力
%>
</body>
</html>