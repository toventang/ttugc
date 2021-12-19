package com.bytedance.android.livesdk.chatroom.backroom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RoomBackProgressView extends View {

    /* renamed from: a */
    private final Paint f18194a = new Paint();

    /* renamed from: b */
    private final RectF f18195b = new RectF();

    /* renamed from: c */
    private final float f18196c = ((float) C3966y.m9653a(2.0f));

    /* renamed from: d */
    private float f18197d = 0.0f;

    static {
        Covode.recordClassIndex(8093);
    }

    public float getProgress() {
        return this.f18197d;
    }

    /* renamed from: a */
    private void m15225a() {
        this.f18194a.setAntiAlias(true);
        this.f18194a.setStyle(Paint.Style.STROKE);
        this.f18194a.setStrokeCap(Paint.Cap.ROUND);
        this.f18194a.setStrokeWidth(this.f18196c);
        this.f18194a.setColor(-1);
    }

    public void setProgress(float f) {
        this.f18197d = f;
        invalidate();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.drawArc(this.f18195b, -90.0f, -this.f18197d, false, this.f18194a);
    }

    public RoomBackProgressView(Context context) {
        super(context);
        MethodCollector.m26663i(10523);
        m15225a();
        MethodCollector.m26664o(10523);
    }

    public RoomBackProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10524);
        m15225a();
        MethodCollector.m26664o(10524);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.f18195b;
        float f = this.f18196c;
        float f2 = (float) i;
        rectF.set(f / 2.0f, f / 2.0f, f2 - (f / 2.0f), f2 - (f / 2.0f));
    }
}
