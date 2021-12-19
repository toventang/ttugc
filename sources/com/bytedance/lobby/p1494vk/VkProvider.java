package com.bytedance.lobby.p1494vk;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.p4501vk.api.sdk.C87816VK;

/* renamed from: com.bytedance.lobby.vk.VkProvider */
class VkProvider<T> extends BaseProvider<T> {
    static {
        Covode.recordClassIndex(24541);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    /* renamed from: d */
    public final void mo34346d() {
        C87816VK.m152824a(this.f3923a);
    }

    VkProvider(C20892d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }
}
