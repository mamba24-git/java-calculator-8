package calculator.core;

public class Sum {
	private int value;

	public Sum() {
		this.value = 0;
	}

	public void sum_values(int v) {
		if (value > Integer.MAX_VALUE - v)	throw new IllegalArgumentException("너무 큰 값을 입력하였습니다.\n");
		value = value + v;
	}

}
