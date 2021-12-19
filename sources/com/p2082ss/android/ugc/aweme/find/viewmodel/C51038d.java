package com.p2082ss.android.ugc.aweme.find.viewmodel;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.viewmodel.d */
public final class C51038d {

    /* renamed from: a */
    public final int f117727a = 20;

    /* renamed from: b */
    public final int f117728b;

    /* renamed from: c */
    public final String f117729c;

    static {
        Covode.recordClassIndex(60222);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51038d)) {
            return false;
        }
        C51038d dVar = (C51038d) obj;
        return this.f117727a == dVar.f117727a && this.f117728b == dVar.f117728b && C89219l.m154714a(this.f117729c, dVar.f117729c);
    }

    public final int hashCode() {
        int i = ((this.f117727a * 31) + this.f117728b) * 31;
        String str = this.f117729c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FindFriendsRequestParam(count=" + this.f117727a + ", cursor=" + this.f117728b + ", recImprUsers=" + this.f117729c + ")";
    }

    public C51038d(int i, String str) {
        C89219l.m154721d(str, "");
        this.f117728b = i;
        this.f117729c = str;
    }
}
