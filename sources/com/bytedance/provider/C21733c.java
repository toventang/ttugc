package com.bytedance.provider;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21747h;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.provider.c */
public final class C21733c<T extends AbstractC21747h> implements AbstractC21732b<T> {

    /* renamed from: a */
    final AbstractC88979t<T> f51501a;

    /* renamed from: b */
    public String f51502b;

    /* renamed from: c */
    private final C88958b<T> f51503c;

    static {
        Covode.recordClassIndex(25377);
    }

    @Override // com.bytedance.provider.AbstractC21732b
    /* renamed from: a */
    public final T mo35378a() {
        T i = this.f51503c.mo143221i();
        if (i == null) {
            C89219l.m154707a();
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.provider.c$a */
    public static final class C21734a<T> implements AbstractC88433f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88433f f51504a;

        static {
            Covode.recordClassIndex(25378);
        }

        C21734a(AbstractC88433f fVar) {
            this.f51504a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.f51504a.accept(obj);
        }
    }

    public C21733c(T t) {
        C89219l.m154719c(t, "");
        C88958b<T> a = C88958b.m154214a(t);
        C89219l.m154709a((Object) a, "");
        this.f51503c = a;
        this.f51501a = a.mo143283c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.l.b<T extends com.bytedance.provider.h> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.provider.AbstractC21732b
    /* renamed from: a */
    public final void mo35379a(AbstractC89172b<? super T, ? extends T> bVar) {
        C89219l.m154719c(bVar, "");
        this.f51502b = mo35378a().mo35386a();
        this.f51503c.onNext(bVar.invoke(mo35378a()));
    }
}
