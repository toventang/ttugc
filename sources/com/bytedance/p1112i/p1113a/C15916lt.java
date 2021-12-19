package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.lt */
public class C15916lt extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18182);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0003f, 7.0f);
        this.f37302c.cubicTo(20.1343f, 7.0f, 17.0003f, 10.134f, 17.0003f, 14.0f);
        this.f37302c.cubicTo(17.0003f, 17.866f, 20.1343f, 21.0f, 24.0003f, 21.0f);
        this.f37302c.cubicTo(27.8663f, 21.0f, 31.0003f, 17.866f, 31.0003f, 14.0f);
        this.f37302c.cubicTo(31.0003f, 10.134f, 27.8663f, 7.0f, 24.0003f, 7.0f);
        this.f37302c.close();
        this.f37302c.moveTo(13.0003f, 14.0f);
        this.f37302c.cubicTo(13.0003f, 7.92487f, 17.9252f, 3.0f, 24.0003f, 3.0f);
        this.f37302c.cubicTo(30.0755f, 3.0f, 35.0003f, 7.92487f, 35.0003f, 14.0f);
        this.f37302c.cubicTo(35.0003f, 20.0751f, 30.0755f, 25.0f, 24.0003f, 25.0f);
        this.f37302c.cubicTo(17.9252f, 25.0f, 13.0003f, 20.0751f, 13.0003f, 14.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0003f, 33.0f);
        this.f37302c.cubicTo(18.0615f, 33.0f, 13.0493f, 36.9841f, 11.4972f, 42.4262f);
        this.f37302c.cubicTo(11.3457f, 42.9573f, 10.8217f, 43.3088f, 10.2804f, 43.1989f);
        this.f37302c.lineTo(8.32038f, 42.8011f);
        this.f37302c.cubicTo(7.77914f, 42.6912f, 7.4266f, 42.1618f, 7.5683f, 41.628f);
        this.f37302c.cubicTo(9.49821f, 34.358f, 16.1215f, 29.0f, 24.0003f, 29.0f);
        this.f37302c.cubicTo(31.8792f, 29.0f, 38.5025f, 34.358f, 40.4324f, 41.628f);
        this.f37302c.cubicTo(40.5741f, 42.1618f, 40.2215f, 42.6912f, 39.6803f, 42.8011f);
        this.f37302c.lineTo(37.7203f, 43.1989f);
        this.f37302c.cubicTo(37.179f, 43.3088f, 36.6549f, 42.9573f, 36.5035f, 42.4262f);
        this.f37302c.cubicTo(34.9514f, 36.9841f, 29.9391f, 33.0f, 24.0003f, 33.0f);
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
