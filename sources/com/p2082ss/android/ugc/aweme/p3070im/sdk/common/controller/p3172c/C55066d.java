package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.d */
public final class C55066d {

    /* renamed from: a */
    public static final C55066d f126022a = new C55066d();

    /* renamed from: b */
    private static final C55072j f126023b = new C55072j();

    private C55066d() {
    }

    static {
        Covode.recordClassIndex(64794);
    }

    /* renamed from: a */
    public static C55072j m100705a() {
        try {
            Object a = SettingsManager.m29616a().mo25396a("im_contact_update_freq", C55072j.class);
            C89219l.m154716b(a, "");
            return (C55072j) a;
        } catch (Throwable unused) {
            return f126023b;
        }
    }
}
