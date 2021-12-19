package com.p2082ss.android.ugc.tiktok.seclink.impl;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.TypeEnum */
public enum TypeEnum {
    START_WITH(0),
    CONTAINS(1),
    REGEX_MATCHES(2),
    REGEX_CONTAINS_MATCH_IN(3),
    EQUAL(4);
    
    public static final C84338a Companion = new C84338a((byte) 0);
    private final int type;

    /* renamed from: com.ss.android.ugc.tiktok.seclink.impl.TypeEnum$a */
    public static final class C84338a {
        static {
            Covode.recordClassIndex(98289);
        }

        private C84338a() {
        }

        public /* synthetic */ C84338a(byte b) {
            this();
        }
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(98288);
    }

    public static final boolean isRegex(int i) {
        if (i == REGEX_MATCHES.getType() || i == REGEX_CONTAINS_MATCH_IN.getType()) {
            return true;
        }
        return false;
    }

    private TypeEnum(int i) {
        this.type = i;
    }
}
