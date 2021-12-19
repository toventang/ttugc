package com.bytedance.lobby.google;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.AbstractC25486q;

/* renamed from: com.bytedance.lobby.google.d */
final /* synthetic */ class C20911d implements AbstractC25486q {

    /* renamed from: a */
    private final GoogleAuth f49438a;

    /* renamed from: b */
    private final ActivityC0945e f49439b;

    /* renamed from: c */
    private final AbstractC25357i f49440c;

    static {
        Covode.recordClassIndex(24509);
    }

    C20911d(GoogleAuth googleAuth, ActivityC0945e eVar, AbstractC25357i iVar) {
        this.f49438a = googleAuth;
        this.f49439b = eVar;
        this.f49440c = iVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC25486q
    /* renamed from: a */
    public final void mo34357a(AbstractC25485p pVar) {
        GoogleAuth.m39269a(this.f49439b, this.f49440c);
    }
}
