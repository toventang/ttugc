package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.d */
public final class C7682d {
    @AbstractC27891c(mo46611a = "msg_id")

    /* renamed from: a */
    public final long f19025a;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: b */
    public final User f19026b;

    static {
        Covode.recordClassIndex(8464);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7682d)) {
            return false;
        }
        C7682d dVar = (C7682d) obj;
        return this.f19025a == dVar.f19025a && C89219l.m154714a(this.f19026b, dVar.f19026b);
    }

    public final String toString() {
        return "EmoteChatResult(msgId=" + this.f19025a + ", user=" + this.f19026b + ")";
    }

    public final int hashCode() {
        int i;
        long j = this.f19025a;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        User user = this.f19026b;
        if (user != null) {
            i = user.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }
}
