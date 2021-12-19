package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.np */
public class C15966np extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18232);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.4472f, 37.2762f);
        this.f37302c.cubicTo(24.1656f, 37.1355f, 23.8343f, 37.1355f, 23.5528f, 37.2762f);
        this.f37302c.lineTo(13.5194f, 42.2929f);
        this.f37302c.cubicTo(12.0764f, 43.0144f, 10.4169f, 41.8183f, 10.6451f, 40.2212f);
        this.f37302c.lineTo(12.3503f, 28.2845f);
        this.f37302c.cubicTo(12.3948f, 27.9729f, 12.29f, 27.6585f, 12.0675f, 27.4359f);
        this.f37302c.lineTo(4.79078f, 20.1592f);
        this.f37302c.cubicTo(3.6324f, 19.0009f, 4.28173f, 17.0174f, 5.90088f, 16.7683f);
        this.f37302c.lineTo(16.5218f, 15.1343f);
        this.f37302c.cubicTo(16.8533f, 15.0833f, 17.1371f, 14.8695f, 17.2777f, 14.565f);
        this.f37302c.lineTo(22.184f, 3.9345f);
        this.f37302c.cubicTo(22.8991f, 2.38532f, 25.1009f, 2.38532f, 25.8159f, 3.9345f);
        this.f37302c.lineTo(30.7223f, 14.565f);
        this.f37302c.cubicTo(30.8628f, 14.8695f, 31.1467f, 15.0833f, 31.4782f, 15.1343f);
        this.f37302c.lineTo(42.0991f, 16.7683f);
        this.f37302c.cubicTo(43.7182f, 17.0174f, 44.3675f, 19.0009f, 43.2091f, 20.1592f);
        this.f37302c.lineTo(35.9325f, 27.4359f);
        this.f37302c.cubicTo(35.7099f, 27.6585f, 35.6051f, 27.9729f, 35.6496f, 28.2845f);
        this.f37302c.lineTo(37.3549f, 40.2212f);
        this.f37302c.cubicTo(37.583f, 41.8183f, 35.9236f, 43.0144f, 34.4806f, 42.2929f);
        this.f37302c.lineTo(24.4472f, 37.2762f);
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
