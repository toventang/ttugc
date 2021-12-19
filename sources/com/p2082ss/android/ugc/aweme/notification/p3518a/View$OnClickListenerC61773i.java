package com.p2082ss.android.ugc.aweme.notification.p3518a;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.common.p1839k.C24134g;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61636j;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62135q;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationDetailVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.a.i */
public final class View$OnClickListenerC61773i extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    public static final String f140192a = "enter_from";

    /* renamed from: b */
    public static final String f140193b = "guide_to_invite_third_friends";

    /* renamed from: c */
    public static final String f140194c = StringSet.type;

    /* renamed from: d */
    public static final C61774a f140195d = new C61774a((byte) 0);

    /* renamed from: e */
    private final View f140196e;

    /* renamed from: f */
    private final AvatarImageView f140197f;

    /* renamed from: q */
    private final TextView f140198q;

    /* renamed from: r */
    private final RemoteImageView f140199r;

    /* renamed from: s */
    private final DmtButton f140200s;

    /* renamed from: t */
    private final TuxIconView f140201t;

    /* renamed from: u */
    private final TextView f140202u;

    /* renamed from: v */
    private final ImageView f140203v;

    /* renamed from: w */
    private C61636j f140204w;

    /* renamed from: x */
    private BaseNotice f140205x;

    /* renamed from: y */
    private String f140206y;

    /* renamed from: z */
    private final NotificationDetailVM f140207z;

    /* renamed from: com.ss.android.ugc.aweme.notification.a.i$a */
    public static final class C61774a {
        static {
            Covode.recordClassIndex(72507);
        }

        private C61774a() {
        }

        public /* synthetic */ C61774a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static boolean m111825c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(72506);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        super.cf_();
        BaseNotice baseNotice = this.f140205x;
        if (baseNotice != null) {
            this.f140207z.mo100372a(baseNotice, new C61775b(this, baseNotice));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.i$b */
    static final class C61775b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC61773i f140208a;

        /* renamed from: b */
        final /* synthetic */ BaseNotice f140209b;

        static {
            Covode.recordClassIndex(72508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61775b(View$OnClickListenerC61773i iVar, BaseNotice baseNotice) {
            super(0);
            this.f140208a = iVar;
            this.f140209b = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39162r.m79460a("official_message_inner_message", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", "all").mo59983a("template_id", this.f140209b.templateId).mo59980a("is_together", 0).mo59981a("message_time", this.f140209b.createTime).mo59980a("client_order", this.f140208a.getLayoutPosition()).mo59983a("action_type", "show").mo59983a("account_type", "promote").mo59981a("task_id", this.f140209b.taskId).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo99879a(BaseNotice baseNotice) {
        boolean z;
        C89219l.m154721d(baseNotice, "");
        this.f140205x = baseNotice;
        if (baseNotice.promoteNotice != null) {
            this.f140206y = baseNotice.nid;
            this.f140197f.setImageURI(C24134g.m45734a(2131231270));
            C61636j jVar = baseNotice.promoteNotice;
            this.f140204w = jVar;
            if (jVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f140767g) {
                    spannableStringBuilder.append((char) 8296);
                }
                if (!TextUtils.isEmpty(jVar.f139913a)) {
                    spannableStringBuilder.append((CharSequence) jVar.f139913a);
                    if (!TextUtils.isEmpty(jVar.f139914b)) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(jVar.f139914b)) {
                    spannableStringBuilder.append((CharSequence) jVar.f139914b);
                }
                if (this.f140767g) {
                    spannableStringBuilder.append((char) 8297);
                }
                if (jVar.f139915c.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    mo100141a(spannableStringBuilder, baseNotice);
                    this.f140198q.setText(spannableStringBuilder);
                    this.f140201t.setVisibility(8);
                    this.f140199r.setVisibility(8);
                    this.f140202u.setVisibility(8);
                    this.f140203v.setVisibility(8);
                    this.f140200s.setVisibility(8);
                    return;
                }
                try {
                    Uri.parse(jVar.f139915c);
                    C62135q.m112363a(this.f140198q, spannableStringBuilder, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
                    this.f140201t.setVisibility(0);
                    this.f140199r.setVisibility(8);
                    this.f140202u.setVisibility(8);
                    this.f140203v.setVisibility(8);
                    this.f140200s.setVisibility(8);
                    if (jVar.f139916d != null) {
                        C34577e.m70592a(this.f140199r, jVar.f139916d);
                        this.f140199r.setVisibility(0);
                        this.f140201t.setVisibility(8);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        C61636j jVar;
        String str;
        String str2;
        Long l;
        ClickAgent.onClick(view);
        BaseNotice baseNotice = this.f140205x;
        if (baseNotice != null && (jVar = baseNotice.promoteNotice) != null && (str = jVar.f139915c) != null && C80538hl.m139614a(str)) {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m111825c();
            }
            if (!C58029j.f132256h) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            } else if (!C58001a.m104815a(view, 1200)) {
                C61636j jVar2 = this.f140204w;
                if (jVar2 != null) {
                    SmartRouter.buildRoute(this.f140983i, jVar2.f139915c).open();
                }
                C33744d a = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", "all");
                BaseNotice baseNotice2 = this.f140205x;
                Long l2 = null;
                if (baseNotice2 != null) {
                    str2 = baseNotice2.templateId;
                } else {
                    str2 = null;
                }
                C33744d a2 = a.mo59983a("template_id", str2).mo59980a("is_together", 0);
                BaseNotice baseNotice3 = this.f140205x;
                if (baseNotice3 != null) {
                    l = Long.valueOf(baseNotice3.createTime);
                } else {
                    l = null;
                }
                C33744d a3 = a2.mo59982a("message_time", l).mo59980a("client_order", getLayoutPosition()).mo59983a("action_type", "click").mo59983a("account_type", "promote");
                BaseNotice baseNotice4 = this.f140205x;
                if (baseNotice4 != null) {
                    l2 = Long.valueOf(baseNotice4.taskId);
                }
                C39162r.m79460a("official_message_inner_message", a3.mo59982a("task_id", l2).f79943a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC61773i(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(notificationDetailVM, "");
        this.f140207z = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140196e = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140197f = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140198q = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById4, "");
        this.f140199r = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cu6);
        C89219l.m154716b(findViewById5, "");
        DmtButton dmtButton = (DmtButton) findViewById5;
        this.f140200s = dmtButton;
        View findViewById6 = view.findViewById(R.id.cu1);
        C89219l.m154716b(findViewById6, "");
        this.f140201t = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e6k);
        C89219l.m154716b(findViewById7, "");
        TextView textView = (TextView) findViewById7;
        this.f140202u = textView;
        View findViewById8 = view.findViewById(R.id.e6j);
        C89219l.m154716b(findViewById8, "");
        ImageView imageView = (ImageView) findViewById8;
        this.f140203v = imageView;
        C62262g.m112634a(findViewById);
        C62262g.m112634a(textView);
        C62262g.m112634a(imageView);
        C62023a.m112168a(avatarImageView);
        dmtButton.getLayoutParams().width = C62262g.m112633a(this.f140983i);
        dmtButton.setOnClickListener(this);
        imageView.setOnClickListener(this);
        textView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        this.f140767g = C80471gb.m139483a(this.f140983i);
    }
}
