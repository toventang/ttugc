package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.e */
public class C15707e extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17973);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(12.0f, 12.0f);
        this.f37302c.cubicTo(12.0f, 9.79086f, 13.7909f, 8.0f, 16.0f, 8.0f);
        this.f37302c.lineTo(32.0f, 8.0f);
        this.f37302c.cubicTo(34.2091f, 8.0f, 36.0f, 9.79086f, 36.0f, 12.0f);
        this.f37302c.lineTo(36.0f, 37.0f);
        this.f37302c.cubicTo(36.0f, 37.3748f, 35.7904f, 37.7181f, 35.4571f, 37.8894f);
        this.f37302c.cubicTo(35.1238f, 38.0607f, 34.7226f, 38.0313f, 34.4179f, 37.8131f);
        this.f37302c.lineTo(24.0f, 30.3548f);
        this.f37302c.lineTo(13.5821f, 37.8131f);
        this.f37302c.cubicTo(13.2774f, 38.0313f, 12.8762f, 38.0607f, 12.5429f, 37.8894f);
        this.f37302c.cubicTo(12.2096f, 37.7181f, 12.0f, 37.3748f, 12.0f, 37.0f);
        this.f37302c.lineTo(12.0f, 12.0f);
        this.f37302c.close();
        this.f37302c.moveTo(16.0f, 10.0f);
        this.f37302c.cubicTo(14.8954f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f);
        this.f37302c.lineTo(14.0f, 35.0542f);
        this.f37302c.lineTo(23.4179f, 28.3119f);
        this.f37302c.cubicTo(23.766f, 28.0627f, 24.234f, 28.0627f, 24.5821f, 28.3119f);
        this.f37302c.lineTo(34.0f, 35.0542f);
        this.f37302c.lineTo(34.0f, 12.0f);
        this.f37302c.cubicTo(34.0f, 10.8954f, 33.1046f, 10.0f, 32.0f, 10.0f);
        this.f37302c.lineTo(16.0f, 10.0f);
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
