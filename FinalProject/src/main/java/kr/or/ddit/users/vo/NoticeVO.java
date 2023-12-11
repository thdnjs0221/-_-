package kr.or.ddit.users.vo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.validate.grouphint.DeleteGroup;
import kr.or.ddit.validate.grouphint.UpdateGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of = "noticeNo")
public class NoticeVO implements Serializable{
	private int rnum;

	@NotNull(groups = {UpdateGroup.class, DeleteGroup.class})
	private String noticeNo;
	@NotBlank
	private String noticeTitle;
	@ToString.Exclude
	private String noticeContent;
	private LocalDateTime noticeDate;
	private Integer noticeLno;
	
	private MultipartFile[] noticeFile;
	private List<NoticeAttatchVO> attatchList; // has many
	
	public void setnoticeFile(MultipartFile[] noticeFile) {
		if(noticeFile!=null) {
			this.noticeFile = Arrays.stream(noticeFile)
								.filter((f)->!f.isEmpty())
								.toArray(MultipartFile[]::new);
		}
		
		if(this.noticeFile!=null) {
			this.attatchList = Arrays.stream(this.noticeFile)
									.map((f)->new NoticeAttatchVO(f))
									.collect(Collectors.toList());
		}
	}
}
