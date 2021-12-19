package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.p1926c.AbstractC25144b;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import dagger.p4535a.AbstractC88078c;
import java.util.concurrent.Executor;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
public final class C25238r implements AbstractC88078c<C25235o> {

    /* renamed from: a */
    private final AbstractC89405a<Executor> f59761a;

    /* renamed from: b */
    private final AbstractC89405a<AbstractC25182c> f59762b;

    /* renamed from: c */
    private final AbstractC89405a<AbstractC25239s> f59763c;

    /* renamed from: d */
    private final AbstractC89405a<AbstractC25144b> f59764d;

    static {
        Covode.recordClassIndex(30606);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C25235o(this.f59761a.get(), this.f59762b.get(), this.f59763c.get(), this.f59764d.get());
    }

    public C25238r(AbstractC89405a<Executor> aVar, AbstractC89405a<AbstractC25182c> aVar2, AbstractC89405a<AbstractC25239s> aVar3, AbstractC89405a<AbstractC25144b> aVar4) {
        this.f59761a = aVar;
        this.f59762b = aVar2;
        this.f59763c = aVar3;
        this.f59764d = aVar4;
    }
}
