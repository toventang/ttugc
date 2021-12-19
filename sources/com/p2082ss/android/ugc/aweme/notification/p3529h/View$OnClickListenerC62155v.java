package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.notification.utils.C62271n;
import com.p2082ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.p2082ss.android.ugc.aweme.p2315ao.C33515a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.v */
public final class View$OnClickListenerC62155v extends AbstractC62159w implements View.OnClickListener {

    /* renamed from: d */
    public static final C62157a f141123d = new C62157a((byte) 0);

    /* renamed from: A */
    private final SmartRoundImageView f141124A;

    /* renamed from: B */
    private final TuxIconView f141125B;

    /* renamed from: C */
    private final TuxIconView f141126C;

    /* renamed from: D */
    private final SmartRoundImageView f141127D;

    /* renamed from: E */
    private final View f141128E;

    /* renamed from: F */
    private final TextView f141129F;

    /* renamed from: G */
    private C51086a f141130G;

    /* renamed from: H */
    private AtMe f141131H;

    /* renamed from: a */
    public BaseNotice f141132a;

    /* renamed from: b */
    public String f141133b;

    /* renamed from: c */
    public String f141134c;

    /* renamed from: e */
    private final View f141135e;

    /* renamed from: f */
    private final AvatarImageWithVerify f141136f;

    /* renamed from: v */
    private final TextView f141137v;

    /* renamed from: w */
    private final FollowTuxTextView f141138w;

    /* renamed from: x */
    private final View f141139x;

    /* renamed from: y */
    private final MutualRelationView f141140y;

    /* renamed from: z */
    private final TextView f141141z;

    static {
        Covode.recordClassIndex(72909);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.v$a */
    public static final class C62157a {
        static {
            Covode.recordClassIndex(72911);
        }

        private C62157a() {
        }

        public /* synthetic */ C62157a(byte b) {
            this();
        }
    }

    /* renamed from: h */
    private static boolean m112398h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w
    /* renamed from: c */
    public final User mo100067c() {
        AtMe atMe = this.f141131H;
        if (atMe != null) {
            return atMe.getUser();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    /* renamed from: f */
    public final void mo100100f() {
        super.mo100146g();
        this.f140768h.mo100338a(this.f140984j, new C62158b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.v$b */
    static final class C62158b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62155v f141143a;

        static {
            Covode.recordClassIndex(72912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62158b(View$OnClickListenerC62155v vVar) {
            super(0);
            this.f141143a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            View$OnClickListenerC62155v vVar = this.f141143a;
            vVar.mo100145a("show", "at", vVar.f140984j, this.f141143a.f141133b, this.f141143a.f141134c, (User) null);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p
    /* renamed from: c */
    public final void mo100157c(int i) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putInt("from_where", i);
        bundle.putString("username", this.f141137v.getText().toString());
        AtMe atMe = this.f141131H;
        if (atMe != null) {
            User user = atMe.getUser();
            C89219l.m154716b(user, "");
            UrlModel avatarThumb = user.getAvatarThumb();
            int subType = atMe.getSubType();
            if (subType == 1) {
                Context context = this.f140983i;
                C89219l.m154716b(context, "");
                str = context.getResources().getString(R.string.cf1);
            } else if (subType == 2) {
                Context context2 = this.f140983i;
                C89219l.m154716b(context2, "");
                str = context2.getResources().getString(R.string.cf0);
            } else if (subType == 7) {
                Context context3 = this.f140983i;
                C89219l.m154716b(context3, "");
                str = context3.getResources().getString(R.string.djc);
            } else {
                return;
            }
            if (str != null) {
                bundle.putString("content", str);
                bundle.putSerializable("avatar_thumb", avatarThumb);
            } else {
                return;
            }
        }
        this.f141032n = bundle;
        this.f141031m = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62155v(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f141135e = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f141136f = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById3, "");
        this.f141137v = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cuy);
        C89219l.m154716b(findViewById4, "");
        FollowTuxTextView followTuxTextView = (FollowTuxTextView) findViewById4;
        this.f141138w = followTuxTextView;
        View findViewById5 = view.findViewById(R.id.cuz);
        C89219l.m154716b(findViewById5, "");
        this.f141139x = findViewById5;
        View findViewById6 = view.findViewById(R.id.cp5);
        C89219l.m154716b(findViewById6, "");
        this.f141140y = (MutualRelationView) findViewById6;
        View findViewById7 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById7, "");
        this.f141141z = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cua);
        C89219l.m154716b(findViewById8, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById8;
        this.f141124A = smartRoundImageView;
        View findViewById9 = view.findViewById(R.id.cut);
        C89219l.m154716b(findViewById9, "");
        this.f141125B = (TuxIconView) findViewById9;
        View findViewById10 = view.findViewById(R.id.cus);
        C89219l.m154716b(findViewById10, "");
        this.f141126C = (TuxIconView) findViewById10;
        View findViewById11 = view.findViewById(R.id.cu_);
        C89219l.m154716b(findViewById11, "");
        SmartRoundImageView smartRoundImageView2 = (SmartRoundImageView) findViewById11;
        this.f141127D = smartRoundImageView2;
        View findViewById12 = view.findViewById(R.id.cv3);
        C89219l.m154716b(findViewById12, "");
        this.f141128E = findViewById12;
        View findViewById13 = view.findViewById(R.id.cv4);
        C89219l.m154716b(findViewById13, "");
        this.f141129F = (TextView) findViewById13;
        C62266j.m112647b(findViewById);
        C62023a.m112168a(avatarImageWithVerify);
        C62023a.m112168a(smartRoundImageView);
        C62023a.m112168a(smartRoundImageView2);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(C80397em.m139369a(101));
        smartRoundImageView.setOnClickListener(this);
        smartRoundImageView2.setOnClickListener(this);
        followTuxTextView.setOnClickListener(this);
        this.f141130G = new C51086a(followTuxTextView, new C51086a.C51094g(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62155v.C621561 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC62155v f141142a;

            static {
                Covode.recordClassIndex(72910);
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f141142a = r1;
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            /* renamed from: a */
            public final void mo63346a(int r4, com.p2082ss.android.ugc.aweme.profile.model.User r5) {
                /*
                    r3 = this;
                    super.mo63346a(r4, r5)
                    java.lang.String r2 = "follow"
                    java.lang.String r1 = "at"
                    java.lang.String r0 = "inbox_interaction_message"
                    com.p2082ss.android.ugc.aweme.notification.utils.C62259e.m112621a(r2, r1, r0, r5)
                    r0 = 0
                    com.p2082ss.android.ugc.aweme.notification.utils.C62259e.m112617a(r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62155v.C621561.mo63346a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
        ((C24246a) smartRoundImageView.getHierarchy()).mo39966c(R.color.f);
        ((C24246a) smartRoundImageView2.getHierarchy()).mo39966c(R.color.f);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112398h();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        AtMe atMe = this.f141131H;
        if (atMe != null) {
            mo100145a("click", "at", this.f141132a, this.f141133b, this.f141134c, (User) null);
            User user = null;
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.cuf) {
                    User user2 = atMe.getUser();
                    C89219l.m154716b(user2, "");
                    String uid = user2.getUid();
                    C89219l.m154716b(uid, "");
                    User user3 = atMe.getUser();
                    C89219l.m154716b(user3, "");
                    String secUid = user3.getSecUid();
                    C89219l.m154716b(secUid, "");
                    C62129p.C62130a.m112360a(uid, secUid, false, null, null, 56);
                } else if (valueOf.intValue() == R.id.cv7 || valueOf.intValue() == R.id.cua || valueOf.intValue() == R.id.cu_) {
                    C61968c.HandlerC61971c b = C61968c.m112097b();
                    if (b != null) {
                        b.mo100034b(this.f141132a);
                    }
                    if (this.f141031m) {
                        C62271n.m112656a(this.f141032n, getAdapterPosition());
                    }
                    AtMe atMe2 = this.f141131H;
                    if (atMe2 != null) {
                        user = atMe2.getUser();
                    }
                    int a = C76598h.m134176a(user);
                    if (atMe.getSubType() == 55 || atMe.getSubType() == 54) {
                        if (atMe.getAweme() != null) {
                            Aweme aweme = atMe.getAweme();
                            C89219l.m154716b(aweme, "");
                            if (aweme.getAid() != null) {
                                SmartRouter.buildRoute(C17867d.m33078a(), atMe.getSchemaUrl()).withParam("video_from", "STORY_ENTRANCE_DEFAULT").withParam("enter_from", "notification_page").withParam("story_comment_user_follow_status", a).open();
                            }
                        }
                        Context context = this.f140983i;
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        new C23144b((Activity) context).mo37640e(R.string.g69).mo37637b();
                    } else {
                        SmartRoute withParam = SmartRouter.buildRoute(C17867d.m33078a(), atMe.getSchemaUrl()).withParam("refer", "notification_page").withParam("story_comment_user_follow_status", a);
                        C89219l.m154716b(withParam, "");
                        String schemaUrl = atMe.getSchemaUrl();
                        C89219l.m154716b(schemaUrl, "");
                        C61968c.m112094a(withParam, schemaUrl).open();
                    }
                    if (!TextUtils.isEmpty(AbstractView$OnLongClickListenerC62118k.m112171a(atMe.getSchemaUrl()))) {
                        Context context2 = this.f140983i;
                        C89219l.m154716b(context2, "");
                        C62266j.m112644a(context2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100163a(BaseNotice baseNotice, String str, String str2) {
        String cid;
        String a;
        C51086a aVar;
        C89219l.m154721d(baseNotice, "");
        C89219l.m154721d(str2, "");
        if (baseNotice.atMe != null) {
            this.f141132a = baseNotice;
            this.f141133b = str;
            this.f141134c = str2;
            this.f141131H = baseNotice.atMe;
            this.f141125B.setVisibility(8);
            this.f141126C.setVisibility(8);
            AtMe atMe = this.f141131H;
            if (atMe != null) {
                this.f141136f.setUserData(new UserVerify(atMe.getUser().getAvatarThumb(), atMe.getUser().getCustomVerify(), atMe.getUser().getEnterpriseVerifyReason(), Integer.valueOf(atMe.getUser().getVerificationType())));
                this.f141136f.mo61285a();
                TextView textView = this.f141137v;
                User user = atMe.getUser();
                C89219l.m154716b(user, "");
                mo100153a(textView, user, this.f141132a, str, str2);
                User user2 = atMe.getUser();
                if (!(user2 == null || (aVar = this.f141130G) == null)) {
                    aVar.mo86508a(user2);
                }
                m112346a(this.f141140y, Collections.singletonList(atMe.getUser()), this.f141124A, this.f141135e);
                m112345a(this.f141138w, "at", Collections.singletonList(atMe.getUser()), this.f141139x);
                if (atMe.getSubType() == 2 || atMe.getSubType() == 55) {
                    this.f141124A.setVisibility(0);
                    this.f141127D.setVisibility(8);
                    this.f141141z.setTextColor(C0643b.m2378c(this.f140983i, R.color.bx));
                    Comment comment = atMe.getComment();
                    if (!(comment == null || (cid = comment.getCid()) == null || cid.length() == 0)) {
                        this.f141128E.setVisibility(0);
                        NoticeCommentHelperService a2 = NoticeCommentHelperServiceImpl.m75149a();
                        TextView textView2 = this.f141129F;
                        if (comment.getUser() != null) {
                            StringBuilder sb = new StringBuilder();
                            User user3 = comment.getUser();
                            C89219l.m154716b(user3, "");
                            a = sb.append(C62266j.m112643a(user3)).append(": ").append(a2.mo64747a(comment)).toString();
                        } else {
                            a = a2.mo64747a(comment);
                        }
                        textView2.setText(a);
                        C46579b.m89899a(this.f141129F);
                    }
                    if (atMe.getImageUrl() == null) {
                        this.f141125B.setVisibility(0);
                    } else {
                        C20766v a3 = C20761r.m39060a(C34735v.m70965a(atMe.getImageUrl())).mo34185b(C80397em.m139369a(500)).mo34179a("Notice");
                        a3.f49092E = this.f141124A;
                        a3.mo34186c();
                    }
                } else {
                    this.f141124A.setVisibility(8);
                    this.f141127D.setVisibility(0);
                    this.f141128E.setVisibility(8);
                    this.f141141z.setTextColor(C0643b.m2378c(this.f140983i, R.color.c5));
                    if (atMe.getImageUrl() == null) {
                        this.f141126C.setVisibility(0);
                    } else {
                        C20766v a4 = C20761r.m39060a(C34735v.m70965a(atMe.getImageUrl())).mo34185b(C80397em.m139369a(500)).mo34179a("Notice");
                        a4.f49092E = this.f141127D;
                        a4.mo34186c();
                    }
                }
                C62135q.m112363a(this.f141141z, new SpannableStringBuilder(C33515a.m68674a(atMe)), baseNotice, 7, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 148.0f)));
                C46579b.m89899a(this.f141141z);
            }
            mo100165a((AbstractC62159w) true);
        }
    }
}
