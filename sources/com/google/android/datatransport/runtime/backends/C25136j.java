package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.backends.j */
public final class C25136j implements AbstractC88078c<C25135i> {

    /* renamed from: a */
    private final AbstractC89405a<Context> f59566a;

    /* renamed from: b */
    private final AbstractC89405a<AbstractC25148a> f59567b;

    /* renamed from: c */
    private final AbstractC89405a<AbstractC25148a> f59568c;

    static {
        Covode.recordClassIndex(30502);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C25135i(this.f59566a.get(), this.f59567b.get(), this.f59568c.get());
    }

    public C25136j(AbstractC89405a<Context> aVar, AbstractC89405a<AbstractC25148a> aVar2, AbstractC89405a<AbstractC25148a> aVar3) {
        this.f59566a = aVar;
        this.f59567b = aVar2;
        this.f59568c = aVar3;
    }
}
