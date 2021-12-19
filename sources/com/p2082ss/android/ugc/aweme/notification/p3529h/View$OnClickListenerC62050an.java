package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.common.p1839k.C24134g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61562n;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61636j;
import com.p2082ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62232h;
import com.p2082ss.android.ugc.aweme.notification.utils.C62261f;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.an */
public final class View$OnClickListenerC62050an extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    public static final C62051a f140850a = new C62051a((byte) 0);

    /* renamed from: b */
    private final View f140851b;

    /* renamed from: c */
    private final AvatarImageView f140852c;

    /* renamed from: d */
    private final TextView f140853d;

    /* renamed from: e */
    private final View f140854e;

    /* renamed from: f */
    private C61636j f140855f;

    /* renamed from: q */
    private BaseNotice f140856q;

    /* renamed from: r */
    private String f140857r;

    /* renamed from: s */
    private int f140858s = -1;

    /* renamed from: t */
    private final Fragment f140859t;

    static {
        Covode.recordClassIndex(72804);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.an$a */
    public static final class C62051a {
        static {
            Covode.recordClassIndex(72805);
        }

        private C62051a() {
        }

        public /* synthetic */ C62051a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static boolean m112240c() {
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
        BaseNotice baseNotice = this.f140856q;
        if (baseNotice != null) {
            this.f140768h.mo100338a(baseNotice, new C62052b(this, baseNotice));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.an$b */
    static final class C62052b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62050an f140860a;

        /* renamed from: b */
        final /* synthetic */ BaseNotice f140861b;

        static {
            Covode.recordClassIndex(72806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62052b(View$OnClickListenerC62050an anVar, BaseNotice baseNotice) {
            super(0);
            this.f140860a = anVar;
            this.f140861b = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39162r.m79460a("notification_message_inner_message", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", C62261f.m112632a(Integer.valueOf(this.f140860a.f140768h.mo100337a()))).mo59983a("template_id", this.f140861b.templateId).mo59980a("is_together", 1).mo59981a("message_time", this.f140861b.createTime).mo59980a("client_order", this.f140860a.f140985k).mo59983a("action_type", "show").mo59983a("account_type", "promote").mo59981a("task_id", this.f140861b.taskId).f79943a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        String str;
        Long l;
        String str2;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m112240c();
            }
            if (!C58029j.f132256h) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
                return;
            }
            Long l2 = null;
            if (view != null) {
                if (C62232h.m112535b().mo99309a(81) > 0) {
                    AbstractC81915c.m141874a(new C61562n());
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f140983i, "//notice/detail");
                int a = C62232h.m112535b().mo99309a(81);
                BaseNotice baseNotice = this.f140984j;
                if (baseNotice != null) {
                    str2 = baseNotice.nid;
                } else {
                    str2 = null;
                }
                buildRoute.withNavArg(new MusNotificationDetailArg(81, a, null, null, str2, 12, null)).open();
                C61542b.m111470d(81);
            }
            C33744d a2 = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", this.f140857r);
            BaseNotice baseNotice2 = this.f140856q;
            if (baseNotice2 != null) {
                str = baseNotice2.templateId;
            } else {
                str = null;
            }
            C33744d a3 = a2.mo59983a("template_id", str).mo59980a("is_together", 1);
            BaseNotice baseNotice3 = this.f140856q;
            if (baseNotice3 != null) {
                l = Long.valueOf(baseNotice3.createTime);
            } else {
                l = null;
            }
            C33744d a4 = a3.mo59982a("message_time", l).mo59983a("client_order", String.valueOf(this.f140858s)).mo59983a("action_type", "click").mo59983a("account_type", "promote");
            BaseNotice baseNotice4 = this.f140856q;
            if (baseNotice4 != null) {
                l2 = Long.valueOf(baseNotice4.taskId);
            }
            C39162r.m79460a("notification_message_inner_message", a4.mo59982a("task_id", l2).f79943a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62050an(View view, Fragment fragment) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        this.f140859t = fragment;
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140851b = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140852c = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140853d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.by2);
        C89219l.m154716b(findViewById4, "");
        this.f140854e = findViewById4;
        C62262g.m112634a(findViewById);
        C62023a.m112168a(avatarImageView);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo100112a(BaseNotice baseNotice, boolean z, int i, String str) {
        C89219l.m154721d(baseNotice, "");
        C89219l.m154721d(str, "");
        this.f140856q = baseNotice;
        this.f140857r = str;
        this.f140858s = i;
        if (baseNotice.promoteNotice != null) {
            C61636j jVar = baseNotice.promoteNotice;
            this.f140855f = jVar;
            if (jVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f140851b.getContext();
                C89219l.m154716b(context, "");
                spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.ex7)).append((CharSequence) ": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((char) 8296);
                if (!TextUtils.isEmpty(jVar.f139913a)) {
                    spannableStringBuilder.append((CharSequence) jVar.f139913a);
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append((char) 8297);
                if (z) {
                    this.f140854e.setVisibility(8);
                    C62135q.m112363a(this.f140853d, spannableStringBuilder, baseNotice, 5, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
                    this.f140854e.setVisibility(8);
                } else {
                    this.f140853d.setText(spannableStringBuilder);
                    this.f140854e.setVisibility(0);
                }
                this.f140852c.setImageURI(C24134g.m45734a(2131231270));
            }
        }
    }
}
