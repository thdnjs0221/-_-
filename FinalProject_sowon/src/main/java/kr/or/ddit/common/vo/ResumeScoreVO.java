package kr.or.ddit.common.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResumeScoreVO {
	
	private String rcrtNo;
	private int rprocOrder;
	private String aplNo;
	private int scrEdu;
	private int scrLang;
	private int scrCareer;
	private int scrCer;
	private int scrIa;
	private int scrOs;
	private int scrEtc;

}
