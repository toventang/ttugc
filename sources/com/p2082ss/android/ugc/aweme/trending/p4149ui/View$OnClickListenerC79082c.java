package com.p2082ss.android.ugc.aweme.trending.p4149ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.trending.TrendingCurChangeCallBack;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.aweme.trending.C79040a;
import com.p2082ss.android.ugc.aweme.trending.p4145a.C79043c;
import com.p2082ss.android.ugc.aweme.trending.p4146b.C79044a;
import com.p2082ss.android.ugc.aweme.trending.p4148d.C79066b;
import com.p2082ss.android.ugc.aweme.trending.p4149ui.TrendingTitleSwitcher;
import com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79117a;
import com.p2082ss.android.ugc.aweme.trending.viewmodel.C79158e;
import com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainState;
import com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
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

/* renamed from: com.ss.android.ugc.aweme.trending.ui.c */
public final class View$OnClickListenerC79082c extends C41426z implements View.OnClickListener, AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: z */
    public static final C79084b f177741z = new C79084b((byte) 0);

    /* renamed from: A */
    private VerticalViewPager f177742A;

    /* renamed from: B */
    private final AbstractC89244h f177743B;

    /* renamed from: C */
    private final AbstractC89244h f177744C;

    /* renamed from: D */
    private final AbstractC89244h f177745D;

    /* renamed from: E */
    private final AbstractC89244h f177746E;

    /* renamed from: F */
    private final AbstractC89244h f177747F;

    /* renamed from: G */
    private final AbstractC89244h f177748G;

    /* renamed from: H */
    private SparseArray f177749H;

    /* renamed from: q */
    public C67590l f177750q;

    /* renamed from: r */
    public TrendingTitleSwitcher f177751r;

    /* renamed from: s */
    public C34499i f177752s = new C34499i();

    /* renamed from: t */
    public C89378p<C67590l, Integer> f177753t;

    /* renamed from: u */
    public ArrayList<Aweme> f177754u;

    /* renamed from: v */
    public boolean f177755v;

    /* renamed from: w */
    final AbstractC89244h f177756w;

    /* renamed from: y */
    public Boolean f177757y;

    static {
        Covode.recordClassIndex(92263);
    }

    /* renamed from: C */
    private final C79098l.C790991 m137918C() {
        return (C79098l.C790991) this.f177745D.getValue();
    }

    /* renamed from: B */
    public final AbstractC1214u<Boolean> mo122893B() {
        return (AbstractC1214u) this.f177747F.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: a */
    public final View mo61343a(int i) {
        if (this.f177749H == null) {
            this.f177749H = new SparseArray();
        }
        View view = (View) this.f177749H.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f177749H.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: e */
    public final void mo61344e() {
        SparseArray sparseArray = this.f177749H;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: i */
    public final TrendingMainViewModel mo122896i() {
        return (TrendingMainViewModel) this.f177743B.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo61344e();
    }

    /* renamed from: v */
    public final C79117a mo70643v() {
        return (C79117a) this.f177744C.getValue();
    }

    /* renamed from: w */
    public final C23226a mo70644w() {
        return (C23226a) this.f177746E.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$b */
    static final class C79084b {
        static {
            Covode.recordClassIndex(92265);
        }

        private C79084b() {
        }

        public /* synthetic */ C79084b(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo70651d() {
        return this.f177752s;
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

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$c */
    static final class C79085c extends AbstractC89220m implements AbstractC89171a<AbstractC1214u<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177761a;

        static {
            Covode.recordClassIndex(92266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79085c(View$OnClickListenerC79082c cVar) {
            super(0);
            this.f177761a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1214u<Boolean> invoke() {
            return new AbstractC1214u(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.p4149ui.View$OnClickListenerC79082c.C79085c.C790861 */

                /* renamed from: a */
                final /* synthetic */ C79085c f177762a;

                static {
                    Covode.recordClassIndex(92267);
                }

                {
                    this.f177762a = r1;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (C89219l.m154714a(obj, (Object) false) && !C79040a.m137876b()) {
                        new SafeHandler(this.f177762a.f177761a).postDelayed(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.trending.p4149ui.View$OnClickListenerC79082c.C79085c.C790861.RunnableC790871 */

                            /* renamed from: a */
                            final /* synthetic */ C790861 f177763a;

                            static {
                                Covode.recordClassIndex(92268);
                            }

                            {
                                this.f177763a = r1;
                            }

                            public final void run() {
                                View$OnClickListenerC79082c cVar = this.f177763a.f177762a.f177761a;
                                if (cVar.af_()) {
                                    LinearLayout linearLayout = (LinearLayout) cVar.mo61343a(R.id.enw);
                                    C89219l.m154716b(linearLayout, "");
                                    float width = (float) linearLayout.getWidth();
                                    LinearLayout linearLayout2 = (LinearLayout) cVar.mo61343a(R.id.enw);
                                    C89219l.m154716b(linearLayout2, "");
                                    float height = (float) linearLayout2.getHeight();
                                    if (width > height) {
                                        TuxTextView tuxTextView = (TuxTextView) cVar.mo61343a(R.id.eny);
                                        C89219l.m154716b(tuxTextView, "");
                                        float width2 = (float) tuxTextView.getWidth();
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                        ofFloat.addUpdateListener(new C79103o(cVar, width2, width, height));
                                        ofFloat.addListener(new C79104p(cVar, width2, width, height));
                                        ofFloat.setDuration(300L);
                                        ofFloat.start();
                                    }
                                }
                                C79040a.m137875a().storeInt("ever_next", 1);
                            }
                        }, TimeUnit.SECONDS.toMillis(1));
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$d */
    static final class C79088d extends AbstractC89220m implements AbstractC89171a<AbstractC1214u<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177764a;

        static {
            Covode.recordClassIndex(92269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79088d(View$OnClickListenerC79082c cVar) {
            super(0);
            this.f177764a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1214u<Boolean> invoke() {
            return new AbstractC1214u(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.p4149ui.View$OnClickListenerC79082c.C79088d.C790891 */

                /* renamed from: a */
                final /* synthetic */ C79088d f177765a;

                static {
                    Covode.recordClassIndex(92270);
                }

                {
                    this.f177765a = r1;
                }

                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Object obj) {
                    if (C89219l.m154714a(obj, (Object) false)) {
                        this.f177765a.f177764a.f177757y = true;
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$l */
    static final class C79098l extends AbstractC89220m implements AbstractC89171a<C790991> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177775a;

        static {
            Covode.recordClassIndex(92279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79098l(View$OnClickListenerC79082c cVar) {
            super(0);
            this.f177775a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C790991 invoke() {
            return new C79117a.AbstractC79118a(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.p4149ui.View$OnClickListenerC79082c.C79098l.C790991 */

                /* renamed from: a */
                final /* synthetic */ C79098l f177776a;

                static {
                    Covode.recordClassIndex(92280);
                }

                @Override // com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79117a.AbstractC79118a
                /* renamed from: a */
                public final void mo122904a() {
                    this.f177776a.f177775a.mo70644w().dismiss();
                    this.f177776a.f177775a.mo122892A();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f177776a = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
                    if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r1, (java.lang.Object) r0.getTrendingId())) != false) goto L_0x002e;
                 */
                @Override // com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79117a.AbstractC79118a
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo122905a(com.p2082ss.android.ugc.aweme.search.C67590l r10) {
                    /*
                    // Method dump skipped, instructions count: 319
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.trending.p4149ui.View$OnClickListenerC79082c.C79098l.C790991.mo122905a(com.ss.android.ugc.aweme.search.l):void");
                }

                @Override // com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79117a.AbstractC79118a
                /* renamed from: a */
                public final void mo122906a(boolean z, C67590l lVar) {
                    C89219l.m154721d(lVar, "");
                    if (z) {
                        int c = C79158e.m137992c(lVar.getEventId(), this.f177776a.f177775a.mo122896i().mo122947m());
                        String l = this.f177776a.f177775a.mo62679l();
                        Integer valueOf = Integer.valueOf(c);
                        C49812b bVar = this.f177776a.f177775a.f96635j;
                        C89219l.m154716b(bVar, "");
                        C89219l.m154721d(bVar, "");
                        C33744d a = new C33744d().mo59983a("search_id", bVar.getSearchId()).mo59983a("search_keyword", bVar.getSearchKeyword()).mo59983a("search_result_id", bVar.getSearchResultId()).mo59983a("enter_from", l).mo59983a("trending_topic", lVar.getTrendingName()).mo59983a("trending_topic_id", lVar.getEventId()).mo59982a("rank", valueOf);
                        if (C80537hk.m139613a(bVar.getIsFromTrendingCard())) {
                            a.mo59983a("is_from_trending_card", bVar.getIsFromTrendingCard());
                        }
                        lVar.getTrendingName();
                        C39162r.m79460a("trending_topic_show", a.f79943a);
                        String str = this.f177776a.f177775a.mo122896i().f177844c;
                        C89219l.m154721d(str, "");
                        if (C89219l.m154714a((Object) str, (Object) "click_fyp_trending_bar")) {
                            Map<String, String> extraMap = lVar.getExtraMap();
                            C33744d a2 = new C33744d().mo59983a("enter_from", "trending_inflow_page").mo59983a("trending_entrance", "homepage_hot_trending_bar").mo59983a("trending_topic", lVar.getTrendingName()).mo59983a("trending_topic_id", lVar.getEventId());
                            String str2 = extraMap.get("trending_topic_source");
                            if (str2 == null) {
                                str2 = "";
                            }
                            C33744d a3 = a2.mo59983a("trending_topic_source", str2);
                            String str3 = extraMap.get("topic_rank");
                            if (str3 == null) {
                                str3 = "";
                            }
                            C33744d a4 = a3.mo59983a("topic_rank", str3);
                            String str4 = extraMap.get("topic_group_num");
                            if (str4 == null) {
                                str4 = "";
                            }
                            C33744d a5 = a4.mo59983a("topic_group_num", str4);
                            C89219l.m154716b(a5, "");
                            C79066b.m137890a("trending_inflow_panel_topic_show", a5);
                        }
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$m */
    static final class C79100m extends AbstractC89220m implements AbstractC89171a<DialogInterface.OnDismissListener> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177777a;

        static {
            Covode.recordClassIndex(92281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79100m(View$OnClickListenerC79082c cVar) {
            super(0);
            this.f177777a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogInterface.OnDismissListener invoke() {
            return new DialogInterface.OnDismissListener(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.p4149ui.View$OnClickListenerC79082c.C79100m.DialogInterface$OnDismissListenerC791011 */

                /* renamed from: a */
                final /* synthetic */ C79100m f177778a;

                static {
                    Covode.recordClassIndex(92282);
                }

                {
                    this.f177778a = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    if (!C89219l.m154714a((Object) this.f177778a.f177777a.mo122896i().f177846e.getValue(), (Object) true)) {
                        this.f177778a.f177777a.mo122892A();
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$n */
    static final class C79102n extends AbstractC89220m implements AbstractC89171a<C79117a> {

        /* renamed from: a */
        public static final C79102n f177779a = new C79102n();

        static {
            Covode.recordClassIndex(92283);
        }

        C79102n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C79117a invoke() {
            return new C79117a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    /* renamed from: c */
    public final C41178b mo70690c() {
        return new C79080b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    /* renamed from: j */
    public final JediViewModel<?> mo70692j() {
        return mo122896i();
    }

    /* renamed from: D */
    private void m137919D() {
        this.f96636k.mo63634a(new C49672ag(64));
    }

    /* renamed from: A */
    public final void mo122892A() {
        this.f96636k.mo63634a(new C49672ag(65));
    }

    /* renamed from: l */
    public final String mo62679l() {
        C41178b bVar = this.f96636k;
        if (bVar != null) {
            return bVar.mo81096g(true);
        }
        return null;
    }

    /* renamed from: y */
    public final void mo122898y() {
        withState(mo122896i(), new C79107s(this));
    }

    /* renamed from: x */
    public final void mo70645x() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            new C23144b(activity).mo37640e(R.string.bw).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$a */
    public static final class C79083a extends AbstractC89220m implements AbstractC89171a<TrendingMainViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f177758a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f177759b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f177760c;

        static {
            Covode.recordClassIndex(92264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79083a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f177758a = fragment;
            this.f177759b = cVar;
            this.f177760c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.f177758a
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r3.f177760c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)
                h.k.c r0 = r3.f177759b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m137936x5bc313e7(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.trending.p4149ui.View$OnClickListenerC79082c.C79083a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_trending_ui_TrendingDetailPageFragment$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m137936x5bc313e7(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$r */
    static final class C79106r extends AbstractC89220m implements AbstractC89171a<C23226a> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177790a;

        static {
            Covode.recordClassIndex(92287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79106r(View$OnClickListenerC79082c cVar) {
            super(0);
            this.f177790a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23226a invoke() {
            return new C23226a.C23227a().mo37817a(this.f177790a.mo70643v()).mo37812a(1).mo37822b(false).mo37823c().mo37815a((DialogInterface.OnDismissListener) this.f177790a.f177756w.getValue()).f55057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$k */
    static final class RunnableC79097k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177774a;

        static {
            Covode.recordClassIndex(92278);
        }

        RunnableC79097k(View$OnClickListenerC79082c cVar) {
            this.f177774a = cVar;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f177774a.mo61343a(R.id.enw);
            C89219l.m154716b(linearLayout, "");
            LinearLayout linearLayout2 = (LinearLayout) this.f177774a.mo61343a(R.id.enw);
            C89219l.m154716b(linearLayout2, "");
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            LinearLayout linearLayout3 = (LinearLayout) this.f177774a.mo61343a(R.id.enw);
            C89219l.m154716b(linearLayout3, "");
            layoutParams.width = linearLayout3.getHeight();
            linearLayout.setLayoutParams(layoutParams);
            TuxTextView tuxTextView = (TuxTextView) this.f177774a.mo61343a(R.id.eny);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        }
    }

    public View$OnClickListenerC79082c() {
        AbstractC89277c a = C89204ab.m154669a(TrendingMainViewModel.class);
        this.f177743B = C89250i.m154773a((AbstractC89171a) new C79083a(this, a, a));
        this.f177754u = new ArrayList<>();
        this.f177755v = true;
        this.f177744C = C89250i.m154773a((AbstractC89171a) C79102n.f177779a);
        this.f177745D = C89250i.m154773a((AbstractC89171a) new C79098l(this));
        this.f177756w = C89250i.m154773a((AbstractC89171a) new C79100m(this));
        this.f177746E = C89250i.m154773a((AbstractC89171a) new C79106r(this));
        this.f177747F = C89250i.m154773a((AbstractC89171a) new C79085c(this));
        this.f177748G = C89250i.m154773a((AbstractC89171a) new C79088d(this));
    }

    /* renamed from: z */
    public final void mo122899z() {
        String str;
        AbstractC0952i iVar;
        C67590l lVar;
        ArrayList<C67590l> m = mo122896i().mo122947m();
        Integer num = null;
        if ((!m.isEmpty()) && m != null) {
            C79117a v = mo70643v();
            Aweme y = this.f96636k.mo70429y();
            if (y != null) {
                str = y.getTrendingId();
            } else {
                str = null;
            }
            v.mo122913a(m, str, mo122896i().f177844c);
            mo70643v().mo122912a(m137918C());
            C23226a w = mo70644w();
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                iVar = activity.getSupportFragmentManager();
            } else {
                iVar = null;
            }
            w.show(iVar, "TrendingDetailPageFrag");
            C79066b.m137891a(mo122896i().f177844c, this.f177750q);
            C79066b.m137889a(mo122896i().f177844c);
            m137919D();
            String l = mo62679l();
            C89378p<C67590l, Integer> pVar = this.f177753t;
            if (pVar != null) {
                lVar = pVar.getFirst();
            } else {
                lVar = null;
            }
            C89378p<C67590l, Integer> pVar2 = this.f177753t;
            if (pVar2 != null) {
                num = pVar2.getSecond();
            }
            C49812b bVar = this.f96635j;
            C89219l.m154716b(bVar, "");
            C79066b.m137892a(l, lVar, num, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$f */
    public static final class C79091f implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177768a;

        static {
            Covode.recordClassIndex(92272);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C79091f(View$OnClickListenerC79082c cVar) {
            this.f177768a = cVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            C67590l lVar;
            Aweme y = this.f177768a.f96636k.mo70429y();
            C89219l.m154716b(y, "");
            y.getTrendingId();
            View$OnClickListenerC79082c cVar = this.f177768a;
            Aweme y2 = cVar.f96636k.mo70429y();
            C89219l.m154716b(y2, "");
            cVar.f177753t = C79158e.m137989a(y2.getTrendingId(), this.f177768a.mo122896i().mo122947m());
            View$OnClickListenerC79082c cVar2 = this.f177768a;
            C89378p<C67590l, Integer> pVar = cVar2.f177753t;
            if (pVar != null) {
                lVar = pVar.getFirst();
            } else {
                lVar = null;
            }
            cVar2.mo122895b(lVar);
            this.f177768a.mo122898y();
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            List<Aweme> list;
            String str;
            String str2;
            String str3;
            if (!C79043c.m137877a(this.f177768a.mo122896i().f177844c) && i == 1) {
                ActivityC0945e activity = this.f177768a.getActivity();
                Aweme y = this.f177768a.f96636k.mo70429y();
                C89219l.m154716b(y, "");
                C41178b bVar = this.f177768a.f96636k;
                C89219l.m154716b(bVar, "");
                String str4 = null;
                if (bVar.f114768W == null || bVar.f114759N == null) {
                    list = null;
                } else {
                    list = bVar.f114768W.mo80327d();
                }
                C89219l.m154716b(list, "");
                C89219l.m154721d(y, "");
                C89219l.m154721d(list, "");
                new StringBuilder("checkNextAndPreAweme() called with: aweme = [").append(y.getDesc()).append("], awemeList = [").append(list).append(']');
                int indexOf = list.indexOf(y);
                String trendingId = y.getTrendingId();
                if (indexOf >= 0) {
                    int i2 = indexOf + 1;
                    if (list.size() > i2) {
                        Aweme aweme = list.get(i2);
                        if (aweme != null) {
                            aweme.getAid();
                            aweme.getDesc();
                            aweme.getTrendingId();
                            str2 = aweme.getTrendingId();
                        } else {
                            str2 = null;
                        }
                        TextUtils.equals(str2, trendingId);
                        if (aweme != null) {
                            str3 = aweme.getTrendingId();
                        } else {
                            str3 = null;
                        }
                        if (!TextUtils.equals(str3, trendingId)) {
                            TrendingCurChangeCallBack.C49946a.m93790a(activity, aweme, true);
                        } else {
                            TrendingCurChangeCallBack.C49946a.m93790a(activity, aweme, false);
                        }
                    }
                    if (indexOf > 0) {
                        Aweme aweme2 = list.get(indexOf - 1);
                        if (aweme2 != null) {
                            aweme2.getAid();
                            aweme2.getDesc();
                            aweme2.getTrendingId();
                            str = aweme2.getTrendingId();
                        } else {
                            str = null;
                        }
                        TextUtils.equals(str, trendingId);
                        if (aweme2 != null) {
                            str4 = aweme2.getTrendingId();
                        }
                        if (!TextUtils.equals(str4, trendingId)) {
                            TrendingCurChangeCallBack.C49946a.m93790a(activity, aweme2, true);
                        } else {
                            TrendingCurChangeCallBack.C49946a.m93790a(activity, aweme2, false);
                        }
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            if (f == 0.0f && i2 == 0) {
                Aweme y = this.f177768a.f96636k.mo70429y();
                C89219l.m154716b(y, "");
                y.getAid();
                Aweme y2 = this.f177768a.f96636k.mo70429y();
                C89219l.m154716b(y2, "");
                y2.getDesc();
                if (i != 0) {
                    return;
                }
                if (C89219l.m154714a((Object) this.f177768a.f177757y, (Object) true)) {
                    onPageSelected(i);
                    if (!C79043c.m137877a(this.f177768a.mo122896i().f177844c)) {
                        C41178b bVar = this.f177768a.f96636k;
                        C89219l.m154716b(bVar, "");
                        AbstractC48149ai bg = bVar.mo84754bg();
                        if (bg != null) {
                            bg.mo70618f();
                        }
                        Aweme y3 = this.f177768a.f96636k.mo70429y();
                        if (y3 != null) {
                            y3.getAid();
                        }
                        Aweme y4 = this.f177768a.f96636k.mo70429y();
                        if (y4 != null) {
                            y4.getDesc();
                        }
                    }
                    this.f177768a.f177757y = null;
                    return;
                }
                View$OnClickListenerC79082c cVar = this.f177768a;
                Aweme y5 = cVar.f96636k.mo70429y();
                C89219l.m154716b(y5, "");
                cVar.f177753t = C79158e.m137989a(y5.getTrendingId(), this.f177768a.mo122896i().mo122947m());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$j */
    static final class View$OnClickListenerC79096j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177773a;

        static {
            Covode.recordClassIndex(92277);
        }

        View$OnClickListenerC79096j(View$OnClickListenerC79082c cVar) {
            this.f177773a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f177773a.mo70706t();
            this.f177773a.mo122896i().f177845d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$p */
    public static final class C79104p extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177784a;

        /* renamed from: b */
        final /* synthetic */ float f177785b;

        /* renamed from: c */
        final /* synthetic */ float f177786c;

        /* renamed from: d */
        final /* synthetic */ float f177787d;

        static {
            Covode.recordClassIndex(92285);
        }

        public final void onAnimationEnd(Animator animator) {
            TuxTextView tuxTextView = (TuxTextView) this.f177784a.mo61343a(R.id.eny);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        }

        C79104p(View$OnClickListenerC79082c cVar, float f, float f2, float f3) {
            this.f177784a = cVar;
            this.f177785b = f;
            this.f177786c = f2;
            this.f177787d = f3;
        }
    }

    /* renamed from: a */
    public final void mo122894a(C67590l lVar) {
        mo122896i().f177846e.setValue(true);
        mo122896i().mo122946b(lVar);
        mo70695n();
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$g */
    static final class C79092g implements AwemeChangeCallBack.AbstractC59111a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177769a;

        static {
            Covode.recordClassIndex(92273);
        }

        C79092g(View$OnClickListenerC79082c cVar) {
            this.f177769a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
        /* renamed from: a */
        public final void mo37101a(Aweme aweme) {
            C67590l lVar;
            Aweme y = this.f177769a.f96636k.mo70429y();
            if (y != null) {
                y.getAid();
            }
            Aweme y2 = this.f177769a.f96636k.mo70429y();
            if (y2 != null) {
                y2.getDesc();
            }
            View$OnClickListenerC79082c cVar = this.f177769a;
            C89378p<C67590l, Integer> pVar = cVar.f177753t;
            if (pVar != null) {
                lVar = pVar.getFirst();
            } else {
                lVar = null;
            }
            cVar.mo122895b(lVar);
            this.f177769a.mo122898y();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$o */
    static final class C79103o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177780a;

        /* renamed from: b */
        final /* synthetic */ float f177781b;

        /* renamed from: c */
        final /* synthetic */ float f177782c;

        /* renamed from: d */
        final /* synthetic */ float f177783d;

        static {
            Covode.recordClassIndex(92284);
        }

        C79103o(View$OnClickListenerC79082c cVar, float f, float f2, float f3) {
            this.f177780a = cVar;
            this.f177781b = f;
            this.f177782c = f2;
            this.f177783d = f3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (!(animatedValue instanceof Float)) {
                animatedValue = null;
            }
            Float f = (Float) animatedValue;
            if (f != null) {
                float floatValue = f.floatValue();
                TuxTextView tuxTextView = (TuxTextView) this.f177780a.mo61343a(R.id.eny);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setAlpha(floatValue);
                TuxTextView tuxTextView2 = (TuxTextView) this.f177780a.mo61343a(R.id.eny);
                C89219l.m154716b(tuxTextView2, "");
                TuxTextView tuxTextView3 = (TuxTextView) this.f177780a.mo61343a(R.id.eny);
                C89219l.m154716b(tuxTextView3, "");
                ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
                layoutParams.width = (int) (this.f177781b * floatValue);
                tuxTextView2.setLayoutParams(layoutParams);
                float f2 = this.f177782c;
                float f3 = this.f177783d;
                float f4 = ((f2 - f3) * floatValue) + f3;
                LinearLayout linearLayout = (LinearLayout) this.f177780a.mo61343a(R.id.enw);
                C89219l.m154716b(linearLayout, "");
                LinearLayout linearLayout2 = (LinearLayout) this.f177780a.mo61343a(R.id.enw);
                C89219l.m154716b(linearLayout2, "");
                ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                layoutParams2.width = (int) f4;
                layoutParams2.height = (int) this.f177783d;
                linearLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$s */
    public static final class C79107s extends AbstractC89220m implements AbstractC89172b<TrendingMainState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177791a;

        static {
            Covode.recordClassIndex(92288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79107s(View$OnClickListenerC79082c cVar) {
            super(1);
            this.f177791a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TrendingMainState trendingMainState) {
            int i;
            TrendingMainState trendingMainState2 = trendingMainState;
            C89219l.m154721d(trendingMainState2, "");
            ArrayList<C67590l> trendingList = trendingMainState2.getTrendingList();
            boolean z = false;
            if (trendingList != null && !trendingList.isEmpty()) {
                Aweme y = this.f177791a.f96636k.mo70429y();
                C89219l.m154716b(y, "");
                String trendingId = y.getTrendingId();
                if (trendingId == null) {
                    trendingId = "";
                }
                C67590l d = C79158e.m137993d(trendingId, trendingMainState2.getTrendingList());
                Aweme y2 = this.f177791a.f96636k.mo70429y();
                C89219l.m154716b(y2, "");
                y2.getTrendingId();
                String.valueOf(d);
                if (d != null) {
                    z = true;
                }
                ActivityC0945e activity = this.f177791a.getActivity();
                if (activity != null) {
                    LinearLayout linearLayout = (LinearLayout) this.f177791a.mo61343a(R.id.enw);
                    C89219l.m154716b(linearLayout, "");
                    linearLayout.setActivated(z);
                    if (z) {
                        i = R.color.a9;
                    } else {
                        i = R.color.ad;
                    }
                    int c = C0643b.m2378c(activity, i);
                    ((TuxIconView) this.f177791a.mo61343a(R.id.enx)).setTintColor(c);
                    ((TuxTextView) this.f177791a.mo61343a(R.id.eny)).setTextColor(c);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo122895b(C67590l lVar) {
        if (lVar != null) {
            mo122896i().mo122945a(lVar);
            TuxTextView tuxTextView = (TuxTextView) mo61343a(R.id.env);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(lVar.getTrendingName());
            if (TextUtils.isEmpty(lVar.getRankText())) {
                TuxTextView tuxTextView2 = (TuxTextView) mo61343a(R.id.enz);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            } else {
                TuxTextView tuxTextView3 = (TuxTextView) mo61343a(R.id.enz);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setVisibility(0);
                TuxTextView tuxTextView4 = (TuxTextView) mo61343a(R.id.enz);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setText(lVar.getRankText());
            }
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) mo61343a(R.id.enz);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
            TuxTextView tuxTextView6 = (TuxTextView) mo61343a(R.id.env);
            C89219l.m154716b(tuxTextView6, "");
            C49812b bVar = this.f96635j;
            C89219l.m154716b(bVar, "");
            tuxTextView6.setText(bVar.getTrendingName());
        }
        StringBuilder sb = new StringBuilder("bindTrendingTitle trending name ");
        TuxTextView tuxTextView7 = (TuxTextView) mo61343a(R.id.env);
        C89219l.m154716b(tuxTextView7, "");
        sb.append(tuxTextView7.getText()).append(" trending:").append(String.valueOf(lVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$e */
    static final class C79090e extends AbstractC89220m implements AbstractC89172b<TrendingMainState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177766a;

        /* renamed from: b */
        final /* synthetic */ boolean f177767b;

        static {
            Covode.recordClassIndex(92271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79090e(View$OnClickListenerC79082c cVar, boolean z) {
            super(1);
            this.f177766a = cVar;
            this.f177767b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TrendingMainState trendingMainState) {
            String str;
            String str2;
            Map<String, String> map;
            String str3;
            String str4;
            TrendingMainState trendingMainState2 = trendingMainState;
            C89219l.m154721d(trendingMainState2, "");
            C67590l curTrending = trendingMainState2.getCurTrending();
            if (curTrending == null || (str = curTrending.getEventId()) == null) {
                str = "";
            }
            C67590l d = C79158e.m137993d(str, trendingMainState2.getTrendingList());
            if (this.f177767b) {
                str2 = "grey";
            } else if (!C79040a.m137876b()) {
                str2 = "instruction";
            } else {
                str2 = "arrow";
            }
            String str5 = this.f177766a.mo122896i().f177844c;
            Aweme y = this.f177766a.f96636k.mo70429y();
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str2, "");
            if (!(!C89219l.m154714a((Object) str5, (Object) "click_fyp_trending_bar") || y == null || y.getTrendingBarFYP() == null)) {
                AwemeTrendingBar trendingBarFYP = y.getTrendingBarFYP();
                Map<String, String> trackMap = trendingBarFYP.getTrackMap();
                if (d == null || (map = d.getExtraMap()) == null) {
                    map = new ArrayMap<>();
                }
                C33744d a = new C33744d().mo59983a("enter_from", "trending_inflow_page").mo59983a("button_type", str2).mo59983a("trending_entrance", "homepage_hot_trending_bar").mo59983a("from_trending_topic", trendingBarFYP.getEventKeyword()).mo59983a("from_trending_topic_id", String.valueOf(trendingBarFYP.getEventKeywordId()));
                String str6 = trackMap.get("trending_topic_source");
                if (str6 == null) {
                    str6 = "";
                }
                C33744d a2 = a.mo59983a("from_trending_topic_source", str6);
                String str7 = trackMap.get("topic_rank");
                if (str7 == null) {
                    str7 = "";
                }
                C33744d a3 = a2.mo59983a("from_topic_rank", str7);
                String str8 = trackMap.get("topic_group_num");
                if (str8 == null) {
                    str8 = "";
                }
                C33744d a4 = a3.mo59983a("from_topic_group_num", str8).mo59980a("is_end_topic", C89219l.m154714a(str2, "last") ? 1 : 0);
                if (d == null || (str3 = d.getTrendingName()) == null) {
                    str3 = "";
                }
                C33744d a5 = a4.mo59983a("to_trending_topic", str3);
                if (d == null || (str4 = d.getEventId()) == null) {
                    str4 = "";
                }
                C33744d a6 = a5.mo59983a("to_trending_topic_id", str4);
                String str9 = map.get("trending_topic_source");
                if (str9 == null) {
                    str9 = "";
                }
                C33744d a7 = a6.mo59983a("to_trending_topic_source", str9);
                String str10 = map.get("topic_rank");
                if (str10 == null) {
                    str10 = "";
                }
                C33744d a8 = a7.mo59983a("to_topic_rank", str10);
                String str11 = map.get("topic_group_num");
                if (str11 == null) {
                    str11 = "";
                }
                C33744d a9 = a8.mo59983a("to_topic_group_num", str11);
                C89219l.m154716b(a9, "");
                C79066b.m137890a("trending_inflow_change_click", a9);
            }
            if (d != null) {
                this.f177766a.mo122894a(d);
                if (!C79040a.m137876b()) {
                    C33943c<Boolean> cVar = this.f177766a.mo122896i().f177846e;
                    View$OnClickListenerC79082c cVar2 = this.f177766a;
                    cVar.observe(cVar2, cVar2.mo122893B());
                } else {
                    this.f177766a.mo122896i().f177846e.removeObserver(this.f177766a.mo122893B());
                }
            }
            return C89391z.f203057a;
        }
    }

    public final void onClick(View view) {
        Integer valueOf;
        C67590l lVar;
        Integer num;
        String str;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            String str2 = null;
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.enq) {
                    mo122899z();
                } else if (valueOf.intValue() == R.id.enw) {
                    C89378p<C67590l, Integer> pVar = this.f177753t;
                    boolean z = true;
                    if (pVar == null || pVar.getSecond().intValue() != mo122896i().mo122947m().size() - 1) {
                        z = false;
                    }
                    String l = mo62679l();
                    C89378p<C67590l, Integer> pVar2 = this.f177753t;
                    if (pVar2 != null) {
                        lVar = pVar2.getFirst();
                    } else {
                        lVar = null;
                    }
                    C89378p<C67590l, Integer> pVar3 = this.f177753t;
                    if (pVar3 != null) {
                        num = pVar3.getSecond();
                    } else {
                        num = null;
                    }
                    C49812b bVar = this.f96635j;
                    C89219l.m154716b(bVar, "");
                    C89219l.m154721d(bVar, "");
                    C33744d a = new C33744d().mo59983a("search_id", bVar.getSearchId()).mo59983a("search_keyword", bVar.getSearchKeyword()).mo59983a("search_result_id", bVar.getSearchResultId()).mo59983a("enter_from", l);
                    if (lVar != null) {
                        str = lVar.getTrendingName();
                    } else {
                        str = null;
                    }
                    C33744d a2 = a.mo59983a("trending_topic", str);
                    if (lVar != null) {
                        str2 = lVar.getEventId();
                    }
                    C33744d a3 = a2.mo59983a("trending_topic_id", str2).mo59982a("rank", num);
                    int i = z ? 1 : 0;
                    int i2 = z ? 1 : 0;
                    int i3 = z ? 1 : 0;
                    C33744d a4 = a3.mo59980a("is_end_topic", i);
                    if (C80537hk.m139613a(bVar.getIsFromTrendingCard())) {
                        a4.mo59983a("is_from_trending_card", bVar.getIsFromTrendingCard());
                    }
                    C39162r.m79460a("trending_change_click", a4.f79943a);
                    LinearLayout linearLayout = (LinearLayout) mo61343a(R.id.enw);
                    C89219l.m154716b(linearLayout, "");
                    if (!linearLayout.isActivated()) {
                        new C23144b(this).mo37640e(R.string.gh_).mo37637b();
                    } else {
                        withState(mo122896i(), new C79090e(this, z));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$i */
    static final class C79094i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177771a;

        static {
            Covode.recordClassIndex(92275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79094i(View$OnClickListenerC79082c cVar) {
            super(2);
            this.f177771a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f177771a.mo70645x();
                this.f177771a.mo122896i().mo33689c(TrendingMainViewModel.C79137e.f177863a);
                if (this.f177771a.f96636k.mo70429y() == null) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.trending.p4149ui.View$OnClickListenerC79082c.C79094i.RunnableC790951 */

                        /* renamed from: a */
                        final /* synthetic */ C79094i f177772a;

                        static {
                            Covode.recordClassIndex(92276);
                        }

                        {
                            this.f177772a = r1;
                        }

                        public final void run() {
                            if (this.f177772a.f177771a.isVisible() && !this.f177772a.f177771a.mo70643v().isVisible()) {
                                this.f177772a.f177771a.mo122899z();
                            }
                        }
                    }, 3100);
                } else {
                    this.f177771a.mo122892A();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$h */
    static final class C79093h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, ArrayList<C67590l>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177770a;

        static {
            Covode.recordClassIndex(92274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79093h(View$OnClickListenerC79082c cVar) {
            super(2);
            this.f177770a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, ArrayList<C67590l> arrayList) {
            AbstractC1196i lifecycle;
            C67590l lVar;
            MethodCollector.m26663i(3603);
            ArrayList<C67590l> arrayList2 = arrayList;
            C89219l.m154721d(iVar, "");
            if (arrayList2 != null) {
                Integer.valueOf(arrayList2.size());
            }
            if (!(arrayList2 == null || this.f177770a.f96636k.mo70429y() == null || !(!arrayList2.isEmpty()))) {
                Aweme y = this.f177770a.f96636k.mo70429y();
                C89219l.m154716b(y, "");
                y.getTrendingId();
                if ((!C89219l.m154714a((Object) this.f177770a.mo122896i().f177844c, (Object) "click_fyp_trending_bar")) && this.f177770a.f177755v) {
                    C49812b bVar = this.f177770a.f96635j;
                    C89219l.m154716b(bVar, "");
                    String trendingEventId = bVar.getTrendingEventId();
                    Aweme y2 = this.f177770a.f96636k.mo70429y();
                    C89219l.m154716b(y2, "");
                    if (!trendingEventId.equals(y2.getTrendingId()) && this.f177770a.f177754u.isEmpty()) {
                        this.f177770a.mo70645x();
                    }
                    this.f177770a.f177755v = false;
                }
                View$OnClickListenerC79082c cVar = this.f177770a;
                Aweme y3 = cVar.f96636k.mo70429y();
                C89219l.m154716b(y3, "");
                cVar.f177753t = C79158e.m137989a(y3.getTrendingId(), arrayList2);
                View$OnClickListenerC79082c cVar2 = this.f177770a;
                C89378p<C67590l, Integer> pVar = cVar2.f177753t;
                if (pVar != null) {
                    lVar = pVar.getFirst();
                } else {
                    lVar = null;
                }
                cVar2.mo122895b(lVar);
                this.f177770a.mo122898y();
            }
            View$OnClickListenerC79082c cVar3 = this.f177770a;
            if (arrayList2 != null && !arrayList2.isEmpty() && cVar3.f177751r == null) {
                TextSwitcher textSwitcher = (TextSwitcher) cVar3.mo61343a(R.id.enr);
                C89219l.m154716b(textSwitcher, "");
                cVar3.f177751r = new TrendingTitleSwitcher(textSwitcher, cVar3.getActivity(), arrayList2, new C79105q(cVar3, arrayList2));
                TrendingTitleSwitcher trendingTitleSwitcher = cVar3.f177751r;
                if (trendingTitleSwitcher == null) {
                    C89219l.m154710a("trendingSwitcher");
                }
                if (!trendingTitleSwitcher.f177726d.isEmpty()) {
                    TextSwitcher textSwitcher2 = trendingTitleSwitcher.f177724b;
                    Animation loadAnimation = AnimationUtils.loadAnimation(textSwitcher2.getContext(), R.anim.dm);
                    loadAnimation.setDuration(450);
                    textSwitcher2.setInAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(textSwitcher2.getContext(), R.anim.dz);
                    loadAnimation2.setDuration(450);
                    textSwitcher2.setOutAnimation(loadAnimation2);
                    textSwitcher2.setFactory(new TrendingTitleSwitcher.C79076d(trendingTitleSwitcher));
                    trendingTitleSwitcher.mo122886a(0, false);
                    trendingTitleSwitcher.f177723a = 0;
                    AbstractC1204m mVar = trendingTitleSwitcher.f177725c;
                    if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                        lifecycle.mo4012a(trendingTitleSwitcher);
                    }
                    trendingTitleSwitcher.mo122885a().mo122889a();
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(3603);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.c$q */
    static final class C79105q extends AbstractC89220m implements AbstractC89183m<String, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC79082c f177788a;

        /* renamed from: b */
        final /* synthetic */ List f177789b;

        static {
            Covode.recordClassIndex(92286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79105q(View$OnClickListenerC79082c cVar, List list) {
            super(2);
            this.f177788a = cVar;
            this.f177789b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Integer num) {
            String str2 = str;
            int intValue = num.intValue();
            C89219l.m154721d(str2, "");
            String l = this.f177788a.mo62679l();
            C49812b bVar = this.f177788a.f96635j;
            C89219l.m154716b(bVar, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(bVar, "");
            C33744d a = new C33744d().mo59983a("search_id", bVar.getSearchId()).mo59983a("search_keyword", bVar.getSearchKeyword()).mo59983a("search_result_id", bVar.getSearchResultId()).mo59983a("search_position", l).mo59983a("words_content", str2).mo59983a("words_source", "trending_page_click_more").mo59980a("words_position", intValue);
            if (C80537hk.m139613a(bVar.getIsFromTrendingCard())) {
                a.mo59983a("is_from_trending_card", bVar.getIsFromTrendingCard());
            }
            C39162r.m79460a("trending_words_show", a.f79943a);
            if (intValue < this.f177789b.size() && intValue >= 0) {
                String str3 = this.f177788a.mo122896i().f177844c;
                C67590l lVar = (C67590l) this.f177789b.get(intValue);
                C89219l.m154721d(str3, "");
                C89219l.m154721d(lVar, "");
                if (C89219l.m154714a((Object) str3, (Object) "click_fyp_trending_bar")) {
                    Map<String, String> extraMap = lVar.getExtraMap();
                    C33744d a2 = new C33744d().mo59983a("enter_from", "trending_inflow_page").mo59983a("trending_entrance", "homepage_hot_trending_bar").mo59983a("trending_topic", lVar.getTrendingName()).mo59983a("trending_topic_id", lVar.getEventId());
                    String str4 = extraMap.get("trending_topic_source");
                    if (str4 == null) {
                        str4 = "";
                    }
                    C33744d a3 = a2.mo59983a("trending_topic_source", str4);
                    String str5 = extraMap.get("topic_rank");
                    if (str5 == null) {
                        str5 = "";
                    }
                    C33744d a4 = a3.mo59983a("topic_rank", str5);
                    String str6 = extraMap.get("topic_group_num");
                    if (str6 == null) {
                        str6 = "";
                    }
                    C33744d a5 = a4.mo59983a("topic_group_num", str6);
                    C89219l.m154716b(a5, "");
                    C79066b.m137890a("trending_inflow_topic_show", a5);
                }
                this.f177788a.f177750q = (C67590l) this.f177789b.get(intValue);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v54, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    public final void onViewCreated(View view, Bundle bundle) {
        List items;
        C89219l.m154721d(view, "");
        TrendingMainViewModel i = mo122896i();
        C49812b bVar = this.f96635j;
        C89219l.m154716b(bVar, "");
        C89219l.m154721d(bVar, "");
        i.f177850l = bVar;
        C67590l lVar = new C67590l();
        C49812b bVar2 = this.f96635j;
        C89219l.m154716b(bVar2, "");
        lVar.setTrendingName(bVar2.getTrendingName());
        C49812b bVar3 = this.f96635j;
        C89219l.m154716b(bVar3, "");
        lVar.setEventId(bVar3.getTrendingEventId());
        TuxTextView tuxTextView = (TuxTextView) mo61343a(R.id.env);
        C89219l.m154716b(tuxTextView, "");
        C49812b bVar4 = this.f96635j;
        C89219l.m154716b(bVar4, "");
        tuxTextView.setText(bVar4.getTrendingName());
        mo122896i().mo122945a(lVar);
        mo122896i().mo122946b(lVar);
        View findViewById = view.findViewById(R.id.fgn);
        C89219l.m154716b(findViewById, "");
        this.f177742A = (VerticalViewPager) findViewById;
        AbstractC39100a aVar = C50529ae.f116790a;
        if (!(aVar == null || (items = aVar.getItems()) == null)) {
            for (Object obj : items) {
                if (obj instanceof Aweme) {
                    Aweme aweme = (Aweme) obj;
                    C49812b bVar5 = this.f96635j;
                    C89219l.m154716b(bVar5, "");
                    aweme.setTrendingId(bVar5.getTrendingEventId());
                    C49812b bVar6 = this.f96635j;
                    C89219l.m154716b(bVar6, "");
                    aweme.setTrendingName(bVar6.getTrendingName());
                    C49812b bVar7 = this.f96635j;
                    C89219l.m154716b(bVar7, "");
                    aweme.setFromTrendingCard(bVar7.getIsFromTrendingCard());
                    this.f177754u.add(obj);
                }
            }
        }
        if (this.f177754u.size() > 0) {
            TrendingMainViewModel i2 = mo122896i();
            ArrayList<Aweme> arrayList = this.f177754u;
            C89219l.m154721d(arrayList, "");
            i2.mo33689c(new TrendingMainViewModel.C79139g(arrayList));
        }
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo61343a(R.id.eno);
        C89219l.m154716b(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C80534hh.m139609b();
        if (C79040a.m137876b()) {
            ((LinearLayout) mo61343a(R.id.enw)).post(new RunnableC79097k(this));
        }
        C17235c.m31810a(mo61343a(R.id.enq), 0.5f);
        C17235c.m31810a(mo61343a(R.id.enw), 0.5f);
        ((LinearLayout) mo61343a(R.id.enq)).setOnClickListener(this);
        ((LinearLayout) mo61343a(R.id.enw)).setOnClickListener(this);
        mo122896i().f177846e.observe(this, (AbstractC1214u) this.f177748G.getValue());
        mo70695n();
        this.f177754u.size();
        VerticalViewPager verticalViewPager = this.f177742A;
        if (verticalViewPager == null) {
            C89219l.m154710a("mViewPager");
        }
        verticalViewPager.mo67974a(new C79091f(this));
        AwemeChangeCallBack.m108594a(getActivity(), this, new C79092g(this));
        AbstractC88412b unused = selectSubscribe(mo122896i(), C79108d.f177792a, new C20370ah(), new C79093h(this));
        if (C79043c.m137877a(mo122896i().f177844c)) {
            VerticalViewPager verticalViewPager2 = this.f177742A;
            if (verticalViewPager2 == null) {
                C89219l.m154710a("mViewPager");
            }
            C79044a aVar2 = new C79044a(verticalViewPager2, mo122896i(), this);
            VerticalViewPager verticalViewPager3 = this.f177742A;
            if (verticalViewPager3 == null) {
                C89219l.m154710a("mViewPager");
            }
            verticalViewPager3.mo67975a(false, (ViewPager.AbstractC1580f) aVar2);
        }
        AbstractC88412b unused2 = selectSubscribe(mo122896i(), C79109e.f177793a, new C20370ah(), new C79094i(this));
        View view2 = this.f96632c;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC79096j(this));
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b47, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
