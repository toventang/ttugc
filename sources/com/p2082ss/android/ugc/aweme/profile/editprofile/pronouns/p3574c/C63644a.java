package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3574c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.c.a */
public final class C63644a {

    /* renamed from: a */
    public final String f144332a;

    /* renamed from: b */
    public final int f144333b;

    static {
        Covode.recordClassIndex(74960);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63644a)) {
            return false;
        }
        C63644a aVar = (C63644a) obj;
        return C89219l.m154714a(this.f144332a, aVar.f144332a) && this.f144333b == aVar.f144333b;
    }

    public final int hashCode() {
        String str = this.f144332a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f144333b;
    }

    public final String toString() {
        return "KeywordWithSelectedPronounsNum(keyword=" + this.f144332a + ", num=" + this.f144333b + ")";
    }

    public C63644a(String str, int i) {
        C89219l.m154721d(str, "");
        this.f144332a = str;
        this.f144333b = i;
    }
}
