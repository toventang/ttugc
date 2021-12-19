package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4568e.p4571c.AbstractC88468a;
import p4560f.p4561a.p4568e.p4571c.AbstractC88473f;
import p4560f.p4561a.p4568e.p4583i.AbstractC88892a;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.c */
public final class C88533c<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final AbstractC88428a f200840c;

    static {
        Covode.recordClassIndex(104575);
    }

    /* renamed from: f.a.e.e.b.c$a */
    static final class C88534a<T> extends AbstractC88892a<T> implements AbstractC88468a<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final AbstractC88468a<? super T> f200841a;

        /* renamed from: b */
        final AbstractC88428a f200842b;

        /* renamed from: c */
        AbstractC90215d f200843c;

        /* renamed from: d */
        AbstractC88473f<T> f200844d;

        /* renamed from: e */
        boolean f200845e;

        static {
            Covode.recordClassIndex(104576);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            this.f200844d.clear();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            return this.f200844d.isEmpty();
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            this.f200843c.cancel();
            m153767a();
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            this.f200841a.onComplete();
            m153767a();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            T poll = this.f200844d.poll();
            if (poll == null && this.f200845e) {
                m153767a();
            }
            return poll;
        }

        /* renamed from: a */
        private void m153767a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f200842b.mo8579a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    C88925a.m154178a(th);
                }
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88468a
        /* renamed from: a */
        public final boolean mo142981a(T t) {
            return this.f200841a.mo142981a(t);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            this.f200841a.onNext(t);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            this.f200843c.request(j);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            this.f200841a.onError(th);
            m153767a();
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200843c, dVar)) {
                this.f200843c = dVar;
                if (dVar instanceof AbstractC88473f) {
                    this.f200844d = (AbstractC88473f) dVar;
                }
                this.f200841a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            AbstractC88473f<T> fVar = this.f200844d;
            boolean z = false;
            if (fVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = fVar.requestFusion(i);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.f200845e = z;
            }
            return requestFusion;
        }

        C88534a(AbstractC88468a<? super T> aVar, AbstractC88428a aVar2) {
            this.f200841a = aVar;
            this.f200842b = aVar2;
        }
    }

    /* renamed from: f.a.e.e.b.c$b */
    static final class C88535b<T> extends AbstractC88892a<T> implements AbstractC88955l<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final AbstractC90214c<? super T> f200846a;

        /* renamed from: b */
        final AbstractC88428a f200847b;

        /* renamed from: c */
        AbstractC90215d f200848c;

        /* renamed from: d */
        AbstractC88473f<T> f200849d;

        /* renamed from: e */
        boolean f200850e;

        static {
            Covode.recordClassIndex(104577);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            this.f200849d.clear();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            return this.f200849d.isEmpty();
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            this.f200848c.cancel();
            m153769a();
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            this.f200846a.onComplete();
            m153769a();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            T poll = this.f200849d.poll();
            if (poll == null && this.f200850e) {
                m153769a();
            }
            return poll;
        }

        /* renamed from: a */
        private void m153769a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f200847b.mo8579a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    C88925a.m154178a(th);
                }
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            this.f200846a.onNext(t);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            this.f200848c.request(j);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            this.f200846a.onError(th);
            m153769a();
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200848c, dVar)) {
                this.f200848c = dVar;
                if (dVar instanceof AbstractC88473f) {
                    this.f200849d = (AbstractC88473f) dVar;
                }
                this.f200846a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            AbstractC88473f<T> fVar = this.f200849d;
            boolean z = false;
            if (fVar == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = fVar.requestFusion(i);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.f200850e = z;
            }
            return requestFusion;
        }

        C88535b(AbstractC90214c<? super T> cVar, AbstractC88428a aVar) {
            this.f200846a = cVar;
            this.f200847b = aVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        if (cVar instanceof AbstractC88468a) {
            this.f200799b.mo143201a((AbstractC88955l) new C88534a((AbstractC88468a) cVar, this.f200840c));
        } else {
            this.f200799b.mo143201a((AbstractC88955l) new C88535b(cVar, this.f200840c));
        }
    }

    public C88533c(AbstractC88924h<T> hVar, AbstractC88428a aVar) {
        super(hVar);
        this.f200840c = aVar;
    }
}
