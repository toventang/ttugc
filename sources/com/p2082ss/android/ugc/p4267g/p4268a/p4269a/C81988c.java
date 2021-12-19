package com.p2082ss.android.ugc.p4267g.p4268a.p4269a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.g.a.a.c */
public final class C81988c {

    /* renamed from: a */
    public final String f183476a;

    /* renamed from: b */
    public final int f183477b;

    static {
        Covode.recordClassIndex(95803);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C81988c) {
                C81988c cVar = (C81988c) obj;
                if (!C89219l.m154714a((Object) this.f183476a, (Object) cVar.f183476a) || this.f183477b != cVar.f183477b) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f183476a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f183477b;
    }

    public final String toString() {
        return "IPPort(ip=" + this.f183476a + ", port=" + this.f183477b + ")";
    }

    public C81988c(String str, int i) {
        C89219l.m154719c(str, "");
        this.f183476a = str;
        this.f183477b = i;
    }
}
