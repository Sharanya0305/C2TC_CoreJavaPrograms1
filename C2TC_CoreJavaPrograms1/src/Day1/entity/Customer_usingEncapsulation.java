package Day1.entity;

public class Customer_usingEncapsulation {
	package Day1.entity;

	public class Customer {
		private int cid;
		private String cname;
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
		}
		private String city;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
	}


}
