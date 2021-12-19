package com.bytedance.android.livesdk.usercard;

import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4452v;
import com.bytedance.android.livesdk.event.C8447a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.usercard.j */
final /* synthetic */ class View$OnClickListenerC10968j implements View.OnClickListener {

    /* renamed from: a */
    private final View$OnClickListenerC10962f f26396a;

    static {
        Covode.recordClassIndex(12583);
    }

    View$OnClickListenerC10968j(View$OnClickListenerC10962f fVar) {
        this.f26396a = fVar;
    }

    public final void onClick(View view) {
        View$OnClickListenerC10962f fVar = this.f26396a;
        if (fVar.f26368d.getSecret() == 1) {
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9660a((int) R.string.e7y, fVar.f26368d.displayId), 0);
        } else if (fVar.f26367c != null) {
            fVar.f26367c.mo28320c(C4452v.class, new C8447a(fVar.f26368d, "user_profile"));
            view.setClickable(false);
            if (fVar.f26375k != null) {
                fVar.f26375k.mo17844a();
            }
        }
    }
}
