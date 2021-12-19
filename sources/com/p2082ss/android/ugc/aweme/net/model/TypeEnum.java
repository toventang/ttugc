package com.p2082ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.net.model.TypeEnum */
public enum TypeEnum {
    START_WITH(0),
    CONTAINS(1),
    REGEX_MATCHES(2),
    REGEX_CONTAINS_MATCH_IN(3),
    EQUAL(4);
    
    public static final C61420a Companion = new C61420a((byte) 0);
    private final int type;

    public static final boolean isRegex(int i) {
        return C61420a.m111187a(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.net.model.TypeEnum$a */
    public static final class C61420a {
        static {
            Covode.recordClassIndex(72072);
        }

        private C61420a() {
        }

        public /* synthetic */ C61420a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m111187a(int i) {
            if (i == TypeEnum.REGEX_MATCHES.getType() || i == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType()) {
                return true;
            }
            return false;
        }
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(72071);
    }

    private TypeEnum(int i) {
        this.type = i;
    }
}
