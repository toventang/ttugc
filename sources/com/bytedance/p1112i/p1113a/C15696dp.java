package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dp */
public class C15696dp extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17962);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(21.3846f, 33.6985f);
        this.f37302c.lineTo(10.6004f, 22.9143f);
        this.f37302c.lineTo(30.8283f, 22.9143f);
        this.f37302c.cubicTo(35.2466f, 22.9143f, 38.8283f, 26.496f, 38.8283f, 30.9143f);
        this.f37302c.lineTo(38.8283f, 40.4143f);
        this.f37302c.cubicTo(38.8283f, 40.9665f, 39.276f, 41.4143f, 39.8283f, 41.4143f);
        this.f37302c.lineTo(41.8283f, 41.4143f);
        this.f37302c.cubicTo(42.3806f, 41.4143f, 42.8283f, 40.9665f, 42.8283f, 40.4143f);
        this.f37302c.lineTo(42.8283f, 29.9143f);
        this.f37302c.cubicTo(42.8283f, 23.8391f, 37.9034f, 18.9143f, 31.8283f, 18.9143f);
        this.f37302c.lineTo(30.8283f, 18.9143f);
        this.f37302c.lineTo(10.713f, 18.9143f);
        this.f37302c.lineTo(22.0917f, 7.53551f);
        this.f37302c.cubicTo(22.4823f, 7.14498f, 22.4823f, 6.51182f, 22.0917f, 6.12129f);
        this.f37302c.lineTo(20.6775f, 4.70708f);
        this.f37302c.cubicTo(20.287f, 4.31655f, 19.6538f, 4.31655f, 19.2633f, 4.70708f);
        this.f37302c.lineTo(3.70696f, 20.2634f);
        this.f37302c.cubicTo(3.31643f, 20.654f, 3.31643f, 21.2871f, 3.70696f, 21.6776f);
        this.f37302c.lineTo(18.5562f, 36.5269f);
        this.f37302c.cubicTo(18.9467f, 36.9174f, 19.5799f, 36.9174f, 19.9704f, 36.5269f);
        this.f37302c.lineTo(21.3846f, 35.1127f);
        this.f37302c.cubicTo(21.7752f, 34.7221f, 21.7752f, 34.089f, 21.3846f, 33.6985f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
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
