package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.s */
public final class C71796s {

    /* renamed from: a */
    public final boolean f160903a;

    /* renamed from: b */
    public final long f160904b;

    /* renamed from: c */
    public final long f160905c;

    static {
        Covode.recordClassIndex(84341);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71796s)) {
            return false;
        }
        C71796s sVar = (C71796s) obj;
        return this.f160903a == sVar.f160903a && this.f160904b == sVar.f160904b && this.f160905c == sVar.f160905c;
    }

    public final String toString() {
        return "RestoreUIConfig(isMulti=" + this.f160903a + ", startTime=" + this.f160904b + ", selectTime=" + this.f160905c + ")";
    }

    public final int hashCode() {
        boolean z = this.f160903a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long j = this.f160904b;
        long j2 = this.f160905c;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C71796s(boolean z, long j, long j2) {
        this.f160903a = z;
        this.f160904b = j;
        this.f160905c = j2;
    }
}
