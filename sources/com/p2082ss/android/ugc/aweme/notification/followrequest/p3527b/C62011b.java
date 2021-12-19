package com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.TikTokFollowUserBtn;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61851j;
import com.p2082ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.notification.utils.C62256c;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.b.b */
public final class C62011b extends AbstractC62159w implements C51086a.AbstractC51091d {

    /* renamed from: A */
    private final TikTokFollowUserBtn f140732A;

    /* renamed from: a */
    public User f140733a;

    /* renamed from: b */
    public final TuxTextView f140734b;

    /* renamed from: c */
    public String f140735c = "follow_request_page";

    /* renamed from: d */
    public final AbstractC61851j f140736d;

    /* renamed from: e */
    public final C62256c f140737e;

    /* renamed from: f */
    private C51086a f140738f;

    /* renamed from: v */
    private final AbstractC51346a f140739v;

    /* renamed from: w */
    private final View f140740w;

    /* renamed from: x */
    private final View f140741x;

    /* renamed from: y */
    private final TuxTextView f140742y;

    /* renamed from: z */
    private final SmartImageView f140743z;

    static {
        Covode.recordClassIndex(72762);
    }

    @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
    /* renamed from: a */
    public final void mo63342a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
    /* renamed from: b */
    public final void mo63344b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w
    /* renamed from: c */
    public final User mo100067c() {
        return this.f140733a;
    }

    /* renamed from: h */
    private final void m112157h() {
        ViewGroup.LayoutParams buttonLayoutParams = this.f140732A.getButtonLayoutParams();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        buttonLayoutParams.width = C89241a.m154730a(C13628n.m24520b(view.getContext(), 80.0f));
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        buttonLayoutParams.height = C89241a.m154730a(C13628n.m24520b(view2.getContext(), 28.0f));
        if (C89219l.m154714a((Object) this.f140735c, (Object) "notification_page")) {
            buttonLayoutParams.width = C62262g.m112633a(this.f140983i);
        }
        this.f140732A.setButtonLayoutParams(buttonLayoutParams);
        this.f140732A.setButtonHorizontalPadding(6);
        this.f140732A.f119112h = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
    /* renamed from: a */
    public final void mo63343a(FollowStatus followStatus) {
        if (followStatus != null) {
            IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
        }
    }

    /* renamed from: b */
    private static boolean m112156b(User user) {
        if (user.getFollowFrom() != 29 || !C80538hl.m139614a(user.getFollowFromMsg())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.followrequest.b.b$a */
    public static final class C62019a implements C51086a.AbstractC51090c {

        /* renamed from: a */
        final /* synthetic */ C62011b f140751a;

        /* renamed from: b */
        final /* synthetic */ User f140752b;

        static {
            Covode.recordClassIndex(72770);
        }

        C62019a(C62011b bVar, User user) {
            this.f140751a = bVar;
            this.f140752b = user;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
        /* renamed from: a */
        public final boolean mo63341a(int i) {
            if (i != 2) {
                return false;
            }
            C62011b bVar = this.f140751a;
            User user = this.f140752b;
            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
            if (createIMainServiceHelperbyMonsterPlugin == null || !createIMainServiceHelperbyMonsterPlugin.shouldRedictToTipsPage() || createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                INoticeService.C61609a.m111607a(NoticeServiceImpl.m112566f(), bVar.f140983i, user, bVar.f140735c, null, true, 8);
                return true;
            }
            createIMainServiceHelperbyMonsterPlugin.goToTipsPage();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo100066a(boolean z, User user) {
        if (z) {
            this.f140740w.setVisibility(8);
            this.f140741x.setVisibility(8);
            this.f140732A.setVisibility(0);
            user.setFollowerStatus(1);
            m112157h();
            if (user.getFollowStatus() == 1) {
                user.setFollowStatus(2);
            }
            C51086a aVar = this.f140738f;
            if (aVar != null) {
                aVar.mo86508a(user);
            }
            C51086a aVar2 = this.f140738f;
            if (aVar2 != null) {
                aVar2.f117879e = new C62019a(this, user);
                return;
            }
            return;
        }
        this.f140740w.setVisibility(0);
        this.f140741x.setVisibility(0);
        this.f140732A.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo100065a(User user, String str) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        this.f140733a = user;
        this.f140735c = str;
        if (user.getFollowerStatus() == 1) {
            mo100066a(true, user);
        } else {
            mo100066a(false, user);
        }
        this.f140742y.setText(C80580in.m139684b(user));
        if (m112156b(user)) {
            TuxTextView tuxTextView = this.f140734b;
            tuxTextView.setText(user.getFollowFromMsg());
            tuxTextView.setSingleLine(false);
            tuxTextView.setMaxLines(Integer.MAX_VALUE);
        } else {
            this.f140734b.setText(user.getNickname());
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C80581io.m139704a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f140742y);
        C20766v a = C20761r.m39060a(C34735v.m70965a(user.getAvatarMedium()));
        a.f49092E = this.f140743z;
        a.f49115l = R.color.f;
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48957a = true;
        a.f49126w = aVar.mo34169a();
        a.mo34186c();
        AbstractC62159w.m112404a(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62011b(View view, AbstractC61851j jVar, C62256c cVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(cVar, "");
        this.f140736d = jVar;
        this.f140737e = cVar;
        View findViewById = this.itemView.findViewById(R.id.wg);
        C89219l.m154716b(findViewById, "");
        AbstractC51346a aVar = (AbstractC51346a) findViewById;
        this.f140739v = aVar;
        View findViewById2 = this.itemView.findViewById(R.id.w_);
        C89219l.m154716b(findViewById2, "");
        this.f140740w = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.we);
        C89219l.m154716b(findViewById3, "");
        this.f140741x = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.f6v);
        C89219l.m154716b(findViewById4, "");
        this.f140742y = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.f03);
        C89219l.m154716b(findViewById5, "");
        this.f140734b = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.bw7);
        C89219l.m154716b(findViewById6, "");
        this.f140743z = (SmartImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.wg);
        C89219l.m154716b(findViewById7, "");
        this.f140732A = (TikTokFollowUserBtn) findViewById7;
        C51086a aVar2 = new C51086a(aVar, new C51086a.C51094g(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b.C62011b.C620121 */

            /* renamed from: a */
            final /* synthetic */ C62011b f140744a;

            static {
                Covode.recordClassIndex(72763);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f140744a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            /* renamed from: a */
            public final void mo63346a(int i, User user) {
                int i2;
                if (user == null) {
                    return;
                }
                if (2 == i || 1 == i || 4 == i) {
                    String str = this.f140744a.f140735c;
                    C89219l.m154721d(user, "");
                    C89219l.m154721d(str, "");
                    C39162r.m79460a("follow", new C33744d().mo59983a("to_user_id", user.getUid()).mo59983a("enter_from", str).mo59983a("previous_page", "notification_page").mo59980a("is_private", user.isSecret() ? 1 : 0).mo59983a("follow_type", "mutual").f79943a);
                } else if (i == 0) {
                    if (user.getFollowStatus() == 4) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    String str2 = this.f140744a.f140735c;
                    C89219l.m154721d(user, "");
                    C89219l.m154721d(str2, "");
                    C39162r.m79460a("follow_cancel", new C33744d().mo59983a("to_user_id", user.getUid()).mo59983a("enter_from", str2).mo59983a("previous_page", "notification_page").mo59980a("is_private", user.isSecret() ? 1 : 0).mo59980a("cancel_type", i2 ^ 1).mo59983a("follow_type", "mutual").f79943a);
                }
            }
        });
        this.f140738f = aVar2;
        aVar2.f117878d = this;
        this.itemView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b.C62011b.View$OnClickListenerC620132 */

            /* renamed from: a */
            final /* synthetic */ C62011b f140745a;

            static {
                Covode.recordClassIndex(72764);
            }

            {
                this.f140745a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                User user = this.f140745a.f140733a;
                if (user != null) {
                    C36125t a = C36125t.m73591a();
                    View view2 = this.f140745a.itemView;
                    C89219l.m154716b(view2, "");
                    Context context = view2.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    C36125t.m73596a(a, (Activity) context, C36131u.m73602a("aweme://user/profile/" + user.getUid()).mo63248a("sec_user_id", user.getSecUid()).mo63248a("enter_from", "follow_request_page").mo63249a());
                    LogHelper a2 = LogHelperImpl.m77303a();
                    String str = this.f140745a.f140735c;
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    a2.mo66433a(str, uid, "click_card");
                }
            }
        });
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b.C62011b.View$OnAttachStateChangeListenerC620143 */

            /* renamed from: a */
            final /* synthetic */ C62011b f140746a;

            static {
                Covode.recordClassIndex(72765);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f140746a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                if (this.f140746a.f140733a != null) {
                    C62256c cVar = this.f140746a.f140737e;
                    User user = this.f140746a.f140733a;
                    if (user == null) {
                        C89219l.m154715b();
                    }
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    String str = this.f140746a.f140735c;
                    C89219l.m154721d(uid, "");
                    C89219l.m154721d(str, "");
                    if (!cVar.f141307a.contains(uid)) {
                        cVar.f141307a.add(uid);
                        C39162r.m79460a("follow_request_message", new C33744d().mo59983a("user_id", uid).mo59983a("enter_from", str).f79943a);
                    }
                }
            }
        });
        findViewById3.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b.C62011b.View$OnClickListenerC620154 */

            /* renamed from: a */
            final /* synthetic */ C62011b f140747a;

            static {
                Covode.recordClassIndex(72766);
            }

            {
                this.f140747a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                User user = this.f140747a.f140733a;
                if (user != null && this.f140747a.getAbsoluteAdapterPosition() >= 0) {
                    this.f140747a.f140736d.mo93501d(this.f140747a.getAbsoluteAdapterPosition());
                    FollowRequestApiManager.m112153a(new WeakHandler(C620161.f140748a), user.getUid());
                    LogHelper a = LogHelperImpl.m77303a();
                    String str = this.f140747a.f140735c;
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    a.mo66438d(str, uid);
                }
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b.C62011b.View$OnClickListenerC620175 */

            /* renamed from: a */
            final /* synthetic */ C62011b f140749a;

            static {
                Covode.recordClassIndex(72768);
            }

            {
                this.f140749a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                User user = this.f140749a.f140733a;
                if (user != null && this.f140749a.getAbsoluteAdapterPosition() >= 0) {
                    this.f140749a.mo100066a(true, user);
                    if (C89219l.m154714a((Object) this.f140749a.f140735c, (Object) "notification_page")) {
                        TuxTextView tuxTextView = this.f140749a.f140734b;
                        C17191a.C17192a aVar = new C17191a.C17192a();
                        String a = C3966y.m9657a((int) R.string.diu);
                        if (a == null) {
                            a = "";
                        }
                        C17191a.C17192a b = aVar.mo27179b(a);
                        String a2 = AbstractView$OnLongClickListenerC62118k.m112310a(System.currentTimeMillis() / 1000, this.f140749a.f140983i);
                        C89219l.m154716b(a2, "");
                        tuxTextView.setText(b.mo27177a(a2).f40973a.toString());
                    }
                    FollowRequestApiManager.m112154a(new WeakHandler(C620181.f140750a), user.getUid(), C56323c.m102322i() ? 1 : 0);
                    C33744d a3 = new C33744d().mo59983a("to_user_id", user.getUid()).mo59983a("enter_from", this.f140749a.f140735c);
                    if (user.getFollowStatus() == 1) {
                        str = "mutual";
                    } else {
                        str = "single";
                    }
                    C39162r.m79460a("follow_approve", a3.mo59983a("follow_type", str).f79943a);
                }
            }
        });
    }
}
