package com.bytedance.lobby.kakao;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.kakao.auth.KakaoSDK;

public class KakaoProvider<T> extends BaseProvider<T> {
    static {
        Covode.recordClassIndex(24530);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    /* renamed from: d */
    public final void mo34346d() {
        if (KakaoSDK.getAdapter() == null) {
            KakaoSDK.init(new C20923a());
        }
    }

    KakaoProvider(C20892d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }
}
