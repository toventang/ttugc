package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.oy */
public class C16002oy extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18268);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(36.0398f, 13.3599f);
        this.f37302c.cubicTo(36.237f, 13.1621f, 36.5581f, 13.1643f, 36.7526f, 13.3647f);
        this.f37302c.lineTo(39.2574f, 15.9456f);
        this.f37302c.cubicTo(39.4475f, 16.1415f, 39.4454f, 16.4536f, 39.2526f, 16.6469f);
        this.f37302c.lineTo(21.1164f, 34.8325f);
        this.f37302c.cubicTo(20.2099f, 35.7415f, 18.7467f, 35.7193f, 17.8673f, 34.7832f);
        this.f37302c.lineTo(9.33681f, 25.7027f);
        this.f37302c.cubicTo(9.14991f, 25.5037f, 9.15711f, 25.1916f, 9.35299f, 25.0015f);
        this.f37302c.lineTo(11.9322f, 22.4982f);
        this.f37302c.cubicTo(12.1326f, 22.3036f, 12.4536f, 22.3111f, 12.6448f, 22.5146f);
        this.f37302c.lineTo(19.5643f, 29.8803f);
        this.f37302c.lineTo(36.0398f, 13.3599f);
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
