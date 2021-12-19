package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89669k;
import kotlinx.coroutines.AbstractC89671m;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.C89672n;
import kotlinx.coroutines.C89673o;
import kotlinx.coroutines.C89674p;
import kotlinx.coroutines.internal.C89643i;
import kotlinx.coroutines.internal.C89644j;
import kotlinx.coroutines.internal.C89645k;
import kotlinx.coroutines.internal.C89646l;
import kotlinx.coroutines.internal.C89659v;
import kotlinx.coroutines.p4636a.C89463aa;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.a.a */
public abstract class AbstractC89459a<E> extends AbstractC89467c<E> implements AbstractC89475h<E> {
    static {
        Covode.recordClassIndex(105548);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo144041a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo144044b();

    /* renamed from: kotlinx.coroutines.a.a$a */
    static final class C89460a<E> extends AbstractC89493t<E> {

        /* renamed from: a */
        public final AbstractC89671m<Object> f203165a;

        /* renamed from: b */
        public final int f203166b = 2;

        static {
            Covode.recordClassIndex(105549);
        }

        @Override // kotlinx.coroutines.p4636a.AbstractC89495v
        public final void cU_() {
            this.f203165a.mo144214b(C89673o.f203425a);
        }

        @Override // kotlinx.coroutines.internal.C89646l
        public final String toString() {
            return "ReceiveElement@" + Integer.toHexString(System.identityHashCode(this)) + "[receiveMode=" + this.f203166b + ']';
        }

        public C89460a(AbstractC89671m<Object> mVar) {
            this.f203165a = mVar;
        }

        /* renamed from: a */
        public final Object mo144047a(E e) {
            if (this.f203166b != 2) {
                return e;
            }
            return C89463aa.m155320a(e);
        }

        @Override // kotlinx.coroutines.p4636a.AbstractC89495v
        /* renamed from: b */
        public final C89659v mo144049b(E e) {
            Object a = this.f203165a.mo144209a(mo144047a((Object) e));
            if (a == null) {
                return null;
            }
            if (!C89527ar.f203243a || a == C89673o.f203425a) {
                return C89673o.f203425a;
            }
            throw new AssertionError();
        }

        @Override // kotlinx.coroutines.p4636a.AbstractC89493t
        /* renamed from: a */
        public final void mo144048a(C89479k<?> kVar) {
            if (this.f203166b == 1 && kVar.f203199a == null) {
                this.f203165a.resumeWith(C89379q.m157068constructorimpl(null));
            } else if (this.f203166b == 2) {
                this.f203165a.resumeWith(C89379q.m157068constructorimpl(C89463aa.m155320a(new C89463aa.C89464a(kVar.f203199a))));
            } else {
                this.f203165a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(kVar.mo144079e())));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: d */
    public final AbstractC89495v<E> mo144046d() {
        return super.mo144046d();
    }

    /* renamed from: kotlinx.coroutines.a.a$c */
    public static final class C89462c extends C89646l.AbstractC89647a {

        /* renamed from: a */
        final /* synthetic */ C89646l f203169a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89459a f203170b;

        static {
            Covode.recordClassIndex(105551);
        }

        @Override // kotlinx.coroutines.internal.AbstractC89630c
        /* renamed from: a */
        public final /* synthetic */ Object mo144031a() {
            if (this.f203170b.mo144044b()) {
                return null;
            }
            return C89645k.f203382a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89462c(C89646l lVar, C89646l lVar2, AbstractC89459a aVar) {
            super(lVar2);
            this.f203169a = lVar;
            this.f203170b = aVar;
        }
    }

    /* renamed from: kotlinx.coroutines.a.a$b */
    final class C89461b extends AbstractC89669k {

        /* renamed from: b */
        private final AbstractC89493t<?> f203168b;

        static {
            Covode.recordClassIndex(105550);
        }

        public final String toString() {
            return "RemoveReceiveOnCancel[" + this.f203168b + ']';
        }

        @Override // kotlinx.coroutines.AbstractC89670l
        /* renamed from: a */
        public final void mo144051a(Throwable th) {
            this.f203168b.cR_();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            mo144051a(th);
            return C89391z.f203057a;
        }

        public C89461b(AbstractC89493t<?> tVar) {
            this.f203168b = tVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo144045c() {
        AbstractC89497x i;
        C89659v b;
        do {
            i = mo144068i();
            if (i == null) {
                return C89466b.f203176c;
            }
            b = i.mo144073b();
        } while (b == null);
        if (!C89527ar.f203243a || b == C89673o.f203425a) {
            i.mo144074c();
            return i.mo144071a();
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final boolean mo144042a(Throwable th) {
        boolean b_ = mo144063b_(th);
        mo144040a(b_);
        return b_;
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89494u
    /* renamed from: a */
    public final void mo144039a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName() + " was cancelled");
        }
        mo144042a((Throwable) cancellationException);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.a.a$a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.p4636a.AbstractC89494u
    /* renamed from: a */
    public final Object mo144038a(AbstractC89124d<? super C89463aa<? extends E>> dVar) {
        Object c = mo144045c();
        if (c != C89466b.f203176c) {
            if (c instanceof C89479k) {
                c = new C89463aa.C89464a(((C89479k) c).f203199a);
            }
            return C89463aa.m155320a(c);
        }
        C89672n a = C89674p.m155681a(C89099b.m154605a(dVar));
        if (a != null) {
            C89460a aVar = new C89460a(a);
            while (true) {
                if (!mo144043a((AbstractC89493t) aVar)) {
                    Object c2 = mo144045c();
                    if (!(c2 instanceof C89479k)) {
                        if (c2 != C89466b.f203176c) {
                            a.resumeWith(C89379q.m157068constructorimpl(aVar.mo144047a(c2)));
                            break;
                        }
                    } else {
                        aVar.mo144048a((C89479k<?>) ((C89479k) c2));
                        break;
                    }
                } else {
                    a.mo144211a((AbstractC89172b<? super Throwable, C89391z>) new C89461b(aVar));
                    break;
                }
            }
            Object e = a.mo144218e();
            if (e == EnumC89098a.COROUTINE_SUSPENDED) {
                C89219l.m154721d(dVar, "");
            }
            return e;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo144040a(boolean z) {
        C89479k<?> g = mo144066g();
        if (g != null) {
            Object obj = null;
            while (true) {
                C89646l i = g.mo144192i();
                if (!(i instanceof C89644j)) {
                    if (C89527ar.f203243a && !(i instanceof AbstractC89497x)) {
                        throw new AssertionError();
                    } else if (!i.cR_()) {
                        i.mo144194k();
                    } else {
                        obj = C89643i.m155582a(obj, i);
                    }
                } else if (obj != null) {
                    if (!(obj instanceof ArrayList)) {
                        ((AbstractC89497x) obj).mo144072a(g);
                        return;
                    }
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((AbstractC89497x) arrayList.get(size)).mo144072a(g);
                    }
                    return;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo144043a(AbstractC89493t<? super E> tVar) {
        int a;
        C89646l i;
        if (mo144041a()) {
            C89646l lVar = this.f203180a;
            do {
                i = lVar.mo144192i();
                if (!(!(i instanceof AbstractC89497x))) {
                    return false;
                }
            } while (!i.mo144188a(tVar, lVar));
            return true;
        }
        C89646l lVar2 = this.f203180a;
        C89462c cVar = new C89462c(tVar, tVar, this);
        do {
            C89646l i2 = lVar2.mo144192i();
            if (!(!(i2 instanceof AbstractC89497x))) {
                return false;
            }
            a = i2.mo144186a(tVar, lVar2, cVar);
            if (a == 1) {
                return true;
            }
        } while (a != 2);
        return false;
    }
}
