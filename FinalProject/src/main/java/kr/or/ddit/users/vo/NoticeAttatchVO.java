package kr.or.ddit.users.vo;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = "notattNo")
@NoArgsConstructor
public class NoticeAttatchVO implements Serializable{
	private MultipartFile noticeFile;
	public NoticeAttatchVO(MultipartFile noticeFile) {
		super();
		this.noticeFile = noticeFile;
		this.notattOriginalnm = noticeFile.getOriginalFilename();
		this.notattMime = noticeFile.getContentType();
		this.notattFilesize = noticeFile.getSize();
		this.notattSavename = UUID.randomUUID().toString();
	}

	private Integer notattNo;
	private String noticeNo;
	private String notattOriginalnm;
	private String notattSavename;
	private long notattFilesize;
	private String notattMime;
	private Integer notattFileorder;
	
	public void saveTo(File saveFolder) throws IllegalStateException, IOException{
		if(noticeFile!=null)
			noticeFile.transferTo(new File(saveFolder, notattSavename));
	}
}
