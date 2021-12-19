package com.p2082ss.android.ugc.aweme.main.bottomobserver;

import android.content.Context;
import android.p003ss.com.vboost.C0004a;
import android.p003ss.com.vboost.EnumC0044d;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49679g;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53318b;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.logger.C58949c;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import com.p2082ss.android.ugc.aweme.main.C59078e;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p4071t.C77717b;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68088c;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68091e;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.shortvideo.EnumC69833ak;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.turbo.api.C79340b;
import com.p2082ss.android.ugc.aweme.util.C80159r;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80492gf;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver */
public final class BottomPublishObserver implements View.OnClickListener, AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public final ActivityC0945e f134434a;

    /* renamed from: b */
    public final TabChangeManager f134435b;

    /* renamed from: c */
    public final ScrollSwitchStateManager f134436c;

    /* renamed from: d */
    public final HomePageDataViewModel f134437d;

    /* renamed from: e */
    public long f134438e;

    /* renamed from: f */
    public C59078e f134439f;

    /* renamed from: g */
    public final Context f134440g;

    /* renamed from: h */
    private boolean f134441h;

    /* renamed from: i */
    private long f134442i = -1;

    static {
        Covode.recordClassIndex(69402);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(6, new RunnableC90250g(BottomPublishObserver.class, "onVideoPlayerEvent", C71904j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestory();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestory() {
        C59078e eVar = this.f134439f;
        if (eVar != null) {
            eVar.mo96600a();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        this.f134438e = System.currentTimeMillis();
    }

    /* renamed from: b */
    private final boolean m108542b() {
        if (this.f134437d.f121745k == null) {
            return false;
        }
        Aweme aweme = this.f134437d.f121745k;
        if (aweme == null) {
            C89219l.m154715b();
        }
        if (!aweme.hasStickerID() || !C89219l.m154714a((Object) "HOME", (Object) this.f134435b.f134312d)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver$a */
    public static final class C59057a extends SimpleServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ BottomPublishObserver f134443a;

        /* renamed from: b */
        final /* synthetic */ C53318b f134444b;

        /* renamed from: c */
        final /* synthetic */ RecordConfig.Builder f134445c;

        static {
            Covode.recordClassIndex(69403);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.by] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onOK() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver r0 = r5.f134443a
                com.ss.android.ugc.aweme.main.e r0 = r0.f134439f
                if (r0 != 0) goto L_0x000f
                com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver r1 = r5.f134443a
                com.ss.android.ugc.aweme.main.e r0 = new com.ss.android.ugc.aweme.main.e
                r0.<init>()
                r1.f134439f = r0
            L_0x000f:
                com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver r0 = r5.f134443a
                com.ss.android.ugc.aweme.main.e r3 = r0.f134439f
                if (r3 == 0) goto L_0x004d
                com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver r4 = r5.f134443a
                com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r1 = r4.f134436c
                java.lang.String r0 = "page_feed"
                com.ss.android.ugc.aweme.base.ui.e r0 = r1.mo89354d(r0)
                boolean r0 = r0 instanceof com.p2082ss.android.ugc.aweme.main.MainPageFragment
                r2 = 0
                if (r0 == 0) goto L_0x0038
                androidx.fragment.app.e r0 = r4.f134434a
                if (r0 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel r1 = com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel.C53309a.m98315a(r0)
                java.lang.String r0 = "PUBLISH"
                com.ss.android.ugc.aweme.by r1 = r1.mo89735a(r0)
                boolean r0 = r1 instanceof com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53330b
                if (r0 != 0) goto L_0x004e
            L_0x0036:
                com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.b r2 = (com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53330b) r2
            L_0x0038:
                boolean r0 = r3.f134476b
                if (r0 != 0) goto L_0x004d
                r3.f134475a = r2
                r0 = 1
                r3.f134476b = r0
                com.ss.android.ugc.aweme.main.IMainPageFragment r1 = com.bytedance.tiktok.homepage.services.MainPageFragmentImpl.m43110j()
                com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater$startObserve$1 r0 = new com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater$startObserve$1
                r0.<init>(r3)
                r1.mo37205a(r0)
            L_0x004d:
                return
            L_0x004e:
                r2 = r1
                goto L_0x0036
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver.C59057a.onOK():void");
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            C53318b bVar = this.f134444b;
            if (bVar == null || !bVar.mo89776k()) {
                asyncAVService.uiService().recordService().startRecord(this.f134443a.f134434a, this.f134445c.build());
            } else {
                asyncAVService.uiService().recordService().startSpecialPlusEntrance(this.f134443a.f134434a, this.f134445c.build());
                C53318b bVar2 = this.f134444b;
                if (bVar2 != null) {
                    bVar2.mo89775j();
                }
            }
            C77717b.m135747a(this.f134443a.f134434a, "PUBLISH");
            C79340b.m138147a().openCamera();
        }

        C59057a(BottomPublishObserver bottomPublishObserver, C53318b bVar, RecordConfig.Builder builder) {
            this.f134443a = bottomPublishObserver;
            this.f134444b = bVar;
            this.f134445c = builder;
        }
    }

    /* renamed from: a */
    private final void m108539a() {
        String str;
        Fragment b;
        C0004a.m2a(EnumC0044d.COMMON_TAB_SWITCH, 3000);
        C61542b.m111463a(false);
        C58949c.f134187a = false;
        C58945a.C58947b.f134185a.f134176c = false;
        C58945a.C58947b.f134185a.f134180g = false;
        AbstractC50477z zVar = null;
        C68909c.f154156d = null;
        MainPageFragmentImpl.m43110j().mo37211c();
        String uuid = UUID.randomUUID().toString();
        String str2 = "";
        C89219l.m154716b(uuid, str2);
        String f = MainPageFragmentImpl.m43110j().mo37214f();
        if (MainPageFragmentImpl.m43110j().mo37210b()) {
            str = "click_intro";
        } else {
            str = "click_plus";
        }
        C33744d a = new C33744d().mo59983a("shoot_way", "direct_shoot").mo59983a("enter_from", f).mo59983a("enter_method", str).mo59983a("creation_id", uuid).mo59983a("group_id", C59213ah.f134853b).mo59981a("time_elapsed_since_launch_app", AVExternalServiceImpl.m113114a().infoService().getDurationSinceAppForeground(uuid)).mo59982a("is_ui_shoot", (Object) true);
        C89219l.m154716b(a, str2);
        AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("shoot", a.f79943a);
        long currentTimeMillis = System.currentTimeMillis();
        C80492gf.m139513a();
        AVExternalServiceImpl.m113114a().provideAVPerformance().start("av_video_record_init", "clickRecordBtn");
        if (System.currentTimeMillis() - this.f134438e >= 500) {
            IExternalService a2 = AVExternalServiceImpl.m113114a();
            IAVPublishService publishService = a2.publishService();
            if (publishService.isParallelPublishEnabled()) {
                if (!publishService.isPublishable()) {
                    AVExternalServiceImpl.m113114a().storyService().showPublishingToast(this.f134440g);
                    return;
                }
            } else if (a2.publishService().isPublishing() && a2.publishService().isPublishServiceRunning(this.f134434a)) {
                new C23144b(this.f134434a).mo37640e(R.string.f94).mo37637b();
                return;
            }
            C29823c.m60083a(this.f134434a, "record", "click", new C39163s().mo67941a("record_mode", "direct").mo67942a());
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, str2);
            if (g.isLogin() || C16048b.m29633a().mo25412a(true, "un_logined_click_ask_login", 0) != 1) {
                if (C89219l.m154714a((Object) "HOME", (Object) this.f134435b.f134312d) && (b = this.f134435b.mo96536b()) != null) {
                    if (!(b instanceof C59014ae)) {
                        b = null;
                    }
                    C59014ae aeVar = (C59014ae) b;
                    if (aeVar != null) {
                        zVar = aeVar.mo96547l();
                    }
                    if (zVar instanceof C50041af) {
                        String a3 = C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108760a(EnumC69833ak.INSTANCE.getVideoId(), 0));
                        C89219l.m154716b(a3, str2);
                        str2 = a3;
                    }
                }
                m108541a(uuid, str2, f, str);
                C53318b bVar = (C53318b) HomeTabViewModel.C53309a.m98315a(this.f134434a).mo89735a("PUBLISH");
                if (bVar != null && bVar.mo89776k()) {
                    m108540a(f);
                }
                C49907s.m93686a(EnumC48310af.MUSICAL);
                RecordConfig.Builder translationType = new RecordConfig.Builder().creationId(uuid).shootWay("direct_shoot").groupId(C59213ah.f134853b).enterFrom(f).enterMethod(str).fromMain(true).startRecordTime(currentTimeMillis).musicType(1).translationType(C68088c.m120390a());
                if (m108542b() && this.f134437d.f121745k != null) {
                    Aweme aweme = this.f134437d.f121745k;
                    if (aweme == null) {
                        C89219l.m154715b();
                    }
                    translationType.stickers(C80159r.m138917a(aweme.getStickerIDs()));
                }
                AVExternalServiceImpl.m113114a().asyncServiceForMainRecordService(this.f134434a, "direct_shoot", new C59057a(this, bVar, translationType));
                this.f134438e = System.currentTimeMillis();
                AbstractC81915c.m141874a(new C49679g());
                return;
            }
            String c = this.f134437d.mo89328c();
            if (c != null) {
                C58957c.m108318a(this.f134434a, c, "click_shoot");
            }
        }
    }

    public BottomPublishObserver(Context context) {
        C89219l.m154721d(context, "");
        this.f134440g = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) context;
        this.f134434a = eVar;
        this.f134435b = TabChangeManager.C59002a.m108439a(eVar);
        this.f134436c = ScrollSwitchStateManager.C52950a.m97811a(eVar);
        this.f134437d = HomePageDataViewModel.C52942a.m97777a(eVar);
        MainPageFragmentImpl.m43110j().mo37205a(this);
        if (C68091e.m120393a()) {
            C80298cg.m139204a(this);
        }
    }

    /* renamed from: a */
    private static void m108540a(String str) {
        C39162r.m79460a("special_icon_click", new C33744d().mo59983a("enter_from", str).mo59983a("prop_id", AVExternalServiceImpl.m113114a().specialPlusService().getEffectId()).f79943a);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (C68091e.m120393a()) {
            AbstractC80747i O = C81079v.m140776O();
            C89219l.m154716b(O, "");
            AbstractC81002f L = O.mo123918L();
            C89219l.m154716b(L, "");
            AbstractC81002f.AbstractC81005c j = L.mo124462j();
            C89219l.m154716b(j, "");
            if (j.mo124469a()) {
                this.f134441h = true;
                this.f134442i = System.currentTimeMillis();
                C81079v.m140776O().mo123908B();
                return;
            }
        }
        m108539a();
    }

    @AbstractC90264r
    public final void onVideoPlayerEvent(C71904j jVar) {
        C89219l.m154721d(jVar, "");
        if (jVar.f161106c == 4 && this.f134441h) {
            String.valueOf(System.currentTimeMillis() - this.f134442i);
            AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("tool_performance_operation_cost_time", new C33744d().mo59983a(StringSet.type, "tool_performance_pause_feed_video_player").mo59981a("totaltime", System.currentTimeMillis() - this.f134442i).f79943a);
            this.f134441h = false;
            m108539a();
        }
    }

    /* renamed from: a */
    private final void m108541a(String str, String str2, String str3, String str4) {
        int i;
        int i2 = 0;
        C33744d a = new C33744d().mo59983a("creation_id", str).mo59983a("shoot_way", "direct_shoot").mo59983a("enter_from", str3).mo59983a("enter_method", str4).mo59981a("time_elapsed_since_launch_app", AVExternalServiceImpl.m113114a().infoService().getDurationSinceAppForeground(str)).mo59983a("group_id", C59213ah.f134853b).mo59982a("is_ui_shoot", (Object) false);
        C89219l.m154716b(a, "");
        if (C65724g.m117661a().mo104866a(C59213ah.f134853b)) {
            a.mo59983a("previous_page", "push");
        }
        if (!TextUtils.isEmpty(str2)) {
            a.mo59983a("log_pb", str2);
        }
        IAVPublishService publishService = AVExternalServiceImpl.m113114a().publishService();
        if (publishService.isParallelPublishEnabled()) {
            i = publishService.getParallelPublishTaskSize();
        } else {
            i = 0;
        }
        a.mo59980a("publish_cnt", i);
        if ((C63786o.f144583c || C63786o.f144584d) && str3.equals("personal_homepage")) {
            i2 = 1;
        }
        a.mo59980a("with_guidence", i2);
        a.mo59983a("tab_name", C63786o.f144581a);
        C53318b bVar = (C53318b) HomeTabViewModel.C53309a.m98315a(this.f134434a).mo89735a("PUBLISH");
        if (bVar != null && bVar.mo89776k()) {
            a.mo59980a("is_special_icon", 1);
            String effectId = AVExternalServiceImpl.m113114a().specialPlusService().getEffectId();
            if (!TextUtils.isEmpty(effectId)) {
                a.mo59983a("prop_id", effectId);
            }
        }
        AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("shoot", a.f79943a);
    }
}
