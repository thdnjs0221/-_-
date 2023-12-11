package kr.or.ddit.company.vo;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(of = {"aplNo","rcrtNo","rprocOrder"})
public class AProcedureVO {
	
	private String aplNo; //지원번호
	
	private String rcrtNo; //채용공고번호
	
	private Integer rprocOrder; //채용공고순서
	
	private String aprocDate; //제출일
	
	private String aprocPass; //합불여부
	
	private Integer aprocScr; //점수

}
