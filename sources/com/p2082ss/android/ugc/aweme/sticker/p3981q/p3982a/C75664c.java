package com.p2082ss.android.ugc.aweme.sticker.p3981q.p3982a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75878d;
import com.p2082ss.android.vesdk.C85386ba;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.q.a.c */
public final class C75664c implements AbstractC75878d {

    /* renamed from: b */
    public static final C75664c f170083b = new C75664c();

    /* renamed from: c */
    private static final C85386ba f170084c = C85386ba.m146900a();

    /* renamed from: d */
    private static float[] f170085d = AbstractC75878d.C75879a.f170426a;

    private C75664c() {
    }

    static {
        Covode.recordClassIndex(88595);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75878d
    /* renamed from: a */
    public final void mo119397a(boolean z) {
        C85386ba baVar = f170084c;
        C89219l.m154716b(baVar, "");
        baVar.f191131e = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75878d
    /* renamed from: a */
    public final void mo119398a(float[] fArr) {
        C89219l.m154721d(fArr, "");
        f170084c.f191130d = fArr;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75878d
    /* renamed from: a */
    public final void mo119399a(float[] fArr, double d) {
        C85386ba baVar = f170084c;
        if (fArr == null || fArr.length != 4) {
            baVar.f191129c = C85386ba.f191125a;
        } else {
            baVar.f191129c = fArr;
        }
        baVar.f191128b = d;
    }
}
