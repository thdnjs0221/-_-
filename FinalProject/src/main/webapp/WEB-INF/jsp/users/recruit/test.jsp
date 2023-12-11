<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<script type="text/javascript">


function makelist(recruit){
	const cPath = $("body").data("contextPath");
	let recruitViewURL = `\${cPath}/recruit/recruitView?what=\${prod.prodId}`;
	let makeList = function(recruit){
	let tags =`
	
		<tr>
		<td>\${recruit.rcrtTitile }</td>
		<td>\${recruit.rcrtKeywordnm }</a></td>
		<td>\${recruit.lprod.rcrtLoc }</td>
		<td>\${recruit.buyer.rcrtCareer }</td>
		<td>\${recruit.rcrtEdu }</td>
	</tr>
	
		

	
	`;
	return tags;
};

$(searchForm).on("submit", function (event) {
    event.preventDefault(); //동기 요청 중단 
    let url = `${cPath}/recruit/recruitData`;
    let method = this.method; //get

    

    $.getJSON(url, function (resp) {
        let list = resp.paging.dataList;
        console.log("확인1", list);

        let tags = "";

        if (list?.length > 0) {
            $.each(list, function (idx, recruitVO) {
                console.log("확인2", recruitVO);
                tags += makeList(recruitVO);
            });
        } else {
            tags += `
                <tr>
                    <td>정보 없음</td>
                </tr>
            `;
        }

        $("#listBody").html(tags);
    });
}).submit();

//페이징 서버로 보내기 
function fn_paging(page){
	searchForm.page.value = page;
	searchForm.requestSubmit();
	searchForm.page.value = "";
	
}
    
    
    
</script>
