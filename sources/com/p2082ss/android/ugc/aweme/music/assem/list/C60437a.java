package com.p2082ss.android.ugc.aweme.music.assem.list;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.a */
public final class C60437a {

    /* renamed from: a */
    public final int f137635a;

    /* renamed from: b */
    public final String f137636b;

    /* renamed from: c */
    public final String f137637c;

    /* renamed from: d */
    public final int f137638d;

    /* renamed from: e */
    public final int f137639e = 10;

    /* renamed from: f */
    public final boolean f137640f;

    static {
        Covode.recordClassIndex(70987);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60437a)) {
            return false;
        }
        C60437a aVar = (C60437a) obj;
        return this.f137635a == aVar.f137635a && C89219l.m154714a(this.f137636b, aVar.f137636b) && C89219l.m154714a(this.f137637c, aVar.f137637c) && this.f137638d == aVar.f137638d && this.f137639e == aVar.f137639e && this.f137640f == aVar.f137640f;
    }

    public final int hashCode() {
        int i = this.f137635a * 31;
        String str = this.f137636b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f137637c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (((((hashCode + i2) * 31) + this.f137638d) * 31) + this.f137639e) * 31;
        boolean z = this.f137640f;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "CursorData(requestUUID=" + this.f137635a + ", userId=" + this.f137636b + ", secUserId=" + this.f137637c + ", cursor=" + this.f137638d + ", count=" + this.f137639e + ", requestPinnedList=" + this.f137640f + ")";
    }

    public C60437a(int i, String str, String str2, int i2, boolean z) {
        this.f137635a = i;
        this.f137636b = str;
        this.f137637c = str2;
        this.f137638d = i2;
        this.f137640f = z;
    }
}
