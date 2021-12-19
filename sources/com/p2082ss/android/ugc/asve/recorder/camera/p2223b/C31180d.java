package com.p2082ss.android.ugc.asve.recorder.camera.p2223b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.asve.p2217f.C31100h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.b.d */
public final class C31180d extends View {

    /* renamed from: a */
    float f74753a;

    /* renamed from: b */
    float f74754b;

    /* renamed from: c */
    float f74755c;

    /* renamed from: d */
    boolean f74756d;

    /* renamed from: e */
    private final float f74757e;

    /* renamed from: f */
    private final float f74758f;

    /* renamed from: g */
    private final float f74759g;

    /* renamed from: h */
    private final Bitmap f74760h;

    /* renamed from: i */
    private final float f74761i;

    /* renamed from: j */
    private final float f74762j;

    /* renamed from: k */
    private final Paint f74763k;

    /* renamed from: l */
    private final int f74764l;

    static {
        Covode.recordClassIndex(37825);
    }

    public final float getProgress() {
        return this.f74755c;
    }

    public final float getSeekBarTotalLength() {
        return this.f74757e;
    }

    public final void setProgress(float f) {
        float f2 = this.f74755c + ((f / ((float) this.f74764l)) / this.f74757e);
        if (f2 > 1.0f) {
            this.f74755c = 1.0f;
        } else if (f2 < 0.0f) {
            this.f74755c = 0.0f;
        } else {
            this.f74755c = f2;
        }
        this.f74756d = true;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C31180d(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8391);
        this.f74757e = C31100h.m64302a(context, 120.0f);
        float a = C31100h.m64302a(context, 1.5f);
        this.f74758f = a;
        this.f74759g = C31100h.m64302a(context, 16.0f);
        this.f74760h = BitmapFactory.decodeResource(getContext().getResources(), 2131232287);
        this.f74761i = C31100h.m64302a(context, 11.5f);
        this.f74762j = C31100h.m64302a(context, 8.5f);
        this.f74755c = 0.5f;
        Paint paint = new Paint();
        this.f74763k = paint;
        this.f74764l = 10;
        paint.setColor(-1);
        paint.setStrokeWidth(a);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
        MethodCollector.m26664o(8391);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(8246);
        C89219l.m154721d(canvas, "");
        super.onDraw(canvas);
        float f = this.f74754b;
        double d = (double) f;
        float f2 = this.f74755c;
        double d2 = (double) f2;
        Double.isNaN(d2);
        double d3 = 0.5d - d2;
        float f3 = this.f74757e;
        float f4 = this.f74759g;
        double d4 = (double) (f3 - (2.0f * f4));
        Double.isNaN(d4);
        Double.isNaN(d);
        double d5 = d + (d3 * d4);
        float f5 = this.f74762j;
        float f6 = f5 + ((this.f74761i - f5) * f2);
        if (this.f74756d) {
            float f7 = (float) d5;
            double d6 = (double) f;
            double d7 = (double) f3;
            Double.isNaN(d7);
            Double.isNaN(d6);
            double d8 = d6 - (d7 * 0.5d);
            float f8 = f7 - f4;
            if (((double) f8) > d8) {
                float f9 = this.f74753a;
                canvas.drawLine(f9, f8, f9, (float) d8, this.f74763k);
            }
            double d9 = (double) this.f74754b;
            double d10 = (double) this.f74757e;
            Double.isNaN(d10);
            Double.isNaN(d9);
            double d11 = d9 + (d10 * 0.5d);
            float f10 = f7 + this.f74759g;
            if (d11 > ((double) f10)) {
                float f11 = this.f74753a;
                canvas.drawLine(f11, (float) d11, f11, f10, this.f74763k);
            }
        }
        float f12 = this.f74753a;
        float f13 = f12 - f6;
        double d12 = (double) f6;
        Double.isNaN(d12);
        double d13 = d5 - d12;
        float f14 = f12 + f6;
        Double.isNaN(d12);
        double d14 = d5 + d12;
        Bitmap bitmap = this.f74760h;
        C89219l.m154716b(bitmap, "");
        int width = bitmap.getWidth();
        Bitmap bitmap2 = this.f74760h;
        C89219l.m154716b(bitmap2, "");
        canvas.drawBitmap(this.f74760h, new Rect(0, 0, width, bitmap2.getHeight()), new Rect((int) f13, (int) d13, (int) f14, (int) d14), this.f74763k);
        MethodCollector.m26664o(8246);
    }

    public /* synthetic */ C31180d(Context context, byte b) {
        this(context);
    }
}
