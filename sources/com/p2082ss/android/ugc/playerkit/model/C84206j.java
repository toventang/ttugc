package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.playerkit.model.j */
public final class C84206j {

    /* renamed from: a */
    public static boolean f188022a;

    /* renamed from: b */
    public static HashMap<String, Long> f188023b = new HashMap<>(1);

    /* renamed from: c */
    public static final C84206j f188024c = new C84206j();

    private C84206j() {
    }

    static {
        Covode.recordClassIndex(98113);
    }

    /* renamed from: a */
    public static boolean m144803a(C84217p pVar) {
        if (pVar != null && f188022a) {
            C84199c cVar = C84199c.f187979a;
            C89219l.m154709a((Object) cVar, "");
            if (cVar.getPlayerBackgroundSleepStrategy() != 2 || pVar.f188183av) {
                return false;
            }
            return true;
        }
        return false;
    }
}
