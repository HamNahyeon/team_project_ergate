<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>프리랜서 내 정보</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
            integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
            crossorigin="anonymous"></script>
        <style>
            input[type="number"]::-webkit-outer-spin-button,
            input[type="number"]::-webkit-inner-spin-button {
                -webkit-appearance: none;
                margin: 0;
            }

            .btn {
                background-color: #e1e1e1;
                color: black;
                border-radius: 3px;
                border: 2px solid rgb(107, 140, 172);

            }
            

            .btn:hover {
                background-color: #e1e1e1;
                border: 2px solid rgb(107, 140, 172);
                color: black;
                box-shadow: 0 12px 16px 0 rgba(0, 0, 0, 0.24), 0 17px 50px 0 rgba(0, 0, 0, 0.19);
            }
        </style>
    </head>

    <body>
      <div id="container">
        <jsp:include page="../common/header.jsp"></jsp:include>
        
		
		<c:set var="phone" value="${ fn:split( freLoginMember.memberPhone, '-' ) }"/>
		<c:set var="jumin" value="${ fn:split( freLoginMember.juminNum, '-' ) }"/>

        
            <div class="row my-5">
                <jsp:include page="sideMenu.jsp"></jsp:include>
                <div class="col-sm-8">
                    <h4 class="mb-3">내 정보</h4>
                    <br>
                    <hr>
                    <form class="validation-form" method="POST" action="fre_update" onsubmit="return memberUpdateValidate();">
                        <!-- 아이디 -->
                        <div class="row mb-5 form-row">
                            <div class="col-md-3">
                                <label for="id">아이디</label>
                            </div>
                            <div class="col-md-6">
                            <h5 id="id"> ${ freLoginMember.memberId } </h5>
                            </div>
                        </div>

                        <!-- 이름 -->
                        <div class="row mb-3 form-row">
                            <div class="col-md-3">
                                <label for="name">이름</label>
                            </div>
                            <div class="col-md-6">
								<h5 id="name"> ${ freLoginMember.memberName }</h5>
							</div>
                        </div>

                        <!-- 전화번호 -->
                        <div class="row mb-3 form-row">
                            <div class="col-md-3">
                                <label for="phone1">전화번호</label>
                            </div>
                            <!-- 전화번호1 -->
                            <div class="col-md-3">
                                <select class="custom-select" id="phone1" name="phone" required>
                                    <option>010</option>
                                    <option>011</option>
                                    <option>016</option>
                                    <option>017</option>
                                    <option>019</option>
                                </select>
                            </div>

                            <!-- 전화번호2 -->
                            <div class="col-md-3">
                                <input type="number" class="form-control phone" id="phone2" name="phone" value="${phone[1]}">
                            </div>

                            <!-- 전화번호3 -->
                            <div class="col-md-3">
                                <input type="number" class="form-control phone" id="phone3" name="phone" value="${phone[2]}">
                            </div>
                        </div>

                        <!-- 이메일 -->
                        <div class="row mb-3 form-row">
                            <div class="col-md-3">
                                <label for="email">Email</label>
                            </div>

                            <div class="col-md-6">
								<input type="email" class="form-control" id="email" name="email" value="${freLoginMember.memberEmail}">
							</div>
                        </div>
                        <!-- 연락 가능 시간 1 -->
                        <div class="row mb-3 form-row">
                            <div class="col-md-3">
                                <label for="time">연락 가능 시간</label>
                            </div>
                            <div class="col-md-3">
                                <input type="time" class="form-control" id="time1" name="time1" value="${freLoginMember.minTime}">
                            </div>
                            ~
                            <div class="col-md-3">
                                <input type="time" class="form-control" id="time2" name="time2" value="${freLoginMember.maxTime}">
                            </div>
                        </div>
                        <br>
                        <!-- 희망 급여 -->
                        <div class="row mb-3 form-row">
                            <div class="col-md-3">
                                <label for="salary">희망 급여</label>
                            </div>

                            <!-- 희망 급여 1 -->
                            <div class="col-md-3">
                                <input type="number" class="form-control salary" id="salary1" name="salary1" value="${freLoginMember.minSalary}">
                            </div>
                            ~
                            <!-- 희망급여 2 -->
                            <div class="col-md-3">
                                <input type="number" class="form-control salary" id="salary2" name="salary2" value="${freLoginMember.maxSalary}">
                            </div>

                        </div>
                        <br>
                        <div class="row mb-3 form-row">
                            <div class="col-md-3">
                                <label for="feild">분야</label>
                            </div>
                            <!-- 분야 -->
                            <div class="col-md-3">
                                <select class="custom-select" id="field" name="feild">
                                   		<option>===선택===</option>
                                   		<option>웹개발</option>
	                                    <option>앱개발</option>
                                </select>
                            </div>
                             <div class="col-md-6">
							</div>
							<br>
							<br>
                            <!-- 근무 형태 -->
                            <div class="col-md-3">
                                <label for="work">근무 형태</label>
                            </div>
                            <div class="col-md-3">
                                <select class="custom-select" id="work" name="work">
                              		<option>===선택===</option>
                                    <option>자가</option>
                                    <option>회사</option>
                                </select>
                            </div>
							<div class="col-md-6">
							</div>
                        </div>
                       
                            <!-- 프리랜서 경험 -->
                        <div class="row mb-3 form-row">
                            <div class="col-md-3">
                                <label for="experience">프리랜서 경험</label>
                            </div>
                            <div class="col-md-3">
                                <select class="custom-select" id="experience" name="experience">
                                	<option>===선택===</option>	
                                    <option>있습니다</option>
                                    <option>없습니다</option>
                                </select>
                            </div>
                            <div class="col-md-6">
							</div>
							<br> <br>
                            <!-- 스킬 -->
                            <div class="col-md-3">
                                <label for="skil">스킬</label>
                            </div>
                            <div class="col-md-3">
                                <select class="custom-select" id="skil" name="skil">
                   		            <option>===선택===</option>
                                    <option>C</option>
                                    <option>Python</option>
                                    <option>Java</option>
                                    <option>C++</option>
                                    <option>C#</option>
                                    <option>Visual Basic</option>
                                    <option>JavaScript</option>
                                    <option>PHP</option>
                                    <option>R</option>
                                    <option>SQL</option>
                                </select>
                            </div>
                        </div>
                        <hr>
                        <button class="btn btn-primary btn-lg btn-block" type="submit">수정하기</button>
                    </form>
                </div>
            </div>
        </div>
        <jsp:include page="../common/footer.jsp"/>
    </body>
   	 <script>
    	const field = "${freLoginMember.feild}";
     	$("#field > option").each(function(index, item){
    		if($(item).text() == field){
    			$(item).prop("selected", true);
    		}
    	});
     	
     	const work = "${freLoginMember.work}";
     	$("#work > option").each(function(index, item){
    		if($(item).text() == work){
    			$(item).prop("selected", true);
    		}
    	});
     	const experience = "${freLoginMember.experience}";
     	$("#experience > option").each(function(index, item){
    		if($(item).text() == experience){
    			$(item).prop("selected", true);
    		}
    	});
     	const skil = "${freLoginMember.skil}";
     	$("#skil > option").each(function(index, item){
    		if($(item).text() == skil){
    			$(item).prop("selected", true);
    		}
    	});
     	
    	(function(){
    			$("#phone1 > option").each( function(index, item){ 
    				
    				if( $(item).text() == "${phone[0]}"){
    					
    					$(item).prop("selected", true);
    				}
    				
    			});
    		})();
    	function memberUpdateValidate(){
    	    const regExp1 = /^[0-9]{3,4}$/;
    	    const regExp2 = /^[0-9]{4}$/;
    	    const ph2 = $("#phone2").val();
    	    const ph3 = $("#phone3").val();

    	    if( !regExp1.test(ph2)  || !regExp2.test(ph3)  ){
    	    	swal({ "icon"  : "warning",
    	    		   "title" : "전화번호가 유효하지 않습니다."  ,
    	    		   "text"  : "중간 자리는 3~4, 마지막 자리는 4글자로 작성해주세요." });
    	    	
    	    	return false;
    	    }
    	    
    	    const regExp = /^[\w]{4,}@[\w]+(\.[\w]+){1,3}$/;

    	    const inputEmail = $("#email").val().trim();

    	    if( !regExp.test(inputEmail) ){
    	    	swal({ "icon"  : "warning",
    	    		   "title" : "이메일이 유효하지 않습니다."  ,
    	    		   "text"  : "아이디 4글자 이상의 이메일 형식으로 작성해주세요." });
    	    	
    	    	return false;
    	    }
    	    
    	}
     	
    </script>

    </html>