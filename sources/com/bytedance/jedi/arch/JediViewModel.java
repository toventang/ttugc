package com.bytedance.jedi.arch;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.internal.C20499h;
import com.bytedance.jedi.arch.internal.C20500i;
import com.bytedance.jedi.arch.internal.LifecycleAwareObserver;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

public abstract class JediViewModel<S extends AbstractC20368af> extends AbstractC1174ac {

    /* renamed from: h */
    static final /* synthetic */ AbstractC89286i[] f48230h = {new C89232y(C89204ab.m154669a(JediViewModel.class), "storeOwner", "getStoreOwner()Lcom/bytedance/jedi/arch/internal/StoreOwner;")};

    /* renamed from: a */
    private final AbstractC89244h f48231a = C89250i.m154773a((AbstractC89171a) new C20361g(this));

    /* renamed from: b */
    private final C88411a f48232b = new C88411a();

    /* renamed from: i */
    S f48233i;

    /* renamed from: j */
    public final AbstractC20551z f48234j = new C20363aa();

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$a */
    static final class C20354a extends AbstractC89220m implements AbstractC89172b<T, T> {

        /* renamed from: a */
        public static final C20354a f48235a = new C20354a();

        static {
            Covode.recordClassIndex(23865);
        }

        C20354a() {
            super(1);
        }

        /* JADX WARN: Unknown type variable: T in type: T */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$b */
    static final class C20355b extends AbstractC89220m implements AbstractC89172b<T, T> {

        /* renamed from: a */
        public static final C20355b f48236a = new C20355b();

        static {
            Covode.recordClassIndex(23866);
        }

        C20355b() {
            super(1);
        }

        /* JADX WARN: Unknown type variable: T in type: T */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final T invoke(T t) {
            return t;
        }
    }

    public final C20499h<S> bj_() {
        return (C20499h) this.f48231a.getValue();
    }

    public void bk_() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract S mo23027d();

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        this.f48232b.mo142944a();
    }

    public final S aB_() {
        return bj_().mo33698a();
    }

    static {
        Covode.recordClassIndex(23864);
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$g */
    static final class C20361g extends AbstractC89220m implements AbstractC89171a<C20499h<S>> {

        /* renamed from: a */
        final /* synthetic */ JediViewModel f48246a;

        static {
            Covode.recordClassIndex(23872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20361g(JediViewModel jediViewModel) {
            super(0);
            this.f48246a = jediViewModel;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            JediViewModel jediViewModel = this.f48246a;
            S s = jediViewModel.f48233i;
            if (s != null) {
                Object invoke = C20516j.f48591c.invoke(jediViewModel, s);
                if (invoke != null) {
                    return new C20499h((AbstractC20369ag) invoke);
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalArgumentException(("Cannot visit store before ViewModel(" + jediViewModel.getClass() + ") is initialized").toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.JediViewModel$d */
    public static final class C20357d<T, R> implements AbstractC88434g<T, R> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f48238a;

        static {
            Covode.recordClassIndex(23868);
        }

        C20357d(AbstractC89172b bVar) {
            this.f48238a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            return new C20372aj(this.f48238a.invoke(obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.JediViewModel$e */
    public static final class C20358e<T, R> implements AbstractC88434g<Throwable, AbstractC20362a<? extends V>> {

        /* renamed from: a */
        public static final C20358e f48239a = new C20358e();

        static {
            Covode.recordClassIndex(23869);
        }

        C20358e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            return new C20466f(th2);
        }
    }

    /* renamed from: g */
    private void mo75829g(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        bj_().mo33702c(bVar);
    }

    /* renamed from: b_ */
    public final void mo33687b_(AbstractC89172b<? super S, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        mo33691e(bVar);
    }

    /* renamed from: c */
    public final void mo33689c(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        mo33692f(bVar);
    }

    /* renamed from: d */
    public final void mo33690d(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        mo75829g(bVar);
    }

    /* renamed from: e */
    public final void mo33691e(AbstractC89172b<? super S, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        bj_().mo33699a(bVar);
    }

    /* renamed from: f */
    public final void mo33692f(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        bj_().mo33701b(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.JediViewModel$c */
    public static final class C20356c extends AbstractC89220m implements AbstractC89172b<S, S> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f48237a;

        static {
            Covode.recordClassIndex(23867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20356c(AbstractC89183m mVar) {
            super(1);
            this.f48237a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return this.f48237a.invoke(obj, new C20535w());
        }
    }

    /* renamed from: a_ */
    public final void mo33686a_(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        if (this.f48233i == null) {
            this.f48233i = (S) ((AbstractC20368af) bVar.invoke(mo23027d()));
            bk_();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.JediViewModel$f */
    public static final class C20359f<T> implements AbstractC88433f<AbstractC20362a<? extends V>> {

        /* renamed from: a */
        final /* synthetic */ JediViewModel f48240a;

        /* renamed from: b */
        final /* synthetic */ boolean f48241b;

        /* renamed from: c */
        final /* synthetic */ Thread f48242c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f48243d;

        static {
            Covode.recordClassIndex(23870);
        }

        C20359f(JediViewModel jediViewModel, boolean z, Thread thread, AbstractC89183m mVar) {
            this.f48240a = jediViewModel;
            this.f48241b = z;
            this.f48242c = thread;
            this.f48243d = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final AbstractC20362a aVar = (AbstractC20362a) obj;
            if (!this.f48241b || this.f48242c != Thread.currentThread()) {
                this.f48240a.mo33689c(new AbstractC89172b<S, S>(this) {
                    /* class com.bytedance.jedi.arch.JediViewModel.C20359f.C203601 */

                    /* renamed from: a */
                    final /* synthetic */ C20359f f48244a;

                    static {
                        Covode.recordClassIndex(23871);
                    }

                    {
                        this.f48244a = r2;
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ Object invoke(Object obj) {
                        C89219l.m154719c(obj, "");
                        AbstractC89183m mVar = this.f48244a.f48243d;
                        AbstractC20362a aVar = aVar;
                        C89219l.m154709a((Object) aVar, "");
                        return mVar.invoke(obj, aVar);
                    }
                });
                return;
            }
            throw new IllegalStateException("you need schedule upstream to another thread, you can call subscribeOn(IO)".toString());
        }
    }

    /* renamed from: a */
    public final AbstractC88412b mo33680a(AbstractC88412b bVar) {
        C89219l.m154719c(bVar, "");
        this.f48232b.mo142945a(bVar);
        return bVar;
    }

    /* renamed from: a */
    public final <PROP, MW extends C20536x<S, PROP>> void mo33684a(MW mw) {
        C89219l.m154719c(mw, "");
        C88411a aVar = this.f48232b;
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(this, "");
        mw.f48609a = aVar;
        mw.f48610b = this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super S extends com.bytedance.jedi.arch.af, ? super com.bytedance.jedi.arch.a<? extends T>, ? extends S extends com.bytedance.jedi.arch.af> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> AbstractC88412b mo33679a(AbstractC88403ab<T> abVar, AbstractC89183m<? super S, ? super AbstractC20362a<? extends T>, ? extends S> mVar) {
        C89219l.m154719c(abVar, "");
        C89219l.m154719c(mVar, "");
        AbstractC88979t<T> d = abVar.mo142930d();
        C89219l.m154709a((Object) d, "");
        return m38554a(d, C20354a.f48235a, mVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super S extends com.bytedance.jedi.arch.af, ? super com.bytedance.jedi.arch.a<? extends T>, ? extends S extends com.bytedance.jedi.arch.af> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> AbstractC88412b mo33682a(AbstractC88979t<T> tVar, AbstractC89183m<? super S, ? super AbstractC20362a<? extends T>, ? extends S> mVar) {
        C89219l.m154719c(tVar, "");
        C89219l.m154719c(mVar, "");
        return m38554a(tVar, C20355b.f48236a, mVar);
    }

    /* renamed from: a */
    private <T, V> AbstractC88412b m38554a(AbstractC88979t<T> tVar, AbstractC89172b<? super T, ? extends V> bVar, AbstractC89183m<? super S, ? super AbstractC20362a<? extends V>, ? extends S> mVar) {
        boolean z;
        Thread thread;
        C89219l.m154719c(tVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(mVar, "");
        if (!C20516j.f48589a || C20516j.f48590b) {
            z = false;
            thread = null;
        } else {
            z = true;
            thread = Thread.currentThread();
        }
        mo33689c(new C20356c(mVar));
        AbstractC88412b d = tVar.mo143292d(new C20357d(bVar)).mo143299f(C20358e.f48239a).mo143289d(new C20359f(this, z, thread, mVar));
        C89219l.m154709a((Object) d, "");
        return mo33680a(d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <A> AbstractC88412b mo33683a(AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89172b<? super A, C89391z> bVar) {
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(ahVar, "");
        C89219l.m154719c(bVar, "");
        return C20500i.m38705a(this, null, kVar, ahVar, bVar);
    }

    /* renamed from: a */
    public final <T> AbstractC88412b mo33681a(AbstractC88979t<T> tVar, AbstractC1204m mVar, boolean z, boolean z2, AbstractC88398aa aaVar, AbstractC89172b<? super T, C89391z> bVar) {
        C89219l.m154719c(tVar, "");
        C89219l.m154719c(bVar, "");
        if (mVar == null) {
            if (aaVar != null) {
                tVar = tVar.mo143261a(aaVar);
            }
            AbstractC88412b d = tVar.mo143289d(new C20529r(bVar));
            C89219l.m154709a((Object) d, "");
            return mo33680a(d);
        }
        if (aaVar != null) {
            tVar = tVar.mo143261a(aaVar);
        }
        AbstractC88986z c = tVar.mo143288c(new LifecycleAwareObserver(mVar, !z, z2, bVar));
        C89219l.m154709a((Object) c, "");
        return mo33680a((AbstractC88412b) c);
    }
}
