package com.bytedance.android.livesdk.chatroom.backroom.p483b;

import com.bytedance.android.livesdk.chatroom.backroom.p487f.C7353a;
import com.bytedance.android.livesdk.chatroom.backroom.p487f.C7354b;
import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.b.d */
public final class C7339d implements AbstractC7336a {
    static {
        Covode.recordClassIndex(8103);
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
        if (C7354b.m15258a().contains("jump_source_all") || C89070n.m154556a((Iterable) C7354b.m15258a(), (Object) str)) {
            return true;
        }
        return false;
    }
}
