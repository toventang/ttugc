package com.bytedance.nita;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.AbstractC21524b;
import com.bytedance.nita.api.AbstractC21525c;
import com.bytedance.nita.p1553a.C21522a;
import com.bytedance.nita.p1554b.C21533c;
import com.bytedance.nita.p1556d.AbstractC21551d;
import com.bytedance.nita.p1556d.C21552e;
import com.bytedance.nita.p1558f.C21565d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.a */
public final class C21521a {

    /* renamed from: a */
    public static Context f51097a;

    /* renamed from: b */
    public static AbstractC21524b f51098b;

    /* renamed from: c */
    public static final C21521a f51099c = new C21521a();

    private C21521a() {
    }

    static {
        Covode.recordClassIndex(25161);
    }

    /* renamed from: a */
    public static Context m40432a() {
        Context context = f51097a;
        if (context == null) {
            C89219l.m154710a("context");
        }
        return context;
    }

    /* renamed from: a */
    public final C21521a mo35181a(AbstractC21525c cVar) {
        C89219l.m154719c(cVar, "");
        C21565d.f51170b.mo35235a(cVar);
        return this;
    }

    /* renamed from: a */
    public final C21521a mo35182a(String str, int i, Context context) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        AbstractC21525c cVar = C21565d.f51169a.get(str);
        if (cVar != null) {
            if (context == null) {
                if (cVar.mo35189e() != 0) {
                    context = new C21522a(m40432a(), cVar.mo35189e());
                } else {
                    context = new C21522a(m40432a());
                }
            }
            C89219l.m154719c(cVar, "");
            AbstractC21551d dVar = C21552e.f51146a.get(cVar.mo35180c());
            if (dVar == null) {
                C89219l.m154707a();
            }
            dVar.mo35216a(cVar, context, i);
            return this;
        }
        throw new C21533c(str);
    }
}
