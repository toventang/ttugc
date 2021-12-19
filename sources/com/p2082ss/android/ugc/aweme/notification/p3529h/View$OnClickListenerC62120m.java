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
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61628c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62232h;
import com.p2082ss.android.ugc.aweme.notification.utils.C62261f;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.m */
public final class View$OnClickListenerC62120m extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    public static final C62121a f140988a = new C62121a((byte) 0);

    /* renamed from: b */
    private final View f140989b;

    /* renamed from: c */
    private final AvatarImageView f140990c;

    /* renamed from: d */
    private final TextView f140991d;

    /* renamed from: e */
    private final View f140992e;

    /* renamed from: f */
    private final View f140993f;

    /* renamed from: q */
    private String f140994q;

    /* renamed from: r */
    private int f140995r = -1;

    /* renamed from: s */
    private BaseNotice f140996s;

    /* renamed from: t */
    private final Fragment f140997t;

    static {
        Covode.recordClassIndex(72874);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.m$a */
    public static final class C62121a {
        static {
            Covode.recordClassIndex(72875);
        }

        private C62121a() {
        }

        public /* synthetic */ C62121a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static boolean m112322c() {
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
        this.f140768h.mo100338a(this.f140984j, new C62122b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.m$b */
    static final class C62122b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62120m f140998a;

        static {
            Covode.recordClassIndex(72876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62122b(View$OnClickListenerC62120m mVar) {
            super(0);
            this.f140998a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            BaseNotice baseNotice = this.f140998a.f140984j;
            Objects.requireNonNull(baseNotice, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice");
            MusNotice musNotice = (MusNotice) baseNotice;
            int a = this.f140998a.f140768h.mo100337a();
            int i = this.f140998a.f140985k;
            C89219l.m154721d(musNotice, "");
            C39162r.m79460a("notification_message_inner_message", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", C62261f.m112632a(Integer.valueOf(a))).mo59983a("template_id", musNotice.templateId).mo59980a("is_together", 1).mo59981a("message_time", musNotice.createTime).mo59980a("client_order", i).mo59983a("action_type", "show").mo59983a("account_type", "business_account_assistant").mo59981a("task_id", musNotice.taskId).f79943a);
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
                C58029j.f132256h = m112322c();
            }
            if (!C58029j.f132256h) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
                return;
            }
            if (C62232h.m112535b().mo99309a(82) > 0) {
                AbstractC81915c.m141874a(new C61562n());
            }
            Long l2 = null;
            if (view != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f140983i, "//notice/detail");
                int a = C62232h.m112535b().mo99309a(82);
                BaseNotice baseNotice = this.f140984j;
                if (baseNotice != null) {
                    str2 = baseNotice.nid;
                } else {
                    str2 = null;
                }
                buildRoute.withNavArg(new MusNotificationDetailArg(88, a, null, null, str2, 12, null)).open();
            }
            C61542b.m111470d(82);
            C33744d a2 = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", this.f140994q);
            BaseNotice baseNotice2 = this.f140996s;
            if (baseNotice2 != null) {
                str = baseNotice2.templateId;
            } else {
                str = null;
            }
            C33744d a3 = a2.mo59983a("template_id", str).mo59980a("is_together", 1);
            BaseNotice baseNotice3 = this.f140996s;
            if (baseNotice3 != null) {
                l = Long.valueOf(baseNotice3.createTime);
            } else {
                l = null;
            }
            C33744d a4 = a3.mo59982a("message_time", l).mo59983a("client_order", String.valueOf(this.f140995r)).mo59983a("action_type", "click").mo59983a("account_type", "business_account_assistant");
            BaseNotice baseNotice4 = this.f140996s;
            if (baseNotice4 != null) {
                l2 = Long.valueOf(baseNotice4.taskId);
            }
            C39162r.m79460a("notification_message_inner_message", a4.mo59982a("task_id", l2).f79943a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62120m(View view, Fragment fragment) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        this.f140997t = fragment;
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140989b = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140990c = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140991d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.by2);
        C89219l.m154716b(findViewById4, "");
        this.f140992e = findViewById4;
        View findViewById5 = view.findViewById(R.id.cu1);
        C89219l.m154716b(findViewById5, "");
        this.f140993f = findViewById5;
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        C62262g.m112634a(findViewById);
        C62023a.m112168a(avatarImageView);
    }

    /* renamed from: a */
    public final void mo100147a(BaseNotice baseNotice, boolean z, int i, String str) {
        int i2;
        C61628c cVar;
        String str2;
        C89219l.m154721d(str, "");
        this.f140996s = baseNotice;
        this.f140995r = i;
        this.f140994q = str;
        this.f140990c.setImageURI(C24134g.m45734a(2131231278));
        View view = this.f140992e;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        this.f140993f.setVisibility(0);
        if (baseNotice == null || (cVar = baseNotice.businessAccountNotice) == null || (str2 = cVar.f139881b) == null) {
            this.f140991d.setText("");
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = this.f140983i;
        C89219l.m154716b(context, "");
        spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.a7a));
        if (!TextUtils.isEmpty(str2)) {
            spannableStringBuilder.append((CharSequence) ": ");
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((char) 8296);
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.append((char) 8297);
        } else {
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
        }
        C62135q.m112363a(this.f140991d, spannableStringBuilder, baseNotice, 5, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
    }
}
