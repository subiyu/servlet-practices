package guestbook.vo;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class GuestBookVo {
	private Long no;
	private String name;
	private String password;
	private String contents;
	private String regDate;
	
	public Long getNo() {
		return no;
	}
	
	public void setNo(Long no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getContents() {
		return contents;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public String getReg_date() {
		return regDate;
	}
	
	public void setReg_date(String regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "GuestBookVo [no=" + no + ", name=" + name + ", password=" + password + ", contents=" + contents
				+ ", regDate=" + regDate + "]";
	}
}
