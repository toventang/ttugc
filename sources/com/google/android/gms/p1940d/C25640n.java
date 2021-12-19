package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.d.n */
final class C25640n<TResult, TContinuationResult> implements AbstractC25625b, AbstractC25627d, AbstractC25628e<TContinuationResult>, AbstractC25652z<TResult> {

    /* renamed from: a */
    final AbstractC25619a<TResult, AbstractC25631h<TContinuationResult>> f60763a;

    /* renamed from: b */
    final C25622ac<TContinuationResult> f60764b;

    /* renamed from: c */
    private final Executor f60765c;

    static {
        Covode.recordClassIndex(31051);
    }

    public C25640n(Executor executor, AbstractC25619a<TResult, AbstractC25631h<TContinuationResult>> aVar, C25622ac<TContinuationResult> acVar) {
        this.f60765c = executor;
        this.f60763a = aVar;
        this.f60764b = acVar;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: a */
    public final void mo41899a(AbstractC25631h<TResult> hVar) {
        this.f60765c.execute(new RunnableC25641o(this, hVar));
    }

    @Override // com.google.android.gms.p1940d.AbstractC25628e
    /* renamed from: a */
    public final void mo34354a(TContinuationResult tcontinuationresult) {
        this.f60764b.mo41879a(tcontinuationresult);
    }

    @Override // com.google.android.gms.p1940d.AbstractC25627d
    /* renamed from: a */
    public final void mo34353a(Exception exc) {
        this.f60764b.mo41878a(exc);
    }

    @Override // com.google.android.gms.p1940d.AbstractC25625b
    /* renamed from: a */
    public final void mo41891a() {
        this.f60764b.mo41888f();
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: N_ */
    public final void mo41898N_() {
        throw new UnsupportedOperationException();
    }
}
