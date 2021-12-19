package com.p2082ss.android.ugc.aweme.discover.jedi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0576b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.bullet.p2417e.C35143a;
import com.p2082ss.android.ugc.aweme.bullet.p2417e.C35145b;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39144m;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.discover.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p2082ss.android.ugc.aweme.discover.jedi.p2776a.C42123b;
import com.p2082ss.android.ugc.aweme.discover.jedi.p2776a.C42124c;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42219c;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42226e;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42230f;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42235g;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42237h;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42242i;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.C42193a;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.AbstractC42263c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42412i;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42439u;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.lynx.C42421a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.lynx.C42424d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42309b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs.ClickSearchViewModel;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42350d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.C42441a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.SearchRecyclerView;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.GradientBgData;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchObserver;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener$$CC;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41554x;
import com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41902e;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41921a;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41923c;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2807d.C42836b;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49419b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67404c;
import com.p2082ss.android.ugc.aweme.search.ecom.video.C67428b;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c;
import com.p2082ss.android.ugc.aweme.search.p3686d.C67362a;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3693i.C67455a;
import com.p2082ss.android.ugc.aweme.search.p3693i.C67456b;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67623i;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67639l;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67690d;
import com.p2082ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.p2082ss.android.ugc.aweme.search.theme.C67778b;
import com.p2082ss.android.ugc.aweme.search.theme.C67782c;
import com.p2082ss.android.ugc.aweme.search.theme.dark.C67797b;
import com.p2082ss.android.ugc.aweme.search.theme.dark.DarkThemeController;
import com.p2082ss.android.ugc.aweme.xsearch.C81689d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.b */
public final class C42135b extends AbstractC42121a<C42411h> implements AbstractC39144m {

    /* renamed from: m */
    public static final C42136a f98222m = new C42136a((byte) 0);

    /* renamed from: Y */
    private C49672ag f98223Y;

    /* renamed from: Z */
    private ClickSearchViewModel f98224Z;

    /* renamed from: aa */
    private final AbstractC89244h f98225aa = C89250i.m154773a((AbstractC89171a) C42151m.f98256a);

    /* renamed from: ab */
    private View$OnAttachStateChangeListenerC42258a f98226ab;

    /* renamed from: ac */
    private C42439u f98227ac;

    /* renamed from: ad */
    private final AbstractC1214u<Integer> f98228ad;

    /* renamed from: ae */
    private EventCenter f98229ae;

    /* renamed from: af */
    private boolean f98230af;

    /* renamed from: ag */
    private final AbstractC89244h f98231ag;

    /* renamed from: ah */
    private SparseArray f98232ah;

    /* renamed from: b */
    public ViewGroup f98233b;

    /* renamed from: c */
    public MusicPlayHelper f98234c;

    /* renamed from: d */
    public SurveyViewModel f98235d;

    /* renamed from: e */
    public final C42441a f98236e = new C42441a();

    /* renamed from: j */
    public View$OnAttachStateChangeListenerC41864g f98237j;

    /* renamed from: k */
    public C67778b f98238k;

    /* renamed from: l */
    public SearchRecyclerView f98239l;

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$m */
    static final class C42151m extends AbstractC89220m implements AbstractC89171a<int[]> {

        /* renamed from: a */
        public static final C42151m f98256a = new C42151m();

        static {
            Covode.recordClassIndex(50086);
        }

        C42151m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(50070);
    }

    /* renamed from: Q */
    private final int[] m84376Q() {
        return (int[]) this.f98225aa.getValue();
    }

    /* renamed from: S */
    private final C42137b.C421381 m84378S() {
        return (C42137b.C421381) this.f98231ag.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.jedi.AbstractC42121a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f98232ah == null) {
            this.f98232ah = new SparseArray();
        }
        View view = (View) this.f98232ah.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f98232ah.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.jedi.AbstractC42121a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void bb_() {
        SparseArray sparseArray = this.f98232ah;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "general_search";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(2, new RunnableC90250g(C42135b.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(181, new RunnableC90250g(C42135b.class, "onReceiveCancelEvent", C41921a.class, ThreadMode.BACKGROUND, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: r */
    public final boolean mo71311r() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: s */
    public final boolean mo71312s() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$a */
    static final class C42136a {
        static {
            Covode.recordClassIndex(50071);
        }

        private C42136a() {
        }

        public /* synthetic */ C42136a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$o */
    public static final class C42153o implements AbstractC42263c {
        static {
            Covode.recordClassIndex(50088);
        }

        C42153o() {
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.AbstractC42263c
        /* renamed from: a */
        public final List<AbstractC42218b> mo71317a(C42186b bVar) {
            C89219l.m154721d(bVar, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C42237h(bVar));
            arrayList.add(new C42226e(bVar));
            arrayList.add(new C42235g(bVar));
            arrayList.add(new C42230f(bVar));
            arrayList.add(new C42219c(bVar));
            arrayList.add(new C42242i(bVar));
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo71342a(GlobalDoodleConfig globalDoodleConfig) {
        if (globalDoodleConfig != null) {
            AbstractC39060f A = mo72900A();
            if (!(A instanceof C42124c)) {
                A = null;
            }
            C42124c cVar = (C42124c) A;
            if (cVar != null) {
                cVar.mo71331a(globalDoodleConfig);
            }
            C67778b bVar = this.f98238k;
            if (bVar != null) {
                bVar.mo106868a(globalDoodleConfig);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo71343a(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        super.mo71343a(dVar);
        if (mo72911P()) {
            AbstractC39060f A = mo72900A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            C89219l.m154721d(dVar, "");
            ((C42124c) A).f98196a = dVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo59512a(List<? extends C42411h> list, boolean z) {
        C89219l.m154721d(list, "");
        EnumC67634k.INSTANCE.await();
        super.mo59512a(list, z);
        ClickSearchViewModel clickSearchViewModel = this.f98224Z;
        if (clickSearchViewModel != null) {
            clickSearchViewModel.mo71524d();
        }
        C42350d.m84715a(hashCode());
        C67428b.m119462a(hashCode());
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo71305a(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        if (af_() && mo72900A() != null) {
            AbstractC39060f A = mo72900A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((C42124c) A).mo71332a(followStatus);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$b */
    static final class C42137b extends AbstractC89220m implements AbstractC89171a<C421381> {

        /* renamed from: a */
        final /* synthetic */ C42135b f98240a;

        static {
            Covode.recordClassIndex(50072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42137b(C42135b bVar) {
            super(0);
            this.f98240a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C421381 invoke() {
            return new AbstractC51043a(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.jedi.C42135b.C42137b.C421381 */

                /* renamed from: a */
                final /* synthetic */ C42137b f98241a;

                static {
                    Covode.recordClassIndex(50073);
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: g */
                public final Fragment mo60503g() {
                    return this.f98241a.f98240a;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: h */
                public final AbstractC84295k mo60504h() {
                    return new C42139a(this);
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: c */
                public final boolean mo60499c() {
                    return this.f98241a.f98240a.getUserVisibleHint();
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: e */
                public final boolean mo60501e() {
                    return this.f98241a.f98240a.getUserVisibleHint();
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: f */
                public final Context mo60502f() {
                    ViewGroup viewGroup = this.f98241a.f98240a.f98233b;
                    if (viewGroup != null) {
                        return viewGroup.getContext();
                    }
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: d */
                public final String mo60500d() {
                    Integer num;
                    StringBuilder sb = new StringBuilder("MixFeedFragment_");
                    ActivityC0945e activity = this.f98241a.f98240a.getActivity();
                    if (activity != null) {
                        num = Integer.valueOf(activity.hashCode());
                    } else {
                        num = null;
                    }
                    return sb.append(num).toString();
                }

                /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$b$1$a */
                public static final class C42139a implements AbstractC84295k {

                    /* renamed from: a */
                    final /* synthetic */ C421381 f98242a;

                    static {
                        Covode.recordClassIndex(50074);
                    }

                    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
                    public final void aJ_() {
                    }

                    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
                    /* renamed from: b */
                    public final void mo60627b(int i, int i2) {
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    C42139a(C421381 r1) {
                        this.f98242a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
                    /* renamed from: a */
                    public final void mo60625a(int i, int i2) {
                        View$OnAttachStateChangeListenerC41864g gVar;
                        Integer value;
                        C1213t<Integer> tVar = this.f98242a.f98241a.f98240a.mo72902C().searchState;
                        if ((tVar == null || (value = tVar.getValue()) == null || value.intValue() != 3) && (gVar = this.f98242a.f98241a.f98240a.f98237j) != null) {
                            gVar.mo71037e();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f98241a = r1;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$d */
    public static final class C42141d implements AbstractC67364c {

        /* renamed from: a */
        final /* synthetic */ C42135b f98244a;

        static {
            Covode.recordClassIndex(50076);
        }

        @Override // com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c
        /* renamed from: a */
        public final void mo71301a() {
            C50529ae.f116794e = (AbstractC39100a) this.f98244a.f98236e.f92286h;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42141d(C42135b bVar) {
            this.f98244a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c
        /* renamed from: a */
        public final void mo71306a(C67362a aVar) {
            C0576b bVar;
            String str;
            String str2;
            String str3;
            int i;
            NextLiveData<Boolean> nextLiveData;
            Integer valueOf;
            C89219l.m154721d(aVar, "");
            View view = aVar.f150932a;
            if (!C58001a.m104815a(view, 1200) && aVar.f150933b != null && this.f98244a.getActivity() != null) {
                Aweme aweme = aVar.f150933b;
                C67394a aVar2 = aVar.f150936e;
                C50529ae.f116790a = (AbstractC39100a) this.f98244a.f98236e.f92286h;
                C67568r rVar = aVar.f150935d;
                Integer num = null;
                if (view != null) {
                    bVar = C0576b.m2192a(view, view.getWidth() / 2, view.getHeight() / 2);
                } else {
                    bVar = null;
                }
                SmartRoute withParam = SmartRouter.buildRoute(this.f98244a.getActivity(), "//aweme/detail").withParam("id", aweme.getAid()).withParam("refer", "general_search").withParam("video_from", "from_search_mix").withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("page_type", 9).withParam("search_keyword", this.f98244a.mo72879u());
                if (rVar != null) {
                    str = rVar.f151314i;
                } else {
                    str = null;
                }
                SmartRoute withParam2 = withParam.withParam("search_id", str);
                if (rVar != null) {
                    str2 = rVar.f151314i;
                } else {
                    str2 = null;
                }
                SmartRoute withParam3 = withParam2.withParam("playlist_search_id", str2).withParam("is_from_video", 1);
                if (rVar != null) {
                    str3 = rVar.f151309d;
                } else {
                    str3 = null;
                }
                SmartRoute withParam4 = withParam3.withParam("key_search_type", str3).withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
                if (aVar2 != null) {
                    withParam4.withParam("feed_anchor_custom_data", new AnchorCustomData(true, C67404c.m119440a(C67404c.m119438a(aweme, aVar2, rVar))));
                }
                if (bVar != null) {
                    withParam4.withBundleAnimation(bVar.mo2564a());
                    withParam4.withParam("activity_has_activity_options", true);
                }
                withParam4.open();
                C49419b.m92487a(aweme);
                if (this.f98244a.mo72925w().getLayoutManager() == null || view == null || (valueOf = Integer.valueOf(RecyclerView.AbstractC1362i.m4426e(view))) == null) {
                    i = -1;
                } else {
                    i = valueOf.intValue();
                }
                if (rVar != null) {
                    num = Integer.valueOf(rVar.f151318m);
                }
                String u = this.f98244a.mo72879u();
                if (num != null) {
                    i = num.intValue();
                }
                C42467o.m84880a(view, "general_search", aweme, u, i);
                SurveyViewModel surveyViewModel = this.f98244a.f98235d;
                if (!(surveyViewModel == null || (nextLiveData = surveyViewModel.f151840c) == null)) {
                    nextLiveData.postValue(true);
                }
                C67690d.C67691a.m119848a(C89041ag.m154421a(C89387v.m154943a("search_result_id", aweme.getAid()), C89387v.m154943a("is_from_video", "1")));
            }
        }
    }

    /* renamed from: R */
    private static boolean m84377R() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: V */
    private final String m84381V() {
        String searchFrom;
        C67678d dVar = this.f99508s;
        if (dVar == null || (searchFrom = dVar.getSearchFrom()) == null) {
            return "null";
        }
        return searchFrom;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onPause() {
        super.onPause();
        View$OnAttachStateChangeListenerC41864g gVar = this.f98237j;
        if (gVar != null) {
            gVar.f97676h = true;
        }
        mo71347j();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: q */
    public final void mo71353q() {
        super.mo71353q();
        C67778b bVar = this.f98238k;
        if (bVar != null) {
            bVar.mo106869a((GradientBgData) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: t */
    public final String mo71354t() {
        AbstractC42081f fVar;
        C42441a aVar = this.f98236e;
        if (aVar == null || (fVar = (AbstractC42081f) aVar.f92286h) == null) {
            return null;
        }
        return fVar.f98121q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$j */
    public static final class CallableC42147j<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42135b f98250a;

        /* renamed from: b */
        final /* synthetic */ boolean f98251b;

        static {
            Covode.recordClassIndex(50082);
        }

        CallableC42147j(C42135b bVar, boolean z) {
            this.f98250a = bVar;
            this.f98251b = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str = ((AbstractC42081f) this.f98250a.f98236e.f92286h).f98119o;
            C42135b bVar = this.f98250a;
            bVar.mo72915a("general_search", str, bVar.mo72879u(), this.f98251b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$k */
    static final class RunnableC42148k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42135b f98252a;

        /* renamed from: b */
        final /* synthetic */ C42426m f98253b;

        static {
            Covode.recordClassIndex(50083);
        }

        RunnableC42148k(C42135b bVar, C42426m mVar) {
            this.f98252a = bVar;
            this.f98253b = mVar;
        }

        public final void run() {
            C1731i<C42426m> iVar = this.f98253b.f98853g;
            if (iVar != null) {
                iVar.mo5534a(new AbstractC1729g(this) {
                    /* class com.p2082ss.android.ugc.aweme.discover.jedi.C42135b.RunnableC42148k.C421491 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC42148k f98254a;

                    static {
                        Covode.recordClassIndex(50084);
                    }

                    {
                        this.f98254a = r1;
                    }

                    @Override // p077b.AbstractC1729g
                    public final /* synthetic */ Object then(C1731i iVar) {
                        this.f98254a.f98252a.bc_();
                        return C89391z.f203057a;
                    }
                }, C1731i.f5564c, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$l */
    static final class RunnableC42150l implements Runnable {

        /* renamed from: a */
        public static final RunnableC42150l f98255a = new RunnableC42150l();

        static {
            Covode.recordClassIndex(50085);
        }

        RunnableC42150l() {
        }

        public final void run() {
            if (C67639l.f151540a > 0) {
                C1731i.m5640b(new C67639l.CallableC67640a(System.currentTimeMillis() - C67639l.f151540a), C1731i.f5562a);
                C67639l.f151540a = 0;
            }
        }
    }

    /* renamed from: T */
    private final String m84379T() {
        C67674b searchEnterParam;
        String enterSearchFrom;
        C67678d dVar = this.f99508s;
        if (dVar == null || (searchEnterParam = dVar.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam.getEnterSearchFrom()) == null) {
            return "null";
        }
        return enterSearchFrom;
    }

    /* renamed from: U */
    private static String m84380U() {
        AbstractC67567q a = C67486am.m119564a();
        if (a != null) {
            return C67458j.m119528a(a.mo106426a());
        }
        return "null";
    }

    /* renamed from: n */
    public final void mo71349n() {
        AbstractC39060f A = mo72900A();
        Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
        ((C42124c) A).mo71336l();
        mo71344a_(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: o */
    public final boolean mo71310o() {
        View view;
        List<View> a = mo72901B().mo71052a();
        View$OnAttachStateChangeListenerC42258a aVar = this.f98226ab;
        if (aVar != null) {
            view = aVar.itemView;
        } else {
            view = null;
        }
        return C89070n.m154556a((Iterable) a, (Object) view);
    }

    /* renamed from: p */
    public final void mo71352p() {
        SearchRecyclerView searchRecyclerView = this.f98239l;
        if (searchRecyclerView == null) {
            C89219l.m154715b();
        }
        searchRecyclerView.mo5599q();
        mo72909N();
        mo72907L();
    }

    public C42135b() {
        SearchObserver listener = new SearchObserver().setListener(new C42146i(this));
        C89219l.m154716b(listener, "");
        this.f98228ad = listener;
        this.f98231ag = C89250i.m154773a((AbstractC89171a) new C42137b(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: f */
    public final void mo59525f() {
        if (this.f98236e.f92286h instanceof AbstractC42081f) {
            C42836b E = mo72904E();
            T t = this.f98236e.f92286h;
            C89219l.m154716b(t, "");
            C17273d a = C42836b.m85548a(E, t.mData, null, 2);
            if (a != null) {
                mo72912a(a);
                return;
            }
        }
        mo72906K();
        mo72909N();
    }

    /* renamed from: j */
    public final void mo71347j() {
        if (mo72911P() && (mo72900A() instanceof C42124c)) {
            Objects.requireNonNull(mo72900A(), "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            C34181a.m69858b();
        }
        View$OnAttachStateChangeListenerC41864g gVar = this.f98237j;
        if (gVar != null) {
            gVar.mo71038f();
        }
        AbstractC81915c.m141874a(new C41923c(2));
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.post(RunnableC42150l.f98255a);
        }
        C67446h.f151111a.mo106196a(hashCode());
        View$OnAttachStateChangeListenerC41864g gVar = this.f98237j;
        if (gVar != null) {
            gVar.f97676h = false;
        }
        mo71348k();
        C81689d.f182657a = hashCode();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void bc_() {
        AbstractC39100a aVar = (AbstractC39100a) this.f98236e.f92286h;
        C89219l.m154716b(aVar, "");
        if (!aVar.isDataEmpty()) {
            AbstractC39100a aVar2 = (AbstractC39100a) this.f98236e.f92286h;
            C89219l.m154716b(aVar2, "");
            if (aVar2.isHasMore()) {
                C42439u uVar = this.f98227ac;
                if (uVar == null || !uVar.f98116l) {
                    this.f98236e.mo57616a(4, mo72879u(), 0, 0, 0, Integer.valueOf(this.f99498C), this.f99499D, mo72910O());
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo71348k() {
        View$OnAttachStateChangeListenerC41864g gVar;
        SearchIntermediateViewModel searchIntermediateViewModel;
        C33943c<Integer> intermediateState;
        Integer value;
        Boolean bool = null;
        if (mo72911P() && (mo72900A() instanceof C42124c) && (searchIntermediateViewModel = this.f99567M) != null && (intermediateState = searchIntermediateViewModel.getIntermediateState()) != null && (value = intermediateState.getValue()) != null && value.intValue() == 0) {
            AbstractC39060f A = mo72900A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            View$OnAttachStateChangeListenerC41864g gVar2 = ((C42124c) A).f98197b;
            if (gVar2 != null) {
                gVar2.mo71037e();
            }
        }
        C1213t<Boolean> tVar = mo72902C().isRefreshingData;
        if (tVar != null) {
            bool = tVar.getValue();
        }
        if (!C89219l.m154714a((Object) bool, (Object) true)) {
            C1213t<Boolean> tVar2 = mo72902C().isShowingFilters;
            C89219l.m154716b(tVar2, "");
            if ((!C89219l.m154714a((Object) tVar2.getValue(), (Object) true)) && (gVar = this.f98237j) != null) {
                gVar.mo71036d();
            }
        }
        AbstractC81915c.m141874a(new C41923c(1));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.jedi.AbstractC42121a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onDestroyView() {
        super.onDestroyView();
        mo72902C().searchState.removeObservers(this);
        C42193a.m84452a();
        C35143a aVar = C35145b.f82934a;
        Iterator<T> it = aVar.f82931a.iterator();
        while (it.hasNext()) {
            it.next().f82933b.f82936a.mo25721a();
        }
        aVar.f82931a.clear();
        this.f98236e.ck_();
        this.f98236e.mo67840h();
        AbstractC81915c.m141874a(new C41923c(3));
        bb_();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$n */
    static final class RunnableC42152n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42135b f98257a;

        /* renamed from: b */
        final /* synthetic */ int f98258b;

        static {
            Covode.recordClassIndex(50087);
        }

        RunnableC42152n(C42135b bVar, int i) {
            this.f98257a = bVar;
            this.f98258b = i;
        }

        public final void run() {
            C42135b bVar = this.f98257a;
            AbstractC39060f A = bVar.mo72900A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            C67623i iVar = ((C42124c) A).f98200e;
            Context context = bVar.getContext();
            String u = bVar.mo72879u();
            if (context != null) {
                iVar.f151514e.post(new Runnable(context, u) {
                    /* class com.p2082ss.android.ugc.aweme.search.p3696l.C67623i.RunnableC676274 */

                    /* renamed from: a */
                    final /* synthetic */ Context f151525a;

                    /* renamed from: b */
                    final /* synthetic */ String f151526b;

                    static {
                        Covode.recordClassIndex(79266);
                    }

                    public final void run() {
                        C1731i<C42421a> iVar;
                        if (C67623i.f151509f.get() != 2 && (iVar = C42424d.f98844a) != null) {
                            C42424d.f98844a = null;
                            if (!iVar.mo5535a() || iVar.mo5545d() == null) {
                                iVar.mo5542c(new AbstractC1729g<C42421a, Object>() {
                                    /* class com.p2082ss.android.ugc.aweme.search.p3696l.C67623i.RunnableC676274.C676281 */

                                    static {
                                        Covode.recordClassIndex(79267);
                                    }

                                    @Override // p077b.AbstractC1729g
                                    public final Object then(final C1731i<C42421a> iVar) {
                                        if (!iVar.mo5535a() || iVar.mo5545d() == null) {
                                            return null;
                                        }
                                        C67623i.this.f151514e.post(new Runnable() {
                                            /* class com.p2082ss.android.ugc.aweme.search.p3696l.C67623i.RunnableC676274.C676281.RunnableC676291 */

                                            static {
                                                Covode.recordClassIndex(79268);
                                            }

                                            public final void run() {
                                                C67623i.m119772a(RunnableC676274.this.f151525a, RunnableC676274.this.f151526b, (C42421a) iVar.mo5545d());
                                            }
                                        });
                                        return null;
                                    }
                                });
                            } else {
                                C67623i.m119772a(this.f151525a, this.f151526b, iVar.mo5545d());
                            }
                        }
                    }

                    {
                        this.f151525a = r2;
                        this.f151526b = r3;
                    }
                });
            }
            C42441a aVar = this.f98257a.f98236e;
            int i = AbstractC42670am.f99493H;
            if (aVar.f92286h != null) {
                ((AbstractC42081f) aVar.f92286h).f98118n = i;
            }
            C42441a aVar2 = this.f98257a.f98236e;
            String str = this.f98257a.f99511v;
            C89219l.m154721d(str, "");
            aVar2.f98915a = str;
            if (aVar2.f92286h != null) {
                AbstractC42081f fVar = (AbstractC42081f) aVar2.f92286h;
                String str2 = aVar2.f98915a;
                if (str2 == null) {
                    C89219l.m154715b();
                }
                fVar.mo71280b(str2);
            }
            this.f98257a.f98236e.mo57616a(1, this.f98257a.mo72879u(), Integer.valueOf(this.f98258b), 0, 0, Integer.valueOf(this.f98257a.f99498C), this.f98257a.f99499D, this.f98257a.mo72910O());
            this.f98257a.mo72902C().setIsRefreshingData(true);
            C42135b bVar2 = this.f98257a;
            AbstractC39060f A2 = bVar2.mo72900A();
            Objects.requireNonNull(A2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((C42124c) A2).f98200e.mo106624a();
            AbstractC39060f A3 = bVar2.mo72900A();
            Objects.requireNonNull(A3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((C42124c) A3).f98200e.f151511b.mo106621a(1);
            AbstractC39060f A4 = bVar2.mo72900A();
            Objects.requireNonNull(A4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((C42124c) A4).f98200e.f151513d.mo106621a(1);
            AbstractC39060f A5 = bVar2.mo72900A();
            Objects.requireNonNull(A5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((C42124c) A5).f98200e.mo106624a();
            this.f98257a.mo59515b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: i */
    public final void mo71299i() {
        C42412i iVar;
        if (C67641m.m119787a()) {
            C42412i iVar2 = new C42412i();
            iVar2.f98815c = this.f98236e;
            iVar = iVar2;
        } else {
            iVar = new C42439u();
        }
        this.f98227ac = iVar;
        this.f98236e.mo67839a_(this);
        this.f98236e.mo67838a(this.f98227ac);
        AbstractC39073l lVar = null;
        ClickSearchViewModel clickSearchViewModel = (ClickSearchViewModel) C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(ClickSearchViewModel.class);
        this.f98224Z = clickSearchViewModel;
        if (clickSearchViewModel != null) {
            C89219l.m154721d(this, "");
            clickSearchViewModel.f98605a = new WeakReference<>(this);
        }
        AbstractC39073l A = mo72900A();
        if (A instanceof C42124c) {
            lVar = A;
        }
        C42124c cVar = (C42124c) lVar;
        if (cVar != null) {
            cVar.f98199d = this.f98224Z;
        }
        if (getActivity() != null) {
            C1213t<Integer> tVar = mo72902C().searchState;
            if (tVar != null) {
                tVar.observe(this, new SearchObserver().setListener(new C42142e(this)));
            }
            mo72902C().isShowingSuicide.observe(this, new C42143f(this));
            C1213t<Boolean> tVar2 = mo72902C().isRefreshingData;
            if (tVar2 != null) {
                tVar2.observe(this, new C42144g(this));
            }
            C1213t<Boolean> tVar3 = mo72902C().isShowingFilters;
            if (tVar3 != null) {
                tVar3.observe(this, new C42145h(this));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: m */
    public final void mo71300m() {
        ViewGroup viewGroup;
        float f;
        SearchJediMixFeedFragment$initAdapter$layoutManager$1 searchJediMixFeedFragment$initAdapter$layoutManager$1 = new SearchJediMixFeedFragment$initAdapter$layoutManager$1(this, getContext());
        View view = getView();
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.ds6);
        } else {
            viewGroup = null;
        }
        this.f98233b = viewGroup;
        mo72925w().setLayoutManager(searchJediMixFeedFragment$initAdapter$layoutManager$1);
        boolean a = C41554x.m83488a();
        RecyclerView w = mo72925w();
        Context context = getContext();
        if (a) {
            f = 8.0f;
        } else {
            f = 1.0f;
        }
        w.mo4402a(new C42123b((int) C13628n.m24520b(context, f), a));
        if (!this.f98230af) {
            C42124c cVar = new C42124c(mo72925w(), m84378S(), new C42141d(this), this);
            mo72925w().addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC42140c(this));
            View$OnAttachStateChangeListenerC41864g gVar = new View$OnAttachStateChangeListenerC41864g(mo72925w(), mo72927y());
            this.f98237j = gVar;
            C89219l.m154721d(gVar, "");
            cVar.f98197b = gVar;
            mo72913a(cVar);
            this.f98230af = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$c */
    public static final class View$OnAttachStateChangeListenerC42140c implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C42135b f98243a;

        static {
            Covode.recordClassIndex(50075);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC42140c(C42135b bVar) {
            this.f98243a = bVar;
        }

        public final void onViewDetachedFromWindow(View view) {
            C42350d.m84715a(this.f98243a.hashCode());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$i */
    static final class C42146i implements SearchStateListener {

        /* renamed from: a */
        final /* synthetic */ C42135b f98249a;

        static {
            Covode.recordClassIndex(50081);
        }

        C42146i(C42135b bVar) {
            this.f98249a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageHidden() {
            SearchStateListener$$CC.onPageHidden(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageResume() {
            SearchStateListener$$CC.onPageResume(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onContentVisible(boolean z) {
            MusicPlayHelper musicPlayHelper;
            if (!z && (musicPlayHelper = this.f98249a.f98234c) != null) {
                musicPlayHelper.mo71126a();
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.BACKGROUND)
    public final void onReceiveCancelEvent(C41921a aVar) {
        C42439u uVar;
        if (aVar != null && (uVar = this.f98227ac) != null) {
            uVar.mo71279a(aVar.f97789a, aVar.f97790b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$f */
    static final class C42143f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42135b f98246a;

        static {
            Covode.recordClassIndex(50078);
        }

        C42143f(C42135b bVar) {
            this.f98246a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                View$OnAttachStateChangeListenerC41864g gVar = this.f98246a.f98237j;
                if (gVar != null) {
                    gVar.f97677i = false;
                }
                this.f98246a.mo71347j();
            }
        }
    }

    /* renamed from: c */
    private static String m84384c(SearchApiResult searchApiResult) {
        if (searchApiResult.queryCorrectInfo == null) {
            return "none";
        }
        if (searchApiResult.queryCorrectInfo.getCorrectedLevel() == 2) {
            return "strong";
        }
        return "weak";
    }

    /* renamed from: d */
    private static boolean m84385d(SearchApiResult searchApiResult) {
        String str;
        GlobalDoodleConfig globalDoodleConfig;
        if (searchApiResult == null || (globalDoodleConfig = searchApiResult.globalDoodleConfig) == null) {
            str = null;
        } else {
            str = globalDoodleConfig.getRequestKeyword();
        }
        return TextUtils.isEmpty(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo71340a(View view) {
        C89219l.m154721d(view, "");
        super.mo71340a(view);
        RecyclerView w = mo72925w();
        Objects.requireNonNull(w, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchRecyclerView");
        this.f98239l = (SearchRecyclerView) w;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a_ */
    public final void mo71344a_(boolean z) {
        C42439u uVar = this.f98227ac;
        if (uVar != null && !uVar.f98116l) {
            C1731i.m5640b(new CallableC42147j(this, z), C1731i.f5562a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$g */
    static final class C42144g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42135b f98247a;

        static {
            Covode.recordClassIndex(50079);
        }

        C42144g(C42135b bVar) {
            this.f98247a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            View$OnAttachStateChangeListenerC41864g gVar = this.f98247a.f98237j;
            if (gVar != null) {
                C89219l.m154716b(bool, "");
                gVar.f97678j = bool.booleanValue();
            }
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f98247a.mo71347j();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$h */
    static final class C42145h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42135b f98248a;

        static {
            Covode.recordClassIndex(50080);
        }

        C42145h(C42135b bVar) {
            this.f98248a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f98248a.mo71347j();
                MusicPlayHelper musicPlayHelper = this.f98248a.f98234c;
                if (musicPlayHelper != null) {
                    musicPlayHelper.mo71126a();
                    return;
                }
                return;
            }
            this.f98248a.mo71348k();
        }
    }

    /* renamed from: b */
    private static void m84383b(List<? extends C42411h> list) {
        AbstractC33368e a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC61496a aVar : list) {
                if (C37699a.m76314s(aVar.getAweme())) {
                    Aweme aweme = aVar.getAweme();
                    C89219l.m154716b(aweme, "");
                    arrayList.add(aweme);
                }
            }
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (!(f == null || (a = f.mo59376a()) == null)) {
                a.mo59412a(arrayList);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$e */
    static final class C42142e implements SearchStateListener {

        /* renamed from: a */
        final /* synthetic */ C42135b f98245a;

        static {
            Covode.recordClassIndex(50077);
        }

        C42142e(C42135b bVar) {
            this.f98245a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageHidden() {
            SearchStateListener$$CC.onPageHidden(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageResume() {
            SearchStateListener$$CC.onPageResume(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onContentVisible(boolean z) {
            C1213t<Boolean> tVar = this.f98245a.mo72902C().isShowingSuicide;
            C89219l.m154716b(tVar, "");
            boolean z2 = true;
            boolean a = C89219l.m154714a((Object) tVar.getValue(), (Object) true);
            C1213t<Boolean> tVar2 = this.f98245a.mo72902C().isShowingSuicide;
            C89219l.m154716b(tVar2, "");
            tVar2.getValue();
            if (z) {
                View$OnAttachStateChangeListenerC41864g gVar = this.f98245a.f98237j;
                if (gVar != null) {
                    if (a) {
                        z2 = false;
                    }
                    gVar.f97677i = z2;
                }
                this.f98245a.mo71348k();
                return;
            }
            View$OnAttachStateChangeListenerC41864g gVar2 = this.f98245a.f98237j;
            if (gVar2 != null) {
                gVar2.f97677i = false;
            }
            this.f98245a.mo71347j();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void setUserVisibleHint(boolean z) {
        EventCenter eventCenter;
        if (!(getUserVisibleHint() == z || (eventCenter = this.f98229ae) == null)) {
            eventCenter.mo60191a("mix_feed_fragment_status", Boolean.valueOf(z));
        }
        super.setUserVisibleHint(z);
        View$OnAttachStateChangeListenerC41864g gVar = this.f98237j;
        if (gVar != null) {
            gVar.f97677i = z;
        }
        C67778b bVar = this.f98238k;
        if (bVar != null) {
            DarkThemeController a = bVar.mo106867a();
            a.f151919b = z;
            if (z && a.f151918a) {
                a.f151918a = false;
                C67782c cVar = a.f151921d;
                if (cVar != null) {
                    a.mo106879c().mo106886a(cVar);
                    a.f151920c = true;
                }
            }
        }
        MusicPlayHelper musicPlayHelper = this.f98234c;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo71126a();
        }
        if (!z) {
            mo71347j();
        } else {
            mo71348k();
        }
    }

    /* renamed from: b */
    public final void mo71345b(C42426m mVar) {
        String str;
        int i;
        boolean z;
        C42411h hVar;
        SearchRecyclerView searchRecyclerView = this.f98239l;
        if (searchRecyclerView == null) {
            C89219l.m154715b();
        }
        searchRecyclerView.mo5599q();
        C67605g.m119730a(this.f99508s).mo106585c();
        C67606h.m119736a(this.f99508s).mo106603c();
        if (mVar == null) {
            mo59525f();
            return;
        }
        List<C42411h> list = mVar.f98850c;
        boolean z2 = mVar.f98849b;
        C89219l.m154716b(list, "");
        List<C42411h> a = C41902e.m83946a(list);
        mo72829a((SearchApiResult) mVar);
        mo71342a(mVar.globalDoodleConfig);
        if (!list.isEmpty()) {
            AbstractC39060f A = mo72900A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((C42124c) A).mo71335e(a);
            mo59512a(a, z2);
        } else if (mVar.suicidePrevent == null) {
            mo59525f();
        }
        boolean z3 = true;
        m84382a((SearchApiResult) mVar, true);
        mo72830a(mVar.suicidePrevent, mVar.globalDoodleConfig);
        mo72917a(mVar.guideSearchWordList);
        mo71303a(mVar.dynamicHeader);
        C42345d dVar = mVar.dynamicMask;
        GlobalDoodleConfig globalDoodleConfig = mVar.globalDoodleConfig;
        Boolean bool = null;
        if (globalDoodleConfig != null) {
            str = globalDoodleConfig.getUseScenario();
        } else {
            str = null;
        }
        mo71304a(dVar, str);
        mo72828a(mVar.queryCorrectInfo);
        GlobalDoodleConfig globalDoodleConfig2 = mVar.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            i = globalDoodleConfig2.getDisplayFilterBar();
        } else {
            i = 1;
        }
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        mo72834b_(z);
        mo72833b((SearchApiResult) mVar);
        C42439u uVar = this.f98227ac;
        if (uVar == null || (bool = Boolean.valueOf(uVar.mIsLoading)) == null) {
            C89219l.m154715b();
        }
        if (!bool.booleanValue() && getView() != null) {
            View view = getView();
            if (view == null) {
                C89219l.m154715b();
            }
            view.post(new RunnableC42148k(this, mVar));
        }
        LogPbBean logPbBean = mVar.logPb;
        if (logPbBean != null) {
            logPbBean.getImprId();
        }
        View$OnAttachStateChangeListenerC41864g gVar = this.f98237j;
        if (gVar != null) {
            C42411h hVar2 = (C42411h) C89070n.m154561b((List) a, 0);
            if ((hVar2 == null || !C42309b.m84669a(hVar2)) && ((hVar = (C42411h) C89070n.m154561b((List) a, 1)) == null || !C42309b.m84669a(hVar))) {
                z3 = false;
            }
            gVar.mo71033a(z3, mo72928z());
        }
        m84383b(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f9, code lost:
        if ((r2 - r1) >= r0) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fb, code lost:
        if (r0 > 0) goto L_0x0109;
     */
    @org.greenrobot.eventbus.AbstractC90264r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onVideoEvent(com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag r13) {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.jedi.C42135b.onVideoEvent(com.ss.android.ugc.aweme.feed.i.ag):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public final void mo71303a(C42345d dVar) {
        View view;
        String str;
        String str2;
        C67469ad c;
        C67469ad c2;
        View view2;
        View view3;
        View view4 = null;
        if (dVar == null) {
            C41893a B = mo72901B();
            View$OnAttachStateChangeListenerC42258a aVar = this.f98226ab;
            if (aVar != null) {
                view2 = aVar.itemView;
            } else {
                view2 = null;
            }
            B.mo71055b(view2);
            View$OnAttachStateChangeListenerC42258a aVar2 = this.f98226ab;
            if (!(aVar2 == null || (view3 = aVar2.itemView) == null)) {
                view3.setVisibility(8);
            }
            this.f98226ab = null;
            return;
        }
        C41893a B2 = mo72901B();
        View$OnAttachStateChangeListenerC42258a aVar3 = this.f98226ab;
        if (aVar3 != null) {
            view = aVar3.itemView;
        } else {
            view = null;
        }
        B2.mo71055b(view);
        if (!TextUtils.isEmpty(dVar.getSchema())) {
            this.f98226ab = View$OnAttachStateChangeListenerC42258a.C42259a.m84600a(mo72925w(), new C42153o());
            C67797b.m119979a(Integer.valueOf(hashCode()), this.f98226ab);
            AbstractC67567q a = C67486am.m119564a();
            if (a == null || (c2 = a.mo106431c()) == null) {
                str = null;
            } else {
                str = c2.f151151a;
            }
            String a2 = C67458j.m119528a(this.f99497B);
            AbstractC67567q a3 = C67486am.m119564a();
            if (a3 == null || (c = a3.mo106431c()) == null) {
                str2 = null;
            } else {
                str2 = c.f151154d;
            }
            C89378p[] pVarArr = new C89378p[3];
            if (str == null) {
                str = "";
            }
            pVarArr[0] = C89387v.m154943a("search_id", str);
            pVarArr[1] = C89387v.m154943a("search_type", a2);
            if (str2 == null) {
                str2 = "";
            }
            pVarArr[2] = C89387v.m154943a("use_scenario", str2);
            Map a4 = C89041ag.m154421a(pVarArr);
            View$OnAttachStateChangeListenerC42258a aVar4 = this.f98226ab;
            if (aVar4 != null) {
                View$OnAttachStateChangeListenerC42258a.m84565a(aVar4, dVar, a4, 24);
            }
            C41893a B3 = mo72901B();
            View$OnAttachStateChangeListenerC42258a aVar5 = this.f98226ab;
            if (aVar5 != null) {
                view4 = aVar5.itemView;
            }
            B3.mo71053a(0, view4);
        }
    }

    /* renamed from: a */
    public final void mo71341a(C42426m mVar) {
        C89219l.m154721d(mVar, "");
        List<C42411h> list = mVar.f98850c;
        boolean z = mVar.f98849b;
        if (!mVar.f98854h) {
            m84382a((SearchApiResult) mVar, false);
        }
        C89219l.m154716b(list, "");
        List<C42411h> a = C41902e.m83946a(list);
        AbstractC39060f A = mo72900A();
        Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
        ((C42124c) A).mo71335e(a);
        mo59517b(a, z);
        if (z) {
            AbstractC39060f A2 = mo72900A();
            Objects.requireNonNull(A2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((C42124c) A2).mo71336l();
        }
        C49672ag agVar = this.f98223Y;
        if (agVar != null) {
            onVideoEvent(agVar);
            this.f98223Y = null;
        }
        m84383b(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo72902C().searchState.observe(this, this.f98228ad);
        ActivityC0945e activity = getActivity();
        EventCenter eventCenter = null;
        if (activity != null) {
            eventCenter = (EventCenter) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(EventCenter.class);
        }
        this.f98229ae = eventCenter;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo71339a(int i, C67437b bVar) {
        super.mo71339a(i, bVar);
        getActivity();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m84377R();
        }
        if (C58029j.f132253e) {
            EnumC67634k.INSTANCE.async(new RunnableC42152n(this, i));
        } else {
            mo71353q();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m84382a(com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.jedi.C42135b.m84382a(com.ss.android.ugc.aweme.discover.model.SearchApiResult, boolean):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo71302a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo71302a(view, bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            this.f98234c = (MusicPlayHelper) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(MusicPlayHelper.class);
            C89219l.m154716b(activity, "");
            this.f98238k = new C67778b(activity, mo72925w(), m84378S());
            this.f98235d = (SurveyViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SurveyViewModel.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public final void mo71304a(C42345d dVar, String str) {
        C67456b.m119524a(new C67455a(getActivity(), dVar, str, this.f99497B, getView()));
    }
}
