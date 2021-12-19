package p4600h.p4622m;

import com.bytedance.covode.number.Covode;

/* renamed from: h.m.n */
public enum EnumC89359n implements AbstractC89341f {
    IGNORE_CASE(2),
    MULTILINE(8),
    LITERAL(16),
    UNIX_LINES(1),
    COMMENTS(4),
    DOT_MATCHES_ALL(32),
    CANON_EQ(128);
    

    /* renamed from: b */
    private final int f203033b;

    /* renamed from: c */
    private final int f203034c;

    @Override // p4600h.p4622m.AbstractC89341f
    public final int getMask() {
        return this.f203034c;
    }

    @Override // p4600h.p4622m.AbstractC89341f
    public final int getValue() {
        return this.f203033b;
    }

    static {
        Covode.recordClassIndex(105443);
    }

    private /* synthetic */ EnumC89359n(int i) {
        this(i, i);
    }

    private EnumC89359n(int i, int i2) {
        this.f203033b = i;
        this.f203034c = i2;
    }
}
