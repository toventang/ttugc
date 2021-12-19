package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.h */
public final class C72321h implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f162118a;

    static {
        Covode.recordClassIndex(84988);
    }

    public C72321h(Rect rect) {
        this.f162118a = rect;
    }

    /* renamed from: a */
    public final Rect evaluate(float f, Rect rect, Rect rect2) {
        if (rect == null) {
            C89219l.m154715b();
        }
        int i = rect.left;
        if (rect2 == null) {
            C89219l.m154715b();
        }
        int i2 = i + ((int) (((float) (rect2.left - rect.left)) * f));
        int i3 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f));
        int i4 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f));
        int i5 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f));
        Rect rect3 = this.f162118a;
        if (rect3 == null) {
            return new Rect(i2, i3, i4, i5);
        }
        rect3.set(i2, i3, i4, i5);
        return this.f162118a;
    }
}
