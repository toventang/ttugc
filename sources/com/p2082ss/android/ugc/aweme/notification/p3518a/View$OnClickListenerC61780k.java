package com.p2082ss.android.ugc.aweme.notification.p3518a;

import android.content.Context;
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
import com.google.gson.C27910f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61638l;
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
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.a.k */
public final class View$OnClickListenerC61780k extends C62129p implements View.OnClickListener {

    /* renamed from: c */
    public static final String f140237c = "enter_from";

    /* renamed from: d */
    public static final String f140238d = "guide_to_invite_third_friends";

    /* renamed from: e */
    public static final String f140239e = StringSet.type;

    /* renamed from: f */
    public static final C61781a f140240f = new C61781a((byte) 0);

    /* renamed from: A */
    private boolean f140241A;

    /* renamed from: B */
    private boolean f140242B;

    /* renamed from: C */
    private String f140243C;

    /* renamed from: D */
    private Long f140244D;

    /* renamed from: E */
    private BaseNotice f140245E;

    /* renamed from: F */
    private final NotificationDetailVM f140246F;

    /* renamed from: a */
    public C61638l f140247a;

    /* renamed from: b */
    public String f140248b;

    /* renamed from: q */
    private final View f140249q;

    /* renamed from: r */
    private final AvatarImageView f140250r;

    /* renamed from: s */
    private final TextView f140251s;

    /* renamed from: t */
    private final RemoteImageView f140252t;

    /* renamed from: u */
    private final DmtButton f140253u;

    /* renamed from: v */
    private final TuxIconView f140254v;

    /* renamed from: w */
    private final TextView f140255w;

    /* renamed from: x */
    private final ImageView f140256x;

    /* renamed from: y */
    private final TextView f140257y;

    /* renamed from: z */
    private boolean f140258z;

    /* renamed from: com.ss.android.ugc.aweme.notification.a.k$a */
    public static final class C61781a {
        static {
            Covode.recordClassIndex(72514);
        }

        private C61781a() {
        }

        public /* synthetic */ C61781a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.k$c */
    public static final class C61783c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ RecordConfig f140261a;

        /* renamed from: b */
        final /* synthetic */ View$OnClickListenerC61780k f140262b;

        /* renamed from: c */
        final /* synthetic */ View f140263c;

        static {
            Covode.recordClassIndex(72516);
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
            Context context = this.f140263c.getContext();
            C89219l.m154716b(context, "");
            recordService.startRecord(context, this.f140261a);
        }

        C61783c(RecordConfig recordConfig, View$OnClickListenerC61780k kVar, View view) {
            this.f140261a = recordConfig;
            this.f140262b = kVar;
            this.f140263c = view;
        }
    }

    /* renamed from: c */
    private static boolean m111832c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(72513);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        super.cf_();
        BaseNotice baseNotice = this.f140245E;
        if (baseNotice != null) {
            this.f140246F.mo100372a(baseNotice, new C61782b(this, baseNotice));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.k$b */
    static final class C61782b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC61780k f140259a;

        /* renamed from: b */
        final /* synthetic */ BaseNotice f140260b;

        static {
            Covode.recordClassIndex(72515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61782b(View$OnClickListenerC61780k kVar, BaseNotice baseNotice) {
            super(0);
            this.f140259a = kVar;
            this.f140260b = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            HashMap<? extends String, ? extends String> hashMap = new HashMap<>();
            try {
                C27910f fVar = new C27910f();
                C61638l lVar = this.f140259a.f140247a;
                if (lVar == null) {
                    C89219l.m154715b();
                }
                Object a = fVar.mo46670a(lVar.f139923d, (Class) new HashMap().getClass());
                C89219l.m154716b(a, "");
                hashMap = (HashMap) a;
            } catch (Exception unused) {
            }
            C39162r.m79460a("official_message_inner_message", new C33744d().mo59983a("account_type", "starmap_assistant").mo59983a("action_type", "show").mo59981a("message_time", this.f140260b.createTime).mo59980a("client_order", this.f140259a.getLayoutPosition()).mo59983a("content_id", this.f140259a.f140248b).mo59983a("template_id", this.f140260b.templateId).mo59985a(hashMap).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo99881a(BaseNotice baseNotice) {
        C89219l.m154721d(baseNotice, "");
        if (baseNotice.tcmNotice != null) {
            this.f140245E = baseNotice;
            this.f140248b = baseNotice.nid;
            this.f140250r.setImageURI(C24134g.m45734a(2131231275));
            this.f140247a = baseNotice.tcmNotice;
            this.f140244D = Long.valueOf(baseNotice.createTime);
            C61638l lVar = this.f140247a;
            if (lVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f140767g) {
                    spannableStringBuilder.append((char) 8296);
                }
                if (!TextUtils.isEmpty(lVar.f139920a)) {
                    spannableStringBuilder.append((CharSequence) lVar.f139920a);
                    if (!TextUtils.isEmpty(lVar.f139921b)) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(lVar.f139921b)) {
                    spannableStringBuilder.append((CharSequence) lVar.f139921b);
                }
                if (this.f140767g) {
                    spannableStringBuilder.append((char) 8297);
                }
                String str = lVar.f139925f;
                boolean z = true;
                if (!(str == null || str.length() == 0)) {
                    this.f140257y.setText(this.f140983i.getString(R.string.d4d, lVar.f139925f));
                    this.f140257y.setVisibility(0);
                }
                if (lVar.f139926g != null) {
                    C34577e.m70592a(this.f140250r, lVar.f139926g);
                }
                if (lVar.f139922c.length() != 0) {
                    z = false;
                }
                if (z) {
                    mo100141a(spannableStringBuilder, baseNotice);
                    this.f140251s.setText(spannableStringBuilder);
                    this.f140254v.setVisibility(8);
                    this.f140252t.setVisibility(8);
                    this.f140255w.setVisibility(8);
                    this.f140256x.setVisibility(8);
                    this.f140253u.setVisibility(8);
                    return;
                }
                try {
                    Uri parse = Uri.parse(lVar.f139922c);
                    this.f140258z = parse.getBooleanQueryParameter("effects", false);
                    this.f140241A = parse.getBooleanQueryParameter("blur", false);
                    this.f140242B = parse.getBooleanQueryParameter("duet", false);
                    String queryParameter = parse.getQueryParameter("aweme_id");
                    this.f140243C = queryParameter;
                    if (!this.f140242B || TextUtils.isEmpty(queryParameter)) {
                        C62135q.m112363a(this.f140251s, spannableStringBuilder, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 132.0f)));
                        this.f140254v.setVisibility(0);
                        this.f140252t.setVisibility(8);
                        this.f140255w.setVisibility(8);
                        this.f140256x.setVisibility(8);
                        this.f140253u.setVisibility(8);
                        return;
                    }
                    C62135q.m112363a(this.f140251s, spannableStringBuilder, baseNotice, 10, C13628n.m24504a(this.f140983i) - ((int) C13628n.m24520b(this.f140983i, 192.0f)));
                    this.f140254v.setVisibility(8);
                    this.f140252t.setVisibility(0);
                    this.f140255w.setVisibility(0);
                    this.f140256x.setVisibility(0);
                    this.f140253u.setVisibility(8);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r3.mo99359a((android.app.Activity) r4, r11.f140241A, r11.f140258z, r11.f140242B, r11.f140243C) == false) goto L_0x008f;
     */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
        // Method dump skipped, instructions count: 591
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3518a.View$OnClickListenerC61780k.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC61780k(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(notificationDetailVM, "");
        this.f140246F = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140249q = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140250r = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140251s = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu9);
        C89219l.m154716b(findViewById4, "");
        this.f140252t = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cu6);
        C89219l.m154716b(findViewById5, "");
        DmtButton dmtButton = (DmtButton) findViewById5;
        this.f140253u = dmtButton;
        View findViewById6 = view.findViewById(R.id.cu1);
        C89219l.m154716b(findViewById6, "");
        this.f140254v = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e6k);
        C89219l.m154716b(findViewById7, "");
        TextView textView = (TextView) findViewById7;
        this.f140255w = textView;
        View findViewById8 = view.findViewById(R.id.e6j);
        C89219l.m154716b(findViewById8, "");
        ImageView imageView = (ImageView) findViewById8;
        this.f140256x = imageView;
        View findViewById9 = view.findViewById(R.id.cvc);
        C89219l.m154716b(findViewById9, "");
        this.f140257y = (TextView) findViewById9;
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
