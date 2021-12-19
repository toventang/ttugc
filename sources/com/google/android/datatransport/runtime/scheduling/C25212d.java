package com.google.android.datatransport.runtime.scheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.AbstractC25129e;
import com.google.android.datatransport.runtime.p1926c.AbstractC25144b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25239s;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import dagger.p4535a.AbstractC88078c;
import java.util.concurrent.Executor;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.d */
public final class C25212d implements AbstractC88078c<C25172a> {

    /* renamed from: a */
    private final AbstractC89405a<Executor> f59694a;

    /* renamed from: b */
    private final AbstractC89405a<AbstractC25129e> f59695b;

    /* renamed from: c */
    private final AbstractC89405a<AbstractC25239s> f59696c;

    /* renamed from: d */
    private final AbstractC89405a<AbstractC25182c> f59697d;

    /* renamed from: e */
    private final AbstractC89405a<AbstractC25144b> f59698e;

    static {
        Covode.recordClassIndex(30578);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C25172a(this.f59694a.get(), this.f59695b.get(), this.f59696c.get(), this.f59697d.get(), this.f59698e.get());
    }

    public C25212d(AbstractC89405a<Executor> aVar, AbstractC89405a<AbstractC25129e> aVar2, AbstractC89405a<AbstractC25239s> aVar3, AbstractC89405a<AbstractC25182c> aVar4, AbstractC89405a<AbstractC25144b> aVar5) {
        this.f59694a = aVar;
        this.f59695b = aVar2;
        this.f59696c = aVar3;
        this.f59697d = aVar4;
        this.f59698e = aVar5;
    }
}
