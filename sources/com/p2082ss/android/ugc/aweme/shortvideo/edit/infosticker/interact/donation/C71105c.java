package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.AbstractC75310e;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c */
public final class C71105c implements AbstractC75310e {

    /* renamed from: a */
    public AbstractC82771b f159245a;

    /* renamed from: b */
    public InteractStickerStruct f159246b;

    /* renamed from: c */
    public int f159247c;

    /* renamed from: d */
    public int f159248d;

    static {
        Covode.recordClassIndex(83607);
    }

    public C71105c() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71105c)) {
            return false;
        }
        C71105c cVar = (C71105c) obj;
        return C89219l.m154714a(this.f159245a, cVar.f159245a) && C89219l.m154714a(this.f159246b, cVar.f159246b) && this.f159247c == cVar.f159247c && this.f159248d == cVar.f159248d;
    }

    public final int hashCode() {
        AbstractC82771b bVar = this.f159245a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        InteractStickerStruct interactStickerStruct = this.f159246b;
        if (interactStickerStruct != null) {
            i = interactStickerStruct.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f159247c) * 31) + this.f159248d;
    }

    public final String toString() {
        return "DonationStickerData(org=" + this.f159245a + ", interactStruct=" + this.f159246b + ", startTime=" + this.f159247c + ", endTime=" + this.f159248d + ")";
    }

    /* renamed from: a */
    public static /* synthetic */ C71105c m125682a(C71105c cVar) {
        return new C71105c(cVar.f159245a, cVar.f159246b, cVar.f159247c, cVar.f159248d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C71105c(AbstractC82771b bVar, int i) {
        this((i & 1) != 0 ? null : bVar, null, 0, 0);
    }

    private C71105c(AbstractC82771b bVar, InteractStickerStruct interactStickerStruct, int i, int i2) {
        this.f159245a = bVar;
        this.f159246b = interactStickerStruct;
        this.f159247c = i;
        this.f159248d = i2;
    }
}
