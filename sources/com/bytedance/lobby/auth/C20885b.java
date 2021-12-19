package com.bytedance.lobby.auth;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyViewModel;

/* renamed from: com.bytedance.lobby.auth.b */
public final class C20885b {
    static {
        Covode.recordClassIndex(24473);
    }

    /* renamed from: a */
    public static void m39240a(LobbyViewModel lobbyViewModel, String str) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            AuthResult.C20883a aVar = new AuthResult.C20883a(str, 2);
            aVar.f49377a = false;
            aVar.f49378b = new C20891c(1, "[" + str + "] provider currently does not support logging out, please contact Lobby developer for further details.");
            lobbyViewModel.mo34361b(aVar.mo34319a());
        }
    }

    /* renamed from: a */
    public static void m39241a(LobbyViewModel lobbyViewModel, String str, int i) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            AuthResult.C20883a aVar = new AuthResult.C20883a(str, i);
            aVar.f49377a = false;
            aVar.f49378b = new C20891c(2, "[" + str + "] provider is not available, make sure you have added it to your dependency.", "before_goto_URL");
            lobbyViewModel.mo34361b(aVar.mo34319a());
        }
    }
}
