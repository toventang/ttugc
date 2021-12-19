package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.km */
public class C15882km extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18148);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(4.0f, 42.0f);
        this.f37302c.lineTo(4.0f, 5.0f);
        this.f37302c.cubicTo(4.0f, 4.44772f, 4.44772f, 4.0f, 5.0f, 4.0f);
        this.f37302c.lineTo(7.0f, 4.0f);
        this.f37302c.cubicTo(7.55228f, 4.0f, 8.0f, 4.44772f, 8.0f, 5.0f);
        this.f37302c.lineTo(8.0f, 40.0f);
        this.f37302c.lineTo(43.0f, 40.0f);
        this.f37302c.cubicTo(43.5523f, 40.0f, 44.0f, 40.4477f, 44.0f, 41.0f);
        this.f37302c.lineTo(44.0f, 43.0f);
        this.f37302c.cubicTo(44.0f, 43.5523f, 43.5523f, 44.0f, 43.0f, 44.0f);
        this.f37302c.lineTo(6.0f, 44.0f);
        this.f37302c.cubicTo(4.89543f, 44.0f, 4.0f, 43.1046f, 4.0f, 42.0f);
        this.f37302c.close();
        this.f37302c.moveTo(42.8396f, 11.5433f);
        this.f37302c.cubicTo(43.3033f, 11.8433f, 43.4359f, 12.4624f, 43.1359f, 12.9261f);
        this.f37302c.lineTo(32.6791f, 29.0865f);
        this.f37302c.cubicTo(32.3807f, 29.5477f, 31.9057f, 29.8659f, 31.3656f, 29.9663f);
        this.f37302c.cubicTo(30.8255f, 30.0667f, 30.2679f, 29.9406f, 29.8237f, 29.6175f);
        this.f37302c.lineTo(20.5908f, 22.9027f);
        this.f37302c.lineTo(13.2295f, 35.1715f);
        this.f37302c.cubicTo(12.9453f, 35.6451f, 12.3311f, 35.7986f, 11.8575f, 35.5145f);
        this.f37302c.lineTo(10.1425f, 34.4855f);
        this.f37302c.cubicTo(9.66893f, 34.2014f, 9.51536f, 33.5871f, 9.79951f, 33.1135f);
        this.f37302c.lineTo(18.285f, 18.971f);
        this.f37302c.cubicTo(18.5737f, 18.4898f, 19.0513f, 18.1521f, 19.6011f, 18.0402f);
        this.f37302c.cubicTo(20.151f, 17.9283f, 20.7225f, 18.0525f, 21.1763f, 18.3825f);
        this.f37302c.lineTo(30.4682f, 25.1403f);
        this.f37302c.lineTo(39.7776f, 10.7531f);
        this.f37302c.cubicTo(40.0776f, 10.2894f, 40.6967f, 10.1567f, 41.1604f, 10.4567f);
        this.f37302c.lineTo(42.8396f, 11.5433f);
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
