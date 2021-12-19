package com.bytedance.android.livesdk.chatroom.backroom.p483b;

import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.b.b */
public final class C7337b implements AbstractC7336a {
    static {
        Covode.recordClassIndex(8101);
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.p483b.AbstractC7336a
    /* renamed from: a */
    public final boolean mo13572a(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        Long l;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        C89219l.m154721d(stackContext, "");
        Long l2 = null;
        if (enterRoomConfig == null || (roomsData2 = enterRoomConfig.f28233c) == null) {
            l = null;
        } else {
            l = Long.valueOf(roomsData2.f28301R);
        }
        if (!(enterRoomConfig2 == null || (roomsData = enterRoomConfig2.f28233c) == null)) {
            l2 = Long.valueOf(roomsData.f28301R);
        }
        return C89219l.m154714a(l, l2);
    }
}
