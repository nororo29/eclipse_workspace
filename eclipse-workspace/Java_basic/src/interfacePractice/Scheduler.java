package interfacePractice;

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}

class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		
	}
	
}

/*
class LeastJob implements Scheduler {
	
}

class PriorityAllocation implements Scheduler {
	
}
*/