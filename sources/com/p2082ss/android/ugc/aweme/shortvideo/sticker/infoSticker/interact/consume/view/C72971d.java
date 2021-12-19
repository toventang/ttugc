package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.d */
public final class C72971d extends View {

    /* renamed from: a */
    private float[] f163743a;

    /* renamed from: b */
    private final Paint f163744b = new Paint();

    /* renamed from: c */
    private final Path f163745c = new Path();

    static {
        Covode.recordClassIndex(85674);
    }

    public final Path getPath() {
        return this.f163745c;
    }

    public final float[] getPoints() {
        return this.f163743a;
    }

    public final void setPoints(float[] fArr) {
        this.f163743a = fArr;
    }

    public C72971d(Context context) {
        super(context);
        MethodCollector.m26663i(8330);
        MethodCollector.m26664o(8330);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(8329);
        super.onDraw(canvas);
        Context context = getContext();
        C89219l.m154716b(context, "");
        if (C72890c.m128720a(context) && this.f163743a != null) {
            this.f163745c.reset();
            Path path = this.f163745c;
            float[] fArr = this.f163743a;
            if (fArr == null) {
                C89219l.m154715b();
            }
            float f = fArr[0];
            float[] fArr2 = this.f163743a;
            if (fArr2 == null) {
                C89219l.m154715b();
            }
            path.moveTo(f, fArr2[1]);
            Path path2 = this.f163745c;
            float[] fArr3 = this.f163743a;
            if (fArr3 == null) {
                C89219l.m154715b();
            }
            float f2 = fArr3[2];
            float[] fArr4 = this.f163743a;
            if (fArr4 == null) {
                C89219l.m154715b();
            }
            path2.lineTo(f2, fArr4[3]);
            Path path3 = this.f163745c;
            float[] fArr5 = this.f163743a;
            if (fArr5 == null) {
                C89219l.m154715b();
            }
            float f3 = fArr5[6];
            float[] fArr6 = this.f163743a;
            if (fArr6 == null) {
                C89219l.m154715b();
            }
            path3.lineTo(f3, fArr6[7]);
            Path path4 = this.f163745c;
            float[] fArr7 = this.f163743a;
            if (fArr7 == null) {
                C89219l.m154715b();
            }
            float f4 = fArr7[4];
            float[] fArr8 = this.f163743a;
            if (fArr8 == null) {
                C89219l.m154715b();
            }
            path4.lineTo(f4, fArr8[5]);
            this.f163745c.close();
            if (canvas != null) {
                canvas.drawPath(this.f163745c, this.f163744b);
                MethodCollector.m26664o(8329);
                return;
            }
        }
        MethodCollector.m26664o(8329);
    }
}
