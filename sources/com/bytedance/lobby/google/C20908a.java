package com.bytedance.lobby.google;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.AbstractC25486q;

/* renamed from: com.bytedance.lobby.google.a */
final /* synthetic */ class C20908a implements AbstractC25486q {

    /* renamed from: a */
    private final GoogleAuth f49433a;

    /* renamed from: b */
    private final ActivityC0945e f49434b;

    /* renamed from: c */
    private final AbstractC25357i f49435c;

    static {
        Covode.recordClassIndex(24506);
    }

    C20908a(GoogleAuth googleAuth, ActivityC0945e eVar, AbstractC25357i iVar) {
        this.f49433a = googleAuth;
        this.f49434b = eVar;
        this.f49435c = iVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC25486q
    /* renamed from: a */
    public final void mo34357a(AbstractC25485p pVar) {
        GoogleAuth.m39269a(this.f49434b, this.f49435c);
    }
}
