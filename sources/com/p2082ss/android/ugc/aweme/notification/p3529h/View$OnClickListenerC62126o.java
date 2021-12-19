package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61629d;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.o */
public final class View$OnClickListenerC62126o extends C62129p implements View.OnClickListener {

    /* renamed from: d */
    public static final C62127a f141014d = new C62127a((byte) 0);

    /* renamed from: a */
    public C61629d f141015a;

    /* renamed from: b */
    public String f141016b;

    /* renamed from: c */
    public String f141017c;

    /* renamed from: e */
    private final View f141018e;

    /* renamed from: f */
    private final AvatarImageWithVerify f141019f;

    /* renamed from: q */
    private final TextView f141020q;

    /* renamed from: r */
    private final TextView f141021r;

    /* renamed from: s */
    private final View f141022s;

    /* renamed from: t */
    private final SmartRoundImageView f141023t;

    /* renamed from: u */
    private BaseNotice f141024u;

    static {
        Covode.recordClassIndex(72880);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.o$a */
    public static final class C62127a {
        static {
            Covode.recordClassIndex(72881);
        }

        private C62127a() {
        }

        public /* synthetic */ C62127a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static boolean m112333c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    /* renamed from: f */
    public final void mo100100f() {
        super.mo100146g();
        this.f140768h.mo100338a(this.f140984j, new C62128b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.o$b */
    static final class C62128b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62126o f141025a;

        static {
            Covode.recordClassIndex(72882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62128b(View$OnClickListenerC62126o oVar) {
            super(0);
            this.f141025a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            User user;
            View$OnClickListenerC62126o oVar = this.f141025a;
            int i = oVar.f140984j.clientOrder;
            BaseNotice baseNotice = this.f141025a.f140984j;
            String str = this.f141025a.f141017c;
            String str2 = this.f141025a.f141016b;
            C61629d dVar = this.f141025a.f141015a;
            if (dVar != null) {
                user = dVar.f139884b;
            } else {
                user = null;
            }
            oVar.mo100080a("show", "donation_sticker", i, baseNotice, "", str, str2, user);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62126o(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f141018e = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f141019f = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById3, "");
        this.f141020q = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById4, "");
        this.f141021r = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cv3);
        C89219l.m154716b(findViewById5, "");
        this.f141022s = findViewById5;
        View findViewById6 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById6, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById6;
        this.f141023t = smartRoundImageView;
        C62266j.m112647b(findViewById);
        C62023a.m112168a(avatarImageWithVerify);
        C62023a.m112168a(smartRoundImageView);
        C62266j.m112646a(smartRoundImageView);
        smartRoundImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(C80397em.m139369a(101));
        ((C24246a) smartRoundImageView.getHierarchy()).mo39966c(R.color.a1);
        findViewById5.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        int i;
        Integer valueOf;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112333c();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        C61629d dVar = this.f141015a;
        if (dVar != null) {
            BaseNotice baseNotice = this.f141024u;
            if (baseNotice != null) {
                i = baseNotice.clientOrder;
            } else {
                i = -1;
            }
            mo100080a("click", "donation_sticker", i, this.f141024u, "", this.f141017c, this.f141016b, dVar.f139884b);
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.cuf) {
                    if (dVar.f139884b != null) {
                        User user = dVar.f139884b;
                        if (user == null) {
                            C89219l.m154715b();
                        }
                        String uid = user.getUid();
                        C89219l.m154716b(uid, "");
                        User user2 = dVar.f139884b;
                        if (user2 == null) {
                            C89219l.m154715b();
                        }
                        String secUid = user2.getSecUid();
                        C89219l.m154716b(secUid, "");
                        C62129p.C62130a.m112360a(uid, secUid, false, null, null, 56);
                    }
                } else if ((valueOf.intValue() == R.id.cv7 || valueOf.intValue() == R.id.cu9) && dVar.f139883a != null) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(C17867d.m33078a(), "aweme://aweme/detail/");
                    Aweme aweme = dVar.f139883a;
                    if (aweme == null) {
                        C89219l.m154715b();
                    }
                    buildRoute.withParam("id", aweme.getAid()).withParam("refer", "message").withParam("enter_method", "notice_click").withParam("show_donation", true).open();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100150a(BaseNotice baseNotice, String str, String str2) {
        C89219l.m154721d(baseNotice, "");
        C89219l.m154721d(str2, "");
        if (baseNotice.donationNotice != null) {
            this.f141016b = str;
            this.f141024u = baseNotice;
            this.f141017c = str2;
            C61629d dVar = baseNotice.donationNotice;
            this.f141015a = dVar;
            if (dVar != null) {
                User user = dVar.f139884b;
                if (user != null) {
                    this.f141019f.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
                    this.f141019f.mo61285a();
                    mo100153a(this.f141020q, user, this.f141024u, str, str2);
                }
                Aweme aweme = dVar.f139883a;
                if (aweme != null) {
                    Video video = aweme.getVideo();
                    C89219l.m154716b(video, "");
                    C20766v a = C20761r.m39060a(C34735v.m70965a(video.getOriginCover())).mo34185b(C80397em.m139369a(500)).mo34179a("DONATION_NOTICE");
                    a.f49092E = this.f141023t;
                    a.mo34186c();
                }
                C62135q.m112363a(this.f141021r, new SpannableStringBuilder(this.f140983i.getString(R.string.ba_)), baseNotice, 7, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 148.0f)));
            }
        }
    }
}
