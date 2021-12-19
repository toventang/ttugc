package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.z */
final /* synthetic */ class View$OnClickListenerC64395z implements View.OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f146000a;

    /* renamed from: b */
    private final String f146001b;

    /* renamed from: c */
    private final String f146002c;

    static {
        Covode.recordClassIndex(75849);
    }

    View$OnClickListenerC64395z(EnterpriseTransformLayout enterpriseTransformLayout, String str, String str2) {
        this.f146000a = enterpriseTransformLayout;
        this.f146001b = str;
        this.f146002c = str2;
    }

    public final void onClick(View view) {
        String uid;
        ClickAgent.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f146000a;
        String str = this.f146001b;
        String str2 = this.f146002c;
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:".concat(String.valueOf(str))));
        try {
            Activity activity = enterpriseTransformLayout.f144952i;
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        enterpriseTransformLayout.mo103485b(str2);
        String str3 = "";
        if (C80580in.m139683b() == null) {
            uid = str3;
        } else {
            uid = C80580in.m139683b().getUid();
        }
        C33744d a = new C33744d().mo59983a("enter_from", enterpriseTransformLayout.f144954k).mo59983a("email", enterpriseTransformLayout.f144951h != null ? enterpriseTransformLayout.f144951h.getBioEmail() : str3);
        if (enterpriseTransformLayout.f144951h != null) {
            str3 = enterpriseTransformLayout.f144951h.getUid();
        }
        C39162r.m79460a("ttelite_BA_email_button_clicked", a.mo59983a("to_user_id", str3).mo59983a("user_id", uid).f79943a);
    }
}
