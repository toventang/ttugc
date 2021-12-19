package com.p2082ss.android.ugc.gamora.editor.filter.core;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
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
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.p2217f.C31096d;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50800m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50864b;
import com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50870e;
import com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50885g;
import com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50903l;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.C50816c;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.EnumC50818e;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.gamora.editor.filter.core.p4280a.C82201a;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88773m;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e */
public final class C82212e extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f183934a = {new C89232y(C82212e.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0)};

    /* renamed from: h */
    public static final C82216d f183935h = new C82216d((byte) 0);

    /* renamed from: b */
    public final C82211d f183936b;

    /* renamed from: c */
    final AbstractC89244h f183937c;

    /* renamed from: d */
    final C88411a f183938d;

    /* renamed from: e */
    public FilterBean f183939e;

    /* renamed from: f */
    final AbstractC50707o f183940f;

    /* renamed from: g */
    final AbstractC84398d f183941g;

    /* renamed from: i */
    private final AbstractC89248d f183942i;

    /* renamed from: j */
    private final AbstractC89244h f183943j;

    /* renamed from: k */
    private final AbstractC89244h f183944k;

    /* renamed from: l */
    private final AbstractC89244h f183945l;

    /* renamed from: t */
    private final AbstractC89244h f183946t;

    /* renamed from: u */
    private final C21582f f183947u;

    static {
        Covode.recordClassIndex(96042);
    }

    /* renamed from: C */
    public final C82201a mo127399C() {
        return (C82201a) this.f183945l.getValue();
    }

    /* renamed from: D */
    public final AbstractC50824j mo127400D() {
        return (AbstractC50824j) this.f183946t.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC14552j mo127402a() {
        return (AbstractC14552j) this.f183942i.mo23374a(this, f183934a[0]);
    }

    /* renamed from: b */
    public final EditFilterViewModel mo127403b() {
        return (EditFilterViewModel) this.f183943j.getValue();
    }

    /* renamed from: d */
    public final AbstractC72510a mo127404d() {
        return (AbstractC72510a) this.f183944k.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$d */
    public static final class C82216d {
        static {
            Covode.recordClassIndex(96046);
        }

        private C82216d() {
        }

        public /* synthetic */ C82216d(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f183947u;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$a */
    public static final class C82213a extends AbstractC89220m implements AbstractC89171a<AbstractC82237a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f183948a;

        static {
            Covode.recordClassIndex(96043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82213a(AbstractC21566a aVar) {
            super(0);
            this.f183948a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.filter.indicator.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f183948a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.indicator.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35248a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.filter.core.C82212e.C82213a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$b */
    public static final class C82214b extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f183949a;

        static {
            Covode.recordClassIndex(96044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82214b(AbstractC21566a aVar) {
            super(0);
            this.f183949a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f183949a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35248a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.filter.core.C82212e.C82214b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: E */
    public final void mo127401E() {
        mo127400D().mo86196c();
        mo127403b().mo88318a(false, this.f183939e);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        if (!this.f183938d.isDisposed()) {
            this.f183938d.dispose();
        }
        mo127399C().f183899b = null;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$i */
    static final class C82222i extends AbstractC89220m implements AbstractC89171a<C82201a> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183958a;

        static {
            Covode.recordClassIndex(96052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82222i(C82212e eVar) {
            super(0);
            this.f183958a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82201a invoke() {
            C82212e eVar = this.f183958a;
            C82225l lVar = new C82225l(eVar);
            C82201a aVar = new C82201a(eVar, eVar.mo127402a(), (AbstractC82237a) eVar.f183937c.getValue(), eVar.f183940f, eVar.mo127404d().mo114821j(), new C82224k(eVar));
            aVar.f183899b = lVar;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$c */
    public static final class C82215c extends AbstractC89220m implements AbstractC89171a<EditFilterViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f183950a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f183951b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f183952c;

        static {
            Covode.recordClassIndex(96045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82215c(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f183950a = jVar;
            this.f183951b = cVar;
            this.f183952c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f183950a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f183952c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f183952c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f183951b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142273x2a541245(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f183950a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f183951b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142273x2a541245(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.filter.core.C82212e.C82215c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_filter_core_EditFilterScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142273x2a541245(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$j */
    static final class C82223j extends AbstractC89220m implements AbstractC89171a<C50903l> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183959a;

        static {
            Covode.recordClassIndex(96053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82223j(C82212e eVar) {
            super(0);
            this.f183959a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C50903l invoke() {
            C82212e eVar = this.f183959a;
            AbstractC50706n value = eVar.mo127404d().mo114822k().getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(value, "");
            AbstractC50706n nVar = value;
            AbstractC50707o oVar = eVar.f183940f;
            AbstractC50703k value2 = eVar.mo127404d().mo114823l().getValue();
            if (value2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(value2, "");
            View findViewById = eVar.f52550n.findViewById(R.id.arn);
            C89219l.m154716b(findViewById, "");
            C50903l lVar = new C50903l((ViewGroup) findViewById, eVar, oVar, C50800m.m95128a(nVar, value2), new C50864b(eVar.f183941g, oVar), new C82220h(eVar));
            C88411a aVar = eVar.f183938d;
            AbstractC88979t<C20169f<FilterBean>> f = lVar.mo86199f();
            AbstractC88434g<Object, Object> gVar = C88446a.f200695a;
            C88446a.EnumC88458l lVar2 = C88446a.EnumC88458l.INSTANCE;
            C88466b.m153697a((Object) gVar, "keySelector is null");
            C88466b.m153697a((Object) lVar2, "collectionSupplier is null");
            aVar.mo142945a(C88925a.m154171a(new C88773m(f, gVar, lVar2)).mo143254a(new C82217e(eVar), C84909p.f189747a));
            eVar.f183938d.mo142945a(lVar.mo86198e().mo143254a(new C82218f(eVar), C84909p.f189747a));
            eVar.f183938d.mo142945a(lVar.mo86201h().mo143254a(new C82219g(eVar), C84909p.f189747a));
            return lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$l */
    public static final class C82225l implements C82201a.AbstractC82203b {

        /* renamed from: a */
        final /* synthetic */ C82212e f183961a;

        static {
            Covode.recordClassIndex(96055);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82225l(C82212e eVar) {
            this.f183961a = eVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.p4280a.C82201a.AbstractC82203b
        /* renamed from: a */
        public final void mo120466a(FilterBean filterBean) {
            this.f183961a.mo127403b().mo127388b(filterBean, true, this.f183961a.f52549m);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.p4280a.C82201a.AbstractC82203b
        /* renamed from: a */
        public final void mo120467a(FilterBean filterBean, FilterBean filterBean2, float f) {
            this.f183961a.mo127404d().mo114798a(filterBean, filterBean2, f);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$k */
    static final class C82224k extends AbstractC89220m implements AbstractC89172b<FilterBean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183960a;

        static {
            Covode.recordClassIndex(96054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82224k(C82212e eVar) {
            super(1);
            this.f183960a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FilterBean filterBean) {
            this.f183960a.mo127403b().mo127388b(filterBean, false, null);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$f */
    static final class C82218f<T> implements AbstractC88433f<C20375am<EnumC50818e, Integer, FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183954a;

        static {
            Covode.recordClassIndex(96048);
        }

        C82218f(C82212e eVar) {
            this.f183954a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20375am<EnumC50818e, Integer, FilterBean> amVar) {
            C20375am<EnumC50818e, Integer, FilterBean> amVar2 = amVar;
            this.f183954a.mo127403b().mo127385a(amVar2.f48262c, amVar2.f48261b.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$m */
    static final class C82226m<T> implements AbstractC1214u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183962a;

        static {
            Covode.recordClassIndex(96056);
        }

        C82226m(C82212e eVar) {
            this.f183962a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            C82201a C = this.f183962a.mo127399C();
            C89219l.m154716b(bool2, "");
            C.f183902e = bool2.booleanValue();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$e */
    static final class C82217e<T> implements AbstractC88433f<C20169f<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183953a;

        static {
            Covode.recordClassIndex(96047);
        }

        C82217e(C82212e eVar) {
            this.f183953a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20169f<? extends FilterBean> fVar) {
            FilterBean filterBean = (FilterBean) fVar.mo33486a();
            if (!C50687a.m94979a(this.f183953a.f183939e, filterBean)) {
                this.f183953a.mo127399C().mo127394a(filterBean);
                this.f183953a.mo127403b().mo127388b(filterBean, false, this.f183953a.f52549m);
                this.f183953a.f183939e = filterBean;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$g */
    static final class C82219g<T> implements AbstractC88433f<C50816c> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183955a;

        static {
            Covode.recordClassIndex(96049);
        }

        C82219g(C82212e eVar) {
            this.f183955a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C50816c cVar) {
            String str;
            C50816c cVar2 = cVar;
            int i = C82230f.f183966a[cVar2.f117264a.ordinal()];
            if (i == 1) {
                this.f183955a.mo127401E();
            } else if (i == 2) {
                EditFilterViewModel b = this.f183955a.mo127403b();
                EffectCategoryResponse effectCategoryResponse = cVar2.f117265b;
                if (effectCategoryResponse == null || (str = effectCategoryResponse.getName()) == null) {
                    str = "";
                }
                b.mo88317a(str);
            } else if (i == 3) {
                this.f183955a.mo127403b().mo127389e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$h */
    static final class C82220h extends AbstractC89220m implements AbstractC89172b<C50903l.C50906c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183956a;

        static {
            Covode.recordClassIndex(96050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82220h(C82212e eVar) {
            super(1);
            this.f183956a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C50903l.C50906c cVar) {
            C50903l.C50906c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            cVar2.f117470a = this.f183956a.f183936b.f183931b;
            cVar2.f117471b = this.f183956a.f183936b.f183932c;
            cVar2.f117472c = this.f183956a.f183936b.f183933d;
            cVar2.mo86270a(new C50870e(false, null, new C50885g(0, false, new AbstractC89172b<C85035a.C85036a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.filter.core.C82212e.C82220h.C822211 */

                /* renamed from: a */
                final /* synthetic */ C82220h f183957a;

                static {
                    Covode.recordClassIndex(96051);
                }

                {
                    this.f183957a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C85035a.C85036a aVar) {
                    C85035a.C85036a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    EnumC82234j jVar = this.f183957a.f183956a.f183936b.f183930a;
                    if (jVar == EnumC82234j.Rect) {
                        aVar2.f190273d = false;
                        Context s = this.f183957a.f183956a.mo36485s();
                        C89219l.m154716b(s, "");
                        aVar2.f190274e = (int) C84912r.m145930a(s, 4.0f);
                    } else if (jVar == EnumC82234j.Circle) {
                        aVar2.f190273d = true;
                    }
                    return C89391z.f203057a;
                }
            }, 3), 31));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        int a;
        super.mo22704a(bundle);
        mo127403b().f183881b.observe(this, new C82226m(this));
        AbstractC20382b.C20383a.m38603b(this, mo127403b(), C82231g.f183967a, new C82227n(this));
        AbstractC88412b unused = selectSubscribe(mo127403b(), C82232h.f183968a, new C20370ah(), new C82228o(this));
        AbstractC88412b unused2 = selectSubscribe(mo127403b(), C82233i.f183969a, new C20370ah(), new C82229p(this));
        FrameLayout a2 = mo127402a().mo23382a();
        if (a2 instanceof GestureDetector$OnDoubleTapListenerC14546h) {
            GestureDetector$OnDoubleTapListenerC14546h hVar = (GestureDetector$OnDoubleTapListenerC14546h) a2;
            ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
            Activity activity = this.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            int b = C31096d.m64299b(activity);
            Activity activity2 = this.f52549m;
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            if (C31096d.m64298a(activity2)) {
                a = 0;
            } else {
                Activity activity3 = this.f52549m;
                if (activity3 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity3, "");
                a = (int) C84912r.m145930a(activity3, 50.0f);
            }
            int i = b + a;
            Activity activity4 = this.f52549m;
            if (activity4 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity4, "");
            int c = C31096d.m64300c(activity4);
            Activity activity5 = this.f52549m;
            if (activity5 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity5, "");
            int a3 = c + ((int) C84912r.m145930a(activity5, 50.0f));
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(i, a3);
            } else {
                layoutParams.width = i;
                layoutParams.height = a3;
            }
            hVar.setLayoutParams(layoutParams);
            Context s = mo36485s();
            C89219l.m154716b(s, "");
            hVar.setSloppyExtra((int) C84912r.m145930a(s, 150.0f));
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$p */
    static final class C82229p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183965a;

        static {
            Covode.recordClassIndex(96059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82229p(C82212e eVar) {
            super(2);
            this.f183965a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
            Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map2 = map;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(map2, "");
            this.f183965a.mo127400D().mo86178a(map2);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.as4, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$n */
    static final class C82227n extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183963a;

        static {
            Covode.recordClassIndex(96057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82227n(C82212e eVar) {
            super(2);
            this.f183963a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                C82212e eVar = this.f183963a;
                eVar.mo127400D().mo86195b();
                eVar.mo127403b().mo88318a(true, (FilterBean) null);
            } else {
                this.f183963a.mo127401E();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$o */
    static final class C82228o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20391d<? extends FilterBean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82212e f183964a;

        static {
            Covode.recordClassIndex(96058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82228o(C82212e eVar) {
            super(2);
            this.f183964a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20391d<? extends FilterBean> dVar) {
            C20391d<? extends FilterBean> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(dVar2, "");
            this.f183964a.f183939e = dVar2.f48283b;
            this.f183964a.mo127400D().mo86194a((FilterBean) dVar2.f48283b);
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

    public C82212e(C21582f fVar, AbstractC50707o oVar, AbstractC84398d dVar, AbstractC89172b<? super C82211d, C89391z> bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        this.f183947u = fVar;
        this.f183940f = oVar;
        this.f183941g = dVar;
        C82211d dVar2 = new C82211d();
        this.f183936b = dVar2;
        if (bVar != null) {
            bVar.invoke(dVar2);
        }
        this.f183942i = C21572a.m40504a(getDiContainer(), AbstractC14552j.class);
        AbstractC89277c a = C89204ab.m154669a(EditFilterViewModel.class);
        this.f183943j = C89250i.m154773a((AbstractC89171a) new C82215c(this, a, a));
        this.f183937c = C89250i.m154774a(EnumC89331m.NONE, new C82213a(this));
        this.f183944k = C89250i.m154774a(EnumC89331m.NONE, new C82214b(this));
        this.f183945l = C89250i.m154773a((AbstractC89171a) new C82222i(this));
        this.f183946t = C89250i.m154773a((AbstractC89171a) new C82223j(this));
        this.f183938d = new C88411a();
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
