package com.bytedance.android.livesdk.feed.p530f;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.f.f */
public final /* synthetic */ class View$OnClickListenerC8580f implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC8567a f21202a;

    static {
        Covode.recordClassIndex(9436);
    }

    View$OnClickListenerC8580f(AbstractC8567a aVar) {
        this.f21202a = aVar;
    }

    public final void onClick(View view) {
        AbstractC8567a aVar = this.f21202a;
        if (System.currentTimeMillis() - aVar.f21188r > 3000) {
            aVar.f21188r = System.currentTimeMillis();
            aVar.mo14871b("click");
            if (aVar.getContext() != null) {
                ((IHostAction) C6193a.m13435a(IHostAction.class)).handleSchema(aVar.getContext(), "sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={request_from:explore}", new Bundle());
            }
        }
    }
}
