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
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.aj */
public final class View$OnClickListenerC62041aj extends C62129p implements View.OnClickListener {

    /* renamed from: b */
    public static final C62042a f140814b = new C62042a((byte) 0);

    /* renamed from: a */
    public final boolean f140815a;

    /* renamed from: c */
    private final View f140816c;

    /* renamed from: d */
    private final AvatarImageView f140817d;

    /* renamed from: e */
    private final TextView f140818e;

    /* renamed from: f */
    private AnnouncementNotice f140819f;

    /* renamed from: q */
    private UserTextNotice f140820q;

    /* renamed from: r */
    private String f140821r = "";

    static {
        Covode.recordClassIndex(72795);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.aj$a */
    public static final class C62042a {
        static {
            Covode.recordClassIndex(72796);
        }

        private C62042a() {
        }

        public /* synthetic */ C62042a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static boolean m112225c() {
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
        this.f140768h.mo100338a(this.f140984j, new C62043b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.aj$b */
    static final class C62043b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62041aj f140822a;

        static {
            Covode.recordClassIndex(72797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62043b(View$OnClickListenerC62041aj ajVar) {
            super(0);
            this.f140822a = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f140822a.f140815a) {
                int i = this.f140822a.f140985k;
                String str = this.f140822a.f140986l;
                C89219l.m154716b(str, "");
                C62259e.m112619a("tag", i, str, this.f140822a.f140768h.mo100337a(), this.f140822a.f140984j.templateId);
            } else {
                C39162r.m79460a("official_message_inner_message", new C33744d().mo59983a("action_type", "show").mo59983a("account_type", "tiktok_assistant").mo59980a("client_order", this.f140822a.f140985k).mo59983a("scene_id", "1004").mo59981a("task_id", this.f140822a.f140984j.taskId).mo59983a("template_id", this.f140822a.f140984j.templateId).mo59983a("content_id", this.f140822a.f140984j.nid).f79943a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m112225c();
            }
            if (!C58029j.f132256h) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
                return;
            }
            if (view != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f140983i, "//notice/detail");
                int a = C62232h.m112535b().mo99309a(46);
                BaseNotice baseNotice = this.f140984j;
                if (baseNotice != null) {
                    str = baseNotice.nid;
                } else {
                    str = null;
                }
                buildRoute.withNavArg(new MusNotificationDetailArg(46, a, null, null, str, 12, null)).open();
            }
            C39162r.m79460a("enter_official_message", new C33744d().mo59983a("account_type", "tiktok_assistant").mo59980a("client_order", getLayoutPosition()).mo59983a("scene_id", "1004").mo59983a("template_id", this.f140821r).f79943a);
        }
    }

    /* renamed from: a */
    public final void mo100108a(BaseNotice baseNotice) {
        C89219l.m154721d(baseNotice, "");
        if (baseNotice.announcement != null || baseNotice.textNotice != null) {
            if (baseNotice.announcement != null && this.f140815a) {
                AnnouncementNotice announcementNotice = baseNotice.announcement;
                C89219l.m154716b(announcementNotice, "");
                if (announcementNotice.getChallenge() == null) {
                    return;
                }
            }
            this.f140821r = baseNotice.templateId;
            AnnouncementNotice announcementNotice2 = baseNotice.announcement;
            this.f140819f = announcementNotice2;
            if (announcementNotice2 != null) {
                this.f140817d.setImageURI(C24134g.m45734a(2131231291));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f140983i;
                C89219l.m154716b(context, "");
                spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.diw)).append((CharSequence) ": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((char) 8296);
                if (!TextUtils.isEmpty(announcementNotice2.getTitle())) {
                    spannableStringBuilder.append((CharSequence) announcementNotice2.getTitle());
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append((char) 8297);
                C62135q.m112363a(this.f140818e, spannableStringBuilder, baseNotice, 5, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
            }
            UserTextNotice userTextNotice = baseNotice.textNotice;
            this.f140820q = userTextNotice;
            if (userTextNotice != null) {
                this.f140817d.setImageURI(C24134g.m45734a(2131231291));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                Context context2 = this.f140983i;
                C89219l.m154716b(context2, "");
                spannableStringBuilder2.append((CharSequence) context2.getResources().getString(R.string.diw)).append((CharSequence) ": ");
                spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((char) 8296);
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder2.append((CharSequence) userTextNotice.getTitle());
                } else {
                    spannableStringBuilder2.delete(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length());
                }
                spannableStringBuilder2.append((char) 8297);
                C62135q.m112363a(this.f140818e, spannableStringBuilder2, baseNotice, 5, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62041aj(View view, boolean z) {
        super(view);
        C89219l.m154721d(view, "");
        this.f140815a = z;
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140816c = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140817d = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140818e = (TextView) findViewById3;
        C62262g.m112634a(findViewById);
        C62023a.m112168a(avatarImageView);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
    }
}
