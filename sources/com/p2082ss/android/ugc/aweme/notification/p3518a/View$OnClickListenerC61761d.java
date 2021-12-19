package com.p2082ss.android.ugc.aweme.notification.p3518a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61628c;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationDetailVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.a.d */
public final class View$OnClickListenerC61761d extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    public static final C61762a f140149a = new C61762a((byte) 0);

    /* renamed from: b */
    private BaseNotice f140150b;

    /* renamed from: c */
    private final View f140151c;

    /* renamed from: d */
    private final AvatarImageView f140152d;

    /* renamed from: e */
    private final TextView f140153e;

    /* renamed from: f */
    private final View f140154f;

    /* renamed from: q */
    private final View f140155q;

    /* renamed from: r */
    private final NotificationDetailVM f140156r;

    static {
        Covode.recordClassIndex(72494);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.d$a */
    public static final class C61762a {
        static {
            Covode.recordClassIndex(72495);
        }

        private C61762a() {
        }

        public /* synthetic */ C61762a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static boolean m111800c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        super.cf_();
        BaseNotice baseNotice = this.f140150b;
        this.f140156r.mo100372a(baseNotice, new C61763b(this, baseNotice));
    }

    /* renamed from: h */
    private final boolean m111801h() {
        C61628c cVar;
        String str;
        BaseNotice baseNotice = this.f140150b;
        if (baseNotice == null || (cVar = baseNotice.businessAccountNotice) == null || (str = cVar.f139882c) == null || !C80538hl.m139614a(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.d$b */
    static final class C61763b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC61761d f140157a;

        /* renamed from: b */
        final /* synthetic */ BaseNotice f140158b;

        static {
            Covode.recordClassIndex(72496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61763b(View$OnClickListenerC61761d dVar, BaseNotice baseNotice) {
            super(0);
            this.f140157a = dVar;
            this.f140158b = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            Long l;
            Long l2;
            C33744d a = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", "all");
            BaseNotice baseNotice = this.f140158b;
            String str2 = null;
            if (baseNotice != null) {
                str = baseNotice.templateId;
            } else {
                str = null;
            }
            C33744d a2 = a.mo59983a("template_id", str).mo59980a("is_together", 0);
            BaseNotice baseNotice2 = this.f140158b;
            if (baseNotice2 != null) {
                l = Long.valueOf(baseNotice2.createTime);
            } else {
                l = null;
            }
            C33744d a3 = a2.mo59982a("message_time", l).mo59980a("client_order", this.f140157a.getLayoutPosition()).mo59983a("action_type", "show").mo59983a("account_type", "business_account_assistant");
            BaseNotice baseNotice3 = this.f140158b;
            if (baseNotice3 != null) {
                l2 = Long.valueOf(baseNotice3.taskId);
            } else {
                l2 = null;
            }
            C33744d a4 = a3.mo59982a("task_id", l2);
            BaseNotice baseNotice4 = this.f140158b;
            if (baseNotice4 != null) {
                str2 = baseNotice4.nid;
            }
            C39162r.m79460a("official_message_inner_message", a4.mo59983a("content_id", str2).f79943a);
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r8 != null) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99873a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r8) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3518a.View$OnClickListenerC61761d.mo99873a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        String str;
        Long l;
        Long l2;
        C61628c cVar;
        String str2;
        ClickAgent.onClick(view);
        if (m111801h()) {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m111800c();
            }
            String str3 = "";
            if (!C58029j.f132256h) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, str3);
                new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            } else if (!C58001a.m104815a(view, 1200)) {
                Context context = this.f140983i;
                BaseNotice baseNotice = this.f140150b;
                if (!(baseNotice == null || (cVar = baseNotice.businessAccountNotice) == null || (str2 = cVar.f139882c) == null)) {
                    str3 = str2;
                }
                SmartRouter.buildRoute(context, str3).open();
                C33744d a = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("tab_name", "all");
                BaseNotice baseNotice2 = this.f140150b;
                String str4 = null;
                if (baseNotice2 != null) {
                    str = baseNotice2.templateId;
                } else {
                    str = null;
                }
                C33744d a2 = a.mo59983a("template_id", str).mo59980a("is_together", 0);
                BaseNotice baseNotice3 = this.f140150b;
                if (baseNotice3 != null) {
                    l = Long.valueOf(baseNotice3.createTime);
                } else {
                    l = null;
                }
                C33744d a3 = a2.mo59982a("message_time", l).mo59980a("client_order", getLayoutPosition()).mo59983a("action_type", "click").mo59983a("account_type", "business_account_assistant");
                BaseNotice baseNotice4 = this.f140150b;
                if (baseNotice4 != null) {
                    l2 = Long.valueOf(baseNotice4.taskId);
                } else {
                    l2 = null;
                }
                C33744d a4 = a3.mo59982a("task_id", l2);
                BaseNotice baseNotice5 = this.f140150b;
                if (baseNotice5 != null) {
                    str4 = baseNotice5.nid;
                }
                C39162r.m79460a("official_message_inner_message", a4.mo59983a("content_id", str4).f79943a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC61761d(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(notificationDetailVM, "");
        this.f140156r = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140151c = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140152d = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140153e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.by2);
        C89219l.m154716b(findViewById4, "");
        this.f140154f = findViewById4;
        View findViewById5 = view.findViewById(R.id.cu1);
        C89219l.m154716b(findViewById5, "");
        this.f140155q = findViewById5;
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        C62262g.m112634a(findViewById);
        C62023a.m112168a(avatarImageView);
    }
}
