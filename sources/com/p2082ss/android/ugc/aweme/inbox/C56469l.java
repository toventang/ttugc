package com.p2082ss.android.ugc.aweme.inbox;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.legacy.widget.Space;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C1428g;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.C1764a;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.friends.service.ContactServiceImpl;
import com.p2082ss.android.ugc.aweme.friends.service.IContactService;
import com.p2082ss.android.ugc.aweme.inbox.C56398e;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56364g;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.EnumC56341a;
import com.p2082ss.android.ugc.aweme.inbox.p3271f.C56408a;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61545a;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61548d;
import com.p2082ss.android.ugc.aweme.notification.utils.C62278q;
import com.p2082ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3254e.AbstractC56221a;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.inbox.l */
public final class C56469l extends AbstractC34586a implements SwipeRefreshLayout.AbstractC1559b, AbstractC2599d, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    boolean f128768a = true;

    /* renamed from: b */
    boolean f128769b;

    /* renamed from: c */
    C1481r f128770c;

    /* renamed from: d */
    LinearLayoutManager f128771d;

    /* renamed from: e */
    private final AbstractC89244h f128772e = C89250i.m154773a((AbstractC89171a) C56474e.f128787a);

    /* renamed from: j */
    private final AbstractC89244h f128773j = C89250i.m154773a((AbstractC89171a) new C56471b(this));

    /* renamed from: k */
    private final AbstractC89244h f128774k = C89250i.m154773a((AbstractC89171a) C56473d.f128786a);

    /* renamed from: l */
    private final AbstractC89244h f128775l = C89250i.m154773a((AbstractC89171a) new C56475f(this));

    /* renamed from: m */
    private final AbstractC89244h f128776m = C89250i.m154773a((AbstractC89171a) new C56494y(this));

    /* renamed from: n */
    private final AbstractC89244h f128777n = C89250i.m154773a((AbstractC89171a) new C56487r(this));

    /* renamed from: o */
    private final AbstractC89244h f128778o = C89250i.m154773a((AbstractC89171a) new C56486q(this));

    /* renamed from: p */
    private final AbstractC89244h f128779p = C89250i.m154773a((AbstractC89171a) new C56472c(this));

    /* renamed from: q */
    private final AbstractC89244h f128780q = C89250i.m154773a((AbstractC89171a) new C56495z(this));

    /* renamed from: r */
    private final AbstractC89244h f128781r = C89250i.m154773a((AbstractC89171a) new C56470a(this));

    /* renamed from: s */
    private SparseArray f128782s;

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$j */
    static final class C56479j<T> implements AbstractC1214u {

        /* renamed from: a */
        public static final C56479j f128792a = new C56479j();

        static {
            Covode.recordClassIndex(66299);
        }

        C56479j() {
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(66289);
    }

    /* renamed from: a */
    public final View mo93427a(int i) {
        if (this.f128782s == null) {
            this.f128782s = new SparseArray();
        }
        View view = (View) this.f128782s.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f128782s.put(i, findViewById);
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

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo93428e() {
        return ((Boolean) this.f128772e.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final InboxFragmentVM mo93429g() {
        return (InboxFragmentVM) this.f128773j.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(143, new RunnableC90250g(C56469l.class, "onSwitchInbox", C61548d.class, ThreadMode.MAIN, 0, true));
        hashMap.put(349, new RunnableC90250g(C56469l.class, "onDoubleClickTab", C61545a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: h */
    public final boolean mo93430h() {
        return ((Boolean) this.f128774k.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final MultiAdapterWidget mo93431i() {
        return (MultiAdapterWidget) this.f128775l.getValue();
    }

    /* renamed from: j */
    public final InboxAdapterWidget mo93432j() {
        return (InboxAdapterWidget) this.f128776m.getValue();
    }

    /* renamed from: k */
    public final InboxAdapterWidget mo93433k() {
        return (InboxAdapterWidget) this.f128777n.getValue();
    }

    /* renamed from: l */
    public final InboxAdapterWidget mo93434l() {
        return (InboxAdapterWidget) this.f128778o.getValue();
    }

    /* renamed from: m */
    public final InboxAdapterWidget mo93435m() {
        return (InboxAdapterWidget) this.f128779p.getValue();
    }

    /* renamed from: n */
    public final List<InboxAdapterWidget> mo93436n() {
        return (List) this.f128780q.getValue();
    }

    /* renamed from: o */
    public final C56334c mo93437o() {
        return (C56334c) this.f128781r.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$d */
    static final class C56473d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56473d f128786a = new C56473d();

        static {
            Covode.recordClassIndex(66293);
        }

        C56473d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C61542b.m111467b().isChatFunOfflineUnder16());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$e */
    static final class C56474e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56474e f128787a = new C56474e();

        static {
            Covode.recordClassIndex(66294);
        }

        C56474e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!C56398e.m102367b().mo93391d());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$f */
    static final class C56475f extends AbstractC89220m implements AbstractC89171a<MultiAdapterWidget> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128788a;

        static {
            Covode.recordClassIndex(66295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56475f(C56469l lVar) {
            super(0);
            this.f128788a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MultiAdapterWidget invoke() {
            C56469l lVar = this.f128788a;
            return new MultiAdapterWidget(lVar, lVar.mo93429g().f128393d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$o */
    static final class C56484o extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ LayoutInflater f128799a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f128800b;

        static {
            Covode.recordClassIndex(66304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56484o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(0);
            this.f128799a = layoutInflater;
            this.f128800b = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return C1764a.m5927a(this.f128799a, R.layout.k4, this.f128800b, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f128782s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: q */
    public final void mo93441q() {
        IMService.createIIMServicebyMonsterPlugin(false).processMessagingDeepLink(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$b */
    static final class C56471b extends AbstractC89220m implements AbstractC89171a<InboxFragmentVM> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128784a;

        static {
            Covode.recordClassIndex(66291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56471b(C56469l lVar) {
            super(0);
            this.f128784a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InboxFragmentVM invoke() {
            C56469l lVar = this.f128784a;
            C89219l.m154721d(lVar, "");
            AbstractC1174ac a = C1181ae.m3879a(lVar, (C1175ad.AbstractC1177b) null).mo3983a(InboxFragmentVM.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$c */
    static final class C56472c extends AbstractC89220m implements AbstractC89171a<InboxAdapterWidget> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128785a;

        static {
            Covode.recordClassIndex(66292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56472c(C56469l lVar) {
            super(0);
            this.f128785a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            IContactService b = ContactServiceImpl.m96112b();
            C56469l lVar = this.f128785a;
            return b.mo87292a(lVar, lVar.mo93429g().f128393d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$q */
    static final class C56486q extends AbstractC89220m implements AbstractC89171a<InboxAdapterWidget> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128804a;

        static {
            Covode.recordClassIndex(66306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56486q(C56469l lVar) {
            super(0);
            this.f128804a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            RecommendUserService b = RecommendUserServiceImpl.m118456b();
            C56469l lVar = this.f128804a;
            return b.mo105666a(lVar, lVar.mo93429g().f128393d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$n */
    static final class C56483n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128797a;

        /* renamed from: b */
        final /* synthetic */ Bundle f128798b;

        static {
            Covode.recordClassIndex(66303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56483n(C56469l lVar, Bundle bundle) {
            super(0);
            this.f128797a = lVar;
            this.f128798b = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C56469l.super.onCreate(this.f128798b);
            EventBus.m156966a(EventBus.m156962a(), this.f128797a);
            Iterator<T> it = this.f128797a.mo93436n().iterator();
            while (it.hasNext()) {
                this.f128797a.getLifecycle().mo4012a(it.next());
            }
            C56364g.m102349a(C56364g.C56369e.f128584a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$r */
    static final class C56487r extends AbstractC89220m implements AbstractC89171a<InboxAdapterWidget> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128805a;

        static {
            Covode.recordClassIndex(66307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56487r(C56469l lVar) {
            super(0);
            this.f128805a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            AbstractC56221a inboxAdapterService;
            if (this.f128805a.mo93430h() || (inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService()) == null) {
                return null;
            }
            C56469l lVar = this.f128805a;
            return inboxAdapterService.mo91876a(lVar, lVar.mo93429g().f128393d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$y */
    static final class C56494y extends AbstractC89220m implements AbstractC89171a<InboxAdapterWidget> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128812a;

        static {
            Covode.recordClassIndex(66314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56494y(C56469l lVar) {
            super(0);
            this.f128812a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            AbstractC56221a inboxAdapterService;
            if (this.f128812a.mo93430h() || (inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService()) == null) {
                return null;
            }
            C56469l lVar = this.f128812a;
            return inboxAdapterService.mo91877b(lVar, lVar.mo93429g().f128393d);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<T> it = mo93436n().iterator();
        while (it.hasNext()) {
            getLifecycle().mo4013b(it.next());
        }
        EventBus.m156962a().mo145395b(this);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AbstractC1559b
    public final void onRefresh() {
        C1213t<Boolean> bw_;
        Iterator<T> it = mo93436n().iterator();
        while (it.hasNext()) {
            it.next().mo87494h();
        }
        InboxAdapterWidget k = mo93433k();
        if (k != null && (bw_ = k.bw_()) != null) {
            bw_.postValue(Boolean.valueOf(mo93428e()));
        }
    }

    /* renamed from: p */
    public final void mo93440p() {
        for (T t : mo93436n()) {
            t.mo87492f().observe(this, new C56480k(t, this));
            LiveData<Boolean> e = t.mo87491e();
            if (e != null) {
                e.observe(this, new C56481l(this));
            }
        }
    }

    /* renamed from: r */
    public final void mo93442r() {
        ((TuxStatusView) mo93427a(R.id.e77)).mo37867a();
        TuxStatusView tuxStatusView = (TuxStatusView) mo93427a(R.id.e77);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo93427a(R.id.bmk);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$a */
    static final class C56470a extends AbstractC89220m implements AbstractC89171a<C56334c> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128783a;

        static {
            Covode.recordClassIndex(66290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56470a(C56469l lVar) {
            super(0);
            this.f128783a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56334c invoke() {
            C1428g.C1429a.C1430a aVar = new C1428g.C1429a.C1430a();
            aVar.f4697a = true;
            aVar.f4698b = C1428g.C1429a.EnumC1431b.ISOLATED_STABLE_IDS;
            C1428g.C1429a a = aVar.mo4916a();
            C89219l.m154716b(a, "");
            List<InboxAdapterWidget> n = this.f128783a.mo93436n();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) n, 10));
            Iterator<T> it = n.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo87493g());
            }
            return new C56334c(new C1428g(a, arrayList));
        }
    }

    public C56469l() {
        C56364g.m102349a(C56364g.C56368d.f128583a);
        C56398e.m102366a();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$z */
    static final class C56495z extends AbstractC89220m implements AbstractC89171a<List<InboxAdapterWidget>> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128813a;

        static {
            Covode.recordClassIndex(66315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56495z(C56469l lVar) {
            super(0);
            this.f128813a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<InboxAdapterWidget> invoke() {
            ArrayList arrayList = new ArrayList();
            InboxAdapterWidget j = this.f128813a.mo93432j();
            if (j != null) {
                arrayList.add(j);
            }
            arrayList.add(this.f128813a.mo93431i());
            InboxAdapterWidget k = this.f128813a.mo93433k();
            if (k != null) {
                arrayList.add(k);
                k.bw_().setValue(true);
            }
            arrayList.add(this.f128813a.mo93434l());
            arrayList.add(this.f128813a.mo93435m());
            if (C56323c.m102315b()) {
                InboxAdapterWidget l = this.f128813a.mo93434l();
                C89219l.m154721d(l, "");
                l.mo87487a(1, C56514v.f128841a);
            }
            if (C56323c.m102318e()) {
                MultiAdapterWidget i = this.f128813a.mo93431i();
                C89219l.m154721d(i, "");
                i.mo87487a(13, C56514v.f128843c);
                i.mo87487a(0, C56514v.f128844d);
                i.mo87487a(1, C56514v.f128845e);
                i.mo87487a(2, C56514v.f128845e);
                InboxAdapterWidget k2 = this.f128813a.mo93433k();
                if (k2 != null) {
                    C89219l.m154721d(k2, "");
                    k2.mo87487a(0, C56514v.f128842b);
                    k2.mo87487a(1, C56514v.f128845e);
                }
                C56514v.m102473a(this.f128813a.mo93434l());
                C56514v.m102473a(this.f128813a.mo93435m());
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$p */
    static final class C56485p extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128801a;

        /* renamed from: b */
        final /* synthetic */ View f128802b;

        /* renamed from: c */
        final /* synthetic */ Bundle f128803c;

        static {
            Covode.recordClassIndex(66305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56485p(C56469l lVar, View view, Bundle bundle) {
            super(0);
            this.f128801a = lVar;
            this.f128802b = view;
            this.f128803c = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C1213t<Boolean> bw_;
            int a;
            C56469l.super.onViewCreated(this.f128802b, this.f128803c);
            C56469l lVar = this.f128801a;
            C23073a.C23074a.m43506a(lVar).mo37494a(R.color.a2j).mo37495a(true).f54627a.mo33415d();
            C33403c.f79380p.observe(lVar, new C56488s(lVar));
            if (lVar.mo93430h()) {
                TuxIconView tuxIconView = (TuxIconView) lVar.mo93427a(R.id.ag0);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(8);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) lVar.mo93427a(R.id.ag0);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
                if (!C56201b.m102110a() || C56202c.m102111a()) {
                    ((TuxIconView) lVar.mo93427a(R.id.ag0)).setTuxIcon(C23005c.m43393a(C56491v.f128809a));
                } else {
                    ((TuxIconView) lVar.mo93427a(R.id.ag0)).setTuxIcon(C23005c.m43393a(C56490u.f128808a));
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    Context requireContext = lVar.requireContext();
                    C89219l.m154716b(requireContext, "");
                    TuxIconView tuxIconView3 = (TuxIconView) lVar.mo93427a(R.id.ag0);
                    C89219l.m154716b(tuxIconView3, "");
                    createIIMServicebyMonsterPlugin.showGroupChatGuideBubble(requireContext, tuxIconView3);
                }
                ((TuxIconView) lVar.mo93427a(R.id.ag0)).setOnClickListener(new View$OnClickListenerC56492w(lVar));
            }
            lVar.getContext();
            lVar.f128771d = new FixedLinearlayoutManager("InboxFragment");
            lVar.f128770c = new C56489t(lVar, lVar.requireContext());
            RecyclerView recyclerView = (RecyclerView) lVar.mo93427a(R.id.bmj);
            C89219l.m154716b(recyclerView, "");
            LinearLayoutManager linearLayoutManager = lVar.f128771d;
            if (linearLayoutManager == null) {
                C89219l.m154710a("layoutManager");
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView2 = (RecyclerView) lVar.mo93427a(R.id.bmj);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setAdapter(lVar.mo93437o());
            RecyclerView recyclerView3 = (RecyclerView) lVar.mo93427a(R.id.bmj);
            C89219l.m154716b(recyclerView3, "");
            recyclerView3.setItemAnimator(new C56509s());
            if (((Boolean) C56323c.f128483a.getValue()).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                InboxAdapterWidget j = lVar.mo93432j();
                if (j != null) {
                    arrayList.add(j);
                }
                arrayList.add(lVar.mo93431i());
                InboxAdapterWidget k = lVar.mo93433k();
                if (k != null) {
                    arrayList.add(k);
                }
                RecyclerView recyclerView4 = (RecyclerView) lVar.mo93427a(R.id.bmj);
                C89219l.m154716b(recyclerView4, "");
                View a2 = lVar.mo93427a(R.id.ein);
                C89219l.m154716b(a2, "");
                C89219l.m154721d(arrayList, "");
                C89219l.m154721d(recyclerView4, "");
                C89219l.m154721d(a2, "");
                Context context = recyclerView4.getContext();
                if (C56323c.m102318e()) {
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    a = C89241a.m154730a(TypedValue.applyDimension(1, 84.0f, system.getDisplayMetrics()));
                } else {
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    a = C89241a.m154730a(TypedValue.applyDimension(1, 76.0f, system2.getDisplayMetrics()));
                }
                float f = (float) a;
                int c = C0643b.m2378c(context, R.color.b6);
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                recyclerView4.mo4415b(new C56464j(arrayList, c, C89241a.m154730a(TypedValue.applyDimension(1, 0.32f, system3.getDisplayMetrics())), f));
                a2.setVisibility(0);
            }
            C62278q.m112666a((RecyclerView) lVar.mo93427a(R.id.bmj), (SwipeRefreshLayout) lVar.mo93427a(R.id.bmk));
            ((SwipeRefreshLayout) lVar.mo93427a(R.id.bmk)).setOnRefreshListener(lVar);
            this.f128801a.mo93440p();
            C56469l lVar2 = this.f128801a;
            DataCenter.m69492a(C1181ae.m3881a(lVar2.requireActivity(), (C1175ad.AbstractC1177b) null), lVar2).mo60190a("onNewIntent", new C56478i(lVar2), true);
            this.f128801a.mo93441q();
            C56469l lVar3 = this.f128801a;
            lVar3.mo93429g().f128391b.observe(lVar3, new C56476g(lVar3));
            lVar3.mo93429g().f128392c.observe(lVar3, new C56477h(lVar3));
            C56469l lVar4 = this.f128801a;
            InboxAdapterWidget k2 = lVar4.mo93433k();
            if (!(k2 == null || (bw_ = k2.bw_()) == null)) {
                bw_.observe(lVar4, C56479j.f128792a);
            }
            this.f128801a.mo93442r();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$i */
    static final class C56478i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56469l f128791a;

        static {
            Covode.recordClassIndex(66298);
        }

        C56478i(C56469l lVar) {
            this.f128791a = lVar;
        }

        /* renamed from: a */
        private static Bundle m102463a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Intent intent = (Intent) ((C33942b) obj).mo60212a();
            if (intent != null) {
                this.f128791a.setArguments(m102463a(intent));
                this.f128791a.mo93441q();
            }
        }
    }

    /* renamed from: a */
    static boolean m102447a(InboxAdapterWidget.EnumC56518b bVar) {
        if (bVar == InboxAdapterWidget.EnumC56518b.EMPTY || bVar == InboxAdapterWidget.EnumC56518b.FAIL) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C56364g.m102347a(EnumC56341a.ON_CREATE, new C56483n(this, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.l$l */
    public static final class C56481l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56469l f128795a;

        static {
            Covode.recordClassIndex(66301);
        }

        C56481l(C56469l lVar) {
            this.f128795a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            EnumC56513u uVar;
            Boolean bool = (Boolean) obj;
            InboxFragmentVM g = this.f128795a.mo93429g();
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                uVar = EnumC56513u.LOADING;
            } else {
                uVar = EnumC56513u.NORMAL;
            }
            g.mo93311a(uVar);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN, mo145423b = true)
    public final void onSwitchInbox(C61548d dVar) {
        C89219l.m154721d(dVar, "");
        EnumC56501q.CONTACTS.markEnterInbox();
        EnumC56501q.THIRD_PLATFORM.markEnterInbox();
        this.f128768a = true;
        C56408a.C56413e.m102391a();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$h */
    static final class C56477h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56469l f128790a;

        static {
            Covode.recordClassIndex(66297);
        }

        C56477h(C56469l lVar) {
            this.f128790a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            int itemCount = this.f128790a.mo93437o().getItemCount();
            C89219l.m154716b(num, "");
            int intValue = num.intValue();
            if (intValue >= 0 && itemCount > intValue) {
                C56469l lVar = this.f128790a;
                int intValue2 = num.intValue();
                C1481r rVar = lVar.f128770c;
                if (rVar == null) {
                    C89219l.m154710a("inboxListSmoothScroller");
                }
                rVar.f4515g = intValue2;
                LinearLayoutManager linearLayoutManager = lVar.f128771d;
                if (linearLayoutManager == null) {
                    C89219l.m154710a("layoutManager");
                }
                C1481r rVar2 = lVar.f128770c;
                if (rVar2 == null) {
                    C89219l.m154710a("inboxListSmoothScroller");
                }
                linearLayoutManager.mo4695a(rVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$s */
    static final class C56488s<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56469l f128806a;

        static {
            Covode.recordClassIndex(66308);
        }

        C56488s(C56469l lVar) {
            this.f128806a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                Space space = (Space) this.f128806a.mo93427a(R.id.u9);
                C89219l.m154716b(space, "");
                ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                if (layoutParams.height != intValue) {
                    layoutParams.height = intValue;
                    Space space2 = (Space) this.f128806a.mo93427a(R.id.u9);
                    C89219l.m154716b(space2, "");
                    space2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$w */
    static final class View$OnClickListenerC56492w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56469l f128810a;

        static {
            Covode.recordClassIndex(66312);
        }

        View$OnClickListenerC56492w(C56469l lVar) {
            this.f128810a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (C61542b.m111467b().shouldRedictToTipsPage()) {
                C61542b.m111467b().goToTipsPage();
                return;
            }
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            Context requireContext = this.f128810a.requireContext();
            C89219l.m154716b(requireContext, "");
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "notification_page");
            bundle.putString("enter_method", "button");
            createIIMServicebyMonsterPlugin.enterCreateChatPage(requireContext, bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$x */
    static final class C56493x extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128811a;

        static {
            Covode.recordClassIndex(66313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56493x(C56469l lVar) {
            super(1);
            this.f128811a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            tuxButton2.setButtonSize(3);
            tuxButton2.setText(this.f128811a.getString(R.string.cj0));
            tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise_fill));
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDoubleClickTab(C61545a aVar) {
        C89219l.m154721d(aVar, "");
        InboxFragmentVM g = mo93429g();
        List<InboxAdapterWidget> n = mo93436n();
        LinearLayoutManager linearLayoutManager = this.f128771d;
        if (linearLayoutManager == null) {
            C89219l.m154710a("layoutManager");
        }
        int k = linearLayoutManager.mo4371k();
        C89219l.m154721d(n, "");
        if (!g.mo93312a(n, k, false) && !g.mo93312a(n, 0, true)) {
            g.f128390a.postValue(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$m */
    static final class C56482m extends AbstractC89220m implements AbstractC89172b<C56398e.C56399a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56469l f128796a;

        static {
            Covode.recordClassIndex(66302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56482m(C56469l lVar) {
            super(1);
            this.f128796a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56398e.C56399a aVar) {
            boolean z;
            C1213t<Boolean> bw_;
            Boolean value;
            C56398e.C56399a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            boolean z2 = true;
            if (this.f128796a.mo93434l().mo87493g().getItemCount() > 0 || this.f128796a.mo93435m().mo87493g().getItemCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            InboxAdapterWidget k = this.f128796a.mo93433k();
            if (k == null || (bw_ = k.bw_()) == null || (value = bw_.getValue()) == null || value.booleanValue()) {
                z2 = false;
            }
            aVar2.mo93388a(z, z2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$u */
    static final class C56490u extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C56490u f128808a = new C56490u();

        static {
            Covode.recordClassIndex(66310);
        }

        C56490u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.raw.icon_create_group;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$v */
    static final class C56491v extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C56491v f128809a = new C56491v();

        static {
            Covode.recordClassIndex(66311);
        }

        C56491v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.raw.icon_pen_on_paper;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$g */
    static final class C56476g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56469l f128789a;

        static {
            Covode.recordClassIndex(66296);
        }

        C56476g(C56469l lVar) {
            this.f128789a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            EnumC56513u uVar = (EnumC56513u) obj;
            if (uVar != null) {
                int i = C56496m.f128814a[uVar.ordinal()];
                if (i == 1) {
                    C56469l lVar = this.f128789a;
                    TuxStatusView tuxStatusView = (TuxStatusView) lVar.mo93427a(R.id.e77);
                    C89219l.m154716b(tuxStatusView, "");
                    tuxStatusView.setVisibility(0);
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) lVar.mo93427a(R.id.bmk);
                    C89219l.m154716b(swipeRefreshLayout, "");
                    swipeRefreshLayout.setRefreshing(false);
                    TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37876a(0, R.raw.icon_large_wifi_slash);
                    String string = lVar.getString(R.string.pw);
                    C89219l.m154716b(string, "");
                    TuxStatusView.C23263c a2 = a.mo37879a(string);
                    String string2 = lVar.getString(R.string.pv);
                    C89219l.m154716b(string2, "");
                    TuxStatusView.C23263c a3 = a2.mo37878a((CharSequence) string2);
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    int a4 = C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    TuxStatusView.C23263c b = a3.mo37880b(a4, C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system2.getDisplayMetrics())));
                    b.f55132j = new C56493x(lVar);
                    ((TuxStatusView) lVar.mo93427a(R.id.e77)).setStatus(b);
                } else if (i == 3) {
                    this.f128789a.mo93442r();
                } else if (i == 4) {
                    C56469l lVar2 = this.f128789a;
                    TuxStatusView tuxStatusView2 = (TuxStatusView) lVar2.mo93427a(R.id.e77);
                    C89219l.m154716b(tuxStatusView2, "");
                    tuxStatusView2.setVisibility(8);
                    SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) lVar2.mo93427a(R.id.bmk);
                    C89219l.m154716b(swipeRefreshLayout2, "");
                    swipeRefreshLayout2.setRefreshing(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.l$k */
    public static final class C56480k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ InboxAdapterWidget f128793a;

        /* renamed from: b */
        final /* synthetic */ C56469l f128794b;

        static {
            Covode.recordClassIndex(66300);
        }

        C56480k(InboxAdapterWidget inboxAdapterWidget, C56469l lVar) {
            this.f128793a = inboxAdapterWidget;
            this.f128794b = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0181  */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r47) {
            /*
            // Method dump skipped, instructions count: 467
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.inbox.C56469l.C56480k.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.l$t */
    public static final class C56489t extends C1481r {

        /* renamed from: f */
        final /* synthetic */ C56469l f128807f;

        static {
            Covode.recordClassIndex(66309);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: c */
        public final int mo5016c() {
            return -1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56489t(C56469l lVar, Context context) {
            super(context);
            this.f128807f = lVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        C56364g.m102347a(EnumC56341a.ON_VIEW_CREATED, new C56485p(this, view, bundle));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        Object a = C56364g.m102347a(EnumC56341a.ON_CREATE_VIEW, new C56484o(layoutInflater, viewGroup));
        C89219l.m154716b(a, "");
        return (View) a;
    }
}
