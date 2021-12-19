package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.js */
public class C15861js extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18127);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(30.4228f, 1.02815f);
        this.f37302c.cubicTo(14.1888f, 1.02815f, 1.02856f, 14.1884f, 1.02856f, 30.4224f);
        this.f37302c.cubicTo(1.02856f, 46.6564f, 14.1888f, 59.8167f, 30.4228f, 59.8167f);
        this.f37302c.cubicTo(37.8213f, 59.8167f, 44.5813f, 57.0833f, 49.7482f, 52.5714f);
        this.f37302c.lineTo(67.6959f, 70.519f);
        this.f37302c.cubicTo(68.3f, 71.1232f, 69.2796f, 71.1232f, 69.8837f, 70.519f);
        this.f37302c.cubicTo(70.4879f, 69.9149f, 70.4879f, 68.9353f, 69.8837f, 68.3311f);
        this.f37302c.lineTo(51.9694f, 50.4168f);
        this.f37302c.cubicTo(56.8393f, 45.1712f, 59.8171f, 38.1446f, 59.8171f, 30.4224f);
        this.f37302c.cubicTo(59.8171f, 14.1884f, 46.6568f, 1.02815f, 30.4228f, 1.02815f);
        this.f37302c.close();
        this.f37302c.moveTo(4.1227f, 30.4224f);
        this.f37302c.cubicTo(4.1227f, 15.8973f, 15.8977f, 4.12228f, 30.4228f, 4.12228f);
        this.f37302c.cubicTo(44.948f, 4.12228f, 56.7229f, 15.8973f, 56.7229f, 30.4224f);
        this.f37302c.cubicTo(56.7229f, 44.9476f, 44.948f, 56.7225f, 30.4228f, 56.7225f);
        this.f37302c.cubicTo(15.8977f, 56.7225f, 4.1227f, 44.9476f, 4.1227f, 30.4224f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 72.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
