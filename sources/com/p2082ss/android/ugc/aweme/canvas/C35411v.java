package com.p2082ss.android.ugc.aweme.canvas;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.v */
public final class C35411v {
    static {
        Covode.recordClassIndex(42585);
    }

    /* renamed from: a */
    private static float m72429a(PointF pointF, PointF pointF2) {
        float f = pointF.y / pointF.x;
        float f2 = pointF2.y / pointF2.x;
        if (f > f2) {
            return f / f2;
        }
        return 1.0f;
    }

    /* renamed from: a */
    public static float m72430a(PointF pointF, PointF pointF2, boolean z) {
        C89219l.m154721d(pointF, "");
        C89219l.m154721d(pointF2, "");
        if (z) {
            return m72429a(pointF, pointF2);
        }
        return m72429a(pointF, pointF2);
    }
}
