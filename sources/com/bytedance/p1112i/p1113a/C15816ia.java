package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ia */
public class C15816ia extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18082);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(10.0f, 5.5f);
        this.f37302c.cubicTo(10.0f, 5.22386f, 10.2239f, 5.0f, 10.5f, 5.0f);
        this.f37302c.lineTo(37.5f, 5.0f);
        this.f37302c.cubicTo(37.7761f, 5.0f, 38.0f, 5.22386f, 38.0f, 5.5f);
        this.f37302c.lineTo(38.0f, 8.5f);
        this.f37302c.cubicTo(38.0f, 8.77614f, 37.7761f, 9.0f, 37.5f, 9.0f);
        this.f37302c.lineTo(10.5f, 9.0f);
        this.f37302c.cubicTo(10.2239f, 9.0f, 10.0f, 8.77614f, 10.0f, 8.5f);
        this.f37302c.lineTo(10.0f, 5.5f);
        this.f37302c.close();
        this.f37302c.moveTo(7.21014f, 16.1404f);
        this.f37302c.cubicTo(5.80312f, 14.5224f, 6.95239f, 12.0f, 9.09665f, 12.0f);
        this.f37302c.lineTo(38.9019f, 12.0f);
        this.f37302c.cubicTo(41.0462f, 12.0f, 42.1954f, 14.5224f, 40.7884f, 16.1404f);
        this.f37302c.lineTo(31.9993f, 26.2479f);
        this.f37302c.lineTo(31.9993f, 43.5f);
        this.f37302c.cubicTo(31.9993f, 44.8807f, 30.88f, 46.0f, 29.4993f, 46.0f);
        this.f37302c.lineTo(18.4993f, 46.0f);
        this.f37302c.cubicTo(17.1186f, 46.0f, 15.9993f, 44.8807f, 15.9993f, 43.5f);
        this.f37302c.lineTo(15.9993f, 26.248f);
        this.f37302c.lineTo(7.21014f, 16.1404f);
        this.f37302c.close();
        this.f37302c.moveTo(19.3453f, 24.0f);
        this.f37302c.lineTo(28.6532f, 24.0f);
        this.f37302c.lineTo(35.6098f, 16.0f);
        this.f37302c.lineTo(12.3888f, 16.0f);
        this.f37302c.lineTo(19.3453f, 24.0f);
        this.f37302c.close();
        this.f37302c.moveTo(27.9993f, 28.0f);
        this.f37302c.lineTo(19.9993f, 28.0f);
        this.f37302c.lineTo(19.9993f, 42.0f);
        this.f37302c.lineTo(27.9993f, 42.0f);
        this.f37302c.lineTo(27.9993f, 28.0f);
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
