package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.mj */
public class C15933mj extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18199);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(35.0f, 4.0f);
        this.f37302c.lineTo(13.0f, 4.0f);
        this.f37302c.cubicTo(12.4477f, 4.0f, 12.0f, 4.44772f, 12.0f, 5.0f);
        this.f37302c.lineTo(12.0f, 7.0f);
        this.f37302c.cubicTo(12.0f, 7.55228f, 12.4477f, 8.0f, 13.0f, 8.0f);
        this.f37302c.lineTo(34.0f, 8.0f);
        this.f37302c.cubicTo(37.3137f, 8.0f, 40.0f, 10.6863f, 40.0f, 14.0f);
        this.f37302c.lineTo(40.0f, 35.0f);
        this.f37302c.cubicTo(40.0f, 35.5523f, 40.4477f, 36.0f, 41.0f, 36.0f);
        this.f37302c.lineTo(43.0f, 36.0f);
        this.f37302c.cubicTo(43.5523f, 36.0f, 44.0f, 35.5523f, 44.0f, 35.0f);
        this.f37302c.lineTo(44.0f, 13.0f);
        this.f37302c.cubicTo(44.0f, 8.02944f, 39.9706f, 4.0f, 35.0f, 4.0f);
        this.f37302c.close();
        this.f37302c.moveTo(4.0f, 17.0f);
        this.f37302c.cubicTo(4.0f, 14.2386f, 6.23858f, 12.0f, 9.0f, 12.0f);
        this.f37302c.lineTo(31.0f, 12.0f);
        this.f37302c.cubicTo(33.7614f, 12.0f, 36.0f, 14.2386f, 36.0f, 17.0f);
        this.f37302c.lineTo(36.0f, 39.0f);
        this.f37302c.cubicTo(36.0f, 41.7614f, 33.7614f, 44.0f, 31.0f, 44.0f);
        this.f37302c.lineTo(9.0f, 44.0f);
        this.f37302c.cubicTo(6.23858f, 44.0f, 4.0f, 41.7614f, 4.0f, 39.0f);
        this.f37302c.lineTo(4.0f, 17.0f);
        this.f37302c.close();
        this.f37302c.moveTo(9.0f, 16.0f);
        this.f37302c.cubicTo(8.44772f, 16.0f, 8.0f, 16.4477f, 8.0f, 17.0f);
        this.f37302c.lineTo(8.0f, 39.0f);
        this.f37302c.cubicTo(8.0f, 39.5523f, 8.44771f, 40.0f, 9.0f, 40.0f);
        this.f37302c.lineTo(31.0f, 40.0f);
        this.f37302c.cubicTo(31.5523f, 40.0f, 32.0f, 39.5523f, 32.0f, 39.0f);
        this.f37302c.lineTo(32.0f, 17.0f);
        this.f37302c.cubicTo(32.0f, 16.4477f, 31.5523f, 16.0f, 31.0f, 16.0f);
        this.f37302c.lineTo(9.0f, 16.0f);
        this.f37302c.close();
        this.f37302c.moveTo(16.9537f, 20.0327f);
        this.f37302c.cubicTo(16.4157f, 19.683f, 15.7293f, 19.6558f, 15.1653f, 19.9619f);
        this.f37302c.cubicTo(14.6013f, 20.268f, 14.25f, 20.8583f, 14.25f, 21.5f);
        this.f37302c.lineTo(14.25f, 34.5f);
        this.f37302c.cubicTo(14.25f, 35.1417f, 14.6013f, 35.732f, 15.1653f, 36.0381f);
        this.f37302c.cubicTo(15.7293f, 36.3442f, 16.4157f, 36.317f, 16.9537f, 35.9673f);
        this.f37302c.lineTo(26.9537f, 29.4673f);
        this.f37302c.cubicTo(27.4504f, 29.1445f, 27.75f, 28.5923f, 27.75f, 28.0f);
        this.f37302c.cubicTo(27.75f, 27.4077f, 27.4504f, 26.8555f, 26.9537f, 26.5327f);
        this.f37302c.lineTo(16.9537f, 20.0327f);
        this.f37302c.close();
        this.f37302c.moveTo(22.7889f, 28.0f);
        this.f37302c.lineTo(17.75f, 31.2753f);
        this.f37302c.lineTo(17.75f, 24.7247f);
        this.f37302c.lineTo(22.7889f, 28.0f);
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
