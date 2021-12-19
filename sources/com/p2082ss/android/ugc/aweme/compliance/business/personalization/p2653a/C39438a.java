package com.p2082ss.android.ugc.aweme.compliance.business.personalization.p2653a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.router.SmartRouter;
import com.google.android.gms.p1930a.p1931a.C25248a;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39231b;
import com.p2082ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.a.a */
public final class C39438a {

    /* renamed from: a */
    public static final C39438a f93062a = new C39438a();

    private C39438a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.a.a$a */
    public static final class CallableC39439a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Context f93063a;

        static {
            Covode.recordClassIndex(47127);
        }

        CallableC39439a(Context context) {
            this.f93063a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() {
            boolean z = false;
            try {
                C25248a.C25249a a = C25248a.m48579a(this.f93063a);
                if (a != null) {
                    z = a.f59858b;
                }
            } catch (Exception unused) {
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(47126);
    }

    /* renamed from: a */
    public static void m80134a() {
        AdPersonalitySettings adPersonalitySettings;
        ComplianceSetting complianceSetting;
        AdPersonalitySettings i = C39608b.m80423i();
        if (i != null) {
            adPersonalitySettings = AdPersonalitySettings.copy$default(i, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283, null);
        } else {
            adPersonalitySettings = null;
        }
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (complianceSetting = ComplianceSetting.copy$default(c, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
        }
        C39608b.m80415b(complianceSetting);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.a.a$c */
    public static final class C39441c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Activity f93065a;

        /* renamed from: b */
        final /* synthetic */ String f93066b;

        /* renamed from: c */
        final /* synthetic */ int f93067c;

        /* renamed from: d */
        final /* synthetic */ int f93068d;

        static {
            Covode.recordClassIndex(47129);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f93065a, "//webview").withParam("url", this.f93066b).withParam("use_webview_title", true).open();
        }

        C39441c(Activity activity, String str, int i, int i2) {
            this.f93065a = activity;
            this.f93066b = str;
            this.f93067c = i;
            this.f93068d = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.a.a$b */
    public static final class C39440b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC39231b f93064a;

        static {
            Covode.recordClassIndex(47128);
        }

        C39440b(AbstractC39231b bVar) {
            this.f93064a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Boolean> iVar) {
            boolean z;
            Boolean lat;
            C33842s sVar = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar, "");
            C33594aj<Boolean> n = sVar.mo60070n();
            C89219l.m154716b(n, "");
            C89219l.m154716b(iVar, "");
            n.mo59940b(iVar.mo5545d());
            Boolean d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            boolean booleanValue = d.booleanValue();
            AdPersonalitySettings i = C39608b.m80423i();
            if (i == null || (lat = i.getLat()) == null) {
                z = false;
            } else {
                z = lat.booleanValue();
            }
            if (booleanValue != z) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(new JSONObject().put("field", "limit_ad_tracking").put("value", String.valueOf(booleanValue)));
                String jSONArray2 = jSONArray.toString();
                C89219l.m154716b(jSONArray2, "");
                C39608b.m80413a(jSONArray2, new C39608b.C39613e(booleanValue));
            }
            AbstractC39231b bVar = this.f93064a;
            if (bVar == null) {
                return null;
            }
            Boolean d2 = iVar.mo5545d();
            C89219l.m154716b(d2, "");
            bVar.mo68110a(d2.booleanValue());
            return null;
        }
    }

    /* renamed from: a */
    public static void m80135a(Context context, AbstractC39231b bVar) {
        C89219l.m154721d(context, "");
        C1731i.m5640b(new CallableC39439a(context), C1731i.f5562a).mo5534a(new C39440b(bVar), C1731i.f5564c, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.a.a$d */
    public static final class DialogInterface$OnClickListenerC39442d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC39442d f93069a = new DialogInterface$OnClickListenerC39442d();

        static {
            Covode.recordClassIndex(47130);
        }

        DialogInterface$OnClickListenerC39442d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            Integer promptStyle;
            AdPersonalitySettings i2 = C39608b.m80423i();
            String str2 = null;
            if (i2 != null) {
                str = i2.getBusiness();
            } else {
                str = null;
            }
            C39608b.m80414a(true, str, "1");
            AdPersonalitySettings i3 = C39608b.m80423i();
            if (!(i3 == null || (promptStyle = i3.getPromptStyle()) == null || promptStyle.intValue() != 1)) {
                C39162r.m79460a("revised_PA_old_prompt_EU_click", new C33744d().mo59980a("click_button", 1).f79943a);
            }
            AdPersonalitySettings i4 = C39608b.m80423i();
            if (i4 != null) {
                str2 = i4.getBusiness();
            }
            if (C89219l.m154714a((Object) str2, (Object) "lat_strategy_update")) {
                C39438a.m80134a();
            }
            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.PERSONALIZED_AD);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.a.a$e */
    public static final class DialogInterface$OnClickListenerC39443e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f93070a;

        static {
            Covode.recordClassIndex(47131);
        }

        public DialogInterface$OnClickListenerC39443e(Activity activity) {
            this.f93070a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Integer num;
            String str;
            AdPersonalitySettings i2 = C39608b.m80423i();
            String str2 = null;
            if (i2 != null) {
                num = i2.getPromptStyle();
            } else {
                num = null;
            }
            boolean z = false;
            if (num != null && num.intValue() == 1) {
                AdPersonalitySettings i3 = C39608b.m80423i();
                if (i3 != null) {
                    str2 = i3.getBusiness();
                }
                C39608b.m80414a(false, str2, "2");
                C39162r.m79460a("revised_PA_old_prompt_EU_click", new C33744d().mo59980a("click_button", 0).f79943a);
            } else {
                C39162r.m79460a("enter_personalize_data", new C33744d().mo59983a("enter_from", "homepage_hot").f79943a);
                AdPersonalitySettings i4 = C39608b.m80423i();
                if (i4 != null) {
                    str = i4.getBusiness();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) "lat_strategy_update")) {
                    if (C39608b.m80420f() == 1) {
                        z = true;
                    }
                    AdPersonalitySettings i5 = C39608b.m80423i();
                    if (i5 != null) {
                        str2 = i5.getBusiness();
                    }
                    C39608b.m80414a(z, str2, "2");
                    C39438a.m80134a();
                }
                Intent intent = new Intent(this.f93070a, PersonalizationActivity.class);
                intent.putExtra("enterfrom", "feed");
                this.f93070a.startActivityForResult(intent, 1);
            }
            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.PERSONALIZED_AD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r8 == null) goto L_0x004d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder m80133a(android.app.Activity r12, com.p2082ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo r13) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.personalization.p2653a.C39438a.m80133a(android.app.Activity, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo):android.text.SpannableStringBuilder");
    }
}
