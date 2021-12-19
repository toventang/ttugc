package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.StoryTag */
public final class StoryTag extends LinearLayout {

    /* renamed from: a */
    private final int f115440a;

    /* renamed from: b */
    private final int f115441b;

    /* renamed from: c */
    private final int f115442c;

    /* renamed from: d */
    private final Paint f115443d;

    /* renamed from: e */
    private RectF f115444e;

    /* renamed from: f */
    private float f115445f;

    /* renamed from: g */
    private LinearGradient f115446g;

    static {
        Covode.recordClassIndex(59141);
    }

    public StoryTag(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public StoryTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final Paint getPaint() {
        return this.f115443d;
    }

    public final float getRadius() {
        return this.f115445f;
    }

    public final void setRadius(float f) {
        this.f115445f = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(5596);
        super.onDraw(canvas);
        if (canvas == null) {
            MethodCollector.m26664o(5596);
            return;
        }
        this.f115443d.setShader(this.f115446g);
        this.f115443d.setStyle(Paint.Style.FILL);
        this.f115443d.setColor(-16777216);
        RectF rectF = this.f115444e;
        float f = this.f115445f;
        canvas.drawRoundRect(rectF, f, f, this.f115443d);
        MethodCollector.m26664o(5596);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ StoryTag(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryTag(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5725);
        this.f115440a = Color.parseColor("#10B7FF");
        this.f115441b = Color.parseColor("#20D5EC");
        this.f115442c = Color.parseColor("#17E9B6");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f115443d = paint;
        this.f115444e = new RectF();
        this.f115445f = 5.0f;
        MethodCollector.m26664o(5725);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            RectF rectF = this.f115444e;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = (float) i;
            rectF.bottom = (float) i2;
            float width = (float) getWidth();
            float height = (float) getHeight();
            int[] iArr = new int[3];
            int i5 = 0;
            int i6 = 0;
            loop0:
            while (true) {
                int i7 = this.f115440a;
                while (true) {
                    iArr[i6] = i7;
                    i6++;
                    if (i6 >= 3) {
                        break loop0;
                    } else if (i6 != 0) {
                        if (i6 != 1) {
                            i7 = this.f115442c;
                        } else {
                            i7 = this.f115441b;
                        }
                    }
                }
            }
            float[] fArr = new float[3];
            while (true) {
                float f = 0.0f;
                while (true) {
                    fArr[i5] = f;
                    i5++;
                    if (i5 >= 3) {
                        this.f115446g = new LinearGradient(0.0f, 0.0f, width, height, iArr, fArr, Shader.TileMode.CLAMP);
                        return;
                    } else if (i5 != 0) {
                        if (i5 != 1) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                    }
                }
            }
        }
    }
}
