package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.hh */
public class C15796hh extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18062);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 5.0f);
        this.f37302c.cubicTo(26.2091f, 5.0f, 28.0f, 6.79086f, 28.0f, 9.0f);
        this.f37302c.cubicTo(28.0f, 11.2091f, 26.2091f, 13.0f, 24.0f, 13.0f);
        this.f37302c.cubicTo(21.7909f, 13.0f, 20.0f, 11.2091f, 20.0f, 9.0f);
        this.f37302c.cubicTo(20.0f, 6.79086f, 21.7909f, 5.0f, 24.0f, 5.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 20.0f);
        this.f37302c.cubicTo(26.2091f, 20.0f, 28.0f, 21.7909f, 28.0f, 24.0f);
        this.f37302c.cubicTo(28.0f, 26.2091f, 26.2091f, 28.0f, 24.0f, 28.0f);
        this.f37302c.cubicTo(21.7909f, 28.0f, 20.0f, 26.2091f, 20.0f, 24.0f);
        this.f37302c.cubicTo(20.0f, 21.7909f, 21.7909f, 20.0f, 24.0f, 20.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 35.0f);
        this.f37302c.cubicTo(26.2091f, 35.0f, 28.0f, 36.7909f, 28.0f, 39.0f);
        this.f37302c.cubicTo(28.0f, 41.2091f, 26.2091f, 43.0f, 24.0f, 43.0f);
        this.f37302c.cubicTo(21.7909f, 43.0f, 20.0f, 41.2091f, 20.0f, 39.0f);
        this.f37302c.cubicTo(20.0f, 36.7909f, 21.7909f, 35.0f, 24.0f, 35.0f);
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
