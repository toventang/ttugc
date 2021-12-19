package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.c */
public final class C72316c implements AbstractC72320g {
    static {
        Covode.recordClassIndex(84983);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72320g
    /* renamed from: a */
    public final Matrix mo114582a(RectF rectF, Rect rect) {
        C89219l.m154721d(rectF, "");
        C89219l.m154721d(rect, "");
        Matrix matrix = new Matrix();
        float min = 1.0f / Math.min(rectF.width() / ((float) rect.width()), rectF.height() / ((float) rect.height()));
        matrix.setScale(min, min, rectF.centerX(), rectF.centerY());
        matrix.postTranslate(((float) rect.centerX()) - rectF.centerX(), ((float) rect.centerY()) - rectF.centerY());
        return matrix;
    }
}
