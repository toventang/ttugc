package com.bytedance.ies.powerlist;

import android.app.Application;
import android.widget.Space;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.optimize.p1233a.C17663a;
import com.p2082ss.android.ugc.aweme.services.PowerContextImpl;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.c */
public final class C17643c {

    /* renamed from: a */
    public static Space f42193a;

    /* renamed from: b */
    public static final C17643c f42194b = new C17643c();

    /* renamed from: c */
    private static Application f42195c;

    /* renamed from: d */
    private static boolean f42196d;

    /* renamed from: e */
    private static final AbstractC89244h f42197e = C89250i.m154773a((AbstractC89171a) C17644a.f42198a);

    /* renamed from: a */
    public static C17663a m32758a() {
        return (C17663a) f42197e.getValue();
    }

    private C17643c() {
    }

    /* renamed from: com.bytedance.ies.powerlist.c$a */
    static final class C17644a extends AbstractC89220m implements AbstractC89171a<C17663a> {

        /* renamed from: a */
        public static final C17644a f42198a = new C17644a();

        static {
            Covode.recordClassIndex(20197);
        }

        C17644a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17663a invoke() {
            return new C17663a();
        }
    }

    static {
        Covode.recordClassIndex(20196);
    }

    /* renamed from: b */
    public final Application mo28112b() {
        MethodCollector.m26663i(6017);
        Application application = f42195c;
        if (application == null) {
            C89219l.m154710a("app");
        }
        if (application == null && !f42196d) {
            synchronized (this) {
                try {
                    if (!f42196d) {
                        IPowerContext createIPowerContextbyMonsterPlugin = PowerContextImpl.createIPowerContextbyMonsterPlugin(false);
                        C89219l.m154709a((Object) createIPowerContextbyMonsterPlugin, "");
                        Application application2 = createIPowerContextbyMonsterPlugin.getApplication();
                        if (application2 != null) {
                            m32759a(application2);
                        }
                        f42196d = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6017);
                    throw th;
                }
            }
        }
        Application application3 = f42195c;
        if (application3 == null) {
            C89219l.m154710a("app");
        }
        MethodCollector.m26664o(6017);
        return application3;
    }

    /* renamed from: a */
    public static void m32759a(Application application) {
        MethodCollector.m26663i(6016);
        C89219l.m154719c(application, "");
        f42193a = new Space(application);
        f42195c = application;
        MethodCollector.m26664o(6016);
    }
}
