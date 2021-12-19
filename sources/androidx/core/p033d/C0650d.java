package androidx.core.p033d;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.d.d */
public final class C0650d extends RuntimeException {
    static {
        Covode.recordClassIndex(729);
    }

    public C0650d() {
        this(null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0650d(String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}
