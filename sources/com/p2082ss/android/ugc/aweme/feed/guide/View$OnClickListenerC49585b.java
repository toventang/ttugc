package com.p2082ss.android.ugc.aweme.feed.guide;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.login.C58957c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.guide.b */
public final /* synthetic */ class View$OnClickListenerC49585b implements View.OnClickListener {

    /* renamed from: a */
    private final EmptyGuideV2 f114088a;

    static {
        Covode.recordClassIndex(58431);
    }

    View$OnClickListenerC49585b(EmptyGuideV2 emptyGuideV2) {
        this.f114088a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EmptyGuideV2 emptyGuideV2 = this.f114088a;
        C58957c.m108320a(emptyGuideV2.f114038e, "homepage_follow", "click_follow_tab", (Bundle) null, new AbstractC34543f() {
            /* class com.p2082ss.android.ugc.aweme.feed.guide.EmptyGuideV2.C495712 */

            static {
                Covode.recordClassIndex(58414);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: b */
            public final void mo57674b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: a */
            public final void mo57673a() {
                EmptyGuideV2.this.mo81330a(true);
            }
        });
    }
}
