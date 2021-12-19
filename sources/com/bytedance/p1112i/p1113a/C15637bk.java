package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.bk */
public class C15637bk extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17903);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 12.1862f);
        this.f37302c.cubicTo(19.64f, 7.41443f, 12.9471f, 7.35103f, 8.70963f, 11.5561f);
        this.f37302c.cubicTo(4.43012f, 15.8029f, 4.43012f, 22.6931f, 8.70963f, 26.9399f);
        this.f37302c.lineTo(22.9434f, 41.0648f);
        this.f37302c.cubicTo(23.5283f, 41.6451f, 24.4717f, 41.6451f, 25.0566f, 41.0648f);
        this.f37302c.lineTo(39.2904f, 26.9399f);
        this.f37302c.cubicTo(43.5699f, 22.6931f, 43.5699f, 15.8029f, 39.2904f, 11.5561f);
        this.f37302c.cubicTo(35.0529f, 7.35103f, 28.36f, 7.41443f, 24.0f, 12.1862f);
        this.f37302c.close();
        this.f37302c.moveTo(21.9851f, 14.4353f);
        this.f37302c.cubicTo(18.7397f, 10.6594f, 13.8766f, 10.6551f, 10.8228f, 13.6856f);
        this.f37302c.cubicTo(7.72574f, 16.7589f, 7.72574f, 21.737f, 10.8228f, 24.8104f);
        this.f37302c.lineTo(24.0f, 37.8868f);
        this.f37302c.lineTo(37.1772f, 24.8104f);
        this.f37302c.cubicTo(40.2743f, 21.737f, 40.2743f, 16.7589f, 37.1772f, 13.6856f);
        this.f37302c.cubicTo(34.1234f, 10.6551f, 29.2603f, 10.6594f, 26.0149f, 14.4353f);
        this.f37302c.lineTo(25.9761f, 14.4805f);
        this.f37302c.lineTo(25.0566f, 15.393f);
        this.f37302c.cubicTo(24.4717f, 15.9733f, 23.5283f, 15.9733f, 22.9434f, 15.393f);
        this.f37302c.lineTo(22.0239f, 14.4805f);
        this.f37302c.lineTo(21.9851f, 14.4353f);
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
