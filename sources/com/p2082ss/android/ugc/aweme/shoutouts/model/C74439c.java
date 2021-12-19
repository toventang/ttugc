package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.c */
public final class C74439c {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f167402a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f167403b;
    @AbstractC27891c(mo46611a = "order_detail")

    /* renamed from: c */
    public final C74438b f167404c;

    static {
        Covode.recordClassIndex(87229);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74439c)) {
            return false;
        }
        C74439c cVar = (C74439c) obj;
        return this.f167402a == cVar.f167402a && C89219l.m154714a(this.f167403b, cVar.f167403b) && C89219l.m154714a(this.f167404c, cVar.f167404c);
    }

    public final int hashCode() {
        int i = this.f167402a * 31;
        String str = this.f167403b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        C74438b bVar = this.f167404c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShoutoutsOrderGetResp(statusCode=" + this.f167402a + ", statusMsg=" + this.f167403b + ", orderStruct=" + this.f167404c + ")";
    }
}
