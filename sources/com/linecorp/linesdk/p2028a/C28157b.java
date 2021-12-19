package com.linecorp.linesdk.p2028a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

/* renamed from: com.linecorp.linesdk.a.b */
public final class C28157b {

    /* renamed from: a */
    public final long f65885a;

    /* renamed from: b */
    public final List<String> f65886b;

    /* renamed from: c */
    private final String f65887c;

    static {
        Covode.recordClassIndex(34098);
    }

    public final int hashCode() {
        long j = this.f65885a;
        return (((Integer.valueOf(this.f65887c).intValue() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f65886b.hashCode();
    }

    public final String toString() {
        return "AccessTokenVerificationResult{expiresInMillis=" + this.f65885a + ", channelId=" + this.f65887c + ", permissions=" + this.f65886b + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28157b bVar = (C28157b) obj;
        if (this.f65887c.equals(bVar.f65887c) && this.f65885a == bVar.f65885a) {
            return this.f65886b.equals(bVar.f65886b);
        }
        return false;
    }

    public C28157b(String str, long j, List<String> list) {
        this.f65887c = str;
        this.f65885a = j;
        this.f65886b = Collections.unmodifiableList(list);
    }
}
