package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.internal.C89659v;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.a.n */
public final class C89482n<E> implements AbstractC89473f<E> {

    /* renamed from: a */
    static final AtomicReferenceFieldUpdater f203200a = AtomicReferenceFieldUpdater.newUpdater(C89482n.class, Object.class, "_state");

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f203201b = AtomicIntegerFieldUpdater.newUpdater(C89482n.class, "_updating");

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f203202c = AtomicReferenceFieldUpdater.newUpdater(C89482n.class, Object.class, "onCloseHandler");

    /* renamed from: d */
    private static final C89483a f203203d = new C89483a(null);

    /* renamed from: e */
    private static final C89659v f203204e;

    /* renamed from: f */
    private static final C89485c<Object> f203205f;

    /* renamed from: g */
    private static final C89484b f203206g = new C89484b((byte) 0);
    volatile Object _state = f203205f;
    private volatile int _updating;
    private volatile Object onCloseHandler;

    /* renamed from: kotlinx.coroutines.a.n$b */
    static final class C89484b {
        static {
            Covode.recordClassIndex(105573);
        }

        private C89484b() {
        }

        public /* synthetic */ C89484b(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(105571);
        C89659v vVar = new C89659v("UNDEFINED");
        f203204e = vVar;
        f203205f = new C89485c<>(vVar, null);
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89473f
    /* renamed from: a */
    public final void mo144076a(CancellationException cancellationException) {
        mo144063b_(cancellationException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.a.n$a */
    public static final class C89483a {

        /* renamed from: a */
        public final Throwable f203207a;

        static {
            Covode.recordClassIndex(105572);
        }

        public C89483a(Throwable th) {
            this.f203207a = th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.a.n$d */
    public static final class C89486d<E> extends C89487o<E> {

        /* renamed from: b */
        private final C89482n<E> f203210b;

        static {
            Covode.recordClassIndex(105575);
        }

        @Override // kotlinx.coroutines.p4636a.AbstractC89467c, kotlinx.coroutines.p4636a.C89487o
        /* renamed from: a */
        public final Object mo144059a(E e) {
            return super.mo144059a((Object) e);
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.p4636a.AbstractC89459a, kotlinx.coroutines.p4636a.C89487o
        /* renamed from: a */
        public final void mo144040a(boolean z) {
            Object obj;
            Object obj2;
            C89486d[] dVarArr;
            if (z) {
                C89482n<E> nVar = this.f203210b;
                do {
                    obj = nVar._state;
                    if (obj instanceof C89483a) {
                        return;
                    }
                    if (obj instanceof C89485c) {
                        C89485c cVar = (C89485c) obj;
                        obj2 = cVar.f203208a;
                        if (obj != null) {
                            C89486d<E>[] dVarArr2 = cVar.f203209b;
                            if (dVarArr2 == null) {
                                C89219l.m154707a();
                            }
                            int length = dVarArr2.length;
                            int b = C89064i.m154493b(dVarArr2, this);
                            if (!C89527ar.f203243a || b >= 0) {
                                if (length == 1) {
                                    dVarArr = null;
                                } else {
                                    dVarArr = new C89486d[(length - 1)];
                                    C89064i.m154471a(dVarArr2, dVarArr, 0, 0, b, 6);
                                    C89064i.m154471a(dVarArr2, dVarArr, b, b + 1, 0, 8);
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else {
                        throw new IllegalStateException("Invalid state ".concat(String.valueOf(obj)).toString());
                    }
                } while (!C89482n.f203200a.compareAndSet(nVar, obj, new C89485c(obj2, dVarArr)));
            }
        }
    }

    /* renamed from: a */
    private final C89483a m155393a(E e) {
        Object obj;
        if (!f203201b.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof C89483a) {
                    C89483a aVar = (C89483a) obj;
                    this._updating = 0;
                    return aVar;
                } else if (!(obj instanceof C89485c)) {
                    throw new IllegalStateException("Invalid state ".concat(String.valueOf(obj)).toString());
                } else if (obj == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } finally {
                this._updating = 0;
            }
        } while (!f203200a.compareAndSet(this, obj, new C89485c(e, ((C89485c) obj).f203209b)));
        C89486d<E>[] dVarArr = ((C89485c) obj).f203209b;
        if (dVarArr != null) {
            for (C89486d<E> dVar : dVarArr) {
                dVar.mo144059a((Object) e);
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89498y
    /* renamed from: b_ */
    public final boolean mo144063b_(Throwable th) {
        Object obj;
        int i;
        C89483a aVar;
        do {
            obj = this._state;
            if (obj instanceof C89483a) {
                return false;
            }
            if (!(obj instanceof C89485c)) {
                throw new IllegalStateException("Invalid state ".concat(String.valueOf(obj)).toString());
            } else if (th == null) {
                aVar = f203203d;
            } else {
                aVar = new C89483a(th);
            }
        } while (!f203200a.compareAndSet(this, obj, aVar));
        if (obj != null) {
            C89486d<E>[] dVarArr = ((C89485c) obj).f203209b;
            if (dVarArr != null) {
                for (C89486d<E> dVar : dVarArr) {
                    dVar.mo144063b_(th);
                }
            }
            Object obj2 = this.onCloseHandler;
            if (!(obj2 == null || obj2 == C89466b.f203178e || !f203202c.compareAndSet(this, obj2, C89466b.f203178e))) {
                ((AbstractC89172b) C89206ad.m154679b(obj2, 1)).invoke(th);
            }
            return true;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.a.n$c */
    public static final class C89485c<E> {

        /* renamed from: a */
        public final Object f203208a;

        /* renamed from: b */
        public final C89486d<E>[] f203209b;

        static {
            Covode.recordClassIndex(105574);
        }

        public C89485c(Object obj, C89486d<E>[] dVarArr) {
            this.f203208a = obj;
            this.f203209b = dVarArr;
        }
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89498y
    /* renamed from: a */
    public final Object mo144060a(E e, AbstractC89124d<? super C89391z> dVar) {
        C89483a a = m155393a((Object) e);
        if (a != null) {
            Throwable th = a.f203207a;
            if (th == null) {
                throw new C89481m("Channel was closed");
            }
            throw th;
        } else if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            return a;
        } else {
            return C89391z.f203057a;
        }
    }
}
