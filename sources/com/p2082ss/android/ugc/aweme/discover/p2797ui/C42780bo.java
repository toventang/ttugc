package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.extension.C20645b;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20554a;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e;
import com.bytedance.jedi.ext.adapter.p1465a.C20592b;
import com.bytedance.jedi.ext.adapter.p1465a.C20601g;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.p084a.p088b.C1862a;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.p2572k.AbstractC38030a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2636h.C39127c;
import com.p2082ss.android.ugc.aweme.discover.DiscoveryServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41729k;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41711c;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41726h;
import com.p2082ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.p2082ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import com.p2082ss.android.ugc.aweme.discover.helper.C42003d;
import com.p2082ss.android.ugc.aweme.discover.helper.C42045q;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2767c.AbstractC41896b;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41942c;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41945e;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42533a;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42534b;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.p2082ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51454e;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80501gj;
import com.p2082ss.android.ugc.aweme.views.C81437h;
import com.p2082ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bo */
public final class C42780bo extends AbstractC42874l implements AbstractC41896b, AbstractC42533a, AbstractC42534b, AbstractC90252i, AbstractC90253j {

    /* renamed from: s */
    public static final C42782b f99786s = new C42782b((byte) 0);

    /* renamed from: A */
    private final AbstractC42534b f99787A;

    /* renamed from: B */
    private final AbstractC89244h f99788B;

    /* renamed from: C */
    private final AbstractC89244h f99789C;

    /* renamed from: D */
    private SparseArray f99790D;

    /* renamed from: c */
    int f99791c = 1;

    /* renamed from: d */
    public int f99792d;

    /* renamed from: e */
    public final Set<String> f99793e = new LinkedHashSet();

    /* renamed from: j */
    public boolean f99794j = true;

    /* renamed from: k */
    public final Map<AbstractC89277c<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> f99795k;

    /* renamed from: l */
    public boolean f99796l;

    /* renamed from: m */
    public AbstractC38030a f99797m;

    /* renamed from: n */
    C42045q f99798n;

    /* renamed from: o */
    public AbstractC41729k f99799o;

    /* renamed from: p */
    public C42902o f99800p;

    /* renamed from: q */
    public Boolean f99801q;

    /* renamed from: r */
    public C42003d f99802r;

    /* renamed from: t */
    private final int f99803t = R.string.b8h;

    /* renamed from: u */
    private final String f99804u = "top_trends";

    /* renamed from: v */
    private MainAnimViewModel f99805v;

    /* renamed from: w */
    private SearchStateViewModel f99806w;

    /* renamed from: y */
    private final Set<String> f99807y = new LinkedHashSet();

    /* renamed from: z */
    private final AbstractC42533a f99808z;

    static {
        Covode.recordClassIndex(50884);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42874l
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f99790D == null) {
            this.f99790D = new SparseArray();
        }
        View view = (View) this.f99790D.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f99790D.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42874l
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f99790D;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: e */
    public final TrendsTabViewModel mo73061e() {
        return (TrendsTabViewModel) this.f99788B.getValue();
    }

    /* renamed from: g */
    public final RecyclerView.RecycledViewPool mo73062g() {
        return (RecyclerView.RecycledViewPool) this.f99789C.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(C42780bo.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$b */
    public static final class C42782b {
        static {
            Covode.recordClassIndex(50886);
        }

        private C42782b() {
        }

        public /* synthetic */ C42782b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42874l
    /* renamed from: b */
    public final int mo73059b() {
        return this.f99803t;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42874l
    /* renamed from: c */
    public final String mo73060c() {
        return this.f99804u;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42533a
    public final void bd_() {
        this.f99808z.bd_();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42534b
    /* renamed from: l */
    public final void mo70806l() {
        this.f99787A.mo70806l();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C80501gj.f180100a = "TrendsTabFragment";
    }

    /* renamed from: i */
    private static boolean m85485i() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$y */
    static final class C42811y extends AbstractC89220m implements AbstractC89171a<C42908s> {

        /* renamed from: a */
        public static final C42811y f99844a = new C42811y();

        static {
            Covode.recordClassIndex(50915);
        }

        C42811y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42908s invoke() {
            if (!C41945e.m83984a()) {
                return null;
            }
            C42908s sVar = new C42908s();
            sVar.setMaxRecycledViews(0, C41945e.m83985b());
            return sVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        Analysis labelName = new Analysis().setLabelName("discovery_trends");
        C89219l.m154716b(labelName, "");
        return labelName;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        new Handler(Looper.getMainLooper()).removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$c */
    static final class CallableC42783c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99812a;

        /* renamed from: b */
        final /* synthetic */ C41711c f99813b;

        /* renamed from: c */
        final /* synthetic */ Handler f99814c;

        static {
            Covode.recordClassIndex(50887);
        }

        CallableC42783c(C42780bo boVar, C41711c cVar, Handler handler) {
            this.f99812a = boVar;
            this.f99813b = cVar;
            this.f99814c = handler;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int b = C41945e.m83985b();
            if (b >= 0) {
                int i = 0;
                while (true) {
                    final RecyclerView.ViewHolder createViewHolder = this.f99813b.createViewHolder((ViewGroup) this.f99812a.mo60929a(R.id.c_f), 0);
                    C89219l.m154716b(createViewHolder, "");
                    this.f99814c.post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42780bo.CallableC42783c.RunnableC427841 */

                        /* renamed from: a */
                        final /* synthetic */ CallableC42783c f99815a;

                        static {
                            Covode.recordClassIndex(50888);
                        }

                        {
                            this.f99815a = r1;
                        }

                        public final void run() {
                            RecyclerView.RecycledViewPool g = this.f99815a.f99812a.mo73062g();
                            if (g != null) {
                                g.putRecycledView(createViewHolder);
                            }
                        }
                    });
                    if (i == b) {
                        break;
                    }
                    i++;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$t */
    static final class C42805t implements SwipeRefreshLayout.AbstractC34634b {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99837a;

        static {
            Covode.recordClassIndex(50909);
        }

        C42805t(C42780bo boVar) {
            this.f99837a = boVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
            if (r1.isEnabled() == false) goto L_0x001e;
         */
        @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.AbstractC34634b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo59551a() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.discover.ui.bo r0 = r2.f99837a
                r1 = 2131362642(0x7f0a0352, float:1.834507E38)
                android.view.View r0 = r0.mo60929a(r1)
                if (r0 == 0) goto L_0x001e
                com.ss.android.ugc.aweme.discover.ui.bo r0 = r2.f99837a
                android.view.View r1 = r0.mo60929a(r1)
                com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout r1 = (com.p2082ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout) r1
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                boolean r0 = r1.isEnabled()
                if (r0 != 0) goto L_0x0034
            L_0x001e:
                com.ss.android.ugc.aweme.discover.ui.bo r0 = r2.f99837a
                com.ss.android.ugc.aweme.commercialize.k.a r0 = r0.f99797m
                if (r0 == 0) goto L_0x0033
                com.ss.android.ugc.aweme.discover.ui.bo r0 = r2.f99837a
                com.ss.android.ugc.aweme.commercialize.k.a r0 = r0.f99797m
                if (r0 != 0) goto L_0x002d
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x002d:
                boolean r0 = r0.isEnabled()
                if (r0 != 0) goto L_0x0034
            L_0x0033:
                return
            L_0x0034:
                com.ss.android.ugc.aweme.discover.ui.bo r0 = r2.f99837a
                r0.mo73063h()
                goto L_0x0033
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.C42780bo.C42805t.mo59551a():void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42874l
    public final void onDestroyView() {
        mo73061e().mo73215b(true);
        RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.c_f);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(null);
        super.onDestroyView();
        mo60930a();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C33842s sVar = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar, "");
        if (sVar.f80108c == null) {
            sVar.f80108c = new C33594aj<>("should_show_pull_strong_guide", (Boolean) true);
        }
        C33594aj<Boolean> ajVar = sVar.f80108c;
        C89219l.m154716b(ajVar, "");
        ajVar.mo59940b(false);
        C80501gj.f180100a = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$a */
    public static final class C42781a extends AbstractC89220m implements AbstractC89171a<TrendsTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f99809a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f99810b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f99811c;

        static {
            Covode.recordClassIndex(50885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42781a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f99809a = fragment;
            this.f99810b = cVar;
            this.f99811c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel invoke() {
            /*
                r4 = this;
                androidx.fragment.app.Fragment r0 = r4.f99809a
                androidx.fragment.app.Fragment r3 = r0.getParentFragment()
                h.k.c r0 = r4.f99811c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r2 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
            L_0x0015:
                if (r3 == 0) goto L_0x0031
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3879a(r3, r0)     // Catch:{ as -> 0x002a }
                h.k.c r0 = r4.f99810b     // Catch:{ as -> 0x002a }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ac r0 = m85500x3c6d5d94(r1, r2, r0)     // Catch:{ as -> 0x002a }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x002a }
                goto L_0x002f
            L_0x002a:
                androidx.fragment.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0015
            L_0x002f:
                if (r0 != 0) goto L_0x0049
            L_0x0031:
                androidx.fragment.app.Fragment r0 = r4.f99809a
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f99810b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m85500x3c6d5d94(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.C42780bo.C42781a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_discover_ui_TrendsTabFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m85500x3c6d5d94(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: h */
    public final void mo73063h() {
        getContext();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m85485i();
        }
        if (!C58029j.f132256h) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo60929a(R.id.w9);
            C89219l.m154716b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            if (!this.f99796l) {
                ((DmtStatusView) mo60929a(R.id.e7i)).mo27387h();
            }
        } else if (this.f99796l) {
            mo73061e().mo73214a(false);
        } else {
            ((DmtStatusView) mo60929a(R.id.e7i)).mo27384f();
            mo73061e().mo73214a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$d */
    static final class CallableC42785d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99817a;

        static {
            Covode.recordClassIndex(50889);
        }

        CallableC42785d(C42780bo boVar) {
            this.f99817a = boVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            View a = C1764a.m5927a(LayoutInflater.from(this.f99817a.getContext()), R.layout.xu, (ViewGroup) this.f99817a.mo60929a(R.id.c_f), false);
            C42780bo boVar = this.f99817a;
            if (a == null) {
                C89219l.m154715b();
            }
            DiscoverBannerViewHolder discoverBannerViewHolder = new DiscoverBannerViewHolder(boVar, a);
            Map<AbstractC89277c<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> map = this.f99817a.f99795k;
            AbstractC89277c<? extends RecyclerView.ViewHolder> a2 = C89204ab.m154669a(DiscoverBannerViewHolder.class);
            LinkedList linkedList = new LinkedList();
            linkedList.offer(discoverBannerViewHolder);
            map.put(a2, linkedList);
            this.f99817a.mo73056a(a);
            this.f99817a.f99799o = discoverBannerViewHolder;
            if (this.f99817a.f99800p == null) {
                this.f99817a.f99800p = new C42902o(this.f99817a.getActivity(), this.f99817a.f99799o);
            }
            int i = 0;
            do {
                View a3 = C1764a.m5927a(LayoutInflater.from(this.f99817a.getContext()), R.layout.xv, (ViewGroup) this.f99817a.mo60929a(R.id.c_f), false);
                if (a3 == null) {
                    C89219l.m154715b();
                }
                TrendingTopicViewHolder trendingTopicViewHolder = new TrendingTopicViewHolder(a3, this.f99817a.mo73062g(), this.f99817a);
                trendingTopicViewHolder.mo70803a((TrendingTopicViewHolder.AbstractC41583d) new C42786a(this));
                C42780bo boVar2 = this.f99817a;
                if (boVar2.f99795k.get(C89204ab.m154669a(TrendingTopicViewHolder.class)) == null) {
                    Map<AbstractC89277c<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> map2 = boVar2.f99795k;
                    AbstractC89277c<? extends RecyclerView.ViewHolder> a4 = C89204ab.m154669a(TrendingTopicViewHolder.class);
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.offer(trendingTopicViewHolder);
                    map2.put(a4, linkedList2);
                } else {
                    Queue<? extends RecyclerView.ViewHolder> queue = boVar2.f99795k.get(C89204ab.m154669a(TrendingTopicViewHolder.class));
                    if (queue != null) {
                        Objects.requireNonNull(queue, "null cannot be cast to non-null type java.util.LinkedList<com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder>");
                        ((LinkedList) queue).offer(trendingTopicViewHolder);
                    }
                }
                i++;
            } while (i <= 7);
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$d$a */
        public static final class C42786a implements TrendingTopicViewHolder.AbstractC41583d {

            /* renamed from: a */
            final /* synthetic */ CallableC42785d f99818a;

            static {
                Covode.recordClassIndex(50890);
            }

            C42786a(CallableC42785d dVar) {
                this.f99818a = dVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.AbstractC41583d
            /* renamed from: a */
            public final void mo70811a(String str, String str2, String str3, int i) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d(str3, "");
                if (str.length() > 0 && !this.f99818a.f99817a.f99793e.contains(str)) {
                    this.f99818a.f99817a.f99793e.add(str);
                    C39162r.m79460a("show_hashtag", new C33744d().mo59983a("enter_from", "discovery").mo59983a("tag_id", str).mo59983a("tag_line", str2).mo59980a("order", i + 1).f79943a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$r */
    static final class C42802r extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, DiscoverSectionItem>> {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99834a;

        static {
            Covode.recordClassIndex(50906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42802r(C42780bo boVar) {
            super(1);
            this.f99834a = boVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$r$a */
        public static final class C42803a implements TrendingTopicViewHolder.AbstractC41583d {

            /* renamed from: a */
            final /* synthetic */ C42802r f99835a;

            static {
                Covode.recordClassIndex(50907);
            }

            C42803a(C42802r rVar) {
                this.f99835a = rVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder.AbstractC41583d
            /* renamed from: a */
            public final void mo70811a(String str, String str2, String str3, int i) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d(str3, "");
                if (str.length() > 0 && !this.f99835a.f99834a.f99793e.contains(str)) {
                    this.f99835a.f99834a.f99793e.add(str);
                    C39162r.m79460a("show_hashtag", new C33744d().mo59983a("enter_from", "discovery").mo59983a("tag_id", str).mo59983a("tag_line", str2).mo59980a("order", i + 1).f79943a);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, DiscoverSectionItem> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            TrendingTopicViewHolder trendingTopicViewHolder = (TrendingTopicViewHolder) this.f99834a.mo73055a(C89204ab.m154669a(TrendingTopicViewHolder.class));
            if (trendingTopicViewHolder != null) {
                return trendingTopicViewHolder;
            }
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.xv, viewGroup2, false);
            C89219l.m154716b(a, "");
            TrendingTopicViewHolder trendingTopicViewHolder2 = new TrendingTopicViewHolder(a, this.f99834a.mo73062g(), this.f99834a);
            trendingTopicViewHolder2.mo70803a((TrendingTopicViewHolder.AbstractC41583d) new C42803a(this));
            return trendingTopicViewHolder2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$e */
    public static final class C42787e extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99819a;

        static {
            Covode.recordClassIndex(50891);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42787e(C42780bo boVar) {
            this.f99819a = boVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            boolean canScrollVertically = recyclerView.canScrollVertically(-1);
            if (!C89219l.m154714a(this.f99819a.f99801q, Boolean.valueOf(canScrollVertically))) {
                this.f99819a.f99801q = Boolean.valueOf(canScrollVertically);
                this.f99819a.mo73061e().mo33689c(new TrendsTabViewModel.C43018e(canScrollVertically));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$j */
    public static final class C42793j extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99825a;

        static {
            Covode.recordClassIndex(50897);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42793j(C42780bo boVar) {
            this.f99825a = boVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 0) {
                C24413h e = C24428k.m46551a().mo40247e();
                C89219l.m154716b(e, "");
                if (e.f57872e.mo40431c()) {
                    C24428k.m46551a().mo40247e().f57872e.mo40429b();
                }
            } else if (i != 1) {
                if (i == 2) {
                    C24428k.m46551a().mo40247e().f57872e.mo40427a();
                }
            } else if (this.f99825a.f99792d == 2) {
                C24428k.m46551a().mo40247e().f57872e.mo40427a();
            } else {
                C24413h e2 = C24428k.m46551a().mo40247e();
                C89219l.m154716b(e2, "");
                if (e2.f57872e.mo40431c()) {
                    C24428k.m46551a().mo40247e().f57872e.mo40429b();
                }
            }
            this.f99825a.f99792d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$w */
    public static final class C42808w implements C39127c.AbstractC39129b {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99841a;

        static {
            Covode.recordClassIndex(50912);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42808w(C42780bo boVar) {
            this.f99841a = boVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2636h.C39127c.AbstractC39129b
        /* renamed from: a */
        public final Object mo67885a(int i) {
            C42780bo boVar = this.f99841a;
            return boVar.withState(boVar.mo73061e(), new C42809a(i));
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$w$a */
        static final class C42809a extends AbstractC89220m implements AbstractC89172b<TrendsTabState, Object> {

            /* renamed from: a */
            final /* synthetic */ int f99842a;

            static {
                Covode.recordClassIndex(50913);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C42809a(int i) {
                super(1);
                this.f99842a = i;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Object invoke(TrendsTabState trendsTabState) {
                TrendsTabState trendsTabState2 = trendsTabState;
                C89219l.m154721d(trendsTabState2, "");
                Iterator<DiscoverSectionItem> it = trendsTabState2.getSubstate().getList().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (it.next() instanceof DiscoverSectionItem.TrendingTopicOrAdSection) {
                        break;
                    } else {
                        i++;
                    }
                }
                int i2 = this.f99842a;
                if (i2 < 0 || i2 < i || i2 >= trendsTabState2.getSubstate().getList().size()) {
                    return Integer.valueOf(this.f99842a);
                }
                return C89070n.m154561b((List) trendsTabState2.getSubstate().getList(), this.f99842a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$u */
    static final class View$OnClickListenerC42806u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99838a;

        static {
            Covode.recordClassIndex(50910);
        }

        View$OnClickListenerC42806u(C42780bo boVar) {
            this.f99838a = boVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f99838a.mo73063h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$f */
    static final class C42788f extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99820a;

        static {
            Covode.recordClassIndex(50892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42788f(C42780bo boVar) {
            super(1);
            this.f99820a = boVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f99820a.mo73061e(), new AbstractC89172b<TrendsTabState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42780bo.C42788f.C427891 */

                /* renamed from: a */
                final /* synthetic */ C42788f f99821a;

                static {
                    Covode.recordClassIndex(50893);
                }

                {
                    this.f99821a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(TrendsTabState trendsTabState) {
                    TrendsTabState trendsTabState2 = trendsTabState;
                    C89219l.m154721d(trendsTabState2, "");
                    if (!trendsTabState2.isFromSuggestSearch()) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f99821a.f99820a.mo60929a(R.id.w9);
                        C89219l.m154716b(swipeRefreshLayout, "");
                        swipeRefreshLayout.setRefreshing(true);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final <T extends RecyclerView.ViewHolder> T mo73055a(AbstractC89277c<? extends T> cVar) {
        C89219l.m154721d(cVar, "");
        Queue<? extends RecyclerView.ViewHolder> queue = this.f99795k.get(cVar);
        T t = queue != null ? (T) ((RecyclerView.ViewHolder) queue.poll()) : null;
        if (!(t instanceof RecyclerView.ViewHolder)) {
            return null;
        }
        return t;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$m */
    static final class C42796m extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, DiscoverSectionItem>> {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99828a;

        static {
            Covode.recordClassIndex(50900);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42796m(C42780bo boVar) {
            super(1);
            this.f99828a = boVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, DiscoverSectionItem> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            if (this.f99828a.f99802r == null) {
                this.f99828a.f99802r = new C42003d(this.f99828a.getActivity(), new C42003d.AbstractC42004a(this) {
                    /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42780bo.C42796m.C427971 */

                    /* renamed from: a */
                    final /* synthetic */ C42796m f99829a;

                    static {
                        Covode.recordClassIndex(50901);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42003d.AbstractC42004a
                    /* renamed from: a */
                    public final void mo71182a() {
                        this.f99829a.f99828a.mo73061e().mo73216m();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f99829a = r1;
                    }
                });
            }
            JediSimpleViewHolder<?> a = C67446h.f151111a.mo106188a(viewGroup2, this.f99828a.getActivity());
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.bytedance.jedi.ext.adapter.JediSimpleViewHolder<com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem>");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        this.f99806w = (SearchStateViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
        mo73061e().mo73214a(true);
        if (this.f99794j) {
            C18285c.m34006b("discovery_trigger_net");
        }
    }

    @AbstractC90264r
    public final void onVideoEvent(C49672ag agVar) {
        C89219l.m154721d(agVar, "");
        if (agVar.f114316b instanceof Aweme) {
            Object obj = agVar.f114316b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            Aweme aweme = (Aweme) obj;
            TrendsTabViewModel e = mo73061e();
            C89219l.m154721d(aweme, "");
            e.mo33687b_(new TrendsTabViewModel.C43019f(e, aweme));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$o */
    static final class C42799o extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, DiscoverSectionItem>> {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99831a;

        static {
            Covode.recordClassIndex(50903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42799o(C42780bo boVar) {
            super(1);
            this.f99831a = boVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, DiscoverSectionItem> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            DiscoverBannerViewHolder discoverBannerViewHolder = (DiscoverBannerViewHolder) this.f99831a.mo73055a(C89204ab.m154669a(DiscoverBannerViewHolder.class));
            if (discoverBannerViewHolder != null) {
                return discoverBannerViewHolder;
            }
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.xu, viewGroup2, false);
            C42780bo boVar = this.f99831a;
            C89219l.m154716b(a, "");
            boVar.mo73056a(a);
            DiscoverBannerViewHolder discoverBannerViewHolder2 = new DiscoverBannerViewHolder(this.f99831a, a);
            this.f99831a.f99799o = discoverBannerViewHolder2;
            if (this.f99831a.f99800p == null) {
                this.f99831a.f99800p = new C42902o(this.f99831a.getActivity(), this.f99831a.f99799o);
            }
            return discoverBannerViewHolder2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$v */
    public static final class C42807v extends AbstractC89220m implements AbstractC89172b<TrendsTabState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99839a;

        /* renamed from: b */
        final /* synthetic */ boolean f99840b;

        static {
            Covode.recordClassIndex(50911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42807v(C42780bo boVar, boolean z) {
            super(1);
            this.f99839a = boVar;
            this.f99840b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TrendsTabState trendsTabState) {
            C89219l.m154721d(trendsTabState, "");
            if (this.f99840b) {
                this.f99839a.f99796l = true;
                DmtStatusView dmtStatusView = (DmtStatusView) this.f99839a.mo60929a(R.id.e7i);
                C89219l.m154716b(dmtStatusView, "");
                dmtStatusView.setVisibility(8);
            } else {
                new C23144b(this.f99839a).mo37640e(R.string.dcq).mo37637b();
                if (!this.f99839a.f99796l) {
                    ((DmtStatusView) this.f99839a.mo60929a(R.id.e7i)).mo27387h();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo73056a(View view) {
        if (af_()) {
            ((BannerSwipeRefreshLayout) mo60929a(R.id.w9)).setHeader(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$x */
    static final class C42810x<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99843a;

        static {
            Covode.recordClassIndex(50914);
        }

        C42810x(C42780bo boVar) {
            this.f99843a = boVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C42780bo boVar = this.f99843a;
                if (boVar.mo60929a(R.id.e7i) != null) {
                    DmtStatusView dmtStatusView = (DmtStatusView) boVar.mo60929a(R.id.e7i);
                    if (dmtStatusView == null) {
                        C89219l.m154715b();
                    }
                    if (dmtStatusView.mo27389j()) {
                        DmtStatusView dmtStatusView2 = (DmtStatusView) boVar.mo60929a(R.id.e7i);
                        if (dmtStatusView2 == null) {
                            C89219l.m154715b();
                        }
                        dmtStatusView2.setVisibility(0);
                    }
                }
            } else {
                C42780bo boVar2 = this.f99843a;
                if (boVar2.mo60929a(R.id.e7i) != null) {
                    DmtStatusView dmtStatusView3 = (DmtStatusView) boVar2.mo60929a(R.id.e7i);
                    if (dmtStatusView3 == null) {
                        C89219l.m154715b();
                    }
                    if (dmtStatusView3.mo27389j()) {
                        DmtStatusView dmtStatusView4 = (DmtStatusView) boVar2.mo60929a(R.id.e7i);
                        if (dmtStatusView4 == null) {
                            C89219l.m154715b();
                        }
                        dmtStatusView4.setVisibility(4);
                    }
                }
            }
            C42780bo boVar3 = this.f99843a;
            boolean booleanValue = bool.booleanValue();
            if (boVar3.mo60929a(R.id.c_f) != null) {
                if (boVar3.f99798n == null) {
                    C89219l.m154710a("onCategoryScrollListener");
                }
                DiscoveryRecyclerView discoveryRecyclerView = (DiscoveryRecyclerView) boVar3.mo60929a(R.id.c_f);
                C89219l.m154716b(discoveryRecyclerView, "");
                C42045q.m84144a(discoveryRecyclerView, booleanValue);
            }
        }
    }

    /* renamed from: a */
    public final void mo73057a(boolean z) {
        if (af_()) {
            BannerSwipeRefreshLayout bannerSwipeRefreshLayout = (BannerSwipeRefreshLayout) mo60929a(R.id.w9);
            C89219l.m154716b(bannerSwipeRefreshLayout, "");
            if (bannerSwipeRefreshLayout.isEnabled()) {
                BannerSwipeRefreshLayout bannerSwipeRefreshLayout2 = (BannerSwipeRefreshLayout) mo60929a(R.id.w9);
                C89219l.m154716b(bannerSwipeRefreshLayout2, "");
                bannerSwipeRefreshLayout2.setSelected(false);
            }
            AbstractC38030a aVar = this.f99797m;
            if (aVar != null && aVar.isEnabled()) {
                AbstractC38030a aVar2 = this.f99797m;
                if (aVar2 == null) {
                    C89219l.m154715b();
                }
                aVar2.setSelected(false);
            }
            BannerSwipeRefreshLayout bannerSwipeRefreshLayout3 = (BannerSwipeRefreshLayout) mo60929a(R.id.w9);
            C89219l.m154716b(bannerSwipeRefreshLayout3, "");
            if (bannerSwipeRefreshLayout3.isEnabled()) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo60929a(R.id.w9);
                C89219l.m154716b(swipeRefreshLayout, "");
                swipeRefreshLayout.setRefreshing(false);
            }
            AbstractC38030a aVar3 = this.f99797m;
            if (aVar3 != null && aVar3.isEnabled() && this.f99797m == null) {
                C89219l.m154715b();
            }
            withState(mo73061e(), new C42807v(this, z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$l */
    static final class C42795l extends AbstractC89220m implements AbstractC89183m<Integer, Object, Boolean> {

        /* renamed from: a */
        public static final C42795l f99827a = new C42795l();

        static {
            Covode.recordClassIndex(50899);
        }

        C42795l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(Integer num, Object obj) {
            num.intValue();
            return Boolean.valueOf(obj instanceof DiscoverSectionItem.SuggestSearchSection);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$n */
    static final class C42798n extends AbstractC89220m implements AbstractC89183m<Integer, Object, Boolean> {

        /* renamed from: a */
        public static final C42798n f99830a = new C42798n();

        static {
            Covode.recordClassIndex(50902);
        }

        C42798n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(Integer num, Object obj) {
            num.intValue();
            return Boolean.valueOf(obj instanceof DiscoverSectionItem.BannerSection);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$p */
    static final class C42800p extends AbstractC89220m implements AbstractC89183m<Integer, Object, Boolean> {

        /* renamed from: a */
        public static final C42800p f99832a = new C42800p();

        static {
            Covode.recordClassIndex(50904);
        }

        C42800p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(Integer num, Object obj) {
            num.intValue();
            return Boolean.valueOf(obj instanceof DiscoverSectionItem.TrendingTopicOrAdSection);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$q */
    static final class C42801q extends AbstractC89220m implements AbstractC89183m<Integer, RecyclerView, C89391z> {

        /* renamed from: a */
        public static final C42801q f99833a = new C42801q();

        static {
            Covode.recordClassIndex(50905);
        }

        C42801q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, RecyclerView recyclerView) {
            num.intValue();
            C89219l.m154721d(recyclerView, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$i */
    static final class C42792i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends DiscoverSectionItem>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99824a;

        static {
            Covode.recordClassIndex(50896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42792i(C42780bo boVar) {
            super(2);
            this.f99824a = boVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends DiscoverSectionItem> list) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list, "");
            this.f99824a.mo73057a(true);
            C39127c.m79420a((RecyclerView) this.f99824a.mo60929a(R.id.c_f));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$g */
    static final class C42790g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99822a;

        static {
            Covode.recordClassIndex(50894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42790g(C42780bo boVar) {
            super(2);
            this.f99822a = boVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f99822a.mo60929a(R.id.w9);
            C89219l.m154716b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            if (!this.f99822a.f99796l) {
                ((DmtStatusView) this.f99822a.mo60929a(R.id.e7i)).mo27387h();
            }
            this.f99822a.mo73057a(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$s */
    static final class C42804s extends AbstractC89220m implements AbstractC89183m<ViewGroup, AbstractC89171a<? extends C89391z>, AbstractC20595e> {

        /* renamed from: a */
        public static final C42804s f99836a = new C42804s();

        static {
            Covode.recordClassIndex(50908);
        }

        C42804s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AbstractC20595e invoke(ViewGroup viewGroup, AbstractC89171a<? extends C89391z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            C89219l.m154721d(aVar, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.xw, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new C42904p(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$h */
    static final class C42791h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends DiscoverSectionItem>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99823a;

        static {
            Covode.recordClassIndex(50895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42791h(C42780bo boVar) {
            super(2);
            this.f99823a = boVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends DiscoverSectionItem> list) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list, "");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f99823a.mo60929a(R.id.w9);
            C89219l.m154716b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            C42780bo boVar = this.f99823a;
            if (boVar.af_() && !boVar.f99796l) {
                ((DmtStatusView) boVar.mo60929a(R.id.e7i)).mo27385g();
            }
            this.f99823a.mo73057a(true);
            C39127c.m79420a((RecyclerView) this.f99823a.mo60929a(R.id.c_f));
            if (this.f99823a.f99794j) {
                C18285c.m34007c("discovery_client_show_time");
                C18285c.m34007c("discovery_cost_time");
                C35434c.m72464b("discover_page");
                this.f99823a.f99794j = false;
            }
            return C89391z.f203057a;
        }
    }

    public C42780bo(AbstractC42533a aVar, AbstractC42534b bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f99808z = aVar;
        this.f99787A = bVar;
        AbstractC89277c a = C89204ab.m154669a(TrendsTabViewModel.class);
        this.f99788B = C89250i.m154773a((AbstractC89171a) new C42781a(this, a, a));
        this.f99795k = new LinkedHashMap();
        this.f99789C = C89250i.m154773a((AbstractC89171a) C42811y.f99844a);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42874l
    /* renamed from: a */
    public final void mo73058a(boolean z, boolean z2) {
        String str;
        C1213t<Boolean> tVar;
        AbstractC41729k kVar;
        super.mo73058a(z, z2);
        if (z) {
            str = null;
        } else {
            str = "TrendsTabFragment";
        }
        C80501gj.f180100a = str;
        if (af_() && mo60929a(R.id.c_f) != null) {
            if (z || this.f99791c == 1) {
                if (!z2 && (kVar = this.f99799o) != null) {
                    kVar.mo70799b(!z);
                }
                MainAnimViewModel mainAnimViewModel = this.f99805v;
                if (!(mainAnimViewModel == null || (tVar = mainAnimViewModel.f134234a) == null)) {
                    tVar.setValue(Boolean.valueOf(!z));
                }
                if (!z2) {
                    mo73061e().mo73215b(z);
                }
                if (!z) {
                    C49907s.m93686a(EnumC48310af.DISCOVER);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C17273d a = C81437h.m141212a(getActivity(), new View$OnClickListenerC42806u(this));
        C17275e eVar = new C17275e(getContext());
        eVar.setSupportDelayVisible(true);
        eVar.setStatus(a);
        if (mo60929a(R.id.e7i) != null) {
            DmtStatusView.C17269a c = DmtStatusView.C17269a.m31905a(getActivity()).mo27405b().mo27408c(eVar);
            if (C16048b.m29633a().mo25421a(true, "ux_opt_discovery_exp", false)) {
                c.mo27403a(C1764a.m5927a(getLayoutInflater(), R.layout.xn, (ViewGroup) mo60929a(R.id.e7i), false));
            }
            ((DmtStatusView) mo60929a(R.id.e7i)).setBuilder(c);
            DmtStatusView dmtStatusView = (DmtStatusView) mo60929a(R.id.e7i);
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            dmtStatusView.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.n4));
        }
        RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.c_f);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(1));
        RecyclerView recyclerView2 = (RecyclerView) mo60929a(R.id.c_f);
        C89219l.m154716b(recyclerView2, "");
        RecyclerView.AbstractC1356f itemAnimator = recyclerView2.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f4470l = 0;
        }
        ((FpsRecyclerView) mo60929a(R.id.c_f)).setLabel("discover_list");
        C80330da.C80331a.m139266a("discover_list").mo123698a((RecyclerView) mo60929a(R.id.c_f));
        this.f99798n = new C42045q();
        RecyclerView recyclerView3 = (RecyclerView) mo60929a(R.id.c_f);
        C42045q qVar = this.f99798n;
        if (qVar == null) {
            C89219l.m154710a("onCategoryScrollListener");
        }
        recyclerView3.mo4405a(qVar);
        ((RecyclerView) mo60929a(R.id.c_f)).mo4405a(new C42787e(this));
        C20601g gVar = (C20601g) C20592b.m38823a((C20645b) C20645b.C20646a.m38886a(this, new C41726h()).mo33901a(C42795l.f99827a, null, new C42796m(this)).mo33901a(C42798n.f99830a, null, new C42799o(this)).mo33901a(C42800p.f99832a, C42801q.f99833a, new C42802r(this))).mo33839a(242).mo33841a(C42804s.f99836a);
        gVar.f48761q = mo73061e();
        int[] iArr = {0};
        C89219l.m154719c(iArr, "");
        gVar.f48659g = iArr;
        AbstractC20554a a2 = gVar.mo33840a(new C42788f(this), new C42790g(this), new C42791h(this));
        C42792i iVar = new C42792i(this);
        AbstractC20554a.C20559e eVar2 = AbstractC20554a.C20559e.f48678a;
        AbstractC20554a.C20560f fVar = AbstractC20554a.C20560f.f48679a;
        C89219l.m154719c(eVar2, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(iVar, "");
        a2.f48662j = new AbstractC20554a.C20558d(eVar2, fVar, iVar);
        DiscoveryRecyclerView discoveryRecyclerView = (DiscoveryRecyclerView) mo60929a(R.id.c_f);
        C89219l.m154716b(discoveryRecyclerView, "");
        ((C20601g) a2).mo33882a(discoveryRecyclerView);
        C41942c.m83981a();
        if (C41942c.m83981a()) {
            ((RecyclerView) mo60929a(R.id.c_f)).mo4405a(new C42793j(this));
        }
        DiscoveryRecyclerView discoveryRecyclerView2 = (DiscoveryRecyclerView) mo60929a(R.id.c_f);
        C89219l.m154716b(discoveryRecyclerView2, "");
        ((RecyclerView) mo60929a(R.id.c_f)).mo4402a(new C42794k(this, C0643b.m2378c(discoveryRecyclerView2.getContext(), R.color.b6), (int) C13628n.m24520b(getContext(), 16.0f), (int) C13628n.m24520b(getContext(), 16.0f)));
        ((SwipeRefreshLayout) mo60929a(R.id.w9)).mo61104a((int) C13628n.m24520b(getActivity(), 49.0f), (int) C13628n.m24520b(getActivity(), 113.0f));
        ((SwipeRefreshLayout) mo60929a(R.id.w9)).setOnRefreshListener(new C42805t(this));
        if (C16048b.m29633a().mo25412a(true, "discovery_pre_create_viewholder", 0) == 1) {
            C1731i.m5640b(new CallableC42785d(this), C1731i.f5562a);
        }
        if (C41945e.m83984a()) {
            C1731i.m5640b(new CallableC42783c(this, new C41711c(this), new Handler()), C1731i.f5562a);
        }
        C39127c.m79421a((RecyclerView) mo60929a(R.id.c_f), new C42808w(this));
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        MainAnimViewModel mainAnimViewModel = (MainAnimViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(MainAnimViewModel.class);
        this.f99805v = mainAnimViewModel;
        if (mainAnimViewModel == null) {
            C89219l.m154715b();
        }
        mainAnimViewModel.f134234a.observe(this, new C42810x(this));
        DiscoveryRecyclerView discoveryRecyclerView3 = (DiscoveryRecyclerView) mo60929a(R.id.c_f);
        if (discoveryRecyclerView3 != null) {
            discoveryRecyclerView3.setBackground(null);
        }
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = (BannerSwipeRefreshLayout) mo60929a(R.id.w9);
        if (bannerSwipeRefreshLayout != null) {
            bannerSwipeRefreshLayout.setBackground(null);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        if (DiscoveryServiceImpl.m83414g().mo70766e()) {
            return C1862a.m6032a(getContext(), R.layout.xm, viewGroup, false);
        }
        if (DiscoveryServiceImpl.m83414g().mo70767f()) {
            return C1870c.m6046a(getActivity(), R.layout.xm, viewGroup, false);
        }
        return C1764a.m5927a(layoutInflater, R.layout.xm, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bo$k */
    public static final class C42794k extends C51454e {

        /* renamed from: a */
        final /* synthetic */ C42780bo f99826a;

        static {
            Covode.recordClassIndex(50898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42794k(C42780bo boVar, int i, int i2, int i3) {
            super(i, i2, i3);
            this.f99826a = boVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3011a.C51454e, androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            RecyclerView.ViewHolder a = recyclerView.mo4393a(view);
            int d = RecyclerView.m4277d(view);
            if (d > 0) {
                RecyclerView recyclerView2 = (RecyclerView) this.f99826a.mo60929a(R.id.c_f);
                C89219l.m154716b(recyclerView2, "");
                RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
                if (adapter == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(adapter, "");
                if (d < adapter.getItemCount() - 1 && (a instanceof TrendingTopicViewHolder)) {
                    super.getItemOffsets(rect, view, recyclerView, sVar);
                }
            }
        }
    }
}
