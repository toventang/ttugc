package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.x */
public class C16038x extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18304);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(29.045f, 32.4591f);
        this.f37302c.cubicTo(26.7688f, 34.0601f, 23.9942f, 35.0f, 21.0f, 35.0f);
        this.f37302c.cubicTo(13.268f, 35.0f, 7.0f, 28.732f, 7.0f, 21.0f);
        this.f37302c.cubicTo(7.0f, 13.268f, 13.268f, 7.0f, 21.0f, 7.0f);
        this.f37302c.cubicTo(28.732f, 7.0f, 35.0f, 13.268f, 35.0f, 21.0f);
        this.f37302c.cubicTo(35.0f, 25.015f, 33.3099f, 28.6352f, 30.6023f, 31.1881f);
        this.f37302c.lineTo(38.5867f, 39.1724f);
        this.f37302c.cubicTo(38.7819f, 39.3677f, 38.7819f, 39.6843f, 38.5867f, 39.8795f);
        this.f37302c.lineTo(37.8796f, 40.5866f);
        this.f37302c.cubicTo(37.6843f, 40.7819f, 37.3677f, 40.7819f, 37.1725f, 40.5866f);
        this.f37302c.lineTo(29.045f, 32.4591f);
        this.f37302c.close();
        this.f37302c.moveTo(33.0f, 21.0f);
        this.f37302c.cubicTo(33.0f, 27.6274f, 27.6274f, 33.0f, 21.0f, 33.0f);
        this.f37302c.cubicTo(14.3726f, 33.0f, 9.0f, 27.6274f, 9.0f, 21.0f);
        this.f37302c.cubicTo(9.0f, 14.3726f, 14.3726f, 9.0f, 21.0f, 9.0f);
        this.f37302c.cubicTo(27.6274f, 9.0f, 33.0f, 14.3726f, 33.0f, 21.0f);
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
