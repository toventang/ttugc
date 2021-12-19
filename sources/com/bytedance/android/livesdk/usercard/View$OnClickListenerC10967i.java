package com.bytedance.android.livesdk.usercard;

import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4407au;
import com.bytedance.android.livesdk.event.C8447a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.usercard.i */
final /* synthetic */ class View$OnClickListenerC10967i implements View.OnClickListener {

    /* renamed from: a */
    private final View$OnClickListenerC10962f f26395a;

    static {
        Covode.recordClassIndex(12582);
    }

    View$OnClickListenerC10967i(View$OnClickListenerC10962f fVar) {
        this.f26395a = fVar;
    }

    public final void onClick(View view) {
        View$OnClickListenerC10962f fVar = this.f26395a;
        if (fVar.f26368d.getSecret() == 1) {
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9660a((int) R.string.e7y, fVar.f26368d.displayId), 0);
        } else if (fVar.f26367c != null) {
            fVar.f26367c.mo28320c(C4407au.class, new C8447a(fVar.f26368d, "user_profile"));
            view.setClickable(false);
            if (fVar.f26375k != null) {
                fVar.f26375k.mo17844a();
            }
        }
    }
}
