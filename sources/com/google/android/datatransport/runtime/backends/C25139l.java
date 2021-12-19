package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import dagger.p4535a.AbstractC88078c;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.backends.l */
public final class C25139l implements AbstractC88078c<C25137k> {

    /* renamed from: a */
    private final AbstractC89405a<Context> f59574a;

    /* renamed from: b */
    private final AbstractC89405a<C25135i> f59575b;

    static {
        Covode.recordClassIndex(30505);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return new C25137k(this.f59574a.get(), this.f59575b.get());
    }

    public C25139l(AbstractC89405a<Context> aVar, AbstractC89405a<C25135i> aVar2) {
        this.f59574a = aVar;
        this.f59575b = aVar2;
    }
}
