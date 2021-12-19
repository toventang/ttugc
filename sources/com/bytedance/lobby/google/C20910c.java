package com.bytedance.lobby.google;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.AbstractC25486q;
import com.google.android.gms.common.api.Status;

/* renamed from: com.bytedance.lobby.google.c */
final /* synthetic */ class C20910c implements AbstractC25486q {

    /* renamed from: a */
    private final LobbyViewModel f49437a;

    static {
        Covode.recordClassIndex(24508);
    }

    C20910c(LobbyViewModel lobbyViewModel) {
        this.f49437a = lobbyViewModel;
    }

    @Override // com.google.android.gms.common.api.AbstractC25486q
    /* renamed from: a */
    public final void mo34357a(AbstractC25485p pVar) {
        LobbyViewModel lobbyViewModel = this.f49437a;
        Status status = (Status) pVar;
        if (GoogleAuth.f49414b) {
            status.mo41477c();
        }
        AuthResult.C20883a aVar = new AuthResult.C20883a("google", 2);
        aVar.f49377a = status.mo41477c();
        lobbyViewModel.mo34361b(aVar.mo34319a());
    }
}
