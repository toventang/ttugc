package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.network.model.RequestPb;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveMtPbRequestsSetting {
    @Group(isDefault = true, value = "default group")
    private static final RequestPb DEFAULT;
    public static final LiveMtPbRequestsSetting INSTANCE = new LiveMtPbRequestsSetting();

    private LiveMtPbRequestsSetting() {
    }

    public final RequestPb getValue() {
        RequestPb requestPb = (RequestPb) SettingsManager.INSTANCE.getValueSafely(LiveMtPbRequestsSetting.class);
        if (requestPb == null) {
            return DEFAULT;
        }
        return requestPb;
    }

    static {
        Covode.recordClassIndex(10552);
        RequestPb defaultInstance = RequestPb.defaultInstance();
        C89219l.m154716b(defaultInstance, "");
        DEFAULT = defaultInstance;
    }
}
