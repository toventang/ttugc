package com.bytedance.android.livesdk.wishlist;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.wishlist.c */
public final class C11539c {

    /* renamed from: a */
    public final long f27634a;

    /* renamed from: b */
    public final int f27635b;

    static {
        Covode.recordClassIndex(13198);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11539c)) {
            return false;
        }
        C11539c cVar = (C11539c) obj;
        return this.f27634a == cVar.f27634a && this.f27635b == cVar.f27635b;
    }

    public final String toString() {
        return "SendGiftSuccessEventData(giftId=" + this.f27634a + ", count=" + this.f27635b + ")";
    }

    public final int hashCode() {
        long j = this.f27634a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f27635b;
    }

    public C11539c(long j, int i) {
        this.f27634a = j;
        this.f27635b = i;
    }
}
