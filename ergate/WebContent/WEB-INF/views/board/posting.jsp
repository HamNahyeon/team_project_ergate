<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>posting</title>

	<link rel = "stylesheet" type = "text/css" href = "${contextPath}/resources/css/posting_style.css">
	<jsp:include page="../common/header.jsp"/>
</head>
<body>
	<%-- <jsp:include page="Board_Search_Form.jsp"/> --%>
 	<%-- <jsp:include page="Board_SideMenu.jsp"/> --%>
	
    
	<%-- <form action="${contextPath}/board2/insert?style=${pagination.boardStyle}" method="post"  --%>
	<form action="${contextPath}/board2/insert" method="post" 
		  name="insertFrm" enctype="multipart/form-data" role="form" onsubmit="return boardValidate();">
    <div class="pcontainer">
    			<h3 class="boardinsert">게시글 작성</h3></td>
    	<table>
    		<tr>
    			
    		</tr>
    		<tr>
    			<td><label for="ptype">게시판종류*</label></td>
    			<td>
	   				<c:if test="${style == 1}">
	                <select id="boardStyle" name="boardStyle">
	                    <option value="1">제안서</option>
	                </select>
	                </c:if>
	            	<c:if test="${style == 2}">
	                <select id="boardStyle" name="boardStyle">
	                    <option value="2">포트폴리오</option>
	                </select>
	                </c:if>
    			</td>
    		</tr>
    		<tr>
    			<td><label for="category">카테고리*</label></td>
    			<td>
    				<select id="categoryCode" name="categoryCd" onsubmit="return boardCategory();">
	                    <option value="0" selected>=== 카테고리를 선택해주세요 ===</option>
	                    <option value="1">웹 개발자</option>
	                    <option value="2">앱 개발자</option>
                	</select>
    			</td>
    		</tr>
    		<tr>
    			<td><label for="category">제목*</label></td>
    			<td><input name="boardTitle" id="boardTitle" type="text" placeholder = "제목을 입력해주세요(최대 30글자)" maxlength="30" oninput="titleMaxLength(this)" required >  </td>
    		</tr>
    		<tr>
    			<td><label for="contents">내용*</label></td>
    			<td><textarea name="boardContent" id="contentsarea" placeholder = "내용을 입력해주세요(최대 20000글자)" maxlength="20000" oninput="contentMaxLength(this)" required style="resize: none;"></textarea></td>
    		</tr>
    		<tr>
    			<td><label for="thumbnail">썸네일</label></td>
    			<td><input name="img0" id="imgfile" type="file" accept="image/*"></td>
    		</tr>
    		<tr>
    			
				<c:if test="${style == 1}">
		            <td>
		                <label for="thumbnail">첨부파일(최대 40MB)</label>
		            </td>
		            <td>
	                    <input name="chumbufile" type="file" accept=".pdf, .doc, .docx, .hwp" onchange="checkSize(this);">
		            </td>
	            </c:if>
            	<c:if test="${style == 2}">
	            	<td>
	                    <button type="button" id="addvalue" onclick="add();">이미지 추가</button>
	    			</td>
	    			<td>	
	    				<div id="addimg"></div>
	    			</td>
            </c:if>
    			
    		</tr>
    		
    		
    		<tr>
    			<td></td>
    			<td>
    				<button type="button" id="backkk" name="boardback" onclick="history.back();">작성취소</button>
    				<button type="reset" id="resettt" class="reset">내용초기화</button>
    			</td>
    		</tr>
    		
    		<tr>
    			<td></td>
    			<td><button type="submit">작성완료</button></td>
    		</tr>

    	</table>
    	<br>
		<jsp:include page="../common/footer.jsp"/>
   	</div>
	</form>

	<script>
		
		// 이미지 추가
        let count = 1;

        function add(){
            var addValue = document.getElementById('addvalue');

            var p = document.createElement("div");

            p.innerHTML = addValue.value;

            var ip = document.createElement("input");
            var btn = document.createElement("button");

            btn.innerHTML = "삭제";

            ip.setAttribute("type", "file");
            ip.setAttribute("name", "img" + count++);
            ip.setAttribute("class", "boardImg");
            ip.setAttribute("accept", "image/*");
            btn.setAttribute("onclick", "deleteImage(this)");

            p.appendChild(ip);
            p.appendChild(btn);

            document.getElementById('addimg').appendChild(p); 

            addValue.value = ' ';
        }

        function deleteImage(el){
            el.parentElement.remove();
            count--;
        }
        
        function boardValidate(){
        	
        	const cd = $("#categoryCode").val();
        	if(cd == 0){
        		swal({
					"icon" : "warning",
					"title" : "카테고리를 선택해주세요"
				}).then(function(){
					$("#categoryCode").focus();
				});
        		return false;
        		
        	}else{
        		document.insertFrm.action = "${contextPath}/board2/insert?style=" + $("#boardStyle").val();
            	document.insertFrm.submit();
        	}
        }
        
/*         function fileCheck(){
        	
            // 사이즈체크
            var maxSize  = 40 * 1024 * 1024    //
            var fileSize = 0;

        	// 브라우저 확인
        	var browser=navigator.appName;
        	
        	// 익스플로러일 경우
        	if (browser=="Microsoft Internet Explorer")
        	{
        		var oas = new ActiveXObject("Scripting.FileSystemObject");
        		fileSize = oas.getFile( file.value ).size;
        	}
        	// 익스플로러가 아닐경우
        	else
        	{
        		fileSize = file.files[0].size;
        	}

        	alert("파일사이즈 : "+ fileSize +", 최대파일사이즈 : 5MB");

                if(fileSize > maxSize)
                {
                    alert("첨부파일 사이즈는 5MB 이내로 등록 가능합니다.    ");
                    return;
                }

                document.fileForm.submit();
        }
 */        
 
		 function checkSize(input) {
		     if (input.files && input.files[0].size > (40 * 1024 * 1024)) {
        		swal({
					"icon" : "warning",
					"title" : "파일 용량이 40MB를 초과합니다."
				});
		         input.value = null;
		     }
		 }

 		function titleMaxLength(input){
 			if(input.value.lenth > input.maxLength){
 				input.value = input.value.slice(0, input.maxLength);

 			}
 		}
 		
 		function contentMaxLength(input){
 			if(input.value.lenth > input.maxLength){
 				input.value = input.value.slice(0, input.maxLength);

 			}
 		}
	</script>
	

</body>
</html>