package com.bytedance.jedi.arch;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.internal.C20498g;
import com.bytedance.jedi.arch.internal.C20500i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.jedi.arch.x */
public class C20536x<S extends AbstractC20368af, PROP extends AbstractC20368af> {

    /* renamed from: a */
    C88411a f48609a;

    /* renamed from: b */
    public JediViewModel<S> f48610b;

    /* renamed from: c */
    public AbstractC89290k<S, ? extends PROP> f48611c;

    /* renamed from: d */
    public AbstractC89183m<? super S, ? super PROP, ? extends S> f48612d;

    /* renamed from: com.bytedance.jedi.arch.x$d */
    static final class C20540d extends AbstractC89220m implements AbstractC89172b<T, T> {

        /* renamed from: a */
        public static final C20540d f48619a = new C20540d();

        static {
            Covode.recordClassIndex(24065);
        }

        C20540d() {
            super(1);
        }

        /* JADX WARN: Unknown type variable: T in type: T */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final T invoke(T t) {
            return t;
        }
    }

    static {
        Covode.recordClassIndex(24061);
    }

    /* renamed from: com.bytedance.jedi.arch.x$b */
    static final class C20538b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f48615a;

        /* renamed from: b */
        final /* synthetic */ AbstractC20367ae f48616b;

        static {
            Covode.recordClassIndex(24063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20538b(AbstractC89172b bVar, AbstractC20367ae aeVar) {
            super(0);
            this.f48615a = bVar;
            this.f48616b = aeVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC20467g receiver = this.f48616b.getReceiver();
            if (receiver != null) {
                this.f48615a.invoke(receiver);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final JediViewModel<S> mo33803a() {
        JediViewModel<S> jediViewModel = this.f48610b;
        if (jediViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        return jediViewModel;
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: h.k.k<S extends com.bytedance.jedi.arch.af, ? extends PROP extends com.bytedance.jedi.arch.af>, h.k.k<S extends com.bytedance.jedi.arch.af, PROP extends com.bytedance.jedi.arch.af> */
    /* renamed from: b */
    public final AbstractC89290k<S, PROP> mo33810b() {
        AbstractC89290k kVar = (AbstractC89290k<S, ? extends PROP>) this.f48611c;
        if (kVar == null) {
            C89219l.m154710a("substate");
        }
        return kVar;
    }

    /* renamed from: com.bytedance.jedi.arch.x$c */
    static final class C20539c extends AbstractC89220m implements AbstractC89172b<T, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f48617a;

        /* renamed from: b */
        final /* synthetic */ AbstractC20367ae f48618b;

        static {
            Covode.recordClassIndex(24064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20539c(AbstractC89183m mVar, AbstractC20367ae aeVar) {
            super(1);
            this.f48617a = mVar;
            this.f48618b = aeVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            AbstractC20467g receiver = this.f48618b.getReceiver();
            if (receiver != null) {
                this.f48617a.invoke(receiver, obj);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.x$f */
    static final class C20542f<T, R> implements AbstractC88434g<T, R> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f48621a;

        static {
            Covode.recordClassIndex(24067);
        }

        C20542f(AbstractC89172b bVar) {
            this.f48621a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            return new C20372aj(this.f48621a.invoke(obj));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.x$g */
    static final class C20543g<T, R> implements AbstractC88434g<Throwable, AbstractC20362a<? extends V>> {

        /* renamed from: a */
        public static final C20543g f48622a = new C20543g();

        static {
            Covode.recordClassIndex(24068);
        }

        C20543g() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            return new C20466f(th2);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.x$i */
    static final class C20546i extends AbstractC89220m implements AbstractC89172b<A, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20367ae f48629a;

        /* renamed from: b */
        final /* synthetic */ C20536x f48630b;

        /* renamed from: c */
        final /* synthetic */ AbstractC20468h f48631c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89290k f48632d;

        /* renamed from: e */
        final /* synthetic */ boolean f48633e;

        /* renamed from: f */
        final /* synthetic */ boolean f48634f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89183m f48635g;

        static {
            Covode.recordClassIndex(24071);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20546i(AbstractC20367ae aeVar, C20536x xVar, AbstractC20468h hVar, AbstractC89290k kVar, boolean z, boolean z2, AbstractC89183m mVar) {
            super(1);
            this.f48629a = aeVar;
            this.f48630b = xVar;
            this.f48631c = hVar;
            this.f48632d = kVar;
            this.f48633e = z;
            this.f48634f = z2;
            this.f48635g = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            AbstractC20467g receiver = this.f48629a.getReceiver();
            if (receiver != null) {
                this.f48635g.invoke(receiver, obj);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.x$a */
    static final class C20537a extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f48613a;

        /* renamed from: b */
        final /* synthetic */ AbstractC20367ae f48614b;

        static {
            Covode.recordClassIndex(24062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20537a(AbstractC89183m mVar, AbstractC20367ae aeVar) {
            super(1);
            this.f48613a = mVar;
            this.f48614b = aeVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154719c(th, "");
            AbstractC20467g receiver = this.f48614b.getReceiver();
            if (receiver != null) {
                this.f48613a.invoke(receiver, th);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.x$e */
    static final class C20541e extends AbstractC89220m implements AbstractC89172b<PROP, PROP> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f48620a;

        static {
            Covode.recordClassIndex(24066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20541e(AbstractC89183m mVar) {
            super(1);
            this.f48620a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return this.f48620a.invoke(obj, new C20535w());
        }
    }

    /* renamed from: com.bytedance.jedi.arch.x$k */
    static final class C20548k extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20536x f48638a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f48639b;

        static {
            Covode.recordClassIndex(24073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20548k(C20536x xVar, AbstractC89183m mVar) {
            super(1);
            this.f48638a = xVar;
            this.f48639b = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154719c(obj, "");
            this.f48639b.invoke(obj, this.f48638a.mo33810b().invoke(obj));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.x$l */
    static final class C20549l extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20536x f48640a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f48641b;

        static {
            Covode.recordClassIndex(24074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20549l(C20536x xVar, AbstractC89172b bVar) {
            super(1);
            this.f48640a = xVar;
            this.f48641b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154719c(obj, "");
            this.f48641b.invoke(this.f48640a.mo33810b().invoke(obj));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo33807a(AbstractC89172b<? super PROP, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        JediViewModel<S> jediViewModel = this.f48610b;
        if (jediViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        jediViewModel.mo33691e(new C20549l(this, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33811b(AbstractC89172b<? super PROP, ? extends PROP> bVar) {
        C89219l.m154719c(bVar, "");
        JediViewModel<S> jediViewModel = this.f48610b;
        if (jediViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        jediViewModel.mo33692f(new C20547j(this, bVar));
    }

    /* renamed from: com.bytedance.jedi.arch.x$h */
    static final class C20544h<T> implements AbstractC88433f<AbstractC20362a<? extends V>> {

        /* renamed from: a */
        final /* synthetic */ C20536x f48623a;

        /* renamed from: b */
        final /* synthetic */ boolean f48624b;

        /* renamed from: c */
        final /* synthetic */ Thread f48625c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f48626d;

        static {
            Covode.recordClassIndex(24069);
        }

        C20544h(C20536x xVar, boolean z, Thread thread, AbstractC89183m mVar) {
            this.f48623a = xVar;
            this.f48624b = z;
            this.f48625c = thread;
            this.f48626d = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final AbstractC20362a aVar = (AbstractC20362a) obj;
            if (!this.f48624b || this.f48625c != Thread.currentThread()) {
                this.f48623a.mo33811b(new AbstractC89172b<PROP, PROP>(this) {
                    /* class com.bytedance.jedi.arch.C20536x.C20544h.C205451 */

                    /* renamed from: a */
                    final /* synthetic */ C20544h f48627a;

                    static {
                        Covode.recordClassIndex(24070);
                    }

                    {
                        this.f48627a = r2;
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ Object invoke(Object obj) {
                        C89219l.m154719c(obj, "");
                        AbstractC89183m mVar = this.f48627a.f48626d;
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.x$j */
    public static final class C20547j extends AbstractC89220m implements AbstractC89172b<S, S> {

        /* renamed from: a */
        final /* synthetic */ C20536x f48636a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f48637b;

        static {
            Covode.recordClassIndex(24072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20547j(C20536x xVar, AbstractC89172b bVar) {
            super(1);
            this.f48636a = xVar;
            this.f48637b = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154719c(obj, "");
            AbstractC89183m<? super S, ? super PROP, ? extends S> mVar = this.f48636a.f48612d;
            if (mVar == null) {
                C89219l.m154710a("mainStateReducer");
            }
            return mVar.invoke(obj, (Object) this.f48637b.invoke(this.f48636a.mo33810b().invoke(obj)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33808a(AbstractC89183m<? super S, ? super PROP, C89391z> mVar) {
        C89219l.m154719c(mVar, "");
        JediViewModel<S> jediViewModel = this.f48610b;
        if (jediViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        jediViewModel.mo33691e(new C20548k(this, mVar));
    }

    /* renamed from: a */
    public final <T> AbstractC88412b mo33806a(AbstractC88979t<T> tVar, AbstractC89183m<? super PROP, ? super AbstractC20362a<? extends T>, ? extends PROP> mVar) {
        boolean z;
        Thread thread;
        C89219l.m154719c(tVar, "");
        C89219l.m154719c(mVar, "");
        C20540d dVar = C20540d.f48619a;
        C89219l.m154719c(tVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(mVar, "");
        if (!C20516j.f48589a || C20516j.f48590b) {
            z = false;
            thread = null;
        } else {
            z = true;
            thread = Thread.currentThread();
        }
        mo33811b(new C20541e(mVar));
        AbstractC88412b d = tVar.mo143292d(new C20542f(dVar)).mo143299f(C20543g.f48622a).mo143289d(new C20544h(this, z, thread, mVar));
        C89219l.m154709a((Object) d, "");
        C89219l.m154719c(d, "");
        C88411a aVar = this.f48609a;
        if (aVar == null) {
            C89219l.m154710a("disposables");
        }
        aVar.mo142945a(d);
        return d;
    }

    /* renamed from: a */
    public final void mo33809a(AbstractC89290k<S, ? extends PROP> kVar, AbstractC89183m<? super S, ? super PROP, ? extends S> mVar) {
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(mVar, "");
        this.f48611c = kVar;
        this.f48612d = mVar;
    }

    /* renamed from: a */
    public final <RECEIVER extends AbstractC20467g, A> AbstractC88412b mo33804a(AbstractC20468h<? extends RECEIVER> hVar, AbstractC89290k<PROP, ? extends A> kVar, boolean z, boolean z2, AbstractC89183m<? super RECEIVER, ? super A, C89391z> mVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(mVar, "");
        AbstractC20367ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
        JediViewModel<S> jediViewModel = this.f48610b;
        if (jediViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        AbstractC1204m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
        AbstractC89290k<S, ? extends PROP> kVar2 = this.f48611c;
        if (kVar2 == null) {
            C89219l.m154710a("substate");
        }
        C20546i iVar = new C20546i(receiverHolder, this, hVar, kVar, z, z2, mVar);
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(iVar, "");
        AbstractC88979t<R> a = jediViewModel.bj_().mo33700b().mo143292d(new C20500i.C20503c(kVar2)).mo143266a(C88446a.f200695a);
        C89219l.m154709a((Object) a, "");
        AbstractC88979t<R> a2 = a.mo143292d(new C20500i.C20504d(kVar)).mo143266a(C88446a.f200695a);
        C89219l.m154709a((Object) a2, "");
        return jediViewModel.mo33681a(a2, lifecycleOwner, z, z2, C20498g.f48507b, new C20500i.C20505e(jediViewModel, lifecycleOwner, z, z2, iVar));
    }

    /* renamed from: a */
    public final <RECEIVER extends AbstractC20467g, T> AbstractC88412b mo33805a(AbstractC20468h<? extends RECEIVER> hVar, AbstractC89290k<PROP, ? extends AbstractC20362a<? extends T>> kVar, boolean z, boolean z2, AbstractC89183m<? super RECEIVER, ? super Throwable, C89391z> mVar, AbstractC89172b<? super RECEIVER, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super T, C89391z> mVar2) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(kVar, "");
        AbstractC20367ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
        JediViewModel<S> jediViewModel = this.f48610b;
        if (jediViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        AbstractC1204m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
        AbstractC89290k<S, ? extends PROP> kVar2 = this.f48611c;
        if (kVar2 == null) {
            C89219l.m154710a("substate");
        }
        C20537a aVar = new C20537a(mVar, receiverHolder);
        C20538b bVar2 = new C20538b(bVar, receiverHolder);
        C20539c cVar = new C20539c(mVar2, receiverHolder);
        C89219l.m154719c(jediViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        AbstractC88979t<R> a = jediViewModel.bj_().mo33700b().mo143292d(new C20500i.C20503c(kVar2)).mo143266a(C88446a.f200695a);
        C89219l.m154709a((Object) a, "");
        AbstractC88979t<R> a2 = a.mo143292d(new C20500i.C20501a(kVar)).mo143266a(C88446a.f200695a);
        C89219l.m154709a((Object) a2, "");
        return jediViewModel.mo33681a(a2, lifecycleOwner, z, z2, C20498g.f48507b, new C20500i.C20502b(jediViewModel, lifecycleOwner, z, z2, cVar, aVar, bVar2));
    }
}
