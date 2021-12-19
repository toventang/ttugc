package com.p2082ss.android.ugc.aweme.net.p3491d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.d.c */
public final class C61336c {

    /* renamed from: a */
    public static final C61336c f139303a = new C61336c();

    private C61336c() {
    }

    static {
        Covode.recordClassIndex(71969);
    }

    /* renamed from: a */
    public static String[] m111029a() {
        try {
            Object a = SettingsManager.m29616a().mo25396a("rrq_path_white_list", String[].class);
            C89219l.m154716b(a, "");
            return (String[]) a;
        } catch (Throwable unused) {
            return new String[]{"/aweme/v1/aweme/stats/"};
        }
    }
}
