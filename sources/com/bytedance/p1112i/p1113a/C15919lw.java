package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.lw */
public class C15919lw extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18185);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(6.0f, 24.0004f);
        this.f37302c.cubicTo(6.0f, 33.9415f, 14.0589f, 42.0004f, 24.0f, 42.0004f);
        this.f37302c.cubicTo(33.9411f, 42.0004f, 42.0f, 33.9415f, 42.0f, 24.0004f);
        this.f37302c.cubicTo(42.0f, 14.0592f, 33.9411f, 6.00037f, 24.0f, 6.00037f);
        this.f37302c.cubicTo(14.0589f, 6.00037f, 6.0f, 14.0592f, 6.0f, 24.0004f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 2.00037f);
        this.f37302c.cubicTo(11.8497f, 2.00037f, 2.0f, 11.8501f, 2.0f, 24.0004f);
        this.f37302c.cubicTo(2.0f, 36.1506f, 11.8497f, 46.0004f, 24.0f, 46.0004f);
        this.f37302c.cubicTo(36.1503f, 46.0004f, 46.0f, 36.1506f, 46.0f, 24.0004f);
        this.f37302c.cubicTo(46.0f, 11.8501f, 36.1503f, 2.00037f, 24.0f, 2.00037f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0003f, 31.0527f);
        this.f37302c.cubicTo(21.1185f, 31.0527f, 18.6594f, 32.8781f, 17.7219f, 35.4364f);
        this.f37302c.cubicTo(17.5319f, 35.955f, 17.0111f, 36.3089f, 16.4698f, 36.199f);
        this.f37302c.lineTo(14.5098f, 35.8012f);
        this.f37302c.cubicTo(13.9686f, 35.6913f, 13.6143f, 35.1613f, 13.7746f, 34.6328f);
        this.f37302c.cubicTo(15.1049f, 30.2461f, 19.1777f, 27.0527f, 24.0003f, 27.0527f);
        this.f37302c.cubicTo(28.8229f, 27.0527f, 32.8957f, 30.2461f, 34.226f, 34.6328f);
        this.f37302c.cubicTo(34.3863f, 35.1613f, 34.0321f, 35.6913f, 33.4908f, 35.8012f);
        this.f37302c.lineTo(31.5308f, 36.199f);
        this.f37302c.cubicTo(30.9895f, 36.3089f, 30.4687f, 35.955f, 30.2787f, 35.4364f);
        this.f37302c.cubicTo(29.3412f, 32.8781f, 26.8821f, 31.0527f, 24.0003f, 31.0527f);
        this.f37302c.close();
        this.f37302c.moveTo(20.0f, 18.0f);
        this.f37302c.cubicTo(20.0f, 15.7909f, 21.7909f, 14.0f, 24.0f, 14.0f);
        this.f37302c.cubicTo(26.2091f, 14.0f, 28.0f, 15.7909f, 28.0f, 18.0f);
        this.f37302c.cubicTo(28.0f, 20.2091f, 26.2091f, 22.0f, 24.0f, 22.0f);
        this.f37302c.cubicTo(21.7909f, 22.0f, 20.0f, 20.2091f, 20.0f, 18.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 10.0f);
        this.f37302c.cubicTo(19.5817f, 10.0f, 16.0f, 13.5817f, 16.0f, 18.0f);
        this.f37302c.cubicTo(16.0f, 22.4183f, 19.5817f, 26.0f, 24.0f, 26.0f);
        this.f37302c.cubicTo(28.4183f, 26.0f, 32.0f, 22.4183f, 32.0f, 18.0f);
        this.f37302c.cubicTo(32.0f, 13.5817f, 28.4183f, 10.0f, 24.0f, 10.0f);
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
