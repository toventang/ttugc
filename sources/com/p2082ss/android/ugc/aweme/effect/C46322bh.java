package com.p2082ss.android.ugc.aweme.effect;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88290o;

/* renamed from: com.ss.android.ugc.aweme.effect.bh */
public final /* synthetic */ class C46322bh implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107978a;

    static {
        Covode.recordClassIndex(54899);
    }

    public C46322bh(C46267ac acVar) {
        this.f107978a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C46267ac acVar = this.f107978a;
        C88290o oVar = (C88290o) obj;
        if (oVar != null && oVar.f200334c == 0 && !TextUtils.isEmpty(oVar.f200332a) && oVar.f200333b > 0) {
            CharSequence charSequence = oVar.f200332a;
            long j = oVar.f200333b;
            if (acVar.f107886n != null) {
                acVar.f107886n.setVisibility(0);
                acVar.f107886n.postDelayed(new RunnableC46323bi(acVar), j);
            }
            if (acVar.f107887o != null) {
                acVar.f107887o.setText(charSequence);
            }
        }
    }
}
