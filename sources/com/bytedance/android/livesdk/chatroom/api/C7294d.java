package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.d */
public final class C7294d {
    static {
        Covode.recordClassIndex(8057);
    }

    /* renamed from: a */
    public static AbstractC88403ab<C5831c<C7666e>> m15197a(long j, long j2) {
        return m15198a((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class), j, j2);
    }

    /* renamed from: a */
    private static AbstractC88403ab<C5831c<C7666e>> m15198a(LinkApi linkApi, long j, long j2) {
        return linkApi.getList(j, j2, 4).mo142925c(C7295e.f18129a);
    }
}
