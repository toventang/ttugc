package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ok */
public class C15988ok extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18254);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(10.3938f, 12.1972f);
        this.f37302c.cubicTo(14.163f, 8.52339f, 20.0853f, 8.54285f, 24.0f, 12.6217f);
        this.f37302c.cubicTo(27.9147f, 8.54285f, 33.837f, 8.52339f, 37.6062f, 12.1972f);
        this.f37302c.cubicTo(41.4646f, 15.958f, 41.4646f, 22.0718f, 37.6062f, 25.8326f);
        this.f37302c.lineTo(25.047f, 38.0742f);
        this.f37302c.cubicTo(24.4645f, 38.6419f, 23.5355f, 38.6419f, 22.953f, 38.0742f);
        this.f37302c.lineTo(10.3938f, 25.8326f);
        this.f37302c.cubicTo(6.5354f, 22.0718f, 6.5354f, 15.958f, 10.3938f, 12.1972f);
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
