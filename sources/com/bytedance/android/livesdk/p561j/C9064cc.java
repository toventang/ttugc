package com.bytedance.android.livesdk.p561j;

import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.j.cc */
public final class C9064cc {
    static {
        Covode.recordClassIndex(9968);
    }

    /* renamed from: a */
    public static final boolean m17355a(DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        Boolean bool2;
        if (dataChannel == null || (bool2 = (Boolean) dataChannel.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool2.booleanValue();
        }
        if (z || EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            return true;
        }
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9057bw.class)) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
