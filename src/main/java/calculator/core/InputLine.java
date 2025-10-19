package calculator.core;

import camp.nextstep.edu.missionutils.Console;

public final class InputLine {
	private final String value;

	public InputLine(String v) {
		this.value = v;
	}

	public boolean isEmpty() {
		return value.isEmpty();
	}
}
