package yhl.dg.mtk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**活动模块用于存储活动信息的一个对象*/
//@Data
@Setter
@Getter
@ToString
@NoArgsConstructor  //无参构造
@AllArgsConstructor //所有参数的构造函数
public class Activity {

	private Long id;
	private String title;
	private String category;
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")//setStartTime
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm")//getStartTime
	private Date startTime;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm")
	private Date endTime;
	private int state=1;
	private String remark;
	private Date createdTime;
	private String createdUser;
	
	public Activity(Long id) {
		this.id=id;
	}
	
}
