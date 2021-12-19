package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.C89673o;
import kotlinx.coroutines.internal.C89659v;

/* renamed from: kotlinx.coroutines.a.o */
public class C89487o<E> extends AbstractC89459a<E> {

    /* renamed from: d */
    private static final C89659v f203211d = new C89659v("EMPTY");

    /* renamed from: e */
    private static final C89488a f203212e = new C89488a((byte) 0);

    /* renamed from: b */
    private final ReentrantLock f203213b = new ReentrantLock();

    /* renamed from: c */
    private Object f203214c = f203211d;

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
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: f */
    public final boolean mo144065f() {
        return false;
    }

    /* renamed from: kotlinx.coroutines.a.o$a */
    static final class C89488a {
        static {
            Covode.recordClassIndex(105577);
        }

        private C89488a() {
        }

        public /* synthetic */ C89488a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: b */
    public final boolean mo144044b() {
        if (this.f203214c == f203211d) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(105576);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: j */
    public final String mo144069j() {
        return "(value=" + this.f203214c + ')';
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: c */
    public final Object mo144045c() {
        ReentrantLock reentrantLock = this.f203213b;
        reentrantLock.lock();
        try {
            Object obj = this.f203214c;
            C89659v vVar = f203211d;
            if (obj == vVar) {
                Object g = mo144066g();
                if (g == null) {
                    g = C89466b.f203176c;
                }
                return g;
            }
            this.f203214c = vVar;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89459a
    /* renamed from: a */
    public void mo144040a(boolean z) {
        if (z) {
            ReentrantLock reentrantLock = this.f203213b;
            reentrantLock.lock();
            try {
                this.f203214c = f203211d;
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
        ReentrantLock reentrantLock = this.f203213b;
        reentrantLock.lock();
        try {
            return super.mo144043a((AbstractC89493t) tVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: a */
    public Object mo144059a(E e) {
        AbstractC89495v<E> d;
        C89659v b;
        boolean z;
        ReentrantLock reentrantLock = this.f203213b;
        reentrantLock.lock();
        try {
            C89479k<?> g = mo144066g();
            if (g != null) {
                return g;
            }
            if (this.f203214c == f203211d) {
                do {
                    d = mo144046d();
                    if (d != null) {
                        if (d instanceof C89479k) {
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
                reentrantLock.unlock();
                d.cU_();
                return d.mo144080f();
            }
            this.f203214c = e;
            Object obj = C89466b.f203174a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
