package com.p2082ss.android.ugc.aweme.discover.lynx.spark;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42246j;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.a */
public final class C42264a {

    /* renamed from: a */
    public static String[] f98472a = new String[0];

    /* renamed from: b */
    public static final C42264a f98473b = new C42264a();

    private C42264a() {
    }

    static {
        Covode.recordClassIndex(50206);
    }

    /* renamed from: a */
    private static String[] m84608a() {
        Object a = SettingsManager.m29616a().mo25397a("spark_card_list", String[].class, f98472a);
        if (a == null) {
            C89219l.m154715b();
        }
        return (String[]) a;
    }

    /* renamed from: a */
    public static boolean m84607a(String str) {
        C89219l.m154721d(str, "");
        return C89064i.m154489a(m84608a(), C42246j.C42247a.m84556a(str));
    }
}
