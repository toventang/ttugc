package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.e */
public final class C56658e {

    /* renamed from: a */
    public static final C56658e f129132a = new C56658e();

    private C56658e() {
    }

    static {
        Covode.recordClassIndex(66506);
    }

    /* renamed from: a */
    public static final C56657d m102660a() {
        try {
            Object a = SettingsManager.m29616a().mo25396a("live_ecommerce_config", C56657d.class);
            C89219l.m154716b(a, "");
            return (C56657d) a;
        } catch (Exception unused) {
            return new C56657d();
        }
    }
}
