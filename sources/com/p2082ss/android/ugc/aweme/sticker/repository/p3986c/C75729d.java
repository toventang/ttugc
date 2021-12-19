package com.p2082ss.android.ugc.aweme.sticker.repository.p3986c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.c.d */
public final class C75729d {

    /* renamed from: a */
    public final String f170148a;

    /* renamed from: b */
    public final int f170149b;

    /* renamed from: c */
    public final int f170150c;

    /* renamed from: d */
    public final boolean f170151d;

    static {
        Covode.recordClassIndex(88660);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75729d)) {
            return false;
        }
        C75729d dVar = (C75729d) obj;
        return C89219l.m154714a(this.f170148a, dVar.f170148a) && this.f170149b == dVar.f170149b && this.f170150c == dVar.f170150c && this.f170151d == dVar.f170151d;
    }

    public final int hashCode() {
        String str = this.f170148a;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f170149b) * 31) + this.f170150c) * 31;
        boolean z = this.f170151d;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "StickerPanelInfoFetcherRequest(category=" + this.f170148a + ", count=" + this.f170149b + ", cursor=" + this.f170150c + ", withCategoryEffects=" + this.f170151d + ")";
    }

    public /* synthetic */ C75729d() {
        this("");
    }

    private C75729d(String str) {
        C89219l.m154721d(str, "");
        this.f170148a = str;
        this.f170149b = 0;
        this.f170150c = 0;
        this.f170151d = true;
    }
}
