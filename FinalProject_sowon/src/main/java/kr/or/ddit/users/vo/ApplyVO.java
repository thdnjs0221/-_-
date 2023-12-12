package kr.or.ddit.users.vo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.company.vo.AProcedureVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(of = "aplNo")
@Data
@ToString
public class ApplyVO {
	
	@NotBlank
	private String resscNo; //이력서 소스번호 우선 하드코딩
	
	
	private String resattNo; //이력서 파일번호
	
	private String aplNo; //지원번호
	
	private String rcrtNo;
	
	private String usersId;
	
	private String aplCdate; //지원취소일자
	
	private String aplCancel;  //디폴트값 N  지원취소여부
	
	//
	private AProcedureVO aprocedure;
	
	private ResumeAttatchVO attatch;
	
//	private List<ResumeAttatchVO> attatchList;
//	public void setReFile(MultipartFile[] reFile) {
//		if(reFile!=null) {
//			this.reFile = Arrays.stream(reFile)
//								.filter((f)->!f.isEmpty())
//								.toArray(MultipartFile[]::new);
//		}
//		if(this.reFile!=null) {
//			this.attatchList =Arrays.stream(this.reFile)
//									.map((f)->new ResumeAttatchVO(f))
//									.collect(Collectors.toList());
//		}
//	}
//	private int fileCnt;

}
