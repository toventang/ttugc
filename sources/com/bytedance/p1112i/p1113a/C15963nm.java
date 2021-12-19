package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.nm */
public class C15963nm extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18229);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 12.5f);
        this.f37302c.cubicTo(17.6487f, 12.5f, 12.5f, 17.6487f, 12.5f, 24.0f);
        this.f37302c.cubicTo(12.5f, 30.3513f, 17.6487f, 35.5f, 24.0f, 35.5f);
        this.f37302c.cubicTo(26.8172f, 35.5f, 29.3919f, 34.4902f, 31.3919f, 32.8101f);
        this.f37302c.cubicTo(32.4491f, 31.9219f, 34.026f, 32.059f, 34.9142f, 33.1161f);
        this.f37302c.cubicTo(35.8023f, 34.1733f, 35.6653f, 35.7503f, 34.6081f, 36.6384f);
        this.f37302c.cubicTo(31.741f, 39.0471f, 28.0369f, 40.5f, 24.0f, 40.5f);
        this.f37302c.cubicTo(14.8873f, 40.5f, 7.5f, 33.1127f, 7.5f, 24.0f);
        this.f37302c.cubicTo(7.5f, 14.8873f, 14.8873f, 7.5f, 24.0f, 7.5f);
        this.f37302c.cubicTo(33.1127f, 7.5f, 40.5f, 14.8873f, 40.5f, 24.0f);
        this.f37302c.cubicTo(40.5f, 25.3807f, 39.3807f, 26.5f, 38.0f, 26.5f);
        this.f37302c.cubicTo(36.6193f, 26.5f, 35.5f, 25.3807f, 35.5f, 24.0f);
        this.f37302c.cubicTo(35.5f, 17.6487f, 30.3513f, 12.5f, 24.0f, 12.5f);
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
