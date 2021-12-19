package com.bytedance.analytics.p125b;

import com.bytedance.analytics.page.C2602f;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Map;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.analytics.b.a */
public final class C2593a {

    /* renamed from: a */
    public static final C2593a f7809a = new C2593a();

    /* renamed from: b */
    public static AbstractC89183m<? super String, ? super Map<String, String>, C89391z> f7810b;

    static {
        Covode.recordClassIndex(2980);
    }

    private C2593a() {
    }

    /* renamed from: a */
    public static final void m7538a(C2602f fVar) {
        C89219l.m154721d(fVar, "");
        AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar = f7810b;
        if (mVar != null) {
            mVar.invoke("btm_page_show", fVar.mo7088a());
        }
    }

    /* renamed from: a */
    public static void m7539a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Map b = C89041ag.m154427b(C89387v.m154943a(StringSet.type, str), C89387v.m154943a("msg", str2));
        AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar = f7810b;
        if (mVar != null) {
            mVar.invoke("btmSDK", b);
        }
    }
}
