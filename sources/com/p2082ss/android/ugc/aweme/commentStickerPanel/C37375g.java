package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.als.C2563k;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.tabs.TabLayout;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
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
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g */
public final class C37375g extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: k */
    public static final C37378c f88191k = new C37378c((byte) 0);

    /* renamed from: a */
    public List<String> f88192a;

    /* renamed from: b */
    public ViewPager f88193b;

    /* renamed from: c */
    public TabLayout f88194c;

    /* renamed from: d */
    public final List<C37368e> f88195d = new ArrayList();

    /* renamed from: e */
    public boolean f88196e;

    /* renamed from: f */
    public boolean f88197f;

    /* renamed from: g */
    public float f88198g = Float.POSITIVE_INFINITY;

    /* renamed from: h */
    public float f88199h;

    /* renamed from: i */
    public final C2563k<C89391z> f88200i = new C2563k<>();

    /* renamed from: j */
    public final C2563k<CommentVideoModel> f88201j = new C2563k<>();

    /* renamed from: l */
    private final AbstractC89244h f88202l;

    /* renamed from: t */
    private View f88203t;

    /* renamed from: u */
    private View f88204u;

    /* renamed from: v */
    private CommentStickerPanelContainer f88205v;

    /* renamed from: w */
    private final AbstractC89244h f88206w = C89250i.m154773a((AbstractC89171a) new C37382g(this));

    /* renamed from: x */
    private AbstractC84919c f88207x;

    /* renamed from: y */
    private final C37381f f88208y = new C37381f(this);

    /* renamed from: z */
    private final C21582f f88209z;

    static {
        Covode.recordClassIndex(44755);
    }

    /* renamed from: a */
    public final CommentAndQuestionAndQuestionStickerPanelViewModel mo65007a() {
        return (CommentAndQuestionAndQuestionStickerPanelViewModel) this.f88202l.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$c */
    public static final class C37378c {
        static {
            Covode.recordClassIndex(44758);
        }

        private C37378c() {
        }

        public /* synthetic */ C37378c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f88209z;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$d */
    static final class C37379d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37375g f88216a;

        static {
            Covode.recordClassIndex(44759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37379d(C37375g gVar) {
            super(0);
            this.f88216a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f88216a.mo65009b();
            return C89391z.f203057a;
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

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$g */
    static final class C37382g extends AbstractC89220m implements AbstractC89171a<C37377b> {

        /* renamed from: a */
        final /* synthetic */ C37375g f88219a;

        static {
            Covode.recordClassIndex(44762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37382g(C37375g gVar) {
            super(0);
            this.f88219a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C37377b invoke() {
            C37375g gVar = this.f88219a;
            Activity t = gVar.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC0952i supportFragmentManager = ((ActivityC0945e) t).getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            return new C37377b(gVar, supportFragmentManager, C89070n.m154590j(this.f88219a.f88195d), C37375g.m75424b(this.f88219a));
        }
    }

    /* renamed from: C */
    public final void mo65006C() {
        List<C37368e> list = this.f88195d;
        ViewPager viewPager = this.f88193b;
        if (viewPager == null) {
            C89219l.m154710a("mPager");
        }
        C37368e eVar = list.get(viewPager.getCurrentItem());
        C37411l lVar = eVar.f88175f;
        if (lVar != null) {
            lVar.mo65059b();
        }
        C37411l lVar2 = eVar.f88172c;
        if (lVar2 != null) {
            lVar2.mo65059b();
        }
        C37411l lVar3 = eVar.f88173d;
        if (lVar3 != null) {
            lVar3.mo65059b();
        }
        C37411l lVar4 = eVar.f88174e;
        if (lVar4 != null) {
            lVar4.mo65059b();
        }
        C37411l lVar5 = eVar.f88176g;
        if (lVar5 != null) {
            lVar5.mo65059b();
        }
    }

    /* renamed from: d */
    public final CommentVideoModel mo65010d() {
        CommentVideoModel commentVideoModel = mo65007a().f88076e;
        if (commentVideoModel == null) {
            return new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
        }
        return commentVideoModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$a */
    public static final class C37376a extends AbstractC89220m implements AbstractC89171a<CommentAndQuestionAndQuestionStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f88210a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f88211b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f88212c;

        static {
            Covode.recordClassIndex(44756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37376a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f88210a = jVar;
            this.f88211b = cVar;
            this.f88212c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f88210a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f88212c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f88212c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f88211b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m75433xece454a8(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f88210a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f88211b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m75433xece454a8(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commentStickerPanel.C37375g.C37376a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_commentStickerPanel_CommentAndQuestionStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m75433xece454a8(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: b */
    public final void mo65009b() {
        if (!mo65007a().mo64943a(CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.SuggestTab)) {
            ViewPager viewPager = this.f88193b;
            if (viewPager == null) {
                C89219l.m154710a("mPager");
            }
            viewPager.setCurrentItem(0);
            ViewPager viewPager2 = this.f88193b;
            if (viewPager2 == null) {
                C89219l.m154710a("mPager");
            }
            PagerAdapter adapter = viewPager2.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionStickerPanelScene.CommentStickerPanelPageAdapter");
            adapter.notifyDataSetChanged();
            return;
        }
        ViewPager viewPager3 = this.f88193b;
        if (viewPager3 == null) {
            C89219l.m154710a("mPager");
        }
        if (viewPager3.getCurrentItem() == 0) {
            ViewPager viewPager4 = this.f88193b;
            if (viewPager4 == null) {
                C89219l.m154710a("mPager");
            }
            viewPager4.setCurrentItem(1);
            ViewPager viewPager5 = this.f88193b;
            if (viewPager5 == null) {
                C89219l.m154710a("mPager");
            }
            PagerAdapter adapter2 = viewPager5.getAdapter();
            Objects.requireNonNull(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionStickerPanelScene.CommentStickerPanelPageAdapter");
            adapter2.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$e */
    public static final class C37380e implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C37375g f88217a;

        static {
            Covode.recordClassIndex(44760);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37380e(C37375g gVar) {
            this.f88217a = gVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            if (i == 0 && this.f88217a.mo65007a().f88075d) {
                this.f88217a.mo65006C();
                this.f88217a.mo65007a().f88075d = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a aVar;
            CommentAndQuestionAndQuestionStickerPanelViewModel a = this.f88217a.mo65007a();
            if (i == 0) {
                aVar = CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.SuggestTab;
            } else {
                aVar = CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.FavoriteTab;
            }
            C89219l.m154721d(aVar, "");
            a.f88074c = aVar;
            if (this.f88217a.f88197f) {
                this.f88217a.mo65007a().f88075d = true;
                this.f88217a.mo65011d(0);
                if (!this.f88217a.f88196e) {
                    this.f88217a.mo65007a().mo64942a((String) C37375g.m75424b(this.f88217a).get(i), "slide");
                }
            }
            this.f88217a.f88196e = false;
            this.f88217a.f88197f = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$f */
    public static final class C37381f implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C37375g f88218a;

        static {
            Covode.recordClassIndex(44761);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37381f(C37375g gVar) {
            this.f88218a = gVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f88218a.mo36460z()) {
                return false;
            }
            this.f88218a.mo65007a().mo64944b();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$b */
    final class C37377b extends AbstractC0974l {

        /* renamed from: a */
        public final List<Fragment> f88213a;

        /* renamed from: b */
        public final List<String> f88214b;

        /* renamed from: c */
        final /* synthetic */ C37375g f88215c;

        static {
            Covode.recordClassIndex(44757);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.AbstractC0974l
        /* renamed from: a */
        public final Fragment mo3639a(int i) {
            return this.f88213a.get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            return this.f88214b.get(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37377b(C37375g gVar, AbstractC0952i iVar, List<? extends Fragment> list, List<String> list2) {
            super(iVar);
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            this.f88215c = gVar;
            this.f88213a = list;
            this.f88214b = list2;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TabLayout m75423a(C37375g gVar) {
        TabLayout tabLayout = gVar.f88194c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabs");
        }
        return tabLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ List m75424b(C37375g gVar) {
        List<String> list = gVar.f88192a;
        if (list == null) {
            C89219l.m154710a("tabTitles");
        }
        return list;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$m */
    static final class C37388m<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ C37375g f88227a;

        /* renamed from: b */
        final /* synthetic */ boolean f88228b;

        static {
            Covode.recordClassIndex(44768);
        }

        C37388m(C37375g gVar, boolean z) {
            this.f88227a = gVar;
            this.f88228b = z;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            if (this.f88228b) {
                this.f88227a.mo65006C();
                return;
            }
            AbstractC22186b bVar = (AbstractC22186b) this.f88227a.f52551o;
            if (bVar != null) {
                bVar.mo36413d(this.f88227a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$h */
    static final class C37383h extends AbstractC89220m implements AbstractC89172b<String, TabLayout.C26722f> {

        /* renamed from: a */
        final /* synthetic */ TabLayout f88220a;

        /* renamed from: b */
        final /* synthetic */ C37375g f88221b;

        static {
            Covode.recordClassIndex(44763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37383h(TabLayout tabLayout, C37375g gVar) {
            super(1);
            this.f88220a = tabLayout;
            this.f88221b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TabLayout.C26722f invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            View a = C1764a.m5927a(LayoutInflater.from(this.f88221b.mo36485s()), R.layout.nn, C37375g.m75423a(this.f88221b), false);
            View findViewById = a.findViewById(R.id.a_6);
            C89219l.m154716b(findViewById, "");
            ((TuxTextView) findViewById).setText(str2);
            TabLayout.C26722f a2 = this.f88220a.newTab().mo44368a(a);
            C89219l.m154716b(a2, "");
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$i */
    static final class View$OnClickListenerC37384i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37375g f88222a;

        /* renamed from: b */
        final /* synthetic */ int f88223b;

        static {
            Covode.recordClassIndex(44764);
        }

        View$OnClickListenerC37384i(C37375g gVar, int i) {
            this.f88222a = gVar;
            this.f88223b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88222a.f88196e = true;
            this.f88222a.mo65007a().mo64942a((String) C37375g.m75424b(this.f88222a).get(this.f88223b), "click");
            TabLayout.C26722f tabAt = C37375g.m75423a(this.f88222a).getTabAt(this.f88223b);
            if (tabAt != null) {
                tabAt.mo44370a();
            }
            ViewPager viewPager = this.f88222a.f88193b;
            if (viewPager == null) {
                C89219l.m154710a("mPager");
            }
            viewPager.setCurrentItem(this.f88223b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$l */
    static final class C37387l extends AbstractC89220m implements AbstractC89172b<MotionEvent, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C37375g f88226a;

        static {
            Covode.recordClassIndex(44767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37387l(C37375g gVar) {
            super(1);
            this.f88226a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            C89219l.m154721d(motionEvent2, "");
            if (C89219l.m154714a((Object) this.f88226a.mo65007a().f88078g.getValue(), (Object) true)) {
                int action = motionEvent2.getAction();
                if (action == 0) {
                    this.f88226a.f88198g = motionEvent2.getY();
                } else if (action == 1) {
                    this.f88226a.f88198g = Float.POSITIVE_INFINITY;
                    if (this.f88226a.f88199h > 200.0f) {
                        this.f88226a.mo65007a().mo64944b();
                        this.f88226a.f88199h = 0.0f;
                    }
                } else if (action == 2) {
                    this.f88226a.f88199h = motionEvent2.getY() - this.f88226a.f88198g;
                }
            }
            return false;
        }
    }

    public C37375g(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f88209z = fVar;
        AbstractC89277c a = C89204ab.m154669a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
        this.f88202l = C89250i.m154773a((AbstractC89171a) new C37376a(this, a, a));
    }

    /* renamed from: a */
    public final void mo65008a(boolean z) {
        if (z) {
            mo65009b();
            mo65011d(1);
            AbstractC22186b bVar = (AbstractC22186b) this.f52551o;
            if (bVar != null) {
                bVar.mo36417e(this);
            }
            AbstractC84919c cVar = this.f88207x;
            if (cVar != null) {
                cVar.mo87533b(this.f88208y);
            }
        } else {
            AbstractC84919c cVar2 = this.f88207x;
            if (cVar2 != null) {
                cVar2.mo87535c(this.f88208y);
            }
        }
        CommentStickerPanelContainer commentStickerPanelContainer = this.f88205v;
        if (commentStickerPanelContainer == null) {
            C89219l.m154710a("insideView");
        }
        View view = this.f88203t;
        if (view == null) {
            C89219l.m154710a("root");
        }
        C46371s.m89466a(commentStickerPanelContainer, z, 593, view, 100, new C37388m(this, z));
    }

    /* renamed from: d */
    public final void mo65011d(int i) {
        CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a aVar;
        Map<String, String> map;
        CommentAndQuestionAndQuestionStickerPanelViewModel a = mo65007a();
        ViewPager viewPager = this.f88193b;
        if (viewPager == null) {
            C89219l.m154710a("mPager");
        }
        if (viewPager.getCurrentItem() == 0) {
            aVar = CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.SuggestTab;
        } else {
            aVar = CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.FavoriteTab;
        }
        String tabName = aVar.getTabName();
        boolean a2 = a.mo64943a(aVar);
        C89219l.m154721d(tabName, "");
        String str = a.f88073b.get(tabName);
        if (str != null) {
            C37410k kVar = a.f88089v;
            C89219l.m154721d(str, "");
            C84425b a3 = kVar.mo65055a();
            if (a3 != null) {
                a3.mo129406a("tab_name", str);
                a3.mo129403a("is_landing", i);
                a3.mo129403a("is_blank", a2 ? 1 : 0);
                map = a3.f188764a;
            } else {
                map = null;
            }
            C80322d.m139251a("reply_panel_show", map);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        View view;
        super.mo22704a(bundle);
        View c = mo36475c(R.id.a_p);
        C89219l.m154716b(c, "");
        this.f88193b = (ViewPager) c;
        View c2 = mo36475c(R.id.a_m);
        C89219l.m154716b(c2, "");
        this.f88194c = (TabLayout) c2;
        View c3 = mo36475c(R.id.a_j);
        C89219l.m154716b(c3, "");
        this.f88204u = c3;
        View c4 = mo36475c(R.id.a_i);
        C89219l.m154716b(c4, "");
        this.f88205v = (CommentStickerPanelContainer) c4;
        List<String> list = mo65007a().f88072a;
        this.f88192a = list;
        if (list == null) {
            C89219l.m154710a("tabTitles");
        }
        for (T t : list) {
            List<C37368e> list2 = this.f88195d;
            C89219l.m154721d(t, "");
            Bundle bundle2 = new Bundle();
            bundle2.putString("tabTitle", t);
            C37368e eVar = new C37368e();
            eVar.setArguments(bundle2);
            list2.add(eVar);
        }
        ViewPager viewPager = this.f88193b;
        if (viewPager == null) {
            C89219l.m154710a("mPager");
        }
        viewPager.setAdapter((C37377b) this.f88206w.getValue());
        ViewPager viewPager2 = this.f88193b;
        if (viewPager2 == null) {
            C89219l.m154710a("mPager");
        }
        Context s = mo36485s();
        C89219l.m154716b(s, "");
        viewPager2.setPageMargin((int) C84912r.m145930a(s, 24.0f));
        ViewPager viewPager3 = this.f88193b;
        if (viewPager3 == null) {
            C89219l.m154710a("mPager");
        }
        List<String> list3 = this.f88192a;
        if (list3 == null) {
            C89219l.m154710a("tabTitles");
        }
        viewPager3.setCurrentItem(list3.size() - 1);
        mo65007a().mo64940a(new C37379d(this));
        ViewPager viewPager4 = this.f88193b;
        if (viewPager4 == null) {
            C89219l.m154710a("mPager");
        }
        viewPager4.addOnPageChangeListener(new C37380e(this));
        TabLayout tabLayout = this.f88194c;
        if (tabLayout == null) {
            C89219l.m154710a("mTabs");
        }
        C37383h hVar = new C37383h(tabLayout, this);
        List<String> list4 = this.f88192a;
        if (list4 == null) {
            C89219l.m154710a("tabTitles");
        }
        for (String str : list4) {
            tabLayout.addTab((TabLayout.C26722f) hVar.invoke(str));
        }
        List<String> list5 = this.f88192a;
        if (list5 == null) {
            C89219l.m154710a("tabTitles");
        }
        int size = list5.size();
        for (int i = 0; i < size; i++) {
            TabLayout tabLayout2 = this.f88194c;
            if (tabLayout2 == null) {
                C89219l.m154710a("mTabs");
            }
            TabLayout.C26722f tabAt = tabLayout2.getTabAt(i);
            View view2 = null;
            ViewParent parent = (tabAt == null || (view = tabAt.f63312f) == null) ? null : view.getParent();
            if (parent instanceof View) {
                view2 = parent;
            }
            View view3 = view2;
            if (view3 != null) {
                view3.setOnClickListener(new View$OnClickListenerC37384i(this, i));
            }
        }
        TabLayout tabLayout3 = this.f88194c;
        if (tabLayout3 == null) {
            C89219l.m154710a("mTabs");
        }
        ViewPager viewPager5 = this.f88193b;
        if (viewPager5 == null) {
            C89219l.m154710a("mPager");
        }
        tabLayout3.setupWithViewPager(viewPager5);
        AbstractC20382b.C20383a.m38603b(this, mo65007a(), C37389h.f88229a, new C37385j(this));
        CommentAndQuestionAndQuestionStickerPanelViewModel a = mo65007a();
        C89219l.m154721d(this, "");
        a.f88087t.observe(this, new CommentAndQuestionAndQuestionStickerPanelViewModel.C37338h(a));
        View view4 = this.f88204u;
        if (view4 == null) {
            C89219l.m154710a("outSideView");
        }
        view4.setOnTouchListener(new View$OnTouchListenerC37386k(this));
        if (this.f52549m instanceof AbstractC84919c) {
            Activity activity = this.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            this.f88207x = (AbstractC84919c) activity;
        }
        CommentStickerPanelContainer commentStickerPanelContainer = this.f88205v;
        if (commentStickerPanelContainer == null) {
            C89219l.m154710a("insideView");
        }
        commentStickerPanelContainer.setOnInterceptorHandler(new C37387l(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$j */
    static final class C37385j extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37375g f88224a;

        static {
            Covode.recordClassIndex(44765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37385j(C37375g gVar) {
            super(2);
            this.f88224a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f88224a.f88200i.mo6999a(C89391z.f203057a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.g$k */
    static final class View$OnTouchListenerC37386k implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C37375g f88225a;

        static {
            Covode.recordClassIndex(44766);
        }

        View$OnTouchListenerC37386k(C37375g gVar) {
            this.f88225a = gVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() == 1) {
                this.f88225a.mo65007a().mo64944b();
            }
            return true;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ni, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f88203t = a;
        if (a == null) {
            C89219l.m154710a("root");
        }
        return a;
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
