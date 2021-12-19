package com.bytedance.nita.p1558f;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.C21521a;
import com.bytedance.nita.api.AbstractC21524b;
import com.bytedance.nita.api.AbstractC21525c;
import com.bytedance.nita.p1553a.C21522a;
import com.bytedance.nita.p1554b.C21533c;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.bytedance.nita.p1557e.C21558b;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.f.d */
public final class C21565d {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, AbstractC21525c> f51169a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C21565d f51170b = new C21565d();

    private C21565d() {
    }

    static {
        Covode.recordClassIndex(25206);
    }

    /* renamed from: a */
    public final void mo35235a(AbstractC21525c cVar) {
        MethodCollector.m26663i(3127);
        C89219l.m154719c(cVar, "");
        synchronized (this) {
            try {
                f51169a.put(cVar.mo35178a(), cVar);
            } finally {
                MethodCollector.m26664o(3127);
            }
        }
    }

    /* renamed from: a */
    public static <T> T m40499a(String str, int i, Context context) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(context, "");
        long currentTimeMillis = System.currentTimeMillis();
        T t = (T) HandlerC21534a.f51121f.mo35202b(str, i, context);
        AbstractC21525c cVar = f51169a.get(str);
        if (cVar != null) {
            boolean z = true;
            if (t != null) {
                m40500a(cVar, t, context, true);
                AbstractC21524b bVar = C21521a.f51098b;
                if (bVar != null) {
                    bVar.mo35197a(System.currentTimeMillis() - currentTimeMillis, cVar, true);
                }
                return t;
            }
            T t2 = (T) HandlerC21534a.f51121f.mo35202b(str, i, context);
            if (t2 == null) {
                long currentTimeMillis2 = System.currentTimeMillis();
                C89219l.m154719c(cVar, "");
                C89219l.m154719c(context, "");
                t2 = (T) cVar.mo35179b().mo35234a(context, cVar.mo35192b(context), i);
                AbstractC21524b bVar2 = C21521a.f51098b;
                if (bVar2 != null) {
                    bVar2.mo35196a(System.currentTimeMillis() - currentTimeMillis2, cVar);
                }
                z = false;
            } else {
                m40500a(cVar, t2, context, true);
            }
            AbstractC21524b bVar3 = C21521a.f51098b;
            if (bVar3 != null) {
                bVar3.mo35197a(System.currentTimeMillis() - currentTimeMillis, cVar, z);
            }
            if (t2 == null) {
                C89219l.m154707a();
            }
            return t2;
        }
        throw new C21533c(str);
    }

    /* renamed from: a */
    private static void m40500a(AbstractC21525c cVar, View view, Context context, boolean z) {
        if (view != null) {
            if (!(context instanceof Activity)) {
                view.getClass().getSimpleName();
            } else if (view.getContext() instanceof C21522a) {
                Context context2 = view.getContext();
                if (context2 != null) {
                    ((C21522a) context2).mo35183a(context);
                    Activity activity = (Activity) context;
                    C21558b.m40490a(view, activity);
                    if (cVar != null) {
                        cVar.mo35188a(view, activity);
                        return;
                    }
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
    }
}
