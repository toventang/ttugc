package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.li */
public class C15905li extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18171);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(20.3019f, 6.38068f);
        this.f37302c.cubicTo(21.723f, 6.08373f, 22.9615f, 7.16986f, 23.009f, 8.50693f);
        this.f37302c.cubicTo(23.2751f, 16.0034f, 29.4377f, 22.0f, 37.0f, 22.0f);
        this.f37302c.cubicTo(37.8141f, 22.0f, 38.6105f, 21.9307f, 39.3839f, 21.7982f);
        this.f37302c.cubicTo(40.7019f, 21.5723f, 42.0f, 22.5655f, 42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 33.9411f, 33.9411f, 42.0f, 24.0f, 42.0f);
        this.f37302c.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
        this.f37302c.cubicTo(6.0f, 15.3248f, 12.1351f, 8.0871f, 20.3019f, 6.38068f);
        this.f37302c.close();
        this.f37302c.moveTo(19.2223f, 10.8358f);
        this.f37302c.cubicTo(13.8426f, 12.7885f, 10.0f, 17.9473f, 10.0f, 24.0f);
        this.f37302c.cubicTo(10.0f, 31.732f, 16.268f, 38.0f, 24.0f, 38.0f);
        this.f37302c.cubicTo(31.06f, 38.0f, 36.8994f, 32.7742f, 37.8611f, 25.9797f);
        this.f37302c.cubicTo(37.5756f, 25.9932f, 37.2886f, 26.0f, 37.0f, 26.0f);
        this.f37302c.cubicTo(28.0237f, 26.0f, 20.5827f, 19.4301f, 19.2223f, 10.8358f);
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
