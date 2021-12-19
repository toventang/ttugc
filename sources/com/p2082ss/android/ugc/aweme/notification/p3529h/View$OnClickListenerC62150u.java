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
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.experiment.C46920f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p2082ss.android.ugc.aweme.notification.LikeListDetailActivity;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.notification.utils.C62268k;
import com.p2082ss.android.ugc.aweme.notification.utils.C62271n;
import com.p2082ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.u */
public final class View$OnClickListenerC62150u extends AbstractC62159w implements View.OnClickListener {

    /* renamed from: A */
    private final SmartRoundImageView f141091A;

    /* renamed from: B */
    private final FollowTuxTextView f141092B;

    /* renamed from: C */
    private final View f141093C;

    /* renamed from: D */
    private final MutualRelationView f141094D;

    /* renamed from: E */
    private final View f141095E;

    /* renamed from: F */
    private final TextView f141096F;

    /* renamed from: G */
    private final TuxIconView f141097G;

    /* renamed from: H */
    private DiggNotice f141098H;

    /* renamed from: I */
    private boolean f141099I = true;

    /* renamed from: J */
    private C51086a f141100J;

    /* renamed from: a */
    public BaseNotice f141101a;

    /* renamed from: b */
    public String f141102b;

    /* renamed from: c */
    public String f141103c;

    /* renamed from: d */
    private final View f141104d;

    /* renamed from: e */
    private final View f141105e;

    /* renamed from: f */
    private final AvatarImageWithVerify f141106f;

    /* renamed from: v */
    private final AvatarImageView f141107v;

    /* renamed from: w */
    private final AvatarImageView f141108w;

    /* renamed from: x */
    private final View f141109x;

    /* renamed from: y */
    private final TextView f141110y;

    /* renamed from: z */
    private final TextView f141111z;

    /* renamed from: com.ss.android.ugc.aweme.notification.h.u$a */
    public interface AbstractC62152a {

        /* renamed from: a */
        public static final C62153a f141113a = C62153a.f141120g;

        static {
            Covode.recordClassIndex(72906);
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.h.u$a$a */
        public static final class C62153a {

            /* renamed from: a */
            public static final int f141114a = 3;

            /* renamed from: b */
            public static int f141115b = 8;

            /* renamed from: c */
            static final int f141116c = 5;

            /* renamed from: d */
            public static final int f141117d = 6;

            /* renamed from: e */
            public static final int f141118e = 9;

            /* renamed from: f */
            public static final int f141119f = 10;

            /* renamed from: g */
            static final /* synthetic */ C62153a f141120g = new C62153a();

            /* renamed from: h */
            private static final int f141121h = 2;

            private C62153a() {
            }

            static {
                Covode.recordClassIndex(72907);
            }
        }
    }

    static {
        Covode.recordClassIndex(72904);
    }

    /* renamed from: h */
    private static boolean m112392h() {
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
        this.f140768h.mo100338a(this.f140984j, new C62154b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.u$b */
    static final class C62154b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62150u f141122a;

        static {
            Covode.recordClassIndex(72908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62154b(View$OnClickListenerC62150u uVar) {
            super(0);
            this.f141122a = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            View$OnClickListenerC62150u uVar = this.f141122a;
            uVar.mo100145a("show", "like", uVar.f140984j, this.f141122a.f141102b, this.f141122a.f141103c, (User) null);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w
    /* renamed from: c */
    public final User mo100067c() {
        List<User> users;
        DiggNotice diggNotice = this.f141098H;
        if (diggNotice == null || (users = diggNotice.getUsers()) == null || users.size() != 1) {
            return null;
        }
        return users.get(0);
    }

    /* renamed from: b */
    private static int m112391b(DiggNotice diggNotice) {
        if (diggNotice == null || diggNotice.getAweme() == null) {
            return 0;
        }
        Aweme aweme = diggNotice.getAweme();
        C89219l.m154716b(aweme, "");
        return aweme.getEnterpriseType();
    }

    /* renamed from: a */
    private final boolean m112390a(DiggNotice diggNotice) {
        Aweme aweme;
        String aid;
        String cid = diggNotice.getCid();
        if (!(cid == null || cid.length() == 0) || (aweme = diggNotice.getAweme()) == null || (aid = aweme.getAid()) == null || aid.length() == 0 || m112177b(diggNotice.getDiggType()) || !C46920f.m90222b()) {
            return false;
        }
        Aweme aweme2 = diggNotice.getAweme();
        C89219l.m154716b(aweme2, "");
        String aid2 = aweme2.getAid();
        C89219l.m154716b(aid2, "");
        List<User> users = diggNotice.getUsers();
        C89219l.m154716b(users, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) users, 10));
        for (T t : users) {
            C89219l.m154716b(t, "");
            arrayList.add(t.getUid());
        }
        C62129p.m112344a(this, aid2, (String) null, (Integer) null, arrayList, diggNotice.getMergeCount(), 4);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p
    /* renamed from: c */
    public final void mo100157c(int i) {
        int mergeCount;
        Integer valueOf;
        Integer valueOf2;
        Bundle bundle = new Bundle();
        BaseNotice baseNotice = this.f141101a;
        if (baseNotice != null) {
            bundle.putInt("from_where", baseNotice.type);
        }
        DiggNotice diggNotice = this.f141098H;
        UrlModel urlModel = null;
        if (diggNotice != null && (mergeCount = diggNotice.getMergeCount()) > 0) {
            User user = diggNotice.getUsers().get(0);
            C89219l.m154716b(user, "");
            bundle.putString("username", C62266j.m112643a(user));
            User user2 = diggNotice.getUsers().get(0);
            C89219l.m154716b(user2, "");
            urlModel = user2.getAvatarThumb();
            if (mergeCount >= 2) {
                if (diggNotice.getDiggType() == 1 && (valueOf2 = Integer.valueOf((int) R.string.djj)) != null) {
                    valueOf2.intValue();
                    Context context = this.f140983i;
                    C89219l.m154716b(context, "");
                    String string = context.getResources().getString(valueOf2.intValue(), Integer.valueOf(mergeCount - 1));
                    C89219l.m154716b(string, "");
                    bundle.putString("content", string);
                } else {
                    return;
                }
            } else if (diggNotice.getDiggType() == 1 && (valueOf = Integer.valueOf((int) R.string.dj7)) != null) {
                valueOf.intValue();
                Context context2 = this.f140983i;
                C89219l.m154716b(context2, "");
                String string2 = context2.getResources().getString(valueOf.intValue());
                C89219l.m154716b(string2, "");
                bundle.putString("content", string2);
            } else {
                return;
            }
        }
        bundle.putSerializable("avatar_thumb", urlModel);
        this.f141032n = bundle;
        this.f141031m = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62150u(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f141104d = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        this.f141105e = findViewById2;
        View findViewById3 = view.findViewById(R.id.cuh);
        C89219l.m154716b(findViewById3, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById3;
        this.f141106f = avatarImageWithVerify;
        View findViewById4 = view.findViewById(R.id.cuj);
        C89219l.m154716b(findViewById4, "");
        this.f141107v = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cuk);
        C89219l.m154716b(findViewById5, "");
        this.f141108w = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.di3);
        C89219l.m154716b(findViewById6, "");
        this.f141109x = findViewById6;
        View findViewById7 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById7, "");
        this.f141110y = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById8, "");
        this.f141111z = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById9, "");
        SmartRoundImageView smartRoundImageView = (SmartRoundImageView) findViewById9;
        this.f141091A = smartRoundImageView;
        View findViewById10 = view.findViewById(R.id.cuy);
        C89219l.m154716b(findViewById10, "");
        FollowTuxTextView followTuxTextView = (FollowTuxTextView) findViewById10;
        this.f141092B = followTuxTextView;
        View findViewById11 = view.findViewById(R.id.cuz);
        C89219l.m154716b(findViewById11, "");
        this.f141093C = findViewById11;
        View findViewById12 = view.findViewById(R.id.cp5);
        C89219l.m154716b(findViewById12, "");
        this.f141094D = (MutualRelationView) findViewById12;
        View findViewById13 = view.findViewById(R.id.cv3);
        C89219l.m154716b(findViewById13, "");
        this.f141095E = findViewById13;
        View findViewById14 = view.findViewById(R.id.cv4);
        C89219l.m154716b(findViewById14, "");
        this.f141096F = (TextView) findViewById14;
        View findViewById15 = view.findViewById(R.id.cur);
        C89219l.m154716b(findViewById15, "");
        this.f141097G = (TuxIconView) findViewById15;
        C62266j.m112647b(findViewById);
        C62023a.m112168a(findViewById2);
        C62023a.m112168a(smartRoundImageView);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        followTuxTextView.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(C80397em.m139369a(101));
        smartRoundImageView.setOnClickListener(this);
        this.f141100J = new C51086a(followTuxTextView, new C51086a.C51094g(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62150u.C621511 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC62150u f141112a;

            static {
                Covode.recordClassIndex(72905);
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f141112a = r1;
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
                    java.lang.String r1 = "like"
                    java.lang.String r0 = "inbox_interaction_message"
                    com.p2082ss.android.ugc.aweme.notification.utils.C62259e.m112621a(r2, r1, r0, r5)
                    r0 = 0
                    com.p2082ss.android.ugc.aweme.notification.utils.C62259e.m112617a(r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62150u.C621511.mo63346a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
        ((C24246a) smartRoundImageView.getHierarchy()).mo39966c(R.color.f);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        boolean z;
        Integer num;
        int diggType;
        long j;
        User user;
        String uid;
        List<User> users;
        User user2;
        String secUid;
        int diggType2;
        long j2;
        User user3;
        String uid2;
        List<User> users2;
        User user4;
        String secUid2;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m112392h();
            }
            if (!C58029j.f132256h) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
                return;
            }
            DiggNotice diggNotice = this.f141098H;
            if (diggNotice != null) {
                mo100145a("click", "like", this.f141101a, this.f141102b, this.f141103c, (User) null);
                IUgCommonService j3 = UgCommonServiceImpl.m138290j();
                BaseNotice baseNotice = this.f141101a;
                if (baseNotice == null || baseNotice.timeLineType != 0) {
                    z = false;
                } else {
                    z = true;
                }
                j3.mo123099a(z);
                if (this.f141031m) {
                    C62271n.m112656a(this.f141032n, getAdapterPosition());
                }
                String str = null;
                if (view != null) {
                    num = Integer.valueOf(view.getId());
                } else {
                    num = null;
                }
                if (num != null) {
                    if (num.intValue() == R.id.cu9) {
                        if (diggNotice.getUsers().size() > 1) {
                            C62271n.m112656a((Bundle) null, 0);
                        }
                        if (m112390a(diggNotice)) {
                            return;
                        }
                        if (diggNotice.getDiggType() == AbstractC62152a.C62153a.f141116c || diggNotice.getDiggType() == AbstractC62152a.C62153a.f141117d) {
                            C62268k.m112650a(this.f140983i, diggNotice.getForwardId(), "message", diggNotice.getCid(), m112391b(diggNotice));
                        } else if (diggNotice.getDiggType() == AbstractC62152a.C62153a.f141119f || diggNotice.getDiggType() == AbstractC62152a.C62153a.f141118e) {
                            if (diggNotice.getAweme() != null) {
                                Aweme aweme = diggNotice.getAweme();
                                C89219l.m154716b(aweme, "");
                                String aid = aweme.getAid();
                                C89219l.m154716b(aid, "");
                                DiggNotice diggNotice2 = this.f141098H;
                                if (diggNotice2 != null) {
                                    str = diggNotice2.getCid();
                                }
                                C62129p.m112347a(aid, str);
                                return;
                            }
                            Context context = this.f140983i;
                            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                            new C23144b((Activity) context).mo37640e(R.string.g69).mo37637b();
                        } else if (diggNotice.getAweme() != null) {
                            Aweme aweme2 = diggNotice.getAweme();
                            C89219l.m154716b(aweme2, "");
                            String aid2 = aweme2.getAid();
                            C89219l.m154716b(aid2, "");
                            DiggNotice diggNotice3 = this.f141098H;
                            if (diggNotice3 != null) {
                                str = diggNotice3.getCid();
                            }
                            C62129p.m112344a(this, aid2, str, (Integer) null, (List) null, 0, 28);
                        }
                    } else if (num.intValue() == R.id.cuh) {
                        C62271n.m112656a((Bundle) null, 0);
                        List<User> users3 = diggNotice.getUsers();
                        if (users3 != null && (user3 = (User) C89070n.m154583g((List) users3)) != null && (uid2 = user3.getUid()) != null && (users2 = diggNotice.getUsers()) != null && (user4 = (User) C89070n.m154583g((List) users2)) != null && (secUid2 = user4.getSecUid()) != null) {
                            C62129p.C62130a.m112360a(uid2, secUid2, false, null, null, 56);
                        }
                    } else if (num.intValue() == R.id.cuf) {
                        if (diggNotice.getDiggType() != 0) {
                            int diggType3 = diggNotice.getDiggType();
                            if (diggType3 == AbstractC62152a.C62153a.f141118e) {
                                diggType2 = 1;
                            } else if (diggType3 == AbstractC62152a.C62153a.f141119f) {
                                diggType2 = 3;
                            } else {
                                diggType2 = diggNotice.getDiggType();
                            }
                            if (!m112390a(diggNotice)) {
                                Context context2 = view.getContext();
                                C89219l.m154716b(context2, "");
                                BaseNotice baseNotice2 = this.f141101a;
                                if (baseNotice2 != null) {
                                    str = baseNotice2.nid;
                                }
                                Aweme aweme3 = diggNotice.getAweme();
                                Comment comment = diggNotice.getComment();
                                BaseNotice baseNotice3 = this.f141101a;
                                if (baseNotice3 != null) {
                                    j2 = baseNotice3.lastReadTime;
                                } else {
                                    j2 = 0;
                                }
                                m112389a(context2, str, aweme3, comment, diggType2, j2);
                                return;
                            }
                            return;
                        }
                        C62271n.m112656a((Bundle) null, 0);
                        List<User> users4 = diggNotice.getUsers();
                        if (users4 != null && (user = (User) C89070n.m154583g((List) users4)) != null && (uid = user.getUid()) != null && (users = diggNotice.getUsers()) != null && (user2 = (User) C89070n.m154583g((List) users)) != null && (secUid = user2.getSecUid()) != null) {
                            C62129p.C62130a.m112360a(uid, secUid, false, null, null, 56);
                        }
                    } else if (num.intValue() != R.id.cv7) {
                    } else {
                        if (diggNotice.getDiggType() == AbstractC62152a.C62153a.f141116c || diggNotice.getDiggType() == AbstractC62152a.C62153a.f141117d) {
                            C62268k.m112650a(this.f140983i, diggNotice.getForwardId(), "message", diggNotice.getCid(), m112391b(diggNotice));
                        } else if (diggNotice.getUsers().size() > 1 && diggNotice.getDiggType() != 0) {
                            int diggType4 = diggNotice.getDiggType();
                            if (diggType4 == AbstractC62152a.C62153a.f141118e) {
                                diggType = 1;
                            } else if (diggType4 == AbstractC62152a.C62153a.f141119f) {
                                diggType = 3;
                            } else {
                                diggType = diggNotice.getDiggType();
                            }
                            if (!m112390a(diggNotice)) {
                                Context context3 = view.getContext();
                                C89219l.m154716b(context3, "");
                                BaseNotice baseNotice4 = this.f141101a;
                                if (baseNotice4 != null) {
                                    str = baseNotice4.nid;
                                }
                                Aweme aweme4 = diggNotice.getAweme();
                                Comment comment2 = diggNotice.getComment();
                                BaseNotice baseNotice5 = this.f141101a;
                                if (baseNotice5 != null) {
                                    j = baseNotice5.lastReadTime;
                                } else {
                                    j = 0;
                                }
                                m112389a(context3, str, aweme4, comment2, diggType, j);
                            }
                        } else if (diggNotice.getDiggType() == AbstractC62152a.C62153a.f141118e || diggNotice.getDiggType() == AbstractC62152a.C62153a.f141119f) {
                            if (diggNotice.getAweme() != null) {
                                Aweme aweme5 = diggNotice.getAweme();
                                C89219l.m154716b(aweme5, "");
                                String aid3 = aweme5.getAid();
                                C89219l.m154716b(aid3, "");
                                C62129p.m112347a(aid3, diggNotice.getCid());
                                return;
                            }
                            Context context4 = this.f140983i;
                            Objects.requireNonNull(context4, "null cannot be cast to non-null type android.app.Activity");
                            new C23144b((Activity) context4).mo37640e(R.string.g69).mo37637b();
                        } else if (diggNotice.getAweme() != null && !m112390a(diggNotice)) {
                            Aweme aweme6 = diggNotice.getAweme();
                            C89219l.m154716b(aweme6, "");
                            String aid4 = aweme6.getAid();
                            C89219l.m154716b(aid4, "");
                            C62129p.m112344a(this, aid4, diggNotice.getCid(), (Integer) null, (List) null, 0, 28);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100162a(BaseNotice baseNotice, boolean z, String str, String str2) {
        int size;
        Video video;
        UrlModel originCover;
        List<String> urlList;
        int i;
        String a;
        int i2;
        C51086a aVar;
        C89219l.m154721d(baseNotice, "");
        C89219l.m154721d(str2, "");
        if (baseNotice.diggNotice != null) {
            this.f141101a = baseNotice;
            this.f141102b = str;
            this.f141103c = str2;
            this.f141099I = z;
            DiggNotice diggNotice = baseNotice.diggNotice;
            this.f141098H = diggNotice;
            if (diggNotice != null && (size = diggNotice.getUsers().size()) > 0) {
                mo100154a(this.f141110y, diggNotice.getUsers(), 1, diggNotice.getMergeCount(), this.f141101a, z, str, str2);
                List<User> users = diggNotice.getUsers();
                C89219l.m154716b(users, "");
                User user = (User) C89070n.m154583g((List) users);
                if (!(user == null || (aVar = this.f141100J) == null)) {
                    aVar.mo86508a(user);
                }
                m112346a(this.f141094D, diggNotice.getUsers(), this.f141091A, this.f141104d);
                m112345a(this.f141092B, "like", diggNotice.getUsers(), this.f141093C);
                if (size == 1) {
                    this.f141106f.setVisibility(0);
                    this.f141107v.setVisibility(8);
                    this.f141108w.setVisibility(8);
                    this.f141106f.setUserData(new UserVerify(diggNotice.getUsers().get(0).getAvatarThumb(), diggNotice.getUsers().get(0).getCustomVerify(), diggNotice.getUsers().get(0).getEnterpriseVerifyReason(), Integer.valueOf(diggNotice.getUsers().get(0).getVerificationType())));
                    this.f141105e.setVisibility(8);
                    this.f141106f.mo61285a();
                } else {
                    this.f141105e.setVisibility(0);
                    this.f141106f.setVisibility(8);
                    this.f141107v.setVisibility(0);
                    this.f141108w.setVisibility(0);
                    AvatarImageView avatarImageView = this.f141107v;
                    User user2 = diggNotice.getUsers().get(0);
                    C89219l.m154716b(user2, "");
                    C34577e.m70592a(avatarImageView, user2.getAvatarThumb());
                    AvatarImageView avatarImageView2 = this.f141108w;
                    User user3 = diggNotice.getUsers().get(1);
                    C89219l.m154716b(user3, "");
                    C34577e.m70592a(avatarImageView2, user3.getAvatarThumb());
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int diggType = diggNotice.getDiggType();
                if (diggType == AbstractC62152a.C62153a.f141114a || diggType == AbstractC62152a.C62153a.f141117d || diggType == AbstractC62152a.C62153a.f141115b || diggType == AbstractC62152a.C62153a.f141119f) {
                    Context context = this.f140983i;
                    if (diggNotice.getDiggType() == AbstractC62152a.C62153a.f141115b) {
                        i = R.string.cl;
                    } else {
                        i = R.string.dj6;
                    }
                    spannableStringBuilder.append((CharSequence) context.getString(i));
                    Comment comment = diggNotice.getComment();
                    if (comment != null) {
                        NoticeCommentHelperService a2 = NoticeCommentHelperServiceImpl.m75149a();
                        if (comment.getUser() != null) {
                            StringBuilder sb = new StringBuilder();
                            User user4 = comment.getUser();
                            C89219l.m154716b(user4, "");
                            a = sb.append(C62266j.m112643a(user4)).append(": ").append(a2.mo64747a(comment)).toString();
                        } else {
                            a = a2.mo64747a(comment);
                        }
                        if (!TextUtils.isEmpty(a)) {
                            this.f141095E.setVisibility(0);
                            this.f141096F.setText(a);
                            C46579b.m89899a(this.f141096F);
                        } else {
                            this.f141095E.setVisibility(8);
                        }
                    }
                } else {
                    Context context2 = this.f140983i;
                    if (diggNotice.getDiggType() == AbstractC62152a.C62153a.f141118e) {
                        i2 = R.string.di3;
                    } else {
                        i2 = R.string.dj7;
                    }
                    spannableStringBuilder.append((CharSequence) context2.getString(i2));
                    this.f141095E.setVisibility(8);
                }
                mo100141a(spannableStringBuilder, baseNotice);
                this.f141111z.setText(spannableStringBuilder);
                Aweme aweme = diggNotice.getAweme();
                if (aweme != null && (video = aweme.getVideo()) != null && (originCover = video.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null && !urlList.isEmpty()) {
                    this.f141091A.setVisibility(0);
                    C20766v a3 = C20761r.m39060a(C34735v.m70965a(video.getOriginCover())).mo34185b(C80397em.m139369a(500)).mo34179a("Notice");
                    a3.f49092E = this.f141091A;
                    a3.mo34186c();
                } else if (diggNotice.getDiggType() == AbstractC62152a.C62153a.f141115b) {
                    this.f141091A.setVisibility(8);
                } else {
                    this.f141091A.setVisibility(0);
                    this.f141091A.setImageDrawable(C0643b.m2369a(this.f140983i, (int) R.color.f));
                }
                if (diggNotice.getDiggType() == AbstractC62152a.C62153a.f141118e || diggNotice.getDiggType() == AbstractC62152a.C62153a.f141119f) {
                    if (diggNotice.getAweme() != null) {
                        Aweme aweme2 = diggNotice.getAweme();
                        C89219l.m154716b(aweme2, "");
                        if (aweme2.getVideo() != null) {
                            this.f141097G.setVisibility(8);
                        }
                    }
                    this.f141097G.setVisibility(0);
                }
            }
            AbstractC62159w.m112404a(this);
        }
    }

    /* renamed from: a */
    private final void m112389a(Context context, String str, Aweme aweme, Comment comment, int i, long j) {
        String str2;
        String str3;
        Video video;
        UrlModel urlModel = null;
        if (i == AbstractC62152a.C62153a.f141114a) {
            if (comment != null) {
                str2 = comment.getCid();
            }
            str2 = null;
        } else {
            if (aweme != null) {
                str2 = aweme.getAid();
            }
            str2 = null;
        }
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        boolean z = this.f141099I;
        String a = C62102g.m112296a(comment);
        if (!(aweme == null || (video = aweme.getVideo()) == null)) {
            urlModel = video.getOriginCover();
        }
        LikeListDetailActivity.C61640a.m111668a(context, str, str3, str2, z, i, j, a, urlModel, this.f141102b);
    }
}
