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
		return new SumPart(v.substring(4));
	}
}
