package com.p2082ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.account.util.p */
public final class C33047p {

    /* renamed from: a */
    public static String f78597a;

    /* renamed from: b */
    public static final C33047p f78598b = new C33047p();

    /* renamed from: c */
    private static final List<String> f78599c = C89070n.m154522b("local_test", "local_dev", "test", "lark_inhouse", "inhouse");

    private C33047p() {
    }

    /* renamed from: a */
    public static final boolean m67683a() {
        return f78599c.contains(C17867d.f42595s);
    }

    /* renamed from: b */
    public static Map<String, String> m67684b() {
        C89378p[] pVarArr = new C89378p[1];
        String str = f78597a;
        if (str == null) {
            str = C58071d.m104913g();
        }
        pVarArr[0] = C89387v.m154943a("carrier_region", str);
        return C89041ag.m154428c(pVarArr);
    }

    static {
        Covode.recordClassIndex(39854);
    }
}
