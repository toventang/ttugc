package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dm */
public class C15693dm extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17959);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.7125f, 32.0323f);
        this.f37302c.cubicTo(24.3109f, 32.5525f, 23.5252f, 32.5505f, 23.1263f, 32.0282f);
        this.f37302c.lineTo(14.4015f, 20.6071f);
        this.f37302c.cubicTo(13.8988f, 19.949f, 14.368f, 19.0f, 15.1962f, 19.0f);
        this.f37302c.lineTo(32.7385f, 19.0f);
        this.f37302c.cubicTo(33.569f, 19.0f, 34.0375f, 19.9537f, 33.53f, 20.6111f);
        this.f37302c.lineTo(24.7125f, 32.0323f);
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
