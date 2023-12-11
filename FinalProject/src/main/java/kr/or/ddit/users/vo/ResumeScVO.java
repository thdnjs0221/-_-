package kr.or.ddit.users.vo;

import kr.or.ddit.users.IResumeRenderer;
import kr.or.ddit.users.ResumeRenderer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(of = "resscNo")
public class ResumeScVO {
	private transient IResumeRenderer renderer = new ResumeRenderer();
	
	private String resscNo;
	private String resscCon;
	
	public String getResumeHTML() {
		return renderer.renderResume(this);
	}

}
