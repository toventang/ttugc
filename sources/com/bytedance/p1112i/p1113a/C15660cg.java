package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.cg */
public class C15660cg extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17926);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(11.0f, 2.0f);
        this.f37302c.cubicTo(7.68629f, 2.0f, 5.0f, 4.68629f, 5.0f, 8.0f);
        this.f37302c.lineTo(5.0f, 40.0f);
        this.f37302c.cubicTo(5.0f, 43.3137f, 7.68629f, 46.0f, 11.0f, 46.0f);
        this.f37302c.lineTo(37.0f, 46.0f);
        this.f37302c.cubicTo(40.3137f, 46.0f, 43.0f, 43.3137f, 43.0f, 40.0f);
        this.f37302c.lineTo(43.0f, 8.0f);
        this.f37302c.cubicTo(43.0f, 4.68629f, 40.3137f, 2.0f, 37.0f, 2.0f);
        this.f37302c.lineTo(11.0f, 2.0f);
        this.f37302c.close();
        this.f37302c.moveTo(9.0f, 8.0f);
        this.f37302c.cubicTo(9.0f, 6.89543f, 9.89543f, 6.0f, 11.0f, 6.0f);
        this.f37302c.lineTo(37.0f, 6.0f);
        this.f37302c.cubicTo(38.1046f, 6.0f, 39.0f, 6.89543f, 39.0f, 8.0f);
        this.f37302c.lineTo(39.0f, 40.0f);
        this.f37302c.cubicTo(39.0f, 41.1046f, 38.1046f, 42.0f, 37.0f, 42.0f);
        this.f37302c.lineTo(11.0f, 42.0f);
        this.f37302c.cubicTo(9.89543f, 42.0f, 9.0f, 41.1046f, 9.0f, 40.0f);
        this.f37302c.lineTo(9.0f, 8.0f);
        this.f37302c.close();
        this.f37302c.moveTo(26.063f, 14.1175f);
        this.f37302c.cubicTo(25.7306f, 13.4415f, 25.0465f, 13.0096f, 24.2933f, 13.0002f);
        this.f37302c.cubicTo(23.54f, 12.9907f, 22.8453f, 13.4054f, 22.4961f, 14.0729f);
        this.f37302c.lineTo(15.6945f, 27.0746f);
        this.f37302c.lineTo(12.4672f, 33.1814f);
        this.f37302c.cubicTo(12.2092f, 33.6697f, 12.3958f, 34.2747f, 12.8841f, 34.5328f);
        this.f37302c.lineTo(14.6524f, 35.4672f);
        this.f37302c.cubicTo(15.1407f, 35.7253f, 15.7457f, 35.5386f, 16.0038f, 35.0503f);
        this.f37302c.lineTo(18.6718f, 30.0017f);
        this.f37302c.lineTo(29.4421f, 30.0017f);
        this.f37302c.lineTo(32.0324f, 35.0274f);
        this.f37302c.cubicTo(32.2854f, 35.5183f, 32.8885f, 35.7112f, 33.3794f, 35.4581f);
        this.f37302c.lineTo(35.1572f, 34.5419f);
        this.f37302c.cubicTo(35.6481f, 34.2888f, 35.8409f, 33.6858f, 35.5879f, 33.1948f);
        this.f37302c.lineTo(32.4477f, 27.1022f);
        this.f37302c.lineTo(26.063f, 14.1175f);
        this.f37302c.close();
        this.f37302c.moveTo(27.4492f, 26.0017f);
        this.f37302c.lineTo(20.77f, 26.0017f);
        this.f37302c.lineTo(24.213f, 19.4202f);
        this.f37302c.lineTo(27.4492f, 26.0017f);
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
