package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88290o;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.aj */
final /* synthetic */ class C52108aj implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120030a;

    static {
        Covode.recordClassIndex(61489);
    }

    C52108aj(C52125f fVar) {
        this.f120030a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52125f fVar = this.f120030a;
        C88290o oVar = (C88290o) obj;
        if (oVar != null && oVar.f200334c == 0 && !TextUtils.isEmpty(oVar.f200332a) && oVar.f200333b > 0) {
            CharSequence charSequence = oVar.f200332a;
            long j = oVar.f200333b;
            if (fVar.f120104n != null) {
                fVar.f120104n.setVisibility(0);
                fVar.f120104n.postDelayed(new RunnableC52109ak(fVar), j);
            }
            if (fVar.f120105o != null) {
                fVar.f120105o.setText(charSequence);
            }
        }
    }
}
