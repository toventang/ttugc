package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.iv */
public class C15837iv extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18103);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(41.1105f, 5.33665f);
        this.f37302c.cubicTo(41.6663f, 5.70769f, 42.0f, 6.33178f, 42.0f, 7.00001f);
        this.f37302c.lineTo(42.0f, 40.3585f);
        this.f37302c.cubicTo(42.0f, 41.0152f, 41.6776f, 41.63f, 41.1375f, 42.0035f);
        this.f37302c.cubicTo(40.5974f, 42.377f, 39.9083f, 42.4615f, 39.2939f, 42.2297f);
        this.f37302c.lineTo(31.4234f, 39.2597f);
        this.f37302c.cubicTo(29.6182f, 41.5407f, 26.8037f, 43.0f, 23.6538f, 43.0f);
        this.f37302c.cubicTo(18.2521f, 43.0f, 13.8077f, 38.6938f, 13.8077f, 33.3019f);
        this.f37302c.cubicTo(13.8077f, 33.0733f, 13.8158f, 32.8463f, 13.8316f, 32.6213f);
        this.f37302c.lineTo(8.0f, 30.4207f);
        this.f37302c.lineTo(8.0f, 31.6604f);
        this.f37302c.cubicTo(8.0f, 32.2127f, 7.55228f, 32.6604f, 7.0f, 32.6604f);
        this.f37302c.lineTo(5.0f, 32.6604f);
        this.f37302c.cubicTo(4.44772f, 32.6604f, 4.0f, 32.2127f, 4.0f, 31.6604f);
        this.f37302c.lineTo(4.0f, 16.3396f);
        this.f37302c.cubicTo(4.0f, 15.7873f, 4.44772f, 15.3396f, 5.0f, 15.3396f);
        this.f37302c.lineTo(7.0f, 15.3396f);
        this.f37302c.cubicTo(7.55228f, 15.3396f, 8.0f, 15.7873f, 8.0f, 16.3396f);
        this.f37302c.lineTo(8.0f, 18.1176f);
        this.f37302c.lineTo(39.2332f, 5.15282f);
        this.f37302c.cubicTo(39.8504f, 4.89664f, 40.5548f, 4.96561f, 41.1105f, 5.33665f);
        this.f37302c.close();
        this.f37302c.moveTo(8.0f, 22.4485f);
        this.f37302c.lineTo(8.0f, 26.1454f);
        this.f37302c.lineTo(38.0f, 37.4661f);
        this.f37302c.lineTo(38.0f, 9.99566f);
        this.f37302c.lineTo(8.0f, 22.4485f);
        this.f37302c.close();
        this.f37302c.moveTo(17.8718f, 34.1459f);
        this.f37302c.cubicTo(18.2886f, 36.8673f, 20.6895f, 39.0f, 23.6538f, 39.0f);
        this.f37302c.cubicTo(25.0581f, 39.0f, 26.3412f, 38.5187f, 27.3452f, 37.7208f);
        this.f37302c.lineTo(17.8718f, 34.1459f);
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
