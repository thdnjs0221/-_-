package kr.or.ddit.company.vo;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import kr.or.ddit.users.vo.ApplyVO;
import kr.or.ddit.validate.grouphint.DeleteGroup;
import kr.or.ddit.validate.grouphint.InsertGroup;
import kr.or.ddit.validate.grouphint.UpdateGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(of = "rcrtNo" )
@Data
@ToString
public class RecruitVO implements Serializable{
	
	//svn
	private int rnum;
	
	private String rcrtNo;
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtStime;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtEtime;
	
	private String companyId;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtTitle;  //공고제목
	
	private int rcrtHit;
	
	private String rcrtKeywordnm;  //직무직업
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtField;  //모집분야명
	
	@NotNull (groups = {InsertGroup.class,UpdateGroup.class})
	private int rcrtPerson;
	
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtCareer;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtCondition;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtEdu;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtLoc;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtType;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtSalary;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtWeek;
	
	private String rcrtDate;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtSdate;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtEdate;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtNm;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtTel;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtMail;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtWlfr;
	
	@NotBlank (groups = {InsertGroup.class,UpdateGroup.class})
	private String rcrtRectype;
	
	private String rcrtDelete;
	
	@Valid
	private List<RProcedureVO> rProcedure;
	
	private CompanyVO company;
	
	private ApplyVO apply;
	
	private RecruitVO resume;
	
	
	
	
//소원	
//	private int rnum;
//	
//	private String rcrtNo;
//	
//	private String rcrtStime;
//	
//	private String rcrtEtime;
//	
//	
//	private String companyId;
//	
//	@NotBlank (groups = InsertGroup.class)
//	private String rcrtTitle;  //공고제목
//	
////	rcrtTitile
//	private int rcrtHit;
//	
//	private String rcrtKeywordnm;  //직무직업
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtField;  //모집분야명
//	
//	@NotNull (groups = { InsertGroup.class, UpdateGroup.class})
//	private int rcrtPerson;
//	
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtCareer;
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtCondition;
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtEdu;
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtLoc;
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtType; //근무형태
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtSalary;
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtWeek;
//	
//	
//	private String rcrtDate; 
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtSdate; //지원접수시작일자
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtEdate;//지원접수마감일자
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtNm;
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtTel;
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtMail;
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtWlfr;
//	
//	@NotBlank (groups = { InsertGroup.class, UpdateGroup.class})
//	private String rcrtRectype;
//	
//	private String rcrtDelete;
	
	


}
