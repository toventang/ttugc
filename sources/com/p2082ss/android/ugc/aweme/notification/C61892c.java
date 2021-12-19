package com.p2082ss.android.ugc.aweme.notification;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.legacy.widget.Space;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.C1764a;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56346e;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.EnumC56341a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61562n;
import com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.adapter.C61830e;
import com.p2082ss.android.ugc.aweme.notification.bean.EnumC61867b;
import com.p2082ss.android.ugc.aweme.notification.bean.EnumC61874i;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61994d;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62173a;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62175b;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62180c;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62183d;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62190e;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62192f;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62193g;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62197h;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.utils.C62275p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62278q;
import com.p2082ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56196c;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.c */
public final class C61892c extends C62208i implements AbstractC2599d, AbstractC61861b, AbstractC90252i, AbstractC90253j {

    /* renamed from: l */
    public static final C61893a f140526l = new C61893a((byte) 0);

    /* renamed from: a */
    public boolean f140527a;

    /* renamed from: b */
    public boolean f140528b;

    /* renamed from: c */
    public boolean f140529c;

    /* renamed from: d */
    public boolean f140530d = true;

    /* renamed from: e */
    final C61909p f140531e;

    /* renamed from: j */
    final C61898e f140532j;

    /* renamed from: k */
    final C61899f f140533k;

    /* renamed from: m */
    private final AbstractC89244h f140534m = C61862a.m111996a(new C61907n(this));

    /* renamed from: n */
    private final AbstractC89244h f140535n = C61862a.m111996a(new C61906m(this));

    /* renamed from: o */
    private final AbstractC89244h f140536o = C61862a.m111996a(C61914t.f140569a);

    /* renamed from: p */
    private final AbstractC89244h f140537p = C61862a.m111996a(new C61916v(this));

    /* renamed from: q */
    private final AbstractC89244h f140538q = C61862a.m111996a(C61894b.f140545a);

    /* renamed from: r */
    private AnalysisStayTimeFragmentComponent f140539r;

    /* renamed from: s */
    private final AbstractC1214u<List<MusNotice>> f140540s;

    /* renamed from: t */
    private final AbstractC1214u<EnumC61874i> f140541t;

    /* renamed from: u */
    private final AbstractC1214u<EnumC61874i> f140542u;

    /* renamed from: v */
    private final AbstractC1214u<C89378p<MusNotice, EnumC61867b>> f140543v;

    /* renamed from: w */
    private SparseArray f140544w;

    /* renamed from: com.ss.android.ugc.aweme.notification.c$r */
    static final class View$OnClickListenerC61912r implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC61912r f140567a = new View$OnClickListenerC61912r();

        static {
            Covode.recordClassIndex(72661);
        }

        View$OnClickListenerC61912r() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(72641);
    }

    /* renamed from: p */
    private final Map<Integer, C61830e> m112021p() {
        return (Map) this.f140538q.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i
    /* renamed from: a */
    public final View mo99986a(int i) {
        if (this.f140544w == null) {
            this.f140544w = new SparseArray();
        }
        View view = (View) this.f140544w.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f140544w.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.analytics.page.AbstractC2599d
    public final String ah_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String bv_() {
        return "NOTIFICATION";
    }

    /* renamed from: e */
    public final SwipeRefreshLayout mo99988e() {
        return (SwipeRefreshLayout) this.f140534m.getValue();
    }

    /* renamed from: g */
    public final RecyclerView mo99989g() {
        return (RecyclerView) this.f140535n.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(203, new RunnableC90250g(C61892c.class, "onResumeRefreshEvent", C61562n.class, ThreadMode.POSTING, 0, false));
        hashMap.put(63, new RunnableC90250g(C61892c.class, "onRefreshMessageButton", C56196c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: i */
    public final C62197h mo99990i() {
        return (C62197h) this.f140536o.getValue();
    }

    /* renamed from: j */
    public final NotificationVM mo99991j() {
        return (NotificationVM) this.f140537p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i
    /* renamed from: n */
    public final void mo99995n() {
        SparseArray sparseArray = this.f140544w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo99995n();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$a */
    public static final class C61893a {
        static {
            Covode.recordClassIndex(72642);
        }

        private C61893a() {
        }

        public /* synthetic */ C61893a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$b */
    static final class C61894b extends AbstractC89220m implements AbstractC89171a<Map<Integer, C61830e>> {

        /* renamed from: a */
        public static final C61894b f140545a = new C61894b();

        static {
            Covode.recordClassIndex(72643);
        }

        C61894b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, C61830e> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$t */
    static final class C61914t extends AbstractC89220m implements AbstractC89171a<C62197h> {

        /* renamed from: a */
        public static final C61914t f140569a = new C61914t();

        static {
            Covode.recordClassIndex(72663);
        }

        C61914t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62197h invoke() {
            return new C62197h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$v */
    static final class C61916v extends AbstractC89220m implements AbstractC89171a<NotificationVM> {

        /* renamed from: a */
        final /* synthetic */ C61892c f140571a;

        static {
            Covode.recordClassIndex(72665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61916v(C61892c cVar) {
            super(0);
            this.f140571a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.C62378a.m112820a(this.f140571a);
        }
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String ag_() {
        return String.valueOf(-1382453013);
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    /* renamed from: c */
    public final Map<String, String> mo7085c() {
        return AbstractC2599d.C2600a.m7545a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$m */
    static final class C61906m extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C61892c f140561a;

        static {
            Covode.recordClassIndex(72655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61906m(C61892c cVar) {
            super(0);
            this.f140561a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return this.f140561a.mo99986a(R.id.dof);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$n */
    static final class C61907n extends AbstractC89220m implements AbstractC89171a<SwipeRefreshLayout> {

        /* renamed from: a */
        final /* synthetic */ C61892c f140562a;

        static {
            Covode.recordClassIndex(72656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61907n(C61892c cVar) {
            super(0);
            this.f140562a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SwipeRefreshLayout invoke() {
            return this.f140562a.mo99986a(R.id.e5x);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.AbstractC61861b
    /* renamed from: h */
    public final String mo99822h() {
        return mo99991j().mo100343b();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        C56346e.m102332a(EnumC56341a.ON_RESUME, new C61903j(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, androidx.fragment.app.Fragment
    public final void onStart() {
        C56346e.m102332a(EnumC56341a.ON_START, new C61904k(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$h */
    static final class C61901h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61892c f140552a;

        /* renamed from: b */
        final /* synthetic */ Bundle f140553b;

        static {
            Covode.recordClassIndex(72650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61901h(C61892c cVar, Bundle bundle) {
            super(0);
            this.f140552a = cVar;
            this.f140553b = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C61892c.super.onCreate(this.f140553b);
            EventBus.m156966a(EventBus.m156962a(), this.f140552a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$i */
    static final class C61902i extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ LayoutInflater f140554a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f140555b;

        static {
            Covode.recordClassIndex(72651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61902i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(0);
            this.f140554a = layoutInflater;
            this.f140555b = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View a = C1764a.m5927a(this.f140554a, R.layout.ki, this.f140555b, false);
            C89219l.m154716b(a, "");
            a.setBackgroundColor(C0643b.m2378c(a.getContext(), R.color.l));
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$j */
    static final class C61903j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61892c f140556a;

        static {
            Covode.recordClassIndex(72652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61903j(C61892c cVar) {
            super(0);
            this.f140556a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C61892c.super.onResume();
            if (this.f140556a.f140528b) {
                this.f140556a.mo99991j().mo100374k();
            }
            this.f140556a.f140528b = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$k */
    static final class C61904k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61892c f140557a;

        static {
            Covode.recordClassIndex(72653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61904k(C61892c cVar) {
            super(0);
            this.f140557a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C61892c.super.onStart();
            UgCommonServiceImpl.m138290j().mo123101b(this.f140557a.getContext());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$q */
    static final class C61910q implements SwipeRefreshLayout.AbstractC1559b {

        /* renamed from: a */
        final /* synthetic */ C61892c f140565a;

        static {
            Covode.recordClassIndex(72659);
        }

        C61910q(C61892c cVar) {
            this.f140565a = cVar;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AbstractC1559b
        public final void onRefresh() {
            if (!this.f140565a.mo99991j().mo100374k()) {
                this.f140565a.mo99988e().post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.C61892c.C61910q.RunnableC619111 */

                    /* renamed from: a */
                    final /* synthetic */ C61910q f140566a;

                    static {
                        Covode.recordClassIndex(72660);
                    }

                    {
                        this.f140566a = r1;
                    }

                    public final void run() {
                        SwipeRefreshLayout e = this.f140566a.f140565a.mo99988e();
                        C89219l.m154716b(e, "");
                        e.setRefreshing(false);
                    }
                });
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        Analysis labelName = new Analysis().setLabelName("message");
        C89219l.m154716b(labelName, "");
        return labelName;
    }

    /* renamed from: m */
    public final void mo99994m() {
        int i;
        View a = mo99986a(R.id.fb2);
        C89219l.m154716b(a, "");
        if (mo99989g().canScrollVertically(-1)) {
            i = 0;
        } else {
            i = 4;
        }
        a.setVisibility(i);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (C56318b.m102311b()) {
            C61968c.m112098c();
        }
        EventBus.m156962a().mo145395b(this);
    }

    public C61892c() {
        C56346e.m102336b();
        C61968c.HandlerC61971c b = C61968c.m112097b();
        if (b != null) {
            b.mo100043j();
        }
        this.f140531e = new C61909p(this);
        this.f140532j = new C61898e(this);
        this.f140533k = new C61899f(this);
        this.f140540s = new C61895c(this);
        this.f140541t = new C61908o(this);
        this.f140542u = new C61900g(this);
        this.f140543v = new C61897d(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i
    /* renamed from: l */
    public final List<C62208i.C62209a> mo99993l() {
        return C89070n.m154522b(mo99990i(), new C62175b(), new C62180c(), new C62173a(), new C62183d(), new C62193g(), new C62190e(), new C62192f());
    }

    /* renamed from: k */
    public final C61830e mo99992k() {
        C61830e eVar = m112021p().get(Integer.valueOf(mo99991j().mo100337a()));
        if (eVar == null) {
            eVar = new C61830e(this);
            DmtStatusView h = mo99990i().mo100196h();
            C89219l.m154721d(h, "");
            eVar.f140383a = h;
            C62208i.C62209a aVar = mo100204o().get(C62193g.class);
            C62192f fVar = null;
            if (!(aVar instanceof C62193g)) {
                aVar = null;
            }
            C62193g gVar = (C62193g) aVar;
            if (gVar != null) {
                C62193g gVar2 = gVar;
                C89219l.m154721d(gVar2, "");
                eVar.f140384b = gVar2;
                C62208i.C62209a aVar2 = mo100204o().get(C62192f.class);
                if (aVar2 instanceof C62192f) {
                    fVar = aVar2;
                }
                C62192f fVar2 = fVar;
                if (fVar2 != null) {
                    C62192f fVar3 = fVar2;
                    C89219l.m154721d(fVar3, "");
                    eVar.f140385c = fVar3;
                    m112021p().put(Integer.valueOf(mo99991j().mo100337a()), eVar);
                } else {
                    throw new IllegalStateException("Cannot find widget: " + C62192f.class.getSimpleName());
                }
            } else {
                throw new IllegalStateException("Cannot find widget: " + C62193g.class.getSimpleName());
            }
        }
        return eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$l */
    static final class C61905l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61892c f140558a;

        /* renamed from: b */
        final /* synthetic */ View f140559b;

        /* renamed from: c */
        final /* synthetic */ Bundle f140560c;

        static {
            Covode.recordClassIndex(72654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61905l(C61892c cVar, View view, Bundle bundle) {
            super(0);
            this.f140558a = cVar;
            this.f140559b = view;
            this.f140560c = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            String str;
            C61892c.super.onViewCreated(this.f140559b, this.f140560c);
            C62262g.m112636b(this.f140559b.getContext());
            C61892c cVar = this.f140558a;
            this.f140559b.setBackgroundColor(cVar.getResources().getColor(R.color.l));
            View a = cVar.mo99986a(R.id.faz);
            C89219l.m154716b(a, "");
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            Context context = cVar.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            layoutParams.height = i;
            ((RelativeLayout) cVar.mo99986a(R.id.dm7)).setOnClickListener(View$OnClickListenerC61912r.f140567a);
            cVar.mo99988e().setOnRefreshListener(new C61910q(cVar));
            cVar.getContext();
            FixedLinearlayoutManager fixedLinearlayoutManager = new FixedLinearlayoutManager();
            RecyclerView g = cVar.mo99989g();
            C89219l.m154716b(g, "");
            g.setAdapter(cVar.mo99992k());
            RecyclerView g2 = cVar.mo99989g();
            C89219l.m154716b(g2, "");
            g2.setLayoutManager(fixedLinearlayoutManager);
            C62278q.m112666a(cVar.mo99989g(), cVar.mo99988e());
            cVar.mo99989g().mo4405a(cVar.f140531e);
            cVar.mo99989g().mo4402a(cVar.f140532j);
            C62275p pVar = new C62275p();
            RecyclerView g3 = cVar.mo99989g();
            C89219l.m154716b(g3, "");
            pVar.mo100266a(g3, fixedLinearlayoutManager, cVar.f140533k);
            LogHelper a2 = LogHelperImpl.m77303a();
            RecyclerView g4 = cVar.mo99989g();
            C89219l.m154716b(g4, "");
            a2.mo66431a("mus_new_notification", g4);
            if (C56318b.m102311b()) {
                TuxIconView tuxIconView = (TuxIconView) cVar.mo99986a(R.id.ph);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                Space space = (Space) cVar.mo99986a(R.id.u8);
                C89219l.m154716b(space, "");
                space.setVisibility(8);
                ((TuxIconView) cVar.mo99986a(R.id.ph)).setOnClickListener(new View$OnClickListenerC61913s(cVar));
                C23073a.C23074a.m43506a(cVar).mo37501c(R.attr.m).mo37505f(R.attr.m).mo37495a(true).f54627a.mo33415d();
            }
            C61892c cVar2 = this.f140558a;
            ActivityC0945e activity = cVar2.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                boolean booleanExtra = intent.getBooleanExtra("is_from_push", false);
                NotificationVM j = cVar2.mo99991j();
                if (booleanExtra) {
                    str = "push";
                } else {
                    str = "message";
                }
                j.mo100342a(str);
            }
            C61892c cVar3 = this.f140558a;
            cVar3.mo99991j().mo100344c().observe(cVar3, new C61915u(cVar3));
            cVar3.mo99987a(cVar3.mo99991j().mo100337a(), true);
            cVar3.mo99991j().mo100374k();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$e */
    public static final class C61898e extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        final /* synthetic */ C61892c f140549a;

        static {
            Covode.recordClassIndex(72647);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61898e(C61892c cVar) {
            this.f140549a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            if (RecyclerView.m4277d(view) == this.f140549a.mo99992k().getItemCount() - 1) {
                rect.bottom = (int) C13628n.m24520b(this.f140549a.getContext(), 19.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$f */
    public static final class C61899f implements C62275p.AbstractC62276a {

        /* renamed from: a */
        final /* synthetic */ C61892c f140550a;

        static {
            Covode.recordClassIndex(72648);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61899f(C61892c cVar) {
            this.f140550a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.utils.C62275p.AbstractC62276a
        /* renamed from: a */
        public final void mo99852a(int i) {
            C62208i.C62209a aVar = this.f140550a.mo100204o().get(C62183d.class);
            if (!(aVar instanceof C62183d)) {
                aVar = null;
            }
            C62183d dVar = (C62183d) aVar;
            if (dVar != null) {
                dVar.mo100190b(i);
                return;
            }
            throw new IllegalStateException("Cannot find widget: " + C62183d.class.getSimpleName());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$p */
    public static final class C61909p extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C61892c f140564a;

        static {
            Covode.recordClassIndex(72658);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61909p(C61892c cVar) {
            this.f140564a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            boolean z = true;
            if (!(i == 1 || i == 2)) {
                z = false;
            }
            C61968c.HandlerC61971c b = C61968c.m112097b();
            if (b != null) {
                b.mo100032a(z);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            this.f140564a.mo99994m();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$s */
    static final class View$OnClickListenerC61913s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C61892c f140568a;

        static {
            Covode.recordClassIndex(72662);
        }

        View$OnClickListenerC61913s(C61892c cVar) {
            this.f140568a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140568a.requireActivity().finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f140539r = new AnalysisStayTimeFragmentComponent(this);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C56346e.m102332a(EnumC56341a.ON_CREATE, new C61901h(this, bundle));
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C56196c cVar) {
        C89219l.m154721d(cVar, "");
        mo99992k().notifyDataSetChanged();
    }

    @AbstractC90264r
    public final void onResumeRefreshEvent(C61562n nVar) {
        C89219l.m154721d(nVar, "");
        if (af_()) {
            this.f140528b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$g */
    static final class C61900g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C61892c f140551a;

        static {
            Covode.recordClassIndex(72649);
        }

        C61900g(C61892c cVar) {
            this.f140551a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == EnumC61874i.ERROR) {
                new C23144b(this.f140551a).mo37640e(R.string.dcq).mo37637b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public final void mo25224b(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        if (m112020c(bundle)) {
            super.mo25224b(bundle);
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f140539r;
            if (analysisStayTimeFragmentComponent == null) {
                C89219l.m154710a("stayTimeComponent");
            }
            analysisStayTimeFragmentComponent.mo100243a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$d */
    static final class C61897d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C61892c f140548a;

        static {
            Covode.recordClassIndex(72646);
        }

        C61897d(C61892c cVar) {
            this.f140548a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            if (pVar.getSecond() == EnumC61867b.NET_ERR) {
                new C23144b(this.f140548a).mo37640e(R.string.dcq).mo37637b();
            } else if (pVar.getSecond() == EnumC61867b.REQ_ERR) {
                new C23144b(this.f140548a).mo37640e(R.string.clo).mo37637b();
            }
        }
    }

    /* renamed from: c */
    private final boolean m112020c(Bundle bundle) {
        String string = bundle.getString(C34792be.f82123b, "");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        String d = Hox.C15490a.m28529a(activity).mo25216d("HOME");
        if (!af_()) {
            return false;
        }
        if (C89219l.m154714a((Object) string, (Object) C34792be.f82125d) || bundle.getBoolean(d)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$c */
    static final class C61895c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C61892c f140546a;

        static {
            Covode.recordClassIndex(72644);
        }

        C61895c(C61892c cVar) {
            this.f140546a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (!this.f140546a.f140529c) {
                C35434c.m72464b("mus_new_notification");
                this.f140546a.f140529c = true;
            }
            C56346e.m102339d();
            C61830e k = this.f140546a.mo99992k();
            C89219l.m154716b(list, "");
            C618961 r2 = new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.C61892c.C61895c.C618961 */

                /* renamed from: a */
                final /* synthetic */ C61895c f140547a;

                static {
                    Covode.recordClassIndex(72645);
                }

                {
                    this.f140547a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C62208i.C62209a aVar = this.f140547a.f140546a.mo100204o().get(C62183d.class);
                    if (!(aVar instanceof C62183d)) {
                        aVar = null;
                    }
                    C62183d dVar = (C62183d) aVar;
                    if (dVar != null) {
                        dVar.mo100191h();
                        return C89391z.f203057a;
                    }
                    throw new IllegalStateException("Cannot find widget: " + C62183d.class.getSimpleName());
                }
            };
            C89219l.m154721d(list, "");
            if (k.mo99913b().isEmpty() || list.isEmpty()) {
                C89219l.m154721d(list, "");
                k.mo99913b().clear();
                k.mo99913b().addAll(list);
                k.notifyDataSetChanged();
                r2.invoke();
                k.f140386d = true;
                return;
            }
            k.f140386d = false;
            C61994d.m112121a(new C61830e.C61837g(C89070n.m154590j(k.mo99913b()), list), new C61830e.C61838h(k, list, r2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$u */
    static final class C61915u<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C61892c f140570a;

        static {
            Covode.recordClassIndex(72664);
        }

        C61915u(C61892c cVar) {
            this.f140570a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            RecyclerView g = this.f140570a.mo99989g();
            C89219l.m154716b(g, "");
            g.setAdapter(this.f140570a.mo99992k());
            this.f140570a.mo99987a(((Number) pVar.getFirst()).intValue(), false);
            this.f140570a.mo99987a(((Number) pVar.getSecond()).intValue(), true);
            this.f140570a.f140527a = true;
            this.f140570a.mo99991j().mo100374k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$o */
    static final class C61908o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C61892c f140563a;

        static {
            Covode.recordClassIndex(72657);
        }

        C61908o(C61892c cVar) {
            this.f140563a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == EnumC61874i.LOADING) {
                if (this.f140563a.mo99992k().getItemCount() > 0) {
                    SwipeRefreshLayout e = this.f140563a.mo99988e();
                    C89219l.m154716b(e, "");
                    if (!e.mRefreshing && this.f140563a.f140527a) {
                        this.f140563a.mo99990i().mo100194a(true);
                    } else if (this.f140563a.f140530d) {
                        SwipeRefreshLayout e2 = this.f140563a.mo99988e();
                        C89219l.m154716b(e2, "");
                        e2.setRefreshing(true);
                    }
                } else {
                    C62197h i = this.f140563a.mo99990i();
                    i.mo100196h().setVisibility(0);
                    i.mo100196h().mo27384f();
                }
                BaseNotificationVM.m112772a(this.f140563a.mo99991j().mo100337a());
                AbstractC81915c.m141874a(new C61561m(6, C61542b.m111458a(6)));
            } else {
                C62197h i2 = this.f140563a.mo99990i();
                i2.mo100194a(false);
                i2.mo100196h().mo27382d();
                SwipeRefreshLayout e3 = this.f140563a.mo99988e();
                C89219l.m154716b(e3, "");
                e3.setRefreshing(false);
                if (obj == EnumC61874i.ERROR) {
                    new C23144b(this.f140563a).mo37640e(R.string.dcq).mo37637b();
                    if (this.f140563a.mo99992k().getItemCount() <= 0) {
                        this.f140563a.mo99990i().mo100196h().mo27387h();
                    }
                } else if (this.f140563a.mo99992k().getItemCount() <= 0) {
                    this.f140563a.mo99990i().mo100196h().mo27385g();
                }
            }
            this.f140563a.f140527a = false;
            this.f140563a.f140530d = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public final void mo25223a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        if (m112020c(bundle)) {
            super.mo25223a(bundle);
            mo99991j().mo100374k();
            C61968c.HandlerC61971c b = C61968c.m112097b();
            if (b != null) {
                b.mo100043j();
            }
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f140539r;
            if (analysisStayTimeFragmentComponent == null) {
                C89219l.m154710a("stayTimeComponent");
            }
            analysisStayTimeFragmentComponent.mo100243a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        C56346e.m102332a(EnumC56341a.ON_VIEW_CREATED, new C61905l(this, view, bundle));
    }

    /* renamed from: a */
    public final void mo99987a(int i, boolean z) {
        C62455c b = mo99991j().mo100373b(i);
        if (!z) {
            b.mo100431a().removeObserver(this.f140540s);
            b.mo100436b().removeObserver(this.f140541t);
            b.mo100437c().removeObserver(this.f140542u);
            b.mo100440f().removeObserver(this.f140543v);
            return;
        }
        b.mo100431a().observe(this, this.f140540s);
        b.mo100436b().observe(this, this.f140541t);
        b.mo100437c().observe(this, this.f140542u);
        b.mo100440f().observe(this, this.f140543v);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        Object a = C56346e.m102332a(EnumC56341a.ON_CREATE_VIEW, new C61902i(layoutInflater, viewGroup));
        C89219l.m154716b(a, "");
        return (View) a;
    }
}
