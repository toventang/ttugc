package com.bytedance.android.live.p378m;

import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.live.m.c */
public final class C5762c {
    static {
        Covode.recordClassIndex(6361);
    }

    /* renamed from: a */
    public static final boolean m12632a(DataChannel dataChannel) {
        Room c = m12634c(dataChannel);
        if (c == null || c.questionVersion == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final Room m12634c(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Room) dataChannel.mo28318b(C9093de.class);
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m12633b(DataChannel dataChannel) {
        RoomAuthStatus roomAuthStatus;
        Room c = m12634c(dataChannel);
        if (c == null || (roomAuthStatus = c.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableQuestion()) {
            return false;
        }
        return true;
    }
}
