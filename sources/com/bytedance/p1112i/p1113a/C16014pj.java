package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pj */
public class C16014pj extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18280);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(8.12359f, 21.0f);
        this.f37302c.lineTo(39.8763f, 21.0f);
        this.f37302c.cubicTo(38.8928f, 13.1082f, 32.1591f, 7.0f, 24.0f, 7.0f);
        this.f37302c.cubicTo(15.8408f, 7.0f, 9.10707f, 13.1082f, 8.12359f, 21.0f);
        this.f37302c.close();
        this.f37302c.moveTo(4.03026f, 21.8907f);
        this.f37302c.cubicTo(4.60686f, 11.3601f, 13.3264f, 3.0f, 24.0f, 3.0f);
        this.f37302c.cubicTo(34.6735f, 3.0f, 43.3931f, 11.3601f, 43.9697f, 21.8907f);
        this.f37302c.cubicTo(44.0665f, 23.6593f, 42.627f, 25.0f, 41.0f, 25.0f);
        this.f37302c.lineTo(27.0f, 25.0f);
        this.f37302c.lineTo(27.0f, 36.0f);
        this.f37302c.cubicTo(27.0f, 40.4183f, 23.4182f, 44.0f, 19.0f, 44.0f);
        this.f37302c.cubicTo(14.9197f, 44.0f, 11.5528f, 40.9453f, 11.0616f, 36.998f);
        this.f37302c.cubicTo(10.9934f, 36.45f, 11.4477f, 36.0f, 12.0f, 36.0f);
        this.f37302c.lineTo(14.0f, 36.0f);
        this.f37302c.cubicTo(14.5522f, 36.0f, 14.9871f, 36.4547f, 15.1234f, 36.9899f);
        this.f37302c.cubicTo(15.5639f, 38.7202f, 17.1325f, 40.0f, 19.0f, 40.0f);
        this.f37302c.cubicTo(21.2091f, 40.0f, 23.0f, 38.2091f, 23.0f, 36.0f);
        this.f37302c.lineTo(23.0f, 25.0f);
        this.f37302c.lineTo(6.99996f, 25.0f);
        this.f37302c.cubicTo(5.37287f, 25.0f, 3.93341f, 23.6593f, 4.03026f, 21.8907f);
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
