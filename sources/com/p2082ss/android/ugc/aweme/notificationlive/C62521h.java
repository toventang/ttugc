package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.h */
public final class C62521h {
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: a */
    public final String f141802a;
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: b */
    public final int f141803b;

    static {
        Covode.recordClassIndex(73317);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62521h)) {
            return false;
        }
        C62521h hVar = (C62521h) obj;
        return C89219l.m154714a(this.f141802a, hVar.f141802a) && this.f141803b == hVar.f141803b;
    }

    public final int hashCode() {
        String str = this.f141802a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f141803b;
    }

    public final String toString() {
        return "NotificationGameStatus(statusMsg=" + this.f141802a + ", statusCode=" + this.f141803b + ")";
    }
}
