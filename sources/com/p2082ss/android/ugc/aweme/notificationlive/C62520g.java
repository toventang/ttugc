package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.g */
public final class C62520g {

    /* renamed from: a */
    public final boolean f141799a;

    /* renamed from: b */
    public final String f141800b;

    /* renamed from: c */
    public final String f141801c;

    static {
        Covode.recordClassIndex(73316);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62520g)) {
            return false;
        }
        C62520g gVar = (C62520g) obj;
        return this.f141799a == gVar.f141799a && C89219l.m154714a(this.f141800b, gVar.f141800b) && C89219l.m154714a(this.f141801c, gVar.f141801c);
    }

    public final int hashCode() {
        boolean z = this.f141799a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f141800b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f141801c;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "NotificationGameRequestParam(enableNotice=" + this.f141799a + ", creativeId=" + this.f141800b + ", logId=" + this.f141801c + ")";
    }

    public C62520g(boolean z, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f141799a = z;
        this.f141800b = str;
        this.f141801c = str2;
    }
}
