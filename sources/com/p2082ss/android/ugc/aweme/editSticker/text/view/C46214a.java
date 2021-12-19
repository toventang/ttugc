package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.a */
public final class C46214a extends View {

    /* renamed from: a */
    Paint f107648a;

    /* renamed from: b */
    int f107649b;

    /* renamed from: c */
    public boolean f107650c;

    /* renamed from: d */
    private Paint f107651d;

    /* renamed from: e */
    private int f107652e;

    static {
        Covode.recordClassIndex(54776);
    }

    public final int getColor() {
        return this.f107649b;
    }

    public C46214a(Context context) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        float f = (float) width;
        canvas.drawCircle(f, f, (float) ((width - this.f107652e) - 4), this.f107651d);
        canvas.drawCircle(f, f, (float) (width - (this.f107652e * 2)), this.f107648a);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    private C46214a(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(10424);
        this.f107652e = 6;
        this.f107649b = -1;
        Paint paint = new Paint();
        this.f107651d = paint;
        paint.setColor(-1);
        this.f107651d.setAntiAlias(true);
        this.f107651d.setStyle(Paint.Style.STROKE);
        this.f107651d.setStrokeWidth((float) this.f107652e);
        Paint paint2 = new Paint();
        this.f107648a = paint2;
        paint2.setColor(this.f107649b);
        this.f107648a.setAntiAlias(true);
        this.f107648a.setStyle(Paint.Style.FILL);
        this.f107648a.setStrokeWidth((float) this.f107652e);
        MethodCollector.m26664o(10424);
    }
}
