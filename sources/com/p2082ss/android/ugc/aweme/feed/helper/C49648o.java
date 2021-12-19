package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.o */
public final class C49648o {

    /* renamed from: a */
    public String f114274a = "";

    /* renamed from: b */
    public final String f114275b;

    /* renamed from: c */
    public final int f114276c;

    /* renamed from: d */
    public final long f114277d;

    /* renamed from: e */
    public final String f114278e;

    static {
        Covode.recordClassIndex(58495);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49648o)) {
            return false;
        }
        C49648o oVar = (C49648o) obj;
        return C89219l.m154714a(this.f114275b, oVar.f114275b) && this.f114276c == oVar.f114276c && this.f114277d == oVar.f114277d && C89219l.m154714a(this.f114278e, oVar.f114278e);
    }

    public final String toString() {
        return "NewUserBehavior(gid=" + this.f114275b + ", action=" + this.f114276c + ", actionTime=" + this.f114277d + ", eventType=" + this.f114278e + ")";
    }

    public final int hashCode() {
        int i;
        String str = this.f114275b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f114277d;
        int i3 = ((((i * 31) + this.f114276c) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f114278e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public C49648o(String str, int i, long j, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f114275b = str;
        this.f114276c = i;
        this.f114277d = j;
        this.f114278e = str2;
    }
}
