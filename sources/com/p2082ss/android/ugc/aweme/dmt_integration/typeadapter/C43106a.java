package com.p2082ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.typeadapter.a */
public final class C43106a {
    static {
        Covode.recordClassIndex(51273);
    }

    /* renamed from: b */
    public static final void m86002b(C28022o oVar, String str) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(str, "");
        AbstractC28019l c = oVar.mo46803c(str);
        if (c != null && !(c instanceof C28025r)) {
            oVar.mo46795a(str);
            oVar.mo46797a(str, c.mo46789j().mo46803c("path"));
        }
    }

    /* renamed from: a */
    public static final void m86000a(C28022o oVar, String str) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(str, "");
        C27919i e = oVar.mo46805e(str);
        if (e != null) {
            if (e.mo46684a() > 0) {
                AbstractC28019l a = e.mo46685a(0);
                C89219l.m154716b(a, "");
                if (!(a instanceof C28025r)) {
                    C27919i iVar = new C27919i();
                    int a2 = e.mo46684a();
                    for (int i = 0; i < a2; i++) {
                        AbstractC28019l a3 = e.mo46685a(i);
                        C89219l.m154716b(a3, "");
                        AbstractC28019l c = a3.mo46789j().mo46803c("path");
                        C89219l.m154716b(c, "");
                        iVar.mo46687a(c.mo46689c());
                    }
                    oVar.mo46795a(str);
                    oVar.mo46797a(str, iVar);
                }
            }
        }
    }

    /* renamed from: b */
    public static final void m86003b(C28022o oVar, String str, String str2) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC28019l c = oVar.mo46803c(str2);
        if (c != null) {
            oVar.mo46795a(str);
            oVar.mo46795a(str2);
            oVar.mo46797a(str, c.mo46789j().mo46803c("path"));
        }
    }

    /* renamed from: a */
    public static final void m86001a(C28022o oVar, String str, String str2) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C27919i e = oVar.mo46805e(str2);
        if (e != null) {
            if (e.mo46684a() > 0) {
                AbstractC28019l a = e.mo46685a(0);
                C89219l.m154716b(a, "");
                if (!(a instanceof C28025r)) {
                    C27919i iVar = new C27919i();
                    int a2 = e.mo46684a();
                    for (int i = 0; i < a2; i++) {
                        AbstractC28019l a3 = e.mo46685a(i);
                        C89219l.m154716b(a3, "");
                        AbstractC28019l c = a3.mo46789j().mo46803c("path");
                        C89219l.m154716b(c, "");
                        iVar.mo46687a(c.mo46689c());
                    }
                    oVar.mo46795a(str);
                    oVar.mo46795a(str2);
                    oVar.mo46797a(str, iVar);
                }
            }
        }
    }
}
