package p4600h.p4622m;

import com.bytedance.covode.number.Covode;

/* renamed from: h.m.o */
final class C89360o {

    /* renamed from: a */
    public static final C89350l f203035a;

    /* renamed from: b */
    public static final C89360o f203036b = new C89360o();

    private C89360o() {
    }

    static {
        Covode.recordClassIndex(105444);
        String concat = "[eE][+-]?".concat("(\\p{Digit}+)");
        f203035a = new C89350l("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("(" + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + concat + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + concat + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
