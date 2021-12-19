package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ab */
final /* synthetic */ class View$OnClickListenerC63970ab implements View.OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f145077a;

    /* renamed from: b */
    private final String f145078b;

    static {
        Covode.recordClassIndex(75414);
    }

    View$OnClickListenerC63970ab(EnterpriseTransformLayout enterpriseTransformLayout, String str) {
        this.f145077a = enterpriseTransformLayout;
        this.f145078b = str;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f145077a;
        String str = this.f145078b;
        Activity activity = enterpriseTransformLayout.f144952i;
        User user = enterpriseTransformLayout.f144951h;
        if (!(activity == null || user == null)) {
            new DialogC64175v(activity, user, (byte) 0).show();
        }
        enterpriseTransformLayout.mo103485b(str);
    }
}
