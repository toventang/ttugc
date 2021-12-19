package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.utils.C62264h;
import com.p2082ss.android.ugc.aweme.notification.utils.C62265i;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.notification.utils.C62271n;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3258h.AbstractC56229a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.t */
public final class View$OnClickListenerC62143t extends AbstractC62159w implements View.OnClickListener {

    /* renamed from: a */
    public boolean f141073a;

    /* renamed from: b */
    public final NotificationFollowUserBtn f141074b;

    /* renamed from: c */
    public FollowNotice f141075c;

    /* renamed from: d */
    public BaseNotice f141076d;

    /* renamed from: e */
    public String f141077e;

    /* renamed from: f */
    public String f141078f;

    /* renamed from: v */
    private final View f141079v;

    /* renamed from: w */
    private final AvatarImageWithVerify f141080w;

    /* renamed from: x */
    private final TextView f141081x;

    /* renamed from: y */
    private final TextView f141082y;

    /* renamed from: z */
    private C51086a f141083z;

    static {
        Covode.recordClassIndex(72897);
    }

    /* renamed from: h */
    private static boolean m112377h() {
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
        FollowNotice followNotice = this.f141075c;
        if (followNotice != null) {
            return followNotice.getUser();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    /* renamed from: f */
    public final void mo100100f() {
        super.mo100146g();
        this.f140768h.mo100338a(this.f140984j, new C62149b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.t$b */
    static final class C62149b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62143t f141090a;

        static {
            Covode.recordClassIndex(72903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62149b(View$OnClickListenerC62143t tVar) {
            super(0);
            this.f141090a = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            User user;
            View$OnClickListenerC62143t tVar = this.f141090a;
            BaseNotice baseNotice = tVar.f140984j;
            String str = this.f141090a.f141077e;
            String str2 = this.f141090a.f141078f;
            FollowNotice followNotice = this.f141090a.f141075c;
            if (followNotice != null) {
                user = followNotice.getUser();
            } else {
                user = null;
            }
            tVar.mo100145a("show", "fans", baseNotice, str, str2, user);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.t$a */
    public static final class C62148a implements C51086a.AbstractC51092e {

        /* renamed from: a */
        final /* synthetic */ BaseNotice f141089a;

        static {
            Covode.recordClassIndex(72902);
        }

        C62148a(BaseNotice baseNotice) {
            this.f141089a = baseNotice;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            C89219l.m154716b(followStatus, "");
            if (followStatus.followStatus == 0) {
                C33744d a = new C33744d().mo59983a("enter_from", "notification_page");
                FollowNotice followNotice = this.f141089a.followNotice;
                C89219l.m154716b(followNotice, "");
                User user = followNotice.getUser();
                C89219l.m154716b(user, "");
                C39162r.m79460a("follow_cancel_finish", a.mo59983a("to_user_id", user.getUid()).f79943a);
                return;
            }
            C33744d a2 = new C33744d().mo59983a("enter_from", "notification_page");
            FollowNotice followNotice2 = this.f141089a.followNotice;
            C89219l.m154716b(followNotice2, "");
            User user2 = followNotice2.getUser();
            C89219l.m154716b(user2, "");
            C39162r.m79460a("follow_finish", a2.mo59983a("to_user_id", user2.getUid()).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p
    /* renamed from: c */
    public final void mo100157c(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("from_where", i);
        bundle.putString("username", this.f141081x.getText().toString());
        FollowNotice followNotice = this.f141075c;
        if (followNotice != null) {
            User user = followNotice.getUser();
            C89219l.m154716b(user, "");
            UrlModel avatarThumb = user.getAvatarThumb();
            bundle.putString("content", this.f140983i.getString(R.string.diu));
            bundle.putSerializable("avatar_thumb", avatarThumb);
        }
        this.f141032n = bundle;
        this.f141031m = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62143t(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f141079v = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f141080w = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById3, "");
        TextView textView = (TextView) findViewById3;
        this.f141081x = textView;
        View findViewById4 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById4, "");
        this.f141082y = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cu6);
        C89219l.m154716b(findViewById5, "");
        NotificationFollowUserBtn notificationFollowUserBtn = (NotificationFollowUserBtn) findViewById5;
        this.f141074b = notificationFollowUserBtn;
        notificationFollowUserBtn.getLayoutParams().width = C62262g.m112633a(this.f140983i);
        C62266j.m112647b(findViewById);
        C62023a.m112168a(avatarImageWithVerify);
        C62023a.m112168a(notificationFollowUserBtn);
        notificationFollowUserBtn.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        textView.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(C80397em.m139369a(101));
        C51086a aVar = new C51086a(notificationFollowUserBtn, new C51086a.C51094g(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62143t.C621441 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC62143t f141084a;

            static {
                Covode.recordClassIndex(72898);
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f141084a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            /* renamed from: a */
            public final void mo63346a(int i, User user) {
                String str;
                Intent intent;
                String str2;
                super.mo63346a(i, user);
                AbstractC81915c.m141874a(new C35503c(i, user));
                if (user != null) {
                    int i2 = 0;
                    if (i == 0) {
                        str = "follow_cancel";
                    } else {
                        Context context = this.f141084a.f140983i;
                        C89219l.m154716b(context, "");
                        FollowNotice followNotice = this.f141084a.f141075c;
                        C89219l.m154721d(context, "");
                        if ((context instanceof Activity) && followNotice != null && (intent = ((Activity) context).getIntent()) != null && intent.getBooleanExtra("from_notification", false)) {
                            String a = C62266j.m112642a(intent, "rule_id");
                            if (a == null) {
                                a = "";
                            }
                            C89219l.m154716b(a, "");
                            if (!TextUtils.isEmpty(a)) {
                                LogHelper a2 = LogHelperImpl.m77303a();
                                User user2 = followNotice.getUser();
                                C89219l.m154716b(user2, "");
                                String uid = user2.getUid();
                                C89219l.m154716b(uid, "");
                                a2.mo66434a("follow_from_push", "message", uid, "previous_page", "other_places", a);
                            }
                        }
                        str = "follow";
                    }
                    if (user.getFollowerStatus() == 1) {
                        str2 = "mutual";
                    } else {
                        str2 = "single";
                    }
                    C39162r.onEvent(new MobClick().setEventName(str).setLabelName("message").setValue(user.getUid()));
                    if (C89219l.m154714a((Object) str, (Object) "follow")) {
                        LogHelper a3 = LogHelperImpl.m77303a();
                        String uid2 = user.getUid();
                        C89219l.m154716b(uid2, "");
                        a3.mo66435a("notification_page", "", "other_places", "follow_button", uid2, str2, user.isSecret() ? 1 : 0);
                        return;
                    }
                    C33744d a4 = new C33744d().mo59983a("enter_from", "message").mo59983a("to_user_id", user.getUid()).mo59983a("scene_id", "1002").mo59983a("previous_page", "message").mo59983a("enter_method", "follow_button").mo59983a("previous_page_position", "other_places").mo59983a("request_id", user.getRequestId()).mo59983a("author_id", user.getUid()).mo59980a("is_private", user.isSecret() ? 1 : 0);
                    if (user.getFollowStatus() != 4) {
                        i2 = 1;
                    }
                    C39162r.m79460a("follow_cancel", a4.mo59980a("cancel_type", i2).f79943a);
                }
            }
        });
        this.f141083z = aVar;
        aVar.f117879e = new C51086a.AbstractC51090c(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62143t.C621452 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC62143t f141085a;

            static {
                Covode.recordClassIndex(72899);
            }

            {
                this.f141085a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
            /* renamed from: a */
            public final boolean mo63341a(int i) {
                User user;
                Context context = this.f141085a.f140983i;
                FollowNotice followNotice = this.f141085a.f141075c;
                if (followNotice != null) {
                    user = followNotice.getUser();
                } else {
                    user = null;
                }
                return C62264h.m112640a(context, user, null, null, null, NotificationFollowUserBtn.m95704b(), 28);
            }
        };
        C51086a aVar2 = this.f141083z;
        if (aVar2 != null) {
            aVar2.f117878d = new C51086a.AbstractC51091d(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62143t.C621463 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC62143t f141086a;

                static {
                    Covode.recordClassIndex(72900);
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
                /* renamed from: b */
                public final void mo63344b() {
                    this.f141086a.f141073a = false;
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
                /* renamed from: a */
                public final void mo63342a() {
                    User user;
                    this.f141086a.f141073a = true;
                    View$OnClickListenerC62143t tVar = this.f141086a;
                    int layoutPosition = tVar.getLayoutPosition();
                    FollowNotice followNotice = this.f141086a.f141075c;
                    if (followNotice != null) {
                        user = followNotice.getUser();
                    } else {
                        user = null;
                    }
                    tVar.mo100144a("fans", layoutPosition, C62265i.m112641a(null, user));
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f141086a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.notification.h.t$3$a */
                public static final class C62147a implements AbstractC56229a {

                    /* renamed from: a */
                    final /* synthetic */ IIMService f141087a;

                    /* renamed from: b */
                    final /* synthetic */ C621463 f141088b;

                    static {
                        Covode.recordClassIndex(72901);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3258h.AbstractC56229a
                    /* renamed from: a */
                    public final void mo93049a(int i) {
                        if (i != 3) {
                            IIMService iIMService = this.f141087a;
                            Context context = this.f141088b.f141086a.f140983i;
                            C89219l.m154716b(context, "");
                            iIMService.openSessionListActivity(context);
                        }
                    }

                    C62147a(IIMService iIMService, C621463 r2) {
                        this.f141087a = iIMService;
                        this.f141088b = r2;
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
                /* renamed from: a */
                public final void mo63343a(FollowStatus followStatus) {
                    User user;
                    AbstractC0952i supportFragmentManager;
                    C51648a aVar = C51648a.f118980a;
                    FollowNotice followNotice = this.f141086a.f141075c;
                    ActivityC0945e eVar = null;
                    if (followNotice != null) {
                        user = followNotice.getUser();
                    } else {
                        user = null;
                    }
                    if (aVar.mo87310a(user)) {
                        C51648a aVar2 = C51648a.f118980a;
                        Context context = this.f141086a.f140983i;
                        C89219l.m154716b(context, "");
                        aVar2.mo87304a(3, "notification_page", "follow", context);
                    }
                    if (followStatus != null) {
                        if (this.f141086a.f141073a && followStatus.followStatus == 2) {
                            Context context2 = this.f141086a.f140983i;
                            if (context2 instanceof ActivityC0945e) {
                                eVar = context2;
                            }
                            ActivityC0945e eVar2 = eVar;
                            if (!(eVar2 == null || (supportFragmentManager = eVar2.getSupportFragmentManager()) == null)) {
                                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                                createIIMServicebyMonsterPlugin.tryShowingChatPrivacyPanel("notification_page", supportFragmentManager, new C62147a(createIIMServicebyMonsterPlugin, this));
                            }
                        }
                        IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                    }
                    this.f141086a.f141073a = false;
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        User user;
        Integer valueOf;
        int i;
        boolean z;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112377h();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        FollowNotice followNotice = this.f141075c;
        if (followNotice != null && (user = followNotice.getUser()) != null) {
            mo100145a("click", "fans", this.f141076d, this.f141077e, this.f141078f, user);
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.cv7 || valueOf.intValue() == R.id.cuf) {
                    if (this.f141031m) {
                        C62271n.m112656a(this.f141032n, getAdapterPosition());
                    }
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    String secUid = user.getSecUid();
                    C89219l.m154716b(secUid, "");
                    C62129p.C62130a.m112360a(uid, secUid, false, null, null, 56);
                    Context context = this.f140983i;
                    C89219l.m154716b(context, "");
                    BaseNotice baseNotice = this.f141076d;
                    if (baseNotice != null) {
                        i = baseNotice.clientOrder;
                    } else {
                        i = -1;
                    }
                    C62266j.m112645a(context, "fans", i);
                } else if (valueOf.intValue() == R.id.cu6) {
                    int a = m112336a(user);
                    C51086a aVar = this.f141083z;
                    if (aVar != null) {
                        String uid2 = user.getUid();
                        String secUid2 = user.getSecUid();
                        int followerStatus = user.getFollowerStatus();
                        if (user.isSecret() || user.isPrivateAccount()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar.mo86509a(uid2, secUid2, a, followerStatus, z);
                    }
                    AbstractC81915c.m141874a(new C35503c(a, user));
                } else if (valueOf.intValue() == R.id.cuw && this.f141031m) {
                    C62271n.m112656a(this.f141032n, getAdapterPosition());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100161a(BaseNotice baseNotice, String str, String str2) {
        User user;
        C89219l.m154721d(baseNotice, "");
        C89219l.m154721d(str2, "");
        if (baseNotice.followNotice != null) {
            this.f141076d = baseNotice;
            this.f141077e = str;
            this.f141078f = str2;
            this.f141075c = baseNotice.followNotice;
            C51086a aVar = this.f141083z;
            if (aVar != null) {
                aVar.f117880f = new C62148a(baseNotice);
            }
            FollowNotice followNotice = this.f141075c;
            if (!(followNotice == null || (user = followNotice.getUser()) == null)) {
                this.f141080w.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
                this.f141080w.mo61285a();
                mo100153a(this.f141081x, user, this.f141076d, str, str2);
                this.f141074b.mo86406a(user.getFollowStatus(), user.getFollowerStatus(), user.getUid());
                C51086a aVar2 = this.f141083z;
                if (aVar2 != null) {
                    aVar2.mo86508a(user);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f140983i.getString(R.string.diu));
            mo100141a(spannableStringBuilder, baseNotice);
            this.f141082y.setText(spannableStringBuilder);
            AbstractC62159w.m112404a(this);
        }
    }
}
