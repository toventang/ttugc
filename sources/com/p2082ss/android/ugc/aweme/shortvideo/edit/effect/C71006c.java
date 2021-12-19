package com.p2082ss.android.ugc.aweme.shortvideo.edit.effect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p036g.AbstractC0688a;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.common.utility.C13617h;
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
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a;
import com.p2082ss.android.ugc.aweme.effect.C46267ac;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73949aj;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88292p;
import java.util.Iterator;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
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
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c */
public final class C71006c extends AbstractC22219j implements AbstractC20382b {

    /* renamed from: a */
    public static final C71009c f158940a = new C71009c((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f158941b;

    /* renamed from: c */
    private final AbstractC89244h f158942c = C89250i.m154774a(EnumC89331m.NONE, new C71007a(this));

    /* renamed from: d */
    private final AbstractC89244h f158943d = C89250i.m154773a((AbstractC89171a) C71010d.f158948a);

    static {
        Covode.recordClassIndex(83502);
    }

    /* renamed from: d */
    private final EditEffectViewModel m125371d() {
        return (EditEffectViewModel) this.f158941b.getValue();
    }

    /* renamed from: a */
    public final AbstractC46036a mo112160a() {
        return (AbstractC46036a) this.f158942c.getValue();
    }

    /* renamed from: b */
    public final C46267ac mo112161b() {
        return (C46267ac) this.f158943d.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$c */
    public static final class C71009c {
        static {
            Covode.recordClassIndex(83505);
        }

        private C71009c() {
        }

        public /* synthetic */ C71009c(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$d */
    static final class C71010d extends AbstractC89220m implements AbstractC89171a<C46267ac> {

        /* renamed from: a */
        public static final C71010d f158948a = new C71010d();

        static {
            Covode.recordClassIndex(83506);
        }

        C71010d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C46267ac invoke() {
            return new C46267ac();
        }
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

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
        mo112161b().f107880h.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$a */
    public static final class C71007a extends AbstractC89220m implements AbstractC89171a<AbstractC46036a> {

        /* renamed from: a */
        final /* synthetic */ C71006c f158944a;

        static {
            Covode.recordClassIndex(83503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71007a(C71006c cVar) {
            super(0);
            this.f158944a = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.effect.c r0 = r2.f158944a
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.C2545a.m7450a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r0 = com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a.class
                com.bytedance.als.b r0 = r1.mo7013a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.C71006c.C71007a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: v */
    public final void mo36489v() {
        super.mo36489v();
        C46267ac b = mo112161b();
        if (b.f107846G != null) {
            b.f107880h.post(b.f107846G);
        }
        if (b.f107847H != null) {
            b.f107880h.post(b.f107847H);
        }
    }

    public C71006c() {
        AbstractC89277c a = C89204ab.m154669a(EditEffectViewModel.class);
        this.f158941b = C89250i.m154773a((AbstractC89171a) new C71008b(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$b */
    public static final class C71008b extends AbstractC89220m implements AbstractC89171a<EditEffectViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f158945a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f158946b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f158947c;

        static {
            Covode.recordClassIndex(83504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71008b(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f158945a = jVar;
            this.f158946b = cVar;
            this.f158947c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.shortvideo.edit.effect.EditEffectViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.shortvideo.edit.effect.EditEffectViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.EditEffectViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f158945a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f158947c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f158947c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f158946b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m125379x93242380(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f158945a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f158946b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m125379x93242380(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.C71006c.C71008b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_effect_EditEffectScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m125379x93242380(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: o */
    public final void mo36481o() {
        ChooseVideoCoverView.C74231a aVar;
        super.mo36481o();
        C46267ac b = mo112161b();
        if (!(b.f107840A == null || b.f107843D == null)) {
            b.f107840A.mo56349d(b.f107843D);
        }
        if ((b.f107895w.getAdapter() instanceof ChooseVideoCoverView.C74231a) && (aVar = (ChooseVideoCoverView.C74231a) b.f107895w.getAdapter()) != null) {
            aVar.mo116717b();
        }
        if (b.f107864Y != null) {
            b.f107864Y.mo78863a();
        }
        if (b.f107849J != null) {
            b.f107849J.f108068b.mo78795c();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$e */
    static final class C71011e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71006c f158949a;

        static {
            Covode.recordClassIndex(83507);
        }

        C71011e(C71006c cVar) {
            this.f158949a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                num.intValue();
                this.f158949a.mo112161b().mo78761e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$g */
    static final class C71013g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71006c f158951a;

        static {
            Covode.recordClassIndex(83509);
        }

        C71013g(C71006c cVar) {
            this.f158951a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            AbstractC46036a a = this.f158951a.mo112160a();
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            a.mo77619a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$i */
    static final class C71015i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71006c f158953a;

        static {
            Covode.recordClassIndex(83511);
        }

        C71015i(C71006c cVar) {
            this.f158953a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C46267ac b = this.f158953a.mo112161b();
            b.mo78746a(0, true, true);
            b.f107874b.mTimeEffect = null;
            b.f107893u.setCurrentItem(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$h */
    static final class C71014h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71006c f158952a;

        static {
            Covode.recordClassIndex(83510);
        }

        C71014h(C71006c cVar) {
            this.f158952a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C46267ac b = this.f158952a.mo112161b();
            b.mo78746a(0, true, false);
            b.f107874b.mTimeEffect = null;
            C88292p pVar = new C88292p();
            pVar.f200341g = 9;
            b.f107876d.setValue(pVar);
            b.f107896x.mo111135a(false, false, (AbstractC0688a<Void>) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x03b0, code lost:
        if (r1.equals("1") == false) goto L_0x02c8;
     */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22704a(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 1166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.C71006c.mo22704a(android.os.Bundle):void");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$k */
    static final class C71017k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71006c f158955a;

        static {
            Covode.recordClassIndex(83513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71017k(C71006c cVar) {
            super(2);
            this.f158955a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            C46267ac b = this.f158955a.mo112161b();
            b.mo78746a(0, true, true);
            b.f107882j.mo78720a(true, b.f107845F);
            b.mo78770n();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$l */
    static final class C71018l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71006c f158956a;

        static {
            Covode.recordClassIndex(83514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71018l(C71006c cVar) {
            super(2);
            this.f158956a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            this.f158956a.mo112161b().f107869ad = true;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.as3, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$j */
    static final class C71016j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71006c f158954a;

        static {
            Covode.recordClassIndex(83512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71016j(C71006c cVar) {
            super(2);
            this.f158954a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            this.f158954a.mo112161b().f107862W.mo78627d().setValue(Integer.valueOf(intValue));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$f */
    static final class C71012f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20523m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71006c f158950a;

        static {
            Covode.recordClassIndex(83508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71012f(C71006c cVar) {
            super(2);
            this.f158950a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20523m mVar) {
            C20523m mVar2 = mVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(mVar2, "");
            C46267ac b = this.f158950a.mo112161b();
            int intValue = mVar2.f48283b.intValue();
            if (!C13617h.m24465a(b.f107874b.mEffectList)) {
                Iterator<EffectPointModel> it = b.f107874b.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    C89378p<Integer, Integer> a = C73949aj.m130040a(next.getUiStartPoint(), next.getUiEndPoint(), intValue);
                    next.setUiStartPoint(a.getFirst().intValue());
                    next.setUiEndPoint(a.getSecond().intValue());
                    if (b.f107840A != null) {
                        next.setStartPoint(b.f107840A.mo56386s(a.getFirst().intValue()));
                        next.setEndPoint(b.f107840A.mo56386s(a.getSecond().intValue()));
                    }
                }
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
