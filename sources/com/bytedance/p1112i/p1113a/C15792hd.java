package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.hd */
public class C15792hd extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18058);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(16.125f, 13.0f);
        this.f37302c.cubicTo(10.0336f, 13.0f, 5.0f, 18.0952f, 5.0f, 24.5f);
        this.f37302c.cubicTo(5.0f, 30.9048f, 10.0336f, 36.0f, 16.125f, 36.0f);
        this.f37302c.cubicTo(17.7653f, 36.0f, 19.3225f, 35.634f, 20.7256f, 34.9741f);
        this.f37302c.cubicTo(18.2535f, 32.2116f, 16.75f, 28.5306f, 16.75f, 24.5f);
        this.f37302c.cubicTo(16.75f, 20.4716f, 18.2519f, 16.7923f, 20.7216f, 14.0304f);
        this.f37302c.cubicTo(19.3426f, 13.3843f, 17.7812f, 13.0f, 16.125f, 13.0f);
        this.f37302c.close();
        this.f37302c.moveTo(23.9972f, 11.266f);
        this.f37302c.cubicTo(21.7731f, 9.88003f, 19.0673f, 9.0f, 16.125f, 9.0f);
        this.f37302c.cubicTo(7.71896f, 9.0f, 1.0f, 15.9931f, 1.0f, 24.5f);
        this.f37302c.cubicTo(1.0f, 33.0069f, 7.71896f, 40.0f, 16.125f, 40.0f);
        this.f37302c.cubicTo(19.011f, 40.0f, 21.7085f, 39.1701f, 24.0f, 37.7358f);
        this.f37302c.cubicTo(26.2915f, 39.1701f, 28.989f, 40.0f, 31.875f, 40.0f);
        this.f37302c.cubicTo(40.281f, 40.0f, 47.0f, 33.0069f, 47.0f, 24.5f);
        this.f37302c.cubicTo(47.0f, 15.9931f, 40.281f, 9.0f, 31.875f, 9.0f);
        this.f37302c.cubicTo(28.9878f, 9.0f, 26.2893f, 9.83056f, 23.9972f, 11.266f);
        this.f37302c.close();
        this.f37302c.moveTo(31.875f, 13.0f);
        this.f37302c.cubicTo(29.3823f, 13.0f, 27.0814f, 13.8453f, 25.2217f, 15.2825f);
        this.f37302c.cubicTo(22.514f, 17.375f, 20.75f, 20.7165f, 20.75f, 24.5f);
        this.f37302c.cubicTo(20.75f, 28.284f, 22.5145f, 31.6259f, 25.2228f, 33.7183f);
        this.f37302c.cubicTo(27.0823f, 35.155f, 29.3828f, 36.0f, 31.875f, 36.0f);
        this.f37302c.cubicTo(37.9664f, 36.0f, 43.0f, 30.9048f, 43.0f, 24.5f);
        this.f37302c.cubicTo(43.0f, 18.0952f, 37.9664f, 13.0f, 31.875f, 13.0f);
        this.f37302c.close();
        this.f37302c.moveTo(27.0f, 20.0f);
        this.f37302c.cubicTo(27.0f, 18.8954f, 27.8954f, 18.0f, 29.0f, 18.0f);
        this.f37302c.cubicTo(30.1046f, 18.0f, 31.0f, 18.8954f, 31.0f, 20.0f);
        this.f37302c.lineTo(31.0f, 24.0f);
        this.f37302c.cubicTo(31.0f, 25.1046f, 30.1046f, 26.0f, 29.0f, 26.0f);
        this.f37302c.cubicTo(27.8954f, 26.0f, 27.0f, 25.1046f, 27.0f, 24.0f);
        this.f37302c.lineTo(27.0f, 20.0f);
        this.f37302c.close();
        this.f37302c.moveTo(36.0f, 18.0f);
        this.f37302c.cubicTo(34.8954f, 18.0f, 34.0f, 18.8954f, 34.0f, 20.0f);
        this.f37302c.lineTo(34.0f, 24.0f);
        this.f37302c.cubicTo(34.0f, 25.1046f, 34.8954f, 26.0f, 36.0f, 26.0f);
        this.f37302c.cubicTo(37.1046f, 26.0f, 38.0f, 25.1046f, 38.0f, 24.0f);
        this.f37302c.lineTo(38.0f, 20.0f);
        this.f37302c.cubicTo(38.0f, 18.8954f, 37.1046f, 18.0f, 36.0f, 18.0f);
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
