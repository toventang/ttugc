package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.AbstractC88479c;

/* renamed from: f.a.e.e.e.aa */
public final class C88638aa<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    final T[] f201096a;

    static {
        Covode.recordClassIndex(104680);
    }

    /* renamed from: f.a.e.e.e.aa$a */
    static final class C88639a<T> extends AbstractC88479c<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201097a;

        /* renamed from: b */
        final T[] f201098b;

        /* renamed from: c */
        int f201099c;

        /* renamed from: d */
        boolean f201100d;

        /* renamed from: e */
        volatile boolean f201101e;

        static {
            Covode.recordClassIndex(104681);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201101e = true;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201101e;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            this.f201099c = this.f201098b.length;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            if (this.f201099c == this.f201098b.length) {
                return true;
            }
            return false;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            int i = this.f201099c;
            T[] tArr = this.f201098b;
            if (i == tArr.length) {
                return null;
            }
            this.f201099c = i + 1;
            return (T) C88466b.m153697a((Object) tArr[i], "The array element is null");
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f201100d = true;
            return 1;
        }

        C88639a(AbstractC88986z<? super T> zVar, T[] tArr) {
            this.f201097a = zVar;
            this.f201098b = tArr;
        }
    }

    public C88638aa(T[] tArr) {
        this.f201096a = tArr;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88639a aVar = new C88639a(zVar, this.f201096a);
        zVar.onSubscribe(aVar);
        if (!aVar.f201100d) {
            T[] tArr = aVar.f201098b;
            int length = tArr.length;
            for (int i = 0; i < length && !aVar.isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    aVar.f201097a.onError(new NullPointerException("The " + i + "th element is null"));
                    return;
                } else {
                    aVar.f201097a.onNext(t);
                }
            }
            if (!aVar.isDisposed()) {
                aVar.f201097a.onComplete();
            }
        }
    }
}
