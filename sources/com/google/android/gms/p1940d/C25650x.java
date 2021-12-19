package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.d.x */
final class C25650x<TResult, TContinuationResult> implements AbstractC25625b, AbstractC25627d, AbstractC25628e<TContinuationResult>, AbstractC25652z<TResult> {

    /* renamed from: a */
    final AbstractC25630g<TResult, TContinuationResult> f60787a;

    /* renamed from: b */
    private final Executor f60788b;

    /* renamed from: c */
    private final C25622ac<TContinuationResult> f60789c;

    static {
        Covode.recordClassIndex(31061);
    }

    public C25650x(Executor executor, AbstractC25630g<TResult, TContinuationResult> gVar, C25622ac<TContinuationResult> acVar) {
        this.f60788b = executor;
        this.f60787a = gVar;
        this.f60789c = acVar;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: a */
    public final void mo41899a(AbstractC25631h<TResult> hVar) {
        this.f60788b.execute(new RunnableC25651y(this, hVar));
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: N_ */
    public final void mo41898N_() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.p1940d.AbstractC25628e
    /* renamed from: a */
    public final void mo34354a(TContinuationResult tcontinuationresult) {
        this.f60789c.mo41879a(tcontinuationresult);
    }

    @Override // com.google.android.gms.p1940d.AbstractC25627d
    /* renamed from: a */
    public final void mo34353a(Exception exc) {
        this.f60789c.mo41878a(exc);
    }

    @Override // com.google.android.gms.p1940d.AbstractC25625b
    /* renamed from: a */
    public final void mo41891a() {
        this.f60789c.mo41888f();
    }
}
