package com.p2082ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.a */
public final class C40509a {
    @AbstractC27891c(mo46611a = "show_video_gift_entrance")

    /* renamed from: a */
    public final boolean f94777a;

    static {
        Covode.recordClassIndex(48321);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C40509a) && this.f94777a == ((C40509a) obj).f94777a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f94777a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "GiftSettings(allowVideoGift=" + this.f94777a + ")";
    }
}
