package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.graphics.Canvas;
import android.text.StaticLayout;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.b */
public final class C46130b {
    static {
        Covode.recordClassIndex(54689);
    }

    /* renamed from: a */
    public static final void m89021a(StaticLayout staticLayout, Canvas canvas, float f, float f2) {
        C89219l.m154721d(staticLayout, "");
        C89219l.m154721d(canvas, "");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            staticLayout.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
