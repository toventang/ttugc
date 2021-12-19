package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4583i.C88896e;
import p4560f.p4561a.p4568e.p4583i.EnumC88894c;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4588i.AbstractC88927a;
import p4560f.p4561a.p4588i.C88931d;
import p4560f.p4561a.p4592m.C88972b;

/* renamed from: f.a.e.e.b.v */
public final class C88573v<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final AbstractC88434g<? super AbstractC88924h<Object>, ? extends AbstractC90213b<?>> f200972c;

    static {
        Covode.recordClassIndex(104615);
    }

    /* renamed from: f.a.e.e.b.v$b */
    static final class C88575b<T, U> extends AtomicInteger implements AbstractC88955l<Object>, AbstractC90215d {
        private static final long serialVersionUID = 2827772011130406689L;

        /* renamed from: a */
        final AbstractC90213b<T> f200973a;

        /* renamed from: b */
        final AtomicReference<AbstractC90215d> f200974b = new AtomicReference<>();

        /* renamed from: c */
        final AtomicLong f200975c = new AtomicLong();

        /* renamed from: d */
        AbstractC88576c<T, U> f200976d;

        static {
            Covode.recordClassIndex(104617);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            EnumC88897f.cancel(this.f200974b);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            this.f200976d.cancel();
            this.f200976d.f200977a.onComplete();
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            EnumC88897f.deferredSetOnce(this.f200974b, this.f200975c, dVar);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            EnumC88897f.deferredRequest(this.f200974b, this.f200975c, j);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            this.f200976d.cancel();
            this.f200976d.f200977a.onError(th);
        }

        C88575b(AbstractC90213b<T> bVar) {
            this.f200973a = bVar;
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f200974b.get() != EnumC88897f.CANCELLED) {
                    this.f200973a.mo57509a_(this.f200976d);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: f.a.e.e.b.v$a */
    static final class C88574a<T> extends AbstractC88576c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        static {
            Covode.recordClassIndex(104616);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            mo143045a(0);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            this.f200979c.cancel();
            this.f200977a.onError(th);
        }

        C88574a(AbstractC90214c<? super T> cVar, AbstractC88927a<Object> aVar, AbstractC90215d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.b.v$c */
    public static abstract class AbstractC88576c<T, U> extends C88896e implements AbstractC88955l<T> {
        private static final long serialVersionUID = -5604623027276966720L;

        /* renamed from: a */
        protected final AbstractC90214c<? super T> f200977a;

        /* renamed from: b */
        protected final AbstractC88927a<U> f200978b;

        /* renamed from: c */
        protected final AbstractC90215d f200979c;

        /* renamed from: l */
        private long f200980l;

        static {
            Covode.recordClassIndex(104618);
        }

        @Override // org.p4663a.AbstractC90215d, p4560f.p4561a.p4568e.p4583i.C88896e
        public final void cancel() {
            super.cancel();
            this.f200979c.cancel();
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            setSubscription(dVar);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            this.f200980l++;
            this.f200977a.onNext(t);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo143045a(U u) {
            setSubscription(EnumC88894c.INSTANCE);
            long j = this.f200980l;
            if (j != 0) {
                this.f200980l = 0;
                produced(j);
            }
            this.f200979c.request(1);
            this.f200978b.onNext(u);
        }

        AbstractC88576c(AbstractC90214c<? super T> cVar, AbstractC88927a<U> aVar, AbstractC90215d dVar) {
            super(false);
            this.f200977a = cVar;
            this.f200978b = aVar;
            this.f200979c = dVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        C88972b bVar = new C88972b(cVar);
        AbstractC88927a<T> f = new C88931d().mo143209f();
        try {
            AbstractC90213b bVar2 = (AbstractC90213b) C88466b.m153697a(this.f200972c.apply(f), "handler returned a null Publisher");
            C88575b bVar3 = new C88575b(this.f200799b);
            C88574a aVar = new C88574a(bVar, f, bVar3);
            bVar3.f200976d = aVar;
            cVar.onSubscribe(aVar);
            bVar2.mo57509a_(bVar3);
            bVar3.onNext(0);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            EnumC88894c.error(th, cVar);
        }
    }
}
