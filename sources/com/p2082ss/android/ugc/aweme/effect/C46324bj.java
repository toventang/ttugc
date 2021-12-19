package com.p2082ss.android.ugc.aweme.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.effect.bj */
public final /* synthetic */ class C46324bj implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107980a;

    static {
        Covode.recordClassIndex(54901);
    }

    public C46324bj(C46267ac acVar) {
        this.f107980a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C46267ac acVar = this.f107980a;
        if (obj != null && acVar.f107874b.editMusicSyncMode) {
            acVar.f107840A.mo56247H();
        }
    }
}
