package com.p2082ss.android.ugc.aweme.profile.p3575f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.profile.f.aj */
public final class C63771aj extends ImageSpan {

    /* renamed from: a */
    public int f144553a;

    static {
        Covode.recordClassIndex(75099);
    }

    public C63771aj(Context context, int i) {
        super(context, i, 1);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f + ((float) this.f144553a), (float) ((i5 - drawable.getBounds().bottom) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }
}
