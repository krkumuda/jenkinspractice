package pojoclassforParsing;

public class Spouse {

		String sName;
		int sPno;
		String sEmail;

		public Spouse(String sName, int sPno, String sEmail) {
			super();
			this.sName = sName;
			this.sPno = sPno;
			this.sEmail = sEmail;
		}

		public Spouse() {
			
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		public int getsPno() {
			return sPno;
		}
		public void setsPno(int sPno) {
			this.sPno = sPno;
		}
		public String getsEmail() {
			return sEmail;
		}
		public void setsEmail(String sEmail) {
			this.sEmail = sEmail;
		}

		}
