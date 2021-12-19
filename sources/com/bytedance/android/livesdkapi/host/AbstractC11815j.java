package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.host.j */
public interface AbstractC11815j extends AbstractC2953a {
    static {
        Covode.recordClassIndex(13513);
    }

    /* renamed from: a */
    void mo18877a(Context context, EnterRoomConfig enterRoomConfig, long j);

    /* renamed from: a */
    void mo18878a(Context context, EnterRoomConfig enterRoomConfig, String str);

    /* renamed from: a */
    boolean mo18879a(Context context, EnterRoomConfig enterRoomConfig);

    /* renamed from: b */
    void mo18880b(Context context, EnterRoomConfig enterRoomConfig);
}
