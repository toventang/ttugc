package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.v */
public final class C62682v {

    /* renamed from: a */
    public final int f142110a;

    /* renamed from: b */
    public final String f142111b;

    static {
        Covode.recordClassIndex(73485);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62682v)) {
            return false;
        }
        C62682v vVar = (C62682v) obj;
        return this.f142110a == vVar.f142110a && C89219l.m154714a(this.f142111b, vVar.f142111b);
    }

    public final int hashCode() {
        int i = this.f142110a * 31;
        String str = this.f142111b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationLiveRequestParam(pushStatus=" + this.f142110a + ", secToUserId=" + this.f142111b + ")";
    }

    public C62682v(int i, String str) {
        C89219l.m154721d(str, "");
        this.f142110a = i;
        this.f142111b = str;
    }
}
