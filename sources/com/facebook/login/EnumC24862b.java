package com.facebook.login;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.login.b */
public enum EnumC24862b {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");
    

    /* renamed from: a */
    private final String f59024a;

    public final String getNativeProtocolAudience() {
        return this.f59024a;
    }

    static {
        Covode.recordClassIndex(29051);
    }

    private EnumC24862b(String str) {
        this.f59024a = str;
    }
}
