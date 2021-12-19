package com.google.android.datatransport.runtime.scheduling.p1929a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.z */
public final class C25209z implements AbstractC88078c<C25188h> {

    /* renamed from: a */
    private final AbstractC89405a<AbstractC25148a> f59683a;

    /* renamed from: b */
    private final AbstractC89405a<AbstractC25148a> f59684b;

    /* renamed from: c */
    private final AbstractC89405a<AbstractC25183d> f59685c;

    /* renamed from: d */
    private final AbstractC89405a<C25175aa> f59686d;

    static {
        Covode.recordClassIndex(30575);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C25188h(this.f59683a.get(), this.f59684b.get(), this.f59685c.get(), this.f59686d.get());
    }

    public C25209z(AbstractC89405a<AbstractC25148a> aVar, AbstractC89405a<AbstractC25148a> aVar2, AbstractC89405a<AbstractC25183d> aVar3, AbstractC89405a<C25175aa> aVar4) {
        this.f59683a = aVar;
        this.f59684b = aVar2;
        this.f59685c = aVar3;
        this.f59686d = aVar4;
    }
}
