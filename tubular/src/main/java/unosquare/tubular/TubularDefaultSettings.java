package unosquare.tubular;

public class TubularDefaultSettings {
	public static boolean adjustTimezoneOffset;

	public static boolean isAdjustTimezoneOffset() {
		return adjustTimezoneOffset;
	}

	public static void setAdjustTimezoneOffset(boolean adjustTimezoneOffset) {
		TubularDefaultSettings.adjustTimezoneOffset = adjustTimezoneOffset;
	}
}
