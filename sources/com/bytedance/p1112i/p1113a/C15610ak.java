package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ak */
public class C15610ak extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17876);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 8.0f);
        this.f37302c.cubicTo(19.5914f, 8.0f, 15.6008f, 9.78171f, 12.7059f, 12.6667f);
        this.f37302c.cubicTo(9.79784f, 15.5648f, 8.0f, 19.5715f, 8.0f, 24.0f);
        this.f37302c.cubicTo(8.0f, 32.8366f, 15.1634f, 40.0f, 24.0f, 40.0f);
        this.f37302c.cubicTo(28.4285f, 40.0f, 32.4352f, 38.2022f, 35.3333f, 35.2941f);
        this.f37302c.cubicTo(38.2183f, 32.3992f, 40.0f, 28.4086f, 40.0f, 24.0f);
        this.f37302c.cubicTo(40.0f, 15.1634f, 32.8366f, 8.0f, 24.0f, 8.0f);
        this.f37302c.close();
        this.f37302c.moveTo(11.2941f, 11.2501f);
        this.f37302c.cubicTo(14.5486f, 8.00673f, 19.0409f, 6.0f, 24.0f, 6.0f);
        this.f37302c.cubicTo(33.9411f, 6.0f, 42.0f, 14.0589f, 42.0f, 24.0f);
        this.f37302c.cubicTo(42.0f, 28.9591f, 39.9933f, 33.4514f, 36.7499f, 36.7059f);
        this.f37302c.cubicTo(33.4919f, 39.9751f, 28.9815f, 42.0f, 24.0f, 42.0f);
        this.f37302c.cubicTo(14.0589f, 42.0f, 6.0f, 33.9411f, 6.0f, 24.0f);
        this.f37302c.cubicTo(6.0f, 19.0185f, 8.02491f, 14.5081f, 11.2941f, 11.2501f);
        this.f37302c.close();
        this.f37302c.moveTo(24.2f, 17.0f);
        this.f37302c.cubicTo(22.3086f, 17.0f, 20.899f, 18.3084f, 20.1208f, 20.2466f);
        this.f37302c.cubicTo(20.0179f, 20.5028f, 19.7363f, 20.6454f, 19.4743f, 20.5581f);
        this.f37302c.lineTo(18.5257f, 20.2419f);
        this.f37302c.cubicTo(18.2637f, 20.1546f, 18.1209f, 19.8709f, 18.2213f, 19.6136f);
        this.f37302c.cubicTo(19.1684f, 17.1871f, 21.1355f, 15.0f, 24.2f, 15.0f);
        this.f37302c.cubicTo(27.3393f, 15.0f, 30.0f, 17.3858f, 30.0f, 20.5f);
        this.f37302c.cubicTo(30.0f, 22.1454f, 29.0292f, 23.6453f, 27.7894f, 24.7474f);
        this.f37302c.cubicTo(26.6541f, 25.7565f, 25.1807f, 26.5389f, 23.6548f, 26.8892f);
        this.f37302c.cubicTo(23.3856f, 26.951f, 23.1276f, 26.7656f, 23.0822f, 26.4932f);
        this.f37302c.lineTo(22.9178f, 25.5068f);
        this.f37302c.cubicTo(22.8724f, 25.2344f, 23.057f, 24.9785f, 23.325f, 24.9117f);
        this.f37302c.cubicTo(24.4653f, 24.6277f, 25.5915f, 24.0252f, 26.4606f, 23.2526f);
        this.f37302c.cubicTo(27.4708f, 22.3547f, 28.0f, 21.3546f, 28.0f, 20.5f);
        this.f37302c.cubicTo(28.0f, 18.6142f, 26.3627f, 17.0f, 24.2f, 17.0f);
        this.f37302c.close();
        this.f37302c.moveTo(24.0f, 33.0f);
        this.f37302c.cubicTo(22.8954f, 33.0f, 22.0f, 32.1046f, 22.0f, 31.0f);
        this.f37302c.cubicTo(22.0f, 29.8954f, 22.8954f, 29.0f, 24.0f, 29.0f);
        this.f37302c.cubicTo(25.1046f, 29.0f, 26.0f, 29.8954f, 26.0f, 31.0f);
        this.f37302c.cubicTo(26.0f, 32.1046f, 25.1046f, 33.0f, 24.0f, 33.0f);
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
