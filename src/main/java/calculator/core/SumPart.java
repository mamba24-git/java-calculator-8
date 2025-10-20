package calculator.core;

public class SumPart {
	private final String value;

	private SumPart(String v) {
		this.value = v;
	}

	public static SumPart sp_Empty(String v, boolean isEmpty) {
		return new SumPart("");
	}

	public static SumPart sp_notCustom(String v, boolean hasCustom) {
		if (!hasCustom)	return new SumPart(v);
		if (v.length() >= 4 && v.charAt(3) == '\n') return new SumPart(v.substring(4));
		if (v.length() >= 5 && v.charAt(3) == '\\' && v.charAt(4) == 'n') return new SumPart(v.substring(5));

		throw new IllegalArgumentException("커스텀 구분자 선언 형식 오류");
	}

	public String raw() {
		return value;
	}
}
