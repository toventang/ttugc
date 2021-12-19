package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.d.l */
public final class C25638l<TResult, TContinuationResult> implements AbstractC25652z<TResult> {

    /* renamed from: a */
    final AbstractC25619a<TResult, TContinuationResult> f60758a;

    /* renamed from: b */
    final C25622ac<TContinuationResult> f60759b;

    /* renamed from: c */
    private final Executor f60760c;

    static {
        Covode.recordClassIndex(31049);
    }

    public C25638l(Executor executor, AbstractC25619a<TResult, TContinuationResult> aVar, C25622ac<TContinuationResult> acVar) {
        this.f60760c = executor;
        this.f60758a = aVar;
        this.f60759b = acVar;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: a */
    public final void mo41899a(AbstractC25631h<TResult> hVar) {
        this.f60760c.execute(new RunnableC25639m(this, hVar));
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: N_ */
    public final void mo41898N_() {
        throw new UnsupportedOperationException();
    }
}
