package com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.story.base.p4020a.C76609c;
import com.p2082ss.android.ugc.aweme.story.base.p4020a.C76610d;
import com.p2082ss.android.ugc.aweme.story.base.p4021b.C76613a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.p4041a.C77059a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.AbstractC77135b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
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

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f */
public final class C77071f extends AbstractC22219j implements AbstractC20382b, AbstractC21566a, AbstractC77135b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172889a = {new C89232y(C77071f.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: g */
    public static final C77073b f172890g = new C77073b((byte) 0);

    /* renamed from: b */
    public View f172891b;

    /* renamed from: c */
    public ViewGroup f172892c;

    /* renamed from: d */
    public ViewGroup f172893d;

    /* renamed from: e */
    public final Map<Integer, C77059a> f172894e = new LinkedHashMap();

    /* renamed from: f */
    public AnimatorSet f172895f;

    /* renamed from: h */
    private final AbstractC89244h f172896h;

    /* renamed from: i */
    private final AbstractC89248d f172897i;

    /* renamed from: j */
    private final C21582f f172898j;

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$l */
    static final class View$OnClickListenerC77084l implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC77084l f172916a = new View$OnClickListenerC77084l();

        static {
            Covode.recordClassIndex(90085);
        }

        View$OnClickListenerC77084l() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(90072);
    }

    /* renamed from: a */
    public final StoryEditToolbarViewModel mo120613a() {
        return (StoryEditToolbarViewModel) this.f172896h.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$b */
    public static final class C77073b {
        static {
            Covode.recordClassIndex(90074);
        }

        private C77073b() {
        }

        public /* synthetic */ C77073b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172898j;
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

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77117a
    public final /* synthetic */ VEEditClipCluster cF_() {
        return (VEEditClipCluster) this.f172897i.mo23374a(this, f172889a[0]);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AnimatorSet animatorSet = this.f172895f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$c */
    public static final class RunnableC77074c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C77071f f172902a;

        static {
            Covode.recordClassIndex(90075);
        }

        RunnableC77074c(C77071f fVar) {
            this.f172902a = fVar;
        }

        public final void run() {
            AnimatorSet animatorSet;
            Activity activity = this.f172902a.f52549m;
            if ((activity == null || !activity.isFinishing()) && (animatorSet = this.f172902a.f172895f) != null) {
                animatorSet.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$a */
    public static final class C77072a extends AbstractC89220m implements AbstractC89171a<StoryEditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f172899a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f172900b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f172901c;

        static {
            Covode.recordClassIndex(90073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77072a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f172899a = jVar;
            this.f172900b = cVar;
            this.f172901c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f172899a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f172901c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f172901c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f172900b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m134684x1b904aee(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f172899a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f172900b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m134684x1b904aee(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.C77071f.C77072a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_story_edit_business_shared_toolbar_StoryEditToolbarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m134684x1b904aee(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: d */
    private final void m134677d() {
        if (C76610d.m134195a().f171940a > 0) {
            AnimatorSet animatorSet = this.f172895f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Collection<C77059a> values = this.f172894e.values();
            ArrayList arrayList = new ArrayList(C89070n.m154526a(values, 10));
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getTextFadeOutAnimation());
            }
            List f = C89070n.m154580f((Iterable) arrayList);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(200L);
            animatorSet2.playTogether(f);
            this.f172895f = animatorSet2;
            ViewGroup viewGroup = this.f172892c;
            if (viewGroup == null) {
                C89219l.m154710a("toolbarContainer");
            }
            viewGroup.postDelayed(new RunnableC77074c(this), (long) C76610d.m134195a().f171940a);
        }
    }

    /* renamed from: b */
    public final void mo120615b() {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C77093o(4, 2131233929, R.string.g3w));
        arrayList.add(new C77093o(3, 2131233930, R.string.hc5));
        arrayList.add(new C77093o(2, 2131233926, R.string.bkw));
        arrayList.add(new C77093o(1, 2131233927, R.string.g59));
        StoryEditClipModel d = C77134a.m134739d(this);
        if (d != null) {
            if (C77148a.m134761f(d)) {
                i = 2131233928;
                i2 = R.string.g5d;
            }
            i = 2131233931;
            i2 = R.string.g5b;
        } else {
            i = 2131233931;
            i2 = R.string.g5b;
        }
        arrayList.add(new C77093o(5, i, i2));
        mo120613a().mo120598a(arrayList);
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewGroup m134675a(C77071f fVar) {
        ViewGroup viewGroup = fVar.f172892c;
        if (viewGroup == null) {
            C89219l.m154710a("toolbarContainer");
        }
        return viewGroup;
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewGroup m134676b(C77071f fVar) {
        ViewGroup viewGroup = fVar.f172893d;
        if (viewGroup == null) {
            C89219l.m154710a("titleLayout");
        }
        return viewGroup;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$g */
    static final class C77078g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, List<? extends C77093o>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77071f f172906a;

        static {
            Covode.recordClassIndex(90079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77078g(C77071f fVar) {
            super(2);
            this.f172906a = fVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$g$a */
        public static final class C77079a extends AbstractView$OnClickListenerC81432d {

            /* renamed from: a */
            final /* synthetic */ C77093o f172907a;

            /* renamed from: b */
            final /* synthetic */ C77078g f172908b;

            /* renamed from: c */
            final /* synthetic */ boolean f172909c;

            /* renamed from: d */
            final /* synthetic */ List f172910d;

            /* renamed from: e */
            final /* synthetic */ Map f172911e;

            static {
                Covode.recordClassIndex(90080);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                this.f172908b.f172906a.mo120613a().mo120597a(new C77092n(this.f172907a.f172928a));
            }

            C77079a(C77093o oVar, C77078g gVar, boolean z, List list, Map map) {
                this.f172907a = oVar;
                this.f172908b = gVar;
                this.f172909c = z;
                this.f172910d = list;
                this.f172911e = map;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, List<? extends C77093o> list) {
            boolean z;
            StoryEditClipModel d;
            boolean z2;
            int i;
            MethodCollector.m26663i(6137);
            List<? extends C77093o> list2 = list;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(list2, "");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C76609c a = C76610d.m134195a();
            Long l = 0L;
            Long valueOf = Long.valueOf(C76613a.m134197a().getLong("story_edit_toolbar_last_show_time", l.longValue()));
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                int i2 = a.f171941b;
                if (i2 == 0 || (i2 == 1 ? longValue == 0 : i2 != 2 || System.currentTimeMillis() - longValue > 86400000)) {
                    z = true;
                } else {
                    z = false;
                }
                for (T t : list2) {
                    Activity activity = this.f172906a.f52549m;
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity, "");
                    C77071f fVar = this.f172906a;
                    if (t.f172928a == 5 && ((d = C77134a.m134739d(fVar)) == null || C77148a.m134760e(d))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    int i3 = t.f172930c;
                    int i4 = t.f172929b;
                    C89219l.m154721d(activity, "");
                    C77059a aVar = new C77059a(activity, (byte) 0);
                    aVar.setText(i3);
                    aVar.setIcon(i4);
                    aVar.setTextEnable(z);
                    if (z2) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    aVar.setVisibility(i);
                    arrayList.add(aVar);
                    linkedHashMap.put(Integer.valueOf(t.f172928a), aVar);
                    aVar.setOnClickListener(new C77079a(t, this, z, arrayList, linkedHashMap));
                }
                this.f172906a.f172894e.clear();
                this.f172906a.f172894e.putAll(linkedHashMap);
                C77071f.m134675a(this.f172906a).removeAllViews();
                C77071f fVar2 = this.f172906a;
                fVar2.mo120614a(C77071f.m134675a(fVar2), arrayList);
                if (z) {
                    C76613a.m134197a().storeLong("story_edit_toolbar_last_show_time", Long.valueOf(System.currentTimeMillis()).longValue());
                }
                C89391z zVar = C89391z.f203057a;
                MethodCollector.m26664o(6137);
                return zVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            MethodCollector.m26664o(6137);
            throw nullPointerException;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$k */
    static final class View$OnClickListenerC77083k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77071f f172915a;

        static {
            Covode.recordClassIndex(90084);
        }

        View$OnClickListenerC77083k(C77071f fVar) {
            this.f172915a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f172915a.mo120613a().mo120597a(new C77092n(0));
        }
    }

    public C77071f(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172898j = fVar;
        AbstractC89277c a = C89204ab.m154669a(StoryEditToolbarViewModel.class);
        this.f172896h = C89250i.m154773a((AbstractC89171a) new C77072a(this, a, a));
        this.f172897i = C21572a.m40504a(getDiContainer(), VEEditClipCluster.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$e */
    static final class C77076e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77071f f172904a;

        static {
            Covode.recordClassIndex(90077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77076e(C77071f fVar) {
            super(2);
            this.f172904a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            this.f172904a.mo120615b();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$j */
    static final class C77082j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77071f f172914a;

        static {
            Covode.recordClassIndex(90083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77082j(C77071f fVar) {
            super(2);
            this.f172914a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            ViewGroup a = C77071f.m134675a(this.f172914a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$d */
    static final class C77075d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77071f f172903a;

        static {
            Covode.recordClassIndex(90076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77075d(C77071f fVar) {
            super(2);
            this.f172903a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            View view = this.f172903a.f172891b;
            if (view == null) {
                C89219l.m154710a("ivBack");
            }
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$f */
    static final class C77077f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77071f f172905a;

        static {
            Covode.recordClassIndex(90078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77077f(C77071f fVar) {
            super(2);
            this.f172905a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C77059a aVar = this.f172905a.f172894e.get(5);
            if (aVar != null) {
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                aVar.setVisibility(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$h */
    static final class C77080h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77071f f172912a;

        static {
            Covode.recordClassIndex(90081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77080h(C77071f fVar) {
            super(2);
            this.f172912a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            ViewGroup.LayoutParams layoutParams = C77071f.m134676b(this.f172912a).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = intValue;
                C77071f.m134676b(this.f172912a).setLayoutParams(marginLayoutParams);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$i */
    static final class C77081i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77071f f172913a;

        static {
            Covode.recordClassIndex(90082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77081i(C77071f fVar) {
            super(2);
            this.f172913a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            int i2;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C77059a aVar = this.f172913a.f172894e.get(5);
            if (aVar != null) {
                if (booleanValue) {
                    i = 2131233928;
                } else {
                    i = 2131233931;
                }
                aVar.setIcon(i);
                if (booleanValue) {
                    i2 = R.string.g5d;
                } else {
                    i2 = R.string.g5b;
                }
                aVar.setText(i2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b20, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        this.f172893d = viewGroup2;
        if (viewGroup2 == null) {
            C89219l.m154710a("titleLayout");
        }
        return viewGroup2;
    }

    /* renamed from: a */
    public final void mo120614a(ViewGroup viewGroup, List<? extends View> list) {
        MethodCollector.m26663i(6696);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            viewGroup.addView(view);
            if (i > 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = C71812ep.m126783a(20.0d, C63247i.f143610a);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    MethodCollector.m26664o(6696);
                    throw nullPointerException;
                }
            }
        }
        m134677d();
        MethodCollector.m26664o(6696);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.pf);
        C89219l.m154716b(c, "");
        this.f172891b = c;
        if (c == null) {
            C89219l.m154710a("ivBack");
        }
        c.setOnClickListener(new View$OnClickListenerC77083k(this));
        View c2 = mo36475c(R.id.c7f);
        C89219l.m154716b(c2, "");
        ViewGroup viewGroup = (ViewGroup) c2;
        this.f172892c = viewGroup;
        if (viewGroup == null) {
            C89219l.m154710a("toolbarContainer");
        }
        viewGroup.setOnClickListener(View$OnClickListenerC77084l.f172916a);
        selectNonNullSubscribe(mo120613a(), C77085g.f172917a, new C20370ah(), new C77078g(this));
        selectNonNullSubscribe(mo120613a(), C77088j.f172920a, new C20370ah(), new C77080h(this));
        selectNonNullSubscribe(mo120613a(), C77089k.f172921a, new C20370ah(), new C77081i(this));
        selectNonNullSubscribe(mo120613a(), C77090l.f172922a, new C20370ah(), new C77082j(this));
        selectNonNullSubscribe(mo120613a(), C77091m.f172923a, new C20370ah(), new C77075d(this));
        selectNonNullSubscribe(mo120613a(), C77086h.f172918a, new C20370ah(), new C77076e(this));
        selectNonNullSubscribe(mo120613a(), C77087i.f172919a, new C20370ah(), new C77077f(this));
        mo120615b();
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
