package com.bytedance.android.live.publicscreen.impl.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class EdgeTransparentView extends FrameLayout {

    /* renamed from: a */
    int f14984a;

    /* renamed from: b */
    float f14985b;

    /* renamed from: c */
    private Paint f14986c;

    /* renamed from: d */
    private int f14987d;

    /* renamed from: e */
    private int f14988e;

    /* renamed from: f */
    private int f14989f;

    /* renamed from: g */
    private int f14990g;

    /* renamed from: h */
    private int f14991h;

    /* renamed from: i */
    private int f14992i;

    /* renamed from: j */
    private int[] f14993j;

    /* renamed from: k */
    private float[] f14994k;

    static {
        Covode.recordClassIndex(6576);
    }

    public EdgeTransparentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private EdgeTransparentView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5515);
        this.f14987d = 1;
        this.f14988e = 1 << 1;
        this.f14989f = 1 << 2;
        this.f14990g = 8;
        this.f14993j = new int[]{-1, 0};
        this.f14994k = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.f14986c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f14986c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        MethodCollector.m26664o(5515);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        int saveLayer = canvas2.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas2, view, j);
        if ((this.f14984a & this.f14987d) != 0) {
            canvas2.drawRect(0.0f, 0.0f, (float) this.f14991h, this.f14985b, this.f14986c);
        }
        if ((this.f14984a & this.f14988e) != 0) {
            int save = canvas2.save();
            canvas2.rotate(180.0f, ((float) this.f14991h) / 2.0f, ((float) this.f14992i) / 2.0f);
            canvas2.drawRect(0.0f, 0.0f, (float) this.f14991h, this.f14985b, this.f14986c);
            canvas2.restoreToCount(save);
        }
        float f = ((float) (this.f14992i - this.f14991h)) / 2.0f;
        if ((this.f14984a & this.f14989f) != 0) {
            int save2 = canvas2.save();
            canvas2.rotate(270.0f, ((float) this.f14991h) / 2.0f, ((float) this.f14992i) / 2.0f);
            canvas2.translate(0.0f, f);
            canvas2.drawRect(0.0f - f, 0.0f, ((float) this.f14991h) + f, this.f14985b, this.f14986c);
            canvas2.restoreToCount(save2);
        }
        if ((this.f14984a & this.f14990g) != 0) {
            int save3 = canvas2.save();
            canvas2.rotate(90.0f, ((float) this.f14991h) / 2.0f, ((float) this.f14992i) / 2.0f);
            canvas2.translate(0.0f, f);
            canvas2 = canvas2;
            canvas2.drawRect(0.0f - f, 0.0f, ((float) this.f14991h) + f, this.f14985b, this.f14986c);
            canvas2.restoreToCount(save3);
        }
        canvas2.restoreToCount(saveLayer);
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f14986c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f14985b, this.f14993j, this.f14994k, Shader.TileMode.CLAMP));
        this.f14991h = getWidth();
        this.f14992i = getHeight();
    }
}
