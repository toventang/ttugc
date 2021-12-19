package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23154c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53627f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.k */
final /* synthetic */ class View$OnClickListenerC54400k implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC54386c.View$OnLongClickListenerC543892 f124617a;

    /* renamed from: b */
    private final View f124618b;

    static {
        Covode.recordClassIndex(64103);
    }

    View$OnClickListenerC54400k(AbstractC54386c.View$OnLongClickListenerC543892 r1, View view) {
        this.f124617a = r1;
        this.f124618b = view;
    }

    public final void onClick(View view) {
        C53688g.C53689a a;
        ClickAgent.onClick(view);
        AbstractC54386c.View$OnLongClickListenerC543892 r5 = this.f124617a;
        Activity a2 = C23154c.m43640a(this.f124618b.getContext());
        if (!(a2 == null || (a = C53688g.m98957a(r5.f124604c)) == null)) {
            C53688g.m98963a(a, a2, "2");
            String sb = new StringBuilder().append(r5.f124604c.getSender()).toString();
            if (a.f123202h == 3) {
                C54603a.m100104a("group_chat_long_press", sb, "im");
            } else {
                C55059b.m100699d(sb, "click_head");
            }
        }
        C53627f.m98869a(AbstractC54386c.this.f124584n.getChatType() == 3, "report");
    }
}
