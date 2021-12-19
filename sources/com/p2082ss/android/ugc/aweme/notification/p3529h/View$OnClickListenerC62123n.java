package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.n */
public final class View$OnClickListenerC62123n extends AbstractC62159w implements View.OnClickListener {

    /* renamed from: A */
    private final MutualRelationView f140999A;

    /* renamed from: B */
    private C51086a f141000B;

    /* renamed from: a */
    public CommentNotice f141001a;

    /* renamed from: b */
    public BaseNotice f141002b;

    /* renamed from: c */
    public String f141003c;

    /* renamed from: d */
    public String f141004d;

    /* renamed from: e */
    private final View f141005e;

    /* renamed from: f */
    private final AvatarImageWithVerify f141006f;

    /* renamed from: v */
    private final TextView f141007v;

    /* renamed from: w */
    private final TextView f141008w;

    /* renamed from: x */
    private final SmartRoundImageView f141009x;

    /* renamed from: y */
    private final FollowTuxTextView f141010y;

    /* renamed from: z */
    private final View f141011z;

    static {
        Covode.recordClassIndex(72877);
    }

    /* renamed from: j */
    private static boolean m112327j() {
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
        this.f140768h.mo100338a(this.f140984j, new C62125a(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w
    /* renamed from: c */
    public final User mo100067c() {
        Comment comment;
        CommentNotice commentNotice = this.f141001a;
        if (commentNotice == null || (comment = commentNotice.getComment()) == null) {
            return null;
        }
        return comment.getUser();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.n$a */
    static final class C62125a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62123n f141013a;

        static {
            Covode.recordClassIndex(72879);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62125a(View$OnClickListenerC62123n nVar) {
            super(0);
            this.f141013a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            User user;
            Comment comment;
            View$OnClickListenerC62123n nVar = this.f141013a;
            String h = nVar.mo100149h();
            int i = this.f141013a.f140984j.clientOrder;
            BaseNotice baseNotice = this.f141013a.f140984j;
            String a = View$OnClickListenerC62123n.m112170a(this.f141013a.f140984j.commentNotice);
            String str = this.f141013a.f141004d;
            String str2 = this.f141013a.f141003c;
            CommentNotice commentNotice = this.f141013a.f141001a;
            if (commentNotice == null || (comment = commentNotice.getComment()) == null) {
                user = null;
            } else {
                user = comment.getUser();
            }
            nVar.mo100080a("show", h, i, baseNotice, a, str, str2, user);
            return C89391z.f203057a;
        }
    }

    /* renamed from: h */
    public final String mo100149h() {
        Integer valueOf;
        CommentNotice commentNotice = this.f141001a;
        if (commentNotice == null || (valueOf = Integer.valueOf(commentNotice.getCommentType())) == null) {
            return "";
        }
        if (valueOf.intValue() == 17) {
            return "video_reply_comment";
        }
        if (valueOf.intValue() == 18) {
            return "video_reply_reply";
        }
        if (valueOf.intValue() == 19) {
            return "video_reply_like";
        }
        return "";
    }

    /* renamed from: i */
    private final String m112326i() {
        Integer num;
        CommentNotice commentNotice = this.f141001a;
        if (commentNotice != null) {
            num = Integer.valueOf(commentNotice.getCommentType());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 17) {
                Context context = this.f140983i;
                C89219l.m154716b(context, "");
                String string = context.getResources().getString(R.string.djq);
                C89219l.m154716b(string, "");
                return string;
            } else if (num.intValue() == 18) {
                Context context2 = this.f140983i;
                C89219l.m154716b(context2, "");
                String string2 = context2.getResources().getString(R.string.djp);
                C89219l.m154716b(string2, "");
                return string2;
            } else if (num.intValue() == 19) {
                Context context3 = this.f140983i;
                C89219l.m154716b(context3, "");
                String string3 = context3.getResources().getString(R.string.djo);
                C89219l.m154716b(string3, "");
                return string3;
            }
        }
        return "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62123n(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f141005e = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f141006f = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById3, "");
        this.f141007v = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById4, "");
        this.f141008w = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById5, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById5;
        this.f141009x = smartRoundImageView;
        View findViewById6 = view.findViewById(R.id.cuy);
        C89219l.m154716b(findViewById6, "");
        FollowTuxTextView followTuxTextView = (FollowTuxTextView) findViewById6;
        this.f141010y = followTuxTextView;
        View findViewById7 = view.findViewById(R.id.cuz);
        C89219l.m154716b(findViewById7, "");
        this.f141011z = findViewById7;
        View findViewById8 = view.findViewById(R.id.cp5);
        C89219l.m154716b(findViewById8, "");
        this.f140999A = (MutualRelationView) findViewById8;
        C62266j.m112647b(findViewById);
        C62023a.m112168a(avatarImageWithVerify);
        C62023a.m112168a(smartRoundImageView);
        smartRoundImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(C80397em.m139369a(101));
        ((C24246a) smartRoundImageView.getHierarchy()).mo39966c(R.color.f);
        followTuxTextView.setOnClickListener(this);
        this.f141000B = new C51086a(followTuxTextView, new C51086a.C51094g(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62123n.C621241 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC62123n f141012a;

            static {
                Covode.recordClassIndex(72878);
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f141012a = r1;
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
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62123n.C621241.mo63346a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        int i;
        Integer valueOf;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112327j();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        CommentNotice commentNotice = this.f141001a;
        if (commentNotice != null) {
            String h = mo100149h();
            BaseNotice baseNotice = this.f141002b;
            if (baseNotice != null) {
                i = baseNotice.clientOrder;
            } else {
                i = -1;
            }
            BaseNotice baseNotice2 = this.f141002b;
            CommentNotice commentNotice2 = null;
            if (baseNotice2 != null) {
                commentNotice2 = baseNotice2.commentNotice;
            }
            String a = m112170a(commentNotice2);
            String str = this.f141004d;
            String str2 = this.f141003c;
            Comment comment = commentNotice.getComment();
            C89219l.m154716b(comment, "");
            mo100080a("click", h, i, baseNotice2, a, str, str2, comment.getUser());
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
                    Comment comment4 = commentNotice.getComment();
                    C89219l.m154716b(comment4, "");
                    Aweme aliasAweme = comment4.getAliasAweme();
                    C89219l.m154716b(aliasAweme, "");
                    String aid = aliasAweme.getAid();
                    C89219l.m154716b(aid, "");
                    C62129p.m112344a(this, aid, "", (Integer) null, (List) null, 0, 28);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100148a(BaseNotice baseNotice, String str, String str2) {
        Aweme aliasAweme;
        Video video;
        UrlModel originCover;
        List<String> urlList;
        C51086a aVar;
        C89219l.m154721d(baseNotice, "");
        C89219l.m154721d(str2, "");
        if (baseNotice.commentNotice != null) {
            CommentNotice commentNotice = baseNotice.commentNotice;
            C89219l.m154716b(commentNotice, "");
            if (commentNotice.isReplyWithVideo()) {
                CommentNotice commentNotice2 = baseNotice.commentNotice;
                C89219l.m154716b(commentNotice2, "");
                if (commentNotice2.getComment() != null) {
                    CommentNotice commentNotice3 = baseNotice.commentNotice;
                    C89219l.m154716b(commentNotice3, "");
                    Comment comment = commentNotice3.getComment();
                    C89219l.m154716b(comment, "");
                    if (comment.getAliasAweme() != null) {
                        this.f141003c = str;
                        this.f141002b = baseNotice;
                        this.f141004d = str2;
                        CommentNotice commentNotice4 = baseNotice.commentNotice;
                        this.f141001a = commentNotice4;
                        if (commentNotice4 != null) {
                            Comment comment2 = commentNotice4.getComment();
                            C89219l.m154716b(comment2, "");
                            User user = comment2.getUser();
                            C89219l.m154716b(user, "");
                            this.f141006f.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
                            this.f141006f.mo61285a();
                            Comment comment3 = commentNotice4.getComment();
                            C89219l.m154716b(comment3, "");
                            User user2 = comment3.getUser();
                            if (!(user2 == null || (aVar = this.f141000B) == null)) {
                                aVar.mo86508a(user2);
                            }
                            MutualRelationView mutualRelationView = this.f140999A;
                            Comment comment4 = commentNotice4.getComment();
                            C89219l.m154716b(comment4, "");
                            m112346a(mutualRelationView, Collections.singletonList(comment4.getUser()), (View) null, this.f141005e);
                            FollowTuxTextView followTuxTextView = this.f141010y;
                            String h = mo100149h();
                            Comment comment5 = commentNotice4.getComment();
                            C89219l.m154716b(comment5, "");
                            m112345a(followTuxTextView, h, Collections.singletonList(comment5.getUser()), this.f141011z);
                            mo100153a(this.f141007v, user, this.f141002b, str, str2);
                            Comment comment6 = commentNotice4.getComment();
                            if (comment6 == null || (aliasAweme = comment6.getAliasAweme()) == null || (video = aliasAweme.getVideo()) == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || urlList.isEmpty()) {
                                this.f141009x.setImageDrawable(C0643b.m2369a(this.f140983i, (int) R.color.f));
                            } else {
                                Comment comment7 = commentNotice4.getComment();
                                C89219l.m154716b(comment7, "");
                                Aweme aliasAweme2 = comment7.getAliasAweme();
                                C89219l.m154716b(aliasAweme2, "");
                                Video video2 = aliasAweme2.getVideo();
                                C89219l.m154716b(video2, "");
                                C20766v a = C20761r.m39060a(C34735v.m70965a(video2.getOriginCover())).mo34185b(C80397em.m139369a(500)).mo34179a("Notice");
                                a.f49092E = this.f141009x;
                                a.mo34186c();
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m112326i());
                            mo100141a(spannableStringBuilder, baseNotice);
                            this.f141008w.setText(spannableStringBuilder);
                        }
                        mo100165a((AbstractC62159w) true);
                    }
                }
            }
        }
    }
}
