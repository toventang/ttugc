package com.linecorp.linesdk.p2028a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.linecorp.linesdk.a.d */
public final class C28160d {

    /* renamed from: a */
    public final String f65891a;

    /* renamed from: b */
    public final long f65892b;

    /* renamed from: c */
    public final long f65893c;

    /* renamed from: d */
    public final String f65894d;

    static {
        Covode.recordClassIndex(34101);
    }

    public final int hashCode() {
        long j = this.f65892b;
        long j2 = this.f65893c;
        return (((((this.f65891a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f65894d.hashCode();
    }

    public final String toString() {
        return "InternalAccessToken{accessToken='#####', expiresInMillis=" + this.f65892b + ", issuedClientTimeMillis=" + this.f65893c + ", refreshToken='" + this.f65894d + '\'' + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28160d dVar = (C28160d) obj;
        if (this.f65892b == dVar.f65892b && this.f65893c == dVar.f65893c && this.f65891a.equals(dVar.f65891a)) {
            return this.f65894d.equals(dVar.f65894d);
        }
        return false;
    }

    public C28160d(String str, long j, long j2, String str2) {
        this.f65891a = str;
        this.f65892b = j;
        this.f65893c = j2;
        this.f65894d = str2;
    }
}
