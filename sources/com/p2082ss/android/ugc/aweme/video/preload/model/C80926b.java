package com.p2082ss.android.ugc.aweme.video.preload.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.video.preload.model.b */
public final class C80926b {
    @AbstractC27891c(mo46611a = "video_duration_from")

    /* renamed from: a */
    public final long f180926a = 0;
    @AbstractC27891c(mo46611a = "video_duration_to")

    /* renamed from: b */
    public final long f180927b = 0;
    @AbstractC27891c(mo46611a = "remain_to_stop")

    /* renamed from: c */
    public final long f180928c = 10000;
    @AbstractC27891c(mo46611a = "remain_to_start")

    /* renamed from: d */
    public final long f180929d = 15000;
    @AbstractC27891c(mo46611a = "preload_safe_pos_offset")

    /* renamed from: e */
    public final long f180930e = 0;
    @AbstractC27891c(mo46611a = "cache_duration")

    /* renamed from: f */
    public final int f180931f = 15;
    @AbstractC27891c(mo46611a = "net_speed_factor")

    /* renamed from: g */
    public final float f180932g = 3.0f;

    static {
        Covode.recordClassIndex(94228);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80926b)) {
            return false;
        }
        C80926b bVar = (C80926b) obj;
        return this.f180926a == bVar.f180926a && this.f180927b == bVar.f180927b && this.f180928c == bVar.f180928c && this.f180929d == bVar.f180929d && this.f180930e == bVar.f180930e && this.f180931f == bVar.f180931f && Float.compare(this.f180932g, bVar.f180932g) == 0;
    }

    public final String toString() {
        return "BufferThreshold(videoDurationFrom=" + this.f180926a + ", videoDurationTo=" + this.f180927b + ", remainToStop=" + this.f180928c + ", remainToStart=" + this.f180929d + ", preloadSafePosOffset=" + this.f180930e + ", cacheDuration=" + this.f180931f + ", netSpeedFactor=" + this.f180932g + ")";
    }

    private C80926b() {
    }

    public final int hashCode() {
        long j = this.f180926a;
        long j2 = this.f180927b;
        long j3 = this.f180928c;
        long j4 = this.f180929d;
        long j5 = this.f180930e;
        return (((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f180931f) * 31) + Float.floatToIntBits(this.f180932g);
    }
}
