package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.iu */
public class C15836iu extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18102);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 11.8398f);
        this.f37302c.cubicTo(19.5844f, 7.66853f, 13.1632f, 7.7704f, 9.02532f, 11.8424f);
        this.f37302c.cubicTo(4.65823f, 16.14f, 4.65823f, 23.1229f, 9.02532f, 27.4205f);
        this.f37302c.lineTo(22.4218f, 40.6037f);
        this.f37302c.cubicTo(23.2975f, 41.4655f, 24.7025f, 41.4655f, 25.5782f, 40.6037f);
        this.f37302c.lineTo(38.9747f, 27.4205f);
        this.f37302c.cubicTo(43.3418f, 23.1229f, 43.3418f, 16.14f, 38.9747f, 11.8424f);
        this.f37302c.cubicTo(34.8368f, 7.7704f, 28.4156f, 7.66853f, 24.0f, 11.8398f);
        this.f37302c.close();
        this.f37302c.moveTo(21.474f, 15.7008f);
        this.f37302c.cubicTo(18.7286f, 12.5331f, 14.704f, 12.5676f, 12.1817f, 15.0498f);
        this.f37302c.cubicTo(9.60611f, 17.5844f, 9.60611f, 21.6785f, 12.1817f, 24.2131f);
        this.f37302c.lineTo(24.0f, 35.8433f);
        this.f37302c.lineTo(35.8183f, 24.2131f);
        this.f37302c.cubicTo(38.3939f, 21.6785f, 38.3939f, 17.5844f, 35.8183f, 15.0498f);
        this.f37302c.cubicTo(33.296f, 12.5676f, 29.2714f, 12.5331f, 26.526f, 15.7008f);
        this.f37302c.lineTo(26.4675f, 15.7682f);
        this.f37302c.lineTo(24.0f, 18.1965f);
        this.f37302c.lineTo(21.5325f, 15.7682f);
        this.f37302c.lineTo(21.474f, 15.7008f);
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
