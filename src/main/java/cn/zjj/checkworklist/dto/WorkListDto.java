package cn.zjj.checkworklist.dto;


public class WorkListDto implements DtoInterface{
	private String stream_Number;
	private int new_Order;
	private String task_ID;
	private String customer_Phone;
	private int end_Time;
	private int duration_Type;
	private int is_Success;
	private int checked;
	
	public String getStream_Number() {
		return stream_Number;
	}
	public void setStream_Number(String stream_Number) {
		this.stream_Number = stream_Number;
	}
	public int getNew_Order() {
		return new_Order;
	}
	public void setNew_Order(int new_Order) {
		this.new_Order = new_Order;
	}
	public String getTask_ID() {
		return task_ID;
	}
	public void setTask_ID(String task_ID) {
		this.task_ID = task_ID;
	}
	public String getCustomer_Phone() {
		return customer_Phone;
	}
	public void setCustomer_Phone(String customer_Phone) {
		this.customer_Phone = customer_Phone;
	}
	public int getEnd_Time() {
		return end_Time;
	}
	public void setEnd_Time(int end_Time) {
		this.end_Time = end_Time;
	}
	public int getDuration_Type() {
		return duration_Type;
	}
	public void setDuration_Type(int duration_Type) {
		this.duration_Type = duration_Type;
	}
	public int getIs_Success() {
		return is_Success;
	}
	public void setIs_Success(int is_Success) {
		this.is_Success = is_Success;
	}
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}
	public String toJson() {
		// TODO Auto-generated method stub
		return null;
	}
}
