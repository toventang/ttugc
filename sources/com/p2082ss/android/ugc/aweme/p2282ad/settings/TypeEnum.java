package com.p2082ss.android.ugc.aweme.p2282ad.settings;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ad.settings.TypeEnum */
public enum TypeEnum {
    START_WITH(0),
    CONTAINS(1),
    REGEX_MATCHES(2),
    REGEX_CONTAINS_MATCH_IN(3),
    EQUAL(4);
    
    public static final C33382a Companion = new C33382a((byte) 0);
    private final int type;

    /* renamed from: com.ss.android.ugc.aweme.ad.settings.TypeEnum$a */
    public static final class C33382a {
        static {
            Covode.recordClassIndex(40230);
        }

        private C33382a() {
        }

        public /* synthetic */ C33382a(byte b) {
            this();
        }
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(40229);
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
