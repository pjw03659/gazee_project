<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$.ajax({
		url:"faqList",
		success:function(x){
			$('#result').append(x)
		}
	})
})
</script>
</head>
<body>
	<div id="content">
		<div id="customerServiceMain">
			<div id="customerHead">
				<h1>고객센터</h1>
			</div>
			<div id="customerMenu1">
				<ul class="FAQ">
					<li><form method="get">
							<label for="category">카테고리</label> <select id="category"
								name="category" size="1">
								<option value="">선택하세요.</option>
								<option value="결제 관련">결제 관련</option>
								<option value="배송 관련">배송 관련</option>
								<option value="거래 관련">거래 관련</option>
							</select>
						</form></li>
					<li><button id="faqList">목록</button></li>
				</ul>
			</div>
		</div>
		<div id=result></div>
		<div id=faqButtom>
			<div id=faqSearch>
				<input type="text" size=40;>
				<button id=reportSearchBtn>검색</button>
			</div>
			
		</div>
	</div>
</body>
</html>