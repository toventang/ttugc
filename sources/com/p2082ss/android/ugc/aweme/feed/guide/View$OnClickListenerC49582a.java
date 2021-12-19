package com.p2082ss.android.ugc.aweme.feed.guide;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.follow.p2996b.C51074c;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.guide.a */
public final /* synthetic */ class View$OnClickListenerC49582a implements View.OnClickListener {

    /* renamed from: a */
    private final EmptyGuideV2 f114086a;

    static {
        Covode.recordClassIndex(58428);
    }

    View$OnClickListenerC49582a(EmptyGuideV2 emptyGuideV2) {
        this.f114086a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        EmptyGuideV2 emptyGuideV2 = this.f114086a;
        C58957c.m108320a(emptyGuideV2.f114038e, "homepage_follow", "click_follow_tab", (Bundle) null, new AbstractC34543f() {
            /* class com.p2082ss.android.ugc.aweme.feed.guide.EmptyGuideV2.C495701 */

            static {
                Covode.recordClassIndex(58413);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: b */
            public final void mo57674b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: a */
            public final void mo57673a() {
                EmptyGuideV2.this.mo81330a(true);
                AbstractC81915c.m141874a(new C51074c());
            }
        });
    }
}
