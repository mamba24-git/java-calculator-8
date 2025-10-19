package calculator.core;

public class Delimiters {
	private final char[] buf;
	private final int size;

	private Delimiters(char[] buf, int size) {
		this.buf = buf;
		this.size = size;
	}

	public static Delimiters delims(String value, boolean hasCustom) {
		char[] b = new char[3];
		b[0] = ',';
		b[1] = ':';
		if (!hasCustom)	return new Delimiters(b, 2);
		b[2] = value.charAt(2);
		return new Delimiters(b, 3);
	}
}
