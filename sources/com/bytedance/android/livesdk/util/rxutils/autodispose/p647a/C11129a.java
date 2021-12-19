package com.bytedance.android.livesdk.util.rxutils.autodispose.p647a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88432e;
import p4560f.p4561a.p4568e.p4584j.C88906h;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.a.a */
public final class C11129a {

    /* renamed from: a */
    private static volatile AbstractC88432e f26750a;

    static {
        Covode.recordClassIndex(12756);
    }

    /* renamed from: a */
    public static boolean m19768a(AbstractC88432e eVar) {
        Objects.requireNonNull(eVar, "defaultChecker == null");
        AbstractC88432e eVar2 = f26750a;
        if (eVar2 != null) {
            return eVar2.mo17930a();
        }
        try {
            return eVar.mo17930a();
        } catch (Exception e) {
            throw C88906h.m154104a(e);
        }
    }
}
