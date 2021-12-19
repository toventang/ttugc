package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.EnterpriseTransformLayout;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ad */
final /* synthetic */ class View$OnClickListenerC63972ad implements View.OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f145082a;

    /* renamed from: b */
    private final String f145083b;

    /* renamed from: c */
    private final EnterpriseTransformLayout.C63931a f145084c;

    /* renamed from: d */
    private final String f145085d;

    static {
        Covode.recordClassIndex(75416);
    }

    View$OnClickListenerC63972ad(EnterpriseTransformLayout enterpriseTransformLayout, String str, EnterpriseTransformLayout.C63931a aVar, String str2) {
        this.f145082a = enterpriseTransformLayout;
        this.f145083b = str;
        this.f145084c = aVar;
        this.f145085d = str2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f145082a;
        String str = this.f145083b;
        EnterpriseTransformLayout.C63931a aVar = this.f145084c;
        String str2 = this.f145085d;
        Context context = view.getContext();
        String str3 = aVar.f144960b;
        if (!C38000g.m77052c().mo65920a(context, str, true)) {
            C38000g.m77052c().mo65919a(context, str, str3);
        }
        enterpriseTransformLayout.mo103485b(str2);
        C39162r.onEventV3("ttelite_BA_external_link_clicked");
    }
}
