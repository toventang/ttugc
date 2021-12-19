package com.bytedance.android.live.core.p218f;

import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.live.core.f.s */
public final class C3958s {
    static {
        Covode.recordClassIndex(4487);
    }

    /* renamed from: a */
    public static boolean m9645a(DataChannel dataChannel) {
        boolean z;
        if (dataChannel == null) {
            return false;
        }
        Room room = (Room) dataChannel.mo28318b(C9093de.class);
        if (room == null || !(room.getStreamType() == EnumC11728i.VIDEO || room.getStreamType() == EnumC11728i.SCREEN_RECORD)) {
            z = false;
        } else {
            z = true;
        }
        if (!((Boolean) dataChannel.mo28318b(C9119ed.class)).booleanValue() || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m9646b(DataChannel dataChannel) {
        Room room;
        if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || (room.getStreamType() != EnumC11728i.VIDEO && room.getStreamType() != EnumC11728i.THIRD_PARTY && room.getStreamType() != EnumC11728i.SCREEN_RECORD)) {
            return false;
        }
        return true;
    }
}
