package com.p2082ss.android.ugc.aweme.video.preload.p4213a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.video.preload.a.d */
public final class C80825d {
    @AbstractC27891c(mo46611a = "enable_preload")

    /* renamed from: a */
    public final boolean f180767a;
    @AbstractC27891c(mo46611a = "preload_when_download_complete")

    /* renamed from: b */
    public final boolean f180768b;
    @AbstractC27891c(mo46611a = "preload_when_preload_next_video_done")

    /* renamed from: c */
    public final boolean f180769c;
    @AbstractC27891c(mo46611a = "preload_cover_cnt")

    /* renamed from: d */
    public final int f180770d;

    static {
        Covode.recordClassIndex(94122);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80825d)) {
            return false;
        }
        C80825d dVar = (C80825d) obj;
        return this.f180767a == dVar.f180767a && this.f180768b == dVar.f180768b && this.f180769c == dVar.f180769c && this.f180770d == dVar.f180770d;
    }

    public final int hashCode() {
        boolean z = this.f180767a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f180768b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f180769c) {
            i = 0;
        }
        return ((i9 + i) * 31) + this.f180770d;
    }

    public final String toString() {
        return "VideoCoverPreloadConfig(enablePreload=" + this.f180767a + ", preloadWhenDownloadComplete=" + this.f180768b + ", preloadWhenPreloadNextVideoDown=" + this.f180769c + ", preloadCoverCnt=" + this.f180770d + ")";
    }

    private C80825d() {
        this.f180767a = false;
        this.f180768b = false;
        this.f180769c = false;
        this.f180770d = 0;
    }

    public /* synthetic */ C80825d(byte b) {
        this();
    }
}
