package com.google.android.datatransport.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.AbstractC25115h;
import com.google.android.datatransport.runtime.C25146d;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.scheduling.AbstractC25213e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25228h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25235o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.RunnableC25236p;

/* renamed from: com.google.android.datatransport.runtime.p */
public class C25168p implements AbstractC25167o {

    /* renamed from: b */
    private static volatile AbstractC25169q f59611b;

    /* renamed from: a */
    public final C25228h f59612a;

    /* renamed from: c */
    private final AbstractC25148a f59613c;

    /* renamed from: d */
    private final AbstractC25148a f59614d;

    /* renamed from: e */
    private final AbstractC25213e f59615e;

    static {
        Covode.recordClassIndex(30534);
    }

    /* renamed from: a */
    public static C25168p m48272a() {
        AbstractC25169q qVar = f59611b;
        if (qVar != null) {
            return qVar.mo41130a();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: a */
    public static void m48273a(Context context) {
        MethodCollector.m26663i(3354);
        if (f59611b == null) {
            synchronized (C25168p.class) {
                try {
                    if (f59611b == null) {
                        f59611b = new C25146d.C25147a((byte) 0).mo41132a(context).mo41133a();
                    }
                } finally {
                    MethodCollector.m26664o(3354);
                }
            }
            return;
        }
        MethodCollector.m26664o(3354);
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25167o
    /* renamed from: a */
    public final void mo41147a(AbstractC25160j jVar, AbstractC25115h hVar) {
        AbstractC25213e eVar = this.f59615e;
        AbstractC25162k a = jVar.mo41081a();
        eVar.mo41149a(AbstractC25162k.m48261d().mo41125a(a.mo41119a()).mo41124a(jVar.mo41083c().mo40985c()).mo41126a(a.mo41120b()).mo41127a(), AbstractC25157h.m48227i().mo41073a(this.f59613c.mo41134a()).mo41079b(this.f59614d.mo41134a()).mo41076a(jVar.mo41082b()).mo41074a(new C25156g(jVar.mo41085e(), jVar.mo41084d().mo41061a(jVar.mo41083c().mo40984b()))).mo41075a(jVar.mo41083c().mo40983a()).mo41080b(), hVar);
    }

    C25168p(AbstractC25148a aVar, AbstractC25148a aVar2, AbstractC25213e eVar, C25228h hVar, C25235o oVar) {
        this.f59613c = aVar;
        this.f59614d = aVar2;
        this.f59615e = eVar;
        this.f59612a = hVar;
        oVar.f59755a.execute(new RunnableC25236p(oVar));
    }
}
