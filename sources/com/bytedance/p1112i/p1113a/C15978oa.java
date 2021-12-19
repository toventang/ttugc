package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.oa */
public class C15978oa extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18244);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(12.5133f, 23.441f);
        this.f37302c.lineTo(14.8817f, 21.4192f);
        this.f37302c.cubicTo(15.3018f, 21.0607f, 15.933f, 21.1105f, 16.2915f, 21.5306f);
        this.f37302c.lineTo(16.9408f, 22.2911f);
        this.f37302c.cubicTo(17.2993f, 22.7112f, 17.2495f, 23.3424f, 16.8294f, 23.701f);
        this.f37302c.lineTo(12.214f, 27.6409f);
        this.f37302c.cubicTo(11.6665f, 28.1083f, 10.8641f, 28.1208f, 10.3023f, 27.6707f);
        this.f37302c.lineTo(5.1956f, 23.5795f);
        this.f37302c.cubicTo(4.76458f, 23.2342f, 4.69509f, 22.6048f, 5.0404f, 22.1738f);
        this.f37302c.lineTo(5.66564f, 21.3934f);
        this.f37302c.cubicTo(6.01095f, 20.9624f, 6.64029f, 20.8929f, 7.07131f, 21.2382f);
        this.f37302c.lineTo(9.5216f, 23.2012f);
        this.f37302c.cubicTo(9.93622f, 15.5646f, 16.2599f, 9.5f, 24.0f, 9.5f);
        this.f37302c.cubicTo(32.0081f, 9.5f, 38.5f, 15.9919f, 38.5f, 24.0f);
        this.f37302c.cubicTo(38.5f, 32.0081f, 32.0081f, 38.5f, 24.0f, 38.5f);
        this.f37302c.cubicTo(20.2479f, 38.5f, 16.827f, 37.0733f, 14.2535f, 34.7358f);
        this.f37302c.cubicTo(13.8446f, 34.3645f, 13.8599f, 33.7286f, 14.2584f, 33.3462f);
        this.f37302c.lineTo(14.9799f, 32.6538f);
        this.f37302c.cubicTo(15.3783f, 32.2714f, 16.0087f, 32.2881f, 16.424f, 32.6522f);
        this.f37302c.cubicTo(18.4484f, 34.4265f, 21.0978f, 35.5f, 24.0f, 35.5f);
        this.f37302c.cubicTo(30.3512f, 35.5f, 35.5f, 30.3513f, 35.5f, 24.0f);
        this.f37302c.cubicTo(35.5f, 17.6487f, 30.3512f, 12.5f, 24.0f, 12.5f);
        this.f37302c.cubicTo(17.8361f, 12.5f, 12.8049f, 17.3493f, 12.5133f, 23.441f);
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
