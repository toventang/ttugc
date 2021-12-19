package com.p2082ss.android.ugc.aweme.notification.p3518a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.facebook.common.p1839k.C24134g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62135q;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationDetailVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.a.h */
public final class View$OnClickListenerC61769h extends C62129p implements View.OnClickListener {

    /* renamed from: c */
    public static final C61770a f140168c = new C61770a((byte) 0);

    /* renamed from: A */
    private String f140169A;

    /* renamed from: B */
    private BaseNotice f140170B;

    /* renamed from: C */
    private final NotificationDetailVM f140171C;

    /* renamed from: a */
    public String f140172a;

    /* renamed from: b */
    public String f140173b;

    /* renamed from: d */
    private final View f140174d;

    /* renamed from: e */
    private final AvatarImageView f140175e;

    /* renamed from: f */
    private final TextView f140176f;

    /* renamed from: q */
    private final RemoteImageView f140177q;

    /* renamed from: r */
    private final Button f140178r;

    /* renamed from: s */
    private final TuxIconView f140179s;

    /* renamed from: t */
    private final TextView f140180t;

    /* renamed from: u */
    private final ImageView f140181u;

    /* renamed from: v */
    private AnnouncementNotice f140182v;

    /* renamed from: w */
    private UserTextNotice f140183w;

    /* renamed from: x */
    private boolean f140184x;

    /* renamed from: y */
    private boolean f140185y;

    /* renamed from: z */
    private boolean f140186z;

    static {
        Covode.recordClassIndex(72502);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.h$a */
    public static final class C61770a {
        static {
            Covode.recordClassIndex(72503);
        }

        private C61770a() {
        }

        public /* synthetic */ C61770a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.h$c */
    public static final class C61772c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ RecordConfig f140189a;

        /* renamed from: b */
        final /* synthetic */ View$OnClickListenerC61769h f140190b;

        /* renamed from: c */
        final /* synthetic */ View f140191c;

        static {
            Covode.recordClassIndex(72505);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            IRecordService recordService = asyncAVService.uiService().recordService();
            Context context = this.f140191c.getContext();
            C89219l.m154716b(context, "");
            recordService.startRecord(context, this.f140189a);
        }

        C61772c(RecordConfig recordConfig, View$OnClickListenerC61769h hVar, View view) {
            this.f140189a = recordConfig;
            this.f140190b = hVar;
            this.f140191c = view;
        }
    }

    /* renamed from: c */
    private static boolean m111823c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        super.cf_();
        BaseNotice baseNotice = this.f140170B;
        if (baseNotice != null) {
            this.f140171C.mo100372a(baseNotice, new C61771b(this, baseNotice));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.h$b */
    static final class C61771b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC61769h f140187a;

        /* renamed from: b */
        final /* synthetic */ BaseNotice f140188b;

        static {
            Covode.recordClassIndex(72504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61771b(View$OnClickListenerC61769h hVar, BaseNotice baseNotice) {
            super(0);
            this.f140187a = hVar;
            this.f140188b = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39162r.m79460a("official_message_inner_message", new C33744d().mo59983a("action_type", "show").mo59983a("account_type", "tiktok_assistant").mo59980a("client_order", this.f140187a.getLayoutPosition()).mo59983a("scene_id", "1005").mo59981a("task_id", this.f140188b.taskId).mo59983a("template_id", this.f140188b.templateId).mo59983a("event_keyword", this.f140187a.f140173b).mo59983a("content_id", this.f140187a.f140172a).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static void m111821b(String str) {
        C39162r.m79460a("enter_prop_detail", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("account_type", "tiktok_assistant").mo59983a("prop_id", str).f79943a);
    }

    /* renamed from: a */
    public final void mo99878a(BaseNotice baseNotice) {
        boolean z;
        String str = "";
        C89219l.m154721d(baseNotice, str);
        if (baseNotice.announcement != null || baseNotice.textNotice != null) {
            this.f140170B = baseNotice;
            this.f140172a = baseNotice.nid;
            this.f140175e.setImageURI(C24134g.m45734a(2131231291));
            AnnouncementNotice announcementNotice = baseNotice.announcement;
            this.f140182v = announcementNotice;
            if (announcementNotice != null) {
                AnnouncementNotice announcementNotice2 = baseNotice.announcement;
                C89219l.m154716b(announcementNotice2, str);
                if (announcementNotice2.getChallenge() != null) {
                    z = true;
                } else {
                    z = false;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f140767g) {
                    spannableStringBuilder.append((char) 8296);
                }
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder.append((CharSequence) announcementNotice.getTitle());
                    if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder.append((CharSequence) announcementNotice.getContent());
                }
                if (this.f140767g) {
                    spannableStringBuilder.append((char) 8297);
                }
                if (z) {
                    C62262g.m112634a(this.f140174d);
                    C62135q.m112363a(this.f140176f, spannableStringBuilder, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 192.0f)));
                    this.f140178r.setVisibility(0);
                    this.f140177q.setVisibility(8);
                    this.f140179s.setVisibility(8);
                } else if (announcementNotice.getImageUrl() != null) {
                    C62262g.m112634a(this.f140174d);
                    C62135q.m112363a(this.f140176f, spannableStringBuilder, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 160.0f)));
                    this.f140178r.setVisibility(8);
                    this.f140177q.setVisibility(0);
                    this.f140179s.setVisibility(8);
                    C34577e.m70592a(this.f140177q, announcementNotice.getImageUrl());
                } else {
                    String schemaUrl = announcementNotice.getSchemaUrl();
                    if (schemaUrl == null || schemaUrl.length() == 0) {
                        this.f140174d.setOnTouchListener(null);
                        C62262g.m112637b(this.f140174d);
                        mo100141a(spannableStringBuilder, baseNotice);
                        this.f140176f.setText(spannableStringBuilder);
                        this.f140178r.setVisibility(8);
                        this.f140177q.setVisibility(8);
                        this.f140179s.setVisibility(8);
                    } else {
                        C62262g.m112634a(this.f140174d);
                        C62135q.m112363a(this.f140176f, spannableStringBuilder, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
                        this.f140178r.setVisibility(8);
                        this.f140177q.setVisibility(8);
                        this.f140179s.setVisibility(0);
                    }
                }
                String schemaUrl2 = announcementNotice.getSchemaUrl();
                if (schemaUrl2 == null) {
                    schemaUrl2 = str;
                }
                String queryParameter = Uri.parse(schemaUrl2).getQueryParameter("event_keyword");
                if (queryParameter != null) {
                    str = queryParameter;
                }
                this.f140173b = str;
            }
            UserTextNotice userTextNotice = baseNotice.textNotice;
            this.f140183w = userTextNotice;
            if (userTextNotice != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder2.append((CharSequence) userTextNotice.getTitle());
                    if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                        spannableStringBuilder2.append(": ");
                    }
                    spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                }
                if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                    spannableStringBuilder2.append((CharSequence) userTextNotice.getContent());
                }
                String schemaUrl3 = userTextNotice.getSchemaUrl();
                if (schemaUrl3 == null || schemaUrl3.length() == 0) {
                    mo100141a(spannableStringBuilder2, baseNotice);
                    this.f140176f.setText(spannableStringBuilder2);
                    this.f140179s.setVisibility(8);
                    this.f140177q.setVisibility(8);
                    this.f140180t.setVisibility(8);
                    this.f140181u.setVisibility(8);
                    this.f140178r.setVisibility(8);
                    return;
                }
                try {
                    Uri parse = Uri.parse(userTextNotice.getSchemaUrl());
                    this.f140184x = parse.getBooleanQueryParameter("effects", false);
                    this.f140185y = parse.getBooleanQueryParameter("blur", false);
                    this.f140186z = parse.getBooleanQueryParameter("duet", false);
                    String queryParameter2 = parse.getQueryParameter("aweme_id");
                    this.f140169A = queryParameter2;
                    if (!this.f140186z || TextUtils.isEmpty(queryParameter2)) {
                        C62135q.m112363a(this.f140176f, spannableStringBuilder2, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
                        this.f140179s.setVisibility(0);
                        this.f140177q.setVisibility(8);
                        this.f140180t.setVisibility(8);
                        this.f140181u.setVisibility(8);
                        this.f140178r.setVisibility(8);
                        return;
                    }
                    C62135q.m112363a(this.f140176f, spannableStringBuilder2, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 192.0f)));
                    this.f140179s.setVisibility(8);
                    this.f140177q.setVisibility(0);
                    this.f140180t.setVisibility(0);
                    this.f140181u.setVisibility(0);
                    this.f140178r.setVisibility(8);
                    C34577e.m70592a(this.f140177q, userTextNotice.getImageUrl());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0166, code lost:
        if (r19.mo99359a((android.app.Activity) r13, r25.f140185y, r25.f140184x, r25.f140186z, r25.f140169A) == false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011a  */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r26) {
        /*
        // Method dump skipped, instructions count: 1181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3518a.View$OnClickListenerC61769h.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private static void m111820a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: b */
    private final void m111822b(String str, String str2) {
        String str3;
        C33744d a = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("account_type", "tiktok_assistant").mo59983a("music_id", str).mo59983a("process_id", str2);
        BaseNotice baseNotice = this.f140170B;
        if (baseNotice != null) {
            str3 = baseNotice.templateId;
        } else {
            str3 = null;
        }
        C39162r.m79460a("enter_music_detail", a.mo59983a("template_id", str3).f79943a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC61769h(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(notificationDetailVM, "");
        this.f140171C = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140174d = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140175e = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140176f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById4, "");
        this.f140177q = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cu6);
        C89219l.m154716b(findViewById5, "");
        Button button = (Button) findViewById5;
        this.f140178r = button;
        View findViewById6 = view.findViewById(R.id.cu1);
        C89219l.m154716b(findViewById6, "");
        this.f140179s = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e6k);
        C89219l.m154716b(findViewById7, "");
        this.f140180t = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.e6j);
        C89219l.m154716b(findViewById8, "");
        this.f140181u = (ImageView) findViewById8;
        button.getLayoutParams().width = C62262g.m112633a(this.f140983i);
        C62023a.m112168a(avatarImageView);
        C62023a.m112168a(button);
        button.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        this.f140767g = C80471gb.m139483a(this.f140983i);
    }
}
