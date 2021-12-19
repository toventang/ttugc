package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dn */
public class C15694dn extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17960);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(25.5187f, 35.2284f);
        this.f37302c.cubicTo(24.7205f, 36.1596f, 23.2798f, 36.1596f, 22.4816f, 35.2284f);
        this.f37302c.lineTo(8.83008f, 19.3016f);
        this.f37302c.cubicTo(7.71807f, 18.0042f, 8.63988f, 16.0f, 10.3486f, 16.0f);
        this.f37302c.lineTo(37.6517f, 16.0f);
        this.f37302c.cubicTo(39.3604f, 16.0f, 40.2822f, 18.0042f, 39.1702f, 19.3016f);
        this.f37302c.lineTo(25.5187f, 35.2284f);
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
