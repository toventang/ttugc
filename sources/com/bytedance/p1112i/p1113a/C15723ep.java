package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ep */
public class C15723ep extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17989);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(4.0f, 22.0f);
        this.f37302c.cubicTo(4.0f, 12.2852f, 13.3112f, 5.0f, 24.0f, 5.0f);
        this.f37302c.cubicTo(34.6888f, 5.0f, 44.0f, 12.2852f, 44.0f, 22.0f);
        this.f37302c.cubicTo(44.0f, 27.7044f, 41.1445f, 32.4256f, 37.6906f, 36.0123f);
        this.f37302c.cubicTo(34.2346f, 39.6013f, 30.0249f, 42.2236f, 26.8944f, 43.7889f);
        this.f37302c.cubicTo(26.2745f, 44.0988f, 25.5382f, 44.0657f, 24.9485f, 43.7013f);
        this.f37302c.cubicTo(24.3589f, 43.3369f, 24.0f, 42.6932f, 24.0f, 42.0f);
        this.f37302c.lineTo(24.0f, 39.0f);
        this.f37302c.cubicTo(13.3112f, 39.0f, 4.0f, 31.7148f, 4.0f, 22.0f);
        this.f37302c.close();
        this.f37302c.moveTo(15.5f, 25.0f);
        this.f37302c.cubicTo(16.8807f, 25.0f, 18.0f, 23.8807f, 18.0f, 22.5f);
        this.f37302c.cubicTo(18.0f, 21.1193f, 16.8807f, 20.0f, 15.5f, 20.0f);
        this.f37302c.cubicTo(14.1193f, 20.0f, 13.0f, 21.1193f, 13.0f, 22.5f);
        this.f37302c.cubicTo(13.0f, 23.8807f, 14.1193f, 25.0f, 15.5f, 25.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 25.0f);
        this.f37302c.cubicTo(25.3807f, 25.0f, 26.5f, 23.8807f, 26.5f, 22.5f);
        this.f37302c.cubicTo(26.5f, 21.1193f, 25.3807f, 20.0f, 24.0f, 20.0f);
        this.f37302c.cubicTo(22.6193f, 20.0f, 21.5f, 21.1193f, 21.5f, 22.5f);
        this.f37302c.cubicTo(21.5f, 23.8807f, 22.6193f, 25.0f, 24.0f, 25.0f);
        this.f37302c.close();
        this.f37302c.moveTo(35.0f, 22.5f);
        this.f37302c.cubicTo(35.0f, 23.8807f, 33.8807f, 25.0f, 32.5f, 25.0f);
        this.f37302c.cubicTo(31.1193f, 25.0f, 30.0f, 23.8807f, 30.0f, 22.5f);
        this.f37302c.cubicTo(30.0f, 21.1193f, 31.1193f, 20.0f, 32.5f, 20.0f);
        this.f37302c.cubicTo(33.8807f, 20.0f, 35.0f, 21.1193f, 35.0f, 22.5f);
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
