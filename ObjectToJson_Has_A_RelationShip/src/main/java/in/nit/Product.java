package in.nit;

public class Product {

	
		private int pid;
		private String pname;
		private Model mob;//Has-A Relation
		public int getPid() {
			return pid;
		}
		public String getPname() {
			return pname;
		}
		public Model getMob() {
			return mob;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public void setMob(Model mob) {
			this.mob = mob;
		}
		
	
}
