package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.notification.utils.C62271n;
import com.p2082ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.p2082ss.android.ugc.aweme.p2315ao.C33515a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.r */
public final class View$OnClickListenerC62137r extends AbstractC62159w implements View.OnClickListener {

    /* renamed from: d */
    public static final C62139a f141046d = new C62139a((byte) 0);

    /* renamed from: A */
    private final View f141047A;

    /* renamed from: B */
    private final View f141048B;

    /* renamed from: C */
    private final TextView f141049C;

    /* renamed from: D */
    private final SmartRoundImageView f141050D;

    /* renamed from: E */
    private final TuxIconView f141051E;

    /* renamed from: F */
    private C51086a f141052F;

    /* renamed from: G */
    private String f141053G;

    /* renamed from: a */
    public CommentNotice f141054a;

    /* renamed from: b */
    public BaseNotice f141055b;

    /* renamed from: c */
    public String f141056c;

    /* renamed from: e */
    private final View f141057e;

    /* renamed from: f */
    private final AvatarImageWithVerify f141058f;

    /* renamed from: v */
    private final TextView f141059v;

    /* renamed from: w */
    private final FollowTuxTextView f141060w;

    /* renamed from: x */
    private final View f141061x;

    /* renamed from: y */
    private final MutualRelationView f141062y;

    /* renamed from: z */
    private final TextView f141063z;

    static {
        Covode.recordClassIndex(72891);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.r$a */
    public static final class C62139a {
        static {
            Covode.recordClassIndex(72893);
        }

        private C62139a() {
        }

        public /* synthetic */ C62139a(byte b) {
            this();
        }
    }

    /* renamed from: h */
    private static boolean m112366h() {
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
        this.f140768h.mo100338a(this.f140984j, new C62140b(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w
    /* renamed from: c */
    public final User mo100067c() {
        Comment comment;
        CommentNotice commentNotice = this.f141054a;
        if (commentNotice == null || (comment = commentNotice.getComment()) == null) {
            return null;
        }
        return comment.getUser();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.r$b */
    static final class C62140b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62137r f141065a;

        static {
            Covode.recordClassIndex(72894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62140b(View$OnClickListenerC62137r rVar) {
            super(0);
            this.f141065a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            User user;
            Comment comment;
            View$OnClickListenerC62137r rVar = this.f141065a;
            int i = rVar.f140984j.clientOrder;
            BaseNotice baseNotice = this.f141065a.f140984j;
            String a = View$OnClickListenerC62137r.m112170a(this.f141065a.f140984j.commentNotice);
            String str = this.f141065a.f141056c;
            boolean z = this.f141065a.f140984j.hasRead;
            CommentNotice commentNotice = this.f141065a.f141054a;
            if (commentNotice == null || (comment = commentNotice.getComment()) == null) {
                user = null;
            } else {
                user = comment.getUser();
            }
            rVar.mo100079a("show", UGCMonitor.EVENT_COMMENT, i, baseNotice, a, "notification_page", str, z ? 1 : 0, user);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private boolean m112365b(SpannableStringBuilder spannableStringBuilder) {
        C89219l.m154721d(spannableStringBuilder, "");
        CommentNotice commentNotice = this.f141054a;
        if (commentNotice == null) {
            return false;
        }
        C89386u<String, Integer, Integer> a = C33515a.m68673a(commentNotice);
        spannableStringBuilder.append((CharSequence) a.getFirst());
        if (a.getSecond().intValue() == -1 || a.getThird().intValue() == -1) {
            return true;
        }
        TextView textView = this.f141063z;
        int intValue = a.getSecond().intValue();
        int intValue2 = a.getThird().intValue();
        Comment replyComment = commentNotice.getReplyComment();
        C89219l.m154716b(replyComment, "");
        User user = replyComment.getUser();
        C89219l.m154716b(user, "");
        mo100152a(textView, spannableStringBuilder, intValue, intValue2, user, this.f141055b, this.f141056c);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62137r(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f141057e = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f141058f = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById3, "");
        this.f141059v = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cuy);
        C89219l.m154716b(findViewById4, "");
        FollowTuxTextView followTuxTextView = (FollowTuxTextView) findViewById4;
        this.f141060w = followTuxTextView;
        View findViewById5 = view.findViewById(R.id.cuz);
        C89219l.m154716b(findViewById5, "");
        this.f141061x = findViewById5;
        View findViewById6 = view.findViewById(R.id.cp5);
        C89219l.m154716b(findViewById6, "");
        this.f141062y = (MutualRelationView) findViewById6;
        View findViewById7 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById7, "");
        this.f141063z = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cv3);
        C89219l.m154716b(findViewById8, "");
        this.f141047A = findViewById8;
        View findViewById9 = view.findViewById(R.id.di3);
        C89219l.m154716b(findViewById9, "");
        this.f141048B = findViewById9;
        View findViewById10 = view.findViewById(R.id.cv4);
        C89219l.m154716b(findViewById10, "");
        this.f141049C = (TextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById11, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById11;
        this.f141050D = smartRoundImageView;
        View findViewById12 = view.findViewById(R.id.cur);
        C89219l.m154716b(findViewById12, "");
        this.f141051E = (TuxIconView) findViewById12;
        C62266j.m112647b(findViewById);
        C62023a.m112168a(avatarImageWithVerify);
        C62023a.m112168a(smartRoundImageView);
        smartRoundImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(C80397em.m139369a(101));
        ((C24246a) smartRoundImageView.getHierarchy()).mo39966c(R.color.f);
        followTuxTextView.setOnClickListener(this);
        this.f141052F = new C51086a(followTuxTextView, new C51086a.C51094g(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62137r.C621381 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC62137r f141064a;

            static {
                Covode.recordClassIndex(72892);
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f141064a = r1;
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
                    java.lang.String r1 = "comment"
                    java.lang.String r0 = "inbox_interaction_message"
                    com.p2082ss.android.ugc.aweme.notification.utils.C62259e.m112621a(r2, r1, r0, r5)
                    r0 = 0
                    com.p2082ss.android.ugc.aweme.notification.utils.C62259e.m112617a(r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62137r.C621381.mo63346a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
    }

    /* renamed from: a */
    private void m112364a(SpannableStringBuilder spannableStringBuilder) {
        Comment replyComment;
        TextView textView;
        String text;
        String text2;
        String str = "";
        C89219l.m154721d(spannableStringBuilder, str);
        this.f141047A.setVisibility(8);
        CommentNotice commentNotice = this.f141054a;
        if (commentNotice != null && (replyComment = commentNotice.getReplyComment()) != null) {
            this.f141047A.setVisibility(0);
            if (commentNotice.getCommentType() == 12 || commentNotice.getCommentType() == 27) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                C89219l.m154716b(createIUserServicebyMonsterPlugin, str);
                User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                textView = this.f141049C;
                if (currentUser != null) {
                    StringBuilder append = new StringBuilder().append(C62266j.m112643a(currentUser)).append(": ");
                    Comment level1Comment = commentNotice.getLevel1Comment();
                    if (!(level1Comment == null || (text2 = level1Comment.getText()) == null)) {
                        str = text2;
                    }
                    str = append.append(str).toString();
                } else {
                    Comment level1Comment2 = commentNotice.getLevel1Comment();
                    if (!(level1Comment2 == null || (text = level1Comment2.getText()) == null)) {
                        str = text;
                    }
                }
            } else {
                NoticeCommentHelperService a = NoticeCommentHelperServiceImpl.m75149a();
                textView = this.f141049C;
                if (replyComment.getUser() != null) {
                    StringBuilder sb = new StringBuilder();
                    User user = replyComment.getUser();
                    C89219l.m154716b(user, str);
                    str = sb.append(C62266j.m112643a(user)).append(": ").append(a.mo64747a(replyComment)).toString();
                } else {
                    str = a.mo64747a(replyComment);
                }
            }
            textView.setText(str);
            if (!TextUtils.isEmpty(this.f141049C.getText())) {
                C46579b.m89899a(this.f141049C);
            } else {
                this.f141047A.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100157c(int r7) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62137r.mo100157c(int):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        int i;
        int i2;
        Integer valueOf;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112366h();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        CommentNotice commentNotice = this.f141054a;
        if (commentNotice != null) {
            int i3 = 0;
            boolean a = C89064i.m154489a(new Integer[]{23, 25, 27, 26}, Integer.valueOf(commentNotice.getCommentType()));
            BaseNotice baseNotice = this.f141055b;
            if (baseNotice != null) {
                i = baseNotice.clientOrder;
            } else {
                i = -1;
            }
            BaseNotice baseNotice2 = this.f141055b;
            CommentNotice commentNotice2 = null;
            if (baseNotice2 != null) {
                commentNotice2 = baseNotice2.commentNotice;
            }
            String a2 = m112170a(commentNotice2);
            String str = this.f141056c;
            BaseNotice baseNotice3 = this.f141055b;
            if (baseNotice3 == null || !baseNotice3.hasRead) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            Comment comment = commentNotice.getComment();
            C89219l.m154716b(comment, "");
            mo100079a("click", UGCMonitor.EVENT_COMMENT, i, baseNotice2, a2, "notification_page", str, i2, comment.getUser());
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.cuf) {
                    Comment comment2 = commentNotice.getComment();
                    C89219l.m154716b(comment2, "");
                    User user = comment2.getUser();
                    C89219l.m154716b(user, "");
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    Comment comment3 = commentNotice.getComment();
                    C89219l.m154716b(comment3, "");
                    User user2 = comment3.getUser();
                    C89219l.m154716b(user2, "");
                    String secUid = user2.getSecUid();
                    C89219l.m154716b(secUid, "");
                    C62129p.C62130a.m112360a(uid, secUid, false, null, null, 56);
                } else if (valueOf.intValue() == R.id.cv7 || valueOf.intValue() == R.id.cu9) {
                    int commentType = commentNotice.getCommentType();
                    if (commentType == 7 || commentType == 8 || commentType == 9 || commentType == 10) {
                        Context context = view.getContext();
                        C89219l.m154716b(context, "");
                        String forwardId = commentNotice.getForwardId();
                        C89219l.m154716b(forwardId, "");
                        Comment comment4 = commentNotice.getComment();
                        C89219l.m154716b(comment4, "");
                        String cid = comment4.getCid();
                        C89219l.m154716b(cid, "");
                        Aweme aweme = commentNotice.getAweme();
                        if (aweme != null) {
                            i3 = aweme.getEnterpriseType();
                        }
                        C36125t a3 = C36125t.m73591a();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        C36125t.m73596a(a3, (Activity) context, C36131u.m73602a("aweme://aweme/detail/".concat(String.valueOf(forwardId))).mo63247a("profile_enterprise_type", i3).mo63248a("cid", cid).mo63248a("refer", "message").mo63248a("video_from", "from_launch_forward").mo63249a());
                        return;
                    }
                    if (this.f141031m) {
                        C62271n.m112656a(this.f141032n, getAdapterPosition());
                    }
                    Comment comment5 = commentNotice.getComment();
                    C89219l.m154716b(comment5, "");
                    int a4 = C76598h.m134176a(comment5.getUser());
                    if (a) {
                        if (commentNotice.getAweme() != null) {
                            Aweme aweme2 = commentNotice.getAweme();
                            C89219l.m154716b(aweme2, "");
                            if (aweme2.getAid() != null) {
                                Aweme aweme3 = commentNotice.getAweme();
                                C89219l.m154716b(aweme3, "");
                                String aid = aweme3.getAid();
                                C89219l.m154716b(aid, "");
                                Comment comment6 = commentNotice.getComment();
                                C89219l.m154716b(comment6, "");
                                m112348a(aid, comment6.getCid(), Integer.valueOf(a4));
                                return;
                            }
                        }
                        View view3 = this.itemView;
                        C89219l.m154716b(view3, "");
                        new C23144b(view3).mo37640e(R.string.g69).mo37637b();
                        return;
                    }
                    Aweme aweme4 = commentNotice.getAweme();
                    C89219l.m154716b(aweme4, "");
                    String aid2 = aweme4.getAid();
                    C89219l.m154716b(aid2, "");
                    Comment comment7 = commentNotice.getComment();
                    C89219l.m154716b(comment7, "");
                    C62129p.m112344a(this, aid2, comment7.getCid(), Integer.valueOf(a4), (List) null, 0, 24);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0120  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100159a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r13, java.lang.String r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62137r.mo100159a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice, java.lang.String, java.lang.String):void");
    }
}
