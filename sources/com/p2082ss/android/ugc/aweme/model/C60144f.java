package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.f */
public final class C60144f {

    /* renamed from: a */
    public static final C60144f f137088a;

    /* renamed from: b */
    private static String f137089b;

    private C60144f() {
    }

    static {
        Covode.recordClassIndex(70671);
        C60144f fVar = new C60144f();
        f137088a = fVar;
        f137089b = fVar.getClass().getSimpleName();
    }

    /* renamed from: a */
    public static C60143e m109615a(C28022o oVar, AbstractC60142d dVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        try {
            if (oVar.mo46802b("hex")) {
                AbstractC28019l c = oVar.mo46803c("key");
                C89219l.m154716b(c, "");
                C60143e eVar = new C60143e(c.mo46689c());
                AbstractC28019l c2 = oVar.mo46803c("hex");
                C89219l.m154716b(c2, "");
                eVar.f137085a = c2.mo46689c();
                return eVar;
            } else if (oVar.mo46802b("thumbnail")) {
                AbstractC28019l c3 = oVar.mo46803c("key");
                C89219l.m154716b(c3, "");
                C60143e eVar2 = new C60143e(c3.mo46689c());
                AbstractC28019l c4 = oVar.mo46789j().mo46803c("thumbnail");
                C89219l.m154716b(c4, "");
                eVar2.f137086b = c4.mo46689c();
                return eVar2;
            } else {
                if (oVar.mo46789j().mo46802b("gradient")) {
                    AbstractC28019l c5 = oVar.mo46789j().mo46803c("key");
                    C89219l.m154716b(c5, "");
                    String c6 = c5.mo46689c();
                    C89219l.m154716b(c6, "");
                    C60147i iVar = new C60147i(c6);
                    AbstractC28019l c7 = oVar.mo46803c("gradient");
                    C89219l.m154716b(c7, "");
                    AbstractC28019l c8 = c7.mo46789j().mo46803c("direction");
                    C89219l.m154716b(c8, "");
                    iVar.f137095d = c8.mo46694g();
                    AbstractC28019l c9 = oVar.mo46803c("gradient");
                    C89219l.m154716b(c9, "");
                    AbstractC28019l c10 = c9.mo46789j().mo46803c("colors");
                    C89219l.m154716b(c10, "");
                    Iterator<AbstractC28019l> it = c10.mo46790k().iterator();
                    while (it.hasNext()) {
                        AbstractC28019l next = it.next();
                        C60143e eVar3 = new C60143e(null);
                        C89219l.m154716b(next, "");
                        AbstractC28019l c11 = next.mo46789j().mo46803c("hex");
                        C89219l.m154716b(c11, "");
                        eVar3.f137085a = c11.mo46689c();
                        iVar.f137096e.add(eVar3);
                    }
                    return iVar;
                }
                return null;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
