package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41690d;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41702g;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41708l;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.C42193a;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2785b.C42281e;
import com.p2082ss.android.ugc.aweme.discover.mob.C42465m;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41485a;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41500ah;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41502aj;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41504al;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41527d;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42075c;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42110p;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58186a;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import com.p2082ss.android.ugc.aweme.search.p3687e.C67375d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67505ax;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67519bd;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67526bh;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67554j;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import com.p2082ss.android.ugc.aweme.search.p3701o.C67695a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80372ec;
import com.p2082ss.android.ugc.aweme.utils.C80512gt;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.EventBus;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a */
public abstract class AbstractC42584a extends AbstractC34586a implements AbstractC41953a, AbstractC42075c.AbstractC42076a, AbstractC58186a.AbstractC58187a {

    /* renamed from: m */
    public static final C42585a f99345m = new C42585a((byte) 0);

    /* renamed from: a */
    public C41893a f99346a;

    /* renamed from: b */
    public RecyclerView f99347b;

    /* renamed from: c */
    public ViewGroup f99348c;

    /* renamed from: d */
    protected SearchIntermediateViewModel f99349d;

    /* renamed from: e */
    protected SearchStateViewModel f99350e;

    /* renamed from: j */
    public int f99351j;

    /* renamed from: k */
    public SearchSugMobHelper f99352k;

    /* renamed from: l */
    public int f99353l;

    /* renamed from: n */
    private final AbstractC89244h f99354n = C80372ec.m139350a(new C42596j(this));

    /* renamed from: o */
    private C42110p f99355o;

    /* renamed from: p */
    private SearchKeywordPresenter f99356p;

    /* renamed from: q */
    private SugKeywordPresenter f99357q;

    /* renamed from: r */
    private final AbstractC89244h f99358r = C80372ec.m139350a(new C42594h(this));

    /* renamed from: s */
    private final AbstractC89244h f99359s = C80372ec.m139350a(C42595i.f99374a);

    /* renamed from: t */
    private Integer f99360t;

    /* renamed from: u */
    private boolean f99361u;

    /* renamed from: v */
    private SparseArray f99362v;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$b */
    public static final class C42586b extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        public static final C42587a f99363a = new C42587a((byte) 0);

        /* renamed from: b */
        private final Drawable f99364b;

        static {
            Covode.recordClassIndex(50690);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$b$a */
        public static final class C42587a {
            static {
                Covode.recordClassIndex(50691);
            }

            private C42587a() {
            }

            public /* synthetic */ C42587a(byte b) {
                this();
            }
        }

        public C42586b(Drawable drawable) {
            C89219l.m154721d(drawable, "");
            this.f99364b = drawable;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(canvas, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            if (recyclerView.getChildCount() >= 2) {
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int m = linearLayoutManager.mo4373m();
                recyclerView.mo4451f(m);
                int k = (m - linearLayoutManager.mo4371k()) - 1;
                if (k >= 0) {
                    recyclerView.getPaddingLeft();
                    C13628n.m24520b(recyclerView.getContext(), 16.0f);
                    recyclerView.getWidth();
                    recyclerView.getPaddingRight();
                    C13628n.m24520b(recyclerView.getContext(), 16.0f);
                    View childAt = recyclerView.getChildAt(k);
                    C89219l.m154716b(childAt, "");
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    childAt.getBottom();
                    int i = ((RecyclerView.C1367j) layoutParams).bottomMargin;
                    this.f99364b.getIntrinsicHeight();
                    this.f99364b.draw(canvas);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            rect.set(0, 0, 0, this.f99364b.getIntrinsicHeight());
        }
    }

    static {
        Covode.recordClassIndex(50688);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public boolean mo61043H() {
        return true;
    }

    /* renamed from: g */
    public final C41690d mo72785g() {
        return (C41690d) this.f99354n.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final ISearchHistoryManager mo72788j() {
        return (ISearchHistoryManager) this.f99358r.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final CopyOnWriteArrayList<SearchHistory> mo72789k() {
        return (CopyOnWriteArrayList) this.f99359s.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo72802x();
    }

    /* renamed from: x */
    public void mo72802x() {
        SparseArray sparseArray = this.f99362v;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$a */
    public static final class C42585a {
        static {
            Covode.recordClassIndex(50689);
        }

        private C42585a() {
        }

        public /* synthetic */ C42585a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$e */
    public static final class C42590e extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(50694);
        }

        C42590e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            KeyboardUtils.m70897c(recyclerView);
        }
    }

    /* renamed from: a */
    public final void mo72781a(String str, String str2, String str3) {
        SmartRouter.buildRoute(getContext(), "aweme://user/profile/").withParam("sec_user_id", str).withParam("uid", str2).withParam("enter_from", "search_most_visited").withCallback(new C42591f(this, str3)).open(1, new C42593g(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$i */
    static final class C42595i extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArrayList<SearchHistory>> {

        /* renamed from: a */
        public static final C42595i f99374a = new C42595i();

        static {
            Covode.recordClassIndex(50699);
        }

        C42595i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArrayList<SearchHistory> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a
    /* renamed from: a */
    public int mo71102a() {
        return SearchHistory.toHistoryType(Integer.MIN_VALUE);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$d */
    public static final class C42589d implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99368a;

        static {
            Covode.recordClassIndex(50693);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f99368a.mo72799u());
        }

        C42589d(AbstractC42584a aVar) {
            this.f99368a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$h */
    static final class C42594h extends AbstractC89220m implements AbstractC89171a<ISearchHistoryManager> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99373a;

        static {
            Covode.recordClassIndex(50698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42594h(AbstractC42584a aVar) {
            super(0);
            this.f99373a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchHistoryManager invoke() {
            return SearchHistoryManager.inst(this.f99373a.mo72796r());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$j */
    static final class C42596j extends AbstractC89220m implements AbstractC89171a<C41690d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99375a;

        static {
            Covode.recordClassIndex(50700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42596j(AbstractC42584a aVar) {
            super(0);
            this.f99375a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41690d invoke() {
            return new C41690d(this.f99375a.getActivity());
        }
    }

    /* renamed from: y */
    private final String mo72939y() {
        String a;
        SugKeywordPresenter sugKeywordPresenter = this.f99357q;
        if (sugKeywordPresenter == null || (a = sugKeywordPresenter.mo94223a()) == null) {
            return "";
        }
        return a;
    }

    /* renamed from: d */
    public final RecyclerView mo72783d() {
        RecyclerView recyclerView = this.f99347b;
        if (recyclerView == null) {
            C89219l.m154710a("mListView");
        }
        return recyclerView;
    }

    /* renamed from: e */
    public final ViewGroup mo72784e() {
        ViewGroup viewGroup = this.f99348c;
        if (viewGroup == null) {
            C89219l.m154710a("mRNFragment");
        }
        return viewGroup;
    }

    /* renamed from: h */
    public final SearchIntermediateViewModel mo72786h() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99349d;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        return searchIntermediateViewModel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final SearchStateViewModel mo72787i() {
        SearchStateViewModel searchStateViewModel = this.f99350e;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mSearchStateViewModel");
        }
        return searchStateViewModel;
    }

    /* renamed from: n */
    public void mo72792n() {
        C42110p pVar = new C42110p();
        this.f99355o = pVar;
        pVar.mo67839a_(this);
    }

    /* renamed from: t */
    public final String mo72798t() {
        return C42465m.m84870b(mo72799u());
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$f */
    public static final class C42591f extends AbsOpenResultCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99369a;

        /* renamed from: b */
        final /* synthetic */ String f99370b;

        static {
            Covode.recordClassIndex(50695);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$f$a */
        static final class RunnableC42592a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42591f f99371a;

            static {
                Covode.recordClassIndex(50696);
            }

            RunnableC42592a(C42591f fVar) {
                this.f99371a = fVar;
            }

            public final void run() {
                this.f99371a.f99369a.mo72788j().recordSearchHistory(new SearchHistory(this.f99371a.f99370b, 0));
            }
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onSuccess(Intent intent) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC42592a(this), 500);
            this.f99369a.mo72786h();
            this.f99369a.mo72787i().setIsLeavingSearch(true);
        }

        C42591f(AbstractC42584a aVar, String str) {
            this.f99369a = aVar;
            this.f99370b = str;
        }
    }

    /* renamed from: m */
    public void mo72791m() {
        mo72785g().f97250e = this;
        mo72785g().f97249d = mo72796r();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (mo61043H()) {
            EventBus a = EventBus.m156962a();
            if (!a.mo145393a(this)) {
                EventBus.m156966a(a, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final List<SearchHistory> mo72797s() {
        List<SearchHistory> searchHistoryByType = mo72788j().getSearchHistoryByType(SearchHistory.toHistoryType(Integer.MIN_VALUE));
        C89219l.m154716b(searchHistoryByType, "");
        return searchHistoryByType;
    }

    /* renamed from: u */
    public final int mo72799u() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99349d;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        Integer value = searchIntermediateViewModel.getSearchTabIndex().getValue();
        if (value != null) {
            return value.intValue();
        }
        return -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$c */
    static final class C42588c extends AbstractC89220m implements AbstractC89171a<List<C67679e>> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f99365a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f99366b;

        /* renamed from: c */
        final /* synthetic */ SearchSugResponse f99367c;

        static {
            Covode.recordClassIndex(50692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42588c(ArrayList arrayList, ArrayList arrayList2, SearchSugResponse searchSugResponse) {
            super(0);
            this.f99365a = arrayList;
            this.f99366b = arrayList2;
            this.f99367c = searchSugResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C67679e> invoke() {
            ArrayList arrayList = new ArrayList();
            if (!this.f99365a.isEmpty()) {
                arrayList.addAll(this.f99366b);
                C67679e eVar = new C67679e();
                eVar.f151673h = 5;
                C89219l.m154716b(eVar, "");
                arrayList.add(eVar);
                arrayList.addAll(this.f99365a);
            } else if (C41500ah.f96815b) {
                List<C67679e> list = this.f99367c.sugList;
                C89219l.m154716b(list, "");
                arrayList.addAll(list);
            } else {
                arrayList.addAll(this.f99366b);
            }
            return arrayList;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42075c.AbstractC42076a
    public final void be_() {
        if (getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            if (!activity.isFinishing()) {
                new C79459a(getContext()).mo123050a(R.string.dck).mo123053a();
            }
        }
    }

    /* renamed from: l */
    public final boolean mo72790l() {
        if (((C41504al.f96824a || C41502aj.f96820a) && C42776bk.m85481a(getActivity())) || SearchEnterViewModel.C42997a.m85830a(getActivity()).mo73184a()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f99351j != 0) {
            RecyclerView recyclerView = this.f99347b;
            if (recyclerView == null) {
                C89219l.m154710a("mListView");
            }
            if (recyclerView.getAdapter() instanceof C41690d) {
                RecyclerView recyclerView2 = this.f99347b;
                if (recyclerView2 == null) {
                    C89219l.m154710a("mListView");
                }
                RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.sug.SearchSugAdapter");
                if (adapter.getItemCount() > 0) {
                    mo72800v();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (mo61043H()) {
            EventBus a = EventBus.m156962a();
            if (a.mo145393a(this)) {
                a.mo145395b(this);
            }
        }
        SearchStateViewModel searchStateViewModel = this.f99350e;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mSearchStateViewModel");
        }
        searchStateViewModel.setSearchPageVisible(false);
        SearchStateViewModel searchStateViewModel2 = this.f99350e;
        if (searchStateViewModel2 == null) {
            C89219l.m154710a("mSearchStateViewModel");
        }
        searchStateViewModel2.setIsLeavingSearch(false);
    }

    /* renamed from: p */
    public void mo72794p() {
        this.f99351j = 1;
        mo72789k().clear();
        mo72785g().mo70888a();
        mo72789k().addAll(mo72797s());
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99349d;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        if (true ^ searchIntermediateViewModel.backFromSearchResult) {
            C67375d.f150947a.mo106291b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final String mo72796r() {
        String enterSearchFrom;
        C67674b bVar = SearchEnterViewModel.C42997a.m85830a(getActivity()).f100248a;
        if (bVar == null || TextUtils.isEmpty(bVar.getEnterSearchFrom()) || (enterSearchFrom = bVar.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    /* renamed from: v */
    public final void mo72800v() {
        ((C67505ax) new C67505ax().mo106488q("show")).mo106443r(mo72939y()).mo106483c(C48027ac.C48028a.f111257a.mo80055a(mo72785g().f97247b)).mo106486f(C42465m.m84870b(mo72799u())).mo96792f();
    }

    /* renamed from: w */
    public final String mo72801w() {
        Object obtainLogData = SearchEnterViewModel.C42997a.m85830a(getActivity()).mo73185b().obtainLogData("search_position");
        if (obtainLogData != null) {
            return obtainLogData.toString();
        }
        String a = C42465m.m84869a(mo72799u());
        if (TextUtils.isEmpty(a)) {
            return mo72796r();
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a
    public final void bf_() {
        String str;
        C41690d g = mo72785g();
        String y = mo72939y();
        String str2 = null;
        if (g.f97246a != null && y.equals(g.f97253h)) {
            for (C67679e eVar : g.f97246a) {
                C67684i iVar = eVar.f151672g;
                if (iVar != null && iVar.matchQuery()) {
                    SearchSugMobHelper searchSugMobHelper = this.f99352k;
                    if (searchSugMobHelper != null) {
                        C89219l.m154721d(this, "");
                        C89219l.m154721d(eVar, "");
                        if (C67446h.f151111a.mo106207a((Activity) getActivity())) {
                            str = C42465m.m84869a(mo72799u());
                        } else {
                            str = "discovery";
                        }
                        C67519bd bdVar = new C67519bd();
                        Word word = eVar.f151671f;
                        C67530bj w = bdVar.mo106471d(word != null ? Integer.valueOf(word.getWordPosition()) : null).mo106474v("sug").mo106476x(searchSugMobHelper.f98978b).mo106475w(eVar.f151667b);
                        LogPbBean logPbBean = searchSugMobHelper.f98977a;
                        C67530bj bjVar = (C67530bj) w.mo106484d(logPbBean != null ? logPbBean.getImprId() : null);
                        RecommendWordMob recommendWordMob = searchSugMobHelper.f98980d;
                        C67530bj z = bjVar.mo106478z(recommendWordMob != null ? recommendWordMob.getQueryId() : null);
                        Word word2 = eVar.f151671f;
                        if (word2 != null) {
                            str2 = word2.getId();
                        }
                        ((C67530bj) z.mo106453i(str2)).mo106477y(str).mo96792f();
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public boolean mo72793o() {
        Context context;
        if (!af_() || !getUserVisibleHint()) {
            return false;
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99349d;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        Integer value = searchIntermediateViewModel.getIntermediateState().getValue();
        if (value == null) {
            return false;
        }
        if (value.intValue() == 1) {
            mo72794p();
        } else if (value.intValue() == 2) {
            mo72795q();
        } else if (value.intValue() == 0) {
            this.f99351j = 0;
        }
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f99349d;
        if (searchIntermediateViewModel2 == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        Integer value2 = searchIntermediateViewModel2.getIntermediateState().getValue();
        if (value2 != null && ((value2.intValue() == 1 || value2.intValue() == 2) && (context = getContext()) != null)) {
            C89219l.m154716b(context, "");
            C89219l.m154721d(context, "");
            if (C16048b.m29633a().mo25421a(true, "preload_without_forecast", false)) {
                String a = SettingsManager.m29616a().mo25398a("search_user_lynx_card_schema", "");
                C89219l.m154716b(a, "");
                if (C80537hk.m139613a(a) && !C42193a.m84455a(a)) {
                    Looper.myQueue().addIdleHandler(new C42281e.C42282a(context, a));
                }
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$p */
    static final class CallableC42602p<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99381a;

        /* renamed from: b */
        final /* synthetic */ SearchSugResponse f99382b;

        static {
            Covode.recordClassIndex(50706);
        }

        CallableC42602p(AbstractC42584a aVar, SearchSugResponse searchSugResponse) {
            this.f99381a = aVar;
            this.f99382b = searchSugResponse;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<C67679e> list;
            SearchSugResponse searchSugResponse = this.f99382b;
            if (!C41485a.m83438a(searchSugResponse.requestSource)) {
                list = searchSugResponse.sugList;
                C89219l.m154716b(list, "");
            } else {
                int a = C41527d.m83465a();
                int b = C41527d.m83466b();
                ArrayList arrayList = new ArrayList(a);
                ArrayList arrayList2 = new ArrayList(b);
                C42588c cVar = new C42588c(arrayList2, arrayList, searchSugResponse);
                List<C67679e> list2 = searchSugResponse.sugList;
                C89219l.m154716b(list2, "");
                for (T t : list2) {
                    if (arrayList.size() >= a && arrayList2.size() >= b) {
                        break;
                    }
                    int a2 = C41708l.m83665a(t, searchSugResponse.requestSource);
                    if (a2 == 0 || a2 == 1) {
                        if (arrayList.size() < a) {
                            C89219l.m154716b(t, "");
                            t.f151673h = 0;
                            t.f151674i = arrayList.size();
                            arrayList.add(t);
                        }
                    } else if (a2 == 4 && arrayList2.size() < b) {
                        C89219l.m154716b(t, "");
                        t.f151673h = 4;
                        t.f151674i = arrayList2.size();
                        arrayList2.add(t);
                    }
                }
                list = (List) cVar.invoke();
            }
            if (!list.isEmpty()) {
                this.f99381a.mo72800v();
                Map<String, String> b2 = this.f99381a.mo72782b(this.f99382b);
                int size = this.f99382b.sugList.size();
                for (int i = 0; i < size; i++) {
                    C67679e eVar = this.f99382b.sugList.get(i);
                    C89219l.m154716b(eVar, "");
                    eVar.f151676k = b2;
                }
                AbstractC42584a aVar = this.f99381a;
                SearchSugResponse searchSugResponse2 = this.f99382b;
                String str = C41702g.f97285a;
                if (str == null || str.length() == 0) {
                    C41702g.m83659a(String.valueOf(System.currentTimeMillis()));
                }
                C67530bj a3 = new C67526bh().mo106477y(aVar.mo72796r()).mo106469a(SearchEnterViewModel.C42997a.m85830a(aVar.getActivity()).mo73185b().obtainLogData("tab_name"));
                List<C67679e> list3 = searchSugResponse2.sugList;
                String str2 = null;
                C67530bj c = a3.mo106470c(list3 != null ? Integer.valueOf(list3.size()) : null);
                RecommendWordMob recommendWordMob = searchSugResponse2.recommendWordMob;
                if (recommendWordMob != null) {
                    str2 = recommendWordMob.getWordsSource();
                }
                ((C67530bj) c.mo106474v(str2).mo96788a(b2)).mo106468E(C41702g.f97285a).mo96792f();
            }
            return list;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72795q() {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a.mo72795q():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$k */
    public static final class C42597k extends AbsOpenResultCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99376a;

        static {
            Covode.recordClassIndex(50701);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onActionResult(Object obj) {
            super.onActionResult(obj);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onIntercept(String str) {
            super.onIntercept(str);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onMatched(String str) {
            super.onMatched(str);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onMissed(String str) {
            super.onMissed(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42597k(AbstractC42584a aVar) {
            this.f99376a = aVar;
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onSuccess(Intent intent) {
            this.f99376a.mo72787i().setIsLeavingSearch(true);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onFail(String str, String str2) {
            super.onFail(str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$m */
    public static final class C42599m implements AbstractC57066a.AbstractC57070d {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99378a;

        static {
            Covode.recordClassIndex(50703);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42599m(AbstractC42584a aVar) {
            this.f99378a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            SearchSugMobHelper searchSugMobHelper = this.f99378a.f99352k;
            if (searchSugMobHelper != null) {
                searchSugMobHelper.f98978b = str2;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$n */
    static final class C42600n<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99379a;

        static {
            Covode.recordClassIndex(50704);
        }

        C42600n(AbstractC42584a aVar) {
            this.f99379a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f99379a.mo72793o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$o */
    static final class C42601o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99380a;

        static {
            Covode.recordClassIndex(50705);
        }

        C42601o(AbstractC42584a aVar) {
            this.f99380a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            AbstractC42584a aVar = this.f99380a;
            C89219l.m154716b(num, "");
            aVar.f99353l = num.intValue();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            mo72793o();
        }
    }

    /* renamed from: a */
    static int m85091a(List<C67679e> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!t.mo106741b()) {
                arrayList.add(t);
            }
        }
        return arrayList.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$q */
    static final class C42603q<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99383a;

        /* renamed from: b */
        final /* synthetic */ SearchSugResponse f99384b;

        static {
            Covode.recordClassIndex(50707);
        }

        C42603q(AbstractC42584a aVar, SearchSugResponse searchSugResponse) {
            this.f99383a = aVar;
            this.f99384b = searchSugResponse;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            boolean z;
            if (C80214ai.m139043a(iVar)) {
                C41690d g = this.f99383a.mo72785g();
                C89219l.m154716b(iVar, "");
                Collection<? extends C67679e> collection = (Collection) iVar.mo5545d();
                if (collection == null) {
                    collection = new ArrayList<>();
                }
                if (g.f97246a == null) {
                    g.f97246a = new ArrayList();
                }
                g.f97246a.clear();
                g.f97246a.addAll(collection);
                C41690d g2 = this.f99383a.mo72785g();
                SearchSugResponse searchSugResponse = this.f99384b;
                if (!C41485a.m83438a(searchSugResponse.requestSource)) {
                    List list = searchSugResponse.sugList;
                    if (list == null) {
                        list = new ArrayList();
                    }
                    if (AbstractC42584a.m85091a(list) >= 5) {
                        z = true;
                        g2.mo70889a(z);
                        this.f99383a.mo72785g().notifyDataSetChanged();
                    }
                }
                z = false;
                g2.mo70889a(z);
                this.f99383a.mo72785g().notifyDataSetChanged();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo72778a(int i) {
        if (getParentFragment() != null && (getParentFragment() instanceof AbstractC42715b)) {
            Fragment parentFragment = getParentFragment();
            Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.BaseDiscoverAndSearchFragment");
            AbstractC42715b bVar = (AbstractC42715b) parentFragment;
            if (i == 1 && bVar.mo72982w() == 3 && bVar.f99637l.mo72758b()) {
                new C67554j().mo106460p("cancel").mo106459o("personal_detail").mo96792f();
            }
        }
    }

    /* renamed from: a */
    public void mo72779a(View view) {
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.dgw);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f99347b = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("mListView");
        }
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(1));
        RecyclerView recyclerView2 = this.f99347b;
        if (recyclerView2 == null) {
            C89219l.m154710a("mListView");
        }
        Drawable drawable = getResources().getDrawable(R.drawable.bd0);
        C89219l.m154716b(drawable, "");
        recyclerView2.mo4402a(new C42586b(drawable));
        RecyclerView recyclerView3 = this.f99347b;
        if (recyclerView3 == null) {
            C89219l.m154710a("mListView");
        }
        recyclerView3.mo4405a(new C42590e());
    }

    /* renamed from: b */
    public final Map<String, String> mo72782b(SearchSugResponse searchSugResponse) {
        String str;
        String str2;
        String a = C48027ac.C48028a.f111257a.mo80055a(mo72785g().f97247b);
        C33744d a2 = new C33744d().mo59983a("raw_query", mo72939y());
        RecommendWordMob recommendWordMob = searchSugResponse.recommendWordMob;
        String str3 = null;
        if (recommendWordMob != null) {
            str = recommendWordMob.getInfo();
        } else {
            str = null;
        }
        C33744d a3 = a2.mo59983a("info", str).mo59983a("sug_session_id", "");
        LogPbBean logPbBean = searchSugResponse.logPb;
        if (logPbBean != null) {
            str3 = logPbBean.getImprId();
        }
        C33744d a4 = a3.mo59983a("impr_id", str3).mo59983a("log_pb", a);
        C89219l.m154721d(this, "");
        if (C67446h.f151111a.mo106207a((Activity) getActivity())) {
            str2 = C42465m.m84869a(mo72799u());
        } else {
            str2 = "discovery";
        }
        Map<String, String> map = a4.mo59983a("search_position", str2).f79943a;
        C89219l.m154716b(map, "");
        return map;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42075c.AbstractC42076a
    /* renamed from: a */
    public final void mo71272a(SearchSugResponse searchSugResponse) {
        C89219l.m154721d(searchSugResponse, "");
        if (af_()) {
            RecyclerView recyclerView = this.f99347b;
            if (recyclerView == null) {
                C89219l.m154710a("mListView");
            }
            if (recyclerView.getAdapter() instanceof C41690d) {
                mo72785g().f97248c = searchSugResponse.requestSource;
                mo72785g().f97247b = searchSugResponse.requestId;
                mo72785g().f97253h = searchSugResponse.keyword;
                SearchSugMobHelper searchSugMobHelper = this.f99352k;
                if (searchSugMobHelper != null) {
                    searchSugMobHelper.f98977a = searchSugResponse.logPb;
                }
                SearchSugMobHelper searchSugMobHelper2 = this.f99352k;
                if (searchSugMobHelper2 != null) {
                    searchSugMobHelper2.f98980d = searchSugResponse.recommendWordMob;
                }
                C1731i.m5640b(new CallableC42602p(this, searchSugResponse), C1731i.f5562a).mo5534a(new C42603q(this, searchSugResponse), C1731i.f5564c, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String b;
        super.onCreate(bundle);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        String str = null;
        AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        String str2 = "";
        C89219l.m154716b(a, str2);
        this.f99349d = (SearchIntermediateViewModel) a;
        ActivityC0945e activity2 = getActivity();
        if (activity2 == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a2 = C1181ae.m3881a(activity2, (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
        C89219l.m154716b(a2, str2);
        this.f99350e = (SearchStateViewModel) a2;
        ActivityC0945e activity3 = getActivity();
        if (activity3 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity3, str2);
        this.f99356p = new SearchKeywordPresenter(activity3);
        ActivityC0945e activity4 = getActivity();
        if (activity4 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity4, str2);
        SugKeywordPresenter sugKeywordPresenter = new SugKeywordPresenter(activity4);
        this.f99357q = sugKeywordPresenter;
        SearchKeywordPresenter searchKeywordPresenter = this.f99356p;
        if (!(searchKeywordPresenter == null || (b = searchKeywordPresenter.mo94220b()) == null)) {
            str2 = b;
        }
        sugKeywordPresenter.mo94224a(str2);
        SugKeywordPresenter sugKeywordPresenter2 = this.f99357q;
        if (sugKeywordPresenter2 != null) {
            C42599m mVar = new C42599m(this);
            sugKeywordPresenter2.mo106528b().mo94222a().observe(sugKeywordPresenter2.f151355b, mVar);
            sugKeywordPresenter2.f151354a = mVar;
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99349d;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        searchIntermediateViewModel.keywordPresenter = this.f99356p;
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f99349d;
        if (searchIntermediateViewModel2 == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        searchIntermediateViewModel2.sugKeywordPresenter = this.f99357q;
        SearchIntermediateViewModel searchIntermediateViewModel3 = this.f99349d;
        if (searchIntermediateViewModel3 == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        searchIntermediateViewModel3.getIntermediateState().observe(this, new C42600n(this));
        SearchIntermediateViewModel searchIntermediateViewModel4 = this.f99349d;
        if (searchIntermediateViewModel4 == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        searchIntermediateViewModel4.getSearchTabIndex().mo60213a(this, new C42601o(this), true);
        ActivityC0945e activity5 = getActivity();
        if (activity5 != null) {
            this.f99352k = (SearchSugMobHelper) C1181ae.m3881a(activity5, (C1175ad.AbstractC1177b) null).mo3983a(SearchSugMobHelper.class);
        }
        SearchSugMobHelper searchSugMobHelper = this.f99352k;
        if (searchSugMobHelper != null) {
            searchSugMobHelper.f98978b = mo72939y();
            C67674b bVar = SearchEnterViewModel.C42997a.m85830a(getActivity()).f100248a;
            if (bVar != null) {
                str = bVar.getEnterSearchFrom();
            }
            searchSugMobHelper.f98979c = str;
            searchSugMobHelper.f98981e = new C42589d(this);
        }
        C80512gt.f180112c.mo123769a().mo123768a(mo72797s());
    }

    /* renamed from: a */
    public void mo72780a(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        if (this.f99350e == null) {
            C89219l.m154710a("mSearchStateViewModel");
        }
        SearchStateViewModel searchStateViewModel = this.f99350e;
        if (searchStateViewModel == null) {
            C89219l.m154710a("mSearchStateViewModel");
        }
        searchStateViewModel.setIsRefreshingData(true);
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99349d;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("mIntermediateViewModel");
        }
        searchIntermediateViewModel.openSearch(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo72779a(view);
        mo72791m();
        mo72792n();
        mo72793o();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$g */
    static final class C42593g implements OnActivityResultCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99372a;

        static {
            Covode.recordClassIndex(50697);
        }

        C42593g(AbstractC42584a aVar) {
            this.f99372a = aVar;
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i, int i2, Intent intent) {
            this.f99372a.mo72778a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$l */
    static final class C42598l implements OnActivityResultCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC42584a f99377a;

        static {
            Covode.recordClassIndex(50702);
        }

        C42598l(AbstractC42584a aVar) {
            this.f99377a = aVar;
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i, int i2, Intent intent) {
            this.f99377a.mo72778a(i);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.au6, viewGroup, false);
        View findViewById = a.findViewById(R.id.dmf);
        C89219l.m154716b(findViewById, "");
        this.f99348c = (ViewGroup) findViewById;
        return a;
    }

    /* renamed from: b */
    private final void m85092b(C67679e eVar, String str, int i) {
        String str2;
        String a = C48027ac.C48028a.f111257a.mo80055a(str);
        if (eVar.f151673h == 4) {
            str2 = "user_enrich_sug";
        } else if (C41708l.m83667a(eVar)) {
            str2 = "enrich_sug";
        } else {
            str2 = "normal_sug";
        }
        ((C67505ax) ((C67505ax) new C67505ax().mo106488q("click").mo106481b(Integer.valueOf(i))).mo106443r(mo72939y()).mo106483c(a).mo106486f(C42465m.m84870b(mo72799u())).mo106482b(eVar.f151667b)).mo106444s(str2).mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a
    /* renamed from: a */
    public final void mo71103a(C67679e eVar, String str, int i) {
        String str2;
        String str3;
        String str4;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        this.f99361u = true;
        if (eVar.f151673h == 4) {
            C67684i iVar = eVar.f151672g;
            if (iVar != null && C80538hl.m139614a(iVar.getSecUserId()) && iVar != null) {
                if (C80538hl.m139614a(iVar.getUsername()) && C41500ah.f96814a) {
                    mo72788j().recordSearchHistory(new SearchHistory(iVar.getUsername(), 0));
                }
                iVar.getUsername();
                iVar.getSecUserId();
                Map<String, String> map = eVar.f151676k;
                if (map != null) {
                    map.put("sug_user_id", iVar.getUserId());
                    map.put("user_tag", iVar.getUserRelationType());
                }
                C41702g.m83661b(mo72796r(), eVar.f151674i, eVar, "user_enrich_sug");
                m85092b(eVar, str, eVar.f151674i);
                C42467o.m84879a(null, i, iVar.getUsername(), 6, str, iVar.getUserId(), "click_enrich_sug", iVar.getUserRelationType(), null);
                SmartRouter.buildRoute(getContext(), "aweme://user/profile/").withParam("sec_user_id", iVar.getSecUserId()).withParam("uid", iVar.getUserId()).withParam("enter_from", "search_sug").withParam("previous_page", "search_sug").withParam("extra_from_pre_page", "search_sug").withParam("extra_from_event_enter_from", "search_sug").withParam("extra_previous_page_position", "main_head").withParam("enter_from_request_id", str).withParam("search_request_id", str).withCallback(new C42597k(this)).open(1, new C42598l(this));
                C41702g.m83659a("");
                C67695a.m119852a();
                return;
            }
            return;
        }
        C67678d searchFrom = new C67678d().setKeyword(eVar.f151667b).setSearchFrom("search_sug");
        if (C41708l.m83667a(eVar)) {
            str2 = "enrich_sug";
        } else {
            str2 = "normal_sug";
        }
        C67678d openNewSearchContainer = searchFrom.setSugType(str2).setOpenNewSearchContainer(false);
        C67684i iVar2 = eVar.f151672g;
        if (iVar2 == null || (str3 = iVar2.getUserId()) == null) {
            str3 = "";
        }
        C67678d sugUserId = openNewSearchContainer.setSugUserId(str3);
        C67684i iVar3 = eVar.f151672g;
        if (iVar3 == null || (str4 = iVar3.isRichSugValue()) == null) {
            str4 = "";
        }
        sugUserId.setIsRichSug(str4);
        C89219l.m154716b(openNewSearchContainer, "");
        C67605g.m119729a(1, openNewSearchContainer);
        C67606h.m119735a(1, openNewSearchContainer);
        C67592a.f151373f.onEventStart(openNewSearchContainer);
        mo72780a(openNewSearchContainer);
        m85092b(eVar, str, i);
    }
}
