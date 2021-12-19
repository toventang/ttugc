package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
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
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p2082ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62232h;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.ap */
public final class View$OnClickListenerC62056ap extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    public static final C62057a f140871a = new C62057a((byte) 0);

    /* renamed from: b */
    private final View f140872b;

    /* renamed from: c */
    private final AvatarImageView f140873c;

    /* renamed from: d */
    private final TextView f140874d;

    /* renamed from: e */
    private UserTextNotice f140875e;

    /* renamed from: f */
    private AnnouncementNotice f140876f;

    /* renamed from: q */
    private String f140877q = "";

    static {
        Covode.recordClassIndex(72810);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ap$a */
    public static final class C62057a {
        static {
            Covode.recordClassIndex(72811);
        }

        private C62057a() {
        }

        public /* synthetic */ C62057a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static boolean m112247c() {
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
        this.f140768h.mo100338a(this.f140984j, new C62058b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ap$b */
    static final class C62058b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62056ap f140878a;

        static {
            Covode.recordClassIndex(72812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62058b(View$OnClickListenerC62056ap apVar) {
            super(0);
            this.f140878a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39162r.m79460a("official_message_inner_message", new C33744d().mo59983a("action_type", "show").mo59983a("account_type", "official_info").mo59980a("client_order", this.f140878a.getLayoutPosition()).mo59983a("scene_id", "1004").mo59981a("task_id", this.f140878a.f140984j.taskId).mo59983a("template_id", this.f140878a.f140984j.templateId).mo59983a("content_id", this.f140878a.f140984j.nid).f79943a);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62056ap(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140872b = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140873c = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140874d = (TextView) findViewById3;
        C62262g.m112634a(findViewById);
        C62023a.m112168a(avatarImageView);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m112247c();
            }
            if (!C58029j.f132256h) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
                return;
            }
            if (view != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f140983i, "//notice/detail");
                int a = C62232h.m112535b().mo99309a(47);
                BaseNotice baseNotice = this.f140984j;
                if (baseNotice != null) {
                    str = baseNotice.nid;
                } else {
                    str = null;
                }
                buildRoute.withNavArg(new MusNotificationDetailArg(47, a, null, null, str, 12, null)).open();
            }
            C39162r.m79460a("enter_official_message", new C33744d().mo59983a("account_type", "official_info").mo59980a("client_order", getLayoutPosition()).mo59983a("scene_id", "1004").mo59983a("template_id", this.f140877q).f79943a);
        }
    }

    /* renamed from: a */
    public final void mo100114a(BaseNotice baseNotice) {
        C89219l.m154721d(baseNotice, "");
        if (baseNotice.announcement != null || baseNotice.textNotice != null) {
            this.f140877q = baseNotice.templateId;
            UserTextNotice userTextNotice = baseNotice.textNotice;
            this.f140875e = userTextNotice;
            if (userTextNotice != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f140983i;
                C89219l.m154716b(context, "");
                spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.dj4)).append((CharSequence) ": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((char) 8296);
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder.append((CharSequence) userTextNotice.getTitle());
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append((char) 8297);
                C62135q.m112363a(this.f140874d, spannableStringBuilder, baseNotice, 5, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
                this.f140873c.setImageURI(C24134g.m45734a(2131231271));
            }
            AnnouncementNotice announcementNotice = baseNotice.announcement;
            this.f140876f = announcementNotice;
            if (announcementNotice != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                Context context2 = this.f140983i;
                C89219l.m154716b(context2, "");
                spannableStringBuilder2.append((CharSequence) context2.getResources().getString(R.string.diw)).append((CharSequence) ": ");
                spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((char) 8296);
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder2.append((CharSequence) announcementNotice.getTitle());
                } else {
                    spannableStringBuilder2.delete(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length());
                }
                spannableStringBuilder2.append((char) 8297);
                C62135q.m112363a(this.f140874d, spannableStringBuilder2, baseNotice, 5, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
                this.f140873c.setImageURI(C24134g.m45734a(2131231271));
            }
        }
    }
}
