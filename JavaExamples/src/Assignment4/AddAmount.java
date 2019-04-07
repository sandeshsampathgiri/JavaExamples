package Assignment4;

public class AddAmount {

	static int amount = 50;

	public AddAmount() {

	}

	private AddAmount(int additionalAmount) {
		int extraAmount = 0;
		extraAmount = amount + additionalAmount;
		System.out.println(extraAmount);
	}

	public static void main(String[] args) {

		AddAmount aa = new AddAmount(20);

	}

}
