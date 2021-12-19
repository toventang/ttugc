package com.p2082ss.android.ugc.aweme.discover.p2775j;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0576b;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1780c.C23697c;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.android.material.appbar.AppBarLayout;
import com.p2082ss.android.ugc.aweme.base.C34567d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41743r;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42219c;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42226e;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42230f;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42235g;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42237h;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42242i;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.AbstractC42263c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.mob.AbstractC42448c;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.model.SearchObserver;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener$$CC;
import com.p2082ss.android.ugc.aweme.discover.p2766b.C41886h;
import com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import com.p2082ss.android.ugc.aweme.discover.p2774i.C42071c;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49419b;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49764q;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67404c;
import com.p2082ss.android.ugc.aweme.search.ecom.video.C67428b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c;
import com.p2082ss.android.ugc.aweme.search.p3686d.C67362a;
import com.p2082ss.android.ugc.aweme.search.p3693i.C67455a;
import com.p2082ss.android.ugc.aweme.search.p3693i.C67456b;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67690d;
import com.p2082ss.android.ugc.aweme.search.theme.dark.C67797b;
import com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.k */
public final class C42088k extends AbstractC42757bi<Aweme> implements AbstractC49762o, AbstractC49764q, AbstractC67364c {

    /* renamed from: l */
    private static final C42089a f98129l = new C42089a((byte) 0);

    /* renamed from: a */
    public C42071c f98130a;

    /* renamed from: b */
    public View$OnAttachStateChangeListenerC41864g f98131b;

    /* renamed from: d */
    private C42077d f98132d;

    /* renamed from: e */
    private ViewGroup f98133e;

    /* renamed from: j */
    private View$OnAttachStateChangeListenerC42258a f98134j;

    /* renamed from: k */
    private final AbstractC89244h f98135k;

    /* renamed from: m */
    private SparseArray f98136m;

    static {
        Covode.recordClassIndex(50022);
    }

    /* renamed from: p */
    private final C42090b.C420911 m84281p() {
        return (C42090b.C420911) this.f98135k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f98136m == null) {
            this.f98136m = new SparseArray();
        }
        View view = (View) this.f98136m.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f98136m.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void bb_() {
        SparseArray sparseArray = this.f98136m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "video";
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49764q
    /* renamed from: d */
    public final void mo71309d() {
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

    /* renamed from: com.ss.android.ugc.aweme.discover.j.k$a */
    static final class C42089a {
        static {
            Covode.recordClassIndex(50023);
        }

        private C42089a() {
        }

        public /* synthetic */ C42089a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.k$g */
    public static final class C42096g implements AbstractC42263c {
        static {
            Covode.recordClassIndex(50030);
        }

        C42096g() {
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

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        mo62679l();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.k$b */
    static final class C42090b extends AbstractC89220m implements AbstractC89171a<C420911> {

        /* renamed from: a */
        final /* synthetic */ C42088k f98137a;

        static {
            Covode.recordClassIndex(50024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42090b(C42088k kVar) {
            super(0);
            this.f98137a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C420911 invoke() {
            return new AbstractC51043a(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2775j.C42088k.C42090b.C420911 */

                /* renamed from: a */
                final /* synthetic */ C42090b f98138a;

                static {
                    Covode.recordClassIndex(50025);
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: h */
                public final AbstractC84295k mo60504h() {
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: g */
                public final Fragment mo60503g() {
                    return this.f98138a.f98137a;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: c */
                public final boolean mo60499c() {
                    return this.f98138a.f98137a.af_();
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: e */
                public final boolean mo60501e() {
                    return this.f98138a.f98137a.getUserVisibleHint();
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: f */
                public final Context mo60502f() {
                    return this.f98138a.f98137a.getContext();
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: d */
                public final String mo60500d() {
                    Integer num;
                    StringBuilder sb = new StringBuilder("SearchFeedFragment_");
                    ActivityC0945e activity = this.f98138a.f98137a.getActivity();
                    if (activity != null) {
                        num = Integer.valueOf(activity.hashCode());
                    } else {
                        num = null;
                    }
                    return sb.append(num).toString();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f98138a = r1;
                }
            };
        }
    }

    /* renamed from: Q */
    private final void m84280Q() {
        C42077d dVar = this.f98132d;
        if (dVar != null) {
            dVar.mo71275a(C42077d.f98098c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c
    /* renamed from: a */
    public final void mo71301a() {
        AbstractC42081f fVar = (AbstractC42081f) mo71349n().f92286h;
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
        C50529ae.f116794e = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.k$f */
    static final class RunnableC42095f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42088k f98142a;

        /* renamed from: b */
        final /* synthetic */ List f98143b;

        /* renamed from: c */
        final /* synthetic */ boolean f98144c;

        static {
            Covode.recordClassIndex(50029);
        }

        RunnableC42095f(C42088k kVar, List list, boolean z) {
            this.f98142a = kVar;
            this.f98143b = list;
            this.f98144c = z;
        }

        public final void run() {
            this.f98142a.f98130a.mo71258a(this.f98143b, this.f98144c);
            this.f98142a.mo72909N();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    /* renamed from: G */
    public final SparseArray<AbstractC81911c> mo61042G() {
        SparseArray<AbstractC81911c> G = super.mo61042G();
        C89219l.m154716b(G, "");
        G.append(C34567d.C34568a.f81606b, this.f98130a);
        return G;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final boolean bn_() {
        AbstractC42081f fVar = (AbstractC42081f) mo71349n().f92286h;
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
        return fVar.isHasMore();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: o */
    public final boolean mo71310o() {
        View view;
        List<View> a = mo72901B().mo71052a();
        View$OnAttachStateChangeListenerC42258a aVar = this.f98134j;
        if (aVar != null) {
            view = aVar.itemView;
        } else {
            view = null;
        }
        return C89070n.m154556a((Iterable) a, (Object) view);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onDestroyView() {
        super.onDestroyView();
        mo71349n().ck_();
        this.f98130a.mo70413r();
        bb_();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onPause() {
        super.onPause();
        View$OnAttachStateChangeListenerC41864g gVar = this.f98131b;
        if (gVar != null) {
            gVar.f97676h = true;
        }
        View$OnAttachStateChangeListenerC41864g gVar2 = this.f98131b;
        if (gVar2 != null) {
            gVar2.mo71038f();
        }
    }

    public C42088k() {
        if (this.f98130a == null) {
            this.f98130a = new C42071c("search_result", this, this);
        }
        C42071c cVar = this.f98130a;
        if (cVar == null) {
            C89219l.m154715b();
        }
        this.f98130a = cVar;
        this.f98135k = C89250i.m154773a((AbstractC89171a) new C42090b(this));
        this.f99509t = C67458j.f151135d;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: i */
    public final void mo71299i() {
        mo73030a(new C42080e());
        mo71349n().mo67839a_((AbstractC39102c) this);
        mo71349n().mo71293a((AbstractC42637ac) this);
        mo71349n().mo67865a((AbstractC39103d) this.f98130a);
        this.f98132d = new C42077d();
        C42082g<?> n = mo71349n();
        Objects.requireNonNull(n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchAwemePresenter");
        n.mo67838a((Object) this.f98132d);
        m84280Q();
        if (getActivity() != null) {
            C1213t<Integer> tVar = mo72902C().searchState;
            if (tVar != null) {
                tVar.observe(this, new SearchObserver().setListener(new C42092c(this)));
            }
            C1213t<Boolean> tVar2 = mo72902C().isRefreshingData;
            if (tVar2 != null) {
                tVar2.observe(this, new C42093d(this));
            }
            C1213t<Boolean> tVar3 = mo72902C().isShowingFilters;
            if (tVar3 != null) {
                tVar3.observe(this, new C42094e(this));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: m */
    public final void mo71300m() {
        C41743r d = this.f98130a.mo71251d();
        C89219l.m154716b(d, "");
        mo72913a(d);
        C41893a aVar = this.f98130a.f98079g;
        C89219l.m154716b(aVar, "");
        mo72914a(aVar);
        AbstractC39060f A = mo72900A();
        C41743r rVar = null;
        if (!(A instanceof C41743r)) {
            A = null;
        }
        C41743r rVar2 = (C41743r) A;
        if (rVar2 != null) {
            rVar2.f97372e = m84281p();
        }
        if (C41886h.m83908b()) {
            this.f98131b = new View$OnAttachStateChangeListenerC41864g(mo72925w(), mo72927y());
            AbstractC39060f A2 = mo72900A();
            if (A2 instanceof C41743r) {
                rVar = A2;
            }
            C41743r rVar3 = rVar;
            if (rVar3 != null) {
                View$OnAttachStateChangeListenerC41864g gVar = this.f98131b;
                if (gVar == null) {
                    C89219l.m154715b();
                }
                rVar3.f97371d = gVar;
            }
            this.f98130a.f98092p = this.f98131b;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onResume() {
        View$OnAttachStateChangeListenerC41864g gVar;
        super.onResume();
        View$OnAttachStateChangeListenerC41864g gVar2 = this.f98131b;
        if (gVar2 != null) {
            gVar2.f97676h = false;
        }
        if (getUserVisibleHint()) {
            C1213t<Boolean> tVar = mo72902C().isShowingFilters;
            C89219l.m154716b(tVar, "");
            if (!C89219l.m154714a((Object) tVar.getValue(), (Object) true)) {
                C1213t<Boolean> tVar2 = mo72902C().isRefreshingData;
                C89219l.m154716b(tVar2, "");
                if ((!C89219l.m154714a((Object) tVar2.getValue(), (Object) true)) && (gVar = this.f98131b) != null) {
                    gVar.mo71036d();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
        this.f98130a.mo71259a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: b */
    public final void mo71308b(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        super.mo71308b(dVar);
        C42071c cVar = this.f98130a;
        if (cVar != null) {
            cVar.mo71255a(dVar);
        }
        m84280Q();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.k$d */
    static final class C42093d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42088k f98140a;

        static {
            Covode.recordClassIndex(50027);
        }

        C42093d(C42088k kVar) {
            this.f98140a = kVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View$OnAttachStateChangeListenerC41864g gVar;
            Boolean bool = (Boolean) obj;
            View$OnAttachStateChangeListenerC41864g gVar2 = this.f98140a.f98131b;
            if (gVar2 != null) {
                C89219l.m154716b(bool, "");
                gVar2.f97678j = bool.booleanValue();
            }
            C89219l.m154716b(bool, "");
            if (bool.booleanValue() && (gVar = this.f98140a.f98131b) != null) {
                gVar.mo71038f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.k$e */
    static final class C42094e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42088k f98141a;

        static {
            Covode.recordClassIndex(50028);
        }

        C42094e(C42088k kVar) {
            this.f98141a = kVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                View$OnAttachStateChangeListenerC41864g gVar = this.f98141a.f98131b;
                if (gVar != null) {
                    gVar.mo71038f();
                    return;
                }
                return;
            }
            View$OnAttachStateChangeListenerC41864g gVar2 = this.f98141a.f98131b;
            if (gVar2 != null) {
                gVar2.mo71036d();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi
    /* renamed from: b */
    public final void mo71307b(int i) {
        mo71349n().mo57616a(1, mo72879u(), Integer.valueOf(i), Integer.valueOf(this.f99498C), this.f99499D);
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f98130a.mo70492e(z);
        View$OnAttachStateChangeListenerC41864g gVar = this.f98131b;
        if (gVar != null) {
            gVar.f97677i = z;
        }
        if (!z) {
            View$OnAttachStateChangeListenerC41864g gVar2 = this.f98131b;
            if (gVar2 != null) {
                gVar2.mo71038f();
                return;
            }
            return;
        }
        View$OnAttachStateChangeListenerC41864g gVar3 = this.f98131b;
        if (gVar3 != null) {
            gVar3.mo71036d();
        }
        this.f98130a.mo71268k();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.k$c */
    static final class C42092c implements SearchStateListener {

        /* renamed from: a */
        final /* synthetic */ C42088k f98139a;

        static {
            Covode.recordClassIndex(50026);
        }

        C42092c(C42088k kVar) {
            this.f98139a = kVar;
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
            boolean z2;
            C1213t<Boolean> tVar = this.f98139a.mo72902C().isShowingSuicide;
            C89219l.m154716b(tVar, "");
            tVar.getValue();
            View$OnAttachStateChangeListenerC41864g gVar = this.f98139a.f98131b;
            if (gVar != null) {
                C1213t<Boolean> tVar2 = this.f98139a.mo72902C().isShowingSuicide;
                C89219l.m154716b(tVar2, "");
                boolean a = C89219l.m154714a((Object) tVar2.getValue(), (Object) true);
                if (!z || a) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                gVar.f97677i = z2;
                if (z) {
                    C1213t<Boolean> tVar3 = this.f98139a.mo72902C().isRefreshingData;
                    C89219l.m154716b(tVar3, "");
                    if (!C89219l.m154714a((Object) tVar3.getValue(), (Object) true)) {
                        C1213t<Boolean> tVar4 = this.f98139a.mo72902C().isShowingFilters;
                        C89219l.m154716b(tVar4, "");
                        if (!C89219l.m154714a((Object) tVar4.getValue(), (Object) true)) {
                            gVar.mo71036d();
                            return;
                        }
                    }
                }
                gVar.mo71038f();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi
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
            View$OnAttachStateChangeListenerC42258a aVar = this.f98134j;
            if (aVar != null) {
                view2 = aVar.itemView;
            } else {
                view2 = null;
            }
            B.mo71055b(view2);
            View$OnAttachStateChangeListenerC42258a aVar2 = this.f98134j;
            if (!(aVar2 == null || (view3 = aVar2.itemView) == null)) {
                view3.setVisibility(8);
            }
            this.f98134j = null;
            return;
        }
        C41893a B2 = mo72901B();
        View$OnAttachStateChangeListenerC42258a aVar3 = this.f98134j;
        if (aVar3 != null) {
            view = aVar3.itemView;
        } else {
            view = null;
        }
        B2.mo71055b(view);
        if (!C23697c.m44781a(dVar.getSchema())) {
            this.f98134j = View$OnAttachStateChangeListenerC42258a.C42259a.m84600a(mo72925w(), new C42096g());
            C67797b.m119979a(Integer.valueOf(hashCode()), this.f98134j);
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
            View$OnAttachStateChangeListenerC42258a aVar4 = this.f98134j;
            if (aVar4 != null) {
                View$OnAttachStateChangeListenerC42258a.m84565a(aVar4, dVar, a4, 24);
            }
            C41893a B3 = mo72901B();
            View$OnAttachStateChangeListenerC42258a aVar5 = this.f98134j;
            if (aVar5 != null) {
                view4 = aVar5.itemView;
            }
            B3.mo71053a(0, view4);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo71305a(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        if (af_()) {
            AbstractC39060f A = mo72900A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchCellFeedAdapter");
            ((AbstractC39058d) A).mo67804a(followStatus);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c
    /* renamed from: a */
    public final void mo71306a(C67362a aVar) {
        C67568r rVar;
        String str;
        C0576b bVar;
        Bundle bundle;
        int i;
        C67469ad c;
        Integer valueOf;
        C67469ad c2;
        C89219l.m154721d(aVar, "");
        Aweme aweme = aVar.f150933b;
        View view = aVar.f150932a;
        String str2 = aVar.f150934c;
        C67394a aVar2 = aVar.f150936e;
        if (!C58001a.m104815a(view, 1200)) {
            String str3 = null;
            if (view != null) {
                rVar = C42460j.C42461a.m84864a(view);
            } else {
                rVar = null;
            }
            if (aweme != null && getActivity() != null) {
                AbstractC42081f fVar = (AbstractC42081f) mo71349n().f92286h;
                Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
                C50529ae.f116790a = fVar;
                AbstractC67567q a = C67486am.m119564a();
                if (a == null || (c2 = a.mo106431c()) == null) {
                    str = null;
                } else {
                    str = c2.f151151a;
                }
                String a2 = AbstractC42448c.AbstractC42450b.C42451a.m84856a(4);
                Bundle bundle2 = new Bundle();
                bundle2.putString("id", aweme.getAid());
                bundle2.putString("refer", str2);
                bundle2.putString("video_from", "from_search");
                bundle2.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                bundle2.putInt("page_type", 9);
                bundle2.putString("search_keyword", mo72879u());
                bundle2.putString("search_id", str);
                bundle2.putString("playlist_search_id", str);
                bundle2.putInt("is_from_video", 1);
                bundle2.putString("key_search_type", a2);
                bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
                if (aVar2 != null) {
                    bundle2.putSerializable("feed_anchor_custom_data", new AnchorCustomData(true, C67404c.m119440a(C67404c.m119438a(aweme, aVar2, rVar))));
                }
                if (view != null) {
                    bVar = C0576b.m2193b(view, view.getWidth(), view.getHeight());
                } else {
                    bVar = null;
                }
                SmartRoute withParam = SmartRouter.buildRoute(getActivity(), "//aweme/detail").withParam(bundle2);
                if (bVar != null) {
                    bundle = bVar.mo2564a();
                } else {
                    bundle = null;
                }
                withParam.withBundleAnimation(bundle).withParam("activity_has_activity_options", true).open();
                C49419b.m92487a(aweme);
                if (mo72925w().getLayoutManager() == null || view == null || (valueOf = Integer.valueOf(RecyclerView.AbstractC1362i.m4426e(view))) == null) {
                    i = -1;
                } else {
                    i = valueOf.intValue();
                }
                AbstractC67567q a3 = C67486am.m119564a();
                if (!(a3 == null || (c = a3.mo106431c()) == null)) {
                    str3 = c.f151152b;
                }
                C42467o.m84880a(view, "search_result", aweme, str3, i);
                C67690d.C67691a.m119848a(C89041ag.m154421a(C89387v.m154943a("search_result_id", aweme.getAid()), C89387v.m154943a("is_from_video", "1")));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: b */
    public final void mo59517b(List<? extends Aweme> list, boolean z) {
        this.f98130a.mo71263b(list, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: c */
    public final void mo59523c(List<? extends Aweme> list, boolean z) {
        C89219l.m154721d(list, "");
        this.f98130a.mo71263b(list, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi
    /* renamed from: a */
    public final void mo71304a(C42345d dVar, String str) {
        C67456b.m119524a(new C67455a(getActivity(), dVar, str, this.f99497B, getView()));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo71302a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        mo72905I();
        this.f98130a.mo70393a(view, bundle);
        mo71300m();
        mo72900A().mo67820g(C0643b.m2378c(view.getContext(), R.color.c5));
        this.f98130a.f98089m = 9;
        this.f98130a.mo71247a(this);
        this.f98130a.f98086j = this;
        this.f98130a.mo71257a("");
        this.f98130a.f98091o = m84281p();
        mo72925w().setClipToPadding(false);
        AppBarLayout z = mo72928z();
        if (z != null) {
            z.setBackground(null);
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ds6);
        this.f98133e = viewGroup;
        if (viewGroup != null) {
            viewGroup.setBackground(null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo59512a(List<? extends Aweme> list, boolean z) {
        C89219l.m154721d(list, "");
        if (af_()) {
            mo72925w().post(new RunnableC42095f(this, list, z));
            mo72902C().setIsRefreshingData(false);
            mo72926x().mo27382d();
            View$OnAttachStateChangeListenerC41864g gVar = this.f98131b;
            if (gVar != null) {
                gVar.mo71033a(false, (AppBarLayout) null);
            }
            C67428b.m119462a(hashCode());
            mo71344a_(true);
        }
    }
}
