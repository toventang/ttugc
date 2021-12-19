package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.scheduling.AbstractC25213e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25228h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25235o;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.r */
public final class C25171r implements AbstractC88078c<C25168p> {

    /* renamed from: a */
    private final AbstractC89405a<AbstractC25148a> f59616a;

    /* renamed from: b */
    private final AbstractC89405a<AbstractC25148a> f59617b;

    /* renamed from: c */
    private final AbstractC89405a<AbstractC25213e> f59618c;

    /* renamed from: d */
    private final AbstractC89405a<C25228h> f59619d;

    /* renamed from: e */
    private final AbstractC89405a<C25235o> f59620e;

    static {
        Covode.recordClassIndex(30537);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C25168p(this.f59616a.get(), this.f59617b.get(), this.f59618c.get(), this.f59619d.get(), this.f59620e.get());
    }

    public C25171r(AbstractC89405a<AbstractC25148a> aVar, AbstractC89405a<AbstractC25148a> aVar2, AbstractC89405a<AbstractC25213e> aVar3, AbstractC89405a<C25228h> aVar4, AbstractC89405a<C25235o> aVar5) {
        this.f59616a = aVar;
        this.f59617b = aVar2;
        this.f59618c = aVar3;
        this.f59619d = aVar4;
        this.f59620e = aVar5;
    }
}
