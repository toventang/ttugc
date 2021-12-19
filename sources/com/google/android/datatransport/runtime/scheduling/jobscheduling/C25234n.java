package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.AbstractC25129e;
import com.google.android.datatransport.runtime.p1926c.AbstractC25144b;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import dagger.p4535a.AbstractC88078c;
import java.util.concurrent.Executor;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.n */
public final class C25234n implements AbstractC88078c<C25228h> {

    /* renamed from: a */
    private final AbstractC89405a<Context> f59748a;

    /* renamed from: b */
    private final AbstractC89405a<AbstractC25129e> f59749b;

    /* renamed from: c */
    private final AbstractC89405a<AbstractC25182c> f59750c;

    /* renamed from: d */
    private final AbstractC89405a<AbstractC25239s> f59751d;

    /* renamed from: e */
    private final AbstractC89405a<Executor> f59752e;

    /* renamed from: f */
    private final AbstractC89405a<AbstractC25144b> f59753f;

    /* renamed from: g */
    private final AbstractC89405a<AbstractC25148a> f59754g;

    static {
        Covode.recordClassIndex(30602);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C25228h(this.f59748a.get(), this.f59749b.get(), this.f59750c.get(), this.f59751d.get(), this.f59752e.get(), this.f59753f.get(), this.f59754g.get());
    }

    public C25234n(AbstractC89405a<Context> aVar, AbstractC89405a<AbstractC25129e> aVar2, AbstractC89405a<AbstractC25182c> aVar3, AbstractC89405a<AbstractC25239s> aVar4, AbstractC89405a<Executor> aVar5, AbstractC89405a<AbstractC25144b> aVar6, AbstractC89405a<AbstractC25148a> aVar7) {
        this.f59748a = aVar;
        this.f59749b = aVar2;
        this.f59750c = aVar3;
        this.f59751d = aVar4;
        this.f59752e = aVar5;
        this.f59753f = aVar6;
        this.f59754g = aVar7;
    }
}
