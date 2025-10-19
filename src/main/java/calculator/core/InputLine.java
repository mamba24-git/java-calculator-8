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

	public boolean hasCustom() {
		if (value.length() < 4)	return false;
		if (value.charAt(0) != '/')	return false;
		if (value.charAt(1) != '/')	return false;
		if (value.charAt(3) != '\n') return false;
		return true;
	}

	public String raw() {
		return value;
	}
}
