package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.of */
public class C15983of extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18249);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(21.8648f, 11.8276f);
        this.f37302c.cubicTo(16.9012f, 11.8276f, 12.8076f, 15.937f, 12.8076f, 21.0928f);
        this.f37302c.cubicTo(12.8076f, 26.2487f, 16.9012f, 30.358f, 21.8648f, 30.358f);
        this.f37302c.cubicTo(24.2608f, 30.358f, 26.4413f, 29.4088f, 28.0684f, 27.8434f);
        this.f37302c.cubicTo(29.823f, 26.1553f, 30.922f, 23.7608f, 30.922f, 21.0928f);
        this.f37302c.cubicTo(30.922f, 15.937f, 26.8285f, 11.8276f, 21.8648f, 11.8276f);
        this.f37302c.close();
        this.f37302c.moveTo(8.30762f, 21.0928f);
        this.f37302c.cubicTo(8.30762f, 13.5294f, 14.3389f, 7.32764f, 21.8648f, 7.32764f);
        this.f37302c.cubicTo(29.3907f, 7.32764f, 35.422f, 13.5294f, 35.422f, 21.0928f);
        this.f37302c.cubicTo(35.422f, 24.1907f, 34.4121f, 27.0558f, 32.7055f, 29.3599f);
        this.f37302c.lineTo(39.5295f, 36.184f);
        this.f37302c.cubicTo(39.92f, 36.5745f, 39.92f, 37.2077f, 39.5295f, 37.5982f);
        this.f37302c.lineTo(37.7617f, 39.366f);
        this.f37302c.cubicTo(37.3712f, 39.7565f, 36.7381f, 39.7565f, 36.3475f, 39.366f);
        this.f37302c.lineTo(29.4706f, 32.4891f);
        this.f37302c.cubicTo(27.3047f, 33.9816f, 24.686f, 34.858f, 21.8648f, 34.858f);
        this.f37302c.cubicTo(14.3389f, 34.858f, 8.30762f, 28.6563f, 8.30762f, 21.0928f);
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
