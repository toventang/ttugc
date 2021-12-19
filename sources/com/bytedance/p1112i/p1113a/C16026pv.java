package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pv */
public class C16026pv extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18292);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(21.1718f, 23.9999f);
        this.f37302c.lineTo(10.2931f, 13.1212f);
        this.f37302c.cubicTo(9.90261f, 12.7307f, 9.90261f, 12.0975f, 10.2931f, 11.707f);
        this.f37302c.lineTo(11.7074f, 10.2928f);
        this.f37302c.cubicTo(12.0979f, 9.90228f, 12.731f, 9.90228f, 13.1216f, 10.2928f);
        this.f37302c.lineTo(24.0002f, 21.1715f);
        this.f37302c.lineTo(34.8789f, 10.2928f);
        this.f37302c.cubicTo(35.2694f, 9.90228f, 35.9026f, 9.90228f, 36.2931f, 10.2928f);
        this.f37302c.lineTo(37.7073f, 11.707f);
        this.f37302c.cubicTo(38.0979f, 12.0975f, 38.0979f, 12.7307f, 37.7073f, 13.1212f);
        this.f37302c.lineTo(26.8287f, 23.9999f);
        this.f37302c.lineTo(37.7073f, 34.8786f);
        this.f37302c.cubicTo(38.0979f, 35.2691f, 38.0979f, 35.9023f, 37.7073f, 36.2928f);
        this.f37302c.lineTo(36.2931f, 37.707f);
        this.f37302c.cubicTo(35.9026f, 38.0975f, 35.2694f, 38.0975f, 34.8789f, 37.707f);
        this.f37302c.lineTo(24.0002f, 26.8283f);
        this.f37302c.lineTo(13.1216f, 37.707f);
        this.f37302c.cubicTo(12.731f, 38.0975f, 12.0979f, 38.0975f, 11.7074f, 37.707f);
        this.f37302c.lineTo(10.2931f, 36.2928f);
        this.f37302c.cubicTo(9.90261f, 35.9023f, 9.90261f, 35.2691f, 10.2931f, 34.8786f);
        this.f37302c.lineTo(21.1718f, 23.9999f);
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
