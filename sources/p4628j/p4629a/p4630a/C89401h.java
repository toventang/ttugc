package p4628j.p4629a.p4630a;

import com.bytedance.covode.number.Covode;

/* renamed from: j.a.a.h */
public final class C89401h<T> implements AbstractC89402i<T>, AbstractC89403j<T> {

    /* renamed from: a */
    private final C89399f f203065a;

    /* renamed from: b */
    private final Class<? extends T> f203066b;

    /* renamed from: c */
    private AbstractC89396c<T, ?>[] f203067c;

    static {
        Covode.recordClassIndex(105485);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89403j
    /* renamed from: a */
    public final AbstractC89402i<T> mo143777a(AbstractC89396c<T, ?>... cVarArr) {
        this.f203067c = cVarArr;
        return this;
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89402i
    /* renamed from: a */
    public final void mo143778a(AbstractC89398e<T> eVar) {
        AbstractC89396c<T, ?>[] cVarArr = this.f203067c;
        for (AbstractC89396c<T, ?> cVar : cVarArr) {
            this.f203065a.f203061c.mo143773a(this.f203066b, cVar, eVar);
        }
    }

    public C89401h(C89399f fVar, Class<? extends T> cls) {
        this.f203066b = cls;
        this.f203065a = fVar;
    }
}
