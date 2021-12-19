package com.bytedance.ies.p1208im.core.p1223d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.d.d */
public final class C17508d {
    @AbstractC27891c(mo46611a = "msg_type")

    /* renamed from: a */
    public final int f41901a;
    @AbstractC27891c(mo46611a = "err_code")

    /* renamed from: b */
    public final int f41902b;
    @AbstractC27891c(mo46611a = "err_desc")

    /* renamed from: c */
    public final String f41903c;
    @AbstractC27891c(mo46611a = "log_id")

    /* renamed from: d */
    public final String f41904d;

    static {
        Covode.recordClassIndex(19997);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17508d)) {
            return false;
        }
        C17508d dVar = (C17508d) obj;
        return this.f41901a == dVar.f41901a && this.f41902b == dVar.f41902b && C89219l.m154714a(this.f41903c, dVar.f41903c) && C89219l.m154714a(this.f41904d, dVar.f41904d);
    }

    public final int hashCode() {
        int i = ((this.f41901a * 31) + this.f41902b) * 31;
        String str = this.f41903c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41904d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FeedBackModel(msgType=" + this.f41901a + ", errorCode=" + this.f41902b + ", errorDesc=" + this.f41903c + ", logId=" + this.f41904d + ")";
    }

    private /* synthetic */ C17508d() {
        this(-1, 0, "", "");
    }

    public C17508d(int i, int i2, String str, String str2) {
        this.f41901a = i;
        this.f41902b = i2;
        this.f41903c = str;
        this.f41904d = str2;
    }
}
