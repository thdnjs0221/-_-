<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/1.4.1/html2canvas.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>

<body>
    <div id="capture" style="padding: 10px; background: #f5da55">
        <h4 style="color: #000; ">Hello world!</h4>
    </div>
    <div id="resume">
        <h1>소원이력서</h1>
        <h1>그냥 합격!</h1>
    </div>
    <button onclick="fImg()">이력서이미지 맹글기</button>
    <script>
        function fImg() {
            html2canvas(document.querySelector("#capture")).then(canvas => {
                document.body.appendChild(canvas)
                // 아작스로 파일보내깅
                canvas.toBlob((blob) => {
                    console.log("체킁:",blob);

                    let formData = new FormData();
                    formData.append("file",blob);
                    /*
                    $.ajax({
                        type:"post",
                        url:"컨트롤러URL",
                        data: formData,
                        contentType:false,  // 필수 파일 보낼때
                        processData:false,  // 필수 파일 보낼때
                        cache:false,    //  선택
                        success:function(resp){
                            console.log("항상값체크:",resp);  // 보통 링크 URL
                        },
                        error:function(xhr){
                            console.log("ERROR",xhr.status);
                        }
                    })
                    */
                    // 요기서 아작스롱
                    

                    /* 요건 이미지로 변환하는 부분
                    const newImg = document.createElement("img");
                    const url = URL.createObjectURL(blob);

                    newImg.src = url;
                    document.body.appendChild(newImg);
                    */
                });
            });
        }
    </script>
</body>

