package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.bm */
public class C15639bm extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17905);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(37.3286f, 8.74967f);
        this.f37302c.cubicTo(37.7479f, 9.02753f, 38.0f, 9.49703f, 38.0f, 10.0f);
        this.f37302c.lineTo(38.0f, 36.0f);
        this.f37302c.cubicTo(38.0f, 36.4942f, 37.7566f, 36.9567f, 37.3492f, 37.2365f);
        this.f37302c.cubicTo(36.9418f, 37.5163f, 36.4228f, 37.5774f, 35.9615f, 37.4f);
        this.f37302c.lineTo(29.9371f, 35.0829f);
        this.f37302c.cubicTo(28.5667f, 36.8556f, 26.4179f, 38.0f, 24.0f, 38.0f);
        this.f37302c.cubicTo(19.8579f, 38.0f, 16.5f, 34.6421f, 16.5f, 30.5f);
        this.f37302c.cubicTo(16.5f, 30.3061f, 16.5074f, 30.1138f, 16.5219f, 29.9233f);
        this.f37302c.lineTo(12.0f, 28.184f);
        this.f37302c.lineTo(12.0f, 29.0f);
        this.f37302c.cubicTo(12.0f, 29.5523f, 11.5523f, 30.0f, 11.0f, 30.0f);
        this.f37302c.lineTo(10.0f, 30.0f);
        this.f37302c.cubicTo(9.44772f, 30.0f, 9.0f, 29.5523f, 9.0f, 29.0f);
        this.f37302c.lineTo(9.0f, 17.5f);
        this.f37302c.cubicTo(9.0f, 16.9477f, 9.44772f, 16.5f, 10.0f, 16.5f);
        this.f37302c.lineTo(11.0f, 16.5f);
        this.f37302c.cubicTo(11.5523f, 16.5f, 12.0f, 16.9477f, 12.0f, 17.5f);
        this.f37302c.lineTo(12.0f, 18.7367f);
        this.f37302c.lineTo(35.9155f, 8.61855f);
        this.f37302c.cubicTo(36.3788f, 8.42257f, 36.9094f, 8.47181f, 37.3286f, 8.74967f);
        this.f37302c.close();
        this.f37302c.moveTo(12.0f, 21.9941f);
        this.f37302c.lineTo(12.0f, 24.9698f);
        this.f37302c.lineTo(35.0f, 33.816f);
        this.f37302c.lineTo(35.0f, 12.2633f);
        this.f37302c.lineTo(12.0f, 21.9941f);
        this.f37302c.close();
        this.f37302c.moveTo(19.5374f, 31.0831f);
        this.f37302c.cubicTo(19.8233f, 33.2929f, 21.7123f, 35.0f, 24.0f, 35.0f);
        this.f37302c.cubicTo(25.1141f, 35.0f, 26.1346f, 34.5953f, 26.9215f, 33.9231f);
        this.f37302c.lineTo(19.5374f, 31.0831f);
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
