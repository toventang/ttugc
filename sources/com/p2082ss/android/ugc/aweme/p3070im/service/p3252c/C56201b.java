package com.p2082ss.android.ugc.aweme.p3070im.service.p3252c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;

/* renamed from: com.ss.android.ugc.aweme.im.service.c.b */
public final class C56201b {

    /* renamed from: a */
    public static final C56201b f128197a = new C56201b();

    private C56201b() {
    }

    static {
        Covode.recordClassIndex(66010);
    }

    /* renamed from: a */
    public static boolean m102110a() {
        Integer valueOf;
        C39256o a = C39223a.m79590d().mo68613a(0, "group_chat");
        if (!(a == null || (valueOf = Integer.valueOf(a.getShowType())) == null)) {
            if (valueOf.intValue() == 0 || valueOf.intValue() == 1) {
                return true;
            }
            valueOf.intValue();
        }
        return false;
    }
}
