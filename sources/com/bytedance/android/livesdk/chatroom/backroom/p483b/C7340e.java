package com.bytedance.android.livesdk.chatroom.backroom.p483b;

import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.b.e */
public final class C7340e implements AbstractC7336a {
    static {
        Covode.recordClassIndex(8104);
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.p483b.AbstractC7336a
    /* renamed from: a */
    public final boolean mo13572a(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        EnterRoomConfig.RoomsData roomsData;
        C89219l.m154721d(stackContext, "");
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.f28233c) == null || roomsData.f28301R <= 0) {
            return true;
        }
        return false;
    }
}
