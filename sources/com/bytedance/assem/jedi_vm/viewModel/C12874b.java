package com.bytedance.assem.jedi_vm.viewModel;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.assem.arch.extensions.C12791m;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12840g;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.p798a.AbstractC12866e;
import com.bytedance.assem.jedi_vm.p798a.C12857a;
import com.bytedance.assem.jedi_vm.p798a.C12865d;
import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89516am;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.assem.jedi_vm.viewModel.b */
public final class C12874b<S extends AbstractC12853j> implements AbstractC12840g<S> {

    /* renamed from: a */
    public AbstractC89516am f31322a;

    /* renamed from: b */
    public S f31323b;

    /* renamed from: c */
    private final C88411a f31324c = new C88411a();

    /* renamed from: d */
    private final AbstractC89244h f31325d = C89250i.m154773a((AbstractC89171a) new C12891l(this));

    static {
        Covode.recordClassIndex(14707);
    }

    /* renamed from: c */
    private final AbstractC12866e<S> m23125c() {
        return (AbstractC12866e) this.f31325d.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final void mo20689a(AbstractC89516am amVar) {
        C89219l.m154719c(amVar, "");
        this.f31322a = amVar;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final <R> void mo20688a(AbstractC89290k<S, ? extends AbstractC12783f<? extends R>> kVar, C12854k<C12793o<AbstractC12783f<R>>> kVar2, AbstractC89171a<Boolean> aVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super R, C89391z> bVar2) {
        AbstractC88398aa aaVar;
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        boolean z = C12787j.f31110d && kVar2.f31284f;
        AbstractC88979t<R> a = m23126d().mo143268a(new C12890k(aVar, kVar2)).mo143292d(new C12875a(kVar)).mo143263a(kVar2.f31280b);
        if (kVar2.f31279a) {
            a = a.mo143297f();
        }
        C89219l.m154709a((Object) a, "");
        boolean z2 = kVar2.f31281c;
        if (kVar2.f31285g || z) {
            aaVar = C88946a.m154209a(C12787j.m23009a());
        } else {
            aaVar = C12865d.f31307b;
        }
        m23124a(a, (AbstractC1204m) null, z2, aaVar, z, (AbstractC89172b<? super Throwable, C89391z>) null, new C12876b(this, null, kVar2, z, null, aVar2, bVar, bVar2));
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: b */
    public final void mo20690b() {
        this.f31324c.mo142944a();
    }

    /* renamed from: d */
    private AbstractC88979t<S> m23126d() {
        return m23125c().mo20695a();
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$l */
    static final class C12891l extends AbstractC89220m implements AbstractC89171a<C12857a<S>> {

        /* renamed from: a */
        final /* synthetic */ C12874b f31381a;

        static {
            Covode.recordClassIndex(14724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12891l(C12874b bVar) {
            super(0);
            this.f31381a = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            S s = this.f31381a.f31323b;
            if (s == null) {
                C89219l.m154710a("defaultState");
            }
            AbstractC88398aa a = C88946a.m154209a(C12787j.m23009a());
            C89219l.m154709a((Object) a, "");
            return new C12857a(s, a);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final S mo20680a() {
        return m23125c().mo20697b();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final void mo20686a(S s) {
        C89219l.m154719c(s, "");
        this.f31323b = s;
    }

    /* renamed from: a */
    private AbstractC88412b m23123a(AbstractC88412b bVar) {
        C89219l.m154719c(bVar, "");
        this.f31324c.mo142945a(bVar);
        return bVar;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: b */
    public final void mo20691b(AbstractC89172b<? super S, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        m23125c().mo20696a(bVar);
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$a */
    public static final class C12875a<T, R> implements AbstractC88434g<T, R> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f31326a;

        static {
            Covode.recordClassIndex(14708);
        }

        public C12875a(AbstractC89290k kVar) {
            this.f31326a = kVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154719c(obj, "");
            return new C12793o(this.f31326a.get(obj));
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$c */
    public static final class C12878c<T, R> implements AbstractC88434g<T, R> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f31337a;

        static {
            Covode.recordClassIndex(14711);
        }

        public C12878c(AbstractC89290k kVar) {
            this.f31337a = kVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154719c(obj, "");
            return new C12793o(this.f31337a.get(obj));
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$e */
    public static final class C12881e<T, R> implements AbstractC88434g<T, R> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f31346a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89290k f31347b;

        static {
            Covode.recordClassIndex(14714);
        }

        public C12881e(AbstractC89290k kVar, AbstractC89290k kVar2) {
            this.f31346a = kVar;
            this.f31347b = kVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154719c(obj, "");
            return new C12794p(this.f31346a.get(obj), this.f31347b.get(obj));
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$g */
    public static final class C12884g<T, R> implements AbstractC88434g<T, R> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f31356a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89290k f31357b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89290k f31358c;

        static {
            Covode.recordClassIndex(14717);
        }

        public C12884g(AbstractC89290k kVar, AbstractC89290k kVar2, AbstractC89290k kVar3) {
            this.f31356a = kVar;
            this.f31357b = kVar2;
            this.f31358c = kVar3;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154719c(obj, "");
            return new C12795q(this.f31356a.get(obj), this.f31357b.get(obj), this.f31358c.get(obj));
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$k */
    public static final class C12890k<T> implements AbstractC88438k<S> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f31379a;

        /* renamed from: b */
        final /* synthetic */ C12854k f31380b;

        static {
            Covode.recordClassIndex(14723);
        }

        public C12890k(AbstractC89171a aVar, C12854k kVar) {
            this.f31379a = aVar;
            this.f31380b = kVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            Boolean bool;
            C89219l.m154719c(obj, "");
            AbstractC89171a aVar = this.f31379a;
            if (aVar == null || !(!this.f31380b.f31286h) || (bool = (Boolean) aVar.invoke()) == null) {
                return true;
            }
            return bool.booleanValue();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: c */
    public final void mo20692c(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        m23125c().mo20699c(bVar);
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$d */
    public static final class C12879d extends AbstractC89220m implements AbstractC89172b<C12793o<A>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12874b f31338a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f31339b;

        /* renamed from: c */
        final /* synthetic */ C12854k f31340c;

        /* renamed from: d */
        final /* synthetic */ boolean f31341d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f31342e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f31343f;

        static {
            Covode.recordClassIndex(14712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12879d(C12874b bVar, AbstractC1204m mVar, C12854k kVar, boolean z, AbstractC89172b bVar2, AbstractC89172b bVar3) {
            super(1);
            this.f31338a = bVar;
            this.f31339b = mVar;
            this.f31340c = kVar;
            this.f31341d = z;
            this.f31342e = bVar2;
            this.f31343f = bVar3;
        }

        /* JADX WARN: Unknown type variable: A in type: com.bytedance.assem.arch.extensions.o<A> */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final void invoke(final C12793o<A> oVar) {
            if (!this.f31341d || this.f31340c.f31285g) {
                this.f31343f.invoke(oVar.f31117a);
            } else if (C12865d.m23117a()) {
                this.f31343f.invoke(oVar.f31117a);
            } else {
                C12865d.f31306a.post(new Runnable(this) {
                    /* class com.bytedance.assem.jedi_vm.viewModel.C12874b.C12879d.RunnableC128801 */

                    /* renamed from: a */
                    final /* synthetic */ C12879d f31344a;

                    static {
                        Covode.recordClassIndex(14713);
                    }

                    {
                        this.f31344a = r1;
                    }

                    public final void run() {
                        this.f31344a.f31343f.invoke(((C12793o) oVar).f31117a);
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$f */
    public static final class C12882f extends AbstractC89220m implements AbstractC89172b<C12794p<A, B>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12874b f31348a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f31349b;

        /* renamed from: c */
        final /* synthetic */ C12854k f31350c;

        /* renamed from: d */
        final /* synthetic */ boolean f31351d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f31352e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89183m f31353f;

        static {
            Covode.recordClassIndex(14715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12882f(C12874b bVar, AbstractC1204m mVar, C12854k kVar, boolean z, AbstractC89172b bVar2, AbstractC89183m mVar2) {
            super(1);
            this.f31348a = bVar;
            this.f31349b = mVar;
            this.f31350c = kVar;
            this.f31351d = z;
            this.f31352e = bVar2;
            this.f31353f = mVar2;
        }

        /* JADX WARN: Unknown type variable: A in type: com.bytedance.assem.arch.extensions.p<A, B> */
        /* JADX WARN: Unknown type variable: B in type: com.bytedance.assem.arch.extensions.p<A, B> */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final void invoke(final C12794p<A, B> pVar) {
            if (!this.f31351d || this.f31350c.f31285g) {
                C12794p<A, B> pVar2 = pVar;
                this.f31353f.invoke(pVar2.f31118a, pVar2.f31119b);
            } else if (C12865d.m23117a()) {
                C12794p<A, B> pVar3 = pVar;
                this.f31353f.invoke(pVar3.f31118a, pVar3.f31119b);
            } else {
                C12865d.f31306a.post(new Runnable(this) {
                    /* class com.bytedance.assem.jedi_vm.viewModel.C12874b.C12882f.RunnableC128831 */

                    /* renamed from: a */
                    final /* synthetic */ C12882f f31354a;

                    static {
                        Covode.recordClassIndex(14716);
                    }

                    {
                        this.f31354a = r1;
                    }

                    public final void run() {
                        C12794p pVar = (C12794p) pVar;
                        this.f31354a.f31353f.invoke(pVar.f31118a, pVar.f31119b);
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$h */
    public static final class C12885h extends AbstractC89220m implements AbstractC89172b<C12795q<A, B, C>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12874b f31359a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f31360b;

        /* renamed from: c */
        final /* synthetic */ C12854k f31361c;

        /* renamed from: d */
        final /* synthetic */ boolean f31362d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f31363e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89187q f31364f;

        static {
            Covode.recordClassIndex(14718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12885h(C12874b bVar, AbstractC1204m mVar, C12854k kVar, boolean z, AbstractC89172b bVar2, AbstractC89187q qVar) {
            super(1);
            this.f31359a = bVar;
            this.f31360b = mVar;
            this.f31361c = kVar;
            this.f31362d = z;
            this.f31363e = bVar2;
            this.f31364f = qVar;
        }

        /* JADX WARN: Unknown type variable: A in type: com.bytedance.assem.arch.extensions.q<A, B, C> */
        /* JADX WARN: Unknown type variable: B in type: com.bytedance.assem.arch.extensions.q<A, B, C> */
        /* JADX WARN: Unknown type variable: C in type: com.bytedance.assem.arch.extensions.q<A, B, C> */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final void invoke(final C12795q<A, B, C> qVar) {
            if (!this.f31362d || this.f31361c.f31285g) {
                C12795q<A, B, C> qVar2 = qVar;
                this.f31364f.invoke(qVar2.f31120a, qVar2.f31121b, qVar2.f31122c);
            } else if (C12865d.m23117a()) {
                C12795q<A, B, C> qVar3 = qVar;
                this.f31364f.invoke(qVar3.f31120a, qVar3.f31121b, qVar3.f31122c);
            } else {
                C12865d.f31306a.post(new Runnable(this) {
                    /* class com.bytedance.assem.jedi_vm.viewModel.C12874b.C12885h.RunnableC128861 */

                    /* renamed from: a */
                    final /* synthetic */ C12885h f31365a;

                    static {
                        Covode.recordClassIndex(14719);
                    }

                    {
                        this.f31365a = r1;
                    }

                    public final void run() {
                        C12795q qVar = (C12795q) qVar;
                        this.f31365a.f31364f.invoke(qVar.f31120a, qVar.f31121b, qVar.f31122c);
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$i */
    public static final class C12887i<T, R> implements AbstractC88434g<T, R> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f31367a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89290k f31368b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89290k f31369c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89290k f31370d;

        static {
            Covode.recordClassIndex(14720);
        }

        public C12887i(AbstractC89290k kVar, AbstractC89290k kVar2, AbstractC89290k kVar3, AbstractC89290k kVar4) {
            this.f31367a = kVar;
            this.f31368b = kVar2;
            this.f31369c = kVar3;
            this.f31370d = kVar4;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154719c(obj, "");
            return new C12796r(this.f31367a.get(obj), this.f31368b.get(obj), this.f31369c.get(obj), this.f31370d.get(obj));
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$j */
    public static final class C12888j extends AbstractC89220m implements AbstractC89172b<C12796r<A, B, C, D>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12874b f31371a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f31372b;

        /* renamed from: c */
        final /* synthetic */ C12854k f31373c;

        /* renamed from: d */
        final /* synthetic */ boolean f31374d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f31375e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89188r f31376f;

        static {
            Covode.recordClassIndex(14721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12888j(C12874b bVar, AbstractC1204m mVar, C12854k kVar, boolean z, AbstractC89172b bVar2, AbstractC89188r rVar) {
            super(1);
            this.f31371a = bVar;
            this.f31372b = mVar;
            this.f31373c = kVar;
            this.f31374d = z;
            this.f31375e = bVar2;
            this.f31376f = rVar;
        }

        /* JADX WARN: Unknown type variable: A in type: com.bytedance.assem.arch.extensions.r<A, B, C, D> */
        /* JADX WARN: Unknown type variable: B in type: com.bytedance.assem.arch.extensions.r<A, B, C, D> */
        /* JADX WARN: Unknown type variable: C in type: com.bytedance.assem.arch.extensions.r<A, B, C, D> */
        /* JADX WARN: Unknown type variable: D in type: com.bytedance.assem.arch.extensions.r<A, B, C, D> */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final void invoke(final C12796r<A, B, C, D> rVar) {
            if (!this.f31374d || this.f31373c.f31285g) {
                C12796r<A, B, C, D> rVar2 = rVar;
                this.f31376f.mo8774a(rVar2.f31123a, rVar2.f31124b, rVar2.f31125c, rVar2.f31126d);
            } else if (C12865d.m23117a()) {
                C12796r<A, B, C, D> rVar3 = rVar;
                this.f31376f.mo8774a(rVar3.f31123a, rVar3.f31124b, rVar3.f31125c, rVar3.f31126d);
            } else {
                C12865d.f31306a.post(new Runnable(this) {
                    /* class com.bytedance.assem.jedi_vm.viewModel.C12874b.C12888j.RunnableC128891 */

                    /* renamed from: a */
                    final /* synthetic */ C12888j f31377a;

                    static {
                        Covode.recordClassIndex(14722);
                    }

                    {
                        this.f31377a = r1;
                    }

                    public final void run() {
                        C12796r rVar = (C12796r) rVar;
                        this.f31377a.f31376f.mo8774a(rVar.f31123a, rVar.f31124b, rVar.f31125c, rVar.f31126d);
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.viewModel.b$b */
    public static final class C12876b extends AbstractC89220m implements AbstractC89172b<C12793o<AbstractC12783f<? extends R>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12874b f31327a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f31328b;

        /* renamed from: c */
        final /* synthetic */ C12854k f31329c;

        /* renamed from: d */
        final /* synthetic */ boolean f31330d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f31331e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89171a f31332f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89172b f31333g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89172b f31334h;

        static {
            Covode.recordClassIndex(14709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12876b(C12874b bVar, AbstractC1204m mVar, C12854k kVar, boolean z, AbstractC89172b bVar2, AbstractC89171a aVar, AbstractC89172b bVar3, AbstractC89172b bVar4) {
            super(1);
            this.f31327a = bVar;
            this.f31328b = mVar;
            this.f31329c = kVar;
            this.f31330d = z;
            this.f31331e = bVar2;
            this.f31332f = aVar;
            this.f31333g = bVar3;
            this.f31334h = bVar4;
        }

        /* JADX WARN: Unknown type variable: R in type: com.bytedance.assem.arch.extensions.o<com.bytedance.assem.arch.extensions.f<? extends R>> */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final void invoke(final C12793o<AbstractC12783f<? extends R>> oVar) {
            AbstractC89172b bVar;
            AbstractC89172b bVar2;
            if (!this.f31330d || this.f31329c.f31285g) {
                A a = oVar.f31117a;
                if (a instanceof C12791m) {
                    AbstractC89171a aVar = this.f31332f;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else if (a instanceof C12785h) {
                    AbstractC89172b bVar3 = this.f31333g;
                    if (bVar3 != null) {
                        bVar3.invoke(a.f31103a);
                    }
                } else if ((a instanceof C12792n) && (bVar = this.f31334h) != null) {
                    bVar.invoke(a.f31116a);
                }
            } else if (C12865d.m23117a()) {
                A a2 = oVar.f31117a;
                if (a2 instanceof C12791m) {
                    AbstractC89171a aVar2 = this.f31332f;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                } else if (a2 instanceof C12785h) {
                    AbstractC89172b bVar4 = this.f31333g;
                    if (bVar4 != null) {
                        bVar4.invoke(a2.f31103a);
                    }
                } else if ((a2 instanceof C12792n) && (bVar2 = this.f31334h) != null) {
                    bVar2.invoke(a2.f31116a);
                }
            } else {
                C12865d.f31306a.post(new Runnable(this) {
                    /* class com.bytedance.assem.jedi_vm.viewModel.C12874b.C12876b.RunnableC128771 */

                    /* renamed from: a */
                    final /* synthetic */ C12876b f31335a;

                    static {
                        Covode.recordClassIndex(14710);
                    }

                    {
                        this.f31335a = r1;
                    }

                    public final void run() {
                        AbstractC89172b bVar;
                        A a = ((C12793o) oVar).f31117a;
                        if (a instanceof C12791m) {
                            AbstractC89171a aVar = this.f31335a.f31332f;
                            if (aVar != null) {
                                aVar.invoke();
                            }
                        } else if (a instanceof C12785h) {
                            AbstractC89172b bVar2 = this.f31335a.f31333g;
                            if (bVar2 != null) {
                                bVar2.invoke(a.f31103a);
                            }
                        } else if ((a instanceof C12792n) && (bVar = this.f31335a.f31334h) != null) {
                            bVar.invoke(a.f31116a);
                        }
                    }
                });
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final void mo20687a(AbstractC89172b<? super S, ? extends S> bVar) {
        C89219l.m154719c(bVar, "");
        m23125c().mo20698b(bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: h.f.a.b<? super S extends com.bytedance.assem.arch.viewModel.j, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final void mo20681a(AbstractC1204m mVar, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89172b<? super S, C89391z> bVar2) {
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(bVar2, "");
        AbstractC88979t<S> a = m23126d().mo143263a(kVar.f31280b);
        if (kVar.f31279a) {
            a = a.mo143297f();
        }
        C89219l.m154709a((Object) a, "");
        m23124a((AbstractC88979t) a, mVar, kVar.f31281c, (AbstractC88398aa) C12865d.f31307b, false, bVar, (AbstractC89172b) bVar2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final <A> void mo20682a(AbstractC1204m mVar, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89171a<Boolean> aVar, AbstractC89172b<? super A, C89391z> bVar) {
        boolean z;
        AbstractC88398aa aaVar;
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(bVar, "");
        if (!C12787j.f31110d || !kVar2.f31284f) {
            z = false;
        } else {
            z = true;
        }
        AbstractC88979t<R> a = m23126d().mo143268a(new C12890k(aVar, kVar2)).mo143292d(new C12878c(kVar)).mo143263a(kVar2.f31280b);
        AbstractC88984x xVar = a;
        if (kVar2.f31279a) {
            xVar = (AbstractC88979t<T>) a.mo143297f();
        }
        C89219l.m154709a((Object) xVar, "");
        boolean z2 = kVar2.f31281c;
        if (kVar2.f31285g || z) {
            aaVar = C88946a.m154209a(C12787j.m23009a());
        } else {
            aaVar = C12865d.f31307b;
        }
        m23124a((AbstractC88979t) xVar, mVar, z2, aaVar, z, (AbstractC89172b<? super Throwable, C89391z>) null, new C12879d(this, mVar, kVar2, z, null, bVar));
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final <A, B> void mo20683a(AbstractC1204m mVar, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89171a<Boolean> aVar, AbstractC89183m<? super A, ? super B, C89391z> mVar2) {
        boolean z;
        AbstractC88398aa aaVar;
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(mVar2, "");
        if (!C12787j.f31110d || !kVar3.f31284f) {
            z = false;
        } else {
            z = true;
        }
        AbstractC88979t<R> a = m23126d().mo143268a(new C12890k(aVar, kVar3)).mo143292d(new C12881e(kVar, kVar2)).mo143263a(kVar3.f31280b);
        AbstractC88984x xVar = a;
        if (kVar3.f31279a) {
            xVar = (AbstractC88979t<T>) a.mo143297f();
        }
        C89219l.m154709a((Object) xVar, "");
        boolean z2 = kVar3.f31281c;
        if (kVar3.f31285g || z) {
            aaVar = C88946a.m154209a(C12787j.m23009a());
        } else {
            aaVar = C12865d.f31307b;
        }
        m23124a((AbstractC88979t) xVar, mVar, z2, aaVar, z, (AbstractC89172b<? super Throwable, C89391z>) null, new C12882f(this, mVar, kVar3, z, null, mVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.assem.jedi_vm.viewModel.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> p4560f.p4561a.p4565b.AbstractC88412b m23124a(p4560f.p4561a.AbstractC88979t<T> r10, androidx.lifecycle.AbstractC1204m r11, boolean r12, p4560f.p4561a.AbstractC88398aa r13, boolean r14, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Throwable, p4600h.C89391z> r15, p4600h.p4611f.p4612a.AbstractC89172b<? super T, p4600h.C89391z> r16) {
        /*
            r9 = this;
            r7 = r16
            java.lang.String r1 = ""
            r3 = r11
            if (r3 != 0) goto L_0x0023
            if (r13 == 0) goto L_0x000d
            f.a.t r10 = r10.mo143261a(r13)
        L_0x000d:
            if (r7 == 0) goto L_0x0015
            com.bytedance.assem.jedi_vm.viewModel.c r0 = new com.bytedance.assem.jedi_vm.viewModel.c
            r0.<init>(r7)
            r7 = r0
        L_0x0015:
            f.a.d.f r7 = (p4560f.p4561a.p4567d.AbstractC88433f) r7
            f.a.b.b r0 = r10.mo143289d(r7)
            p4600h.p4611f.p4613b.C89219l.m154709a(r0, r1)
            f.a.b.b r0 = r9.m23123a(r0)
            return r0
        L_0x0023:
            if (r13 == 0) goto L_0x0029
            f.a.t r10 = r10.mo143261a(r13)
        L_0x0029:
            com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver r2 = new com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver
            r4 = r12 ^ 1
            r5 = 0
            r6 = r14
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            f.a.z r0 = r10.mo143288c(r2)
            p4600h.p4611f.p4613b.C89219l.m154709a(r0, r1)
            f.a.b.b r0 = (p4560f.p4561a.p4565b.AbstractC88412b) r0
            f.a.b.b r0 = r9.m23123a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.jedi_vm.viewModel.C12874b.m23124a(f.a.t, androidx.lifecycle.m, boolean, f.a.aa, boolean, h.f.a.b, h.f.a.b):f.a.b.b");
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final <A, B, C> void mo20684a(AbstractC1204m mVar, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89171a<Boolean> aVar, AbstractC89187q<? super A, ? super B, ? super C, C89391z> qVar) {
        boolean z;
        AbstractC88398aa aaVar;
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(kVar4, "");
        C89219l.m154719c(qVar, "");
        if (!C12787j.f31110d || !kVar4.f31284f) {
            z = false;
        } else {
            z = true;
        }
        AbstractC88979t<R> a = m23126d().mo143268a(new C12890k(aVar, kVar4)).mo143292d(new C12884g(kVar, kVar2, kVar3)).mo143263a(kVar4.f31280b);
        AbstractC88984x xVar = a;
        if (kVar4.f31279a) {
            xVar = (AbstractC88979t<T>) a.mo143297f();
        }
        C89219l.m154709a((Object) xVar, "");
        boolean z2 = kVar4.f31281c;
        if (kVar4.f31285g || z) {
            aaVar = C88946a.m154209a(C12787j.m23009a());
        } else {
            aaVar = C12865d.f31307b;
        }
        m23124a((AbstractC88979t) xVar, mVar, z2, aaVar, z, (AbstractC89172b<? super Throwable, C89391z>) null, new C12885h(this, mVar, kVar4, z, null, qVar));
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12840g
    /* renamed from: a */
    public final <A, B, C, D> void mo20685a(AbstractC1204m mVar, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89171a<Boolean> aVar, AbstractC89188r<? super A, ? super B, ? super C, ? super D, C89391z> rVar) {
        boolean z;
        AbstractC88398aa aaVar;
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(kVar4, "");
        C89219l.m154719c(kVar5, "");
        C89219l.m154719c(rVar, "");
        if (!C12787j.f31110d || !kVar5.f31284f) {
            z = false;
        } else {
            z = true;
        }
        AbstractC88979t<R> a = m23126d().mo143268a(new C12890k(aVar, kVar5)).mo143292d(new C12887i(kVar, kVar2, kVar3, kVar4)).mo143263a(kVar5.f31280b);
        AbstractC88984x xVar = a;
        if (kVar5.f31279a) {
            xVar = (AbstractC88979t<T>) a.mo143297f();
        }
        C89219l.m154709a((Object) xVar, "");
        boolean z2 = kVar5.f31281c;
        if (kVar5.f31285g || z) {
            aaVar = C88946a.m154209a(C12787j.m23009a());
        } else {
            aaVar = C12865d.f31307b;
        }
        m23124a((AbstractC88979t) xVar, mVar, z2, aaVar, z, (AbstractC89172b<? super Throwable, C89391z>) null, new C12888j(this, mVar, kVar5, z, null, rVar));
    }
}
