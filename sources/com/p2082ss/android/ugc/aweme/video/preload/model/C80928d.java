package com.p2082ss.android.ugc.aweme.video.preload.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.video.preload.model.d */
public final class C80928d {
    @AbstractC27891c(mo46611a = "fix_miss_callback_splash_feed_ad")

    /* renamed from: a */
    public final boolean f180953a;
    @AbstractC27891c(mo46611a = "fix_miss_callback_click")

    /* renamed from: b */
    public final boolean f180954b;
    @AbstractC27891c(mo46611a = "add_callback_when_play_complete")

    /* renamed from: c */
    public final boolean f180955c;

    static {
        Covode.recordClassIndex(94230);
    }

    public C80928d(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80928d)) {
            return false;
        }
        C80928d dVar = (C80928d) obj;
        return this.f180953a == dVar.f180953a && this.f180954b == dVar.f180954b && this.f180955c == dVar.f180955c;
    }

    public final int hashCode() {
        boolean z = this.f180953a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f180954b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f180955c) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "PreloadPromptConfig(fixSplashFeedAdMissCallback=" + this.f180953a + ", fixClickPlayMissCallback=" + this.f180954b + ", preloadWhenPlayComplete=" + this.f180955c + ")";
    }

    private C80928d() {
        this.f180953a = false;
        this.f180954b = false;
        this.f180955c = false;
    }

    private /* synthetic */ C80928d(byte b) {
        this();
    }
}
