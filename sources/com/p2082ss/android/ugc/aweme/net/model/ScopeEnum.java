package com.p2082ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.net.model.ScopeEnum */
public enum ScopeEnum {
    ALL(0),
    LOCAL_TEST(1),
    IN_HOUSE(2),
    OFFLINE(3),
    ONLINE(4);
    
    public static final C61419a Companion = new C61419a((byte) 0);
    private final int scope;

    public static final boolean isValidScope(int i) {
        return C61419a.m111186a(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.net.model.ScopeEnum$a */
    public static final class C61419a {
        static {
            Covode.recordClassIndex(72070);
        }

        private C61419a() {
        }

        public /* synthetic */ C61419a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m111186a(int i) {
            if (i == ScopeEnum.ALL.getScope() || i == ScopeEnum.ONLINE.getScope()) {
                return true;
            }
            return false;
        }
    }

    public final int getScope() {
        return this.scope;
    }

    static {
        Covode.recordClassIndex(72069);
    }

    private ScopeEnum(int i) {
        this.scope = i;
    }
}
