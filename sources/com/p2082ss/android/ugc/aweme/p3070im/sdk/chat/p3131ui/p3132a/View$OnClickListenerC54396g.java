package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TextContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53627f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55196f;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.utils.C80228av;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.g */
final /* synthetic */ class View$OnClickListenerC54396g implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC54386c.View$OnLongClickListenerC543892 f124611a;

    /* renamed from: b */
    private final View f124612b;

    static {
        Covode.recordClassIndex(64099);
    }

    View$OnClickListenerC54396g(AbstractC54386c.View$OnLongClickListenerC543892 r1, View view) {
        this.f124611a = r1;
        this.f124612b = view;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC54386c.View$OnLongClickListenerC543892 r4 = this.f124611a;
        View view2 = this.f124612b;
        if (r4.f124603b instanceof TextContent) {
            Context context = view2.getContext();
            String text = ((TextContent) r4.f124603b).getText();
            PrivacyCert build = PrivacyCert.Builder.with("bpea-219").usage("When user long presses individual chat message in IM chat page, it will copy the selected message into clipboard. ").tag("longPressToCopyMessage").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build();
            try {
                if (C55196f.m100911a(context)) {
                    C80228av.m139063a("copy_im_label", text, context, build);
                }
            } catch (Throwable th) {
                C56244a.m102187a("copyToClipboard", th);
            }
        }
        C53627f.m98869a(AbstractC54386c.this.f124584n.isGroupChat(), "copy");
    }
}
