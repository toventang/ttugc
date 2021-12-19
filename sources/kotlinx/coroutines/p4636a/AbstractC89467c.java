package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.C89592cn;
import kotlinx.coroutines.C89672n;
import kotlinx.coroutines.C89673o;
import kotlinx.coroutines.C89674p;
import kotlinx.coroutines.internal.C89643i;
import kotlinx.coroutines.internal.C89644j;
import kotlinx.coroutines.internal.C89645k;
import kotlinx.coroutines.internal.C89646l;
import kotlinx.coroutines.internal.C89659v;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.a.c */
public abstract class AbstractC89467c<E> implements AbstractC89498y<E> {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f203179b = AtomicReferenceFieldUpdater.newUpdater(AbstractC89467c.class, Object.class, "onCloseHandler");

    /* renamed from: a */
    public final C89644j f203180a = new C89644j();
    private volatile Object onCloseHandler = null;

    static {
        Covode.recordClassIndex(105556);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo144064e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo144065f();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo144069j() {
        return "";
    }

    /* renamed from: kotlinx.coroutines.a.c$a */
    public static final class C89468a<E> extends AbstractC89497x {

        /* renamed from: a */
        public final E f203181a;

        static {
            Covode.recordClassIndex(105557);
        }

        @Override // kotlinx.coroutines.p4636a.AbstractC89497x
        /* renamed from: a */
        public final void mo144072a(C89479k<?> kVar) {
        }

        @Override // kotlinx.coroutines.p4636a.AbstractC89497x
        /* renamed from: c */
        public final void mo144074c() {
        }

        @Override // kotlinx.coroutines.p4636a.AbstractC89497x
        /* renamed from: a */
        public final Object mo144071a() {
            return this.f203181a;
        }

        @Override // kotlinx.coroutines.p4636a.AbstractC89497x
        /* renamed from: b */
        public final C89659v mo144073b() {
            return C89673o.f203425a;
        }

        @Override // kotlinx.coroutines.internal.C89646l
        public final String toString() {
            return "SendBuffered@" + Integer.toHexString(System.identityHashCode(this)) + '(' + ((Object) this.f203181a) + ')';
        }

        public C89468a(E e) {
            this.f203181a = e;
        }
    }

    /* renamed from: kotlinx.coroutines.a.c$b */
    public static final class C89469b extends C89646l.AbstractC89647a {

        /* renamed from: a */
        final /* synthetic */ C89646l f203182a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89467c f203183b;

        static {
            Covode.recordClassIndex(105558);
        }

        @Override // kotlinx.coroutines.internal.AbstractC89630c
        /* renamed from: a */
        public final /* synthetic */ Object mo144031a() {
            if (this.f203183b.mo144065f()) {
                return null;
            }
            return C89645k.f203382a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89469b(C89646l lVar, C89646l lVar2, AbstractC89467c cVar) {
            super(lVar2);
            this.f203182a = lVar;
            this.f203183b = cVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C89479k<?> mo144066g() {
        C89646l i = this.f203180a.mo144192i();
        if (!(i instanceof C89479k)) {
            i = null;
        }
        C89479k<?> kVar = (C89479k) i;
        if (kVar == null) {
            return null;
        }
        m155323a(kVar);
        return kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C89479k<?> mo144067h() {
        C89646l a = C89645k.m155583a(this.f203180a.mo144190g());
        if (!(a instanceof C89479k)) {
            a = null;
        }
        C89479k<?> kVar = (C89479k) a;
        if (kVar == null) {
            return null;
        }
        m155323a(kVar);
        return kVar;
    }

    /* renamed from: a */
    private final int mo144041a() {
        C89644j jVar = this.f203180a;
        Object g = jVar.mo144190g();
        if (g != null) {
            int i = 0;
            for (C89646l lVar = (C89646l) g; !C89219l.m154714a(lVar, jVar); lVar = C89645k.m155583a(lVar.mo144190g())) {
                if (lVar instanceof C89646l) {
                    i++;
                }
            }
            return i;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r2 = null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlinx.coroutines.p4636a.AbstractC89495v<E> mo144046d() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.j r3 = r4.f203180a
        L_0x0002:
            java.lang.Object r2 = r3.mo144190g()
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.internal.l r2 = (kotlinx.coroutines.internal.C89646l) r2
            r1 = 0
            if (r2 != r3) goto L_0x0011
        L_0x000d:
            r2 = r1
        L_0x000e:
            kotlinx.coroutines.a.v r2 = (kotlinx.coroutines.p4636a.AbstractC89495v) r2
            return r2
        L_0x0011:
            boolean r0 = r2 instanceof kotlinx.coroutines.p4636a.AbstractC89495v
            if (r0 != 0) goto L_0x0016
            goto L_0x000d
        L_0x0016:
            boolean r0 = r2 instanceof kotlinx.coroutines.p4636a.C89479k
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.cT_()
            if (r0 != 0) goto L_0x0021
            goto L_0x000e
        L_0x0021:
            kotlinx.coroutines.internal.l r0 = r2.mo144193j()
            if (r0 != 0) goto L_0x0028
            goto L_0x000e
        L_0x0028:
            r0.mo144195l()
            goto L_0x0002
        L_0x002c:
            h.w r1 = new h.w
            java.lang.String r0 = "null cannot be cast to non-null type"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p4636a.AbstractC89467c.mo144046d():kotlinx.coroutines.a.v");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r2 = null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.p4636a.AbstractC89497x mo144068i() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.j r3 = r4.f203180a
        L_0x0002:
            java.lang.Object r2 = r3.mo144190g()
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.internal.l r2 = (kotlinx.coroutines.internal.C89646l) r2
            r1 = 0
            if (r2 != r3) goto L_0x0011
        L_0x000d:
            r2 = r1
        L_0x000e:
            kotlinx.coroutines.a.x r2 = (kotlinx.coroutines.p4636a.AbstractC89497x) r2
            return r2
        L_0x0011:
            boolean r0 = r2 instanceof kotlinx.coroutines.p4636a.AbstractC89497x
            if (r0 != 0) goto L_0x0016
            goto L_0x000d
        L_0x0016:
            boolean r0 = r2 instanceof kotlinx.coroutines.p4636a.C89479k
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.cT_()
            if (r0 != 0) goto L_0x0021
            goto L_0x000e
        L_0x0021:
            kotlinx.coroutines.internal.l r0 = r2.mo144193j()
            if (r0 != 0) goto L_0x0028
            goto L_0x000e
        L_0x0028:
            r0.mo144195l()
            goto L_0x0002
        L_0x002c:
            h.w r1 = new h.w
            java.lang.String r0 = "null cannot be cast to non-null type"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p4636a.AbstractC89467c.mo144068i():kotlinx.coroutines.a.x");
    }

    public String toString() {
        String concat;
        StringBuilder append = new StringBuilder().append(getClass().getSimpleName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('{');
        C89646l h = this.f203180a.mo144191h();
        if (h == this.f203180a) {
            concat = "EmptyQueue";
        } else {
            if (h instanceof C89479k) {
                concat = h.toString();
            } else if (h instanceof AbstractC89493t) {
                concat = "ReceiveQueued";
            } else if (h instanceof AbstractC89497x) {
                concat = "SendQueued";
            } else {
                concat = "UNEXPECTED:".concat(String.valueOf(h));
            }
            C89646l i = this.f203180a.mo144192i();
            if (i != h) {
                concat = concat + ",queueSize=" + mo144041a();
                if (i instanceof C89479k) {
                    concat = concat + ",closedForSend=" + i;
                }
            }
        }
        return append.append(concat).append('}').append(mo144069j()).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AbstractC89495v<?> mo144062b(E e) {
        C89646l i;
        C89646l lVar = this.f203180a;
        C89468a aVar = new C89468a(e);
        do {
            i = lVar.mo144192i();
            if (i instanceof AbstractC89495v) {
                return (AbstractC89495v) i;
            }
        } while (!i.mo144188a(aVar, lVar));
        return null;
    }

    /* renamed from: a */
    private static void m155323a(C89479k<?> kVar) {
        Object obj = null;
        while (true) {
            C89646l i = kVar.mo144192i();
            if ((i instanceof AbstractC89493t) && i != null) {
                if (!i.cR_()) {
                    i.mo144194k();
                } else {
                    obj = C89643i.m155582a(obj, i);
                }
            }
        }
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((AbstractC89493t) obj).mo144048a(kVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC89493t) arrayList.get(size)).mo144048a(kVar);
        }
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89498y
    /* renamed from: b_ */
    public boolean mo144063b_(Throwable th) {
        boolean z;
        Object obj;
        C89479k kVar = new C89479k(th);
        C89646l lVar = this.f203180a;
        while (true) {
            C89646l i = lVar.mo144192i();
            if (!(i instanceof C89479k)) {
                if (i.mo144188a(kVar, lVar)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                C89646l i2 = this.f203180a.mo144192i();
                if (i2 != null) {
                    kVar = (C89479k) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
        m155323a((C89479k<?>) kVar);
        if (z && (obj = this.onCloseHandler) != null && obj != C89466b.f203178e && f203179b.compareAndSet(this, obj, C89466b.f203178e)) {
            ((AbstractC89172b) C89206ad.m154679b(obj, 1)).invoke(th);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo144059a(E e) {
        AbstractC89495v<E> d;
        C89659v b;
        do {
            d = mo144046d();
            if (d == null) {
                return C89466b.f203175b;
            }
            b = d.mo144049b(e);
        } while (b == null);
        if (!C89527ar.f203243a || b == C89673o.f203425a) {
            d.cU_();
            return d.mo144080f();
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo144061a(AbstractC89497x xVar) {
        int a;
        C89646l i;
        if (mo144064e()) {
            C89646l lVar = this.f203180a;
            do {
                i = lVar.mo144192i();
                if (i instanceof AbstractC89495v) {
                    return i;
                }
            } while (!i.mo144188a(xVar, lVar));
            return null;
        }
        C89646l lVar2 = this.f203180a;
        C89469b bVar = new C89469b(xVar, xVar, this);
        do {
            C89646l i2 = lVar2.mo144192i();
            if (i2 instanceof AbstractC89495v) {
                return i2;
            }
            a = i2.mo144186a(xVar, lVar2, bVar);
            if (a == 1) {
                return null;
            }
        } while (a != 2);
        return C89466b.f203177d;
    }

    /* renamed from: a */
    private static void m155322a(AbstractC89124d<?> dVar, C89479k<?> kVar) {
        m155323a(kVar);
        dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(kVar.mo144078d())));
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89498y
    /* renamed from: a */
    public final Object mo144060a(E e, AbstractC89124d<? super C89391z> dVar) {
        if (mo144059a((Object) e) == C89466b.f203174a) {
            return C89391z.f203057a;
        }
        C89672n a = C89674p.m155681a(C89099b.m154605a(dVar));
        while (true) {
            if (!(C89645k.m155583a(this.f203180a.mo144190g()) instanceof AbstractC89495v) && mo144065f()) {
                C89499z zVar = new C89499z(e, a);
                Object a2 = mo144061a((AbstractC89497x) zVar);
                if (a2 == null) {
                    a.mo144211a((AbstractC89172b<? super Throwable, C89391z>) new C89592cn(zVar));
                    break;
                } else if (a2 instanceof C89479k) {
                    m155322a(a, (C89479k) a2);
                    break;
                } else if (a2 != C89466b.f203177d && !(a2 instanceof AbstractC89493t)) {
                    throw new IllegalStateException("enqueueSend returned ".concat(String.valueOf(a2)).toString());
                }
            }
            Object a3 = mo144059a((Object) e);
            if (a3 == C89466b.f203174a) {
                a.resumeWith(C89379q.m157068constructorimpl(C89391z.f203057a));
                break;
            } else if (a3 != C89466b.f203175b) {
                if (a3 instanceof C89479k) {
                    m155322a(a, (C89479k) a3);
                } else {
                    throw new IllegalStateException("offerInternal returned ".concat(String.valueOf(a3)).toString());
                }
            }
        }
        Object e2 = a.mo144218e();
        if (e2 == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        if (e2 == EnumC89098a.COROUTINE_SUSPENDED) {
            return e2;
        }
        return C89391z.f203057a;
    }
}
