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
		if (value.charAt(3) == '\n') return true;
		if (value.length() >= 5 && value.charAt(3) == '\\' && value.charAt(4) == 'n') return true;
		return false;
	}

	public String raw() {
		return value;
	}
}
