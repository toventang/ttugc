package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.internal.l */
public class C89646l {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f203384a = AtomicReferenceFieldUpdater.newUpdater(C89646l.class, Object.class, "_removedRef");

    /* renamed from: d */
    static final AtomicReferenceFieldUpdater f203385d = AtomicReferenceFieldUpdater.newUpdater(C89646l.class, Object.class, "_next");

    /* renamed from: e */
    static final AtomicReferenceFieldUpdater f203386e = AtomicReferenceFieldUpdater.newUpdater(C89646l.class, Object.class, "_prev");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef;

    static {
        Covode.recordClassIndex(105739);
    }

    public boolean cT_() {
        return mo144190g() instanceof C89656s;
    }

    public boolean cR_() {
        if (mo144193j() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Object mo144190g() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC89655r)) {
                return obj;
            }
            ((AbstractC89655r) obj).mo144173a(this);
        }
    }

    /* renamed from: h */
    public final C89646l mo144191h() {
        return C89645k.m155583a(mo144190g());
    }

    /* renamed from: i */
    public final C89646l mo144192i() {
        C89646l d = mo144078d();
        if (d == null) {
            return m155584c((C89646l) this._prev);
        }
        return d;
    }

    /* renamed from: c */
    private C89656s mo144074c() {
        C89656s sVar = (C89656s) this._removedRef;
        if (sVar != null) {
            return sVar;
        }
        C89656s sVar2 = new C89656s(this);
        f203384a.lazySet(this, sVar2);
        return sVar2;
    }

    /* renamed from: k */
    public final void mo144194k() {
        Object g = mo144190g();
        if (g != null) {
            ((C89656s) g).f203405a.mo144078d();
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: l */
    public final void mo144195l() {
        C89646l lVar = this;
        while (true) {
            Object g = lVar.mo144190g();
            if (g instanceof C89656s) {
                lVar = ((C89656s) g).f203405a;
            } else {
                lVar.mo144078d();
                return;
            }
        }
    }

    /* renamed from: j */
    public final C89646l mo144193j() {
        Object g;
        C89646l lVar;
        do {
            g = mo144190g();
            if (g instanceof C89656s) {
                return ((C89656s) g).f203405a;
            }
            if (g == this) {
                return (C89646l) g;
            }
            if (g != null) {
                lVar = (C89646l) g;
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        } while (!f203385d.compareAndSet(this, g, lVar.mo144074c()));
        lVar.mo144078d();
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (kotlinx.coroutines.internal.C89646l.f203385d.compareAndSet(r3, r4, ((kotlinx.coroutines.internal.C89656s) r2).f203405a) == false) goto L_0x0000;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private kotlinx.coroutines.internal.C89646l mo144078d() {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r6 = r7._prev
            kotlinx.coroutines.internal.l r6 = (kotlinx.coroutines.internal.C89646l) r6
            r5 = 0
            r4 = r6
        L_0x0006:
            r3 = r5
        L_0x0007:
            java.lang.Object r2 = r4._next
            r0 = r7
            if (r2 != r0) goto L_0x0018
            if (r6 != r4) goto L_0x000f
            return r4
        L_0x000f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C89646l.f203386e
            boolean r0 = r0.compareAndSet(r7, r6, r4)
            if (r0 == 0) goto L_0x0000
            return r4
        L_0x0018:
            boolean r0 = r7.cT_()
            if (r0 == 0) goto L_0x001f
            return r5
        L_0x001f:
            if (r2 != 0) goto L_0x0022
            return r4
        L_0x0022:
            boolean r0 = r2 instanceof kotlinx.coroutines.internal.AbstractC89655r
            if (r0 == 0) goto L_0x002c
            kotlinx.coroutines.internal.r r2 = (kotlinx.coroutines.internal.AbstractC89655r) r2
            r2.mo144173a(r4)
            goto L_0x0000
        L_0x002c:
            boolean r0 = r2 instanceof kotlinx.coroutines.internal.C89656s
            if (r0 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C89646l.f203385d
            kotlinx.coroutines.internal.s r2 = (kotlinx.coroutines.internal.C89656s) r2
            kotlinx.coroutines.internal.l r0 = r2.f203405a
            boolean r0 = r1.compareAndSet(r3, r4, r0)
            if (r0 == 0) goto L_0x0000
            r4 = r3
            goto L_0x0006
        L_0x0040:
            java.lang.Object r2 = r4._prev
            goto L_0x0044
        L_0x0043:
            r3 = r4
        L_0x0044:
            r4 = r2
            kotlinx.coroutines.internal.l r4 = (kotlinx.coroutines.internal.C89646l) r4
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C89646l.mo144078d():kotlinx.coroutines.internal.l");
    }

    /* renamed from: kotlinx.coroutines.internal.l$a */
    public static abstract class AbstractC89647a extends AbstractC89630c<C89646l> {

        /* renamed from: d */
        public C89646l f203387d;

        /* renamed from: e */
        public final C89646l f203388e;

        static {
            Covode.recordClassIndex(105740);
        }

        public AbstractC89647a(C89646l lVar) {
            this.f203388e = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlinx.coroutines.internal.AbstractC89630c
        /* renamed from: a */
        public final /* synthetic */ void mo144174a(C89646l lVar, Object obj) {
            boolean z;
            C89646l lVar2;
            if (obj == null) {
                z = true;
                lVar2 = this.f203388e;
            } else {
                z = false;
                lVar2 = this.f203387d;
            }
            if (lVar2 != null && C89646l.f203385d.compareAndSet(lVar, this, lVar2) && z) {
                C89646l lVar3 = this.f203388e;
                C89646l lVar4 = this.f203387d;
                if (lVar4 == null) {
                    C89219l.m154707a();
                }
                lVar3.mo144189b(lVar4);
            }
        }
    }

    /* renamed from: c */
    private static C89646l m155584c(C89646l lVar) {
        while (lVar.cT_()) {
            lVar = (C89646l) lVar._prev;
        }
        return lVar;
    }

    /* renamed from: b */
    public final void mo144189b(C89646l lVar) {
        Object obj;
        do {
            obj = lVar._prev;
            if (mo144190g() != lVar) {
                return;
            }
        } while (!f203386e.compareAndSet(lVar, obj, this));
        if (cT_()) {
            lVar.mo144078d();
        }
    }

    /* renamed from: a */
    public final boolean mo144187a(C89646l lVar) {
        f203386e.lazySet(lVar, this);
        f203385d.lazySet(lVar, this);
        while (mo144190g() == this) {
            if (f203385d.compareAndSet(this, this, lVar)) {
                lVar.mo144189b(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo144188a(C89646l lVar, C89646l lVar2) {
        f203386e.lazySet(lVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f203385d;
        atomicReferenceFieldUpdater.lazySet(lVar, lVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, lVar2, lVar)) {
            return false;
        }
        lVar.mo144189b(lVar2);
        return true;
    }

    /* renamed from: a */
    public final int mo144186a(C89646l lVar, C89646l lVar2, AbstractC89647a aVar) {
        f203386e.lazySet(lVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f203385d;
        atomicReferenceFieldUpdater.lazySet(lVar, lVar2);
        aVar.f203387d = lVar2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, lVar2, aVar)) {
            return 0;
        }
        if (aVar.mo144173a(this) == null) {
            return 1;
        }
        return 2;
    }
}
