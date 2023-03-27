package husseinabdallah.java.core.concepts.innerclass;

public class Door {
	private Lock lock;
	
	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	public Door() {
		lock = new Lock(true);
	}
	
	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("shop is closed");
		} else {
			System.out.println("shop is opened");
		}
	}
	
	public class Lock{
		private boolean lock;
		
		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
	}

}
