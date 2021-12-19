package com.bytedance.p1399im.core.p1404a;

import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.a.m */
public class C19499m implements Serializable {
    @AbstractC27891c(mo46611a = "callback_too_long_ms")
    public long callbackTooLongMs = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    @AbstractC27891c(mo46611a = "enable")
    public int enable;
    @AbstractC27891c(mo46611a = "execute_too_long_ms")
    public long executeTooLongMs = 8000;
    @AbstractC27891c(mo46611a = "timeout_duration_ms")
    public long timeoutDurationMs = 8000;

    static {
        Covode.recordClassIndex(22343);
    }
}
