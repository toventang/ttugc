package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.q */
public class C16031q extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18297);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(37.0524f, 9.16645f);
        this.f37302c.cubicTo(37.3319f, 9.35169f, 37.5f, 9.66469f, 37.5f, 10.0f);
        this.f37302c.lineTo(37.5f, 36.0f);
        this.f37302c.cubicTo(37.5f, 36.3295f, 37.3377f, 36.6378f, 37.0661f, 36.8243f);
        this.f37302c.cubicTo(36.7946f, 37.0108f, 36.4485f, 37.0516f, 36.141f, 36.9333f);
        this.f37302c.lineTo(29.7597f, 34.479f);
        this.f37302c.cubicTo(28.4974f, 36.3029f, 26.3891f, 37.5f, 24.0f, 37.5f);
        this.f37302c.cubicTo(20.134f, 37.5f, 17.0f, 34.366f, 17.0f, 30.5f);
        this.f37302c.cubicTo(17.0f, 30.1933f, 17.0198f, 29.8908f, 17.0582f, 29.5938f);
        this.f37302c.lineTo(11.5f, 27.456f);
        this.f37302c.lineTo(11.5f, 29.5f);
        this.f37302c.cubicTo(11.5f, 29.7761f, 11.2761f, 30.0f, 11.0f, 30.0f);
        this.f37302c.lineTo(10.0f, 30.0f);
        this.f37302c.cubicTo(9.72386f, 30.0f, 9.5f, 29.7761f, 9.5f, 29.5f);
        this.f37302c.lineTo(9.5f, 17.0f);
        this.f37302c.cubicTo(9.5f, 16.7239f, 9.72386f, 16.5f, 10.0f, 16.5f);
        this.f37302c.lineTo(11.0f, 16.5f);
        this.f37302c.cubicTo(11.2761f, 16.5f, 11.5f, 16.7239f, 11.5f, 17.0f);
        this.f37302c.lineTo(11.5f, 19.4911f);
        this.f37302c.lineTo(36.1104f, 9.07904f);
        this.f37302c.cubicTo(36.4192f, 8.94838f, 36.7729f, 8.9812f, 37.0524f, 9.16645f);
        this.f37302c.close();
        this.f37302c.moveTo(11.5f, 21.6627f);
        this.f37302c.lineTo(11.5f, 25.3132f);
        this.f37302c.lineTo(35.5f, 34.544f);
        this.f37302c.lineTo(35.5f, 11.5089f);
        this.f37302c.lineTo(11.5f, 21.6627f);
        this.f37302c.close();
        this.f37302c.moveTo(19.0025f, 30.3416f);
        this.f37302c.cubicTo(19.0008f, 30.3942f, 19.0f, 30.447f, 19.0f, 30.5f);
        this.f37302c.cubicTo(19.0f, 33.2614f, 21.2386f, 35.5f, 24.0f, 35.5f);
        this.f37302c.cubicTo(25.5285f, 35.5f, 26.8979f, 34.8143f, 27.8159f, 33.7314f);
        this.f37302c.lineTo(19.0025f, 30.3416f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
