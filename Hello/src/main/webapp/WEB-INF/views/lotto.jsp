<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<html>
<head>
	<title>Lotto</title>
</head>
<body>
<%
	Random ran = new Random(); //난수 생성 클래스
	int nLottoNum = 6; //로또 번호수
	int arrLotto[] =  new int[nLottoNum]; //6 크기의 index 배열 선언
	
	for(int i=0; i<nLottoNum; i++) {
		arrLotto[i] = 0; //배열의 인덱스 값들을 0으로 초기화
	}
	int nCurrentCnt = 0; // 현재 생성된 번호의 수
	int nCurrentVal = 0; // 현재 생성된 난수번호
	boolean bExistVal = false; //중복여부 체크 변수
	
	while(true) {
		nCurrentVal = ran.nextInt(45) + 1; //nextInt(45)는 0~44여서 마지막에 +1을 한다.
		bExistVal = false;
		for(int j=0; j<=nCurrentCnt; j++) {
			if(arrLotto[j] == nCurrentVal) {
				out.print("중복발생");
				bExistVal = true;
				continue;
			}
		}
		if(bExistVal == false) {
			arrLotto[nCurrentCnt] = nCurrentVal;
			nCurrentCnt++;
		}
		if(nCurrentCnt == 6)
			break;
		}
		for(int i=0; i<=nLottoNum-1; i++) {
			out.print(i+1 + "번째 숫자: " + arrLotto[i] + "<br>");
		}
%>	
</body>
</html>