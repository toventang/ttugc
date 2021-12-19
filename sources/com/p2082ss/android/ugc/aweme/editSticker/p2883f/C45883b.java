package com.p2082ss.android.ugc.aweme.editSticker.p2883f;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.f.b */
public final class C45883b {
    static {
        Covode.recordClassIndex(54407);
    }

    /* renamed from: a */
    public static RectF m88523a(PointF[] pointFArr) {
        float f = pointFArr[0].x;
        float f2 = pointFArr[0].y;
        float f3 = f2;
        float f4 = f;
        for (PointF pointF : pointFArr) {
            if (pointF.x < f) {
                f = pointF.x;
            }
            if (pointF.x > f4) {
                f4 = pointF.x;
            }
            if (pointF.y < f2) {
                f2 = pointF.y;
            }
            if (pointF.y > f3) {
                f3 = pointF.y;
            }
        }
        return new RectF(f, f2, f4, f3);
    }

    /* renamed from: a */
    public static boolean m88524a(Rect rect, PointF[] pointFArr) {
        boolean z = false;
        if (pointFArr == null || rect == null) {
            return false;
        }
        RectF a = m88523a(pointFArr);
        if (a.right < ((float) rect.left)) {
            z = true;
        }
        if (a.left > ((float) rect.right)) {
            z = true;
        }
        if (a.bottom < ((float) rect.top)) {
            z = true;
        }
        if (a.top > ((float) rect.bottom)) {
            return true;
        }
        return z;
    }
}
