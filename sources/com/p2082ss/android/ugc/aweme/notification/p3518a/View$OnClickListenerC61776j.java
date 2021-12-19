package com.p2082ss.android.ugc.aweme.notification.p3518a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.tux.icon.TuxIconView;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1855f.C24246a;
import com.kakao.usermgmt.StringSet;
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
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.notification.a.j */
public final class View$OnClickListenerC61776j extends C62129p implements View.OnClickListener {

    /* renamed from: c */
    public static final String f140210c = "enter_from";

    /* renamed from: d */
    public static final String f140211d = "guide_to_invite_third_friends";

    /* renamed from: e */
    public static final String f140212e = StringSet.type;

    /* renamed from: f */
    public static final C61777a f140213f = new C61777a((byte) 0);

    /* renamed from: A */
    private boolean f140214A;

    /* renamed from: B */
    private boolean f140215B;

    /* renamed from: C */
    private boolean f140216C;

    /* renamed from: D */
    private String f140217D;

    /* renamed from: E */
    private String f140218E;

    /* renamed from: F */
    private final NotificationDetailVM f140219F;

    /* renamed from: a */
    public UserTextNotice f140220a;

    /* renamed from: b */
    public boolean f140221b;

    /* renamed from: q */
    private final View f140222q;

    /* renamed from: r */
    private final AvatarImageView f140223r;

    /* renamed from: s */
    private final TextView f140224s;

    /* renamed from: t */
    private final RemoteImageView f140225t;

    /* renamed from: u */
    private final DmtButton f140226u;

    /* renamed from: v */
    private final TuxIconView f140227v;

    /* renamed from: w */
    private final TextView f140228w;

    /* renamed from: x */
    private final ImageView f140229x;

    /* renamed from: y */
    private AnnouncementNotice f140230y;

    /* renamed from: z */
    private BaseNotice f140231z;

    /* renamed from: com.ss.android.ugc.aweme.notification.a.j$a */
    public static final class C61777a {
        static {
            Covode.recordClassIndex(72510);
        }

        private C61777a() {
        }

        public /* synthetic */ C61777a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.j$c */
    public static final class C61779c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ RecordConfig f140234a;

        /* renamed from: b */
        final /* synthetic */ View$OnClickListenerC61776j f140235b;

        /* renamed from: c */
        final /* synthetic */ View f140236c;

        static {
            Covode.recordClassIndex(72512);
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
            Context context = this.f140236c.getContext();
            C89219l.m154716b(context, "");
            recordService.startRecord(context, this.f140234a);
        }

        C61779c(RecordConfig recordConfig, View$OnClickListenerC61776j jVar, View view) {
            this.f140234a = recordConfig;
            this.f140235b = jVar;
            this.f140236c = view;
        }
    }

    /* renamed from: c */
    private static boolean m111830c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(72509);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        super.cf_();
        BaseNotice baseNotice = this.f140231z;
        if (baseNotice != null) {
            this.f140219F.mo100372a(baseNotice, new C61778b(this, baseNotice));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.j$b */
    static final class C61778b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC61776j f140232a;

        /* renamed from: b */
        final /* synthetic */ BaseNotice f140233b;

        static {
            Covode.recordClassIndex(72511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61778b(View$OnClickListenerC61776j jVar, BaseNotice baseNotice) {
            super(0);
            this.f140232a = jVar;
            this.f140233b = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            UserTextNotice userTextNotice = this.f140232a.f140220a;
            String str2 = "";
            if (userTextNotice == null || (str = userTextNotice.getSchemaUrl()) == null) {
                str = str2;
            }
            String queryParameter = Uri.parse(str).getQueryParameter("event_keyword");
            if (queryParameter == null) {
                queryParameter = str2;
            }
            C89219l.m154716b(queryParameter, str2);
            C33744d a = new C33744d().mo59983a("action_type", "show").mo59983a("account_type", "official_info").mo59980a("client_order", this.f140232a.getLayoutPosition()).mo59983a("scene_id", "1005").mo59981a("task_id", this.f140233b.taskId).mo59983a("content_id", this.f140233b.nid).mo59983a("template_id", this.f140233b.templateId).mo59983a("event_keyword", queryParameter);
            if (this.f140232a.f140221b) {
                str2 = "online_contract";
            }
            C39162r.m79460a("official_message_inner_message", a.mo59983a("content_type", str2).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static void m111828b(String str) {
        C39162r.m79460a("enter_prop_detail", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("account_type", "official_info").mo59983a("prop_id", str).f79943a);
    }

    /* renamed from: a */
    public final void mo99880a(BaseNotice baseNotice) {
        boolean z;
        boolean z2;
        AbstractC33368e a;
        UserTextNotice userTextNotice;
        String schemaUrl;
        C89219l.m154721d(baseNotice, "");
        if (baseNotice.announcement != null || baseNotice.textNotice != null) {
            this.f140231z = baseNotice;
            this.f140218E = baseNotice.nid;
            C89219l.m154721d(baseNotice, "");
            if (baseNotice.type != 2 || (userTextNotice = baseNotice.textNotice) == null || (schemaUrl = userTextNotice.getSchemaUrl()) == null || !C89361p.m154908a((CharSequence) schemaUrl, (CharSequence) "contract_invitation=1", false)) {
                z = false;
            } else {
                z = true;
            }
            this.f140221b = z;
            this.f140223r.setImageURI(C24134g.m45734a(2131231271));
            UserTextNotice userTextNotice2 = baseNotice.textNotice;
            this.f140220a = userTextNotice2;
            if (userTextNotice2 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f140767g) {
                    spannableStringBuilder.append((char) 8296);
                }
                if (!TextUtils.isEmpty(userTextNotice2.getTitle())) {
                    spannableStringBuilder.append((CharSequence) userTextNotice2.getTitle());
                    if (!TextUtils.isEmpty(userTextNotice2.getContent())) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(userTextNotice2.getContent())) {
                    String content = userTextNotice2.getContent();
                    C89219l.m154716b(content, "");
                    Objects.requireNonNull(content, "null cannot be cast to non-null type kotlin.CharSequence");
                    spannableStringBuilder.append((CharSequence) C89361p.m154910b((CharSequence) content).toString());
                }
                if (this.f140767g) {
                    spannableStringBuilder.append((char) 8297);
                }
                String schemaUrl2 = userTextNotice2.getSchemaUrl();
                if (schemaUrl2 == null || schemaUrl2.length() == 0) {
                    mo100141a(spannableStringBuilder, baseNotice);
                    this.f140224s.setText(spannableStringBuilder);
                    this.f140227v.setVisibility(8);
                    this.f140225t.setVisibility(8);
                    this.f140228w.setVisibility(8);
                    this.f140229x.setVisibility(8);
                    this.f140226u.setVisibility(8);
                } else {
                    try {
                        Uri parse = Uri.parse(userTextNotice2.getSchemaUrl());
                        this.f140214A = parse.getBooleanQueryParameter("effects", false);
                        this.f140215B = parse.getBooleanQueryParameter("blur", false);
                        this.f140216C = parse.getBooleanQueryParameter("duet", false);
                        this.f140217D = parse.getQueryParameter("aweme_id");
                        String queryParameter = parse.getQueryParameter("show_image");
                        String queryParameter2 = parse.getQueryParameter("channel");
                        if (this.f140216C && !TextUtils.isEmpty(this.f140217D)) {
                            C62135q.m112363a(this.f140224s, spannableStringBuilder, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 192.0f)));
                            this.f140227v.setVisibility(8);
                            this.f140225t.setVisibility(0);
                            this.f140228w.setVisibility(0);
                            this.f140229x.setVisibility(0);
                            this.f140226u.setVisibility(8);
                            C34577e.m70592a(this.f140225t, userTextNotice2.getImageUrl());
                        } else if (!TextUtils.equals(queryParameter, "1")) {
                            C62135q.m112363a(this.f140224s, spannableStringBuilder, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
                            this.f140227v.setVisibility(0);
                            this.f140225t.setVisibility(8);
                            this.f140228w.setVisibility(8);
                            this.f140229x.setVisibility(8);
                            this.f140226u.setVisibility(8);
                        } else if (!TextUtils.isEmpty(queryParameter2)) {
                            List<String> a2 = C89070n.m154516a(queryParameter2);
                            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                            if (!(f == null || (a = f.mo59376a()) == null)) {
                                a.mo59418c(a2);
                            }
                            C62135q.m112363a(this.f140224s, spannableStringBuilder, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 160.0f)));
                            this.f140226u.setVisibility(8);
                            this.f140225t.setVisibility(0);
                            this.f140227v.setVisibility(8);
                            this.f140228w.setVisibility(8);
                            this.f140229x.setVisibility(8);
                            C34577e.m70592a(this.f140225t, userTextNotice2.getImageUrl());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            AnnouncementNotice announcementNotice = baseNotice.announcement;
            this.f140230y = announcementNotice;
            if (announcementNotice != null) {
                AnnouncementNotice announcementNotice2 = baseNotice.announcement;
                C89219l.m154716b(announcementNotice2, "");
                if (announcementNotice2.getChallenge() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder2.append((CharSequence) announcementNotice.getTitle());
                    if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                        spannableStringBuilder2.append(": ");
                    }
                    spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                }
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder2.append((CharSequence) announcementNotice.getContent());
                }
                if (z2) {
                    C62262g.m112634a(this.f140222q);
                    C62135q.m112363a(this.f140224s, spannableStringBuilder2, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 192.0f)));
                    this.f140226u.setVisibility(0);
                    this.f140225t.setVisibility(8);
                    this.f140227v.setVisibility(8);
                } else if (announcementNotice.getImageUrl() != null) {
                    C62262g.m112634a(this.f140222q);
                    C62135q.m112363a(this.f140224s, spannableStringBuilder2, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 160.0f)));
                    this.f140226u.setVisibility(8);
                    this.f140225t.setVisibility(0);
                    this.f140227v.setVisibility(8);
                    C34577e.m70592a(this.f140225t, announcementNotice.getImageUrl());
                } else {
                    String schemaUrl3 = announcementNotice.getSchemaUrl();
                    if (schemaUrl3 == null || schemaUrl3.length() == 0) {
                        this.f140222q.setOnTouchListener(null);
                        C62262g.m112637b(this.f140222q);
                        mo100141a(spannableStringBuilder2, baseNotice);
                        this.f140224s.setText(spannableStringBuilder2);
                        this.f140226u.setVisibility(8);
                        this.f140225t.setVisibility(8);
                        this.f140227v.setVisibility(8);
                        return;
                    }
                    C62262g.m112634a(this.f140222q);
                    C62135q.m112363a(this.f140224s, spannableStringBuilder2, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
                    this.f140226u.setVisibility(8);
                    this.f140225t.setVisibility(8);
                    this.f140227v.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0177, code lost:
        if (r17.mo99359a((android.app.Activity) r1, r23.f140215B, r23.f140214A, r23.f140216C, r23.f140217D) == false) goto L_0x0179;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02cf  */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r24) {
        /*
        // Method dump skipped, instructions count: 996
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3518a.View$OnClickListenerC61776j.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private static void m111827a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: b */
    private static void m111829b(String str, String str2) {
        C39162r.m79460a("enter_music_detail", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("account_type", "official_info").mo59983a("music_id", str).mo59983a("process_id", str2).f79943a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC61776j(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(notificationDetailVM, "");
        this.f140219F = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140222q = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140223r = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140224s = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById4, "");
        this.f140225t = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cu6);
        C89219l.m154716b(findViewById5, "");
        DmtButton dmtButton = (DmtButton) findViewById5;
        this.f140226u = dmtButton;
        View findViewById6 = view.findViewById(R.id.cu1);
        C89219l.m154716b(findViewById6, "");
        this.f140227v = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e6k);
        C89219l.m154716b(findViewById7, "");
        TextView textView = (TextView) findViewById7;
        this.f140228w = textView;
        View findViewById8 = view.findViewById(R.id.e6j);
        C89219l.m154716b(findViewById8, "");
        ImageView imageView = (ImageView) findViewById8;
        this.f140229x = imageView;
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
        ((C24246a) avatarImageView.getHierarchy()).mo39966c(R.color.j);
        this.f140767g = C80471gb.m139483a(this.f140983i);
    }
}
