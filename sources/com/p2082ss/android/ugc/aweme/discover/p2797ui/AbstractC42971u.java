package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p2082ss.android.sdk.webview.C30244b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42203c;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42207e;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.container.C42284a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.mob.C42465m;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41503ak;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41926e;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41928g;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41934m;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42619b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.C42918b;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchResultViewModel;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.feedback.C67434a;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.model.SearchResultParamProvider;
import com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67439d;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67471ae;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67502av;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67579v;
import com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67603e;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67685a;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67694f;
import com.p2082ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80372ec;
import com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
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
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.u */
public abstract class AbstractC42971u extends AbstractC42670am implements AbstractC42635aa, AbstractC42637ac, AbstractC90252i, AbstractC90253j {

    /* renamed from: K */
    private long f100198K;

    /* renamed from: L */
    private SurveyViewModel f100199L;

    /* renamed from: M */
    private final AbstractC89244h f100200M = C80372ec.m139350a(new C42973b(this));

    /* renamed from: N */
    private SparseArray f100201N;

    /* renamed from: a */
    protected DoubleBallSwipeRefreshLayout f100202a;

    /* renamed from: b */
    public SearchIntermediateViewModel f100203b;

    /* renamed from: c */
    public C67678d f100204c;

    /* renamed from: d */
    public boolean f100205d = true;

    /* renamed from: e */
    protected SearchStateViewModel f100206e;

    /* renamed from: j */
    public String f100207j;

    /* renamed from: k */
    public boolean f100208k = true;

    /* renamed from: l */
    public SearchEnterViewModel f100209l;

    /* renamed from: m */
    protected AbstractC42208f f100210m;

    /* renamed from: n */
    public ViewGroup f100211n;

    /* renamed from: o */
    private boolean f100212o;

    static {
        Covode.recordClassIndex(51103);
    }

    /* renamed from: m */
    private final C42673an mo73179m() {
        return (C42673an) this.f100200M.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: a */
    public View mo71296a(int i) {
        if (this.f100201N == null) {
            this.f100201N = new SparseArray();
        }
        View view = (View) this.f100201N.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f100201N.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public final void mo71303a(C42345d dVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public final void mo71304a(C42345d dVar, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public final void mo72828a(QueryCorrectInfo queryCorrectInfo) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public final void mo72829a(SearchApiResult searchApiResult) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public final void mo72830a(SearchPreventSuicide searchPreventSuicide, GlobalDoodleConfig globalDoodleConfig) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: b */
    public final void mo72833b(SearchApiResult searchApiResult) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    public void bb_() {
        SparseArray sparseArray = this.f100201N;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(295, new RunnableC90250g(AbstractC42971u.class, "onFeedbackSubmitSuccess", C42918b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(378, new RunnableC90250g(AbstractC42971u.class, "hideLoadingBall", C41928g.class, ThreadMode.MAIN, 0, false));
        hashMap.put(379, new RunnableC90250g(AbstractC42971u.class, "recordViewDrawEnd", C41926e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(380, new RunnableC90250g(AbstractC42971u.class, "setRequestSuccessConfig", C41934m.class, ThreadMode.MAIN, 0, false));
        hashMap.put(296, new RunnableC90250g(AbstractC42971u.class, "onWebViewActivityCloseEvent", C30244b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: l */
    public boolean mo73163l() {
        return true;
    }

    @AbstractC90264r
    public final void onWebViewActivityCloseEvent(C30244b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    public final C67678d aX_() {
        return this.f99508s;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.u$e */
    static final class RunnableC42977e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C67603e f100218a;

        static {
            Covode.recordClassIndex(51109);
        }

        RunnableC42977e(C67603e eVar) {
            this.f100218a = eVar;
        }

        public final void run() {
            this.f100218a.mo106592g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    public final AbstractC57066a.AbstractC57067a aY_() {
        return mo72880v();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: e */
    public final C42673an mo72875e() {
        return mo73179m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final SearchStateViewModel mo73156b() {
        SearchStateViewModel searchStateViewModel = this.f100206e;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mStateViewModel");
        }
        return searchStateViewModel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AbstractC42208f mo73158d() {
        AbstractC42208f fVar = this.f100210m;
        if (fVar == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        return fVar;
    }

    /* renamed from: g */
    public final void mo73159g() {
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f100202a;
        if (doubleBallSwipeRefreshLayout == null) {
            C89219l.m154710a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setRefreshing(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo73160h() {
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f100202a;
        if (doubleBallSwipeRefreshLayout == null) {
            C89219l.m154710a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setRefreshing(true);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f100212o) {
            m85771n();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f100198K = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.u$a */
    public static final class RunnableC42972a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42207e f100213a;

        static {
            Covode.recordClassIndex(51104);
        }

        RunnableC42972a(C42207e eVar) {
            this.f100213a = eVar;
        }

        public final void run() {
            RecyclerView.ViewHolder a = this.f100213a.getRecyclerView().mo4392a(0, false);
            if (a != null && (a instanceof View$OnAttachStateChangeListenerC42258a)) {
                View view = a.itemView;
                C89219l.m154716b(view, "");
                view.getLayoutParams().height = -1;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.u$b */
    static final class C42973b extends AbstractC89220m implements AbstractC89171a<C42673an> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42971u f100214a;

        static {
            Covode.recordClassIndex(51105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42973b(AbstractC42971u uVar) {
            super(0);
            this.f100214a = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42673an invoke() {
            C42673an anVar = new C42673an();
            anVar.mo72882a(C67458j.m119528a(this.f100214a.f99509t), this.f100214a.getActivity());
            anVar.f99519d = new AbstractC67439d(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u.C42973b.C429741 */

                /* renamed from: a */
                final /* synthetic */ C42973b f100215a;

                static {
                    Covode.recordClassIndex(51106);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f100215a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67439d
                /* renamed from: a */
                public final void mo72931a(C67437b bVar) {
                    C33943c<Boolean> showSearchFilterDot;
                    boolean z;
                    this.f100215a.f100214a.mo73153a(1, bVar);
                    SearchIntermediateViewModel searchIntermediateViewModel = this.f100215a.f100214a.f100203b;
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
                    this.f100215a.f100214a.mo72873c(str);
                    this.f100215a.f100214a.f99499D = bVar;
                }
            };
            return anVar;
        }
    }

    /* renamed from: p */
    private void m85773p() {
        if (!TextUtils.isEmpty(mo72879u())) {
            C1731i.m5640b(new CallableC42975c(this), C1731i.f5562a);
        }
    }

    /* renamed from: i */
    public final void mo73162i() {
        SearchStateViewModel searchStateViewModel = this.f100206e;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mStateViewModel");
        }
        searchStateViewModel.setIsRefreshingData(false);
        new C67579v("query_sign").mo96792f();
        C42452d.f98930b = false;
        C42452d.f98939k = this.f99497B;
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.u$c */
    public static final class CallableC42975c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC42971u f100216a;

        static {
            Covode.recordClassIndex(51107);
        }

        CallableC42975c(AbstractC42971u uVar) {
            this.f100216a = uVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key_word", this.f100216a.mo72879u());
                if (C89219l.m154714a((Object) this.f100216a.f99510u, (Object) "search_history")) {
                    this.f100216a.mo72876e("search_history");
                } else if (C89219l.m154714a((Object) this.f100216a.f99510u, (Object) "search_sug")) {
                    this.f100216a.mo72876e("search_sug");
                } else {
                    this.f100216a.mo72876e("normal_search");
                }
                jSONObject.put("enter_from", this.f100216a.f99512w);
            } catch (JSONException unused) {
            }
            C39162r.onEvent(MobClick.obtain().setEventName("search").setLabelName(this.f100216a.mo71298c()).setJsonObject(jSONObject));
            return C89391z.f203057a;
        }
    }

    /* renamed from: n */
    private final void m85771n() {
        Integer num;
        String str;
        C67469ad b;
        String str2;
        long uptimeMillis = SystemClock.uptimeMillis() - this.f100198K;
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

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        if (r3.equals(r4) != false) goto L_0x0047;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m85772o() {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u.m85772o():java.lang.String");
    }

    /* renamed from: a */
    public final void mo73154a(GlobalDoodleConfig globalDoodleConfig) {
        SurveyViewModel surveyViewModel;
        NextLiveData<SearchSurveyConfig> nextLiveData;
        if (globalDoodleConfig != null) {
            SearchSurveyConfig surveyConfig = globalDoodleConfig.getSurveyConfig();
            if (!(surveyConfig == null || (surveyViewModel = this.f100199L) == null || (nextLiveData = surveyViewModel.f151839b) == null)) {
                nextLiveData.postValue(surveyConfig);
            }
            boolean z = true;
            if (globalDoodleConfig.getDisplayFilterBar() != 1) {
                z = false;
            }
            mo72834b_(z);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void setRequestSuccessConfig(C41934m mVar) {
        C89219l.m154721d(mVar, "");
        mo73154a(mVar.f97813a);
        mo73155a(mVar.f97814b);
        mo73162i();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.u$d */
    static final class C42976d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC42971u f100217a;

        static {
            Covode.recordClassIndex(51108);
        }

        C42976d(AbstractC42971u uVar) {
            this.f100217a = uVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null) {
                return;
            }
            if (!this.f100217a.f100208k && num.intValue() == 2) {
                this.f100217a.f100208k = true;
                if (this.f100217a.f100205d) {
                    this.f100217a.mo73157b(false);
                }
            } else if (num.intValue() != 2) {
                this.f100217a.f100208k = false;
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void hideLoadingBall(C41928g gVar) {
        C89219l.m154721d(gVar, "");
        if ((C89219l.m154714a((Object) gVar.f97807a, (Object) "vertical-sounds") || C89219l.m154714a((Object) gVar.f97807a, (Object) "vertical-shopping")) && af_()) {
            mo73159g();
        }
    }

    @AbstractC90264r
    public final void onFeedbackSubmitSuccess(C42918b bVar) {
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        C89219l.m154721d(bVar, "");
        SurveyViewModel surveyViewModel = this.f100199L;
        if (!(surveyViewModel == null || (nextLiveData2 = surveyViewModel.f151838a) == null)) {
            Boolean.valueOf(nextLiveData2.hasObservers());
        }
        SurveyViewModel surveyViewModel2 = this.f100199L;
        if (surveyViewModel2 != null && (nextLiveData = surveyViewModel2.f151838a) != null) {
            nextLiveData.postValue(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        mo73157b(true);
        if (z) {
            C42452d.f98940l = this.f99497B;
            C42452d.f98932d = false;
            C42452d.f98938j = false;
            C67678d dVar = this.f99507r;
            if (dVar != null) {
                dVar.setIndex(this.f99497B);
            }
            this.f100198K = SystemClock.uptimeMillis();
        }
        if (this.f100212o && !z) {
            m85771n();
        }
        this.f100212o = z;
    }

    /* renamed from: a */
    private void mo60375a(String str) {
        int i;
        String str2;
        String str3;
        ActivityC0945e activity = getActivity();
        int i2 = 0;
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        AbstractC67567q a = C67486am.m119565a(i);
        if (a == null) {
            a = new C67471ae();
            ActivityC0945e activity2 = getActivity();
            if (activity2 != null) {
                i2 = activity2.hashCode();
            }
            C67486am.m119566a(i2, a);
        }
        int i3 = this.f99497B;
        C67469ad adVar = new C67469ad();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        adVar.mo106422a(str2);
        adVar.mo106423b(mo72879u());
        a.mo106428a(i3, adVar);
        C67685a aVar = this.f99505p;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        aVar.mo106782a(str3);
        aVar.mo106783b(mo72879u());
        C67694f fVar = this.f99506q;
        if (str == null) {
            str = "";
        }
        fVar.mo106797a(str);
        fVar.mo106798b(mo72879u());
    }

    /* renamed from: b */
    private void m85769b(C67678d dVar) {
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
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            ((SearchResultViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchResultViewModel.class)).f100264a.postValue(dVar);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(AbstractC42670am.f99492G);
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            m85769b((C67678d) serializable);
        }
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
        C89219l.m154716b(a, "");
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) a;
        this.f100206e = searchStateViewModel;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mStateViewModel");
        }
        searchStateViewModel.searchState.observe(this, new C42976d(this));
        ActivityC0945e activity2 = getActivity();
        if (activity2 != null) {
            this.f100203b = (SearchIntermediateViewModel) C1181ae.m3881a(activity2, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        }
        if (this.f99499D == null) {
            mo73179m().mo72881a();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void recordViewDrawEnd(C41926e eVar) {
        C67469ad b;
        String str;
        String str2 = "";
        C89219l.m154721d(eVar, str2);
        AbstractC67567q a = C67486am.m119564a();
        if (!(a == null || (b = a.mo106429b(this.f99497B)) == null || (str = b.f151151a) == null)) {
            str2 = str;
        }
        C67603e a2 = C67605g.m119730a(this.f99507r).mo106583b(eVar.f97800d).mo106577a(eVar.f97798b).mo106586c(eVar.f97799c).mo106580a(str2);
        a2.f151423c = eVar.f97797a;
        a2.f151424d = eVar.f97801e;
        a2.f151446z = true;
        View view = getView();
        if (view != null) {
            view.post(new RunnableC42977e(a2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r1, (java.lang.Object) "guide_search_cancel") != false) goto L_0x0053;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73157b(boolean r4) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u.mo73157b(boolean):void");
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
        mo73179m().mo72883a(z, getActivity(), this.f99497B, this.f99507r, this.f99500E);
        if (C41503ak.f96822a && mo71311r()) {
            C67678d dVar = this.f99507r;
            if (dVar != null) {
                bVar = dVar.getFilterOption();
            } else {
                bVar = null;
            }
            if (!(bVar != null || (searchIntermediateViewModel = this.f100203b) == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null)) {
                showSearchFilterDot.setValue(false);
            }
            if (!z) {
                SearchIntermediateViewModel searchIntermediateViewModel2 = this.f100203b;
                if (!(searchIntermediateViewModel2 == null || (enableSearchFilter = searchIntermediateViewModel2.getEnableSearchFilter()) == null)) {
                    enableSearchFilter.setValue(false);
                }
                this.f99500E = false;
            } else if (C42619b.m85133a(mo73179m().mo72884b())) {
                SearchIntermediateViewModel searchIntermediateViewModel3 = this.f100203b;
                if (!(searchIntermediateViewModel3 == null || (enableSearchFilter3 = searchIntermediateViewModel3.getEnableSearchFilter()) == null)) {
                    enableSearchFilter3.setValue(true);
                }
                this.f99500E = true;
            } else {
                SearchIntermediateViewModel searchIntermediateViewModel4 = this.f100203b;
                if (!(searchIntermediateViewModel4 == null || (enableSearchFilter2 = searchIntermediateViewModel4.getEnableSearchFilter()) == null)) {
                    enableSearchFilter2.setValue(false);
                }
                this.f99500E = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo73155a(LogPbBean logPbBean) {
        String imprId;
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            mo60375a(imprId);
            C48027ac.C48028a.f111257a.mo80056a(imprId, logPbBean);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: a */
    public final void mo71343a(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        this.f100204c = dVar;
        super.mo71343a(dVar);
        this.f100205d = true;
        if (!af_()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putSerializable(AbstractC42670am.f99492G, dVar);
                return;
            }
            return;
        }
        m85769b(dVar);
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        SearchResultParamProvider.C67672a.m119824a(context, dVar);
        mo73157b(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC42208f fVar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.dhb);
        C89219l.m154716b(findViewById, "");
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) findViewById;
        this.f100202a = doubleBallSwipeRefreshLayout;
        if (doubleBallSwipeRefreshLayout == null) {
            C89219l.m154710a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setEnabled(false);
        int i = Build.VERSION.SDK_INT;
        if (mo73163l()) {
            fVar = new C42284a(this);
        } else {
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            C42207e eVar = new C42207e(context);
            C42203c containerAdapter = eVar.getContainerAdapter();
            fVar = eVar;
            if (containerAdapter != null) {
                containerAdapter.f98370c = mo72879u();
                fVar = eVar;
            }
        }
        this.f100210m = fVar;
        ViewGroup viewGroup = this.f100211n;
        if (viewGroup == null) {
            C89219l.m154710a("mDynamicFragment");
        }
        fVar.mo71400a(viewGroup, new ViewGroup.LayoutParams(-1, -1));
        ViewGroup viewGroup2 = this.f100211n;
        if (viewGroup2 == null) {
            C89219l.m154710a("mDynamicFragment");
        }
        viewGroup2.setVisibility(0);
        if (this.f99507r != null) {
            C67678d dVar = this.f99507r;
            if (dVar == null) {
                C89219l.m154715b();
            }
            mo71343a(dVar);
        }
        EventBus.m156966a(EventBus.m156962a(), this);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            this.f100209l = (SearchEnterViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchEnterViewModel.class);
            this.f100199L = (SurveyViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SurveyViewModel.class);
        }
        C67434a.m119467a(getActivity());
        mo72874d(m85772o());
        AbstractC42208f fVar2 = this.f100210m;
        if (fVar2 == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        mo72826a(fVar2);
        if (!mo73163l()) {
            AbstractC42208f fVar3 = this.f100210m;
            if (fVar3 == null) {
                C89219l.m154710a("dynamicViewsContainer");
            }
            Objects.requireNonNull(fVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.lynx.container.DynamicViewsContainer");
            C42207e eVar2 = (C42207e) fVar3;
            RecyclerView recyclerView = eVar2.getRecyclerView();
            getContext();
            recyclerView.setLayoutManager(new DynamicSearchFragment$handleTouchActionForBullet$1(this));
            eVar2.post(new RunnableC42972a(eVar2));
        }
        mo73160h();
    }

    /* renamed from: a */
    public void mo73153a(int i, C67437b bVar) {
        C67674b bVar2;
        int i2;
        String str;
        String str2;
        C67437b filterOption;
        C67437b filterOption2;
        C67437b filterOption3;
        C67437b bVar3;
        this.f99508s = this.f99507r;
        String str3 = null;
        if (bVar == null) {
            this.f99499D = null;
            mo73179m().mo72881a();
        }
        C67678d dVar = this.f99507r;
        int i3 = 0;
        int i4 = 1;
        if (dVar != null && dVar.getIsFilterFromSchema()) {
            C67678d dVar2 = this.f99507r;
            if (dVar2 != null) {
                bVar3 = dVar2.getFilterOption();
            } else {
                bVar3 = null;
            }
            this.f99499D = bVar3;
            C67437b bVar4 = this.f99499D;
            if (bVar4 != null) {
                bVar4.setFromSchema(true);
            }
            C67678d dVar3 = this.f99507r;
            if (dVar3 != null) {
                dVar3.setIsFilterFromSchema(false);
            }
        }
        C67678d dVar4 = this.f99507r;
        if (dVar4 != null) {
            dVar4.setFilterOption(bVar);
        }
        SearchStateViewModel searchStateViewModel = this.f100206e;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mStateViewModel");
        }
        searchStateViewModel.setIsRefreshingData(true);
        mo72874d(m85772o());
        SearchEnterViewModel searchEnterViewModel = this.f100209l;
        if (searchEnterViewModel != null) {
            bVar2 = searchEnterViewModel.f100248a;
        } else {
            bVar2 = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("keyword", mo72879u());
        jSONObject.put("search_source", this.f99511v);
        jSONObject.put("query_correct_type", this.f99498C);
        C67678d dVar5 = this.f99507r;
        if (dVar5 == null || (filterOption3 = dVar5.getFilterOption()) == null || filterOption3.isDefaultOption()) {
            i4 = 0;
        }
        jSONObject.put("is_filter_search", i4);
        C67678d dVar6 = this.f99507r;
        if (dVar6 == null || (filterOption2 = dVar6.getFilterOption()) == null) {
            i2 = 0;
        } else {
            i2 = filterOption2.getFilterBy();
        }
        jSONObject.put("filter_by", i2);
        C67678d dVar7 = this.f99507r;
        if (!(dVar7 == null || (filterOption = dVar7.getFilterOption()) == null)) {
            i3 = filterOption.getSortType();
        }
        jSONObject.put("sort_type", i3);
        jSONObject.put("search_context", C42047s.C42048a.m84150a().mo71202a());
        if (bVar2 != null) {
            str = bVar2.getEnterSearchFrom();
        } else {
            str = null;
        }
        jSONObject.put("enter_from", str);
        if (bVar2 != null) {
            str2 = bVar2.getGroupId();
        } else {
            str2 = null;
        }
        jSONObject.put("group_id", str2);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        jSONObject.put("current_uid", g.getCurUserId());
        if (C42452d.f98939k != this.f99497B) {
            jSONObject.put("from_search_subtab", C42465m.m84871c(C42452d.f98939k));
        }
        jSONObject.put("enter_method", this.f99511v);
        jSONObject.put("last_search_id", this.f100207j);
        C67678d dVar8 = this.f99507r;
        if (dVar8 != null) {
            str3 = dVar8.getSugType();
        }
        jSONObject.put("sug_type", str3);
        AbstractC42208f fVar = this.f100210m;
        if (fVar == null) {
            C89219l.m154710a("dynamicViewsContainer");
        } else {
            fVar.mo71404a("changeSearchParams", jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View view = EnumC67634k.INSTANCE.getView(getContext(), R.layout.au3, viewGroup);
        View findViewById = view.findViewById(R.id.aqg);
        C89219l.m154716b(findViewById, "");
        this.f100211n = (ViewGroup) findViewById;
        return view;
    }
}
