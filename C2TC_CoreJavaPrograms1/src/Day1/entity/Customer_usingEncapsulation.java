package Day1.entity;

public class Customer_usingEncapsulation {
		private int cid;
		private String cname;
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
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
		}
	}

// Right click and press 'Source'. Use Generate getters
