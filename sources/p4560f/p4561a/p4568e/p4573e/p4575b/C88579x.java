package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88573v;
import p4560f.p4561a.p4568e.p4583i.EnumC88894c;
import p4560f.p4561a.p4588i.AbstractC88927a;
import p4560f.p4561a.p4588i.C88931d;
import p4560f.p4561a.p4592m.C88972b;

/* renamed from: f.a.e.e.b.x */
public final class C88579x<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final AbstractC88434g<? super AbstractC88924h<Throwable>, ? extends AbstractC90213b<?>> f200989c;

    static {
        Covode.recordClassIndex(104621);
    }

    /* renamed from: f.a.e.e.b.x$a */
    static final class C88580a<T> extends C88573v.AbstractC88576c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        static {
            Covode.recordClassIndex(104622);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            this.f200979c.cancel();
            this.f200977a.onComplete();
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            mo143045a(th);
        }

        C88580a(AbstractC90214c<? super T> cVar, AbstractC88927a<Throwable> aVar, AbstractC90215d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        C88972b bVar = new C88972b(cVar);
        AbstractC88927a<T> f = new C88931d().mo143209f();
        try {
            AbstractC90213b bVar2 = (AbstractC90213b) C88466b.m153697a(this.f200989c.apply(f), "handler returned a null Publisher");
            C88573v.C88575b bVar3 = new C88573v.C88575b(this.f200799b);
            C88580a aVar = new C88580a(bVar, f, bVar3);
            bVar3.f200976d = aVar;
            cVar.onSubscribe(aVar);
            bVar2.mo57509a_(bVar3);
            bVar3.onNext(0);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            EnumC88894c.error(th, cVar);
        }
    }

    public C88579x(AbstractC88924h<T> hVar, AbstractC88434g<? super AbstractC88924h<Throwable>, ? extends AbstractC90213b<?>> gVar) {
        super(hVar);
        this.f200989c = gVar;
    }
}
