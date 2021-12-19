package com.bytedance.tiktok.homepage.mainpagefragment.notification;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.AbstractC18006a;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.AbstractC22824b;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22825c;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39235f;
import com.p2082ss.android.ugc.aweme.experiment.C46872eb;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53318b;
import com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.inbox.C56469l;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56501q;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56344d;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import com.p2082ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p2082ss.android.ugc.aweme.main.MainPageFragment;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.p3435h.C59101a;
import com.p2082ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61538b;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61545a;
import com.p2082ss.android.ugc.aweme.notice.api.services.C61611b;
import com.p2082ss.android.ugc.aweme.notification.AbstractC61861b;
import com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a.C61964b;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62230g;
import com.p2082ss.android.ugc.aweme.p3070im.p3071a.C53589a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c */
public final class C22858c implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public final ActivityC0945e f53980a;

    /* renamed from: b */
    public final AbstractC18234b f53981b;

    /* renamed from: c */
    public final C22825c f53982c;

    /* renamed from: d */
    public TabChangeManager f53983d;

    /* renamed from: e */
    public IAccountService.AbstractC31272b f53984e;

    /* renamed from: f */
    public Handler f53985f;

    /* renamed from: g */
    public boolean f53986g = true;

    /* renamed from: h */
    public Runnable f53987h;

    /* renamed from: i */
    public boolean f53988i = true;

    /* renamed from: j */
    public boolean f53989j;

    /* renamed from: k */
    private final View f53990k;

    /* renamed from: l */
    private final AbstractC39235f f53991l;

    /* renamed from: m */
    private final ScrollSwitchStateManager f53992m;

    /* renamed from: n */
    private final MainAnimViewModel f53993n;

    /* renamed from: o */
    private boolean f53994o;

    /* renamed from: p */
    private int f53995p;

    /* renamed from: q */
    private boolean f53996q = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: r */
    private final DmNoticeProxy f53997r;

    /* renamed from: s */
    private final AbstractC89244h f53998s;

    static {
        Covode.recordClassIndex(26759);
    }

    /* renamed from: a */
    public final DrawerViewModel mo37169a() {
        return (DrawerViewModel) this.f53998s.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(137, new RunnableC90250g(C22858c.class, "onNotificationIndicatorEvent", C61561m.class, ThreadMode.MAIN, 0, true));
        hashMap.put(257, new RunnableC90250g(C22858c.class, "onDoubleClickInbox", C61545a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$c */
    public static final class C22863c implements AbstractC53047e {

        /* renamed from: a */
        final /* synthetic */ C22858c f54008a;

        static {
            Covode.recordClassIndex(26764);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37185a(float f) {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37186a(int i, boolean z, boolean z2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: b */
        public final void mo37187b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e
        /* renamed from: b */
        public final void mo37188b(float f) {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e
        /* renamed from: c */
        public final void mo37189c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53047e
        /* renamed from: d */
        public final void mo37190d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37184a() {
            this.f54008a.f53982c.mo37147a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C22863c(C22858c cVar) {
            this.f54008a = cVar;
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$f */
    static final class RunnableC22866f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map f54012a;

        static {
            Covode.recordClassIndex(26767);
        }

        RunnableC22866f(Map map) {
            this.f54012a = map;
        }

        public final void run() {
            C39162r.m79460a("double_click_tab_name", this.f54012a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$i */
    public static final class RunnableC22869i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22858c f54015a;

        static {
            Covode.recordClassIndex(26770);
        }

        RunnableC22869i(C22858c cVar) {
            this.f54015a = cVar;
        }

        public final void run() {
            this.f54015a.mo37173c();
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$a */
    public static final class C22859a implements AbstractC22824b {

        /* renamed from: a */
        final /* synthetic */ C22858c f53999a;

        /* renamed from: b */
        final /* synthetic */ ScrollSwitchStateManager f54000b;

        /* renamed from: c */
        final /* synthetic */ MainAnimViewModel f54001c;

        /* renamed from: d */
        final /* synthetic */ C22863c f54002d;

        static {
            Covode.recordClassIndex(26760);
        }

        /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$a$a */
        static final class RunnableC22860a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C22859a f54003a;

            static {
                Covode.recordClassIndex(26761);
            }

            RunnableC22860a(C22859a aVar) {
                this.f54003a = aVar;
            }

            public final void run() {
                this.f54003a.f53999a.mo37169a().mo89468b(this.f54003a.f54002d);
            }
        }

        /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$a$b */
        static final class RunnableC22861b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C22859a f54004a;

            static {
                Covode.recordClassIndex(26762);
            }

            RunnableC22861b(C22859a aVar) {
                this.f54004a = aVar;
            }

            public final void run() {
                this.f54004a.f53999a.mo37169a().mo89468b(this.f54004a.f54002d);
            }
        }

        @Override // com.bytedance.tiktok.homepage.mainpagefragment.dialog.AbstractC22824b
        /* renamed from: b */
        public final void mo37144b() {
            this.f53999a.f53986g = false;
            this.f53999a.mo37174d();
            Handler handler = this.f53999a.f53985f;
            if (handler != null) {
                handler.post(new RunnableC22861b(this));
            }
        }

        @Override // com.bytedance.tiktok.homepage.mainpagefragment.dialog.AbstractC22824b
        /* renamed from: c */
        public final void mo37145c() {
            if (C61538b.m111451b()) {
                this.f53999a.f53986g = false;
                this.f53999a.mo37174d();
                Handler handler = this.f53999a.f53985f;
                if (handler != null) {
                    handler.post(new RunnableC22860a(this));
                }
            }
        }

        @Override // com.bytedance.tiktok.homepage.mainpagefragment.dialog.AbstractC22824b
        /* renamed from: d */
        public final void mo37146d() {
            this.f53999a.f53986g = true;
            this.f53999a.mo37173c();
            C53318b bVar = (C53318b) HomeTabViewModel.C53309a.m98315a(this.f53999a.f53980a).mo89735a("PUBLISH");
            if (bVar != null) {
                bVar.mo89775j();
            }
            C61964b.m112089a("MainPageFragment", "UnReadCountMonitor isShowNotifyPop: " + this.f53999a.f53982c.f53909i);
        }

        @Override // com.bytedance.tiktok.homepage.mainpagefragment.dialog.AbstractC22824b
        /* renamed from: a */
        public final void mo37143a() {
            this.f53999a.mo37171a(true);
            C22858c cVar = this.f53999a;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f54000b;
            MainAnimViewModel mainAnimViewModel = this.f54001c;
            C89219l.m154721d(scrollSwitchStateManager, "");
            C89219l.m154721d(mainAnimViewModel, "");
            if (!C89219l.m154714a((Object) "NOTIFICATION", (Object) cVar.f53983d.f134312d)) {
                cVar.f53983d.mo96533a("NOTIFICATION", false);
                C81079v.m140776O().mo123908B();
                C80749k.m140049a().mo123953b();
                cVar.mo37178h();
                scrollSwitchStateManager.mo89345a(false);
                AbstractC18234b bVar = cVar.f53981b;
                Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainPageFragment");
                ((MainPageFragment) bVar).mo96507b(true);
                C49907s.m93686a(EnumC48310af.NOTICE);
            }
            cVar.f53982c.mo37147a();
        }

        C22859a(C22858c cVar, ScrollSwitchStateManager scrollSwitchStateManager, MainAnimViewModel mainAnimViewModel, C22863c cVar2) {
            this.f53999a = cVar;
            this.f54000b = scrollSwitchStateManager;
            this.f54001c = mainAnimViewModel;
            this.f54002d = cVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$e */
    public static final class CallableC22865e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ HashMap f54011a;

        static {
            Covode.recordClassIndex(26766);
        }

        CallableC22865e(HashMap hashMap) {
            this.f54011a = hashMap;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C39162r.m79460a("enter_homepage_message", this.f54011a);
            return null;
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$k */
    static final class C22871k extends AbstractC89220m implements AbstractC89171a<DrawerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C22858c f54017a;

        static {
            Covode.recordClassIndex(26772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22871k(C22858c cVar) {
            super(0);
            this.f54017a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DrawerViewModel invoke() {
            return DrawerViewModel.C53032a.m97961a(this.f54017a.f53980a);
        }
    }

    /* renamed from: h */
    public final void mo37178h() {
        C59101a.m108579b(this.f53981b.getActivity());
    }

    /* renamed from: i */
    private final void m43082i() {
        if (this.f53981b.af_()) {
            if (C61542b.m111469c(12)) {
                C61542b.m111470d(12);
            }
        }
    }

    /* renamed from: j */
    private final void m43083j() {
        if (this.f53981b.af_()) {
            if (C61542b.m111469c(1000)) {
                C61542b.m111470d(1000);
            }
        }
    }

    /* renamed from: f */
    public final void mo37176f() {
        AbstractC53316a aVar;
        if (this.f53981b.af_() && (aVar = (AbstractC53316a) HomeTabViewModel.C53309a.m98315a(this.f53980a).mo89739b("USER")) != null) {
            aVar.mo89767m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$d */
    public static final class CallableC22864d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ int f54009a;

        /* renamed from: b */
        final /* synthetic */ int f54010b;

        static {
            Covode.recordClassIndex(26765);
        }

        CallableC22864d(int i, int i2) {
            this.f54009a = i;
            this.f54010b = i2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final Object call() {
            HashMap hashMap = new HashMap();
            if (this.f54009a > 0) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(this.f54009a));
                hashMap.put("previous_show_cnt", String.valueOf(this.f54010b));
            } else {
                hashMap.put("notice_type", "yellow_dot");
            }
            C39162r.m79460a("message_notice_show", hashMap);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$h */
    public static final class RunnableC22868h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22858c f54014a;

        static {
            Covode.recordClassIndex(26769);
        }

        RunnableC22868h(C22858c cVar) {
            this.f54014a = cVar;
        }

        public final void run() {
            Handler handler;
            if ((ActivityStack.getTopActivity() instanceof AbstractC18006a) || this.f54014a.f53982c.f53912l) {
                Runnable runnable = this.f54014a.f53987h;
                if (runnable != null && (handler = this.f54014a.f53985f) != null) {
                    handler.postDelayed(runnable, 5000);
                    return;
                }
                return;
            }
            C22825c cVar = this.f54014a.f53982c;
            if (!cVar.f53910j || !cVar.f53909i) {
                this.f54014a.f53982c.f53909i = true;
                this.f54014a.f53986g = false;
                this.f54014a.mo37174d();
            }
        }
    }

    /* renamed from: k */
    private final void m43084k() {
        int b = C62230g.m112532b();
        if (b > this.f53995p) {
            this.f53994o = false;
        }
        if (!this.f53994o) {
            boolean a = C62230g.m112530a();
            if (b > 0 || a) {
                C1731i.m5640b(new CallableC22864d(b, this.f53995p), C39162r.m79452a());
                this.f53994o = true;
                this.f53995p = b;
            }
        }
    }

    /* renamed from: b */
    public final void mo37172b() {
        Handler handler;
        this.f53985f = new Handler(Looper.getMainLooper());
        this.f53987h = new RunnableC22868h(this);
        Handler handler2 = this.f53985f;
        if (handler2 != null) {
            handler2.post(new RunnableC22869i(this));
        }
        this.f53986g = true;
        this.f53982c.f53909i = false;
        Runnable runnable = this.f53987h;
        if (runnable != null && (handler = this.f53985f) != null) {
            handler.postDelayed(runnable, 5000);
        }
    }

    /* renamed from: c */
    public final void mo37173c() {
        if (this.f53981b.af_()) {
            C51423a.m95784a(4, "MainPageFragment", "UnReadCountMonitor hideNoticeCount");
            AbstractC53316a aVar = (AbstractC53316a) HomeTabViewModel.C53309a.m98315a(this.f53980a).mo89739b("NOTIFICATION");
            if (aVar != null) {
                aVar.mo89752a(true, -1);
            }
        }
    }

    /* renamed from: d */
    public final void mo37174d() {
        if (this.f53981b.af_()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                mo37175e();
                return;
            }
            m43084k();
            int b = C62230g.m112532b();
            C56344d.m102331a(b);
            m43081a(b);
            AbstractC53316a aVar = (AbstractC53316a) HomeTabViewModel.C53309a.m98315a(this.f53980a).mo89739b("NOTIFICATION");
            if (aVar != null) {
                aVar.mo89752a(true, b);
            }
        }
    }

    /* renamed from: e */
    public final void mo37175e() {
        if (this.f53981b.af_()) {
            C51423a.m95784a(4, "MainPageFragment", "UnReadCountMonitor hideNotificationDot");
            AbstractC53316a aVar = (AbstractC53316a) HomeTabViewModel.C53309a.m98315a(this.f53980a).mo89739b("NOTIFICATION");
            if (aVar != null) {
                aVar.mo89767m();
            }
            if (C61542b.m111469c(0)) {
                C61542b.m111470d(0);
            }
            m43082i();
            m43083j();
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$b */
    static final class RunnableC22862b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22858c f54005a;

        /* renamed from: b */
        final /* synthetic */ Integer f54006b;

        /* renamed from: c */
        final /* synthetic */ C61561m f54007c;

        static {
            Covode.recordClassIndex(26763);
        }

        RunnableC22862b(C22858c cVar, Integer num, C61561m mVar) {
            this.f54005a = cVar;
            this.f54006b = num;
            this.f54007c = mVar;
        }

        public final void run() {
            C22858c cVar = this.f54005a;
            Integer num = this.f54006b;
            C89219l.m154716b(num, "");
            int intValue = num.intValue();
            C61561m mVar = this.f54007c;
            Integer num2 = this.f54006b;
            C89219l.m154716b(num2, "");
            cVar.mo37170a(intValue, mVar.mo99295a(num2.intValue()));
            Integer num3 = this.f54006b;
            C89219l.m154716b(num3, "");
            if (C62230g.m112533b(num3.intValue()) && !this.f54005a.f53986g && !this.f54005a.f53982c.f53910j) {
                this.f54005a.mo37174d();
            }
        }
    }

    /* renamed from: g */
    public final void mo37177g() {
        if (this.f53981b.af_() && !C53589a.m98814a() && !C53589a.m98815b()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                mo37175e();
            } else if (C62230g.m112532b() > 0) {
                mo37175e();
            } else {
                m43084k();
                C51423a.m95784a(4, "MainPageFragment", "UnReadCountMonitor showNotificationDot");
                AbstractC53316a aVar = (AbstractC53316a) HomeTabViewModel.C53309a.m98315a(this.f53980a).mo89739b("NOTIFICATION");
                if (aVar != null) {
                    aVar.mo89752a(false, 0);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$g */
    public static final class CallableC22867g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ int f54013a;

        static {
            Covode.recordClassIndex(26768);
        }

        CallableC22867g(int i) {
            this.f54013a = i;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C51423a.m95791b(3, null, "UnReadCountMonitor MainPageFragment reverse state:" + C56297a.m102297a());
            C51423a.m95791b(3, null, "UnReadCountMonitor MainPageFragment showNoticeCountOptimize: [all," + this.f54013a + "][99," + C61542b.m111458a(99) + "][7," + C61542b.m111458a(7) + "][12," + C61542b.m111458a(12) + "][13," + C61542b.m111458a(13) + "][2," + C61542b.m111458a(2) + "][6," + C61542b.m111458a(6) + "][3," + C61542b.m111458a(3) + "][14," + C61542b.m111458a(14) + "][43," + C61542b.m111458a(43) + "][47," + C61542b.m111458a(47) + "][62," + C61542b.m111458a(62) + "][81," + C61542b.m111458a(81) + "][21," + C61542b.m111458a(21) + "][228," + C61542b.m111458a(228) + "]");
            return null;
        }
    }

    /* renamed from: a */
    private static void m43081a(int i) {
        C1731i.m5640b(new CallableC22867g(i), C1731i.f5562a);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDoubleClickInbox(C61545a aVar) {
        C89219l.m154721d(aVar, "");
        int b = C62230g.m112532b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        if (b > 0) {
            linkedHashMap.put("notice_type", "number_dot");
            linkedHashMap.put("show_cnt", String.valueOf(b));
        } else if (C62230g.m112530a()) {
            linkedHashMap.put("notice_type", "yellow_dot");
            linkedHashMap.put("show_cnt", "0");
        } else {
            linkedHashMap.put("show_cnt", "0");
        }
        C39162r.m79452a().execute(new RunnableC22866f(linkedHashMap));
    }

    /* renamed from: a */
    public final void mo37171a(boolean z) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("notice_type", "bubble");
            int c = C62230g.m112534c();
            int[] iArr = (int[]) C62230g.f141245a.getValue();
            hashMap.put("show_cnt", String.valueOf(C61542b.m111458a(Arrays.copyOf(iArr, iArr.length)) + c));
        } else if (C62230g.m112530a()) {
            hashMap.put("notice_type", "yellow_dot");
        } else {
            int b = C62230g.m112532b();
            if (b > 0) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(b));
            }
        }
        hashMap.put("message_cnt", String.valueOf(C62230g.m112534c()));
        TabChangeManager tabChangeManager = this.f53983d;
        Fragment fragment = null;
        if (!(tabChangeManager == null || !tabChangeManager.mo96535a() || tabChangeManager.f134314f == null)) {
            AbstractC0952i iVar = tabChangeManager.f134314f;
            if (iVar == null) {
                C89219l.m154715b();
            }
            fragment = iVar.mo3551a("NOTIFICATION");
        }
        if (fragment instanceof AbstractC61861b) {
            str = ((AbstractC61861b) fragment).mo99822h();
        } else if (fragment instanceof C56469l) {
            str = "chat";
        } else {
            str = "all";
        }
        hashMap.put("tab_name", str);
        String str3 = "1";
        if (EnumC56501q.CONTACTS.decideDisplay(this.f53980a) != EnumC56508r.GONE) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        hashMap.put("is_auth_show", str2);
        if (EnumC56501q.THIRD_PLATFORM.decideDisplay(this.f53980a) == EnumC56508r.GONE) {
            str3 = "0";
        }
        hashMap.put("is_invite_show", str3);
        C1731i.m5640b(new CallableC22865e(hashMap), C39162r.m79452a());
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN, mo145423b = true)
    public final void onNotificationIndicatorEvent(C61561m mVar) {
        String str;
        if (mVar != null) {
            AbstractC39235f fVar = this.f53991l;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f53992m;
            MainAnimViewModel mainAnimViewModel = this.f53993n;
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(scrollSwitchStateManager, "");
            C89219l.m154721d(mainAnimViewModel, "");
            C89219l.m154721d("MainPageFragment", "");
            C1731i.m5640b(new C61964b.CallableC61965a(mVar, "MainPageFragment"), C1731i.f5562a);
            DmNoticeProxy dmNoticeProxy = this.f53997r;
            if (this.f53992m.mo89347b() instanceof AbstractC61861b) {
                str = "notification_page";
            } else {
                if (this.f53992m.mo89347b() instanceof C59014ae) {
                    if (this.f53992m.mo89361c() instanceof C50041af) {
                        str = "homepage_hot";
                    } else if (this.f53992m.mo89361c() instanceof C50403p) {
                        str = "homepage_follow";
                    }
                }
                str = "";
            }
            dmNoticeProxy.mo99178a(mVar, str);
            C22863c cVar = new C22863c(this);
            mo37169a().mo89467a(cVar);
            C22825c cVar2 = this.f53982c;
            int i = mVar.f139735a;
            TabChangeManager tabChangeManager = this.f53983d;
            AbstractC18234b bVar = this.f53981b;
            View view = this.f53990k;
            DrawerViewModel a = mo37169a();
            C22859a aVar = new C22859a(this, scrollSwitchStateManager, mainAnimViewModel, cVar);
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(tabChangeManager, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(scrollSwitchStateManager, "");
            C89219l.m154721d(a, "");
            C89219l.m154721d(aVar, "");
            cVar2.f53902b = fVar;
            cVar2.f53903c = tabChangeManager;
            cVar2.f53904d = bVar;
            cVar2.f53906f = view;
            cVar2.f53907g = scrollSwitchStateManager;
            cVar2.f53905e = aVar;
            cVar2.f53908h = a;
            if (!cVar2.f53909i && i == -3) {
                cVar2.mo37148b();
            }
            if (mVar.f139737c == null || !this.f53996q) {
                C89219l.m154721d(mVar, "");
                if (mVar.f139736b == -1) {
                    C61542b.m111470d(mVar.f139735a);
                    if (!C62230g.m112531a(mVar.f139735a)) {
                        mo37175e();
                    } else {
                        return;
                    }
                }
                if (C62230g.m112531a(mVar.f139735a)) {
                    C61542b.m111460a(mVar.f139735a, mVar.f139736b);
                    if (mVar.f139736b <= 0 || TextUtils.equals("NOTIFICATION", this.f53983d.f134312d)) {
                        mo37175e();
                    } else {
                        mo37177g();
                    }
                } else if (C62230g.m112533b(mVar.f139735a)) {
                    C61542b.m111460a(mVar.f139735a, mVar.f139736b);
                    if (!this.f53986g && !this.f53982c.f53910j) {
                        mo37174d();
                    }
                }
                if (mVar.f139735a == 1000) {
                    EventBus.m156962a().mo145394b(C61561m.class);
                    return;
                }
                return;
            }
            for (Integer num : mVar.f139737c.keySet()) {
                if (C46872eb.f109219c) {
                    C12895a.f31387b.f31389a.post(new RunnableC22862b(this, num, mVar));
                } else {
                    C89219l.m154716b(num, "");
                    mo37170a(num.intValue(), mVar.mo99295a(num.intValue()));
                    if (C62230g.m112533b(num.intValue()) && !this.f53986g && !this.f53982c.f53910j) {
                        mo37174d();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo37170a(int i, int i2) {
        if (i2 == -1) {
            C61542b.m111470d(i);
            if (!C62230g.m112531a(i)) {
                mo37175e();
            } else {
                return;
            }
        }
        if (C62230g.m112531a(i)) {
            C61542b.m111460a(i, i2);
            if (i2 <= 0 || TextUtils.equals("NOTIFICATION", this.f53983d.f134312d)) {
                mo37175e();
            } else {
                mo37177g();
            }
        } else if (C62230g.m112533b(i)) {
            C61542b.m111460a(i, i2);
        }
        if (i == 1000) {
            EventBus.m156962a().mo145394b(C61561m.class);
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.c$j */
    public static final class C22870j implements IAccountService.AbstractC31272b {

        /* renamed from: a */
        final /* synthetic */ C22858c f54016a;

        static {
            Covode.recordClassIndex(26771);
        }

        public C22870j(C22858c cVar) {
            this.f54016a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
        public final void onAccountResult(int i, boolean z, int i2, User user) {
            if (z) {
                this.f54016a.mo37172b();
            }
        }
    }

    public C22858c(ActivityC0945e eVar, View view, AbstractC18234b bVar, C22825c cVar, TabChangeManager tabChangeManager, AbstractC39235f fVar, ScrollSwitchStateManager scrollSwitchStateManager, MainAnimViewModel mainAnimViewModel) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(tabChangeManager, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(scrollSwitchStateManager, "");
        C89219l.m154721d(mainAnimViewModel, "");
        this.f53980a = eVar;
        this.f53990k = view;
        this.f53981b = bVar;
        this.f53982c = cVar;
        this.f53983d = tabChangeManager;
        this.f53991l = fVar;
        this.f53992m = scrollSwitchStateManager;
        this.f53993n = mainAnimViewModel;
        DmNoticeProxy e = DmNoticeProxyImpl.m111428e();
        C89219l.m154716b(e, "");
        this.f53997r = e;
        this.f53998s = C89250i.m154773a((AbstractC89171a) new C22871k(this));
        EventBus.m156966a(EventBus.m156962a(), this);
        C56344d.f128526a = SystemClock.uptimeMillis();
        C61611b.f139811a.mo99382c();
        this.f53989j = true;
    }
}
