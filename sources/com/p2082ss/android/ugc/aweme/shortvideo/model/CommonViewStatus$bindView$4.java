package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus$bindView$4 */
public final class CommonViewStatus$bindView$4 implements View.OnClickListener {
    final /* synthetic */ CommonViewStatus this$0;

    static {
        Covode.recordClassIndex(84570);
    }

    CommonViewStatus$bindView$4(CommonViewStatus commonViewStatus) {
        this.this$0 = commonViewStatus;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        CommonViewStatus commonViewStatus = this.this$0;
        C89219l.m154716b(view, "");
        commonViewStatus.click(view);
    }
}
