package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.livesetting.gift.b */
public final class C9327b {
    @AbstractC27891c(mo46611a = "new_tray_queue")

    /* renamed from: a */
    public final boolean f22767a;
    @AbstractC27891c(mo46611a = "new_self_tray_queue")

    /* renamed from: b */
    public final boolean f22768b;
    @AbstractC27891c(mo46611a = "others_queue_hot_threshold")

    /* renamed from: c */
    public final int f22769c;
    @AbstractC27891c(mo46611a = "self_queue_hot_threshold")

    /* renamed from: d */
    public final int f22770d;

    static {
        Covode.recordClassIndex(10440);
    }

    public C9327b() {
        this(0, 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9327b)) {
            return false;
        }
        C9327b bVar = (C9327b) obj;
        return this.f22767a == bVar.f22767a && this.f22768b == bVar.f22768b && this.f22769c == bVar.f22769c && this.f22770d == bVar.f22770d;
    }

    public final int hashCode() {
        boolean z = this.f22767a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f22768b) {
            i = 0;
        }
        return ((((i5 + i) * 31) + this.f22769c) * 31) + this.f22770d;
    }

    public final String toString() {
        return "LiveGiftPerformanceConfig(useNewTrayQueue=" + this.f22767a + ", useNewSelfTrayQueue=" + this.f22768b + ", mOtherQueueHotSize=" + this.f22769c + ", mSelfQueueHotSize=" + this.f22770d + ")";
    }

    private C9327b(int i, int i2) {
        this.f22767a = false;
        this.f22768b = false;
        this.f22769c = i;
        this.f22770d = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9327b(int i, int i2, int i3) {
        this((i3 & 4) != 0 ? 200 : i, (i3 & 8) != 0 ? 200 : i2);
    }
}
