package com.google.android.datatransport.runtime.scheduling;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.AbstractC25115h;
import com.google.android.datatransport.runtime.AbstractC25157h;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.backends.AbstractC25140m;

/* renamed from: com.google.android.datatransport.runtime.scheduling.b */
final /* synthetic */ class RunnableC25210b implements Runnable {

    /* renamed from: a */
    private final C25172a f59687a;

    /* renamed from: b */
    private final AbstractC25162k f59688b;

    /* renamed from: c */
    private final AbstractC25115h f59689c;

    /* renamed from: d */
    private final AbstractC25157h f59690d;

    static {
        Covode.recordClassIndex(30576);
    }

    RunnableC25210b(C25172a aVar, AbstractC25162k kVar, AbstractC25115h hVar, AbstractC25157h hVar2) {
        this.f59687a = aVar;
        this.f59688b = kVar;
        this.f59689c = hVar;
        this.f59690d = hVar2;
    }

    public final void run() {
        C25172a aVar = this.f59687a;
        AbstractC25162k kVar = this.f59688b;
        AbstractC25157h hVar = this.f59690d;
        try {
            AbstractC25140m a = aVar.f59623c.mo41117a(kVar.mo41119a());
            if (a == null) {
                String a2 = C1764a.m5928a("Transport backend '%s' is not registered", new Object[]{kVar.mo41119a()});
                C25172a.f59621a.warning(a2);
                new IllegalArgumentException(a2);
                return;
            }
            aVar.f59625e.mo41128a(new C25211c(aVar, kVar, a.mo41060a(hVar)));
        } catch (Exception e) {
            C25172a.f59621a.warning("Error scheduling event " + e.getMessage());
        }
    }
}
