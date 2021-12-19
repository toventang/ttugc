package com.google.android.datatransport.runtime.scheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.AbstractC25115h;
import com.google.android.datatransport.runtime.AbstractC25157h;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.C25168p;
import com.google.android.datatransport.runtime.backends.AbstractC25129e;
import com.google.android.datatransport.runtime.p1926c.AbstractC25144b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25239s;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a */
public final class C25172a implements AbstractC25213e {

    /* renamed from: a */
    static final Logger f59621a = Logger.getLogger(C25168p.class.getName());

    /* renamed from: b */
    final AbstractC25239s f59622b;

    /* renamed from: c */
    final AbstractC25129e f59623c;

    /* renamed from: d */
    final AbstractC25182c f59624d;

    /* renamed from: e */
    final AbstractC25144b f59625e;

    /* renamed from: f */
    private final Executor f59626f;

    static {
        Covode.recordClassIndex(30538);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.AbstractC25213e
    /* renamed from: a */
    public final void mo41149a(AbstractC25162k kVar, AbstractC25157h hVar, AbstractC25115h hVar2) {
        this.f59626f.execute(new RunnableC25210b(this, kVar, hVar2, hVar));
    }

    public C25172a(Executor executor, AbstractC25129e eVar, AbstractC25239s sVar, AbstractC25182c cVar, AbstractC25144b bVar) {
        this.f59626f = executor;
        this.f59623c = eVar;
        this.f59622b = sVar;
        this.f59624d = cVar;
        this.f59625e = bVar;
    }
}
