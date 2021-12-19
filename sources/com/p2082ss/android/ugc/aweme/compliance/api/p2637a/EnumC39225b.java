package com.p2082ss.android.ugc.aweme.compliance.api.p2637a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.a.b */
public enum EnumC39225b {
    NOT_LOGIN("-1"),
    NORMAL("0"),
    CHILD_US("1"),
    CHILD_OTHERS("2"),
    UNKNOWN("");
    
    public static final C39226a Companion = new C39226a((byte) 0);

    /* renamed from: b */
    private final String f92669b;

    /* renamed from: com.ss.android.ugc.aweme.compliance.api.a.b$a */
    public static final class C39226a {
        static {
            Covode.recordClassIndex(46862);
        }

        private C39226a() {
        }

        public /* synthetic */ C39226a(byte b) {
            this();
        }
    }

    public final String getUserType() {
        return this.f92669b;
    }

    static {
        Covode.recordClassIndex(46861);
    }

    private EnumC39225b(String str) {
        this.f92669b = str;
    }
}
