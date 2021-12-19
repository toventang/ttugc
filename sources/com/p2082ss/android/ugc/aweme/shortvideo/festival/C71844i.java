package com.p2082ss.android.ugc.aweme.shortvideo.festival;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.i */
public final class C71844i implements AbstractC71843h {

    /* renamed from: a */
    private float f161005a;

    /* renamed from: b */
    private boolean f161006b;

    /* renamed from: c */
    private boolean f161007c;

    static {
        Covode.recordClassIndex(84393);
    }

    /* renamed from: a */
    private final int m126862a(EnumC71847l lVar) {
        return (int) ((((float) lVar.getWeight()) / this.f161005a) * 100.0f);
    }

    public C71844i(boolean z, boolean z2) {
        if (z) {
            this.f161005a += (float) EnumC71847l.VIDEO_DOWNLOAD_TYPE.getWeight();
        }
        if (z2) {
            this.f161005a += (float) EnumC71847l.VIDEO_WATER_TYPE.getWeight();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.festival.AbstractC71843h
    /* renamed from: a */
    public final int mo113491a(EnumC71847l lVar, int i) {
        C89219l.m154721d(lVar, "");
        int i2 = C71845j.f161008a[lVar.ordinal()];
        if (i2 == 1) {
            this.f161006b = true;
        } else if (i2 == 2) {
            this.f161007c = true;
        }
        float weight = (((float) lVar.getWeight()) / this.f161005a) * ((float) i);
        int i3 = 0;
        if (lVar != EnumC71847l.VIDEO_DOWNLOAD_TYPE && this.f161006b) {
            i3 = 0 + m126862a(EnumC71847l.VIDEO_DOWNLOAD_TYPE);
        }
        if (lVar != EnumC71847l.VIDEO_WATER_TYPE && this.f161007c) {
            i3 += m126862a(EnumC71847l.VIDEO_WATER_TYPE);
        }
        return (int) (weight + ((float) i3));
    }
}
