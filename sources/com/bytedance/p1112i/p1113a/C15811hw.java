package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.hw */
public class C15811hw extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18077);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(4.73798f, 10.8741f);
        this.f37302c.cubicTo(3.16655f, 8.90981f, 4.56505f, 6.0f, 7.08058f, 6.0f);
        this.f37302c.lineTo(40.6987f, 6.0f);
        this.f37302c.cubicTo(43.3219f, 6.0f, 44.6817f, 9.12929f, 42.8919f, 11.047f);
        this.f37302c.lineTo(31.0f, 23.7883f);
        this.f37302c.lineTo(31.0f, 41.259f);
        this.f37302c.cubicTo(31.0f, 43.5743f, 28.4883f, 45.0169f, 26.4883f, 43.8503f);
        this.f37302c.lineTo(16.4883f, 38.017f);
        this.f37302c.cubicTo(15.5667f, 37.4793f, 15.0f, 36.4926f, 15.0f, 35.4256f);
        this.f37302c.lineTo(15.0f, 23.7016f);
        this.f37302c.lineTo(4.73798f, 10.8741f);
        this.f37302c.close();
        this.f37302c.moveTo(9.16121f, 10.0f);
        this.f37302c.lineTo(18.3426f, 21.4767f);
        this.f37302c.cubicTo(18.7681f, 22.0086f, 19.0f, 22.6696f, 19.0f, 23.3508f);
        this.f37302c.lineTo(19.0f, 34.8513f);
        this.f37302c.lineTo(27.0f, 39.5179f);
        this.f37302c.lineTo(27.0f, 23.3942f);
        this.f37302c.cubicTo(27.0f, 22.6343f, 27.2883f, 21.9027f, 27.8068f, 21.3472f);
        this.f37302c.lineTo(38.3975f, 10.0f);
        this.f37302c.lineTo(9.16121f, 10.0f);
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
