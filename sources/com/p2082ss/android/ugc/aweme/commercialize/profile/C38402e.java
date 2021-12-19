package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.widget.C34745b;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35672z;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2957n.C49763p;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e */
public final class C38402e extends AbstractC34586a implements AbstractC35500d, AbstractC39102c<Aweme>, C39211a.AbstractC39212a, AbstractC49762o {

    /* renamed from: e */
    public static final C38403a f90733e = new C38403a((byte) 0);

    /* renamed from: a */
    public RecyclerView f90734a;

    /* renamed from: b */
    public RecyclerView.AbstractC1362i f90735b;

    /* renamed from: c */
    public AwemeRawAd f90736c;

    /* renamed from: d */
    public long f90737d;

    /* renamed from: j */
    private DmtStatusView f90738j;

    /* renamed from: k */
    private C38397b f90739k;

    /* renamed from: l */
    private String f90740l = "";

    /* renamed from: m */
    private String f90741m = "";

    /* renamed from: n */
    private String f90742n = "";

    /* renamed from: o */
    private String f90743o = "";

    /* renamed from: p */
    private boolean f90744p;

    /* renamed from: q */
    private C38391a f90745q;

    /* renamed from: r */
    private final List<String> f90746r = new ArrayList();

    /* renamed from: s */
    private final Map<String, Boolean> f90747s = new HashMap();

    /* renamed from: t */
    private HashMap f90748t;

    static {
        Covode.recordClassIndex(45909);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Aweme> list, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Aweme> list, boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$a */
    public static final class C38403a {
        static {
            Covode.recordClassIndex(45910);
        }

        private C38403a() {
        }

        public /* synthetic */ C38403a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        mo66999a();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final boolean bn_() {
        return this.f90744p;
    }

    /* renamed from: c */
    private final boolean m77829c() {
        C38391a aVar = this.f90745q;
        if (aVar == null || aVar.getItemCount() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f90748t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        if (m77829c()) {
            DmtStatusView dmtStatusView = this.f90738j;
            if (dmtStatusView == null) {
                C89219l.m154710a("mStatusView");
            }
            dmtStatusView.mo27384f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        if (af_()) {
            DmtStatusView dmtStatusView = this.f90738j;
            if (dmtStatusView == null) {
                C89219l.m154710a("mStatusView");
            }
            dmtStatusView.mo27387h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        if (!af_()) {
            return null;
        }
        RecyclerView recyclerView = this.f90734a;
        if (recyclerView == null) {
            C89219l.m154710a("mListView");
        }
        return recyclerView;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC38404b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C38402e f90749a;

        static {
            Covode.recordClassIndex(45911);
        }

        public final void onGlobalLayout() {
            RecyclerView.AbstractC1362i iVar = this.f90749a.f90735b;
            if (iVar == null) {
                C89219l.m154710a("mLayoutManager");
            }
            if (!(iVar instanceof WrapGridLayoutManager)) {
                iVar = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
            if (linearLayoutManager == null || linearLayoutManager.mo4371k() != -1) {
                this.f90749a.mo67000b(true);
                RecyclerView recyclerView = this.f90749a.f90734a;
                if (recyclerView == null) {
                    C89219l.m154710a("mListView");
                }
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC38404b(C38402e eVar) {
            this.f90749a = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        if (af_()) {
            if (m77829c()) {
                DmtStatusView dmtStatusView = this.f90738j;
                if (dmtStatusView == null) {
                    C89219l.m154710a("mStatusView");
                }
                dmtStatusView.mo27384f();
            }
            C38391a aVar = this.f90745q;
            if (aVar != null) {
                aVar.ao_();
            }
        }
    }

    /* renamed from: a */
    public final void mo66999a() {
        C38391a aVar = this.f90745q;
        if (aVar != null) {
            C38397b bVar = this.f90739k;
            if (bVar == null) {
                C89219l.m154710a("mPresenter");
            }
            Object[] objArr = new Object[8];
            objArr[0] = this.f90741m;
            int i = 1;
            objArr[1] = this.f90742n;
            objArr[2] = Long.valueOf(this.f90737d);
            objArr[3] = 0L;
            objArr[4] = 6;
            List list = ((AbstractC39058d) aVar).f92236l;
            if (!(list == null || list.size() == 0)) {
                i = 4;
            }
            objArr[5] = Integer.valueOf(i);
            objArr[6] = this.f90743o;
            objArr[7] = this.f90740l;
            bVar.mo57616a(objArr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$c */
    public static final class C38405c extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C38402e f90750a;

        static {
            Covode.recordClassIndex(45912);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38405c(C38402e eVar) {
            this.f90750a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 0) {
                this.f90750a.mo67000b(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$d */
    static final class View$OnClickListenerC38406d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38402e f90751a;

        static {
            Covode.recordClassIndex(45913);
        }

        View$OnClickListenerC38406d(C38402e eVar) {
            this.f90751a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90751a.mo66999a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C38391a aVar;
        List list;
        super.setUserVisibleHint(z);
        if (z) {
            C38391a aVar2 = this.f90745q;
            if (aVar2 == null || ((AbstractC39058d) aVar2).f92236l == null || !((aVar = this.f90745q) == null || (list = ((AbstractC39058d) aVar).f92236l) == null || list.size() != 0)) {
                mo66999a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        List list;
        C38391a aVar;
        if (af_()) {
            DmtStatusView dmtStatusView = this.f90738j;
            if (dmtStatusView == null) {
                C89219l.m154710a("mStatusView");
            }
            dmtStatusView.mo27387h();
            C38391a aVar2 = this.f90745q;
            if (aVar2 != null) {
                list = aVar2.mo63369e();
            } else {
                list = null;
            }
            if (!C13603b.m24435a((Collection) list) && (aVar = this.f90745q) != null) {
                aVar.mo67810f();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        if (af_()) {
            C38391a aVar = this.f90745q;
            if (aVar != null && aVar.getItemCount() == 0) {
                DmtStatusView dmtStatusView = this.f90738j;
                if (dmtStatusView == null) {
                    C89219l.m154710a("mStatusView");
                }
                dmtStatusView.mo27382d();
            }
            C38391a aVar2 = this.f90745q;
            if (aVar2 != null) {
                aVar2.mo67824j();
            }
        }
    }

    /* renamed from: b */
    public final void mo67000b(boolean z) {
        int i;
        C38391a aVar;
        List list;
        Aweme aweme;
        List list2;
        RecyclerView.AbstractC1362i iVar = this.f90735b;
        if (iVar == null) {
            C89219l.m154710a("mLayoutManager");
        }
        if (!(iVar instanceof WrapGridLayoutManager)) {
            iVar = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
        if (linearLayoutManager != null) {
            int m = linearLayoutManager.mo4373m();
            this.f90746r.clear();
            if (z && m >= 5) {
                m = 5;
            }
            int i2 = m + 1;
            for (int k = linearLayoutManager.mo4371k(); k < i2; k++) {
                C38391a aVar2 = this.f90745q;
                if (aVar2 == null || (list2 = ((AbstractC39058d) aVar2).f92236l) == null) {
                    i = 0;
                } else {
                    i = list2.size();
                }
                if (k < i && (aVar = this.f90745q) != null && (list = ((AbstractC39058d) aVar).f92236l) != null && (aweme = (Aweme) list.get(k)) != null) {
                    String aid = aweme.getAid();
                    Boolean bool = this.f90747s.get(aid);
                    if (bool == null || !bool.booleanValue()) {
                        C18129a.m33746a("homepage_ad", "othershow", this.f90736c).mo28900b("refer", "video_cover").mo28897a("item_id", aweme.getAid()).mo28901b();
                    }
                    Map<String, Boolean> map = this.f90747s;
                    C89219l.m154716b(aid, "");
                    map.put(aid, true);
                    this.f90746r.add(aid);
                } else {
                    return;
                }
            }
            for (String str : this.f90747s.keySet()) {
                if (!this.f90746r.contains(str)) {
                    this.f90747s.put(str, false);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Aweme> list, boolean z) {
        if (af_()) {
            C38391a aVar = this.f90745q;
            if (aVar != null) {
                aVar.aq_();
            }
            C38397b bVar = this.f90739k;
            if (bVar == null) {
                C89219l.m154710a("mPresenter");
            }
            C38455n nVar = (C38455n) bVar.f92286h;
            Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.FakeUserAwemeModel");
            nVar.mo67017a();
            C38391a aVar2 = this.f90745q;
            if (aVar2 != null) {
                aVar2.mo62377b_(list);
            }
            this.f90744p = z;
            C38391a aVar3 = this.f90745q;
            if (aVar3 != null && aVar3.mo60933c() == 0 && !z) {
                DmtStatusView dmtStatusView = this.f90738j;
                if (dmtStatusView == null) {
                    C89219l.m154710a("mStatusView");
                }
                if (dmtStatusView.mo27389j()) {
                    DmtStatusView dmtStatusView2 = this.f90738j;
                    if (dmtStatusView2 == null) {
                        C89219l.m154710a("mStatusView");
                    }
                    dmtStatusView2.mo27385g();
                    return;
                }
            }
            if (C13603b.m24435a((Collection) list) && z) {
                mo66999a();
            } else if (!C13603b.m24435a((Collection) list)) {
                DmtStatusView dmtStatusView3 = this.f90738j;
                if (dmtStatusView3 == null) {
                    C89219l.m154710a("mStatusView");
                }
                dmtStatusView3.mo27379a(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.aym);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f90734a = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("mListView");
        }
        RecyclerView recyclerView2 = this.f90734a;
        if (recyclerView2 == null) {
            C89219l.m154710a("mListView");
        }
        recyclerView.setOnFlingListener(new C49763p(recyclerView2, this));
        View findViewById2 = view.findViewById(R.id.ayw);
        C89219l.m154716b(findViewById2, "");
        this.f90738j = (DmtStatusView) findViewById2;
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
            tuxTextView.setTuxFont(51);
            tuxTextView.setGravity(17);
            tuxTextView.setTextColor(C0643b.m2378c(context, R.color.c4));
            tuxTextView.setText(R.string.cxj);
            tuxTextView.setOnClickListener(new View$OnClickListenerC38406d(this));
            DmtStatusView dmtStatusView = this.f90738j;
            if (dmtStatusView == null) {
                C89219l.m154710a("mStatusView");
            }
            dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27408c(tuxTextView));
        }
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("user_id")) == null) {
            str = "";
        }
        this.f90741m = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("sec_user_id")) == null) {
            str2 = "";
        }
        this.f90742n = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str3 = arguments3.getString("aweme_id")) == null) {
            str3 = "";
        }
        this.f90740l = str3;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str4 = arguments4.getString("adv_id")) == null) {
            str4 = "";
        }
        this.f90743o = str4;
        RecyclerView recyclerView3 = this.f90734a;
        if (recyclerView3 == null) {
            C89219l.m154710a("mListView");
        }
        recyclerView3.setOverScrollMode(2);
        getActivity();
        this.f90735b = new WrapGridLayoutManager(2, 1);
        RecyclerView recyclerView4 = this.f90734a;
        if (recyclerView4 == null) {
            C89219l.m154710a("mListView");
        }
        RecyclerView.AbstractC1362i iVar = this.f90735b;
        if (iVar == null) {
            C89219l.m154710a("mLayoutManager");
        }
        recyclerView4.setLayoutManager(iVar);
        RecyclerView recyclerView5 = this.f90734a;
        if (recyclerView5 == null) {
            C89219l.m154710a("mListView");
        }
        recyclerView5.mo4402a(new C34745b(2, (int) C13628n.m24520b(getContext(), 1.0f)));
        RecyclerView recyclerView6 = this.f90734a;
        if (recyclerView6 == null) {
            C89219l.m154710a("mListView");
        }
        recyclerView6.mo4405a(new C35672z());
        C38391a aVar = new C38391a(this);
        this.f90745q = aVar;
        String str5 = this.f90740l;
        C89219l.m154721d(str5, "");
        aVar.f90712d = str5;
        RecyclerView recyclerView7 = this.f90734a;
        if (recyclerView7 == null) {
            C89219l.m154710a("mListView");
        }
        recyclerView7.setAdapter(this.f90745q);
        RecyclerView recyclerView8 = this.f90734a;
        if (recyclerView8 == null) {
            C89219l.m154710a("mListView");
        }
        recyclerView8.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC38404b(this));
        C38397b bVar = new C38397b();
        this.f90739k = bVar;
        bVar.mo67839a_(this);
        C38455n nVar = new C38455n();
        C38397b bVar2 = this.f90739k;
        if (bVar2 == null) {
            C89219l.m154710a("mPresenter");
        }
        bVar2.mo67838a((AbstractC39085b) nVar);
        C38405c cVar = new C38405c(this);
        RecyclerView recyclerView9 = this.f90734a;
        if (recyclerView9 == null) {
            C89219l.m154710a("mListView");
        }
        recyclerView9.mo4405a(cVar);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.an2, viewGroup, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d
    /* renamed from: a */
    public final void mo62403a(View view, Aweme aweme, String str) {
        if (!C58001a.m104815a(view, 1200) && aweme != null && getActivity() != null) {
            C38397b bVar = this.f90739k;
            if (bVar == null) {
                C89219l.m154710a("mPresenter");
            }
            C50529ae.f116790a = (AbstractC39100a) bVar.f92286h;
            Bundle bundle = new Bundle();
            bundle.putString("id", aweme.getAid());
            bundle.putString("userid", this.f90741m);
            bundle.putString("sec_userid", this.f90742n);
            bundle.putString("refer", "new_ad_fake_user");
            bundle.putString("video_from", "from_ad_new_fake_user");
            bundle.putString("feed_ad_aweme_id", this.f90740l);
            bundle.putString("feed_adv_id", this.f90743o);
            bundle.putLong("max_cursor", this.f90737d);
            SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/").withParam(bundle).open();
            C18129a.m33746a("homepage_ad", "otherclick", this.f90736c).mo28900b("refer", "video_cover").mo28897a("item_id", aweme.getAid()).mo28901b();
        }
    }
}
