package com.p2082ss.android.ugc.aweme.crossplatform.p2710d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.d.d */
public enum EnumC40630d {
    NONE(0),
    DYNAMIC(1),
    FROCE_DYNAMIC(2);
    
    public static final C40631a Companion = new C40631a((byte) 0);

    /* renamed from: b */
    private final int f95140b;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d.d$a */
    public static final class C40631a {
        static {
            Covode.recordClassIndex(48471);
        }

        private C40631a() {
        }

        public /* synthetic */ C40631a(byte b) {
            this();
        }
    }

    public final int getValue() {
        return this.f95140b;
    }

    static {
        Covode.recordClassIndex(48470);
    }

    public static final EnumC40630d parse(int i) {
        if (i == 1) {
            return DYNAMIC;
        }
        if (i != 2) {
            return NONE;
        }
        return FROCE_DYNAMIC;
    }

    private EnumC40630d(int i) {
        this.f95140b = i;
    }
}
