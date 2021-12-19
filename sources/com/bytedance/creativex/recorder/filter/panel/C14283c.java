package com.bytedance.creativex.recorder.filter.panel;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14170ab;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.p1559o.C21582f;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.ui_component.AbstractC23517a;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50811a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50701i;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50829e;
import com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.C50846c;
import com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.C50852e;
import com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel;
import com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50903l;
import com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50916m;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50819f;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.C50814a;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.C50816c;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.EnumC50818e;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84920d;
import com.p2082ss.android.ugc.tools.view.p4362a.C84921e;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.creativex.recorder.filter.panel.c */
public final class C14283c extends AbstractC22219j implements AbstractC20382b {

    /* renamed from: l */
    public static final C14285b f34614l = new C14285b((byte) 0);

    /* renamed from: a */
    public AbstractC50824j f34615a;

    /* renamed from: b */
    AbstractC50819f f34616b;

    /* renamed from: c */
    public AbstractC50829e f34617c;

    /* renamed from: d */
    boolean f34618d;

    /* renamed from: e */
    final C88411a f34619e = new C88411a();

    /* renamed from: f */
    final C14286c f34620f;

    /* renamed from: g */
    public final C21582f f34621g;

    /* renamed from: h */
    public final AbstractC50705m f34622h;

    /* renamed from: i */
    public final AbstractC50707o f34623i;

    /* renamed from: j */
    public final AbstractC50701i f34624j;

    /* renamed from: k */
    public final AbstractC50828d f34625k;

    /* renamed from: t */
    private final AbstractC89244h f34626t;

    /* renamed from: u */
    private final AbstractC89244h f34627u;

    static {
        Covode.recordClassIndex(16354);
    }

    /* renamed from: a */
    public final FilterPanelViewModel mo23035a() {
        return (FilterPanelViewModel) this.f34626t.getValue();
    }

    /* renamed from: b */
    public final ActivityC0218d mo23037b() {
        return (ActivityC0218d) this.f34627u.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$b */
    public static final class C14285b {
        static {
            Covode.recordClassIndex(16356);
        }

        private C14285b() {
        }

        public /* synthetic */ C14285b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$q */
    static final class C14303q extends AbstractC89220m implements AbstractC89171a<AbstractC50819f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC50819f f34652a;

        static {
            Covode.recordClassIndex(16374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14303q(AbstractC50819f fVar) {
            super(0);
            this.f34652a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC50819f invoke() {
            return this.f34652a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$p */
    static final class C14302p extends AbstractC89220m implements AbstractC89171a<AbstractC50824j> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34651a;

        static {
            Covode.recordClassIndex(16373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14302p(C14283c cVar) {
            super(0);
            this.f34651a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC50824j invoke() {
            return C14283c.m26014a(this.f34651a);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$d */
    static final class C14287d extends AbstractC89220m implements AbstractC89171a<ActivityC0218d> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34635a;

        static {
            Covode.recordClassIndex(16358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14287d(C14283c cVar) {
            super(0);
            this.f34635a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0218d invoke() {
            Activity t = this.f34635a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            return t;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C50811a.f117257a.clear();
        C50811a.f117258b.clear();
        C50811a.f117259c = null;
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$r */
    static final class C14304r extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34653a;

        static {
            Covode.recordClassIndex(16375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14304r(C14283c cVar) {
            super(0);
            this.f34653a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            FilterPanelViewModel a = this.f34653a.mo23035a();
            ActivityC0218d b = this.f34653a.mo23037b();
            if (a.f34568g == null || a.f34568g.invoke(b).booleanValue()) {
                a.f34567f.mo86064a();
                a.mo33689c(FilterPanelViewModel.C14268f.f34582a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$a */
    public static final class C14284a extends AbstractC89220m implements AbstractC89171a<FilterPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f34628a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f34629b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f34630c;

        static {
            Covode.recordClassIndex(16355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14284a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f34628a = jVar;
            this.f34629b = cVar;
            this.f34630c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f34628a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f34630c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f34630c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f34629b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m26021xcccf8ceb(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f34628a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f34629b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m26021xcccf8ceb(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.creativex.recorder.filter.panel.C14283c.C14284a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_bytedance_creativex_recorder_filter_panel_RecordFilterPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m26021xcccf8ceb(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: a */
    public final void mo23036a(AbstractC89172b<? super ActivityC0218d, C89391z> bVar) {
        bVar.invoke(mo23037b());
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$c */
    public class C14286c {

        /* renamed from: a */
        public AbstractC84920d f34631a;

        /* renamed from: b */
        public AbstractC89172b<? super C50903l.C50906c, C89391z> f34632b;

        /* renamed from: c */
        public C50852e f34633c;

        /* renamed from: d */
        final /* synthetic */ C14283c f34634d;

        static {
            Covode.recordClassIndex(16357);
        }

        public /* synthetic */ C14286c(C14283c cVar) {
            this(cVar, new C84921e(), new C50852e());
        }

        private C14286c(C14283c cVar, AbstractC84920d dVar, C50852e eVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(eVar, "");
            this.f34634d = cVar;
            this.f34631a = dVar;
            this.f34632b = null;
            this.f34633c = eVar;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$f */
    static final class C14289f<T> implements AbstractC88433f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34637a;

        static {
            Covode.recordClassIndex(16360);
        }

        C14289f(C14283c cVar) {
            this.f34637a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            this.f34637a.mo23035a().mo23024a(Integer.MIN_VALUE);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$j */
    static final class C14293j<T> implements AbstractC88433f<C20375am<EnumC50818e, Integer, FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34641a;

        static {
            Covode.recordClassIndex(16364);
        }

        C14293j(C14283c cVar) {
            this.f34641a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20375am<EnumC50818e, Integer, FilterBean> amVar) {
            final C20375am<EnumC50818e, Integer, FilterBean> amVar2 = amVar;
            this.f34641a.mo23036a(new AbstractC89172b<ActivityC0218d, C89391z>(this) {
                /* class com.bytedance.creativex.recorder.filter.panel.C14283c.C14293j.C142941 */

                /* renamed from: a */
                final /* synthetic */ C14293j f34642a;

                static {
                    Covode.recordClassIndex(16365);
                }

                {
                    this.f34642a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(ActivityC0218d dVar) {
                    C89219l.m154721d(dVar, "");
                    FilterPanelViewModel a = this.f34642a.f34641a.mo23035a();
                    C c = amVar2.f48262c;
                    int intValue = amVar2.f48261b.intValue();
                    C89219l.m154721d(c, "");
                    a.f34562a.setFilterProgress(c, intValue);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC50824j m26014a(C14283c cVar) {
        AbstractC50824j jVar = cVar.f34615a;
        if (jVar == null) {
            C89219l.m154710a("filterView");
        }
        return jVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC50829e m26015b(C14283c cVar) {
        AbstractC50829e eVar = cVar.f34617c;
        if (eVar == null) {
            C89219l.m154710a("combiner");
        }
        return eVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$g */
    static final class C14290g<T> implements AbstractC88433f<C20169f<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34638a;

        static {
            Covode.recordClassIndex(16361);
        }

        C14290g(C14283c cVar) {
            this.f34638a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20169f<? extends FilterBean> fVar) {
            this.f34638a.mo23035a().mo23025a((FilterBean) fVar.mo33486a(), false);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$k */
    static final class C14295k<T> implements AbstractC88433f<C50816c> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34644a;

        static {
            Covode.recordClassIndex(16366);
        }

        C14295k(C14283c cVar) {
            this.f34644a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C50816c cVar) {
            FilterPanelViewModel a = this.f34644a.mo23035a();
            C89219l.m154716b(cVar, "");
            C89219l.m154721d(cVar, "");
            a.f34565d.onNext(cVar);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$m */
    static final class C14297m<T> implements AbstractC88433f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34646a;

        static {
            Covode.recordClassIndex(16368);
        }

        C14297m(C14283c cVar) {
            this.f34646a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f34646a.mo23036a(new AbstractC89172b<ActivityC0218d, C89391z>(this) {
                    /* class com.bytedance.creativex.recorder.filter.panel.C14283c.C14297m.C142981 */

                    /* renamed from: a */
                    final /* synthetic */ C14297m f34647a;

                    static {
                        Covode.recordClassIndex(16369);
                    }

                    {
                        this.f34647a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(ActivityC0218d dVar) {
                        C89219l.m154721d(dVar, "");
                        this.f34647a.f34646a.withState(this.f34647a.f34646a.mo23035a(), new AbstractC89172b<FilterPanelState, C89391z>(this) {
                            /* class com.bytedance.creativex.recorder.filter.panel.C14283c.C14297m.C142981.C142991 */

                            /* renamed from: a */
                            final /* synthetic */ C142981 f34648a;

                            static {
                                Covode.recordClassIndex(16370);
                            }

                            {
                                this.f34648a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(FilterPanelState filterPanelState) {
                                FilterPanelState filterPanelState2 = filterPanelState;
                                C89219l.m154721d(filterPanelState2, "");
                                if (filterPanelState2.getUi() instanceof AbstractC23517a.C23519b) {
                                    this.f34648a.f34647a.f34646a.mo23035a().mo22964a(false);
                                }
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$o */
    static final class C14301o extends AbstractC89220m implements AbstractC89172b<FilterPanelState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34650a;

        static {
            Covode.recordClassIndex(16372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14301o(C14283c cVar) {
            super(1);
            this.f34650a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            if (filterPanelState2.getDisableFilter()) {
                C14283c.m26014a(this.f34650a).mo86197d();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$l */
    static final class C14296l<T> implements AbstractC88433f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34645a;

        static {
            Covode.recordClassIndex(16367);
        }

        C14296l(C14283c cVar) {
            this.f34645a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            Boolean bool2 = bool;
            FilterPanelViewModel a = this.f34645a.mo23035a();
            C89219l.m154716b(bool2, "");
            boolean booleanValue = bool2.booleanValue();
            a.f34562a.setFilterDisable(booleanValue, "build_in");
            a.mo33689c(new FilterPanelViewModel.C14269g(booleanValue));
            if (booleanValue) {
                a.mo33690d(FilterPanelViewModel.C14270h.f34584a);
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$e */
    static final class C14288e<T> implements AbstractC88433f<C50814a> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34636a;

        static {
            Covode.recordClassIndex(16359);
        }

        C14288e(C14283c cVar) {
            this.f34636a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C50814a aVar) {
            C50814a aVar2 = aVar;
            FilterPanelViewModel a = this.f34636a.mo23035a();
            C89219l.m154716b(aVar2, "");
            C89219l.m154721d(aVar2, "");
            int i = C14282b.f34613a[aVar2.f117261a.ordinal()];
            if (i == 1 || i == 2) {
                List<FilterBean> value = a.f34567f.mo86071f().mo86075b().getValue();
                T t = null;
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next.getId() == aVar2.f117262b.f117036a.f117047a) {
                            t = next;
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        a.mo23025a((FilterBean) t2, true);
                        return;
                    }
                }
                a.mo23024a(aVar2.f117262b.f117036a.f117047a);
            } else if (i == 3) {
                a.mo23024a(Integer.MIN_VALUE);
                a.mo33687b_(new FilterPanelViewModel.C14266e(a, aVar2));
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$s */
    static final class C14305s extends AbstractC89220m implements AbstractC89172b<ActivityC0218d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34654a;

        static {
            Covode.recordClassIndex(16376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14305s(C14283c cVar) {
            super(1);
            this.f34654a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ActivityC0218d dVar) {
            C50846c cVar;
            AbstractC84919c cVar2;
            C89219l.m154721d(dVar, "");
            C14283c cVar3 = this.f34654a;
            if (!cVar3.f34618d) {
                View findViewById = cVar3.f52550n.findViewById(R.id.dg1);
                C89219l.m154716b(findViewById, "");
                cVar3.f34615a = new C50903l((ViewGroup) findViewById, cVar3, cVar3.f34623i, cVar3.f34622h, cVar3.f34625k, cVar3.f34620f.f34632b);
                cVar3.withState(cVar3.mo23035a(), new C14301o(cVar3));
                C14303q qVar = null;
                if (cVar3.f34624j == null) {
                    cVar = null;
                } else {
                    View findViewById2 = cVar3.f52550n.findViewById(R.id.dg2);
                    C89219l.m154716b(findViewById2, "");
                    ViewGroup viewGroup = (ViewGroup) findViewById2;
                    AbstractC50701i iVar = cVar3.f34624j;
                    C50852e eVar = cVar3.f34620f.f34633c;
                    C89219l.m154721d(viewGroup, "");
                    C89219l.m154721d(cVar3, "");
                    C89219l.m154721d(iVar, "");
                    C89219l.m154721d(eVar, "");
                    cVar = new C50846c(viewGroup, cVar3, new FilterBoxViewModel(cVar3, iVar), eVar);
                }
                cVar3.f34616b = cVar;
                C14302p pVar = new C14302p(cVar3);
                AbstractC50819f fVar = cVar3.f34616b;
                if (fVar != null) {
                    qVar = new C14303q(fVar);
                }
                if (cVar3.mo23037b() instanceof AbstractC84919c) {
                    ActivityC0218d b = cVar3.mo23037b();
                    Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                    cVar2 = (AbstractC84919c) b;
                } else {
                    Object a = cVar3.f34621g.mo35247a(AbstractC14170ab.class);
                    Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                    cVar2 = (AbstractC84919c) a;
                }
                cVar3.f34617c = new C50916m(pVar, qVar, cVar2, new C14304r(cVar3));
                C88411a aVar = cVar3.f34619e;
                AbstractC50824j jVar = cVar3.f34615a;
                if (jVar == null) {
                    C89219l.m154710a("filterView");
                }
                aVar.mo142945a(jVar.mo86199f().mo143254a(new C14290g(cVar3), C84909p.f189747a));
                C88411a aVar2 = cVar3.f34619e;
                AbstractC50824j jVar2 = cVar3.f34615a;
                if (jVar2 == null) {
                    C89219l.m154710a("filterView");
                }
                aVar2.mo142945a(jVar2.mo86198e().mo143254a(new C14293j(cVar3), C84909p.f189747a));
                C88411a aVar3 = cVar3.f34619e;
                AbstractC50824j jVar3 = cVar3.f34615a;
                if (jVar3 == null) {
                    C89219l.m154710a("filterView");
                }
                aVar3.mo142945a(jVar3.mo86201h().mo143254a(new C14295k(cVar3), C84909p.f189747a));
                C88411a aVar4 = cVar3.f34619e;
                AbstractC50824j jVar4 = cVar3.f34615a;
                if (jVar4 == null) {
                    C89219l.m154710a("filterView");
                }
                aVar4.mo142945a(jVar4.mo86200g().mo143254a(new C14296l(cVar3), C84909p.f189747a));
                AbstractC50819f fVar2 = cVar3.f34616b;
                if (fVar2 != null) {
                    cVar3.f34619e.mo142945a(fVar2.mo86175c().mo143254a(new C14288e(cVar3), C84909p.f189747a));
                    cVar3.f34619e.mo142945a(fVar2.mo86176d().mo143254a(new C14289f(cVar3), C84909p.f189747a));
                }
                C88411a aVar5 = cVar3.f34619e;
                AbstractC50829e eVar2 = cVar3.f34617c;
                if (eVar2 == null) {
                    C89219l.m154710a("combiner");
                }
                aVar5.mo142945a(eVar2.mo86217d().mo143254a(new C14297m(cVar3), C84909p.f189747a));
                AbstractC20468h.C20469a.m38668a(cVar3, cVar3.mo23035a(), C14307e.f34656a, new C14300n(cVar3));
                AbstractC20468h.C20469a.m38668a(cVar3, cVar3.mo23035a(), C14308f.f34657a, new C14291h(cVar3));
                AbstractC20382b.C20383a.m38603b(cVar3, cVar3.mo23035a(), C14306d.f34655a, new C14292i(cVar3));
                cVar3.f34618d = true;
            }
            C14283c.m26015b(this.f34654a).mo86214a();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$i */
    static final class C14292i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34640a;

        static {
            Covode.recordClassIndex(16363);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14292i(C14283c cVar) {
            super(2);
            this.f34640a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            C14283c.m26015b(this.f34640a).mo86215b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$n */
    static final class C14300n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34649a;

        static {
            Covode.recordClassIndex(16371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14300n(C14283c cVar) {
            super(2);
            this.f34649a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
            Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map2 = map;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(map2, "");
            C14283c.m26014a(this.f34649a).mo86178a(map2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bhy, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.c$h */
    static final class C14291h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, FilterBean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14283c f34639a;

        static {
            Covode.recordClassIndex(16362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14291h(C14283c cVar) {
            super(2);
            this.f34639a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            C89219l.m154721d(iVar, "");
            if (!C50687a.m94979a(filterBean2, C14283c.m26014a(this.f34639a).mo86193a())) {
                C14283c.m26014a(this.f34639a).mo86194a(filterBean2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    public C14283c(C21582f fVar, AbstractC50705m mVar, AbstractC50707o oVar, AbstractC50701i iVar, AbstractC50828d dVar, AbstractC89172b<? super C14286c, C89391z> bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        this.f34621g = fVar;
        this.f34622h = mVar;
        this.f34623i = oVar;
        this.f34624j = iVar;
        this.f34625k = dVar;
        AbstractC89277c a = C89204ab.m154669a(FilterPanelViewModel.class);
        this.f34626t = C89250i.m154773a((AbstractC89171a) new C14284a(this, a, a));
        C14286c cVar = new C14286c(this);
        this.f34620f = cVar;
        if (bVar != null) {
            bVar.invoke(cVar);
        }
        this.f34627u = C89250i.m154773a((AbstractC89171a) new C14287d(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
