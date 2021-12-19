package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23048e;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56203d;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63746h;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.AvatarImageWithVerifyMus;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64363i;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.cs */
public final class View$OnClickListenerC64123cs extends RecyclerView.ViewHolder implements View.OnClickListener, AbstractC63854r {

    /* renamed from: o */
    public static final C64124a f145464o = new C64124a((byte) 0);

    /* renamed from: a */
    public AvatarImageWithVerifyMus f145465a;

    /* renamed from: b */
    public TextView f145466b;

    /* renamed from: c */
    public MutualRelationView f145467c;

    /* renamed from: d */
    public TuxTextView f145468d;

    /* renamed from: e */
    public User f145469e;

    /* renamed from: f */
    public int f145470f;

    /* renamed from: g */
    public AbstractC64125b f145471g;

    /* renamed from: h */
    public AbstractC64126c f145472h;

    /* renamed from: i */
    public Context f145473i;

    /* renamed from: j */
    public C64363i.AbstractC64365b f145474j;

    /* renamed from: k */
    public View f145475k;

    /* renamed from: l */
    public String f145476l;

    /* renamed from: m */
    public String f145477m;

    /* renamed from: n */
    public Integer f145478n;

    /* renamed from: p */
    private TextView f145479p;

    /* renamed from: q */
    private AbstractC51754w f145480q;

    /* renamed from: r */
    private int f145481r;

    /* renamed from: s */
    private TuxIconView f145482s;

    /* renamed from: t */
    private View f145483t;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cs$b */
    public interface AbstractC64125b {
        static {
            Covode.recordClassIndex(75569);
        }

        /* renamed from: a */
        void mo103735a(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cs$c */
    public interface AbstractC64126c {
        static {
            Covode.recordClassIndex(75570);
        }

        /* renamed from: a */
        void mo103527a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cs$e */
    public final /* synthetic */ class C64128e implements AbstractC34543f {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f145484a;

        static {
            Covode.recordClassIndex(75572);
        }

        C64128e(AbstractC89171a aVar) {
            this.f145484a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final /* synthetic */ void mo57673a() {
            C89219l.m154716b(this.f145484a.invoke(), "");
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }
    }

    static {
        Covode.recordClassIndex(75567);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cs$a */
    public static final class C64124a {
        static {
            Covode.recordClassIndex(75568);
        }

        private C64124a() {
        }

        public /* synthetic */ C64124a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cs$d */
    public static final /* synthetic */ class C64127d extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(75571);
        }

        C64127d(View$OnClickListenerC64123cs csVar) {
            super(0, csVar, View$OnClickListenerC64123cs.class, "follow", "follow()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((View$OnClickListenerC64123cs) this.receiver).mo103732a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static float m116042b() {
        if (C63746h.m115277a()) {
            return 160.0f;
        }
        return 130.0f;
    }

    /* renamed from: e */
    private static float m116045e() {
        if (C63746h.m115277a()) {
            return 120.0f;
        }
        return 72.0f;
    }

    /* renamed from: f */
    private static int m116046f() {
        if (C63746h.m115277a()) {
            return 61;
        }
        return 71;
    }

    /* renamed from: d */
    private final String m116044d() {
        int i = this.f145481r;
        if (i == 1) {
            return "homepage_follow";
        }
        if (i != 2) {
            return "others_homepage";
        }
        return "homepage_friends";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r0.isPrivateAccount() != false) goto L_0x0053;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m116043c() {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.View$OnClickListenerC64123cs.m116043c():void");
    }

    /* renamed from: a */
    public final void mo103732a() {
        AbstractC64126c cVar;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        Activity activity = null;
        if (!g.isLogin()) {
            C58957c.m108320a(C17873f.m33102j(), "homepage_follow", "click_follow_tab", (Bundle) null, new C64128e(new C64127d(this)));
            return;
        }
        User user = this.f145469e;
        if (user == null) {
            C89219l.m154710a("mUser");
        }
        if (user.getFollowStatus() == 0 && (cVar = this.f145472h) != null) {
            cVar.mo103527a();
        }
        Context context = this.f145473i;
        if (context instanceof Activity) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            activity = (Activity) context;
        }
        User user2 = this.f145469e;
        if (user2 == null) {
            C89219l.m154710a("mUser");
        }
        char c = 2;
        if (user2.getFollowStatus() != 0) {
            c = 0;
        } else {
            User user3 = this.f145469e;
            if (user3 == null) {
                C89219l.m154710a("mUser");
            }
            if (user3.isSecret()) {
                c = 4;
            } else {
                User user4 = this.f145469e;
                if (user4 == null) {
                    C89219l.m154710a("mUser");
                }
                if (user4.getFollowerStatus() != 1) {
                    c = 1;
                }
            }
        }
        User user5 = this.f145469e;
        if (user5 == null) {
            C89219l.m154710a("mUser");
        }
        if (user5.getFollowStatus() == 4) {
            if (activity == null) {
                return;
            }
        } else if (c == 4) {
            if (activity != null) {
                m116041a(activity);
            } else {
                return;
            }
        }
        m116043c();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: d_ */
    public final void mo71322d_(Exception exc) {
        int i;
        if (!C63873h.f144797a.shouldDoCaptcha(exc)) {
            Activity a = C34729o.m70950a(this.f145473i);
            C89219l.m154716b(a, "");
            C39143l.m79438a(a, exc);
        }
        Integer num = this.f145478n;
        User user = this.f145469e;
        if (user == null) {
            C89219l.m154710a("mUser");
        }
        mo103733a(num, user.getFollowerStatus());
        User user2 = this.f145469e;
        if (user2 == null) {
            C89219l.m154710a("mUser");
        }
        Integer num2 = this.f145478n;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        user2.setFollowStatus(i);
    }

    /* renamed from: a */
    private static void m116041a(Activity activity) {
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<Integer> privacyAccountFollowCount = inst.getPrivacyAccountFollowCount();
        C89219l.m154716b(privacyAccountFollowCount, "");
        Integer c = privacyAccountFollowCount.mo59941c();
        if (c != null && c.intValue() == 0) {
            ((C23048e) new C23048e(activity).mo37483b(R.string.esu)).mo37443a(R.string.cbc, null).mo37442a().mo37396b().show();
        } else {
            C89219l.m154716b(c, "");
            int intValue = c.intValue();
            if (1 <= intValue && 3 >= intValue) {
                new C23144b(activity).mo37640e(R.string.esv).mo37637b();
            }
        }
        privacyAccountFollowCount.mo59940b(Integer.valueOf(c.intValue() + 1));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: b */
    public final void mo71320b(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        String str = followStatus.userId;
        User user = this.f145469e;
        if (user == null) {
            C89219l.m154710a("mUser");
        }
        if (TextUtils.equals(str, user.getUid())) {
            User user2 = this.f145469e;
            if (user2 == null) {
                C89219l.m154710a("mUser");
            }
            user2.setFollowStatus(followStatus.followStatus);
            int i = followStatus.followStatus;
            User user3 = this.f145469e;
            if (user3 == null) {
                C89219l.m154710a("mUser");
            }
            AbstractC81915c.m141874a(new C35503c(i, user3));
            IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
            mo103733a(Integer.valueOf(followStatus.followStatus), followStatus.followerStatus);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: c */
    public final void mo71321c(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        this.f145478n = Integer.valueOf(followStatus.followStatus);
        String d = m116044d();
        String str = followStatus.userId;
        C89219l.m154716b(str, "");
        if (followStatus.followStatus == 0) {
            C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", d).mo59983a("to_user_id", str).f79943a);
        } else {
            C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", d).mo59983a("to_user_id", str).f79943a);
        }
    }

    public final void onClick(View view) {
        boolean z;
        C59256u.EnumC59257a aVar;
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        int id = view.getId();
        if (id == R.id.a6q) {
            AbstractC64125b bVar = this.f145471g;
            if (bVar != null) {
                User user = this.f145469e;
                if (user == null) {
                    C89219l.m154710a("mUser");
                }
                bVar.mo103735a(user, this.f145470f);
            }
            C59256u a = new C59256u().mo96834a("others_homepage");
            a.f135350a = C59256u.EnumC59259c.CARD;
            a.f135352b = C59256u.EnumC59257a.CLOSE;
            User user2 = this.f145469e;
            if (user2 == null) {
                C89219l.m154710a("mUser");
            }
            a.mo96832a(user2).mo96841s(this.f145476l).mo96838p("top").mo96842t(this.f145477m).mo96792f();
        } else if (id == R.id.nz) {
            C64363i.AbstractC64365b bVar2 = this.f145474j;
            if (bVar2 != null) {
                User user3 = this.f145469e;
                if (user3 == null) {
                    C89219l.m154710a("mUser");
                }
                bVar2.mo103926d(user3);
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f145473i, "aweme://user/profile/");
            User user4 = this.f145469e;
            if (user4 == null) {
                C89219l.m154710a("mUser");
            }
            SmartRoute withParam = buildRoute.withParam("uid", user4.getUid());
            User user5 = this.f145469e;
            if (user5 == null) {
                C89219l.m154710a("mUser");
            }
            SmartRoute withParam2 = withParam.withParam("sec_user_id", user5.getSecUid()).withParam("enter_from", m116044d()).withParam("enter_from_request_id", this.f145476l).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1);
            User user6 = this.f145469e;
            if (user6 == null) {
                C89219l.m154710a("mUser");
            }
            SmartRoute withParam3 = withParam2.withParam("previous_recommend_reason", user6.getRecommendReason()).withParam("recommend_from_type", "card").withParam("position", "top");
            C59256u.EnumC59259c cVar = C59256u.EnumC59259c.CARD;
            User user7 = this.f145469e;
            if (user7 == null) {
                C89219l.m154710a("mUser");
            }
            String recType = user7.getRecType();
            User user8 = this.f145469e;
            if (user8 == null) {
                C89219l.m154710a("mUser");
            }
            C59256u.EnumC59258b a2 = C66623g.C66624a.m118386a(user8);
            User user9 = this.f145469e;
            if (user9 == null) {
                C89219l.m154710a("mUser");
            }
            String uid = user9.getUid();
            String str = this.f145476l;
            String str2 = this.f145477m;
            User user10 = this.f145469e;
            if (user10 == null) {
                C89219l.m154710a("mUser");
            }
            String friendTypeStr = user10.getFriendTypeStr();
            User user11 = this.f145469e;
            if (user11 == null) {
                C89219l.m154710a("mUser");
            }
            withParam3.withParam("recommend_enter_profile_params", new C66623g("others_homepage", null, cVar, recType, a2, uid, null, null, str, str2, friendTypeStr, user11.getSocialInfo())).open();
            C59256u a3 = new C59256u().mo96834a("others_homepage");
            a3.f135350a = C59256u.EnumC59259c.CARD;
            a3.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
            User user12 = this.f145469e;
            if (user12 == null) {
                C89219l.m154710a("mUser");
            }
            a3.mo96832a(user12).mo96841s(this.f145476l).mo96838p("top").mo96842t(this.f145477m).mo96792f();
        } else if (id == R.id.b6a) {
            boolean d = IMUnder16ProxyImpl.m102047n().mo93022d();
            INoticeService f = NoticeServiceImpl.m112566f();
            Context context = this.f145473i;
            User user13 = this.f145469e;
            if (user13 == null) {
                C89219l.m154710a("mUser");
            }
            if (d || !C56203d.m102113b()) {
                z = false;
            } else {
                z = true;
            }
            if (!f.mo99377a(context, user13, "others_homepage", "card", z)) {
                C64363i.AbstractC64365b bVar3 = this.f145474j;
                if (bVar3 != null) {
                    User user14 = this.f145469e;
                    if (user14 == null) {
                        C89219l.m154710a("mUser");
                    }
                    bVar3.mo103925c(user14);
                }
                C59256u a4 = new C59256u().mo96834a("others_homepage");
                a4.f135350a = C59256u.EnumC59259c.CARD;
                User user15 = this.f145469e;
                if (user15 == null) {
                    C89219l.m154710a("mUser");
                }
                if (user15.getFollowStatus() == 0) {
                    aVar = C59256u.EnumC59257a.FOLLOW;
                } else {
                    aVar = C59256u.EnumC59257a.FOLLOW_CANCEL;
                }
                a4.f135352b = aVar;
                User user16 = this.f145469e;
                if (user16 == null) {
                    C89219l.m154710a("mUser");
                }
                a4.mo96832a(user16).mo96841s(this.f145476l).mo96838p("top").mo96842t(this.f145477m).mo96792f();
                mo103732a();
                C51648a aVar2 = C51648a.f118980a;
                User user17 = this.f145469e;
                if (user17 == null) {
                    C89219l.m154710a("mUser");
                }
                if (aVar2.mo87310a(user17)) {
                    C51648a.f118980a.mo87304a(3, "others_homepage", "follow", this.f145473i);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC64123cs(View view, int i) {
        super(view);
        float f;
        float f2;
        int i2;
        C89219l.m154721d(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f145473i = context;
        View findViewById = view.findViewById(R.id.nz);
        C89219l.m154716b(findViewById, "");
        this.f145465a = (AvatarImageWithVerifyMus) findViewById;
        View findViewById2 = view.findViewById(R.id.oa);
        C89219l.m154716b(findViewById2, "");
        this.f145483t = findViewById2;
        View findViewById3 = view.findViewById(R.id.dnb);
        C89219l.m154716b(findViewById3, "");
        this.f145475k = findViewById3;
        View findViewById4 = view.findViewById(R.id.fa1);
        C89219l.m154716b(findViewById4, "");
        this.f145466b = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dfm);
        C89219l.m154716b(findViewById5, "");
        this.f145467c = (MutualRelationView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dfk);
        C89219l.m154716b(findViewById6, "");
        this.f145468d = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.b6a);
        C89219l.m154716b(findViewById7, "");
        this.f145479p = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.a6q);
        C89219l.m154716b(findViewById8, "");
        TuxIconView tuxIconView = (TuxIconView) findViewById8;
        this.f145482s = tuxIconView;
        tuxIconView.setOnClickListener(this);
        this.f145482s.setVisibility(0);
        this.f145465a.setOnClickListener(this);
        this.f145479p.setOnClickListener(this);
        if (this.f145480q == null) {
            AbstractC51754w i3 = C51648a.f118980a.mo87329i();
            this.f145480q = i3;
            if (i3 != null) {
                i3.mo87468a(this);
            }
        }
        this.f145481r = i;
        this.f145475k.setBackgroundResource(R.color.v);
        ViewGroup.LayoutParams layoutParams = this.f145475k.getLayoutParams();
        float b = m116042b();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, b, system.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams2 = this.f145465a.getLayoutParams();
        C89219l.m154716b(layoutParams2, "");
        float e = m116045e();
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        layoutParams2.width = C89241a.m154730a(TypedValue.applyDimension(1, e, system2.getDisplayMetrics()));
        float e2 = m116045e();
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        layoutParams2.height = C89241a.m154730a(TypedValue.applyDimension(1, e2, system3.getDisplayMetrics()));
        this.f145465a.setLayoutParams(layoutParams2);
        this.f145483t.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f145479p.getLayoutParams();
        C89219l.m154716b(layoutParams3, "");
        if (C63746h.m115277a()) {
            f = 136.0f;
        } else {
            f = 106.0f;
        }
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        layoutParams3.width = C89241a.m154730a(TypedValue.applyDimension(1, f, system4.getDisplayMetrics()));
        this.f145479p.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f145475k.getLayoutParams();
        C89219l.m154716b(layoutParams4, "");
        if (C63746h.m115277a()) {
            f2 = 226.0f;
        } else {
            f2 = 176.0f;
        }
        Resources system5 = Resources.getSystem();
        C89219l.m154709a((Object) system5, "");
        layoutParams4.height = C89241a.m154730a(TypedValue.applyDimension(1, f2, system5.getDisplayMetrics()));
        this.f145475k.setLayoutParams(layoutParams4);
        this.f145468d.setTuxFont(m116046f());
        TuxTextView tuxTextView = this.f145468d;
        if (C63746h.m115277a()) {
            i2 = 144;
        } else {
            i2 = 114;
        }
        float f3 = (float) i2;
        Resources system6 = Resources.getSystem();
        C89219l.m154709a((Object) system6, "");
        tuxTextView.setMaxWidth(C89241a.m154730a(TypedValue.applyDimension(1, f3, system6.getDisplayMetrics())));
        this.f145467c.setTuxTextSize(m116046f());
        this.f145467c.setAllTextColorUseAttrResource(R.attr.bj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        if (r1 == null) goto L_0x00d1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103733a(java.lang.Integer r9, int r10) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.View$OnClickListenerC64123cs.mo103733a(java.lang.Integer, int):void");
    }
}
