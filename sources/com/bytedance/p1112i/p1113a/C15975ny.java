package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ny */
public class C15975ny extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18241);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0001f, 11.5f);
        this.f37302c.cubicTo(20.9625f, 11.5f, 18.5001f, 13.9624f, 18.5001f, 17.0f);
        this.f37302c.cubicTo(18.5001f, 20.0376f, 20.9625f, 22.5f, 24.0001f, 22.5f);
        this.f37302c.cubicTo(27.0377f, 22.5f, 29.5001f, 20.0376f, 29.5001f, 17.0f);
        this.f37302c.cubicTo(29.5001f, 13.9624f, 27.0377f, 11.5f, 24.0001f, 11.5f);
        this.f37302c.close();
        this.f37302c.moveTo(15.5001f, 17.0f);
        this.f37302c.cubicTo(15.5001f, 12.3056f, 19.3057f, 8.5f, 24.0001f, 8.5f);
        this.f37302c.cubicTo(28.6945f, 8.5f, 32.5001f, 12.3056f, 32.5001f, 17.0f);
        this.f37302c.cubicTo(32.5001f, 21.6944f, 28.6945f, 25.5f, 24.0001f, 25.5f);
        this.f37302c.cubicTo(19.3057f, 25.5f, 15.5001f, 21.6944f, 15.5001f, 17.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0001f, 30.5f);
        this.f37302c.cubicTo(19.1458f, 30.5f, 15.0586f, 33.7954f, 13.8578f, 38.2712f);
        this.f37302c.cubicTo(13.7147f, 38.8046f, 13.2038f, 39.1741f, 12.6591f, 39.0827f);
        this.f37302c.lineTo(11.6729f, 38.9173f);
        this.f37302c.cubicTo(11.1282f, 38.8259f, 10.7571f, 38.3085f, 10.8888f, 37.7722f);
        this.f37302c.cubicTo(12.3362f, 31.8748f, 17.6559f, 27.5f, 24.0001f, 27.5f);
        this.f37302c.cubicTo(30.3443f, 27.5f, 35.664f, 31.8748f, 37.1114f, 37.7722f);
        this.f37302c.cubicTo(37.2431f, 38.3085f, 36.872f, 38.8259f, 36.3273f, 38.9173f);
        this.f37302c.lineTo(35.3411f, 39.0827f);
        this.f37302c.cubicTo(34.7964f, 39.1741f, 34.2855f, 38.8046f, 34.1424f, 38.2712f);
        this.f37302c.cubicTo(32.9416f, 33.7954f, 28.8544f, 30.5f, 24.0001f, 30.5f);
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
