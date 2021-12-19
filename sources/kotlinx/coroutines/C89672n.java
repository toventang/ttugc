package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.internal.C89658u;
import p4600h.C89379q;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: kotlinx.coroutines.n */
public class C89672n<T> extends AbstractC89543bc<T> implements AbstractC89111e, AbstractC89671m<T> {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f203421c = AtomicIntegerFieldUpdater.newUpdater(C89672n.class, "_decision");

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater f203422d = AtomicReferenceFieldUpdater.newUpdater(C89672n.class, Object.class, "_state");
    volatile int _decision = 0;
    public volatile Object _parentHandle = null;
    public volatile Object _state = C89538b.f203260a;

    /* renamed from: a */
    final AbstractC89124d<T> f203423a;

    /* renamed from: b */
    private final AbstractC89127f f203424b;

    static {
        Covode.recordClassIndex(105765);
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo144028h() {
        return "CancellableContinuation";
    }

    @Override // kotlinx.coroutines.AbstractC89543bc
    /* renamed from: d */
    public final Object mo144108d() {
        return this._state;
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public AbstractC89127f getContext() {
        return this.f203424b;
    }

    @Override // kotlinx.coroutines.AbstractC89543bc
    /* renamed from: i */
    public final AbstractC89124d<T> mo144109i() {
        return this.f203423a;
    }

    @Override // kotlinx.coroutines.AbstractC89671m
    /* renamed from: a */
    public final boolean mo144213a() {
        return this._state instanceof AbstractC89590cl;
    }

    @Override // kotlinx.coroutines.AbstractC89671m
    /* renamed from: c */
    public final boolean mo144217c() {
        return this._state instanceof C89675q;
    }

    /* renamed from: j */
    private final boolean m155659j() {
        AbstractC89124d<T> dVar = this.f203423a;
        if (!(dVar instanceof C89537az) || ((C89537az) dVar)._reusableCancellableContinuation == null) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC89671m
    /* renamed from: b */
    public final boolean mo144215b() {
        if (!(this._state instanceof AbstractC89590cl)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo144219f() {
        if (!m155659j()) {
            mo144220g();
        }
    }

    /* renamed from: g */
    public final void mo144220g() {
        AbstractC89548bh bhVar = (AbstractC89548bh) this._parentHandle;
        if (bhVar != null) {
            bhVar.cQ_();
        }
        this._parentHandle = C89589ck.f203322a;
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public AbstractC89111e getCallerFrame() {
        AbstractC89124d<T> dVar = this.f203423a;
        if (!(dVar instanceof AbstractC89111e)) {
            dVar = null;
        }
        return (AbstractC89111e) dVar;
    }

    /* renamed from: l */
    private final boolean m155661l() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f203421c.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: m */
    private final boolean m155662m() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f203421c.compareAndSet(this, 0, 2));
        return true;
    }

    public String toString() {
        return mo144028h() + '(' + C89528as.m155453a(this.f203423a) + "){" + this._state + "}@" + Integer.toHexString(System.identityHashCode(this));
    }

    /* renamed from: e */
    public final Object mo144218e() {
        AbstractC89568bz bzVar;
        m155660k();
        if (m155661l()) {
            return EnumC89098a.COROUTINE_SUSPENDED;
        }
        Object obj = this._state;
        if (obj instanceof CompletedExceptionally) {
            Throwable th = ((CompletedExceptionally) obj).cause;
            if (!C89527ar.f203245c) {
                throw th;
            } else if (!(this instanceof AbstractC89111e)) {
                throw th;
            } else {
                throw C89658u.m155628a(th, this);
            }
        } else if (this.f203264f != 1 || (bzVar = (AbstractC89568bz) getContext().get(AbstractC89568bz.f203287c)) == null || bzVar.mo143993b()) {
            return mo144114c(obj);
        } else {
            CancellationException m = bzVar.mo144009m();
            mo144112a(obj, m);
            if (!C89527ar.f203245c) {
                throw m;
            } else if (!(this instanceof AbstractC89111e)) {
                throw m;
            } else {
                throw C89658u.m155628a(m, this);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.concurrent.atomic.AtomicReferenceFieldUpdater */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.util.concurrent.atomic.AtomicReferenceFieldUpdater */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    private final void m155660k() {
        AbstractC89568bz bzVar;
        boolean b = mo144215b();
        if (this.f203264f == 0) {
            AbstractC89124d<T> dVar = this.f203423a;
            if (!(dVar instanceof C89537az)) {
                dVar = null;
            }
            C89537az azVar = (C89537az) dVar;
            if (azVar != null) {
                while (true) {
                    Object obj = azVar._reusableCancellableContinuation;
                    if (obj == C89541ba.f203262b) {
                        if (C89537az.f203254c.compareAndSet(azVar, C89541ba.f203262b, this)) {
                            break;
                        }
                    } else if (obj != null) {
                        if (!(obj instanceof Throwable)) {
                            throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
                        } else if (C89537az.f203254c.compareAndSet(azVar, obj, null)) {
                            Throwable th = (Throwable) obj;
                            if (th != null) {
                                if (!b) {
                                    mo144216b(th);
                                    return;
                                }
                                return;
                            }
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                }
            }
        }
        if (!b && this._parentHandle == null && (bzVar = (AbstractC89568bz) this.f203423a.getContext().get(AbstractC89568bz.f203287c)) != null) {
            bzVar.mo144010n();
            AbstractC89548bh a = AbstractC89568bz.C89569a.m155510a(bzVar, true, false, new C89676r(bzVar, this), 2);
            this._parentHandle = a;
            if (mo144215b() && !m155659j()) {
                a.cQ_();
                this._parentHandle = C89589ck.f203322a;
            }
        }
    }

    /* renamed from: a */
    public Throwable mo144027a(AbstractC89568bz bzVar) {
        return bzVar.mo144009m();
    }

    /* renamed from: a */
    private final void m155656a(int i) {
        if (!m155662m()) {
            C89544bd.m155483a(this, i);
        }
    }

    /* renamed from: e */
    private static void m155658e(Object obj) {
        throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)).toString());
    }

    @Override // kotlinx.coroutines.AbstractC89671m
    /* renamed from: a */
    public final Object mo144210a(Throwable th) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof AbstractC89590cl)) {
                return null;
            }
        } while (!f203422d.compareAndSet(this, obj, new CompletedExceptionally(th, false, 2, null)));
        mo144219f();
        return C89673o.f203425a;
    }

    @Override // kotlinx.coroutines.AbstractC89671m
    /* renamed from: b */
    public final void mo144214b(Object obj) {
        if (!C89527ar.f203243a || obj == C89673o.f203425a) {
            m155656a(this.f203264f);
            return;
        }
        throw new AssertionError();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC89543bc
    /* renamed from: c */
    public final <T> T mo144114c(Object obj) {
        return obj instanceof C89501ab ? (T) ((C89501ab) obj).f203219b : obj instanceof C89502ac ? (T) ((C89502ac) obj).f203220a : obj;
    }

    @Override // kotlinx.coroutines.AbstractC89671m
    /* renamed from: b */
    public final boolean mo144216b(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof AbstractC89590cl)) {
                return false;
            }
            z = obj instanceof AbstractC89669k;
        } while (!f203422d.compareAndSet(this, obj, new C89675q(this, th, z)));
        if (z) {
            try {
                ((AbstractC89669k) obj).mo144051a(th);
            } catch (Throwable th2) {
                C89511aj.m155443a(getContext(), new C89504ae("Exception in cancellation handler for ".concat(String.valueOf(this)), th2));
            }
        }
        mo144219f();
        m155656a(0);
        return true;
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public void resumeWith(Object obj) {
        Throwable r3 = C89379q.m157071exceptionOrNullimpl(obj);
        if (r3 != null) {
            if (C89527ar.f203245c) {
                r3 = C89658u.m155628a(r3, this);
            }
            obj = new CompletedExceptionally(r3, false, 2, null);
        }
        m155655a(obj, this.f203264f);
    }

    @Override // kotlinx.coroutines.AbstractC89671m
    /* renamed from: a */
    public final Object mo144209a(T t) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof AbstractC89590cl)) {
                if (obj instanceof C89501ab) {
                    C89501ab abVar = (C89501ab) obj;
                    if (abVar.f203218a == null) {
                        if (!C89527ar.f203243a || abVar.f203219b == t) {
                            return C89673o.f203425a;
                        }
                        throw new AssertionError();
                    }
                }
                return null;
            }
        } while (!f203422d.compareAndSet(this, obj, t));
        mo144219f();
        return C89673o.f203425a;
    }

    @Override // kotlinx.coroutines.AbstractC89671m
    /* renamed from: a */
    public final void mo144211a(AbstractC89172b<? super Throwable, C89391z> bVar) {
        Throwable th = null;
        AbstractC89172b<? super Throwable, C89391z> bVar2 = null;
        while (true) {
            Object obj = this._state;
            if (obj instanceof C89538b) {
                if (bVar2 == null) {
                    if (bVar instanceof AbstractC89669k) {
                        bVar2 = bVar;
                    } else {
                        bVar2 = new C89565bw(bVar);
                    }
                }
                if (f203422d.compareAndSet(this, obj, bVar2)) {
                    return;
                }
            } else if (obj instanceof AbstractC89669k) {
                m155657a(bVar, obj);
            } else if (obj instanceof C89675q) {
                if (!((CompletedExceptionally) obj).makeHandled()) {
                    m155657a(bVar, obj);
                }
                try {
                    if (!(obj instanceof CompletedExceptionally)) {
                        obj = null;
                    }
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                    if (completedExceptionally != null) {
                        th = completedExceptionally.cause;
                    }
                    bVar.invoke(th);
                    return;
                } catch (Throwable th2) {
                    C89511aj.m155443a(getContext(), new C89504ae("Exception in cancellation handler for ".concat(String.valueOf(this)), th2));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89672n(AbstractC89124d<? super T> dVar, int i) {
        super(i);
        this.f203423a = dVar;
        this.f203424b = dVar.getContext();
    }

    /* renamed from: a */
    private final C89675q m155655a(Object obj, int i) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof AbstractC89590cl)) {
                if (obj2 instanceof C89675q) {
                    C89675q qVar = (C89675q) obj2;
                    if (qVar.mo144222a()) {
                        return qVar;
                    }
                }
                m155658e(obj);
            } else if (f203422d.compareAndSet(this, obj2, obj)) {
                mo144219f();
                m155656a(i);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static void m155657a(AbstractC89172b<? super Throwable, C89391z> bVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + bVar + ", already has " + obj).toString());
    }

    @Override // kotlinx.coroutines.AbstractC89543bc
    /* renamed from: a */
    public final void mo144112a(Object obj, Throwable th) {
        if (obj instanceof C89502ac) {
            try {
                ((C89502ac) obj).f203221b.invoke(th);
            } catch (Throwable th2) {
                C89511aj.m155443a(getContext(), new C89504ae("Exception in cancellation handler for ".concat(String.valueOf(this)), th2));
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC89671m
    /* renamed from: a */
    public final void mo144212a(AbstractC89507ah ahVar, T t) {
        int i;
        AbstractC89124d<T> dVar = this.f203423a;
        AbstractC89507ah ahVar2 = null;
        if (!(dVar instanceof C89537az)) {
            dVar = null;
        }
        C89537az azVar = (C89537az) dVar;
        if (azVar != null) {
            ahVar2 = azVar.f203257d;
        }
        if (ahVar2 == ahVar) {
            i = 2;
        } else {
            i = this.f203264f;
        }
        m155655a(t, i);
    }
}
