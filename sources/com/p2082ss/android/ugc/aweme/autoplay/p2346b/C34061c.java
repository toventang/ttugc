package com.p2082ss.android.ugc.aweme.autoplay.p2346b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.app.C33593ai;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34107a;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34152h;
import com.p2082ss.android.ugc.aweme.discover.activity.C41571b;
import com.p2082ss.android.ugc.aweme.discover.activity.SearchLiveListActivity;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42321c;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41541n;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42813a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.p2226a.C31292a;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.EnumC67453i;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.autoplay.b.c */
public final class C34061c extends AbstractC34152h {

    /* renamed from: c */
    public static final C34062a f80541c = new C34062a((byte) 0);

    /* renamed from: a */
    public int f80542a = -1;

    /* renamed from: b */
    public final ScrollToOpenLayout f80543b;

    /* renamed from: k */
    private final View f80544k;

    /* renamed from: l */
    private final AbstractC89244h f80545l;

    static {
        Covode.recordClassIndex(40995);
    }

    /* renamed from: j */
    private final AbstractC34057a m69640j() {
        return (AbstractC34057a) this.f80545l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.c$a */
    public static final class C34062a {
        static {
            Covode.recordClassIndex(40996);
        }

        private C34062a() {
        }

        public /* synthetic */ C34062a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.c$b */
    static final class C34063b extends AbstractC89220m implements AbstractC89171a<AbstractC34057a> {

        /* renamed from: a */
        final /* synthetic */ C34061c f80546a;

        /* renamed from: b */
        final /* synthetic */ C41827d f80547b;

        static {
            Covode.recordClassIndex(40997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34063b(C34061c cVar, C41827d dVar) {
            super(0);
            this.f80546a = cVar;
            this.f80547b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC34057a invoke() {
            AbstractC34107a eVar;
            if (C41541n.m83478a()) {
                eVar = new C34093f(this.f80546a.mo60489h().mo60498g(), this.f80546a.mo60489h().mo60497a(), this.f80546a.mo60484a());
            } else {
                View view = this.f80547b.itemView;
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                eVar = new C34089e(context, this.f80546a.mo60489h().mo60498g(), this.f80546a.mo60489h().mo60497a(), this.f80546a.mo60484a());
            }
            this.f80546a.mo60485a(eVar);
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.c$d */
    static final class View$OnTouchListenerC34065d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C34061c f80549a;

        /* renamed from: b */
        final /* synthetic */ C67568r f80550b;

        /* renamed from: c */
        final /* synthetic */ C42411h f80551c;

        static {
            Covode.recordClassIndex(40999);
        }

        View$OnTouchListenerC34065d(C34061c cVar, C67568r rVar, C42411h hVar) {
            this.f80549a = cVar;
            this.f80550b = rVar;
            this.f80551c = hVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            NextLiveData<C33593ai> nextLiveData;
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            int i = this.f80549a.f80542a;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            if (i <= C89241a.m154730a(TypedValue.applyDimension(1, 80.0f, system.getDisplayMetrics()))) {
                return false;
            }
            if (!C31292a.m65465a()) {
                Context context = GlobalContext.getContext();
                C89219l.m154716b(context, "");
                C41571b bVar = new C41571b();
                bVar.setSearchKeyword(this.f80550b.f151311f);
                bVar.setEnterFrom(this.f80550b.f151312g);
                bVar.setSearchId("searchId");
                bVar.setSearchType("general");
                bVar.setRoomIdList(C42813a.m85509a(this.f80551c.f98805o.f98566a));
                bVar.setEnterMethod("swipe_more_general_list");
                bVar.setFromSearchSubtag("general_search");
                bVar.setPreSearchId(this.f80550b.f151315j);
                SearchLiveListActivity.C41564a.m83502a(context, bVar, C67446h.f151111a.mo106216e());
                return false;
            }
            C42452d.f98938j = true;
            SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
            if (searchTabViewModel == null || (nextLiveData = searchTabViewModel.tabInfo) == null) {
                return false;
            }
            nextLiveData.setValue(new C33593ai(EnumC67453i.LIVE.getTabName()));
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34061c(C41827d dVar, AbstractC51043a aVar, AbstractC51044b bVar, View view) {
        super(dVar, aVar, bVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        this.f80545l = C89250i.m154773a((AbstractC89171a) new C34063b(this, dVar));
        ScrollToOpenLayout scrollToOpenLayout = (ScrollToOpenLayout) view.findViewById(R.id.dq8);
        C89219l.m154716b(scrollToOpenLayout, "");
        this.f80543b = scrollToOpenLayout;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fet);
        C89219l.m154716b(linearLayout, "");
        this.f80544k = linearLayout;
    }

    /* renamed from: a */
    public final void mo60351a(C42321c cVar, C42410g gVar, C42411h hVar, C67568r rVar) {
        List<? extends Aweme> list;
        Long l;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(rVar, "");
        if (cVar == null || (list = cVar.f98566a) == null) {
            list = C89086z.INSTANCE;
        }
        mo60487a(list);
        List<? extends Aweme> list2 = this.f80763f;
        if (list2 == null) {
            C89219l.m154715b();
        }
        super.mo70985a(list2, m69640j());
        m69640j().f80531b = rVar;
        AbstractC34057a j = m69640j();
        List<? extends Aweme> list3 = this.f80763f;
        if (list3 == null) {
            C89219l.m154715b();
        }
        if (cVar != null) {
            l = cVar.f98569d;
        } else {
            l = null;
        }
        AbstractC34057a.m69631a(j, list3, gVar, l, false, 8);
        this.f80542a = -1;
        if (!C89219l.m154714a((Object) hVar.f98805o.f98568c, (Object) true) || C16048b.m29633a().mo25412a(true, "search_live_swipe_see_more", 0) != 1) {
            this.f80543b.setEnable(false);
            this.f80544k.setVisibility(8);
            return;
        }
        this.f80543b.setEnable(true);
        this.f80544k.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f80543b.setOnScrollChangeListener(new View$OnScrollChangeListenerC34064c(this));
        }
        this.f97564j.f97566a.setOnTouchListener(new View$OnTouchListenerC34065d(this, rVar, hVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.c$c */
    static final class View$OnScrollChangeListenerC34064c implements View.OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ C34061c f80548a;

        static {
            Covode.recordClassIndex(40998);
        }

        View$OnScrollChangeListenerC34064c(C34061c cVar) {
            this.f80548a = cVar;
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (C23163i.m43664a(this.f80548a.f80543b)) {
                i = -i;
            }
            this.f80548a.f80542a = i;
        }
    }
}
