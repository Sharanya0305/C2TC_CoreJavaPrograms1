package practiceProblems;

public class Trainer extends Person{
	private String session;
	private String designation;
	private String batchNo;
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	@Override
	public String toString() {
		return "Trainer [session=" + session + ", designation=" + designation + ", batchNo=" + batchNo + "]";
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int pid, String name, String city) {
		super(pid, name, city);
		// TODO Auto-generated constructor stub
	}
}
