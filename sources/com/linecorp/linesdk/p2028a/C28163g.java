package com.linecorp.linesdk.p2028a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.linecorp.linesdk.a.g */
public final class C28163g {

    /* renamed from: a */
    public final String f65899a;

    /* renamed from: b */
    public final long f65900b;

    /* renamed from: c */
    public final String f65901c;

    static {
        Covode.recordClassIndex(34104);
    }

    public final int hashCode() {
        int i;
        long j = this.f65900b;
        int hashCode = ((this.f65899a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f65901c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RefreshTokenResult{accessToken='#####', expiresInMillis=" + this.f65900b + ", refreshToken='#####'}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C28163g gVar = (C28163g) obj;
            if (this.f65900b != gVar.f65900b || !this.f65899a.equals(gVar.f65899a)) {
                return false;
            }
            String str = this.f65901c;
            String str2 = gVar.f65901c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public C28163g(String str, long j, String str2) {
        this.f65899a = str;
        this.f65900b = j;
        this.f65901c = str2;
    }
}
