package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.aw */
public class C15622aw extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17888);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 4.5f);
        this.f37302c.cubicTo(24.8284f, 4.5f, 25.5f, 5.17157f, 25.5f, 6.0f);
        this.f37302c.lineTo(25.5f, 8.59284f);
        this.f37302c.cubicTo(31.4195f, 9.33098f, 36.0f, 14.3806f, 36.0f, 20.5f);
        this.f37302c.lineTo(36.0f, 26.8394f);
        this.f37302c.cubicTo(36.0f, 27.0188f, 36.0962f, 27.1845f, 36.2519f, 27.2735f);
        this.f37302c.lineTo(37.8611f, 28.193f);
        this.f37302c.cubicTo(38.8322f, 28.7479f, 39.4796f, 29.7336f, 39.6032f, 30.8453f);
        this.f37302c.lineTo(39.7441f, 32.1135f);
        this.f37302c.cubicTo(39.9744f, 34.1868f, 38.3515f, 36.0f, 36.2655f, 36.0f);
        this.f37302c.lineTo(28.5f, 36.0f);
        this.f37302c.cubicTo(28.5f, 38.4853f, 26.4853f, 40.5f, 24.0f, 40.5f);
        this.f37302c.cubicTo(21.5147f, 40.5f, 19.5f, 38.4853f, 19.5f, 36.0f);
        this.f37302c.lineTo(11.7345f, 36.0f);
        this.f37302c.cubicTo(9.6485f, 36.0f, 8.02559f, 34.1868f, 8.25595f, 32.1135f);
        this.f37302c.lineTo(8.39686f, 30.8453f);
        this.f37302c.cubicTo(8.52038f, 29.7336f, 9.16781f, 28.7479f, 10.139f, 28.193f);
        this.f37302c.lineTo(11.7481f, 27.2735f);
        this.f37302c.cubicTo(11.9039f, 27.1845f, 12.0f, 27.0188f, 12.0f, 26.8394f);
        this.f37302c.lineTo(12.0f, 20.5f);
        this.f37302c.cubicTo(12.0f, 14.3806f, 16.5805f, 9.331f, 22.5f, 8.59284f);
        this.f37302c.lineTo(22.5f, 6.0f);
        this.f37302c.cubicTo(22.5f, 5.17157f, 23.1716f, 4.5f, 24.0f, 4.5f);
        this.f37302c.close();
        this.f37302c.moveTo(22.5f, 36.0f);
        this.f37302c.cubicTo(22.5f, 36.8284f, 23.1716f, 37.5f, 24.0f, 37.5f);
        this.f37302c.cubicTo(24.8284f, 37.5f, 25.5f, 36.8284f, 25.5f, 36.0f);
        this.f37302c.lineTo(22.5f, 36.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 11.5f);
        this.f37302c.cubicTo(19.0295f, 11.5f, 15.0f, 15.5294f, 15.0f, 20.5f);
        this.f37302c.lineTo(15.0f, 26.8394f);
        this.f37302c.cubicTo(15.0f, 28.0954f, 14.327f, 29.2551f, 13.2365f, 29.8782f);
        this.f37302c.lineTo(11.6274f, 30.7977f);
        this.f37302c.cubicTo(11.4886f, 30.877f, 11.3962f, 31.0178f, 11.3785f, 31.1766f);
        this.f37302c.lineTo(11.2376f, 32.4448f);
        this.f37302c.cubicTo(11.2047f, 32.741f, 11.4365f, 33.0f, 11.7345f, 33.0f);
        this.f37302c.lineTo(36.2655f, 33.0f);
        this.f37302c.cubicTo(36.5635f, 33.0f, 36.7953f, 32.741f, 36.7624f, 32.4448f);
        this.f37302c.lineTo(36.6215f, 31.1766f);
        this.f37302c.cubicTo(36.6039f, 31.0178f, 36.5114f, 30.877f, 36.3726f, 30.7977f);
        this.f37302c.lineTo(34.7635f, 29.8782f);
        this.f37302c.cubicTo(33.673f, 29.2551f, 33.0f, 28.0954f, 33.0f, 26.8394f);
        this.f37302c.lineTo(33.0f, 20.5f);
        this.f37302c.cubicTo(33.0f, 15.5294f, 28.9706f, 11.5f, 24.0f, 11.5f);
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
