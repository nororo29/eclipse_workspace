package phonebook;

class Phone {
	private String name;
	private String num;
	
	public Phone(String name, String num) {
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return name;
	}
	
	public String print() {
		return name + ":" + num;
	}
	
}