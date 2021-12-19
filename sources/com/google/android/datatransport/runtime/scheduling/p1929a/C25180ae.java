package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.ae */
public final class C25180ae implements AbstractC88078c<C25175aa> {

    /* renamed from: a */
    private final AbstractC89405a<Context> f59645a;

    /* renamed from: b */
    private final AbstractC89405a<Integer> f59646b;

    static {
        Covode.recordClassIndex(30546);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C25175aa(this.f59645a.get(), this.f59646b.get().intValue());
    }

    public C25180ae(AbstractC89405a<Context> aVar, AbstractC89405a<Integer> aVar2) {
        this.f59645a = aVar;
        this.f59646b = aVar2;
    }
}
