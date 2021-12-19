package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18026g;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IProfileBadgeService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38245n;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49495aa;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49497ac;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2951j.C49708a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.feedpage.C58620d;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59203a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.p2483co.C36148b;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.story.C76657c;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.l */
public final class View$OnClickListenerC50326l implements View.OnClickListener, AbstractC90252i, AbstractC90253j {

    /* renamed from: q */
    public static final C50327a f116202q = new C50327a((byte) 0);

    /* renamed from: A */
    private AbstractC88433f<C58620d> f116203A;

    /* renamed from: a */
    public Aweme f116204a;

    /* renamed from: b */
    public String f116205b;

    /* renamed from: c */
    JSONObject f116206c;

    /* renamed from: d */
    boolean f116207d;

    /* renamed from: e */
    public int f116208e;

    /* renamed from: f */
    public DataCenter f116209f;

    /* renamed from: g */
    public Context f116210g;

    /* renamed from: h */
    User f116211h;

    /* renamed from: i */
    public SmartAvatarBorderView f116212i;

    /* renamed from: j */
    public AvatarImageWithLive f116213j;

    /* renamed from: k */
    public StoryBrandView f116214k;

    /* renamed from: l */
    C50196d f116215l;

    /* renamed from: m */
    final IProfileBadgeService f116216m;

    /* renamed from: n */
    final C50330d f116217n;

    /* renamed from: o */
    public boolean f116218o;

    /* renamed from: p */
    boolean f116219p;

    /* renamed from: r */
    private View f116220r;

    /* renamed from: s */
    private SmartImageView f116221s;

    /* renamed from: t */
    private LiveCircleView f116222t;

    /* renamed from: u */
    private ImageView f116223u;

    /* renamed from: v */
    private RemoteImageView f116224v;

    /* renamed from: w */
    private int f116225w;

    /* renamed from: x */
    private ViewGroup f116226x;

    /* renamed from: y */
    private final C36148b f116227y;

    /* renamed from: z */
    private final AbstractC89244h f116228z = C89250i.m154773a((AbstractC89171a) new C50336j(this));

    static {
        Covode.recordClassIndex(59454);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(173, new RunnableC90250g(View$OnClickListenerC50326l.class, "onTopViewInFeed", C18017a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(9, new RunnableC90250g(View$OnClickListenerC50326l.class, "onLiveStatusEvent", C2954a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(118, new RunnableC90250g(View$OnClickListenerC50326l.class, "onTopViewLiveEnd", C18026g.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$a */
    public static final class C50327a {
        static {
            Covode.recordClassIndex(59455);
        }

        private C50327a() {
        }

        public /* synthetic */ C50327a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$h */
    static final class RunnableC50334h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50196d f116241a;

        static {
            Covode.recordClassIndex(59462);
        }

        RunnableC50334h(C50196d dVar) {
            this.f116241a = dVar;
        }

        public final void run() {
            C50196d dVar = this.f116241a;
            if (dVar == null) {
                C89219l.m154715b();
            }
            dVar.mo85362c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$i */
    public static final class RunnableC50335i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50196d f116242a;

        static {
            Covode.recordClassIndex(59463);
        }

        RunnableC50335i(C50196d dVar) {
            this.f116242a = dVar;
        }

        public final void run() {
            C50196d dVar = this.f116242a;
            if (dVar == null) {
                C89219l.m154715b();
            }
            dVar.mo85363d();
        }
    }

    /* renamed from: a */
    public final String mo85496a() {
        return RequestIdService.m70076a().mo60693a(this.f116204a, this.f116208e);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$e */
    static final class RunnableC50331e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC50326l f116235a;

        /* renamed from: b */
        final /* synthetic */ HashMap f116236b;

        static {
            Covode.recordClassIndex(59459);
        }

        RunnableC50331e(View$OnClickListenerC50326l lVar, HashMap hashMap) {
            this.f116235a = lVar;
            this.f116236b = hashMap;
        }

        public final void run() {
            C12895a.f31387b.f31389a.postDelayed(new RunnableC50333g(this.f116235a, this.f116236b), 1000);
        }
    }

    /* renamed from: b */
    public final void mo85502b() {
        if (this.f116219p) {
            this.f116219p = false;
            C50196d dVar = this.f116215l;
            if (dVar != null) {
                C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50335i(dVar)));
            }
        }
    }

    /* renamed from: c */
    public final boolean mo85504c() {
        AvatarImageWithLive avatarImageWithLive = this.f116213j;
        if (avatarImageWithLive != null && avatarImageWithLive.getVisibility() == 0) {
            return true;
        }
        LiveCircleView liveCircleView = this.f116222t;
        if (liveCircleView == null || liveCircleView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$j */
    static final class C50336j extends AbstractC89220m implements AbstractC89171a<AbstractC76506d> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC50326l f116243a;

        static {
            Covode.recordClassIndex(59464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50336j(View$OnClickListenerC50326l lVar) {
            super(0);
            this.f116243a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
            r2 = r5.f116243a.f116214k;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d invoke() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.feed.ui.l r0 = r5.f116243a
                android.content.Context r4 = r0.f116210g
                boolean r0 = r4 instanceof androidx.appcompat.app.ActivityC0218d
                r3 = 0
                if (r0 != 0) goto L_0x000a
                r4 = r3
            L_0x000a:
                androidx.appcompat.app.d r4 = (androidx.appcompat.app.ActivityC0218d) r4
                if (r4 != 0) goto L_0x000f
                return r3
            L_0x000f:
                com.ss.android.ugc.aweme.feed.ui.l r0 = r5.f116243a
                com.ss.android.ugc.aweme.tux.business.story.StoryBrandView r2 = r0.f116214k
                if (r2 != 0) goto L_0x0016
                return r3
            L_0x0016:
                com.ss.android.ugc.aweme.story.g r0 = com.p2082ss.android.ugc.aweme.story.C77260g.f173332a
                com.ss.android.ugc.aweme.story.avatar.c r1 = r0.mo120156d()
                if (r1 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.feed.ui.l$j$1 r0 = new com.ss.android.ugc.aweme.feed.ui.l$j$1
                r0.<init>(r5, r2, r4)
                com.ss.android.ugc.aweme.story.avatar.d r2 = r1.mo120228a(r0)
                if (r2 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.feed.ui.l r0 = r5.f116243a
                com.ss.android.ugc.aweme.tux.business.story.StoryBrandView r1 = r0.f116214k
                if (r1 == 0) goto L_0x0037
                com.ss.android.ugc.aweme.feed.ui.l$j$a r0 = new com.ss.android.ugc.aweme.feed.ui.l$j$a
                r0.<init>(r5)
                r1.addOnAttachStateChangeListener(r0)
            L_0x0037:
                return r2
            L_0x0038:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50326l.C50336j.invoke():java.lang.Object");
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$j$a */
        public static final class View$OnAttachStateChangeListenerC50338a implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            final /* synthetic */ C50336j f116247a;

            static {
                Covode.recordClassIndex(59466);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            View$OnAttachStateChangeListenerC50338a(C50336j jVar) {
                this.f116247a = jVar;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f116247a.f116243a.f116218o = false;
            }
        }
    }

    /* renamed from: d */
    private final void m94420d() {
        String str;
        JSONObject jSONObject = this.f116206c;
        if (jSONObject != null) {
            try {
                str = jSONObject.getString("request_id");
            } catch (JSONException e) {
                e.printStackTrace();
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                Aweme aweme = this.f116204a;
                if (aweme == null) {
                    C89219l.m154715b();
                }
                aweme.setRequestId(str);
            }
        }
        DataCenter dataCenter = this.f116209f;
        if (dataCenter != null) {
            dataCenter.mo60191a("feed_internal_event", new C49672ag(19, this.f116204a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$g */
    static final class RunnableC50333g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC50326l f116239a;

        /* renamed from: b */
        final /* synthetic */ HashMap f116240b;

        static {
            Covode.recordClassIndex(59461);
        }

        RunnableC50333g(View$OnClickListenerC50326l lVar, HashMap hashMap) {
            this.f116239a = lVar;
            this.f116240b = hashMap;
        }

        public final void run() {
            SmartAvatarBorderView smartAvatarBorderView;
            boolean z;
            boolean z2;
            View$OnClickListenerC50326l lVar = this.f116239a;
            AvatarImageWithLive avatarImageWithLive = lVar.f116213j;
            if (avatarImageWithLive != null) {
                smartAvatarBorderView = avatarImageWithLive.getAvatarImageView();
            } else {
                smartAvatarBorderView = null;
            }
            AvatarImageWithLive avatarImageWithLive2 = lVar.f116213j;
            if (avatarImageWithLive2 == null || avatarImageWithLive2.getVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            lVar.mo85497a(smartAvatarBorderView, z);
            SmartAvatarBorderView smartAvatarBorderView2 = lVar.f116212i;
            SmartAvatarBorderView smartAvatarBorderView3 = lVar.f116212i;
            if (smartAvatarBorderView3 == null || smartAvatarBorderView3.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            lVar.mo85497a(smartAvatarBorderView2, z2);
            if (lVar.f116204a != null) {
                Aweme aweme = lVar.f116204a;
                if (aweme == null) {
                    C89219l.m154715b();
                }
                User author = aweme.getAuthor();
                if (author != null && C38245n.C38246a.m77604a(author) && lVar.mo85503b(author)) {
                    Aweme aweme2 = lVar.f116204a;
                    if (aweme2 == null) {
                        C89219l.m154715b();
                    }
                    C38245n.C38246a.m77602a(aweme2.getAuthor(), "video");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$f */
    public static final class C50332f implements AbstractC38694bo {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC50326l f116237a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f116238b;

        static {
            Covode.recordClassIndex(59460);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38694bo
        /* renamed from: a */
        public final void mo67267a() {
            String str;
            String str2;
            String str3;
            this.f116237a.mo85500a("");
            C59252q c = new C59252q().mo96823c(this.f116237a.f116204a, this.f116237a.f116208e);
            String str4 = this.f116237a.f116205b;
            if (str4 == null) {
                str4 = "";
            }
            C59252q qVar = (C59252q) c.mo96825o(str4).mo96740a(this.f116237a.f116210g);
            DataCenter dataCenter = this.f116237a.f116209f;
            String str5 = null;
            if (dataCenter != null) {
                str = (String) dataCenter.mo60195b("playlist_type", "");
            } else {
                str = null;
            }
            qVar.f135317t = str;
            DataCenter dataCenter2 = this.f116237a.f116209f;
            if (dataCenter2 != null) {
                str2 = (String) dataCenter2.mo60195b("playlist_id", "");
            } else {
                str2 = null;
            }
            qVar.f135319v = str2;
            DataCenter dataCenter3 = this.f116237a.f116209f;
            if (dataCenter3 != null) {
                str3 = (String) dataCenter3.mo60195b("playlist_id_key", "");
            } else {
                str3 = null;
            }
            qVar.f135318u = str3;
            DataCenter dataCenter4 = this.f116237a.f116209f;
            if (dataCenter4 != null) {
                str5 = (String) dataCenter4.mo60195b("tab_name", "");
            }
            AbstractC59203a a = ((AbstractC59203a) qVar.mo96801c(str5).mo96802d(C59208ac.m108764b(this.f116237a.f116204a, this.f116237a.f116208e))).mo96741a("click_head");
            Context context = this.f116237a.f116210g;
            if (context == null) {
                C89219l.m154715b();
            }
            AbstractC59242h f = a.mo96810l(FeedParamProvider.C49809a.m93270a(context).getSearchId()).mo96804f(this.f116238b.element);
            Context context2 = this.f116237a.f116210g;
            if (context2 == null) {
                C89219l.m154715b();
            }
            String previousPage = FeedParamProvider.C49809a.m93270a(context2).getPreviousPage();
            Context context3 = this.f116237a.f116210g;
            if (context3 == null) {
                C89219l.m154715b();
            }
            f.mo96771n(C50560y.m94791a(previousPage, FeedParamProvider.C49809a.m93270a(context3).getFromGroupId())).mo96792f();
        }

        C50332f(View$OnClickListenerC50326l lVar, C89233z.C89238e eVar) {
            this.f116237a = lVar;
            this.f116238b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$d */
    public static final class C50330d implements IProfileBadgeService.AbstractC31281c {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC50326l f116234a;

        static {
            Covode.recordClassIndex(59458);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50330d(View$OnClickListenerC50326l lVar) {
            this.f116234a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31281c
        /* renamed from: a */
        public final void mo56081a(ProfileBadgeStruct profileBadgeStruct) {
            User author;
            Aweme aweme = this.f116234a.f116204a;
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                IAccountUserService e = AccountService.m65215a().mo57069e();
                C89219l.m154716b(e, "");
                User curUser = e.getCurUser();
                String uid = author.getUid();
                C89219l.m154716b(curUser, "");
                if (C89219l.m154714a((Object) uid, (Object) curUser.getUid())) {
                    author.setProfileBadgeStruct(profileBadgeStruct);
                    this.f116234a.mo85498a(author);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo85498a(User user) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Aweme aweme = this.f116204a;
        hashMap.put("aweme_state", aweme);
        if (aweme == null) {
            C89219l.m154715b();
        }
        mo85501a(hashMap, aweme.getAuthor());
        mo85499a(user, hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo85503b(User user) {
        LiveOuterService.m107269s();
        if (C37699a.m76320y(this.f116204a)) {
            return true;
        }
        if (user == null || !user.isLive() || !C76657c.m134240a() || user.isBlock()) {
            return false;
        }
        return true;
    }

    @AbstractC90264r
    public final void onTopViewInFeed(C18017a aVar) {
        Aweme aweme;
        User author;
        C89219l.m154721d(aVar, "");
        C18017a.m33568a(aVar.f42891a);
        if (aVar.f42891a == 3 && C37699a.m76318w(this.f116204a) && !C37699a.m76319x(this.f116204a) && (aweme = this.f116204a) != null && (author = aweme.getAuthor()) != null) {
            mo85498a(author);
        }
    }

    @AbstractC90264r
    public final void onTopViewLiveEnd(C18026g gVar) {
        String str;
        Aweme aweme;
        User author;
        C89219l.m154721d(gVar, "");
        String str2 = gVar.f42904a;
        Aweme aweme2 = this.f116204a;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (!(!C89219l.m154714a((Object) str2, (Object) str)) && (aweme = this.f116204a) != null && (author = aweme.getAuthor()) != null) {
            mo85498a(author);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$b */
    public static final class C50328b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC50326l f116229a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f116230b;

        /* renamed from: c */
        final /* synthetic */ User f116231c;

        static {
            Covode.recordClassIndex(59456);
        }

        C50328b(View$OnClickListenerC50326l lVar, C89233z.C89238e eVar, User user) {
            this.f116229a = lVar;
            this.f116230b = eVar;
            this.f116231c = user;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C58620d dVar = (C58620d) obj;
            if (this.f116230b.element != null && this.f116230b.element.getAuthor() != null && TextUtils.equals(this.f116230b.element.getAuthorUid(), String.valueOf(dVar.f133501a))) {
                this.f116231c.roomId = dVar.f133502b;
                if (!C37699a.m76320y(this.f116229a.f116204a) && !this.f116231c.isLive()) {
                    View$OnClickListenerC50326l lVar = this.f116229a;
                    User author = this.f116230b.element.getAuthor();
                    if (author == null) {
                        C89219l.m154715b();
                    }
                    lVar.mo85498a(author);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.l$c */
    public static final class C50329c extends AbstractC7258b {

        /* renamed from: b */
        final /* synthetic */ String f116232b;

        /* renamed from: c */
        final /* synthetic */ long f116233c;

        static {
            Covode.recordClassIndex(59457);
        }

        @Override // com.bytedance.android.livesdk.callback.AbstractC7258b
        /* renamed from: a */
        public final void mo13461a(Map<String, Object> map) {
            Object obj;
            String str;
            String str2;
            HashMap<String, String> hashMap = null;
            if (map != null) {
                obj = map.get("audience_live_play_enter_room_config");
            } else {
                obj = null;
            }
            if (!(obj instanceof EnterRoomConfig)) {
                obj = null;
            }
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
                if (roomsData != null) {
                    hashMap = roomsData.f28356l;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
                if (roomsData2 != null && roomsData2.f28359o) {
                    String str3 = this.f116232b;
                    String str4 = "";
                    if (hashMap == null || (str = hashMap.get("value")) == null) {
                        str = str4;
                    }
                    C89219l.m154716b(str, str4);
                    if (!(hashMap == null || (str2 = hashMap.get("log_extra")) == null)) {
                        str4 = str2;
                    }
                    C18129a.m33747a("live_ad", str3, str, str4, "0").mo28897a("room_id", map.get("audience_live_play_room_id")).mo28901b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50329c(String str, long j, long j2) {
            super(j2);
            this.f116232b = str;
            this.f116233c = j;
        }
    }

    @AbstractC90264r
    public final void onLiveStatusEvent(C2954a aVar) {
        long j;
        C89219l.m154721d(aVar, "");
        Aweme aweme = this.f116204a;
        if (aweme == null) {
            C89219l.m154715b();
        }
        User author = aweme.getAuthor();
        if (author == null) {
            try {
                C89219l.m154715b();
            } catch (Throwable unused) {
                j = 0;
                if (author == null) {
                    return;
                }
            }
        }
        String uid = author.getUid();
        C89219l.m154716b(uid, "");
        j = Long.parseLong(uid);
        if (!(!C89219l.m154714a((Object) String.valueOf(aVar.f8697b), (Object) author.getUid()))) {
            if (aVar.f8698c) {
                if (author.roomId != 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo96083a(j);
                    m94419a(false, 0, j);
                }
                author.roomId = 0;
            } else if (aVar.f8696a != 0) {
                if (author.roomId == 0) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo96083a(j);
                    m94419a(true, aVar.f8696a, j);
                }
                author.roomId = aVar.f8696a;
            }
            mo85498a(author);
            C37699a.m76258ad(this.f116204a);
        }
    }

    public View$OnClickListenerC50326l(View view) {
        int i;
        ViewGroup viewGroup;
        C89219l.m154721d(view, "");
        IProfileBadgeService b = ProfileBadgeServiceImpl.m67562b();
        C89219l.m154716b(b, "");
        this.f116216m = b;
        C50330d dVar = new C50330d(this);
        this.f116217n = dVar;
        C36148b bVar = new C36148b();
        this.f116227y = bVar;
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f116210g = view.getContext();
        this.f116220r = view.findViewById(R.id.ob);
        this.f116212i = (SmartAvatarBorderView) view.findViewById(R.id.f__);
        this.f116221s = (SmartImageView) view.findViewById(R.id.d9u);
        this.f116213j = (AvatarImageWithLive) view.findViewById(R.id.f_g);
        this.f116222t = (LiveCircleView) view.findViewById(R.id.f_b);
        this.f116223u = (ImageView) view.findViewById(R.id.bvk);
        this.f116224v = (RemoteImageView) view.findViewById(R.id.oc);
        this.f116226x = (ViewGroup) view.findViewById(R.id.b6j);
        this.f116214k = (StoryBrandView) view.findViewById(R.id.fa_);
        Resources resources = view.getResources();
        if (resources != null) {
            i = (int) resources.getDimension(R.dimen.fw);
        } else {
            i = 0;
        }
        this.f116225w = i;
        if (C49497ac.m92736a() && (viewGroup = this.f116226x) != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = (int) C13628n.m24520b(this.f116210g, 40.0f);
            viewGroup.setLayoutParams(layoutParams);
        }
        View$OnTouchListenerC17271b bVar2 = new View$OnTouchListenerC17271b();
        SmartAvatarBorderView smartAvatarBorderView = this.f116212i;
        if (smartAvatarBorderView != null) {
            smartAvatarBorderView.setOnTouchListener(bVar2);
        }
        AvatarImageWithLive avatarImageWithLive = this.f116213j;
        if (avatarImageWithLive != null) {
            avatarImageWithLive.setOnTouchListener(bVar2);
        }
        SmartAvatarBorderView smartAvatarBorderView2 = this.f116212i;
        if (smartAvatarBorderView2 != null) {
            smartAvatarBorderView2.setOnClickListener(this);
        }
        AvatarImageWithLive avatarImageWithLive2 = this.f116213j;
        if (avatarImageWithLive2 != null) {
            avatarImageWithLive2.setOnClickListener(this);
        }
        b.mo57238a(dVar);
        bVar.f85387e = this.f116220r;
        bVar.f85388f = this.f116212i;
        bVar.f85389g = this.f116222t;
        bVar.f85390h = this.f116221s;
        bVar.f85391i = this.f116213j;
        bVar.f85392j = this.f116224v;
        bVar.f85393k = this.f116214k;
    }

    /* renamed from: a */
    public final void mo85500a(String str) {
        DataCenter dataCenter = this.f116209f;
        if (dataCenter != null) {
            dataCenter.mo60191a("to_profile", str);
            return;
        }
        C49708a aVar = new C49708a("dataCenter is null! can't go!");
        C51423a.m95790a((Throwable) aVar);
        C13468b.m24210a(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0.isDelete() != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
        // Method dump skipped, instructions count: 893
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50326l.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private static void m94418a(long j, String str) {
        C89219l.m154721d(str, "");
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo12995a(AbstractC7258b.EnumC7259a.AUDIENCE_LIVE_PLAY_DURATION, new C50329c(str, j, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85497a(SmartAvatarBorderView smartAvatarBorderView, boolean z) {
        String aid;
        List<String> list;
        List<String> list2;
        UrlModel avatarThumb;
        UrlModel avatarThumb2;
        if (!C38701br.m78513a(this.f116204a, smartAvatarBorderView)) {
            StringBuilder sb = new StringBuilder("FeedAvatarView_");
            Aweme aweme = this.f116204a;
            if (aweme == null) {
                aid = "no_aid";
            } else {
                aid = aweme.getAid();
            }
            String sb2 = sb.append(aid).toString();
            Aweme aweme2 = this.f116204a;
            if (!(aweme2 == null || aweme2.getAuthor() == null)) {
                Aweme aweme3 = this.f116204a;
                if (aweme3 == null) {
                    C89219l.m154715b();
                }
                User author = aweme3.getAuthor();
                UrlModel urlModel = null;
                if (!(author == null || author.getAvatarThumb() == null)) {
                    Aweme aweme4 = this.f116204a;
                    if (aweme4 == null) {
                        C89219l.m154715b();
                    }
                    User author2 = aweme4.getAuthor();
                    if (author2 == null || (avatarThumb2 = author2.getAvatarThumb()) == null) {
                        list = null;
                    } else {
                        list = avatarThumb2.getUrlList();
                    }
                    if (!C13603b.m24435a((Collection) list)) {
                        if (smartAvatarBorderView == this.f116212i && C49495aa.m92734a()) {
                            StringBuilder sb3 = new StringBuilder("loadAvatarViews:");
                            Aweme aweme5 = this.f116204a;
                            if (aweme5 == null) {
                                C89219l.m154715b();
                            }
                            User author3 = aweme5.getAuthor();
                            if (author3 == null || (avatarThumb = author3.getAvatarThumb()) == null) {
                                list2 = null;
                            } else {
                                list2 = avatarThumb.getUrlList();
                            }
                            C51423a.m95791b(4, "FeedAvatarView", sb3.append(list2).toString());
                        }
                        if (smartAvatarBorderView != null) {
                            Aweme aweme6 = this.f116204a;
                            if (aweme6 == null) {
                                C89219l.m154715b();
                            }
                            User author4 = aweme6.getAuthor();
                            if (author4 != null) {
                                urlModel = author4.getAvatarThumb();
                            }
                            int[] a = C80397em.m139369a(101);
                            int i = this.f116225w;
                            smartAvatarBorderView.mo61310a(urlModel, a, i, i, sb2);
                            return;
                        }
                        return;
                    }
                }
            }
            C20766v a2 = C20761r.m39056a(2131232314);
            a2.f49098K = true;
            C20766v a3 = a2.mo34179a(sb2);
            a3.f49092E = smartAvatarBorderView;
            a3.mo34186c();
        } else if (z) {
            C38000g.m77057h().mo67246a(C38701br.m78510a(this.f116204a, "icon"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0182  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85499a(com.p2082ss.android.ugc.aweme.profile.model.User r14, java.util.HashMap<java.lang.String, java.lang.Object> r15) {
        /*
        // Method dump skipped, instructions count: 537
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50326l.mo85499a(com.ss.android.ugc.aweme.profile.model.User, java.util.HashMap):void");
    }

    /* renamed from: a */
    public final void mo85501a(HashMap<String, Object> hashMap, User user) {
        C89219l.m154721d(hashMap, "");
        hashMap.put("check_vast_ad_state", Boolean.valueOf(C38701br.m78512a(this.f116204a, 3)));
        hashMap.put("show_live_state", Boolean.valueOf(mo85503b(user)));
        if (user != null) {
            if (C31575b.m65865g().isMe(user.getUid())) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                user.roomId = g.getCurUser().roomId;
            }
            if (this.f116215l == null) {
                this.f116215l = new C50196d(user.isLive(), this.f116213j, this.f116212i, this.f116222t);
            }
            Aweme aweme = this.f116204a;
            if (aweme != null && aweme.getAuthor() != null && this.f116203A == null) {
                C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = (T) this.f116204a;
                this.f116203A = new C50328b(this, eVar, user);
            }
        }
    }

    /* renamed from: a */
    private static void m94419a(boolean z, long j, long j2) {
        String str;
        C33744d a = new C33744d().mo59983a("action_type", "click").mo59983a("anchor_id", String.valueOf(j2)).mo59983a("room_id", String.valueOf(j)).mo59983a("enter_from_merge", "homepage_hot").mo59983a("enter_method", "video_head");
        if (z) {
            str = "live_on";
        } else {
            str = "live_off";
        }
        C39162r.m79460a("livesdk_live_status_change", a.mo59983a("status", str).f79943a);
    }
}
