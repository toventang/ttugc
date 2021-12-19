package com.bytedance.jedi.p1445a.p1462l;

import com.bytedance.covode.number.Covode;
import com.p1809e.p1810a.AbstractC23829c;
import com.p1809e.p1810a.C23827b;
import com.p1809e.p1810a.C23830d;
import java.lang.ref.WeakReference;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.a.l.f */
public final class C20324f<K, V> implements AbstractC20320c<C89378p<? extends K, ? extends V>> {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f48172a = {new C89232y(C89204ab.m154669a(C20324f.class), "subject", "getSubject()Lcom/jakewharton/rxrelay2/Relay;")};

    /* renamed from: b */
    public final WeakReference<AbstractC20318a<C89378p<K, V>>> f48173b;

    /* renamed from: c */
    private final AbstractC89244h f48174c = C89250i.m154773a((AbstractC89171a) C20326b.f48176a);

    /* renamed from: a */
    private final AbstractC23829c<AbstractC20319b<C89378p<K, V>>> m38512a() {
        return (AbstractC23829c) this.f48174c.getValue();
    }

    /* renamed from: com.bytedance.jedi.a.l.f$b */
    static final class C20326b extends AbstractC89220m implements AbstractC89171a<AbstractC23829c<AbstractC20319b<C89378p<? extends K, ? extends V>>>> {

        /* renamed from: a */
        public static final C20326b f48176a = new C20326b();

        static {
            Covode.recordClassIndex(23834);
        }

        C20326b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return new C23830d(new C23827b());
        }
    }

    static {
        Covode.recordClassIndex(23832);
    }

    @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20320c
    /* renamed from: b */
    public final AbstractC88979t<AbstractC20319b<C89378p<K, V>>> mo33478b() {
        AbstractC88979t<AbstractC20319b<C89378p<K, V>>> b = m38512a().mo143280b(new C20325a(this));
        C89219l.m154709a((Object) b, "");
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.l.f$a */
    public static final class C20325a<T> implements AbstractC88433f<AbstractC20319b<C89378p<? extends K, ? extends V>>> {

        /* renamed from: a */
        final /* synthetic */ C20324f f48175a;

        static {
            Covode.recordClassIndex(23833);
        }

        C20325a(C20324f fVar) {
            this.f48175a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC20319b bVar = (AbstractC20319b) obj;
            AbstractC20318a<C89378p<K, V>> aVar = this.f48175a.f48173b.get();
            if (aVar == null) {
                C89219l.m154707a();
            }
            C89219l.m154709a((Object) aVar, "");
            bVar.mo33658b(aVar);
        }
    }

    public C20324f(AbstractC20318a<C89378p<K, V>> aVar) {
        C89219l.m154719c(aVar, "");
        this.f48173b = new WeakReference<>(aVar);
    }

    @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20320c
    /* renamed from: a */
    public final void mo33477a(AbstractC20319b<C89378p<K, V>> bVar) {
        C89219l.m154719c(bVar, "");
        m38512a().accept(bVar);
    }
}
