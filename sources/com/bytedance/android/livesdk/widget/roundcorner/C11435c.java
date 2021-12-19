package com.bytedance.android.livesdk.widget.roundcorner;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.widget.roundcorner.c */
public final class C11435c {

    /* renamed from: a */
    int f27414a;

    /* renamed from: b */
    int f27415b;

    /* renamed from: c */
    int f27416c;

    /* renamed from: d */
    int f27417d;

    /* renamed from: e */
    final RectF f27418e = new RectF();

    /* renamed from: f */
    final float[] f27419f = new float[8];

    /* renamed from: g */
    final Path f27420g = new Path();

    /* renamed from: h */
    final Paint f27421h = new Paint(1);

    /* renamed from: i */
    final PorterDuffXfermode f27422i = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

    /* renamed from: j */
    final AbstractC11433a f27423j;

    static {
        Covode.recordClassIndex(13092);
    }

    public C11435c(AbstractC11433a aVar) {
        C89219l.m154721d(aVar, "");
        this.f27423j = aVar;
    }

    /* renamed from: a */
    static int m20250a(Canvas canvas, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT >= 21) {
            return canvas.saveLayer(rectF, paint);
        }
        return canvas.saveLayer(rectF, paint, 31);
    }
}
