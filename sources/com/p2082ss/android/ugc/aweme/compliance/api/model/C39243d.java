package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.d */
public final class C39243d {
    @AbstractC27891c(mo46611a = "direct_message")

    /* renamed from: a */
    public int f92685a;
    @AbstractC27891c(mo46611a = "group_chat_invite")

    /* renamed from: b */
    public int f92686b;

    static {
        Covode.recordClassIndex(46901);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39243d)) {
            return false;
        }
        C39243d dVar = (C39243d) obj;
        return this.f92685a == dVar.f92685a && this.f92686b == dVar.f92686b;
    }

    public final int hashCode() {
        return (this.f92685a * 31) + this.f92686b;
    }

    public final String toString() {
        return "ImSettings(directMessage=" + this.f92685a + ", groupChatInvite=" + this.f92686b + ")";
    }

    public C39243d(int i, int i2) {
        this.f92685a = i;
        this.f92686b = i2;
    }
}
