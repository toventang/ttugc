package com.bytedance.android.live.liveinteract.multilive.p360c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.c.o */
public final class C5602o {
    @AbstractC27891c(mo46611a = "interact_id")

    /* renamed from: a */
    public final String f14243a;
    @AbstractC27891c(mo46611a = "position")

    /* renamed from: b */
    public final int f14244b;
    @AbstractC27891c(mo46611a = "video_mute")

    /* renamed from: c */
    public final boolean f14245c;

    static {
        Covode.recordClassIndex(6199);
    }

    public C5602o() {
        this(null, 0, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5602o)) {
            return false;
        }
        C5602o oVar = (C5602o) obj;
        return C89219l.m154714a(this.f14243a, oVar.f14243a) && this.f14244b == oVar.f14244b && this.f14245c == oVar.f14245c;
    }

    public final int hashCode() {
        String str = this.f14243a;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f14244b) * 31;
        boolean z = this.f14245c;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "MultiLiveRTCMessageUser(interactId=" + this.f14243a + ", position=" + this.f14244b + ", videoMute=" + this.f14245c + ")";
    }

    public C5602o(String str, int i, boolean z) {
        C89219l.m154721d(str, "");
        this.f14243a = str;
        this.f14244b = i;
        this.f14245c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5602o(String str, int i, boolean z, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z);
    }
}
