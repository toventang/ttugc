package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57346a;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57347b;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.AbstractC57383a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b.C57390a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3339e.C57407a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.KidsFeedViewModel;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.FeedSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.LoadMoreFrameLayout;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b */
public final class C57487b extends AbstractC34586a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: m */
    public static final C57488a f131116m = new C57488a((byte) 0);

    /* renamed from: a */
    public final C57407a f131117a = new C57407a();

    /* renamed from: b */
    public AbstractC57401a f131118b;

    /* renamed from: c */
    public String f131119c;

    /* renamed from: d */
    public boolean f131120d;

    /* renamed from: e */
    FeedSwipeRefreshLayout f131121e;

    /* renamed from: j */
    public LoadMoreFrameLayout f131122j;

    /* renamed from: k */
    View f131123k;

    /* renamed from: l */
    public KidsFeedViewModel f131124l;

    /* renamed from: n */
    private final AbstractC89244h f131125n = C89250i.m154773a((AbstractC89171a) new C57490c(this));

    /* renamed from: o */
    private final AbstractC89244h f131126o = C89250i.m154773a((AbstractC89171a) new C57489b(this));

    /* renamed from: p */
    private final AbstractC89244h f131127p = C89250i.m154773a((AbstractC89171a) new C57501n(this));

    /* renamed from: q */
    private boolean f131128q;

    /* renamed from: r */
    private TuxStatusView f131129r;

    /* renamed from: s */
    private View f131130s;

    /* renamed from: t */
    private TuxTextView f131131t;

    /* renamed from: u */
    private View f131132u;

    /* renamed from: v */
    private HashMap f131133v;

    static {
        Covode.recordClassIndex(67422);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(84, new RunnableC90250g(C57487b.class, "onReportEvent", C57347b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(85, new RunnableC90250g(C57487b.class, "onChangeDiggEvent", C57346a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$a */
    public static final class C57488a {
        static {
            Covode.recordClassIndex(67423);
        }

        private C57488a() {
        }

        public /* synthetic */ C57488a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$d */
    public static final class C57491d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57487b f131136a;

        static {
            Covode.recordClassIndex(67426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57491d(C57487b bVar) {
            super(0);
            this.f131136a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C57487b.m104159a(this.f131136a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$f */
    static final class C57493f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57487b f131138a;

        static {
            Covode.recordClassIndex(67428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57493f(C57487b bVar) {
            super(0);
            this.f131138a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C57487b.m104159a(this.f131138a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$h */
    static final class C57495h implements AbstractC57383a {

        /* renamed from: a */
        final /* synthetic */ C57487b f131140a;

        static {
            Covode.recordClassIndex(67430);
        }

        C57495h(C57487b bVar) {
            this.f131140a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.AbstractC57383a
        /* renamed from: a */
        public final void mo94649a() {
            this.f131140a.mo94744b();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$e */
    static final class C57492e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C57487b f131137a;

        static {
            Covode.recordClassIndex(67427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57492e(C57487b bVar) {
            super(0);
            this.f131137a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            this.f131137a.mo94744b();
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: G */
    public final SparseArray<AbstractC81911c> mo61042G() {
        SparseArray<AbstractC81911c> G = super.mo61042G();
        C89219l.m154716b(G, "");
        G.append(0, this.f131117a);
        return G;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f131133v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$b */
    static final class C57489b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C57487b f131134a;

        static {
            Covode.recordClassIndex(67424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57489b(C57487b bVar) {
            super(0);
            this.f131134a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f131134a.getArguments();
            if (arguments != null) {
                return arguments.getString("current_id");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$c */
    static final class C57490c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C57487b f131135a;

        static {
            Covode.recordClassIndex(67425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57490c(C57487b bVar) {
            super(0);
            this.f131135a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f131135a.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$n */
    static final class C57501n extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C57487b f131146a;

        static {
            Covode.recordClassIndex(67436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57501n(C57487b bVar) {
            super(0);
            this.f131146a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f131146a.getArguments();
            if (arguments == null || (string = arguments.getString("title")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: c */
    private final void m104161c() {
        TuxStatusView tuxStatusView = this.f131129r;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        tuxStatusView.setVisibility(0);
        View view = this.f131130s;
        if (view == null) {
            C89219l.m154710a("statusBackgroundView");
        }
        view.setVisibility(0);
    }

    /* renamed from: d */
    private final void m104162d() {
        TuxStatusView tuxStatusView = this.f131129r;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        tuxStatusView.setVisibility(8);
        View view = this.f131130s;
        if (view == null) {
            C89219l.m154710a("statusBackgroundView");
        }
        view.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo94742a() {
        if (this.f131120d) {
            this.f131120d = false;
            this.f131117a.mo94675g();
            return;
        }
        this.f131117a.mo94673e();
    }

    /* renamed from: b */
    public final void mo94744b() {
        AbstractC88412b bVar;
        AbstractC57401a aVar = this.f131118b;
        if (aVar != null && aVar.mo94661c()) {
            Context context = getContext();
            if (context != null) {
                C89219l.m154716b(context, "");
                if (!C80422fe.m139425a(context)) {
                    new C23144b(this).mo37640e(R.string.dcq).mo37637b();
                    return;
                }
            }
            KidsFeedViewModel kidsFeedViewModel = this.f131124l;
            if (kidsFeedViewModel == null) {
                C89219l.m154710a("feedViewModel");
            }
            if (kidsFeedViewModel.f131100h != null) {
                AbstractC88412b bVar2 = kidsFeedViewModel.f131099g;
                if (!(bVar2 == null || bVar2.isDisposed() || (bVar = kidsFeedViewModel.f131099g) == null)) {
                    bVar.dispose();
                }
                kidsFeedViewModel.f131099g = kidsFeedViewModel.f131100h.mo94664f().mo143292d(new KidsFeedViewModel.C57478d(kidsFeedViewModel)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new KidsFeedViewModel.C57479e(kidsFeedViewModel), new KidsFeedViewModel.C57480f(kidsFeedViewModel));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$g */
    static final class C57494g implements SwipeRefreshLayout.AbstractC34634b {

        /* renamed from: a */
        final /* synthetic */ C57487b f131139a;

        static {
            Covode.recordClassIndex(67429);
        }

        C57494g(C57487b bVar) {
            this.f131139a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.AbstractC34634b
        /* renamed from: a */
        public final void mo59551a() {
            AbstractC88412b bVar;
            C57487b bVar2 = this.f131139a;
            AbstractC57401a aVar = bVar2.f131118b;
            if (aVar == null || !aVar.mo94660b()) {
                FeedSwipeRefreshLayout feedSwipeRefreshLayout = bVar2.f131121e;
                if (feedSwipeRefreshLayout == null) {
                    C89219l.m154710a("refreshLayout");
                }
                feedSwipeRefreshLayout.setRefreshing(false);
                return;
            }
            Context context = bVar2.getContext();
            if (context != null) {
                C89219l.m154716b(context, "");
                if (!C80422fe.m139425a(context)) {
                    new C23144b(bVar2).mo37640e(R.string.dcq).mo37637b();
                    FeedSwipeRefreshLayout feedSwipeRefreshLayout2 = bVar2.f131121e;
                    if (feedSwipeRefreshLayout2 == null) {
                        C89219l.m154710a("refreshLayout");
                    }
                    if (feedSwipeRefreshLayout2.f81728b) {
                        FeedSwipeRefreshLayout feedSwipeRefreshLayout3 = bVar2.f131121e;
                        if (feedSwipeRefreshLayout3 == null) {
                            C89219l.m154710a("refreshLayout");
                        }
                        feedSwipeRefreshLayout3.setRefreshing(false);
                        return;
                    }
                    return;
                }
            }
            KidsFeedViewModel kidsFeedViewModel = bVar2.f131124l;
            if (kidsFeedViewModel == null) {
                C89219l.m154710a("feedViewModel");
            }
            if (kidsFeedViewModel.f131100h != null) {
                AbstractC88412b bVar3 = kidsFeedViewModel.f131098f;
                if (!(bVar3 == null || bVar3.isDisposed() || (bVar = kidsFeedViewModel.f131098f) == null)) {
                    bVar.dispose();
                }
                kidsFeedViewModel.f131098f = kidsFeedViewModel.f131100h.mo94663e().mo143292d(new KidsFeedViewModel.C57481g(kidsFeedViewModel)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new KidsFeedViewModel.C57482h(kidsFeedViewModel), new KidsFeedViewModel.C57483i(kidsFeedViewModel));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C80298cg.m139204a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$i */
    static final class View$OnClickListenerC57496i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57487b f131141a;

        static {
            Covode.recordClassIndex(67431);
        }

        View$OnClickListenerC57496i(C57487b bVar) {
            this.f131141a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f131141a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ KidsFeedViewModel m104159a(C57487b bVar) {
        KidsFeedViewModel kidsFeedViewModel = bVar.f131124l;
        if (kidsFeedViewModel == null) {
            C89219l.m154710a("feedViewModel");
        }
        return kidsFeedViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ LoadMoreFrameLayout m104160b(C57487b bVar) {
        LoadMoreFrameLayout loadMoreFrameLayout = bVar.f131122j;
        if (loadMoreFrameLayout == null) {
            C89219l.m154710a("loadMoreLayout");
        }
        return loadMoreFrameLayout;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$l */
    static final class C57499l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57487b f131144a;

        static {
            Covode.recordClassIndex(67434);
        }

        C57499l(C57487b bVar) {
            this.f131144a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C57487b bVar = this.f131144a;
            C89219l.m154716b(num, "");
            bVar.mo94743a(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$m */
    static final class C57500m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57487b f131145a;

        static {
            Covode.recordClassIndex(67435);
        }

        C57500m(C57487b bVar) {
            this.f131145a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C57487b bVar = this.f131145a;
            C89219l.m154716b(num, "");
            bVar.mo94743a(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$k */
    static final class C57498k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57487b f131143a;

        static {
            Covode.recordClassIndex(67433);
        }

        C57498k(C57487b bVar) {
            this.f131143a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C57487b.m104160b(this.f131143a).mo94776a();
                return;
            }
            LoadMoreFrameLayout b = C57487b.m104160b(this.f131143a);
            DmtStatusView a = b.mo94775a(true);
            if (a != null) {
                a.mo27385g();
            }
            b.f131185d = 1;
            if (b.f131182a != null) {
                b.mo94777b();
            }
            if (b.f131187f != -1 && !TextUtils.isEmpty(b.f131188g)) {
                b.f131187f = -1;
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onChangeDiggEvent(C57346a aVar) {
        C89219l.m154721d(aVar, "");
        KidsFeedViewModel kidsFeedViewModel = this.f131124l;
        if (kidsFeedViewModel == null) {
            C89219l.m154710a("feedViewModel");
        }
        C89219l.m154721d(aVar, "");
        List<Aweme> value = kidsFeedViewModel.f131093a.getValue();
        if (value == null) {
            value = C89086z.INSTANCE;
        }
        for (Aweme aweme : value) {
            if (aweme.getAid().equals(aVar.f130718a)) {
                aweme.setUserDigg(aVar.f130719b ? 1 : 0);
                AwemeStatistics statistics = aweme.getStatistics();
                C89219l.m154716b(statistics, "");
                statistics.setDiggCount(statistics.getDiggCount() - 1);
                return;
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onReportEvent(C57347b bVar) {
        C89219l.m154721d(bVar, "");
        this.f131120d = true;
        KidsFeedViewModel kidsFeedViewModel = this.f131124l;
        if (kidsFeedViewModel == null) {
            C89219l.m154710a("feedViewModel");
        }
        C89219l.m154721d(bVar, "");
        List<Aweme> value = kidsFeedViewModel.f131093a.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        Iterator<Aweme> it = value.iterator();
        while (it.hasNext()) {
            if (it.next().getAid().equals(bVar.f130720a)) {
                it.remove();
            }
        }
        kidsFeedViewModel.f131093a.postValue(value);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.b$j */
    static final class C57497j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57487b f131142a;

        static {
            Covode.recordClassIndex(67432);
        }

        C57497j(C57487b bVar) {
            this.f131142a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            C57407a aVar = this.f131142a.f131117a;
            C89219l.m154716b(list, "");
            List<Aweme> g = C89070n.m154585g((Collection) list);
            C89219l.m154721d(g, "");
            aVar.f130872l = g;
            if (aVar.f130870j == 0) {
                aVar.f130867g = true;
                aVar.f130869i = true;
            }
            C57390a aVar2 = aVar.f130865e;
            if (aVar2 == null) {
                C89219l.m154710a("feedAdapter");
            }
            aVar2.mo94653a(aVar.f130872l);
            if (list.isEmpty()) {
                this.f131142a.f131117a.mo94674f();
            } else if (this.f131142a.f131120d && this.f131142a.f43437f) {
                this.f131142a.f131120d = false;
                this.f131142a.f131117a.mo94675g();
            } else if (C80537hk.m139613a(this.f131142a.f131119c)) {
                KidsFeedViewModel a = C57487b.m104159a(this.f131142a);
                String str = this.f131142a.f131119c;
                if (str == null) {
                    str = "";
                }
                C89219l.m154721d(str, "");
                List<Aweme> value = a.f131093a.getValue();
                if (value == null) {
                    value = C89086z.INSTANCE;
                }
                Iterator<T> it = value.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = 0;
                        break;
                    } else if (TextUtils.equals(it.next().getAid(), str)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < list.size()) {
                    VerticalViewPager verticalViewPager = this.f131142a.f131117a.f130861a;
                    if (verticalViewPager == null) {
                        C89219l.m154710a("viewPager");
                    }
                    verticalViewPager.mo94821a(i, false);
                }
                this.f131142a.f131119c = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo94743a(int i) {
        if (i == -2) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            if (this.f131128q) {
                m104162d();
            } else {
                TuxStatusView tuxStatusView = this.f131129r;
                if (tuxStatusView == null) {
                    C89219l.m154710a("statusView");
                }
                tuxStatusView.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C57491d(this)));
                m104161c();
            }
            this.f131117a.mo94674f();
        } else if (i == -1) {
            m104161c();
            TuxStatusView tuxStatusView2 = this.f131129r;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("statusView");
            }
            TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
            String string = getString(R.string.cvn);
            C89219l.m154716b(string, "");
            tuxStatusView2.setStatus(cVar.mo37878a((CharSequence) string));
            this.f131117a.mo94674f();
        } else if (i == 0) {
            this.f131128q = true;
            m104162d();
        }
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.f131121e;
        if (feedSwipeRefreshLayout == null) {
            C89219l.m154710a("refreshLayout");
        }
        if (feedSwipeRefreshLayout.f81728b) {
            FeedSwipeRefreshLayout feedSwipeRefreshLayout2 = this.f131121e;
            if (feedSwipeRefreshLayout2 == null) {
                C89219l.m154710a("refreshLayout");
            }
            feedSwipeRefreshLayout2.setRefreshing(false);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        AbstractC88412b bVar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C57407a aVar = this.f131117a;
        String str = (String) this.f131125n.getValue();
        C89219l.m154716b(str, "");
        C89219l.m154721d(str, "");
        aVar.f130873m = str;
        this.f131117a.f130874n = (String) this.f131126o.getValue();
        this.f131117a.mo70393a(view, bundle);
        View findViewById = view.findViewById(R.id.b04);
        C89219l.m154716b(findViewById, "");
        this.f131121e = (FeedSwipeRefreshLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.b03);
        C89219l.m154716b(findViewById2, "");
        this.f131122j = (LoadMoreFrameLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.b05);
        C89219l.m154716b(findViewById3, "");
        this.f131129r = (TuxStatusView) findViewById3;
        View findViewById4 = view.findViewById(R.id.e79);
        C89219l.m154716b(findViewById4, "");
        this.f131130s = findViewById4;
        View findViewById5 = view.findViewById(R.id.b0_);
        C89219l.m154716b(findViewById5, "");
        this.f131131t = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.b00);
        C89219l.m154716b(findViewById6, "");
        this.f131123k = findViewById6;
        this.f131117a.f130871k = new C57492e(this);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        if (!C80422fe.m139425a(context)) {
            TuxStatusView tuxStatusView = this.f131129r;
            if (tuxStatusView == null) {
                C89219l.m154710a("statusView");
            }
            tuxStatusView.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C57493f(this)));
        } else {
            TuxStatusView tuxStatusView2 = this.f131129r;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("statusView");
            }
            tuxStatusView2.mo37867a();
        }
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.f131121e;
        if (feedSwipeRefreshLayout == null) {
            C89219l.m154710a("refreshLayout");
        }
        AbstractC57401a aVar2 = this.f131118b;
        if (aVar2 == null || !aVar2.mo94660b()) {
            z = false;
        } else {
            z = true;
        }
        feedSwipeRefreshLayout.setCanTouch(z);
        FeedSwipeRefreshLayout feedSwipeRefreshLayout2 = this.f131121e;
        if (feedSwipeRefreshLayout2 == null) {
            C89219l.m154710a("refreshLayout");
        }
        feedSwipeRefreshLayout2.setOnRefreshListener(new C57494g(this));
        LoadMoreFrameLayout loadMoreFrameLayout = this.f131122j;
        if (loadMoreFrameLayout == null) {
            C89219l.m154710a("loadMoreLayout");
        }
        loadMoreFrameLayout.setLoadMoreListener(new C57495h(this));
        View findViewById7 = view.findViewById(R.id.b09);
        C89219l.m154716b(findViewById7, "");
        this.f131132u = findViewById7;
        AbstractC57401a aVar3 = this.f131118b;
        if (aVar3 == null || !aVar3.mo94659a()) {
            View view2 = this.f131132u;
            if (view2 == null) {
                C89219l.m154710a("backButton");
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.f131132u;
            if (view3 == null) {
                C89219l.m154710a("backButton");
            }
            view3.setVisibility(0);
            View view4 = this.f131132u;
            if (view4 == null) {
                C89219l.m154710a("backButton");
            }
            view4.setOnClickListener(new View$OnClickListenerC57496i(this));
        }
        TuxTextView tuxTextView = this.f131131t;
        if (tuxTextView == null) {
            C89219l.m154710a("detailTextView");
        }
        tuxTextView.setText((String) this.f131127p.getValue());
        KidsFeedViewModel kidsFeedViewModel = new KidsFeedViewModel(this.f131118b);
        this.f131124l = kidsFeedViewModel;
        kidsFeedViewModel.f131093a.observe(this, new C57497j(this));
        KidsFeedViewModel kidsFeedViewModel2 = this.f131124l;
        if (kidsFeedViewModel2 == null) {
            C89219l.m154710a("feedViewModel");
        }
        kidsFeedViewModel2.f131096d.observe(this, new C57498k(this));
        KidsFeedViewModel kidsFeedViewModel3 = this.f131124l;
        if (kidsFeedViewModel3 == null) {
            C89219l.m154710a("feedViewModel");
        }
        kidsFeedViewModel3.f131095c.observe(this, new C57499l(this));
        KidsFeedViewModel kidsFeedViewModel4 = this.f131124l;
        if (kidsFeedViewModel4 == null) {
            C89219l.m154710a("feedViewModel");
        }
        kidsFeedViewModel4.f131094b.observe(this, new C57500m(this));
        m104161c();
        KidsFeedViewModel kidsFeedViewModel5 = this.f131124l;
        if (kidsFeedViewModel5 == null) {
            C89219l.m154710a("feedViewModel");
        }
        if (kidsFeedViewModel5.f131100h != null) {
            AbstractC88412b bVar2 = kidsFeedViewModel5.f131097e;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = kidsFeedViewModel5.f131097e) == null)) {
                bVar.dispose();
            }
            kidsFeedViewModel5.f131097e = kidsFeedViewModel5.f131100h.mo94662d().mo143292d(new KidsFeedViewModel.C57475a(kidsFeedViewModel5)).mo143254a(new KidsFeedViewModel.C57476b(kidsFeedViewModel5), new KidsFeedViewModel.C57477c(kidsFeedViewModel5));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.acn, viewGroup, false);
    }
}
