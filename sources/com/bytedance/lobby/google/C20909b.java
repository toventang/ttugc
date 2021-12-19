package com.bytedance.lobby.google;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.AbstractC25486q;
import com.google.android.gms.common.api.Status;

/* renamed from: com.bytedance.lobby.google.b */
final /* synthetic */ class C20909b implements AbstractC25486q {

    /* renamed from: a */
    private final AbstractC25486q f49436a;

    static {
        Covode.recordClassIndex(24507);
    }

    C20909b(AbstractC25486q qVar) {
        this.f49436a = qVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC25486q
    /* renamed from: a */
    public final void mo34357a(AbstractC25485p pVar) {
        AbstractC25486q qVar = this.f49436a;
        Status status = (Status) pVar;
        if (GoogleAuth.f49414b) {
            status.mo41477c();
        }
        if (qVar != null) {
            qVar.mo34357a(status);
        }
    }
}
