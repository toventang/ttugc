package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0576b;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.discover.jedi.p2776a.C42123b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.SearchOperation;
import com.p2082ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.DialList;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.PleaseNotice;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.SearchSuicideInfo;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.Tools;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42077d;
import com.p2082ss.android.ugc.aweme.discover.p2795n.AbstractC42474a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49419b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67579v;
import com.p2082ss.android.ugc.aweme.views.AbstractC81445m;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.e.f */
public final class C42854f extends AbstractC42670am implements AbstractC39063h.AbstractC39067a, AbstractC42843a, AbstractC42844b, AbstractC90252i, AbstractC90253j {

    /* renamed from: l */
    public static final String f99931l = "SearchSuicideFragment";

    /* renamed from: m */
    public static final C42855a f99932m = new C42855a((byte) 0);

    /* renamed from: K */
    private SearchSuicideInfo f99933K;

    /* renamed from: L */
    private SparseArray f99934L;

    /* renamed from: a */
    public SearchPreventSuicide f99935a;

    /* renamed from: b */
    public C67678d f99936b;

    /* renamed from: c */
    public String f99937c;

    /* renamed from: d */
    public GlobalDoodleConfig f99938d;

    /* renamed from: e */
    public C42850d f99939e;

    /* renamed from: j */
    public boolean f99940j;

    /* renamed from: k */
    public boolean f99941k = true;

    /* renamed from: n */
    private C42858g f99942n;

    /* renamed from: o */
    private RecyclerView f99943o;

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f99934L == null) {
            this.f99934L = new SparseArray();
        }
        View view = (View) this.f99934L.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f99934L.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Aweme> list, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Aweme> list, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    public final void bb_() {
        SparseArray sparseArray = this.f99934L;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Aweme> list, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(C42854f.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.f$a */
    public static final class C42855a {
        static {
            Covode.recordClassIndex(50959);
        }

        private C42855a() {
        }

        public /* synthetic */ C42855a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.f$b */
    public static final class RunnableC42856b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42854f f99944a;

        static {
            Covode.recordClassIndex(50960);
        }

        RunnableC42856b(C42854f fVar) {
            this.f99944a = fVar;
        }

        public final void run() {
            C42854f.m85574a(this.f99944a).ap_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.f$c */
    static final class RunnableC42857c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42854f f99945a;

        static {
            Covode.recordClassIndex(50961);
        }

        RunnableC42857c(C42854f fVar) {
            this.f99945a = fVar;
        }

        public final void run() {
            C42854f.m85574a(this.f99945a).ap_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        C42850d dVar = this.f99939e;
        if (dVar == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        dVar.ao_();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus.m156962a().mo145395b(this);
        bb_();
    }

    static {
        Covode.recordClassIndex(50958);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        String str;
        C42858g gVar = this.f99942n;
        if (gVar == null) {
            C89219l.m154710a("searchSuicidePresenter");
        }
        C42077d dVar = (C42077d) gVar.f92286h;
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.SearchSuicideAwemeModel");
        ((C42853e) dVar).mo70559a();
        C42858g gVar2 = this.f99942n;
        if (gVar2 == null) {
            C89219l.m154710a("searchSuicidePresenter");
        }
        Object[] objArr = new Object[5];
        objArr[0] = 4;
        C67678d dVar2 = this.f99936b;
        if (dVar2 != null) {
            str = dVar2.getKeyword();
        } else {
            str = null;
        }
        objArr[1] = str;
        objArr[2] = 1;
        objArr[3] = 1;
        objArr[4] = null;
        gVar2.mo57616a(objArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e.AbstractC42844b
    /* renamed from: d */
    public final void mo73090d() {
        View view;
        SearchSuicideInfo searchSuicideInfo = this.f99933K;
        if (searchSuicideInfo != null) {
            C42850d dVar = this.f99939e;
            if (dVar == null) {
                C89219l.m154710a("searchSuicideAdapter");
            } else {
                dVar.mo73096a(searchSuicideInfo);
            }
        }
        C42850d dVar2 = this.f99939e;
        if (dVar2 == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        if (!dVar2.mo73097l()) {
            C42850d dVar3 = this.f99939e;
            if (dVar3 == null) {
                C89219l.m154710a("searchSuicideAdapter");
            } else {
                SearchSuicideInfo searchSuicideInfo2 = new SearchSuicideInfo();
                searchSuicideInfo2.type = 5;
                dVar3.mo62376b(C89070n.m154524c(searchSuicideInfo2));
            }
        }
        ArrayList arrayList = new ArrayList();
        C42858g gVar = this.f99942n;
        if (gVar == null) {
            C89219l.m154710a("searchSuicidePresenter");
        } else {
            List<Aweme> d = gVar.mo73101d();
            if (d != null) {
                for (T t : d) {
                    C42850d dVar4 = this.f99939e;
                    if (dVar4 == null) {
                        C89219l.m154710a("searchSuicideAdapter");
                    } else {
                        String aid = t.getAid();
                        C89219l.m154716b(aid, "");
                        if (dVar4.mo73095a(aid) == -1) {
                            SearchSuicideInfo searchSuicideInfo3 = new SearchSuicideInfo();
                            searchSuicideInfo3.type = 6;
                            searchSuicideInfo3.aweme = t;
                            arrayList.add(searchSuicideInfo3);
                        }
                    }
                }
            }
        }
        C42850d dVar5 = this.f99939e;
        if (dVar5 == null) {
            C89219l.m154710a("searchSuicideAdapter");
        } else {
            dVar5.mo62376b(arrayList);
        }
        this.f99940j = true;
        if (!(this.f99941k || (view = getView()) == null)) {
            view.postDelayed(new RunnableC42856b(this), 500);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C42850d m85574a(C42854f fVar) {
        C42850d dVar = fVar.f99939e;
        if (dVar == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        return dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C42850d dVar = this.f99939e;
        if (dVar == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        dVar.mo67823i();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e.AbstractC42843a
    /* renamed from: a */
    public final void mo73085a(GlobalDoodleConfig globalDoodleConfig) {
        C42850d dVar = this.f99939e;
        if (dVar == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        dVar.f99924d = globalDoodleConfig;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e.AbstractC42843a
    /* renamed from: a */
    public final void mo73086a(LogPbBean logPbBean) {
        C42850d dVar = this.f99939e;
        if (dVar == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        if (logPbBean == null) {
            logPbBean = new LogPbBean();
        }
        dVar.f99925e = logPbBean;
    }

    @AbstractC90264r
    public final void onVideoEvent(C49672ag agVar) {
        C89219l.m154721d(agVar, "");
        if (af_()) {
            int i = agVar.f114315a;
            if (i == 13) {
                RecyclerView recyclerView = this.f99943o;
                if (recyclerView == null) {
                    C89219l.m154710a("recyclerView");
                }
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    RecyclerView recyclerView2 = this.f99943o;
                    if (recyclerView2 == null) {
                        C89219l.m154710a("recyclerView");
                    }
                    View childAt = recyclerView2.getChildAt(i2);
                    RecyclerView recyclerView3 = this.f99943o;
                    if (recyclerView3 == null) {
                        C89219l.m154710a("recyclerView");
                    }
                    RecyclerView.ViewHolder a = recyclerView3.mo4393a(childAt);
                    if (a instanceof AbstractC42474a) {
                        ((AbstractC42474a) a).mo72624G();
                    }
                }
            } else if (i == 21) {
                Object obj = agVar.f114316b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                Aweme aweme = (Aweme) obj;
                if (aweme != null) {
                    C42850d dVar = this.f99939e;
                    if (dVar == null) {
                        C89219l.m154710a("searchSuicideAdapter");
                    }
                    String aid = aweme.getAid();
                    C89219l.m154716b(aid, "");
                    int a2 = dVar.mo73095a(aid);
                    if (a2 != -1) {
                        RecyclerView recyclerView4 = this.f99943o;
                        if (recyclerView4 == null) {
                            C89219l.m154710a("recyclerView");
                        }
                        if (recyclerView4.getLayoutManager() instanceof AbstractC81445m) {
                            RecyclerView recyclerView5 = this.f99943o;
                            if (recyclerView5 == null) {
                                C89219l.m154710a("recyclerView");
                            }
                            if (recyclerView5.getLayoutManager() instanceof GridLayoutManager) {
                                RecyclerView recyclerView6 = this.f99943o;
                                if (recyclerView6 == null) {
                                    C89219l.m154710a("recyclerView");
                                }
                                RecyclerView.AbstractC1362i layoutManager = recyclerView6.getLayoutManager();
                                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                                int k = linearLayoutManager.mo4371k();
                                int m = linearLayoutManager.mo4373m();
                                if (a2 < k || a2 > m) {
                                    RecyclerView recyclerView7 = this.f99943o;
                                    if (recyclerView7 == null) {
                                        C89219l.m154710a("recyclerView");
                                    }
                                    RecyclerView.AbstractC1362i layoutManager2 = recyclerView7.getLayoutManager();
                                    Objects.requireNonNull(layoutManager2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.ILayoutMangerScroll");
                                    ((AbstractC81445m) layoutManager2).mo125099a(a2, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e.AbstractC42843a
    /* renamed from: a */
    public final void mo73087a(boolean z) {
        PleaseNotice pleaseNotice;
        String str;
        this.f99941k = z;
        C42850d dVar = this.f99939e;
        if (dVar == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        List list = dVar.f92236l;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SearchSuicideInfo) next).pleaseNotice != null) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        new C67579v("selfharm_sign").mo96792f();
        SearchPreventSuicide searchPreventSuicide = this.f99935a;
        if (!(searchPreventSuicide == null || (str = searchPreventSuicide.showResultsType) == null)) {
            int hashCode = str.hashCode();
            if (hashCode != -1729769847) {
                if (hashCode != 255172472) {
                    if (hashCode == 1986246200 && str.equals("show_directly")) {
                        mo73090d();
                        return;
                    }
                    return;
                } else if (!str.equals("no_results")) {
                    return;
                } else {
                    return;
                }
            } else if (!str.equals("show_with_button")) {
                return;
            }
        }
        SearchPreventSuicide searchPreventSuicide2 = this.f99935a;
        if (searchPreventSuicide2 != null && (pleaseNotice = searchPreventSuicide2.pleaseNotice) != null) {
            SearchSuicideInfo searchSuicideInfo = new SearchSuicideInfo();
            searchSuicideInfo.type = 4;
            searchSuicideInfo.pleaseNotice = pleaseNotice;
            searchSuicideInfo.globalDoodleConfig = this.f99938d;
            this.f99933K = searchSuicideInfo;
            C42850d dVar2 = this.f99939e;
            if (dVar2 == null) {
                C89219l.m154710a("searchSuicideAdapter");
            }
            SearchSuicideInfo[] searchSuicideInfoArr = new SearchSuicideInfo[1];
            SearchSuicideInfo searchSuicideInfo2 = this.f99933K;
            if (searchSuicideInfo2 == null) {
                C89219l.m154715b();
            }
            searchSuicideInfoArr[0] = searchSuicideInfo2;
            dVar2.mo62376b(C89070n.m154524c(searchSuicideInfoArr));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e.AbstractC42843a
    /* renamed from: d */
    public final void mo73088d(List<? extends Aweme> list, boolean z) {
        C89219l.m154721d(list, "");
        if (this.f99940j) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                C42850d dVar = this.f99939e;
                if (dVar == null) {
                    C89219l.m154710a("searchSuicideAdapter");
                } else {
                    String aid = t.getAid();
                    C89219l.m154716b(aid, "");
                    if (dVar.mo73095a(aid) == -1) {
                        SearchSuicideInfo searchSuicideInfo = new SearchSuicideInfo();
                        searchSuicideInfo.type = 6;
                        searchSuicideInfo.aweme = t;
                        arrayList.add(searchSuicideInfo);
                    }
                }
            }
            C42850d dVar2 = this.f99939e;
            if (dVar2 == null) {
                C89219l.m154710a("searchSuicideAdapter");
            } else {
                dVar2.mo62376b(arrayList);
            }
            if (!z) {
                View view = getView();
                if (view != null) {
                    view.postDelayed(new RunnableC42857c(this), 500);
                    return;
                }
                return;
            }
            C42850d dVar3 = this.f99939e;
            if (dVar3 == null) {
                C89219l.m154710a("searchSuicideAdapter");
            }
            dVar3.mo67818c(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e.AbstractC42844b
    /* renamed from: a */
    public final void mo73089a(View view, Aweme aweme) {
        String str;
        if (!C58001a.m104815a(view, 1200) && view != null && aweme != null && getActivity() != null) {
            C42858g gVar = this.f99942n;
            if (gVar == null) {
                C89219l.m154710a("searchSuicidePresenter");
            }
            C42077d dVar = (C42077d) gVar.f92286h;
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
            C50529ae.f116790a = dVar;
            Bundle bundle = new Bundle();
            bundle.putString("id", aweme.getAid());
            bundle.putString("refer", "selfharm");
            bundle.putString("video_from", "from_search");
            bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
            bundle.putInt("page_type", 9);
            bundle.putString("search_keyword", mo72879u());
            C0576b b = C0576b.m2193b(view, view.getWidth(), view.getHeight());
            C89219l.m154716b(b, "");
            SmartRouter.buildRoute(getActivity(), "//aweme/detail").withParam(bundle).withBundleAnimation(b.mo2564a()).withParam("activity_has_activity_options", true).open();
            C49419b.m92487a(aweme);
            RecyclerView recyclerView = this.f99943o;
            if (recyclerView == null) {
                C89219l.m154710a("recyclerView");
            }
            int i = -1;
            if (recyclerView.getLayoutManager() != null) {
                RecyclerView recyclerView2 = this.f99943o;
                if (recyclerView2 == null) {
                    C89219l.m154710a("recyclerView");
                }
                if (recyclerView2.getLayoutManager() != null) {
                    i = RecyclerView.AbstractC1362i.m4426e(view);
                }
            }
            C67678d dVar2 = this.f99507r;
            if (dVar2 != null) {
                str = dVar2.getKeyword();
            } else {
                str = null;
            }
            C42467o.m84880a(view, "search_result", aweme, str, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<DialList> list;
        int i;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        EventBus.m156966a(EventBus.m156962a(), this);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.c_f);
        C89219l.m154716b(recyclerView, "");
        this.f99943o = recyclerView;
        C42858g gVar = new C42858g();
        this.f99942n = gVar;
        gVar.mo67839a_(this);
        C42858g gVar2 = this.f99942n;
        if (gVar2 == null) {
            C89219l.m154710a("searchSuicidePresenter");
        } else {
            C42853e eVar = new C42853e();
            C89219l.m154721d("tiktok_ssh", "");
            ((C42077d) eVar).f98102a = "tiktok_ssh";
            String str = this.f99937c;
            if (str != null) {
                C89219l.m154721d(str, "");
                ((C42077d) eVar).f98103b = str;
            }
            gVar2.mo67838a((AbstractC39085b) eVar);
        }
        this.f99939e = new C42850d(this);
        RecyclerView recyclerView2 = this.f99943o;
        if (recyclerView2 == null) {
            C89219l.m154710a("recyclerView");
        }
        if (recyclerView2 != null) {
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getActivity(), 2);
            wrapGridLayoutManager.mo4356b(1);
            recyclerView2.setLayoutManager(wrapGridLayoutManager);
        }
        C42850d dVar = this.f99939e;
        if (dVar == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        RecyclerView recyclerView3 = this.f99943o;
        if (recyclerView3 == null) {
            C89219l.m154710a("recyclerView");
        }
        dVar.mo67820g(C0643b.m2378c(recyclerView3.getContext(), R.color.c5));
        C42850d dVar2 = this.f99939e;
        if (dVar2 == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        RecyclerView recyclerView4 = this.f99943o;
        if (recyclerView4 == null) {
            C89219l.m154710a("recyclerView");
        }
        dVar2.mo67820g(C0643b.m2378c(recyclerView4.getContext(), R.color.nc));
        C42850d dVar3 = this.f99939e;
        if (dVar3 == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        dVar3.mo67813a((AbstractC39063h.AbstractC39067a) this);
        RecyclerView recyclerView5 = this.f99943o;
        if (recyclerView5 == null) {
            C89219l.m154710a("recyclerView");
        }
        C42850d dVar4 = this.f99939e;
        if (dVar4 == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        recyclerView5.setAdapter(dVar4);
        RecyclerView recyclerView6 = this.f99943o;
        if (recyclerView6 == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView6.mo4402a(new C42123b((int) C13628n.m24520b(getContext(), 8.0f), true));
        RecyclerView recyclerView7 = this.f99943o;
        if (recyclerView7 == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView7.setItemAnimator(new C1434i());
        C42850d dVar5 = this.f99939e;
        if (dVar5 == null) {
            C89219l.m154710a("searchSuicideAdapter");
        }
        RecyclerView recyclerView8 = this.f99943o;
        if (recyclerView8 == null) {
            C89219l.m154710a("recyclerView");
        }
        dVar5.mo67820g(C0643b.m2378c(recyclerView8.getContext(), R.color.c4));
        RecyclerView recyclerView9 = this.f99943o;
        if (recyclerView9 == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView9.setOverScrollMode(2);
        RecyclerView recyclerView10 = this.f99943o;
        if (recyclerView10 == null) {
            C89219l.m154710a("recyclerView");
        }
        RecyclerView.AbstractC1356f itemAnimator = recyclerView10.getItemAnimator();
        if (itemAnimator == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(itemAnimator, "");
        itemAnimator.f4470l = 0;
        C42858g gVar3 = this.f99942n;
        if (gVar3 == null) {
            C89219l.m154710a("searchSuicidePresenter");
        } else if (gVar3 != null) {
            Object[] objArr = new Object[5];
            objArr[0] = 1;
            C67678d dVar6 = this.f99936b;
            objArr[1] = dVar6 != null ? dVar6.getKeyword() : null;
            objArr[2] = 1;
            objArr[3] = 1;
            objArr[4] = null;
            gVar3.mo57616a(objArr);
        }
        SearchPreventSuicide searchPreventSuicide = this.f99935a;
        if (searchPreventSuicide != null) {
            C89219l.m154721d(searchPreventSuicide, "");
            SearchOperation searchOperation = searchPreventSuicide.searchOperation;
            if (searchOperation != null) {
                C42850d dVar7 = this.f99939e;
                if (dVar7 == null) {
                    C89219l.m154710a("searchSuicideAdapter");
                } else {
                    SearchSuicideInfo searchSuicideInfo = new SearchSuicideInfo();
                    searchSuicideInfo.type = 1;
                    searchSuicideInfo.searchOperation = searchOperation;
                    searchSuicideInfo.globalDoodleConfig = this.f99938d;
                    dVar7.mo63358a((Object) searchSuicideInfo);
                }
            }
            C89219l.m154721d(searchPreventSuicide, "");
            ArrayList arrayList = new ArrayList();
            Tools tools = searchPreventSuicide.tools;
            if (!(tools == null || (list = tools.searchDialInfos) == null)) {
                for (T t : list) {
                    SearchSuicideInfo searchSuicideInfo2 = new SearchSuicideInfo();
                    String str2 = t.type;
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != 114009) {
                            if (hashCode == 114715 && str2.equals("tel")) {
                                i = 2;
                                searchSuicideInfo2.type = i;
                                searchSuicideInfo2.globalDoodleConfig = this.f99938d;
                                searchSuicideInfo2.searchDialInfo = t.searchDialInfo;
                                arrayList.add(searchSuicideInfo2);
                            }
                        } else if (str2.equals("sms")) {
                            i = 3;
                            searchSuicideInfo2.type = i;
                            searchSuicideInfo2.globalDoodleConfig = this.f99938d;
                            searchSuicideInfo2.searchDialInfo = t.searchDialInfo;
                            arrayList.add(searchSuicideInfo2);
                        }
                    }
                    i = -1;
                    searchSuicideInfo2.type = i;
                    searchSuicideInfo2.globalDoodleConfig = this.f99938d;
                    searchSuicideInfo2.searchDialInfo = t.searchDialInfo;
                    arrayList.add(searchSuicideInfo2);
                }
            }
            C42850d dVar8 = this.f99939e;
            if (dVar8 == null) {
                C89219l.m154710a("searchSuicideAdapter");
            } else {
                dVar8.mo62376b(arrayList);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.au8, viewGroup, false);
    }
}
