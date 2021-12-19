package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.h.e */
public final /* synthetic */ class View$OnClickListenerC41197e implements View.OnClickListener {

    /* renamed from: a */
    private final C41178b f96293a;

    static {
        Covode.recordClassIndex(49080);
    }

    View$OnClickListenerC41197e(C41178b bVar) {
        this.f96293a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C41178b bVar = this.f96293a;
        Intent intent = new Intent();
        intent.putExtra("send_video", bVar.mo81109aD());
        bVar.f183419bv.setResult(-1, intent);
        bVar.f183419bv.finish();
    }
}
