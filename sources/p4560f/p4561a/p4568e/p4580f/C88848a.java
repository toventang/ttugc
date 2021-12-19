package p4560f.p4561a.p4568e.p4580f;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4568e.p4571c.AbstractC88475h;

/* renamed from: f.a.e.f.a */
public final class C88848a<T> implements AbstractC88475h<T> {

    /* renamed from: a */
    private final AtomicReference<C88849a<T>> f201751a = new AtomicReference<>();

    /* renamed from: b */
    private final AtomicReference<C88849a<T>> f201752b = new AtomicReference<>();

    static {
        Covode.recordClassIndex(104890);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.f.a$a */
    public static final class C88849a<E> extends AtomicReference<C88849a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* renamed from: a */
        private E f201753a;

        static {
            Covode.recordClassIndex(104891);
        }

        C88849a() {
        }

        /* renamed from: a */
        public final E mo143119a() {
            E e = this.f201753a;
            this.f201753a = null;
            return e;
        }

        C88849a(E e) {
            this.f201753a = e;
        }
    }

    /* renamed from: a */
    private C88849a<T> m154036a() {
        return this.f201751a.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4580f.C88848a.clear():void");
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean isEmpty() {
        if (this.f201752b.get() == m154036a()) {
            return true;
        }
        return false;
    }

    public C88848a() {
        C88849a<T> aVar = new C88849a<>();
        m154038b(aVar);
        m154037a(aVar);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88475h, p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final T poll() {
        C88849a<T> aVar;
        C88849a<T> aVar2 = this.f201752b.get();
        C88849a<T> aVar3 = (C88849a) aVar2.get();
        if (aVar3 != null) {
            T a = aVar3.mo143119a();
            m154038b(aVar3);
            return a;
        } else if (aVar2 == m154036a()) {
            return null;
        } else {
            do {
                aVar = (C88849a) aVar2.get();
            } while (aVar == null);
            T a2 = aVar.mo143119a();
            m154038b(aVar);
            return a2;
        }
    }

    /* renamed from: b */
    private void m154038b(C88849a<T> aVar) {
        this.f201752b.lazySet(aVar);
    }

    /* renamed from: a */
    private C88849a<T> m154037a(C88849a<T> aVar) {
        return this.f201751a.getAndSet(aVar);
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
    public final boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        C88849a<T> aVar = new C88849a<>(t);
        m154037a(aVar).lazySet(aVar);
        return true;
    }
}
