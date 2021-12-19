package com.bytedance.android.ecommerce.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class OcrScanView extends View {

    /* renamed from: a */
    public Matrix f8644a = new Matrix();

    /* renamed from: b */
    private Paint f8645b;

    /* renamed from: c */
    private int f8646c;

    /* renamed from: d */
    private int f8647d;

    /* renamed from: e */
    private Bitmap f8648e = BitmapFactory.decodeResource(getResources(), R.drawable.bc4);

    /* renamed from: f */
    private float f8649f = 0.0f;

    /* renamed from: g */
    private ValueAnimator f8650g;

    /* renamed from: h */
    private long f8651h = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    static {
        Covode.recordClassIndex(3331);
    }

    private ValueAnimator.AnimatorUpdateListener getUpdateListener() {
        return new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.android.ecommerce.view.OcrScanView.C29021 */

            static {
                Covode.recordClassIndex(3332);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OcrScanView.this.f8644a.setTranslate(0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                OcrScanView.this.invalidate();
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8650g.isRunning()) {
            this.f8650g.cancel();
        }
        m8211a(true);
    }

    /* renamed from: a */
    private void m8211a(boolean z) {
        this.f8644a.reset();
        this.f8644a.setTranslate(0.0f, -this.f8649f);
        this.f8644a.preScale(1.0f, 1.0f);
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(2719);
        super.onDraw(canvas);
        Bitmap bitmap = this.f8648e;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f8644a, this.f8645b);
        }
        MethodCollector.m26664o(2719);
    }

    public OcrScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(2715);
        Paint paint = new Paint(1);
        this.f8645b = paint;
        paint.setStyle(Paint.Style.FILL);
        MethodCollector.m26664o(2715);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(2737);
        super.onSizeChanged(i, i2, i3, i4);
        this.f8646c = i;
        this.f8647d = i2;
        Bitmap bitmap = this.f8648e;
        if (bitmap == null || i <= 0 || i2 <= 0) {
            MethodCollector.m26664o(2737);
            return;
        }
        int width = bitmap.getWidth();
        int i5 = this.f8646c;
        if (width != i5) {
            Bitmap bitmap2 = this.f8648e;
            int height = bitmap2.getHeight();
            int width2 = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            float min = Math.min(((float) height) / ((float) height2), ((float) i5) / ((float) width2));
            Matrix matrix = new Matrix();
            matrix.postScale(min, min);
            this.f8648e = Bitmap.createBitmap(bitmap2, 0, 0, width2, height2, matrix, true);
        }
        this.f8649f = (float) this.f8648e.getHeight();
        m8211a(false);
        ValueAnimator valueAnimator = this.f8650g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8650g.cancel();
        }
        float f = this.f8649f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-f, ((float) this.f8647d) + f);
        this.f8650g = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(this.f8651h);
            this.f8650g.setRepeatCount(-1);
            this.f8650g.setRepeatMode(1);
            this.f8650g.addUpdateListener(getUpdateListener());
            this.f8650g.start();
        }
        MethodCollector.m26664o(2737);
    }
}
