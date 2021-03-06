<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<c:set var ="contextPath" 
value="${pageContext.servletContext.contextPath}" 
scope="application"/>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 메인 페이지</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <!-- sweetalert API 추가 -->
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <style>
        @font-face {
    font-family: 'MaplestoryOTFBold';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-04@2.1/MaplestoryOTFBold.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}
		html,body{
		height : 100%;
		box-sizing: border-box;
		}
        #main-side{
        	float : left;
            margin: 0;
            box-sizing: border-box;
            width: 10%;
            height: 100%;

        }

        #menu {
            box-sizing: border-box;
            width: 100%;
            height: 100%;
            border: 1px solid black;
            float: left;
            background-color: rgb(166  , 206, 231);
        }

        .cursor {
            color: white;
            width: 100%;
            cursor: pointer;
            font-family: 'MaplestoryOTFBold';
        }


        .ul{
            display: none;
        }
       
        ul{
            margin: 0;
            padding: 0;
        }
        li{
            font-size: 20px;
            list-style: none;
        }
        .font{
            font-size: 25px;
        }
        .admin{
            color : white
            margin-bottom: 20px;
        }
       #menu-area{
           height: 80%;
       }
       #logout-area{
           height: 20%;
       }
       a{
       text-decoration: none;}
       a:hover{
       color :white;
       }
       .menu-menu-color{
               color: white;
            width: 100%;
            cursor: pointer;
            font-family: 'MaplestoryOTFBold';
       }
    </style>
</head>

<body>
    <div id="main-side">
        <div id="menu" >
            <div id="menu-area">
            <div><img src="${contextPath}/resources/img/KakaoTalk_20210607_142908187.png" alt="" width="50%" style="margin-left: 45px;"></div>
            <div style="text-align: center; font-size: 20px; font-family: 'MaplestoryOTFBold';">일개미</div>
            <hr color="white" size="2px">

            <div id="post-admin" class="admin font cursor">▶ 기업</div>
            <div class="ul cursor">
                <ul class="second">
                    <li ><a class="menu-menu-color" href="${contextPath}/admin/ComBoardAll?type=2">-게시판 전체조회</a></li>
                    <li ><a class="menu-menu-color" href="${contextPath}/admin/ComBoardB?type=2">-게시판 블라인드</a></li>
                    <li ><a class="menu-menu-color" href="${contextPath}/admin/ComMemberAll?type=G">-회원 전체 조회</a></li>
                    <li ><a class="menu-menu-color" href="${contextPath}/admin/ComMemberDel?type=G">-회원 삭제</a></li>
                </ul>
            </div>

            <div id="mem-admin" class="admin font cursor">▶ 프리랜서</div>
            <div class="ul cursor">
                <ul class="second">
                   <li ><a class="menu-menu-color" href="${contextPath}/admin/freBoardAll?type=1">-게시판 전체조회</a></li>
                    <li ><a class="menu-menu-color" href="${contextPath}/admin/freBoardB?type=1">-게시판 블라인드</a></li>
                    <li ><a class="menu-menu-color" href="${contextPath}/admin/freMemberAll?type=F">-회원 전체 조회</a></li>
                    <li ><a class="menu-menu-color" href="${contextPath}/admin/freMemberDel?type=F">-회원 삭제</a></li>
                </ul>
            </div>
            <div id="inquiry" class="font cursor" style="margin-bottom: 20px;"><a id="qq"class="menu-menu-color" href="${contextPath}/admin/qusetions">▶ 문의 사항</a></div>
        </div>
        <div id="logout-area">
            <div style="text-align: center;"><a href="${contextPath}/admin/logout" style="text-decoration: none;"><img src="${contextPath}/resources/img/external-link-297789_640.png" width="50px"></a></div>
        </div>
        </div>
    </div>
    <%-- 로그인 실패와 같은 메세지가 서버로 부터 전달되어 온 경우 출력 --%>
	<c:if test="${!empty title }">
	<script>
		swal({
			"icon" : "${icon}",
			"title" : "${title}",
			"text" : "${text}"
		});
	</script>
	<%--특정 스코프에 있는 속성(변수)를 제거할 수 있음 --%>
	<%--서버로 부터 전달 받은 메세지를 1회 출력 후 제거 -> 반복 출력 되지 않음 --%>
	<c:remove var="icon"/>
	<c:remove var="title"/>
	<c:remove var="text"/>
	</c:if>
	
    <script>
     
        $('.admin').on("click", function () {
            if ($(this).next().css("display") == "none") {
                $(this).siblings(".ul").slideUp();
                $(this).next().slideDown();
            } else {
                $(this).next().slideUp();
            }
        });
 
    </script>

</body>

</html>