package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pz */
public class C16030pz extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18296);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(21.1716f, 24.0f);
        this.f37302c.lineTo(13.2929f, 16.1213f);
        this.f37302c.cubicTo(12.9024f, 15.7308f, 12.9024f, 15.0976f, 13.2929f, 14.7071f);
        this.f37302c.lineTo(14.7071f, 13.2929f);
        this.f37302c.cubicTo(15.0976f, 12.9024f, 15.7308f, 12.9024f, 16.1213f, 13.2929f);
        this.f37302c.lineTo(24.0f, 21.1716f);
        this.f37302c.lineTo(31.8787f, 13.2929f);
        this.f37302c.cubicTo(32.2692f, 12.9024f, 32.9024f, 12.9024f, 33.2929f, 13.2929f);
        this.f37302c.lineTo(34.7071f, 14.7071f);
        this.f37302c.cubicTo(35.0976f, 15.0976f, 35.0976f, 15.7308f, 34.7071f, 16.1213f);
        this.f37302c.lineTo(26.8284f, 24.0f);
        this.f37302c.lineTo(34.7071f, 31.8787f);
        this.f37302c.cubicTo(35.0976f, 32.2692f, 35.0976f, 32.9024f, 34.7071f, 33.2929f);
        this.f37302c.lineTo(33.2929f, 34.7071f);
        this.f37302c.cubicTo(32.9024f, 35.0976f, 32.2692f, 35.0976f, 31.8787f, 34.7071f);
        this.f37302c.lineTo(24.0f, 26.8284f);
        this.f37302c.lineTo(16.1213f, 34.7071f);
        this.f37302c.cubicTo(15.7308f, 35.0976f, 15.0976f, 35.0976f, 14.7071f, 34.7071f);
        this.f37302c.lineTo(13.2929f, 33.2929f);
        this.f37302c.cubicTo(12.9024f, 32.9024f, 12.9024f, 32.2692f, 13.2929f, 31.8787f);
        this.f37302c.lineTo(21.1716f, 24.0f);
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
