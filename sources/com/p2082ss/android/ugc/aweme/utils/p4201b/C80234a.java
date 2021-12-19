package com.p2082ss.android.ugc.aweme.utils.p4201b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.b.a */
public final class C80234a {

    /* renamed from: a */
    public static final C80234a f179710a = new C80234a();

    private C80234a() {
    }

    static {
        Covode.recordClassIndex(93502);
    }

    /* renamed from: a */
    public static final C89391z m139070a(AbstractC89171a<String> aVar) {
        C89219l.m154721d(aVar, "");
        return m139071b(aVar);
    }

    /* renamed from: b */
    private static C89391z m139071b(AbstractC89171a<String> aVar) {
        String str;
        if (!((Boolean) C80235b.f179711a.getValue()).booleanValue()) {
            return null;
        }
        try {
            str = aVar.invoke();
        } catch (Throwable th) {
            str = "error:".concat(String.valueOf(th));
        }
        C51423a.m95784a(4, "EventbusIssueLogger", str);
        return null;
    }
}
