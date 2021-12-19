package com.p2082ss.android.ugc.aweme.notice.api.p3511c.p3512a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.c.a.a */
public final class C61564a {

    /* renamed from: a */
    public static final String[] f139739a = new String[0];

    /* renamed from: b */
    public static final C61564a f139740b = new C61564a();

    private C61564a() {
    }

    static {
        Covode.recordClassIndex(72239);
    }

    /* renamed from: a */
    public static final String[] m111474a() {
        try {
            Object a = SettingsManager.m29616a().mo25396a("boe_ws_host_list", String[].class);
            C89219l.m154716b(a, "");
            return (String[]) a;
        } catch (Throwable unused) {
            return new String[0];
        }
    }
}
