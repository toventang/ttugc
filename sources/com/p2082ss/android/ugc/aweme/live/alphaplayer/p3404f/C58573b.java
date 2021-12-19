package com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58528c;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.f.b */
public final class C58573b {
    static {
        Covode.recordClassIndex(68868);
    }

    /* renamed from: a */
    public static void m107676a(C58522a.C58523a aVar) {
        aVar.mo95931b(-0.5f, -0.5f);
        aVar.mo95932c();
        aVar.mo95933d();
    }

    /* renamed from: a */
    public static void m107677a(C58522a.C58523a aVar, C58528c cVar) {
        if (!cVar.mo95950a()) {
            aVar.mo95928a(1.0f - (cVar.f133270a + cVar.f133272c));
            aVar.mo95930b(1.0f - (cVar.f133271b + cVar.f133273d));
            aVar.mo95931b(cVar.f133270a, cVar.f133271b);
        }
    }

    /* renamed from: a */
    public static void m107678a(float[] fArr, float f, float f2, float f3, float f4) {
        if (fArr == null || fArr.length < 8) {
            throw new RuntimeException("data is invalid");
        }
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f;
        fArr[5] = f2;
        fArr[6] = f3;
        fArr[7] = f2;
    }
}
