package com.bytedance.android.livesdk.chatroom.backroom.p483b;

import com.bytedance.android.livesdk.chatroom.backroom.p487f.C7353a;
import com.bytedance.android.livesdk.chatroom.backroom.p487f.C7354b;
import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.b.c */
public final class C7338c implements AbstractC7336a {
    static {
        Covode.recordClassIndex(8102);
    }

    @Override // com.bytedance.android.livesdk.chatroom.backroom.p483b.AbstractC7336a
    /* renamed from: a */
    public final boolean mo13572a(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        String str;
        C89219l.m154721d(stackContext, "");
        if (enterRoomConfig2 != null) {
            str = C7353a.m15257a(enterRoomConfig2);
        } else {
            str = null;
        }
        return C89070n.m154556a((Iterable) ((List) C7354b.f18229a.getValue()), (Object) str);
    }
}
