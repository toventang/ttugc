package com.p2082ss.android.ugc.aweme.notification;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.legacy.widget.Space;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.C1764a;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.UgAllServiceImpl;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51700au;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51779c;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.C51781e;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.inbox.C56398e;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.inbox.C56463i;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56501q;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56346e;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56396l;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.EnumC56341a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e;
import com.p2082ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61562n;
import com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61548d;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61850i;
import com.p2082ss.android.ugc.aweme.notification.adapter.C61819d;
import com.p2082ss.android.ugc.aweme.notification.bean.C61865a;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveMessage;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.p2082ss.android.ugc.aweme.notification.followrequest.model.C62020a;
import com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b;
import com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.C62005a;
import com.p2082ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61797a;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61799b;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c;
import com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a.C61964b;
import com.p2082ss.android.ugc.aweme.notification.p3525f.C62001b;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62061as;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62034af;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62380a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62454b;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationCombineVM;
import com.p2082ss.android.ugc.aweme.notification.service.C62239a;
import com.p2082ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.p2082ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent;
import com.p2082ss.android.ugc.aweme.notification.utils.C62258d;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.utils.C62269l;
import com.p2082ss.android.ugc.aweme.notification.utils.C62271n;
import com.p2082ss.android.ugc.aweme.notification.utils.C62275p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62278q;
import com.p2082ss.android.ugc.aweme.notification.view.C62287c;
import com.p2082ss.android.ugc.aweme.notification.view.C62291e;
import com.p2082ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56196c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56198e;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63498e;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.C89309k;
import p4600h.p4622m.C89361p;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment */
public final class MusNewNotificationFragment extends AbstractC34586a implements SwipeRefreshLayout.AbstractC1559b, AbstractC2599d, AbstractC15497d, AbstractC34478k<User>, AbstractC39063h.AbstractC39067a, AbstractC39102c<MusNotice>, C61819d.AbstractC61820a, AbstractC61850i, AbstractC61861b, AbstractC62006b, C62061as.AbstractC62063b, AbstractC90252i, AbstractC90253j {

    /* renamed from: z */
    public static final C61687b f139982z = new C61687b((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f139983A = C89250i.m154773a((AbstractC89171a) C61704s.f140048a);

    /* renamed from: B */
    private final AbstractC89244h f139984B = C89250i.m154773a((AbstractC89171a) C61706u.f140050a);

    /* renamed from: C */
    private final AbstractC89244h f139985C = C89250i.m154773a((AbstractC89171a) C61705t.f140049a);

    /* renamed from: D */
    private final AbstractC89244h f139986D;

    /* renamed from: E */
    private boolean f139987E;

    /* renamed from: F */
    private EnumC61671a f139988F;

    /* renamed from: G */
    private final AbstractC89244h f139989G;

    /* renamed from: H */
    private final AbstractC89244h f139990H;

    /* renamed from: I */
    private boolean f139991I;

    /* renamed from: J */
    private boolean f139992J;

    /* renamed from: K */
    private final Set<String> f139993K;

    /* renamed from: L */
    private SparseArray f139994L;

    /* renamed from: a */
    public C61819d f139995a;

    /* renamed from: b */
    public AnalysisStayTimeFragmentComponent f139996b;

    /* renamed from: c */
    TutorialVideoViewModel f139997c;

    /* renamed from: d */
    LinearLayoutManager f139998d;

    /* renamed from: e */
    C62287c f139999e;

    /* renamed from: j */
    final List<C61631f> f140000j = C62258d.m112609a();

    /* renamed from: k */
    public int f140001k;

    /* renamed from: l */
    public int f140002l = C61530a.C61532b.m111445a();

    /* renamed from: m */
    public final AtomicInteger f140003m = new AtomicInteger(2);

    /* renamed from: n */
    public boolean f140004n;

    /* renamed from: o */
    C61517e f140005o;

    /* renamed from: p */
    public boolean f140006p;

    /* renamed from: q */
    public boolean f140007q;

    /* renamed from: r */
    public boolean f140008r;

    /* renamed from: s */
    public boolean f140009s;

    /* renamed from: t */
    public final boolean f140010t;

    /* renamed from: u */
    public boolean f140011u;

    /* renamed from: v */
    View f140012v;

    /* renamed from: w */
    public boolean f140013w;

    /* renamed from: y */
    final List<C51781e> f140014y;

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$a */
    public enum EnumC61671a {
        ORIGIN_DATA,
        ADAPTER_DATA;

        static {
            Covode.recordClassIndex(72401);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$k */
    static final class View$OnClickListenerC61696k implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC61696k f140040a = new View$OnClickListenerC61696k();

        static {
            Covode.recordClassIndex(72426);
        }

        View$OnClickListenerC61696k() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(72400);
    }

    /* renamed from: a */
    public final View mo99816a(int i) {
        if (this.f139994L == null) {
            this.f139994L = new SparseArray();
        }
        View view = (View) this.f139994L.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f139994L.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final void mo60911a(FollowStatus followStatus, String str, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b
    /* renamed from: a */
    public final void mo99810a(List<User> list, boolean z, boolean z2) {
        C89219l.m154721d(list, "");
    }

    @Override // com.bytedance.analytics.page.AbstractC2599d
    public final String ah_() {
        return "MainTabPage";
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b
    /* renamed from: b */
    public final void mo99812b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String bv_() {
        return "NOTIFICATION";
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<MusNotice> list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(143, new RunnableC90250g(MusNewNotificationFragment.class, "onSwitchInbox", C61548d.class, ThreadMode.MAIN, 0, true));
        hashMap.put(137, new RunnableC90250g(MusNewNotificationFragment.class, "onNotificationIndicatorEvent", C61561m.class, ThreadMode.MAIN, 0, false));
        hashMap.put(203, new RunnableC90250g(MusNewNotificationFragment.class, "onResumeRefreshEvent", C61562n.class, ThreadMode.POSTING, 0, false));
        hashMap.put(82, new RunnableC90250g(MusNewNotificationFragment.class, "onUnder16RefreshEvent", C56198e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(63, new RunnableC90250g(MusNewNotificationFragment.class, "onRefreshMessageButton", C56196c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C62005a mo99823i() {
        return (C62005a) this.f139983A.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C62001b mo99824j() {
        return (C62001b) this.f139984B.getValue();
    }

    /* renamed from: k */
    public final MusNewNotificationModel mo99825k() {
        return (MusNewNotificationModel) this.f139985C.getValue();
    }

    /* renamed from: m */
    public final DmNoticeProxy mo99826m() {
        return (DmNoticeProxy) this.f139986D.getValue();
    }

    /* renamed from: n */
    public final NotificationCombineVM mo99827n() {
        return (NotificationCombineVM) this.f139989G.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final AbstractC51779c mo99828o() {
        return (AbstractC51779c) this.f139990H.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$b */
    public static final class C61687b {
        static {
            Covode.recordClassIndex(72417);
        }

        private C61687b() {
        }

        public /* synthetic */ C61687b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$g */
    public static final class C61692g implements C61517e.AbstractC61520b {
        static {
            Covode.recordClassIndex(72422);
        }

        C61692g() {
        }

        @Override // com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e.AbstractC61520b
        /* renamed from: b */
        public final void mo86688b(Context context) {
            UgAllServiceImpl.m65444c().mo57258c(context);
        }

        @Override // com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e.AbstractC61520b
        /* renamed from: a */
        public final boolean mo86687a(Context context) {
            return UgAllServiceImpl.m65444c().mo57259d(context);
        }
    }

    /* renamed from: a */
    public final void mo99819a(EnumC61671a aVar) {
        this.f139988F = aVar;
        NotificationCombineVM n = mo99827n();
        n.f141509g = true;
        ArrayList arrayList = new ArrayList();
        if (n.mo100350i()) {
            arrayList.add(n.mo100362r().mo100367b());
        }
        if (C56318b.m102312c() && n.mo100337a() == C61530a.C61532b.m111445a() && C51648a.f118980a.mo87322d().mo86984c()) {
            arrayList.add(n.mo100363s().mo100367b());
        }
        if (arrayList.isEmpty()) {
            AbstractC88979t a = AbstractC88979t.m154294a(NotificationCombineVM.C62364m.f141535a);
            C89219l.m154716b(a, "");
            arrayList.add(a);
        }
        C62380a aVar2 = new C62380a(null, null, 3);
        AbstractC88979t.m154299a(arrayList).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(NotificationCombineVM.C62366n.f141536a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new NotificationCombineVM.C62367o(aVar2), new NotificationCombineVM.C62368p(n, aVar2), new NotificationCombineVM.C62369q(n, aVar2));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<MusNotice> list, boolean z) {
        C56346e.m102334a(new C56396l(list != null ? Integer.valueOf(list.size()) : null, null, mo99825k().lastGroupApiLogId));
        if (list != null && !list.isEmpty() && C16048b.m29633a().mo25412a(true, "i18n_following_live_skylight_type", 0) == 1) {
            Iterator<MusNotice> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().type == 1001) {
                    it.remove();
                }
            }
        }
        if (!af_()) {
            this.f139987E = false;
            return;
        }
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        dVar.f140353f = mo99825k().mTotal;
        this.f140013w = !z;
        mo99827n().mo100361q().clear();
        if (list != null) {
            mo99827n().mo100361q().addAll(list);
        }
        if (this.f140002l != C61530a.C61532b.m111445a() || (!this.f140013w && !C56398e.m102367b().mo93391d())) {
            this.f139988F = EnumC61671a.ORIGIN_DATA;
            mo99820a(new C62380a(null, null));
            return;
        }
        C56346e.m102338c();
        mo99819a(EnumC61671a.ORIGIN_DATA);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r6.f140013w == false) goto L_0x00b7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99820a(com.p2082ss.android.ugc.aweme.notification.p3535vm.C62380a r7) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.MusNewNotificationFragment.mo99820a(com.ss.android.ugc.aweme.notification.vm.a):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b
    /* renamed from: a */
    public final void mo99809a(List<User> list, int i) {
        C89219l.m154721d(list, "");
        this.f140003m.decrementAndGet();
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        C61819d.m111890a(dVar, list, i, this.f140001k);
        if (this.f140003m.get() == 0) {
            ((DmtStatusView) mo99816a(R.id.ed4)).mo27382d();
            TuxStatusView tuxStatusView = (TuxStatusView) mo99816a(R.id.ed5);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b
    /* renamed from: a */
    public final void mo99811a(boolean z) {
        this.f140003m.decrementAndGet();
        if (this.f140004n) {
            mo99840v();
        } else {
            mo99841w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$ac */
    static final class C61674ac extends AbstractC89220m implements AbstractC89171a<AbstractC51779c> {

        /* renamed from: a */
        public static final C61674ac f140020a = new C61674ac();

        static {
            Covode.recordClassIndex(72404);
        }

        C61674ac() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC51779c invoke() {
            return C51648a.f118980a.mo87336p();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$d */
    static final class C61689d extends AbstractC89220m implements AbstractC89171a<NotificationCombineVM> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140034a;

        static {
            Covode.recordClassIndex(72419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61689d(MusNewNotificationFragment musNewNotificationFragment) {
            super(0);
            this.f140034a = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationCombineVM invoke() {
            return NotificationCombineVM.C62352a.m112807a(this.f140034a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$e */
    static final class C61690e extends AbstractC89220m implements AbstractC89171a<DmNoticeProxy> {

        /* renamed from: a */
        public static final C61690e f140035a = new C61690e();

        static {
            Covode.recordClassIndex(72420);
        }

        C61690e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmNoticeProxy invoke() {
            return DmNoticeProxyImpl.m111428e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$s */
    static final class C61704s extends AbstractC89220m implements AbstractC89171a<C62005a> {

        /* renamed from: a */
        public static final C61704s f140048a = new C61704s();

        static {
            Covode.recordClassIndex(72434);
        }

        C61704s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62005a invoke() {
            return new C62005a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$t */
    static final class C61705t extends AbstractC89220m implements AbstractC89171a<MusNewNotificationModel> {

        /* renamed from: a */
        public static final C61705t f140049a = new C61705t();

        static {
            Covode.recordClassIndex(72435);
        }

        C61705t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MusNewNotificationModel invoke() {
            return new MusNewNotificationModel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$u */
    static final class C61706u extends AbstractC89220m implements AbstractC89171a<C62001b> {

        /* renamed from: a */
        public static final C61706u f140050a = new C61706u();

        static {
            Covode.recordClassIndex(72436);
        }

        C61706u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62001b invoke() {
            return new C62001b();
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

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onPause() {
        super.onPause();
        mo99821c(false);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onStop() {
        super.onStop();
        m111686I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$an */
    public static final class RunnableC61685an implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140030a;

        /* renamed from: b */
        final /* synthetic */ C62454b f140031b;

        static {
            Covode.recordClassIndex(72415);
        }

        RunnableC61685an(MusNewNotificationFragment musNewNotificationFragment, C62454b bVar) {
            this.f140030a = musNewNotificationFragment;
            this.f140031b = bVar;
        }

        public final void run() {
            C56407f.m102374b(new AbstractC89172b<C56398e.C56399a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.MusNewNotificationFragment.RunnableC61685an.C616861 */

                /* renamed from: a */
                final /* synthetic */ RunnableC61685an f140032a;

                static {
                    Covode.recordClassIndex(72416);
                }

                {
                    this.f140032a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C56398e.C56399a aVar) {
                    C56398e.C56399a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    aVar2.mo93388a(!this.f140032a.f140031b.f141688b.isEmpty(), MusNewNotificationFragment.m111694c(this.f140032a.f140030a).f140350c);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: A */
    private static boolean m111681A() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: I */
    private final void m111686I() {
        if (this.f139992J) {
            BenchmarkServiceImpl.m71140c().mo61661a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        dVar.ao_();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.AbstractC61861b
    /* renamed from: h */
    public final String mo99822h() {
        return mo99827n().mo100343b();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onResume() {
        C56346e.m102332a(EnumC56341a.ON_RESUME, new C61711z(this));
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onStart() {
        C56346e.m102332a(EnumC56341a.ON_START, new C61672aa(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo99838t() {
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        dVar.mo67829d(false);
    }

    /* renamed from: z */
    public final void mo99844z() {
        if (this.f139992J) {
            BenchmarkServiceImpl.m71140c().mo61662a(3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$aa */
    static final class C61672aa extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140016a;

        static {
            Covode.recordClassIndex(72402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61672aa(MusNewNotificationFragment musNewNotificationFragment) {
            super(0);
            this.f140016a = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MusNewNotificationFragment.super.onStart();
            UgCommonServiceImpl.m138290j().mo123101b(this.f140016a.getContext());
            this.f140016a.mo99844z();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$l */
    static final class C61697l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140041a;

        static {
            Covode.recordClassIndex(72427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61697l(MusNewNotificationFragment musNewNotificationFragment) {
            super(0);
            this.f140041a = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.f140041a.mo99816a(R.id.ed4);
            dmtStatusView.mo27385g();
            dmtStatusView.setFocusable(false);
            dmtStatusView.setFocusableInTouchMode(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$v */
    static final class C61707v extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140051a;

        /* renamed from: b */
        final /* synthetic */ Bundle f140052b;

        static {
            Covode.recordClassIndex(72437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61707v(MusNewNotificationFragment musNewNotificationFragment, Bundle bundle) {
            super(0);
            this.f140051a = musNewNotificationFragment;
            this.f140052b = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MusNewNotificationFragment.super.onActivityCreated(this.f140052b);
            this.f140051a.f139996b = new AnalysisStayTimeFragmentComponent(this.f140051a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$w */
    static final class C61708w extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140053a;

        /* renamed from: b */
        final /* synthetic */ Bundle f140054b;

        static {
            Covode.recordClassIndex(72438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61708w(MusNewNotificationFragment musNewNotificationFragment, Bundle bundle) {
            super(0);
            this.f140053a = musNewNotificationFragment;
            this.f140054b = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MusNewNotificationFragment.super.onCreate(this.f140054b);
            EventBus.m156966a(EventBus.m156962a(), this.f140053a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$x */
    static final class C61709x extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ LayoutInflater f140055a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f140056b;

        static {
            Covode.recordClassIndex(72439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61709x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(0);
            this.f140055a = layoutInflater;
            this.f140056b = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View a = C1764a.m5927a(this.f140055a, R.layout.ki, this.f140056b, false);
            C89219l.m154716b(a, "");
            a.setBackgroundColor(C0643b.m2378c(a.getContext(), R.color.l));
            return a;
        }
    }

    /* renamed from: B */
    private static boolean m111682B() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean A = m111681A();
        C58029j.f132256h = A;
        return A;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        Analysis labelName = new Analysis().setLabelName("message");
        C89219l.m154716b(labelName, "");
        return labelName;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onDestroy() {
        super.onDestroy();
        if (C56318b.m102311b()) {
            C61968c.m112098c();
        }
        EventBus.m156962a().mo145395b(this);
        C62271n.m112656a((Bundle) null, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo99834p() {
        if (C61542b.m111467b().isChatFunOfflineUnder16()) {
            View view = this.f140012v;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f140012v;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* renamed from: s */
    public final void mo99837s() {
        C56346e.m102337b(C56396l.C56397a.m102365a(new IllegalStateException("Mus unknown error")));
        mo99820a(new C62380a(null, null, 3));
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61819d.AbstractC61820a
    /* renamed from: y */
    public final void mo99843y() {
        C56407f.m102374b(C61688c.f140033a);
        if (this.f140013w) {
            mo99819a(EnumC61671a.ADAPTER_DATA);
        } else {
            mo62679l();
        }
        C62259e.m112629c(mo99827n().mo100343b());
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$ah */
    static final class C61679ah implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140024a;

        static {
            Covode.recordClassIndex(72409);
        }

        C61679ah(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140024a = musNewNotificationFragment;
        }

        public final void onDismiss() {
            this.f140024a.mo99839u();
            this.f140024a.mo99836r();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f140024a.mo99816a(R.id.bvn), "rotation", 180.0f, 0.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mo99824j().mo67840h();
        mo99824j().ck_();
        mo99823i().mo67840h();
        mo99823i().ck_();
        mo99826m().mo99179a("notification_page");
        SparseArray sparseArray = this.f139994L;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: u */
    public final void mo99839u() {
        if (((RecyclerView) mo99816a(R.id.dof)).canScrollVertically(-1)) {
            View a = mo99816a(R.id.fb2);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
            return;
        }
        View a2 = mo99816a(R.id.fb2);
        C89219l.m154716b(a2, "");
        a2.setVisibility(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.C62061as.AbstractC62063b
    /* renamed from: x */
    public final void mo99842x() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        SmartRouter.buildRoute(this, "aweme://user/qna/profile/" + curUser.getUid()).withParam("enter_from", "notification_page").withParam("enter_method", "click_turn_on_qna").open();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$z */
    static final class C61711z extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140058a;

        static {
            Covode.recordClassIndex(72441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61711z(MusNewNotificationFragment musNewNotificationFragment) {
            super(0);
            this.f140058a = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MusNewNotificationFragment.super.onResume();
            this.f140058a.mo99821c(true);
            this.f140058a.mo99835q();
            if (this.f140058a.f140009s) {
                this.f140058a.onRefresh();
                this.f140058a.f140009s = false;
            }
            if (this.f140058a.f140006p) {
                this.f140058a.onRefresh();
                this.f140058a.f140006p = false;
            }
            if (this.f140058a.f140007q) {
                this.f140058a.onRefresh();
                this.f140058a.f140007q = false;
            }
            if (this.f140058a.f140008r) {
                this.f140058a.onRefresh();
                this.f140058a.f140008r = false;
            }
            this.f140058a.mo99826m().mo99180b("notification_page");
            if (this.f140058a.f140002l == C61530a.C61532b.m111445a() && this.f140058a.f140010t) {
                this.f140058a.f140003m.incrementAndGet();
                this.f140058a.mo99825k().startFetchLive();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: C */
    private final void m111683C() {
        C61964b.f140649a = null;
        List<MusNotice> itemsFromGroup = mo99825k().getItemsFromGroup(this.f140002l);
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        dVar.mo62377b_(itemsFromGroup);
        C61819d dVar2 = this.f139995a;
        if (dVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        dVar2.notifyDataSetChanged();
        getActivity();
        if (!m111682B()) {
            this.f140003m.set(0);
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            if (af_()) {
                mo99840v();
                return;
            }
            return;
        }
        C61819d dVar3 = this.f139995a;
        if (dVar3 == null) {
            C89219l.m154710a("mAdapter");
        }
        if (dVar3.getItemCount() > 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) mo99816a(R.id.ed5);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) mo99816a(R.id.ed5)).mo37867a();
        }
        onRefresh();
    }

    /* renamed from: D */
    private final void m111684D() {
        if (af_()) {
            C61819d dVar = this.f139995a;
            if (dVar == null) {
                C89219l.m154710a("mAdapter");
            }
            if (dVar.f92274v) {
                C61819d dVar2 = this.f139995a;
                if (dVar2 == null) {
                    C89219l.m154710a("mAdapter");
                }
                dVar2.notifyDataSetChanged();
                mo99838t();
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo99816a(R.id.e5x);
            C89219l.m154716b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            mo99841w();
            TuxStatusView tuxStatusView = (TuxStatusView) mo99816a(R.id.ed5);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
        }
    }

    /* renamed from: E */
    private final boolean m111685E() {
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        List e = dVar.mo63369e();
        if (e != null && !e.isEmpty()) {
            C61819d dVar2 = this.f139995a;
            if (dVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            List<MusNotice> e2 = dVar2.mo63369e();
            if (!(e2 instanceof Collection) || !e2.isEmpty()) {
                int i = 0;
                for (MusNotice musNotice : e2) {
                    if (musNotice.type != 50 && (i = i + 1) < 0) {
                        C89070n.m154523b();
                    }
                }
                if (i == 0) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        if (dVar.f92274v) {
            mo99838t();
        }
        TuxStatusView tuxStatusView = (TuxStatusView) mo99816a(R.id.ed5);
        C89219l.m154716b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        ((TuxStatusView) mo99816a(R.id.ed5)).mo37867a();
        C56346e.m102334a(new C56396l(0, null, mo99825k().lastGroupApiLogId));
        mo99827n().mo100361q().clear();
        this.f140013w = true;
        if (this.f140002l == C61530a.C61532b.m111445a()) {
            C56346e.m102338c();
            mo99819a(EnumC61671a.ORIGIN_DATA);
            return;
        }
        this.f139988F = EnumC61671a.ORIGIN_DATA;
        mo99820a(new C62380a(null, null, 3));
    }

    /* renamed from: q */
    public final void mo99835q() {
        if (af_()) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                String a = m111687a(intent, "label");
                String a2 = m111687a(intent, "uid");
                if (intent.getBooleanExtra("is_from_push", false) && this.f140002l != C61530a.C61532b.m111445a()) {
                    C62287c cVar = this.f139999e;
                    if (cVar != null) {
                        cVar.mo100277a();
                    }
                    mo99818a(this.f140000j.get(0));
                }
                intent.putExtra("label", "");
                if (TextUtils.equals(a, "follow_request")) {
                    startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://follow_request").withParam("label", a).withParam("uid", a2).buildIntent(), 1024);
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo99836r() {
        if (C56297a.m102302d()) {
            ImageView imageView = (ImageView) mo99816a(R.id.c0i);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(8);
            return;
        }
        if (this.f140002l != C61530a.C61532b.m111445a()) {
            int a = C61542b.m111458a(C61530a.C61532b.m111445a());
            int a2 = C61542b.m111458a(this.f140002l);
            if (a > 0 && a > a2) {
                ImageView imageView2 = (ImageView) mo99816a(R.id.c0i);
                C89219l.m154716b(imageView2, "");
                imageView2.setVisibility(0);
                return;
            }
        }
        ImageView imageView3 = (ImageView) mo99816a(R.id.c0i);
        C89219l.m154716b(imageView3, "");
        imageView3.setVisibility(8);
    }

    /* renamed from: v */
    public final void mo99840v() {
        if (this.f140003m.get() <= 0) {
            ((DmtStatusView) mo99816a(R.id.ed4)).mo27382d();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo99816a(R.id.e5x);
            C89219l.m154716b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            TuxStatusView tuxStatusView = (TuxStatusView) mo99816a(R.id.ed5);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            if (m111685E()) {
                ((DmtStatusView) mo99816a(R.id.ed4)).mo27387h();
                RecyclerView recyclerView = (RecyclerView) mo99816a(R.id.dof);
                C89219l.m154716b(recyclerView, "");
                recyclerView.getVisibility();
            }
        }
    }

    /* renamed from: w */
    public final void mo99841w() {
        if (this.f140003m.get() <= 0) {
            ((DmtStatusView) mo99816a(R.id.ed4)).mo27382d();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo99816a(R.id.e5x);
            C89219l.m154716b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            TuxStatusView tuxStatusView = (TuxStatusView) mo99816a(R.id.ed5);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            if (m111685E()) {
                DmtStatusView dmtStatusView = (DmtStatusView) mo99816a(R.id.ed4);
                dmtStatusView.mo27385g();
                dmtStatusView.setFocusable(false);
                dmtStatusView.setFocusableInTouchMode(false);
            }
        }
    }

    public MusNewNotificationFragment() {
        Boolean bool;
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        AbstractC58593c d = s.mo95830d();
        boolean z = false;
        if (!(d == null || (bool = (Boolean) d.mo12981a("live_square_inbox_refresh", (Object) false)) == null)) {
            z = bool.booleanValue();
        }
        this.f140010t = z;
        this.f139986D = C89250i.m154773a((AbstractC89171a) C61690e.f140035a);
        this.f139988F = EnumC61671a.ORIGIN_DATA;
        this.f139989G = C89250i.m154773a((AbstractC89171a) new C61689d(this));
        this.f139990H = C89250i.m154773a((AbstractC89171a) C61674ac.f140020a);
        this.f140014y = new ArrayList();
        this.f139992J = true;
        this.f139993K = new LinkedHashSet();
        C56398e.m102366a();
        C56346e.m102336b();
        C61968c.HandlerC61971c b = C61968c.m112097b();
        if (b != null) {
            b.mo100043j();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.followrequest.p3526a.AbstractC62006b
    /* renamed from: a */
    public final void mo99808a() {
        this.f140003m.decrementAndGet();
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        C61819d.m111890a(dVar, new ArrayList(), 0, 0);
        if (this.f140004n) {
            mo99840v();
        } else {
            mo99841w();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r1.f140350c == false) goto L_0x0039;
     */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62679l() {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.MusNewNotificationFragment.mo62679l():void");
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AbstractC1559b
    public final void onRefresh() {
        if (af_() && !this.f139987E) {
            if (C62269l.m112652a()) {
                this.f140003m.set(0);
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo99816a(R.id.e5x);
                C89219l.m154716b(swipeRefreshLayout, "");
                swipeRefreshLayout.setRefreshing(false);
                mo99841w();
                return;
            }
            C61964b.m112092c();
            getActivity();
            if (m111682B()) {
                this.f139987E = true;
                this.f140004n = false;
                C61819d dVar = this.f139995a;
                if (dVar == null) {
                    C89219l.m154710a("mAdapter");
                }
                if (dVar.getItemCount() == 0) {
                    ((DmtStatusView) mo99816a(R.id.ed4)).mo27384f();
                }
                this.f140003m.set(1);
                if (this.f140002l == C61530a.C61532b.m111445a() && !C62269l.m112652a() && C16048b.m29633a().mo25421a(true, "inbox_has_top_msg", false)) {
                    TutorialVideoViewModel tutorialVideoViewModel = this.f139997c;
                    if (tutorialVideoViewModel == null) {
                        C89219l.m154710a("mTutorialVideoModel");
                    }
                    AbstractC88412b a = tutorialVideoViewModel.mo100240a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new TutorialVideoViewModel.C62242b(tutorialVideoViewModel), TutorialVideoViewModel.C62243c.f141273a);
                    C89219l.m154716b(a, "");
                    C88934a.m154195a(a, (C88411a) tutorialVideoViewModel.f141269b.getValue());
                }
                this.f140009s = false;
                C56346e.m102335a(C56346e.C56351e.f128548a);
                mo99824j().mo57616a(1, Integer.valueOf(this.f140002l), null);
                int i = this.f140002l;
                if (i == C61530a.C61532b.m111445a()) {
                    this.f140001k = C61542b.m111458a(12);
                }
                Keva a2 = C56463i.m102434a();
                Map<String, ?> all = a2.getAll();
                if (all != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        C89219l.m154716b(key, "");
                        if (C89361p.m154874b(key, "key_live_notice_status_", false)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        a2.storeInt((String) entry2.getKey(), 0);
                    }
                }
                mo99827n();
                NotificationCombineVM.m112772a(i);
                AbstractC81915c.m141874a(new C61561m(6, C61542b.m111458a(6)));
            } else {
                this.f140003m.set(0);
                new C23144b(this).mo37640e(R.string.dcq).mo37637b();
                C1731i.m5631a(100).mo5534a(new C61710y(this), C1731i.f5564c, null);
            }
            mo99827n().mo100345d().clear();
            this.f139993K.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$ab */
    static final class C61673ab extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140017a;

        /* renamed from: b */
        final /* synthetic */ View f140018b;

        /* renamed from: c */
        final /* synthetic */ Bundle f140019c;

        static {
            Covode.recordClassIndex(72403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61673ab(MusNewNotificationFragment musNewNotificationFragment, View view, Bundle bundle) {
            super(0);
            this.f140017a = musNewNotificationFragment;
            this.f140018b = view;
            this.f140019c = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            String str;
            Object obj;
            C61517e eVar;
            int identifier;
            MethodCollector.m26663i(3056);
            MusNewNotificationFragment.super.onViewCreated(this.f140018b, this.f140019c);
            C62262g.m112636b(this.f140018b.getContext());
            MusNewNotificationFragment musNewNotificationFragment = this.f140017a;
            musNewNotificationFragment.f140002l = C61530a.C61532b.m111445a();
            View a = musNewNotificationFragment.mo99816a(R.id.faz);
            C89219l.m154716b(a, "");
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            Context context = musNewNotificationFragment.getContext();
            boolean z = false;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                i = 0;
            } else {
                i = context.getResources().getDimensionPixelSize(identifier);
            }
            layoutParams.height = i;
            musNewNotificationFragment.getContext();
            musNewNotificationFragment.f139998d = new FixedLinearlayoutManager();
            RecyclerView recyclerView = (RecyclerView) musNewNotificationFragment.mo99816a(R.id.dof);
            C89219l.m154716b(recyclerView, "");
            LinearLayoutManager linearLayoutManager = musNewNotificationFragment.f139998d;
            if (linearLayoutManager == null) {
                C89219l.m154710a("mLinearLayoutManager");
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            ((RecyclerView) musNewNotificationFragment.mo99816a(R.id.dof)).mo4405a(new C51425a(musNewNotificationFragment.getContext()));
            C62278q.m112666a((RecyclerView) musNewNotificationFragment.mo99816a(R.id.dof), (SwipeRefreshLayout) musNewNotificationFragment.mo99816a(R.id.e5x));
            ((RecyclerView) musNewNotificationFragment.mo99816a(R.id.dof)).mo4405a(new C61691f(musNewNotificationFragment));
            ((SwipeRefreshLayout) musNewNotificationFragment.mo99816a(R.id.e5x)).setOnRefreshListener(musNewNotificationFragment);
            if (!C62269l.m112652a()) {
                C62023a.m112168a(musNewNotificationFragment.mo99816a(R.id.c7d));
                ((ConstraintLayout) musNewNotificationFragment.mo99816a(R.id.c7d)).setOnClickListener(new View$OnClickListenerC61695j(musNewNotificationFragment));
                TuxIconView tuxIconView = (TuxIconView) musNewNotificationFragment.mo99816a(R.id.bvn);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                if (!C56318b.m102311b()) {
                    musNewNotificationFragment.f140012v = IMService.createIIMServicebyMonsterPlugin(false).getDmEntranceView(musNewNotificationFragment.getActivity(), "notification_page");
                    View view = musNewNotificationFragment.f140012v;
                    if (view != null) {
                        view.setOnClickListener(new View$OnClickListenerC61703r(musNewNotificationFragment));
                        ((RelativeLayout) musNewNotificationFragment.mo99816a(R.id.dm7)).addView(view);
                    }
                }
            }
            ((RelativeLayout) musNewNotificationFragment.mo99816a(R.id.dm7)).setOnClickListener(View$OnClickListenerC61696k.f140040a);
            musNewNotificationFragment.mo99817a(R.string.dia, R.string.dim, 2131231276);
            musNewNotificationFragment.mo99824j().mo67838a((AbstractC39085b) musNewNotificationFragment.mo99825k());
            musNewNotificationFragment.mo99824j().mo100052a((AbstractC39102c<?>) musNewNotificationFragment);
            musNewNotificationFragment.mo99823i().mo67838a(new C62020a());
            musNewNotificationFragment.mo99823i().mo67839a_(musNewNotificationFragment);
            musNewNotificationFragment.mo99827n().mo100354j().observe(musNewNotificationFragment, new C61680ai(musNewNotificationFragment));
            musNewNotificationFragment.mo99827n().mo100356l().observe(musNewNotificationFragment, new C61681aj(musNewNotificationFragment));
            musNewNotificationFragment.mo99827n().mo100355k().observe(musNewNotificationFragment, new C61682ak(musNewNotificationFragment));
            musNewNotificationFragment.mo99827n().mo100357m().observe(musNewNotificationFragment, new C61683al(musNewNotificationFragment));
            musNewNotificationFragment.mo99827n().mo100358n().observe(musNewNotificationFragment, new C61684am(musNewNotificationFragment));
            ActivityC0945e activity = musNewNotificationFragment.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                if (intent.getBooleanExtra("is_from_push", false)) {
                    str = "push";
                } else {
                    str = "message";
                }
                musNewNotificationFragment.mo99827n().mo100342a(str);
                musNewNotificationFragment.f139995a = new C61819d(musNewNotificationFragment, str, new C61697l(musNewNotificationFragment));
                C61819d dVar = musNewNotificationFragment.f139995a;
                if (dVar == null) {
                    C89219l.m154710a("mAdapter");
                }
                DmtStatusView dmtStatusView = (DmtStatusView) musNewNotificationFragment.mo99816a(R.id.ed4);
                C89219l.m154716b(dmtStatusView, "");
                C89219l.m154721d(dmtStatusView, "");
                dVar.f140354g = dmtStatusView;
                C61819d dVar2 = musNewNotificationFragment.f139995a;
                if (dVar2 == null) {
                    C89219l.m154710a("mAdapter");
                }
                dVar2.mo67813a((AbstractC39063h.AbstractC39067a) musNewNotificationFragment);
                C61819d dVar3 = musNewNotificationFragment.f139995a;
                if (dVar3 == null) {
                    C89219l.m154710a("mAdapter");
                }
                dVar3.mo67829d(false);
                C61819d dVar4 = musNewNotificationFragment.f139995a;
                if (dVar4 == null) {
                    C89219l.m154710a("mAdapter");
                }
                dVar4.mo67814a((CharSequence) "");
                musNewNotificationFragment.mo99838t();
                RecyclerView recyclerView2 = (RecyclerView) musNewNotificationFragment.mo99816a(R.id.dof);
                C89219l.m154716b(recyclerView2, "");
                C61819d dVar5 = musNewNotificationFragment.f139995a;
                if (dVar5 == null) {
                    C89219l.m154710a("mAdapter");
                }
                recyclerView2.setAdapter(dVar5);
                ((RecyclerView) musNewNotificationFragment.mo99816a(R.id.dof)).mo4402a(new C61698m(musNewNotificationFragment));
                LogHelper a2 = LogHelperImpl.m77303a();
                RecyclerView recyclerView3 = (RecyclerView) musNewNotificationFragment.mo99816a(R.id.dof);
                C89219l.m154716b(recyclerView3, "");
                a2.mo66431a("mus_new_notification", recyclerView3);
                musNewNotificationFragment.mo99825k().liveData.observe(musNewNotificationFragment, new C61699n(musNewNotificationFragment));
                musNewNotificationFragment.mo99825k().updateLiveData.observe(musNewNotificationFragment, new C61700o(musNewNotificationFragment));
                AbstractC1174ac a3 = C1181ae.m3879a(musNewNotificationFragment, (C1175ad.AbstractC1177b) null).mo3983a(TutorialVideoViewModel.class);
                C89219l.m154716b(a3, "");
                musNewNotificationFragment.f139997c = (TutorialVideoViewModel) a3;
                TutorialVideoViewModel tutorialVideoViewModel = musNewNotificationFragment.f139997c;
                if (tutorialVideoViewModel == null) {
                    C89219l.m154710a("mTutorialVideoModel");
                }
                tutorialVideoViewModel.mo100241a(musNewNotificationFragment.getContext());
                TutorialVideoViewModel tutorialVideoViewModel2 = musNewNotificationFragment.f139997c;
                if (tutorialVideoViewModel2 == null) {
                    C89219l.m154710a("mTutorialVideoModel");
                }
                tutorialVideoViewModel2.f141268a.observe(musNewNotificationFragment, new C61701p(musNewNotificationFragment));
                C62275p pVar = new C62275p();
                RecyclerView recyclerView4 = (RecyclerView) musNewNotificationFragment.mo99816a(R.id.dof);
                C89219l.m154716b(recyclerView4, "");
                LinearLayoutManager linearLayoutManager2 = musNewNotificationFragment.f139998d;
                if (linearLayoutManager2 == null) {
                    C89219l.m154710a("mLinearLayoutManager");
                }
                pVar.mo100266a(recyclerView4, linearLayoutManager2, new C61702q(musNewNotificationFragment));
                ((NoticeView) musNewNotificationFragment.mo99816a(R.id.bbc)).setIconImage(2131231265);
                SpannableString spannableString = new SpannableString(C34722h.m70923b(R.string.ckg));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C34722h.m70923b(R.string.ckh) + " ");
                if (musNewNotificationFragment.getContext() != null) {
                    Context context2 = musNewNotificationFragment.getContext();
                    if (context2 == null) {
                        C89219l.m154715b();
                    }
                    spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(context2, R.color.bh)), 0, spannableString.length(), 34);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                ((NoticeView) musNewNotificationFragment.mo99816a(R.id.bbc)).setTitleText(spannableStringBuilder);
                NoticeView noticeView = (NoticeView) musNewNotificationFragment.mo99816a(R.id.bbc);
                C89219l.m154716b(noticeView, "");
                C62271n.m112657a(noticeView);
                musNewNotificationFragment.f140005o = new C61517e((NoticeView) musNewNotificationFragment.mo99816a(R.id.bbc), new C61692g());
                C61517e eVar2 = musNewNotificationFragment.f140005o;
                if (eVar2 != null) {
                    eVar2.f139651f = C61517e.EnumC61519a.Message;
                }
                C61799b.f140285a.getEnablePushGuide();
                if (!(C61799b.f140285a.getEnablePushGuide() == 0 || (eVar = musNewNotificationFragment.f140005o) == null)) {
                    eVar.mo99173a();
                }
                musNewNotificationFragment.mo99834p();
                C61819d dVar6 = musNewNotificationFragment.f139995a;
                if (dVar6 == null) {
                    C89219l.m154710a("mAdapter");
                }
                C89219l.m154721d(musNewNotificationFragment, "");
                dVar6.f140349b = musNewNotificationFragment;
                C61819d dVar7 = musNewNotificationFragment.f139995a;
                if (dVar7 == null) {
                    C89219l.m154710a("mAdapter");
                }
                C89219l.m154721d(musNewNotificationFragment, "");
                dVar7.f140348a = musNewNotificationFragment;
                C61819d dVar8 = musNewNotificationFragment.f139995a;
                if (dVar8 == null) {
                    C89219l.m154710a("mAdapter");
                }
                C89219l.m154721d(musNewNotificationFragment, "");
                dVar8.f140352e = musNewNotificationFragment;
                if (C56318b.m102311b()) {
                    TuxIconView tuxIconView2 = (TuxIconView) musNewNotificationFragment.mo99816a(R.id.ph);
                    C89219l.m154716b(tuxIconView2, "");
                    tuxIconView2.setVisibility(0);
                    Space space = (Space) musNewNotificationFragment.mo99816a(R.id.u8);
                    C89219l.m154716b(space, "");
                    space.setVisibility(8);
                    ((TuxIconView) musNewNotificationFragment.mo99816a(R.id.ph)).setOnClickListener(new View$OnClickListenerC61693h(musNewNotificationFragment));
                    C23073a.C23074a.m43506a(musNewNotificationFragment).mo37501c(R.attr.m).mo37505f(R.attr.m).mo37495a(true).f54627a.mo33415d();
                }
                C51648a.f118980a.mo87307a(new C61694i(musNewNotificationFragment));
                try {
                    AbstractC51779c o = musNewNotificationFragment.mo99828o();
                    if (o != null) {
                        Fragment fragment = (Fragment) o;
                        if (fragment.isAdded() || musNewNotificationFragment.getChildFragmentManager().mo3551a("SearchFragment") != null) {
                            z = true;
                        }
                        if (!z) {
                            musNewNotificationFragment.getChildFragmentManager().mo3552a().mo3454a(R.id.dro, fragment, "SearchFragment").mo3474c(fragment).mo3479f().mo3473c();
                        }
                        obj = C89379q.m157068constructorimpl(C89391z.f203057a);
                        Throwable r2 = C89379q.m157071exceptionOrNullimpl(obj);
                        if (r2 != null) {
                            C39109f.m79401a("NotificationFragment", "add search fragment error!", r2);
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
                        MethodCollector.m26664o(3056);
                        throw nullPointerException;
                    }
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
            }
            this.f140017a.onRefresh();
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(3056);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$ad */
    public static final class C61675ad extends AbstractC89220m implements AbstractC89172b<Object, Boolean> {
        public static final C61675ad INSTANCE = new C61675ad();

        static {
            Covode.recordClassIndex(72405);
        }

        public C61675ad() {
            super(1);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final Boolean invoke(Object obj) {
            return obj instanceof View$OnClickListenerC62034af;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$ak */
    static final class C61682ak<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140027a;

        static {
            Covode.recordClassIndex(72412);
        }

        C61682ak(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140027a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f140027a.mo99837s();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$al */
    static final class C61683al<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140028a;

        static {
            Covode.recordClassIndex(72413);
        }

        C61683al(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140028a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f140028a.mo99837s();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$f */
    public static final class C61691f extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140036a;

        static {
            Covode.recordClassIndex(72421);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61691f(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140036a = musNewNotificationFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            C61968c.HandlerC61971c b = C61968c.m112097b();
            if (b != null) {
                boolean z = true;
                if (!(i == 1 || i == 2)) {
                    z = false;
                }
                b.mo100032a(z);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            this.f140036a.mo99839u();
            MusNewNotificationFragment musNewNotificationFragment = this.f140036a;
            LinearLayoutManager linearLayoutManager = musNewNotificationFragment.f139998d;
            if (linearLayoutManager == null) {
                C89219l.m154710a("mLinearLayoutManager");
            }
            int k = linearLayoutManager.mo4371k();
            C61819d dVar = musNewNotificationFragment.f139995a;
            if (dVar == null) {
                C89219l.m154710a("mAdapter");
            }
            int size = dVar.mo63369e().size();
            if (k >= 0 && size > k) {
                C61819d dVar2 = musNewNotificationFragment.f139995a;
                if (dVar2 == null) {
                    C89219l.m154710a("mAdapter");
                }
                if (dVar2.mo63369e().get(k) instanceof C61865a) {
                    List<C51781e> list = musNewNotificationFragment.f140014y;
                    if (list == null || list.isEmpty()) {
                        C61819d dVar3 = musNewNotificationFragment.f139995a;
                        if (dVar3 == null) {
                            C89219l.m154710a("mAdapter");
                        }
                        for (MusNotice musNotice : dVar3.mo63369e()) {
                            if (musNotice instanceof C61865a) {
                                C61865a aVar = (C61865a) musNotice;
                                if (aVar.f140449a == 2010 && aVar.f140450b != null) {
                                    musNewNotificationFragment.f140014y.add(new C51781e(aVar.f140450b));
                                }
                            }
                        }
                    }
                    musNewNotificationFragment.mo99828o().mo87504a(musNewNotificationFragment.f140014y);
                    return;
                }
                musNewNotificationFragment.mo99828o().mo87503a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$i */
    public static final class C61694i implements AbstractC51499g {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140038a;

        static {
            Covode.recordClassIndex(72424);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61694i(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140038a = musNewNotificationFragment;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51499g
        /* renamed from: a */
        public final void mo86981a(EnumC66622f fVar) {
            C89219l.m154721d(fVar, "");
            if (fVar == EnumC66622f.CONTACT && !this.f140038a.mo99827n().f141507e) {
                this.f140038a.mo99827n().mo100358n().postValue(Boolean.valueOf(C51648a.f118980a.mo87322d().mo86984c()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$m */
    public static final class C61698m extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140042a;

        static {
            Covode.recordClassIndex(72428);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61698m(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140042a = musNewNotificationFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            if (RecyclerView.m4277d(view) == MusNewNotificationFragment.m111694c(this.f140042a).getItemCount() - 1) {
                rect.bottom = (int) C13628n.m24520b(this.f140042a.getContext(), 19.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$q */
    public static final class C61702q implements C62275p.AbstractC62276a {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140046a;

        static {
            Covode.recordClassIndex(72432);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61702q(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140046a = musNewNotificationFragment;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.utils.C62275p.AbstractC62276a
        /* renamed from: a */
        public final void mo99852a(int i) {
            MusNewNotificationFragment.m111694c(this.f140046a).mo99895d(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$af */
    public static final class View$OnClickListenerC61677af implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140022a;

        static {
            Covode.recordClassIndex(72407);
        }

        View$OnClickListenerC61677af(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140022a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140022a.mo99842x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$ag */
    public static final class View$OnClickListenerC61678ag implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140023a;

        static {
            Covode.recordClassIndex(72408);
        }

        View$OnClickListenerC61678ag(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140023a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140023a.onRefresh();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$c */
    static final class C61688c extends AbstractC89220m implements AbstractC89172b<C56398e.C56399a, C89391z> {

        /* renamed from: a */
        public static final C61688c f140033a = new C61688c();

        static {
            Covode.recordClassIndex(72418);
        }

        C61688c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56398e.C56399a aVar) {
            C56398e.C56399a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo93390c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$h */
    static final class View$OnClickListenerC61693h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140037a;

        static {
            Covode.recordClassIndex(72423);
        }

        View$OnClickListenerC61693h(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140037a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140037a.requireActivity().finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$p */
    static final class C61701p<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140045a;

        static {
            Covode.recordClassIndex(72431);
        }

        C61701p(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140045a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            MusNewNotificationFragment.m111694c(this.f140045a).mo99891a((TutorialVideoResp) obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$y */
    public static final class C61710y<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140057a;

        static {
            Covode.recordClassIndex(72440);
        }

        C61710y(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140057a = musNewNotificationFragment;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (this.f140057a.af_()) {
                this.f140057a.mo99840v();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ C61819d m111694c(MusNewNotificationFragment musNewNotificationFragment) {
        C61819d dVar = musNewNotificationFragment.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        return dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        C56346e.m102332a(EnumC56341a.ON_ACTIVITY_CREATED, new C61707v(this, bundle));
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onCreate(Bundle bundle) {
        C56346e.m102332a(EnumC56341a.ON_CREATE, new C61708w(this, bundle));
    }

    @AbstractC90264r
    public final void onResumeRefreshEvent(C61562n nVar) {
        C89219l.m154721d(nVar, "");
        if (af_()) {
            this.f140009s = true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onUnder16RefreshEvent(C56198e eVar) {
        C89219l.m154721d(eVar, "");
        mo99834p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$ae */
    public static final class C61676ae extends AbstractC89220m implements AbstractC89172b<Integer, RecyclerView.ViewHolder> {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140021a;

        static {
            Covode.recordClassIndex(72406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61676ae(MusNewNotificationFragment musNewNotificationFragment) {
            super(1);
            this.f140021a = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ RecyclerView.ViewHolder invoke(Integer num) {
            return ((RecyclerView) this.f140021a.mo99816a(R.id.dof)).mo4451f(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$am */
    static final class C61684am<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140029a;

        static {
            Covode.recordClassIndex(72414);
        }

        C61684am(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140029a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            ((DmtStatusView) this.f140029a.mo99816a(R.id.ed4)).mo27384f();
            this.f140029a.mo99819a(EnumC61671a.ORIGIN_DATA);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        dVar.mo67824j();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onNotificationIndicatorEvent(C61561m mVar) {
        C62287c cVar;
        C89219l.m154721d(mVar, "");
        if (af_() && (cVar = this.f139999e) != null) {
            cVar.mo100279b();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C56196c cVar) {
        C89219l.m154721d(cVar, "");
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        dVar.notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$ai */
    static final class C61680ai<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140025a;

        static {
            Covode.recordClassIndex(72410);
        }

        C61680ai(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140025a = musNewNotificationFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
            if (r4 != null) goto L_0x0015;
         */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.notification.vm.a r6 = (com.p2082ss.android.ugc.aweme.notification.p3535vm.C62380a) r6
                com.ss.android.ugc.aweme.friends.model.RecommendList r4 = r6.f141557a
                r3 = 0
                if (r4 == 0) goto L_0x003a
                java.util.List r0 = r4.getUserList()
                if (r0 == 0) goto L_0x003a
                int r0 = r0.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            L_0x0015:
                com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r4.extra
                if (r0 == 0) goto L_0x001d
                java.lang.String r1 = r0.logid
                if (r1 != 0) goto L_0x0027
            L_0x001d:
                com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r4.getLogPb()
                if (r0 == 0) goto L_0x003e
                java.lang.String r1 = r0.getImprId()
            L_0x0027:
                com.ss.android.ugc.aweme.inbox.d.l r0 = new com.ss.android.ugc.aweme.inbox.d.l
                r0.<init>(r2, r3, r1)
                com.p2082ss.android.ugc.aweme.inbox.p3269d.C56346e.m102337b(r0)
                com.ss.android.ugc.aweme.notification.MusNewNotificationFragment r1 = r5.f140025a
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r6, r0)
                r1.mo99820a(r6)
                return
            L_0x003a:
                r2 = r3
                if (r4 == 0) goto L_0x003e
                goto L_0x0015
            L_0x003e:
                r1 = r3
                goto L_0x0027
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.MusNewNotificationFragment.C61680ai.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$n */
    static final class C61699n<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140043a;

        static {
            Covode.recordClassIndex(72429);
        }

        C61699n(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140043a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            NoticeCombineDatas noticeCombineDatas = (NoticeCombineDatas) obj;
            if (noticeCombineDatas != null) {
                MusNewNotificationFragment.m111694c(this.f140043a).mo99892a(noticeCombineDatas, this.f140043a.f140001k);
            }
            if (this.f140043a.f140004n) {
                this.f140043a.mo99840v();
                return;
            }
            this.f140043a.mo99841w();
            if (!this.f140043a.f140011u) {
                this.f140043a.f140011u = true;
                C35434c.m72464b("mus_new_notification");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$o */
    static final class C61700o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140044a;

        static {
            Covode.recordClassIndex(72430);
        }

        C61700o(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140044a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<CombineLiveNotice> list;
            LiveNoticeMessageResponse liveNoticeMessageResponse = (LiveNoticeMessageResponse) obj;
            this.f140044a.f140003m.decrementAndGet();
            if (liveNoticeMessageResponse != null) {
                C61819d c = MusNewNotificationFragment.m111694c(this.f140044a);
                LiveMessage liveMessage = liveNoticeMessageResponse.liveMessage;
                if (liveMessage != null) {
                    list = liveMessage.liveNotice;
                } else {
                    list = null;
                }
                c.mo99896e(list);
            }
            if (this.f140044a.f140004n) {
                this.f140044a.mo99840v();
            } else {
                this.f140044a.mo99841w();
            }
        }
    }

    /* renamed from: a */
    private final void m111691a(C62454b bVar) {
        if (this.f139991I) {
            new Handler().post(new RunnableC61685an(this, bVar));
            this.f139991I = false;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN, mo145423b = true)
    public final void onSwitchInbox(C61548d dVar) {
        C89219l.m154721d(dVar, "");
        C61968c.HandlerC61971c b = C61968c.m112097b();
        if (b != null) {
            b.mo100043j();
        }
        if (C56318b.m102312c()) {
            NotificationCombineVM n = mo99827n();
            EnumC56501q.CONTACTS.markEnterInbox();
            EnumC56501q.THIRD_PLATFORM.markEnterInbox();
            n.f141489b = false;
            n.f141508f = false;
            n.mo100348g().clear();
            this.f139991I = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$aj */
    static final class C61681aj<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140026a;

        static {
            Covode.recordClassIndex(72411);
        }

        C61681aj(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140026a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C62380a aVar = (C62380a) obj;
            MusNewNotificationFragment musNewNotificationFragment = this.f140026a;
            C89219l.m154716b(aVar, "");
            if (musNewNotificationFragment.af_()) {
                NotificationCombineVM n = musNewNotificationFragment.mo99827n();
                C61819d dVar = musNewNotificationFragment.f139995a;
                if (dVar == null) {
                    C89219l.m154710a("mAdapter");
                }
                C62454b a = n.mo100351a(dVar.mo99898l(), aVar);
                if (!a.f141689c) {
                    musNewNotificationFragment.mo99838t();
                } else {
                    C61819d dVar2 = musNewNotificationFragment.f139995a;
                    if (dVar2 == null) {
                        C89219l.m154710a("mAdapter");
                    }
                    dVar2.mo67829d(true);
                    C61819d dVar3 = musNewNotificationFragment.f139995a;
                    if (dVar3 == null) {
                        C89219l.m154710a("mAdapter");
                    }
                    dVar3.aq_();
                }
                C61819d dVar4 = musNewNotificationFragment.f139995a;
                if (dVar4 == null) {
                    C89219l.m154710a("mAdapter");
                }
                dVar4.mo99897f(a.f141687a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$r */
    static final class View$OnClickListenerC61703r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140047a;

        static {
            Covode.recordClassIndex(72433);
        }

        View$OnClickListenerC61703r(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140047a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (C61542b.m111467b().shouldRedictToTipsPage()) {
                C61542b.m111467b().goToTipsPage();
                return;
            }
            IIMService a = C62239a.C62240a.m112592a();
            Context requireContext = this.f140047a.requireContext();
            C89219l.m154716b(requireContext, "");
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "notification_page");
            bundle.putString("enter_method", "button");
            bundle.putString("notice_type", this.f140047a.mo99826m().mo99182c());
            bundle.putInt("message_cnt", this.f140047a.mo99826m().mo99183d());
            a.openSessionListActivity(requireContext, bundle);
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public final void mo25224b(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        String string = bundle.getString(C34792be.f82123b, "");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        String d = Hox.C15490a.m28529a(activity).mo25216d("HOME");
        if (C89219l.m154714a((Object) string, (Object) C34792be.f82125d) || bundle.getBoolean(d)) {
            if (af_()) {
                mo99836r();
                mo99821c(false);
                AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f139996b;
                if (analysisStayTimeFragmentComponent == null) {
                    C89219l.m154710a("mStayTimeFragmentComponent");
                }
                analysisStayTimeFragmentComponent.mo100243a(true);
            } else {
                return;
            }
        }
        m111686I();
        this.f139992J = false;
    }

    /* renamed from: c */
    public final void mo99821c(boolean z) {
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        View$OnClickListenerC62034af afVar = (View$OnClickListenerC62034af) C89309k.m154808d(C89309k.m154799a(C89309k.m154811f(C89070n.m154598r(C89271h.m154766a(0, dVar.getItemCount())), new C61676ae(this)), (AbstractC89172b) C61675ad.INSTANCE));
        if (afVar != null) {
            if (z) {
                if (afVar.f140794a != null) {
                    afVar.f140794a.mo100282a();
                }
            } else if (afVar.f140794a != null) {
                C62291e eVar = afVar.f140794a;
                if (eVar.f141394f != null) {
                    eVar.f141394f.cancel();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment$j */
    static final class View$OnClickListenerC61695j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationFragment f140039a;

        static {
            Covode.recordClassIndex(72425);
        }

        View$OnClickListenerC61695j(MusNewNotificationFragment musNewNotificationFragment) {
            this.f140039a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            C62287c cVar;
            ClickAgent.onClick(view);
            MusNewNotificationFragment musNewNotificationFragment = this.f140039a;
            RelativeLayout relativeLayout = (RelativeLayout) musNewNotificationFragment.mo99816a(R.id.dm7);
            C89219l.m154716b(relativeLayout, "");
            if (musNewNotificationFragment.af_()) {
                if (musNewNotificationFragment.f139999e == null) {
                    Context context = musNewNotificationFragment.getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(context, "");
                    musNewNotificationFragment.f139999e = new C62287c(context, musNewNotificationFragment);
                    if (MSAdaptionService.m97895c().mo89377c((Context) musNewNotificationFragment.getActivity()) && (cVar = musNewNotificationFragment.f139999e) != null) {
                        cVar.setWidth(C34723i.m70930c(musNewNotificationFragment.getActivity()));
                    }
                    C62287c cVar2 = musNewNotificationFragment.f139999e;
                    if (cVar2 != null) {
                        cVar2.mo100278a(musNewNotificationFragment.f140000j);
                    }
                    C62287c cVar3 = musNewNotificationFragment.f139999e;
                    if (cVar3 != null) {
                        cVar3.setOnDismissListener(new C61679ah(musNewNotificationFragment));
                    }
                }
                C62287c cVar4 = musNewNotificationFragment.f139999e;
                if (cVar4 != null) {
                    cVar4.showAsDropDown(relativeLayout);
                }
                View a = musNewNotificationFragment.mo99816a(R.id.fb2);
                C89219l.m154716b(a, "");
                a.setVisibility(0);
                ImageView imageView = (ImageView) musNewNotificationFragment.mo99816a(R.id.c0i);
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(8);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(musNewNotificationFragment.mo99816a(R.id.bvn), "rotation", 0.0f, 180.0f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
            C62259e.m112625b(this.f140039a.mo99827n().mo100343b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r6 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ca, code lost:
        if (r1 != 2004) goto L_0x00a4;
     */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59516b(java.lang.Exception r8) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.MusNewNotificationFragment.mo59516b(java.lang.Exception):void");
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public final void mo25223a(Bundle bundle) {
        C61517e eVar;
        C89219l.m154721d(bundle, "");
        String string = bundle.getString(C34792be.f82123b, "");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        String d = Hox.C15490a.m28529a(activity).mo25216d("HOME");
        ActivityC0945e activity2 = getActivity();
        if (activity2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity2, "");
        Hox.C15490a.m28529a(activity2).mo25216d(d);
        if (C89219l.m154714a((Object) string, (Object) C34792be.f82125d) || bundle.getBoolean(d)) {
            if (af_()) {
                C61819d dVar = this.f139995a;
                if (dVar == null) {
                    C89219l.m154710a("mAdapter");
                }
                if (!C13603b.m24435a((Collection) dVar.mo63369e())) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo99816a(R.id.e5x);
                    C89219l.m154716b(swipeRefreshLayout, "");
                    if (!swipeRefreshLayout.mRefreshing) {
                        onRefresh();
                    }
                }
                mo99836r();
                mo99821c(true);
                AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f139996b;
                if (analysisStayTimeFragmentComponent == null) {
                    C89219l.m154710a("mStayTimeFragmentComponent");
                }
                analysisStayTimeFragmentComponent.mo100243a(false);
                C61799b.f140285a.getEnablePushGuide();
                if (!(C61799b.f140285a.getEnablePushGuide() == 0 || (eVar = this.f140005o) == null)) {
                    eVar.mo99173a();
                }
            } else {
                return;
            }
        }
        this.f139992J = true;
        mo99844z();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61850i
    /* renamed from: a */
    public final void mo99818a(C61631f fVar) {
        C89219l.m154721d(fVar, "");
        this.f140002l = fVar.f139899a;
        mo99825k().setCurrentNoticeGroup(this.f140002l);
        C61819d dVar = this.f139995a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        dVar.mo99890a(this.f140002l, fVar);
        mo99827n().mo100339a(fVar);
        if (this.f140002l == C61530a.C61532b.m111445a()) {
            TuxTextView tuxTextView = (TuxTextView) mo99816a(R.id.ewu);
            C89219l.m154716b(tuxTextView, "");
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            tuxTextView.setText(context.getString(R.string.dia));
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) mo99816a(R.id.ewu);
            C89219l.m154716b(tuxTextView2, "");
            Context context2 = getContext();
            if (context2 == null) {
                C89219l.m154715b();
            }
            tuxTextView2.setText(context2.getString(fVar.f139900b));
        }
        mo99817a(fVar.f139902d, fVar.f139903e, fVar.f139904f);
        m111683C();
        C62287c cVar = this.f139999e;
        if (cVar != null) {
            cVar.dismiss();
        }
        C62259e.m112618a(mo99827n().mo100343b());
    }

    /* renamed from: a */
    private static String m111687a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        C56346e.m102332a(EnumC56341a.ON_VIEW_CREATED, new C61673ab(this, view, bundle));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<MusNotice> list, boolean z) {
        if (af_()) {
            mo99827n().mo100361q().size();
            if (list != null) {
                Integer.valueOf(list.size());
            }
            if (!C13603b.m24435a((Collection) list)) {
                int size = mo99827n().mo100361q().size();
                if (list == null) {
                    C89219l.m154715b();
                }
                if (size < list.size() && (!((Boolean) C61797a.f140282b.getValue()).booleanValue() || z)) {
                    List g = C89070n.m154585g((Collection) list);
                    g.removeAll(mo99827n().mo100361q());
                    mo99827n().mo100361q().addAll(g);
                    C61819d dVar = this.f139995a;
                    if (dVar == null) {
                        C89219l.m154710a("mAdapter");
                    }
                    List e = dVar.mo63369e();
                    e.addAll(g);
                    C61819d dVar2 = this.f139995a;
                    if (dVar2 == null) {
                        C89219l.m154710a("mAdapter");
                    }
                    dVar2.mo62376b(e);
                    if (this.f140002l != C61530a.C61532b.m111445a()) {
                        C61819d dVar3 = this.f139995a;
                        if (dVar3 == null) {
                            C89219l.m154710a("mAdapter");
                        }
                        if (dVar3.f140350c) {
                            mo99838t();
                            return;
                        }
                    }
                    C61819d dVar4 = this.f139995a;
                    if (dVar4 == null) {
                        C89219l.m154710a("mAdapter");
                    }
                    dVar4.mo67829d(true);
                    C61819d dVar5 = this.f139995a;
                    if (dVar5 == null) {
                        C89219l.m154710a("mAdapter");
                    }
                    dVar5.aq_();
                    return;
                }
            }
            this.f140013w = true;
            mo99819a(EnumC61671a.ADAPTER_DATA);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return (View) C56346e.m102332a(EnumC56341a.ON_CREATE_VIEW, new C61709x(layoutInflater, viewGroup));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024) {
            this.f140003m.incrementAndGet();
            C62020a aVar = (C62020a) mo99823i().f92286h;
            if (aVar != null) {
                aVar.f140757d = true;
                aVar.f140756c = false;
                aVar.mo100073a(System.currentTimeMillis() / 1000, 1, 0);
            }
        } else if (i == 996) {
            AbstractC81915c.m141874a(new C63498e());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo99817a(int i, int i2, int i3) {
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        MtEmptyView a = MtEmptyView.m31926a(activity);
        ActivityC0945e activity2 = getActivity();
        if (activity2 == null) {
            C89219l.m154715b();
        }
        C17273d.C17274a c = new C17273d.C17274a(activity2).mo27457a(i3).mo27462b(i).mo27464c(i2);
        C89219l.m154716b(c, "");
        if (i == R.string.cj && QnaService.m117969a().enablePublicQna()) {
            c.mo27459a(EnumC17270a.SOLID, R.string.ch, new View$OnClickListenerC61677af(this));
        }
        a.setStatus(c.f41365a);
        C89219l.m154716b(a, "");
        a.mo27428a(C0643b.m2378c(a.getContext(), R.color.bx), getResources().getDrawable(R.drawable.n_), (int) C13628n.m24520b(getContext(), 30.0f), (int) C13628n.m24520b(getContext(), 84.0f));
        ActivityC0945e activity3 = getActivity();
        if (activity3 == null) {
            C89219l.m154715b();
        }
        C17273d dVar = new C17273d.C17274a(activity3).mo27462b(R.string.crk).mo27463b("").f41365a;
        DmtStatusView.C17269a a2 = DmtStatusView.C17269a.m31905a(getActivity()).mo27397a().mo27400a(2131233181, R.string.gzs, R.string.gzr, R.string.gzy, new View$OnClickListenerC61678ag(this));
        if (!C62269l.m112652a()) {
            a2.mo27406b(a);
        } else {
            a2.mo27404a(dVar);
        }
        ((DmtStatusView) mo99816a(R.id.ed4)).setBuilder(a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final /* synthetic */ void mo60910a(int i, User user, int i2) {
        User user2 = user;
        if (af_()) {
            String str = "";
            if (i == C51700au.f119171c) {
                if (user2 != null) {
                    SmartRoute withParam = SmartRouter.buildRoute(getActivity(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", user2.getRecommendReason()).withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_from_type", "list");
                    String h = mo99827n().mo100362r().mo100416h();
                    if (h != null) {
                        str = h;
                    }
                    withParam.withParam("enter_from_request_id", str).withParam("recommend_enter_profile_params", new C66623g("notification_page", null, C59256u.EnumC59259c.CARD, user2.getRecType(), C66623g.C66624a.m118386a(user2), user2.getUid(), null, null, user2.getRequestId(), null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
                    C62259e.m112630d(user2, Integer.valueOf(mo99827n().mo100353b(user2.getUid())), mo99827n().mo100343b());
                }
            } else if (i == C51700au.f119176h) {
                if (af_()) {
                    getContext();
                    if (!m111682B()) {
                        new C23144b(this).mo37640e(R.string.dcq).mo37637b();
                    } else if (user2 != null) {
                        C62259e.m112628c(user2, Integer.valueOf(mo99827n().mo100353b(user2.getUid())), mo99827n().mo100343b());
                    }
                }
            } else if (i == C51700au.f119173e) {
                if (af_()) {
                    getContext();
                    if (!m111682B()) {
                        new C23144b(this).mo37640e(R.string.dcq).mo37637b();
                    } else if (user2 != null) {
                        C61819d dVar = this.f139995a;
                        if (dVar == null) {
                            C89219l.m154710a("mAdapter");
                        }
                        dVar.mo99893a(user2);
                        C66652b bVar = C66652b.f149825a;
                        String uid = user2.getUid();
                        C89219l.m154716b(uid, str);
                        bVar.mo105655a(uid, user2.getSecUid());
                        C62259e.m112624b(user2, Integer.valueOf(mo99827n().mo100353b(user2.getUid())), mo99827n().mo100343b());
                    }
                }
            } else if (i == C51700au.f119175g && user2 != null && !this.f139993K.contains(user2.getUid())) {
                if (user2.isShould_write_impr()) {
                    C61504e.C61505a.f139616a.mo99160a(1, user2.getUid());
                }
                C62259e.m112616a(user2, Integer.valueOf(mo99827n().mo100353b(user2.getUid())), mo99827n().mo100343b());
                Set<String> set = this.f139993K;
                String uid2 = user2.getUid();
                C89219l.m154716b(uid2, str);
                set.add(uid2);
            }
        }
    }
}
