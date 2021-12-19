package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.C89673o;
import kotlinx.coroutines.internal.C89659v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.a.e */
public final class C89472e<E> extends AbstractC89459a<E> {

    /* renamed from: b */
    public final int f203190b;

    /* renamed from: c */
    private final ReentrantLock f203191c;

    /* renamed from: d */
    private Object[] f203192d;

    /* renamed from: e */
    private int f203193e;
    private volatile int size;

    static {
        Covode.recordClassIndex(105561);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: a */
    public final boolean mo144041a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: e */
    public final boolean mo144064e() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: b */
    public final boolean mo144044b() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: f */
    public final boolean mo144065f() {
        if (this.size == this.f203190b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: j */
    public final String mo144069j() {
        return "(buffer:capacity=" + this.f203190b + ",size=" + this.size + ')';
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: c */
    public final Object mo144045c() {
        ReentrantLock reentrantLock = this.f203191c;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object g = mo144066g();
                if (g == null) {
                    g = C89466b.f203176c;
                }
                return g;
            }
            Object[] objArr = this.f203192d;
            int i2 = this.f203193e;
            Object obj = objArr[i2];
            AbstractC89497x xVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C89466b.f203176c;
            boolean z = false;
            if (i == this.f203190b) {
                while (true) {
                    AbstractC89497x i3 = mo144068i();
                    if (i3 == null) {
                        break;
                    }
                    C89659v b = i3.mo144073b();
                    if (b != null) {
                        if (C89527ar.f203243a) {
                            if (b == C89673o.f203425a) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = i3.mo144071a();
                        xVar = i3;
                        z = true;
                    } else {
                        xVar = i3;
                    }
                }
            }
            if (obj2 != C89466b.f203176c && !(obj2 instanceof C89479k)) {
                this.size = i;
                Object[] objArr2 = this.f203192d;
                objArr2[(this.f203193e + i) % objArr2.length] = obj2;
            }
            this.f203193e = (this.f203193e + 1) % this.f203192d.length;
            reentrantLock.unlock();
            if (z) {
                if (xVar == null) {
                    C89219l.m154707a();
                }
                xVar.mo144074c();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: a */
    public final Object mo144061a(AbstractC89497x xVar) {
        ReentrantLock reentrantLock = this.f203191c;
        reentrantLock.lock();
        try {
            return super.mo144061a(xVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public C89472e(int i) {
        this.f203190b = i;
        if (i > 0) {
            this.f203191c = new ReentrantLock();
            this.f203192d = new Object[Math.min(i, 8)];
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: a */
    private final void m155359a(int i) {
        Object[] objArr = this.f203192d;
        if (i >= objArr.length) {
            Object[] objArr2 = new Object[Math.min(objArr.length * 2, this.f203190b)];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f203192d;
                objArr2[i2] = objArr3[(this.f203193e + i2) % objArr3.length];
            }
            this.f203192d = objArr2;
            this.f203193e = 0;
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: a */
    public final Object mo144059a(E e) {
        AbstractC89495v<E> d;
        C89659v b;
        boolean z;
        ReentrantLock reentrantLock = this.f203191c;
        reentrantLock.lock();
        try {
            int i = this.size;
            C89479k<?> g = mo144066g();
            if (g != null) {
                return g;
            }
            if (i < this.f203190b) {
                this.size = i + 1;
                if (i == 0) {
                    do {
                        d = mo144046d();
                        if (d != null) {
                            if (d instanceof C89479k) {
                                this.size = i;
                                reentrantLock.unlock();
                                return d;
                            }
                            b = d.mo144049b(e);
                        }
                    } while (b == null);
                    if (C89527ar.f203243a) {
                        if (b == C89673o.f203425a) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            throw new AssertionError();
                        }
                    }
                    this.size = i;
                    reentrantLock.unlock();
                    d.cU_();
                    return d.mo144080f();
                }
                m155359a(i);
                Object[] objArr = this.f203192d;
                objArr[(this.f203193e + i) % objArr.length] = e;
                Object obj = C89466b.f203174a;
                reentrantLock.unlock();
                return obj;
            }
            Object obj2 = C89466b.f203175b;
            reentrantLock.unlock();
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: a */
    public final void mo144040a(boolean z) {
        if (z) {
            ReentrantLock reentrantLock = this.f203191c;
            reentrantLock.lock();
            try {
                int i = this.size;
                for (int i2 = 0; i2 < i; i2++) {
                    this.f203192d[this.f203193e] = 0;
                    this.f203193e = (this.f203193e + 1) % this.f203192d.length;
                }
                this.size = 0;
            } finally {
                reentrantLock.unlock();
            }
        }
        super.mo144040a(z);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: a */
    public final boolean mo144043a(AbstractC89493t<? super E> tVar) {
        ReentrantLock reentrantLock = this.f203191c;
        reentrantLock.lock();
        try {
            return super.mo144043a((AbstractC89493t) tVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
