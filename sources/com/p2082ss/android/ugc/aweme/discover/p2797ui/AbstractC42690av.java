package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AbstractC17278g;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.google.android.material.appbar.AppBarLayout;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.sdk.webview.C30244b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41702g;
import com.p2082ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42453e;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.mob.C42465m;
import com.p2082ss.android.ugc.aweme.discover.mob.C42469q;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p2082ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41503ak;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41929h;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41931j;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42619b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2805b.AbstractC42740c;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2805b.C42722a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2805b.C42724b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2807d.C42836b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2807d.EnumC42835a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e.C42854f;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.C42918b;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchResultViewModel;
import com.p2082ss.android.ugc.aweme.discover.widget.C43037c;
import com.p2082ss.android.ugc.aweme.discover.widget.C43042e;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.EnumC67453i;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.model.SearchResultParamProvider;
import com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67439d;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67442g;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67443h;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67474ag;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67478ai;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67484al;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67502av;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67511b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67560m;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67579v;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67591a;
import com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import com.p2082ss.android.ugc.aweme.search.p3701o.C67695a;
import com.p2082ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80372ec;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.av */
public abstract class AbstractC42690av<D> extends AbstractC42670am implements AbstractC39063h.AbstractC39067a, AbstractC39102c<D>, AbstractC42637ac, AbstractC42740c, AbstractC90252i, AbstractC90253j {

    /* renamed from: K */
    protected DoubleBallSwipeRefreshLayout f99565K;

    /* renamed from: L */
    public C42854f f99566L;

    /* renamed from: M */
    public SearchIntermediateViewModel f99567M;

    /* renamed from: N */
    protected FrameLayout f99568N;

    /* renamed from: O */
    public boolean f99569O;

    /* renamed from: P */
    public boolean f99570P;

    /* renamed from: Q */
    public C42722a f99571Q;

    /* renamed from: R */
    public C67678d f99572R;

    /* renamed from: S */
    public AbstractC39060f<D> f99573S;

    /* renamed from: T */
    public C41893a f99574T;

    /* renamed from: U */
    public boolean f99575U = true;

    /* renamed from: V */
    protected SearchStateViewModel f99576V;

    /* renamed from: W */
    public boolean f99577W = true;

    /* renamed from: X */
    long f99578X;

    /* renamed from: Y */
    private long f99579Y;

    /* renamed from: Z */
    private MusicPlayHelper f99580Z;

    /* renamed from: a */
    private SearchStateViewModel f99581a;

    /* renamed from: aa */
    private SearchEnterViewModel f99582aa;

    /* renamed from: ab */
    private SurveyViewModel f99583ab;

    /* renamed from: ac */
    private final AbstractC89244h f99584ac = C80372ec.m139350a(new C42696f(this));

    /* renamed from: ad */
    private final AbstractC89244h f99585ad = C80372ec.m139350a(new C42705n(this));

    /* renamed from: ae */
    private boolean f99586ae;

    /* renamed from: af */
    private SparseArray f99587af;

    /* renamed from: b */
    private ViewGroup f99588b;

    /* renamed from: c */
    private final AbstractC89244h f99589c = C80372ec.m139350a(new C42694d(this));

    /* renamed from: d */
    private final AbstractC89244h f99590d = C80372ec.m139350a(new C42693c(this));

    /* renamed from: e */
    private final AbstractC89244h f99591e = C80372ec.m139350a(new C42695e(this));

    /* renamed from: j */
    private final AbstractC89244h f99592j = C80372ec.m139350a(new C42698g(this));

    /* renamed from: k */
    private C43037c f99593k;

    /* renamed from: l */
    private QueryCorrectInfo f99594l;

    /* renamed from: m */
    private boolean f99595m;

    /* renamed from: n */
    protected RecyclerView f99596n;

    /* renamed from: o */
    protected DmtStatusView f99597o;

    static {
        Covode.recordClassIndex(50794);
    }

    /* renamed from: n */
    private final C42673an mo71349n() {
        return (C42673an) this.f99584ac.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final C42836b mo72904E() {
        return (C42836b) this.f99585ad.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: a */
    public View mo71296a(int i) {
        if (this.f99587af == null) {
            this.f99587af = new SparseArray();
        }
        View view = (View) this.f99587af.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f99587af.put(i, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71305a(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public abstract void mo71344a_(boolean z);

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    public void bb_() {
        SparseArray sparseArray = this.f99587af;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void bc_();

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public void mo59523c(List<? extends D> list, boolean z) {
        C89219l.m154721d(list, "");
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(295, new RunnableC90250g(AbstractC42690av.class, "onFeedbackSubmitSuccess", C42918b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(296, new RunnableC90250g(AbstractC42690av.class, "onWebViewActivityCloseEvent", C30244b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(297, new RunnableC90250g(AbstractC42690av.class, "onSearchAfterLogin", C41931j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(37, new RunnableC90250g(AbstractC42690av.class, "onReceiveVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(36, new RunnableC90250g(AbstractC42690av.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo71299i();

    /* renamed from: m */
    public abstract void mo71300m();

    /* renamed from: o */
    public boolean mo71310o() {
        return false;
    }

    @AbstractC90264r
    public final void onWebViewActivityCloseEvent(C30244b bVar) {
        C89219l.m154721d(bVar, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo71312s() {
        return true;
    }

    /* renamed from: t */
    public String mo71354t() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final AppBarLayout mo72928z() {
        return (AppBarLayout) this.f99590d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    public final C67678d aX_() {
        return this.f99508s;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        m85240Q();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
        m85240Q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d9, code lost:
        if (r11 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00dd, code lost:
        if (r11 != null) goto L_0x0094;
     */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72829a(com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult r11) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av.mo72829a(com.ss.android.ugc.aweme.discover.model.SearchApiResult):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2805b.AbstractC42740c
    /* renamed from: a */
    public final void mo72916a(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (this.f99507r != null) {
            C67678d needCorrect = new C67678d().setKeyword(str2).setNeedCorrect(this.f99498C);
            if (z) {
                str = null;
            }
            C67678d filterOption = needCorrect.setGuideSearchBaseWord(str).setSearchFrom(z ? "guide_search_cancel" : "guide_search").setFilterOption(this.f99499D);
            C89219l.m154716b(filterOption, "");
            filterOption.setIndex(this.f99497B);
            AbstractC81915c.m141874a(new C41929h(filterOption));
            mo71352p();
        }
    }

    /* renamed from: a */
    public final void mo72917a(List<GuideSearchWord> list) {
        String str;
        C67469ad b;
        if (af_()) {
            C67678d dVar = this.f99507r;
            if (dVar == null || !dVar.isGuideSearch()) {
                AbstractC67567q a = C67486am.m119564a();
                if (a == null || (b = a.mo106429b(this.f99497B)) == null || (str = b.f151151a) == null) {
                    str = "";
                }
                if (C13603b.m24435a((Collection) list)) {
                    C42722a aVar = this.f99571Q;
                    if (aVar != null) {
                        aVar.mo72990a(list, mo72879u(), C67458j.m119528a(this.f99509t), str);
                    }
                    this.f99569O = false;
                    return;
                }
                if (this.f99571Q == null) {
                    this.f99571Q = new C42722a((C42724b) this.f99591e.getValue());
                }
                C42722a aVar2 = this.f99571Q;
                if (aVar2 != null) {
                    aVar2.mo72990a(list, mo72879u(), C67458j.m119528a(this.f99509t), str);
                }
                this.f99569O = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) (r0 != null ? r0.getSearchFrom() : null), (java.lang.Object) "guide_search_cancel") != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0144, code lost:
        if (r7 == null) goto L_0x006a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72918a(boolean r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av.mo72918a(boolean, boolean):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: a */
    public void mo71343a(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        this.f99572R = dVar;
        super.mo71343a(dVar);
        this.f99575U = true;
        if (!af_()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putSerializable(AbstractC42670am.f99492G, dVar);
                return;
            }
            return;
        }
        mo71308b(dVar);
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        SearchResultParamProvider.C67672a.m119824a(context, dVar);
        mo72918a(false, false);
        ViewGroup viewGroup = this.f99588b;
        if (viewGroup == null) {
            C89219l.m154710a("mPreventSuicideLayout");
        }
        viewGroup.setVisibility(8);
        SearchStateViewModel searchStateViewModel = this.f99581a;
        if (searchStateViewModel != null) {
            searchStateViewModel.setShowingSuicide(false);
        }
        C42854f fVar = this.f99566L;
        if (fVar != null) {
            AbstractC0952i childFragmentManager = getChildFragmentManager();
            C89219l.m154716b(childFragmentManager, "");
            if (childFragmentManager.mo3564e() >= 0) {
                getChildFragmentManager().mo3552a().mo3455a(fVar).mo3467b();
                this.f99566L = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo72915a(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        if (this.f99509t != C67458j.f151133b) {
            C42469q.m84885b(this.f99509t);
        }
        C42453e eVar = new C42453e();
        if (C89219l.m154714a((Object) str, (Object) "general_search")) {
            str = "general";
        }
        eVar.f98943a = str;
        eVar.f98944b = str3;
        eVar.mo71664a(this.f99510u);
        eVar.f98953k = this.f99511v;
        C67678d dVar = this.f99508s;
        C67674b bVar = null;
        eVar.f98954l = dVar != null ? dVar.getEnterMethod() : null;
        eVar.f98946d = str2;
        eVar.f98948f = z;
        SearchEnterViewModel searchEnterViewModel = this.f99582aa;
        if (searchEnterViewModel != null) {
            bVar = searchEnterViewModel.f100248a;
        }
        eVar.f98947e = bVar;
        eVar.f98950h = C42452d.f98939k;
        eVar.f98949g = this.f99497B;
        eVar.f98951i = this.f99496A;
        eVar.f98955m = C42452d.f98930b;
        eVar.f98958p = this.f99508s;
        eVar.f98952j = C42469q.f99001a;
        eVar.f98956n = C42469q.m84886c(this.f99509t);
        eVar.f98957o = mo71354t();
        new C67579v("query_sign").mo96792f();
        m85243a(eVar);
        C42469q.f99001a = false;
        C42452d.f98930b = false;
        C42452d.f98939k = this.f99497B;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends D> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public void mo59512a(List<? extends D> list, boolean z) {
        C89219l.m154721d(list, "");
        if (af_()) {
            mo72907L();
            mo72900A().mo67829d(true);
            if (!z) {
                mo72900A().ap_();
            } else {
                mo72900A().aq_();
            }
            DmtStatusView dmtStatusView = this.f99597o;
            if (dmtStatusView == null) {
                C89219l.m154710a("mStatusView");
            }
            dmtStatusView.mo27382d();
            mo72900A().mo62377b_(list);
            mo72909N();
            View view = getView();
            if (view == null) {
                C89219l.m154715b();
            }
            view.requestLayout();
            mo71344a_(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
        C89219l.m154721d(exc, "");
        m85245d(exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public final void mo72830a(SearchPreventSuicide searchPreventSuicide, GlobalDoodleConfig globalDoodleConfig) {
        if (searchPreventSuicide != null) {
            this.f99566L = new C42854f();
            ViewGroup viewGroup = this.f99588b;
            if (viewGroup == null) {
                C89219l.m154710a("mPreventSuicideLayout");
            }
            viewGroup.setVisibility(0);
            SearchStateViewModel searchStateViewModel = this.f99581a;
            if (searchStateViewModel != null) {
                searchStateViewModel.setShowingSuicide(true);
            }
            AbstractC0976n a = getChildFragmentManager().mo3552a();
            C42854f fVar = this.f99566L;
            if (fVar == null) {
                C89219l.m154715b();
            }
            a.mo3470b(R.id.c66, fVar, C42854f.f99931l).mo3467b();
            C42854f fVar2 = this.f99566L;
            if (fVar2 != null) {
                C67678d dVar = this.f99507r;
                fVar2.f99935a = searchPreventSuicide;
                fVar2.f99936b = dVar;
                fVar2.f99937c = globalDoodleConfig != null ? globalDoodleConfig.getShowResultsSource() : null;
                fVar2.f99938d = globalDoodleConfig;
                fVar2.f99940j = false;
                fVar2.f99941k = true;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    public final AbstractC57066a.AbstractC57067a aY_() {
        return mo72880v();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: e */
    public final C42673an mo72875e() {
        return mo71349n();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$c */
    static final class C42693c extends AbstractC89220m implements AbstractC89171a<AppBarLayout> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99600a;

        static {
            Covode.recordClassIndex(50797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42693c(AbstractC42690av avVar) {
            super(0);
            this.f99600a = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AppBarLayout invoke() {
            return this.f99600a.mo71296a(R.id.dr3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$g */
    static final class C42698g extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99605a;

        static {
            Covode.recordClassIndex(50802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42698g(AbstractC42690av avVar) {
            super(0);
            this.f99605a = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f99605a.mo71296a(R.id.b3_);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$k */
    public static final class RunnableC42702k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99609a;

        static {
            Covode.recordClassIndex(50806);
        }

        RunnableC42702k(AbstractC42690av avVar) {
            this.f99609a = avVar;
        }

        public final void run() {
            C67605g.m119734b(this.f99609a.f99508s);
            C67606h.m119738b(this.f99609a.f99508s);
        }
    }

    /* renamed from: Q */
    private void m85240Q() {
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f99565K;
        if (doubleBallSwipeRefreshLayout == null) {
            C89219l.m154710a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setRefreshing(true);
    }

    /* renamed from: S */
    private final void m85242S() {
        new Handler().post(new RunnableC42703l(this));
    }

    /* renamed from: A */
    public final AbstractC39060f<D> mo72900A() {
        AbstractC39060f<D> fVar = this.f99573S;
        if (fVar == null) {
            C89219l.m154710a("mSearchAdapter");
        }
        return fVar;
    }

    /* renamed from: B */
    public final C41893a mo72901B() {
        C41893a aVar = this.f99574T;
        if (aVar == null) {
            C89219l.m154710a("mSearchAdapterWrapper");
        }
        return aVar;
    }

    /* renamed from: C */
    public final SearchStateViewModel mo72902C() {
        SearchStateViewModel searchStateViewModel = this.f99576V;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mStateViewModel");
        }
        return searchStateViewModel;
    }

    /* renamed from: D */
    public RecyclerView.AbstractC1362i mo72903D() {
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.mo4356b(1);
        return wrapLinearLayoutManager;
    }

    /* renamed from: N */
    public final void mo72909N() {
        View view = getView();
        if (view != null) {
            view.post(new RunnableC42702k(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final boolean mo72911P() {
        if (this.f99573S != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        if (af_()) {
            mo72900A().ao_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public void mo59525f() {
        if (af_()) {
            mo72906K();
            mo72909N();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f99595m) {
            mo71352p();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f99579Y = SystemClock.uptimeMillis();
    }

    /* renamed from: w */
    public final RecyclerView mo72925w() {
        RecyclerView recyclerView = this.f99596n;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final DmtStatusView mo72926x() {
        DmtStatusView dmtStatusView = this.f99597o;
        if (dmtStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        return dmtStatusView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final DoubleBallSwipeRefreshLayout mo72927y() {
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f99565K;
        if (doubleBallSwipeRefreshLayout == null) {
            C89219l.m154710a("mRefreshLayout");
        }
        return doubleBallSwipeRefreshLayout;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$f */
    static final class C42696f extends AbstractC89220m implements AbstractC89171a<C42673an> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99603a;

        static {
            Covode.recordClassIndex(50800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42696f(AbstractC42690av avVar) {
            super(0);
            this.f99603a = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42673an invoke() {
            C42673an anVar = new C42673an();
            anVar.mo72882a(C67458j.m119528a(this.f99603a.f99509t), this.f99603a.getActivity());
            anVar.f99519d = new AbstractC67439d(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av.C42696f.C426971 */

                /* renamed from: a */
                final /* synthetic */ C42696f f99604a;

                static {
                    Covode.recordClassIndex(50801);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f99604a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67439d
                /* renamed from: a */
                public final void mo72931a(C67437b bVar) {
                    C33943c<Boolean> showSearchFilterDot;
                    boolean z;
                    this.f99604a.f99603a.mo71339a(1, bVar);
                    SearchIntermediateViewModel searchIntermediateViewModel = this.f99604a.f99603a.f99567M;
                    if (searchIntermediateViewModel != null && (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) != null) {
                        if (bVar != null) {
                            z = bVar.isDefaultOption();
                        } else {
                            z = true;
                        }
                        showSearchFilterDot.setValue(Boolean.valueOf(!z));
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67439d
                /* renamed from: a */
                public final void mo72932a(String str, C67437b bVar) {
                    C89219l.m154721d(str, "");
                    this.f99604a.f99603a.mo72873c(str);
                    this.f99604a.f99603a.f99499D = bVar;
                }
            };
            return anVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$n */
    static final class C42705n extends AbstractC89220m implements AbstractC89171a<C42836b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99613a;

        static {
            Covode.recordClassIndex(50809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42705n(AbstractC42690av avVar) {
            super(0);
            this.f99613a = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42836b invoke() {
            Context context = this.f99613a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            AbstractC42690av avVar = this.f99613a;
            C89219l.m154721d(context, "");
            C89219l.m154721d(avVar, "");
            return new C42836b(context, avVar);
        }
    }

    /* renamed from: J */
    public static void m85239J() {
        String str;
        C67478ai aiVar = new C67478ai();
        if (C80064f.m138815a(C80061e.f179403k.mo123508a())) {
            str = "1";
        } else {
            str = "0";
        }
        aiVar.mo106452c(C67478ai.f151165b, str);
        aiVar.mo96792f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo72906K() {
        mo72912a(mo72904E().mo73081a());
        mo72928z().setExpanded(false);
        mo72909N();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        if (af_()) {
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f99565K;
            if (doubleBallSwipeRefreshLayout == null) {
                C89219l.m154710a("mRefreshLayout");
            }
            if (!doubleBallSwipeRefreshLayout.f181830b) {
                bc_();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            C89219l.m154716b(view, "");
            C42460j.C42461a.m84866b(view);
        }
        super.onDestroyView();
        EventBus.m156962a().mo145395b(this);
        bb_();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$d */
    static final class C42694d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99601a;

        static {
            Covode.recordClassIndex(50798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42694d(AbstractC42690av avVar) {
            super(0);
            this.f99601a = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            MethodCollector.m26663i(7590);
            ViewStub viewStub = (ViewStub) this.f99601a.getView().findViewById(R.id.any);
            C89219l.m154716b(viewStub, "");
            viewStub.setLayoutInflater(new C67591a(this.f99601a.getContext()));
            View inflate = ((ViewStub) this.f99601a.getView().findViewById(R.id.any)).inflate();
            MethodCollector.m26664o(7590);
            return inflate;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$e */
    static final class C42695e extends AbstractC89220m implements AbstractC89171a<C42724b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99602a;

        static {
            Covode.recordClassIndex(50799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42695e(AbstractC42690av avVar) {
            super(0);
            this.f99602a = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42724b invoke() {
            MethodCollector.m26663i(8176);
            FrameLayout frameLayout = (FrameLayout) this.f99602a.mo71296a(R.id.bcq);
            Context context = this.f99602a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            C42724b bVar = new C42724b(context, (byte) 0);
            frameLayout.addView(bVar);
            bVar.setItemClickListener(this.f99602a);
            MethodCollector.m26664o(8176);
            return bVar;
        }
    }

    /* renamed from: R */
    private void m85241R() {
        AppBarLayout z;
        RecyclerView recyclerView = this.f99596n;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.mo4413b(0);
        if (af_()) {
            DmtStatusView dmtStatusView = this.f99597o;
            if (dmtStatusView == null) {
                C89219l.m154710a("mStatusView");
            }
            if (!dmtStatusView.mo27390k()) {
                DmtStatusView dmtStatusView2 = this.f99597o;
                if (dmtStatusView2 == null) {
                    C89219l.m154710a("mStatusView");
                }
                if (!dmtStatusView2.mo27391l() && (z = mo72928z()) != null) {
                    z.setExpanded(true);
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo72905I() {
        if (!this.f99586ae) {
            DmtStatusView dmtStatusView = this.f99597o;
            if (dmtStatusView == null) {
                C89219l.m154710a("mStatusView");
            }
            Context context = dmtStatusView.getContext();
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(context).mo27401a(R.string.gzs, new View$OnClickListenerC42692b(this));
            MtEmptyView a2 = MtEmptyView.m31926a(context);
            C89219l.m154716b(a2, "");
            a.mo27406b(a2);
            DmtStatusView dmtStatusView2 = this.f99597o;
            if (dmtStatusView2 == null) {
                C89219l.m154710a("mStatusView");
            }
            dmtStatusView2.setBuilder(a);
            this.f99586ae = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final void mo72907L() {
        m85242S();
        SearchStateViewModel searchStateViewModel = this.f99576V;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mStateViewModel");
        }
        searchStateViewModel.setIsRefreshingData(false);
        if (af_()) {
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f99565K;
            if (doubleBallSwipeRefreshLayout == null) {
                C89219l.m154710a("mRefreshLayout");
            }
            doubleBallSwipeRefreshLayout.setRefreshing(false);
        }
    }

    /* renamed from: O */
    public final String mo72910O() {
        String enterSearchFrom;
        C67674b bVar = SearchEnterViewModel.C42997a.m85830a(getActivity()).f100248a;
        if (bVar == null || TextUtils.isEmpty(bVar.getEnterSearchFrom()) || (enterSearchFrom = bVar.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$h */
    public static final class CallableC42699h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99606a;

        static {
            Covode.recordClassIndex(50803);
        }

        CallableC42699h(AbstractC42690av avVar) {
            this.f99606a = avVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key_word", this.f99606a.mo72879u());
                if (C89219l.m154714a((Object) this.f99606a.f99510u, (Object) "search_history")) {
                    this.f99606a.mo72876e("search_history");
                } else if (C89219l.m154714a((Object) this.f99606a.f99510u, (Object) "search_sug")) {
                    this.f99606a.mo72876e("search_sug");
                } else {
                    this.f99606a.mo72876e("normal_search");
                }
                jSONObject.put("enter_from", this.f99606a.f99512w);
            } catch (JSONException unused) {
            }
            C39162r.onEvent(MobClick.obtain().setEventName("search").setLabelName(this.f99606a.mo71298c()).setJsonObject(jSONObject));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$l */
    public static final class RunnableC42703l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99610a;

        static {
            Covode.recordClassIndex(50807);
        }

        RunnableC42703l(AbstractC42690av avVar) {
            this.f99610a = avVar;
        }

        public final void run() {
            String c;
            String str;
            C67469ad c2;
            AbstractC42690av avVar = this.f99610a;
            long currentTimeMillis = System.currentTimeMillis() - avVar.f99578X;
            if (currentTimeMillis > 0 && currentTimeMillis <= 15000) {
                String str2 = "general_search";
                if (C89219l.m154714a((Object) avVar.mo71298c(), (Object) str2)) {
                    c = "general";
                } else {
                    c = avVar.mo71298c();
                    str2 = "search_result";
                }
                AbstractC67567q a = C67486am.m119564a();
                if (a == null || (c2 = a.mo106431c()) == null || (str = c2.f151151a) == null) {
                    str = "";
                }
                C67540c b = ((C67540c) new C67474ag().mo106459o(str2).mo106460p(avVar.f99511v)).mo106482b(avVar.mo72879u());
                b.mo106452c(C67474ag.f151161b, String.valueOf(currentTimeMillis));
                b.mo106486f(c).mo106480a(str).mo106483c(C48027ac.C48028a.f111257a.mo80055a(str)).mo96792f();
            }
        }
    }

    /* renamed from: p */
    private final void mo71352p() {
        Integer num;
        String str;
        C67469ad b;
        String str2;
        long uptimeMillis = SystemClock.uptimeMillis() - this.f99579Y;
        C67678d dVar = this.f99507r;
        if (dVar != null) {
            num = Integer.valueOf(dVar.getIndex());
        } else {
            num = null;
        }
        String str3 = "";
        if (num != null) {
            int i = this.f99497B;
            C67678d dVar2 = this.f99507r;
            if (dVar2 == null || i != dVar2.getIndex()) {
                str = C67458j.m119528a(num.intValue());
                AbstractC67567q a = C67486am.m119564a();
                if (!(a == null || (b = a.mo106429b(this.f99497B)) == null || (str2 = b.f151151a) == null)) {
                    str3 = str2;
                }
                ((C67502av) new C67502av().mo106441r(String.valueOf(uptimeMillis)).mo106486f(C67458j.m119528a(this.f99497B)).mo106480a(str3).mo106484d(str3).mo106483c(C48027ac.C48028a.f111257a.mo80055a(str3))).mo106442s(str).mo106482b(mo72879u()).mo96792f();
            }
        }
        str = str3;
        AbstractC67567q a2 = C67486am.m119564a();
        str3 = str2;
        ((C67502av) new C67502av().mo106441r(String.valueOf(uptimeMillis)).mo106486f(C67458j.m119528a(this.f99497B)).mo106480a(str3).mo106484d(str3).mo106483c(C48027ac.C48028a.f111257a.mo80055a(str3))).mo106442s(str).mo106482b(mo72879u()).mo96792f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final String mo72908M() {
        String str;
        QueryCorrectInfo queryCorrectInfo;
        QueryCorrectInfo queryCorrectInfo2 = this.f99594l;
        if (queryCorrectInfo2 == null || queryCorrectInfo2.getCorrectedLevel() != 2 || (queryCorrectInfo = this.f99594l) == null || (str = queryCorrectInfo.getCorrectedKeyword()) == null) {
            str = "";
        }
        mo72880v().mo94219a(new C57071b(mo72879u(), str));
        QueryCorrectInfo queryCorrectInfo3 = this.f99594l;
        if (queryCorrectInfo3 == null || queryCorrectInfo3.getCorrectedLevel() != 2) {
            return mo72879u();
        }
        QueryCorrectInfo queryCorrectInfo4 = this.f99594l;
        if (queryCorrectInfo4 == null) {
            C89219l.m154715b();
        }
        String correctedKeyword = queryCorrectInfo4.getCorrectedKeyword();
        C89219l.m154716b(correctedKeyword, "");
        return correctedKeyword;
    }

    /* renamed from: q */
    public void mo71353q() {
        mo72828a((QueryCorrectInfo) null);
        mo71303a((C42345d) null);
        mo71304a((C42345d) null, (String) null);
        if (mo72900A().f92274v) {
            mo72900A().mo67829d(false);
            mo72900A().notifyDataSetChanged();
        }
        mo72900A().mo67810f();
        DmtStatusView dmtStatusView = this.f99597o;
        if (dmtStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        dmtStatusView.mo27387h();
        mo72928z().mo43718a(false, false, true);
        new C79459a(GlobalContext.getContext()).mo123050a(R.string.dcq).mo123053a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$m */
    public static final class CallableC42704m<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99611a;

        /* renamed from: b */
        final /* synthetic */ C42453e f99612b;

        static {
            Covode.recordClassIndex(50808);
        }

        CallableC42704m(AbstractC42690av avVar, C42453e eVar) {
            this.f99611a = avVar;
            this.f99612b = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            Map<String, String> map;
            Map<String, String> map2;
            C67437b filterOption;
            List<C67443h> activitySwitchOption;
            C67437b filterOption2;
            C67442g sortTypeStruct;
            C67437b filterOption3;
            C67442g filterByStruct;
            String utmSource;
            String eventKeyword;
            C67484al alVar = new C67484al(C67484al.f151170p);
            if (C80538hl.m139614a(this.f99611a.f99513y)) {
                alVar.mo106435r(this.f99611a.f99513y);
            }
            if (C80538hl.m139614a(this.f99611a.f99514z)) {
                alVar.mo106436s(this.f99611a.f99514z);
            }
            if (C80538hl.m139614a(C41702g.f97285a)) {
                alVar.mo106452c(C67484al.f151177w, C41702g.f97285a);
                C41702g.m83659a("");
                C67695a.m119852a();
            }
            C67674b bVar = SearchEnterViewModel.C42997a.m85830a(this.f99611a.getActivity()).f100248a;
            if (bVar != null) {
                Object obtainLogData = bVar.obtainLogData("is_from_video");
                z = C89219l.m154714a((Object) "1", obtainLogData);
                if (obtainLogData != null) {
                    alVar.mo96786a("is_from_video", obtainLogData.toString());
                }
                Object obtainLogData2 = bVar.obtainLogData("tab_name");
                if (obtainLogData2 != null) {
                    alVar.mo96786a("tab_name", obtainLogData2.toString());
                }
            } else {
                z = false;
            }
            C42453e eVar = this.f99612b;
            C89219l.m154721d(alVar, "");
            C67540c f = ((C67540c) alVar.mo106482b(eVar.f98944b).mo106458n(eVar.f98946d)).mo106483c(C48027ac.C48028a.f111257a.mo80055a(eVar.f98946d)).mo106484d(eVar.f98946d).mo106486f(eVar.f98943a);
            C67674b bVar2 = eVar.f98947e;
            String str = null;
            C67511b o = f.mo106459o(bVar2 != null ? bVar2.getEnterSearchFrom() : null);
            C67674b bVar3 = eVar.f98947e;
            C67511b m = o.mo106457m(bVar3 != null ? bVar3.getPreviousPage() : null);
            C67674b bVar4 = eVar.f98947e;
            C67511b i = m.mo106453i(bVar4 != null ? bVar4.getGroupId() : null);
            C67674b bVar5 = eVar.f98947e;
            i.mo106454j(bVar5 != null ? bVar5.getAuthorId() : null).mo106452c(C67484al.f151172r, String.valueOf(eVar.f98948f ? 1 : 0));
            C67678d dVar = eVar.f98958p;
            if (!TextUtils.isEmpty(dVar != null ? dVar.getLastSearchId() : null)) {
                C67678d dVar2 = eVar.f98958p;
                alVar.mo106436s(dVar2 != null ? dVar2.getLastSearchId() : null);
            } else if (!TextUtils.isEmpty(eVar.f98957o)) {
                alVar.mo106436s(eVar.f98957o);
            }
            C67678d dVar3 = eVar.f98958p;
            if (!(dVar3 == null || (eventKeyword = dVar3.getEventKeyword()) == null || eventKeyword.length() == 0)) {
                C67678d dVar4 = eVar.f98958p;
                alVar.mo106452c(C67484al.f151178x, dVar4 != null ? dVar4.getEventKeyword() : null);
                C67678d dVar5 = eVar.f98958p;
                if (dVar5 != null) {
                    dVar5.setEventKeyword("");
                }
            }
            C67678d dVar6 = eVar.f98958p;
            if (!(dVar6 == null || (utmSource = dVar6.getUtmSource()) == null || utmSource.length() == 0)) {
                C67678d dVar7 = eVar.f98958p;
                if (dVar7 != null) {
                    str = dVar7.getUtmSource();
                }
                alVar.mo106452c(C67484al.f151179y, str);
                C67678d dVar8 = eVar.f98958p;
                if (dVar8 != null) {
                    dVar8.setUtmSource("");
                }
            }
            if (eVar.f98955m) {
                alVar.mo106460p("click_more_general_list");
            } else if (eVar.mo71665a()) {
                alVar.mo106460p("switch_tab");
                alVar.mo106435r(C42465m.m84871c(eVar.f98950h));
            } else {
                String str2 = eVar.f98954l;
                if (str2 == null || str2.length() == 0) {
                    eVar.mo71663a(alVar);
                } else {
                    alVar.mo106460p(eVar.f98954l);
                }
            }
            if (C89219l.m154714a((Object) eVar.f98945c, (Object) "tab_search") || C89219l.m154714a((Object) eVar.f98945c, (Object) "guide_search") || C89219l.m154714a((Object) eVar.f98945c, (Object) "guide_search_cancel") || C89219l.m154714a((Object) eVar.f98945c, (Object) "correct_word")) {
                alVar.mo106460p(eVar.f98945c);
                C67678d dVar9 = eVar.f98958p;
                if (dVar9 == null || (filterOption3 = dVar9.getFilterOption()) == null || (filterByStruct = filterOption3.getFilterByStruct()) == null || (map = filterByStruct.getLogInfo()) == null) {
                    map = new LinkedHashMap<>();
                }
                alVar.mo96788a(map);
                C67678d dVar10 = eVar.f98958p;
                if (dVar10 == null || (filterOption2 = dVar10.getFilterOption()) == null || (sortTypeStruct = filterOption2.getSortTypeStruct()) == null || (map2 = sortTypeStruct.getLogInfo()) == null) {
                    map2 = new LinkedHashMap<>();
                }
                alVar.mo96788a(map2);
                C67678d dVar11 = eVar.f98958p;
                if (!(dVar11 == null || (filterOption = dVar11.getFilterOption()) == null || (activitySwitchOption = filterOption.getActivitySwitchOption()) == null)) {
                    for (T t : activitySwitchOption) {
                        String logInfo = t.getLogInfo();
                        if (logInfo == null) {
                            logInfo = "";
                        }
                        alVar.mo96785a(logInfo, t.isSelected() ? 1 : 0);
                    }
                }
            }
            if (z && !this.f99612b.mo71665a()) {
                this.f99612b.mo71663a(alVar);
            }
            alVar.mo106452c(C67484al.f151171q, String.valueOf(this.f99612b.f98956n));
            alVar.mo96792f();
            if (this.f99612b.f98952j) {
                alVar.mo96791e();
                C67560m mVar = new C67560m();
                mVar.mo96788a(alVar.f135168g);
                mVar.mo106452c(C67560m.f151290b, String.valueOf(C42469q.f99002b));
                mVar.mo96792f();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$i */
    public static final class C42700i extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99607a;

        static {
            Covode.recordClassIndex(50804);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42700i(AbstractC42690av avVar) {
            this.f99607a = avVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(recyclerView, "");
        }
    }

    /* renamed from: b */
    public final void mo72919b(boolean z) {
        mo72900A().mo67829d(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$b */
    public static final class View$OnClickListenerC42692b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99599a;

        static {
            Covode.recordClassIndex(50796);
        }

        View$OnClickListenerC42692b(AbstractC42690av avVar) {
            this.f99599a = avVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f99599a.mo71339a(0, (C67437b) null);
        }
    }

    /* renamed from: a */
    private void m85243a(C42453e eVar) {
        C1731i.m5640b(new CallableC42704m(this, eVar), C1731i.f5562a);
    }

    /* renamed from: a */
    public final void mo72913a(AbstractC39060f<D> fVar) {
        C89219l.m154721d(fVar, "");
        this.f99573S = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        C89219l.m154721d(exc, "");
        if (af_()) {
            m85245d(exc);
            mo72909N();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C89219l.m154721d(exc, "");
        if (af_()) {
            mo72907L();
            mo72900A().mo67823i();
        }
    }

    @AbstractC90264r
    public final void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        C89219l.m154721d(followStatusEvent, "");
        if (af_() && mo72900A() != null) {
            mo71305a(followStatusEvent.status);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$a */
    public static final class View$OnClickListenerC42691a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99598a;

        static {
            Covode.recordClassIndex(50795);
        }

        View$OnClickListenerC42691a(AbstractC42690av avVar) {
            this.f99598a = avVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r3)
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f99598a
                boolean r0 = r0.af_()
                if (r0 == 0) goto L_0x0039
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f99598a
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r0.mo72926x()
                boolean r0 = r0.mo27391l()
                if (r0 != 0) goto L_0x002f
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f99598a
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r0.mo72926x()
                boolean r0 = r0.mo27392m()
                if (r0 != 0) goto L_0x002f
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f99598a
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r0.mo72926x()
                boolean r0 = r0.mo27393n()
                if (r0 == 0) goto L_0x0039
            L_0x002f:
                com.ss.android.ugc.aweme.discover.ui.av r1 = r2.f99598a
                r0 = 1
                r1.f99575U = r0
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f99598a
                com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av.m85244a(r0)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av.View$OnClickListenerC42691a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.av$j */
    static final class C42701j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC42690av f99608a;

        static {
            Covode.recordClassIndex(50805);
        }

        C42701j(AbstractC42690av avVar) {
            this.f99608a = avVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x002d
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f99608a
                boolean r0 = r0.f99577W
                r1 = 2
                if (r0 != 0) goto L_0x0022
                int r0 = r3.intValue()
                if (r0 != r1) goto L_0x0022
                com.ss.android.ugc.aweme.discover.ui.av r1 = r2.f99608a
                r0 = 1
                r1.f99577W = r0
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f99608a
                boolean r0 = r0.f99575U
                if (r0 == 0) goto L_0x002d
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f99608a
                com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av.m85244a(r0)
                return
            L_0x0022:
                int r0 = r3.intValue()
                if (r0 == r1) goto L_0x002d
                com.ss.android.ugc.aweme.discover.ui.av r1 = r2.f99608a
                r0 = 0
                r1.f99577W = r0
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av.C42701j.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: d */
    private void m85245d(Exception exc) {
        C89219l.m154721d(exc, "");
        C17273d a = C42836b.m85548a(mo72904E(), null, exc, 1);
        if (a != null) {
            mo72912a(a);
            return;
        }
        C33615a.m68848a(getContext(), (Throwable) exc, (int) R.string.g1i);
        mo72906K();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: b */
    public final void mo72833b(SearchApiResult searchApiResult) {
        SearchSurveyConfig surveyConfig;
        SurveyViewModel surveyViewModel;
        NextLiveData<SearchSurveyConfig> nextLiveData;
        SearchSurveyConfig surveyConfig2;
        if (searchApiResult != null) {
            GlobalDoodleConfig globalDoodleConfig = searchApiResult.globalDoodleConfig;
            if (!(globalDoodleConfig == null || (surveyConfig2 = globalDoodleConfig.getSurveyConfig()) == null)) {
                surveyConfig2.getSurveyId();
            }
            GlobalDoodleConfig globalDoodleConfig2 = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig2 != null && (surveyConfig = globalDoodleConfig2.getSurveyConfig()) != null && (surveyViewModel = this.f99583ab) != null && (nextLiveData = surveyViewModel.f151839b) != null) {
                nextLiveData.postValue(surveyConfig);
            }
        }
    }

    @AbstractC90264r
    public final void onFeedbackSubmitSuccess(C42918b bVar) {
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        C89219l.m154721d(bVar, "");
        SurveyViewModel surveyViewModel = this.f99583ab;
        if (!(surveyViewModel == null || (nextLiveData2 = surveyViewModel.f151838a) == null)) {
            Boolean.valueOf(nextLiveData2.hasObservers());
        }
        SurveyViewModel surveyViewModel2 = this.f99583ab;
        if (surveyViewModel2 != null && (nextLiveData = surveyViewModel2.f151838a) != null) {
            nextLiveData.postValue(true);
        }
    }

    @AbstractC90264r
    public void onReceiveVideoEvent(C49672ag agVar) {
        Integer valueOf;
        AppBarLayout z;
        if (agVar != null && (valueOf = Integer.valueOf(agVar.f114315a)) != null && valueOf.intValue() == 21 && (agVar.f114316b instanceof Aweme) && agVar.f114327m && !this.f99569O && (z = mo72928z()) != null) {
            z.setExpanded(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        mo72918a(true, false);
        if (z) {
            C42452d.f98940l = this.f99497B;
            C42452d.f98932d = false;
            C67678d dVar = this.f99507r;
            if (dVar != null) {
                dVar.setIndex(this.f99497B);
            }
            this.f99579Y = SystemClock.uptimeMillis();
        }
        if (this.f99595m && !z) {
            mo71352p();
        }
        this.f99595m = z;
    }

    /* renamed from: a */
    public void mo71340a(View view) {
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.c_f);
        C89219l.m154716b(findViewById, "");
        this.f99596n = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.e7i);
        C89219l.m154716b(findViewById2, "");
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById2;
        this.f99597o = dmtStatusView;
        if (dmtStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        dmtStatusView.setOnClickListener(new View$OnClickListenerC42691a(this));
        View findViewById3 = view.findViewById(R.id.dhb);
        C89219l.m154716b(findViewById3, "");
        this.f99565K = (DoubleBallSwipeRefreshLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.adp);
        C89219l.m154716b(findViewById4, "");
        this.f99568N = (FrameLayout) findViewById4;
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f99565K;
        if (doubleBallSwipeRefreshLayout == null) {
            C89219l.m154710a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setEnabled(false);
        View findViewById5 = view.findViewById(R.id.c66);
        C89219l.m154716b(findViewById5, "");
        this.f99588b = (ViewGroup) findViewById5;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(AbstractC42670am.f99492G);
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            mo71308b((C67678d) serializable);
        }
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
        C89219l.m154716b(a, "");
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) a;
        this.f99576V = searchStateViewModel;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mStateViewModel");
        }
        searchStateViewModel.searchState.observe(this, new C42701j(this));
        ActivityC0945e activity2 = getActivity();
        if (activity2 != null) {
            this.f99567M = (SearchIntermediateViewModel) C1181ae.m3881a(activity2, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        }
        if (this.f99499D == null) {
            mo71349n().mo72881a();
        }
    }

    @AbstractC90264r
    public void onSearchAfterLogin(C41931j jVar) {
        C89219l.m154721d(jVar, "");
        if (jVar.f97810a && af_()) {
            DmtStatusView dmtStatusView = this.f99597o;
            if (dmtStatusView == null) {
                C89219l.m154710a("mStatusView");
            }
            if (!dmtStatusView.mo27391l()) {
                DmtStatusView dmtStatusView2 = this.f99597o;
                if (dmtStatusView2 == null) {
                    C89219l.m154710a("mStatusView");
                }
                if (!dmtStatusView2.mo27392m()) {
                    DmtStatusView dmtStatusView3 = this.f99597o;
                    if (dmtStatusView3 == null) {
                        C89219l.m154710a("mStatusView");
                    }
                    if (!dmtStatusView3.mo27393n()) {
                        return;
                    }
                }
            }
            DmtStatusView dmtStatusView4 = this.f99597o;
            if (dmtStatusView4 == null) {
                C89219l.m154710a("mStatusView");
            }
            dmtStatusView4.mo27382d();
            this.f99575U = true;
            mo72918a(false, false);
        }
    }

    /* renamed from: b */
    public void mo71308b(C67678d dVar) {
        String str;
        C89219l.m154721d(dVar, "");
        this.f99507r = dVar;
        String keyword = dVar.getKeyword();
        C89219l.m154716b(keyword, "");
        mo72872b(keyword);
        String searchFrom = dVar.getSearchFrom();
        C89219l.m154716b(searchFrom, "");
        mo72873c(searchFrom);
        this.f99498C = dVar.getNeedCorrect();
        String enterMethod = dVar.getEnterMethod();
        if (enterMethod == null || enterMethod.length() == 0) {
            str = dVar.getSearchFrom();
            C89219l.m154716b(str, "");
        } else {
            str = dVar.getEnterMethod();
            C89219l.m154716b(str, "");
        }
        mo72874d(str);
        if (C89219l.m154714a((Object) this.f99510u, (Object) "search_sug")) {
            this.f99496A = dVar.getSugType();
        }
        if (C80538hl.m139614a(dVar.getFromSearchSubtag())) {
            String fromSearchSubtag = dVar.getFromSearchSubtag();
            C89219l.m154716b(fromSearchSubtag, "");
            mo72877f(fromSearchSubtag);
        }
        if (C80538hl.m139614a(dVar.getPreSearchId())) {
            String preSearchId = dVar.getPreSearchId();
            C89219l.m154716b(preSearchId, "");
            mo72878g(preSearchId);
        }
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            ((SearchResultViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchResultViewModel.class)).f100264a.postValue(dVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: b_ */
    public final void mo72834b_(boolean z) {
        C67437b bVar;
        C33943c<Boolean> enableSearchFilter;
        C33943c<Boolean> enableSearchFilter2;
        C33943c<Boolean> enableSearchFilter3;
        SearchIntermediateViewModel searchIntermediateViewModel;
        C33943c<Boolean> showSearchFilterDot;
        mo71349n().mo72883a(z, getActivity(), this.f99497B, this.f99507r, this.f99500E);
        if (C41503ak.f96822a && mo71311r()) {
            C67678d dVar = this.f99507r;
            if (dVar != null) {
                bVar = dVar.getFilterOption();
            } else {
                bVar = null;
            }
            if (!(bVar != null || (searchIntermediateViewModel = this.f99567M) == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null)) {
                showSearchFilterDot.setValue(false);
            }
            if (!z) {
                SearchIntermediateViewModel searchIntermediateViewModel2 = this.f99567M;
                if (!(searchIntermediateViewModel2 == null || (enableSearchFilter = searchIntermediateViewModel2.getEnableSearchFilter()) == null)) {
                    enableSearchFilter.setValue(false);
                }
                this.f99500E = false;
            } else if (C42619b.m85133a(mo71349n().mo72884b())) {
                SearchIntermediateViewModel searchIntermediateViewModel3 = this.f99567M;
                if (!(searchIntermediateViewModel3 == null || (enableSearchFilter3 = searchIntermediateViewModel3.getEnableSearchFilter()) == null)) {
                    enableSearchFilter3.setValue(true);
                }
                this.f99500E = true;
            } else {
                SearchIntermediateViewModel searchIntermediateViewModel4 = this.f99567M;
                if (!(searchIntermediateViewModel4 == null || (enableSearchFilter2 = searchIntermediateViewModel4.getEnableSearchFilter()) == null)) {
                    enableSearchFilter2.setValue(false);
                }
                this.f99500E = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72912a(C17273d dVar) {
        C89219l.m154721d(dVar, "");
        mo72907L();
        if (mo72900A().f92274v) {
            mo72900A().mo67829d(false);
            mo72900A().notifyDataSetChanged();
        }
        mo72900A().mo67810f();
        DmtStatusView dmtStatusView = this.f99597o;
        if (dmtStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        C89219l.m154721d(dmtStatusView, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
        if (dVar.f41364w != EnumC42835a.EMPTY.getType() && dVar.f41360s) {
            View b = dmtStatusView.mo27380b(2);
            Objects.requireNonNull(b, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.IDmtDefaultView");
            ((AbstractC17278g) b).setStatus(dVar);
            dmtStatusView.mo27387h();
        } else {
            View b2 = dmtStatusView.mo27380b(1);
            if (b2 instanceof AbstractC17278g) {
                ((AbstractC17278g) b2).setStatus(dVar);
            }
            if (b2 instanceof C43042e) {
                ((C43042e) b2).setSearchStatusName(null);
            }
            dmtStatusView.mo27385g();
        }
        mo71344a_(false);
    }

    /* renamed from: a */
    public final void mo72914a(C41893a aVar) {
        C89219l.m154721d(aVar, "");
        this.f99574T = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public final void mo72828a(QueryCorrectInfo queryCorrectInfo) {
        C43037c cVar;
        if (af_()) {
            this.f99594l = queryCorrectInfo;
            if (queryCorrectInfo == null) {
                C43037c cVar2 = this.f99593k;
                if (cVar2 != null) {
                    cVar2.setVisibility(8);
                }
                mo72901B().mo71055b(this.f99593k);
                this.f99570P = false;
            } else if (mo71310o()) {
                mo72901B().mo71055b(this.f99593k);
            } else {
                if (this.f99593k == null) {
                    Context context = getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(context, "");
                    this.f99593k = new C43037c(context);
                }
                C43037c cVar3 = this.f99593k;
                if (cVar3 != null) {
                    cVar3.setVisibility(0);
                }
                List<View> a = mo72901B().mo71052a();
                C43037c cVar4 = this.f99593k;
                if (cVar4 == null) {
                    C89219l.m154715b();
                }
                if (!a.contains(cVar4)) {
                    mo72901B().mo71053a(0, this.f99593k);
                }
                C43037c cVar5 = this.f99593k;
                if (cVar5 == null) {
                    C89219l.m154715b();
                }
                cVar5.mo73231a(queryCorrectInfo, mo72879u());
                if (!mo71312s() && (cVar = this.f99593k) != null) {
                    cVar.setTopMargin((int) C80284by.m139183a(16));
                }
                m85241R();
                this.f99570P = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends D> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public void mo59517b(List<? extends D> list, boolean z) {
        if (af_()) {
            if (list == 0 || list.isEmpty()) {
                z = false;
            }
            mo72907L();
            if (!z) {
                mo72900A().ap_();
            } else {
                mo72900A().aq_();
            }
            mo72900A().mo62376b((List<D>) list);
        }
    }

    /* renamed from: a */
    public void mo71339a(int i, C67437b bVar) {
        C89378p<Integer, Long> value;
        Long l;
        MusicPlayHelper musicPlayHelper;
        C89378p<Integer, Long> value2;
        C67437b bVar2;
        this.f99508s = this.f99507r;
        Long l2 = null;
        if (bVar == null) {
            this.f99499D = null;
            mo71349n().mo72881a();
        }
        if (TextUtils.equals(C42465m.m84871c(this.f99497B), EnumC67453i.TOP.getTabName())) {
            C67592a.f151373f.onEventStart(this.f99507r);
        }
        C67678d dVar = this.f99507r;
        if (dVar != null && dVar.getIsFilterFromSchema()) {
            C67678d dVar2 = this.f99507r;
            if (dVar2 != null) {
                bVar2 = dVar2.getFilterOption();
            } else {
                bVar2 = null;
            }
            this.f99499D = bVar2;
            C67437b bVar3 = this.f99499D;
            if (bVar3 != null) {
                bVar3.setFromSchema(true);
            }
            C67678d dVar3 = this.f99507r;
            if (dVar3 != null) {
                dVar3.setIsFilterFromSchema(false);
            }
        }
        m85241R();
        MusicPlayHelper musicPlayHelper2 = this.f99580Z;
        if (!(musicPlayHelper2 == null || musicPlayHelper2.f97851b == null || musicPlayHelper2.f97850a.getValue() == null || (((value = musicPlayHelper2.f97850a.getValue()) == null || value.getFirst().intValue() != 2) && ((value2 = musicPlayHelper2.f97850a.getValue()) == null || value2.getFirst().intValue() != 1)))) {
            C89378p<Integer, Long> value3 = musicPlayHelper2.f97850a.getValue();
            if (value3 != null) {
                l = value3.getSecond();
            } else {
                l = null;
            }
            Music music = musicPlayHelper2.f97851b;
            if (music != null) {
                l2 = Long.valueOf(music.getId());
            }
            if (C89219l.m154714a(l, l2) && (musicPlayHelper = this.f99580Z) != null) {
                musicPlayHelper.mo71126a();
            }
        }
        C67678d dVar4 = this.f99507r;
        if (dVar4 != null) {
            dVar4.setFilterOption(bVar);
        }
        this.f99578X = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo71302a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        mo72905I();
        RecyclerView recyclerView = this.f99596n;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.setLayoutManager(mo72903D());
        mo71300m();
        mo72914a(new C41893a(mo72900A()));
        AbstractC39060f<D> A = mo72900A();
        RecyclerView recyclerView2 = this.f99596n;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        A.mo67820g(C0643b.m2378c(recyclerView2.getContext(), R.color.c5));
        mo72900A().mo67813a(this);
        RecyclerView recyclerView3 = this.f99596n;
        if (recyclerView3 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView3.setAdapter(mo72901B());
        RecyclerView recyclerView4 = this.f99596n;
        if (recyclerView4 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView4.setOverScrollMode(2);
        RecyclerView recyclerView5 = this.f99596n;
        if (recyclerView5 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        RecyclerView.AbstractC1356f itemAnimator = recyclerView5.getItemAnimator();
        if (itemAnimator == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(itemAnimator, "");
        itemAnimator.f4470l = 0;
        int i = Build.VERSION.SDK_INT;
        RecyclerView recyclerView6 = this.f99596n;
        if (recyclerView6 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        C89219l.m154721d(recyclerView6, "");
        recyclerView6.mo4405a(new C42700i(this));
        RecyclerView recyclerView7 = this.f99596n;
        if (recyclerView7 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView7.setClipToPadding(false);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fa, code lost:
        if (r1.equals("com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchMixFeedFragment") != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        if (r1.equals("com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment") != false) goto L_0x0084;
     */
    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return EnumC67634k.INSTANCE.getView(getContext(), R.layout.au3, viewGroup);
    }
}
