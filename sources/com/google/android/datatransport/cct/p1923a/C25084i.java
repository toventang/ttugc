package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.a.i */
public final class C25084i extends AbstractC25099s {

    /* renamed from: a */
    private final long f59505a;

    static {
        Covode.recordClassIndex(30449);
    }

    @Override // com.google.android.datatransport.cct.p1923a.AbstractC25099s
    /* renamed from: a */
    public final long mo41044a() {
        return this.f59505a;
    }

    public final int hashCode() {
        long j = this.f59505a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f59505a + "}";
    }

    C25084i(long j) {
        this.f59505a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC25099s) || this.f59505a != ((AbstractC25099s) obj).mo41044a()) {
            return false;
        }
        return true;
    }
}
