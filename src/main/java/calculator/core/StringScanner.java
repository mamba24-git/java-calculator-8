package calculator.core;

public final class StringScanner {
	private final Delimiters delims;

	public StringScanner(Delimiters d) {
		this.delims = d;
	}

	public int[] scan(SumPart part) {
		String s = part.raw();
		if (s.isEmpty()) return new int[0];

		int n = s.length();
		int count = countDigitsOrThrow(s, n);
		return collectDigitsOrThrow(s, n, count);
	}

	private int countDigitsOrThrow(String s, int n) {
		int i = 0;

		if (i >= n) throw new IllegalArgumentException("입력 형식 오류");
		char c0 = s.charAt(i);
		if (!isDigit1to9(c0)) throw new IllegalArgumentException("입력 형식 오류");
		int count = 1;
		i = i + 1;

		while (i < n) {
			char d = s.charAt(i);
			if (!delims.contains(d)) throw new IllegalArgumentException("허용되지 않은 구분자 입력: " + d);
			i = i + 1;

			if (i >= n) throw new IllegalArgumentException("입력 형식 오류");
			char k = s.charAt(i);
			if (!isDigit1to9(k)) throw new IllegalArgumentException("입력 형식 오류");
			count = count + 1;
			i = i + 1;
		}
		return count;
	}

	private int[] collectDigitsOrThrow(String s, int n, int size) {
		int[] out = new int[size];
		int pos = 0;
		int i = 0;

		char c0 = s.charAt(i);
		out[pos] = c0 - '0';
		pos = pos + 1;
		i = i + 1;

		while (i < n) {
			char d = s.charAt(i);
			if (!delims.contains(d)) throw new IllegalArgumentException("허용되지 않은 구분자 입력: " + d);
			i = i + 1;

			if (i >= n) throw new IllegalArgumentException("입력 형식 오류");
			char k = s.charAt(i);
			if (!isDigit1to9(k)) throw new IllegalArgumentException("입력 형식 오류");
			out[pos] = k - '0';
			pos = pos + 1;
			i = i + 1;
		}
		return out;
	}

	private boolean isDigit1to9(char c) {
		if (c < '1') return false;
		if (c > '9') return false;
		return true;
	}

}
