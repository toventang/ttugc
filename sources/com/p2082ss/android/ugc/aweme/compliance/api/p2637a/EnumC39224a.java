package com.p2082ss.android.ugc.aweme.compliance.api.p2637a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.a.a */
public enum EnumC39224a {
    LOGOUT(0),
    INTERNAL_WEB(1),
    EXTERNAL_WEB(2),
    NATIVE(3),
    INTERNAL_APPEAL_WEB(4),
    EXTERNAL_APPEAL_WEB(5);
    

    /* renamed from: b */
    private final int f92667b;

    public final int getType() {
        return this.f92667b;
    }

    static {
        Covode.recordClassIndex(46860);
    }

    private EnumC39224a(int i) {
        this.f92667b = i;
    }
}
