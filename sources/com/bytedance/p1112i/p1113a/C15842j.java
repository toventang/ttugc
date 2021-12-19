package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.j */
public class C15842j extends AbstractC15287a {

    /* renamed from: d */
    Paint f38439d;

    /* renamed from: e */
    Path f38440e;

    static {
        Covode.recordClassIndex(18108);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(33.4021f, 15.9315f);
        this.f37302c.cubicTo(33.5851f, 15.549f, 33.5069f, 15.0927f, 33.2071f, 14.7929f);
        this.f37302c.cubicTo(32.9073f, 14.4931f, 32.451f, 14.4149f, 32.0685f, 14.5979f);
        this.f37302c.lineTo(20.5685f, 20.0979f);
        this.f37302c.cubicTo(20.3625f, 20.1964f, 20.1964f, 20.3625f, 20.0979f, 20.5685f);
        this.f37302c.lineTo(14.5979f, 32.0685f);
        this.f37302c.cubicTo(14.4149f, 32.451f, 14.4931f, 32.9073f, 14.7929f, 33.2071f);
        this.f37302c.cubicTo(15.0927f, 33.5069f, 15.549f, 33.5851f, 15.9315f, 33.4021f);
        this.f37302c.lineTo(27.4315f, 27.9021f);
        this.f37302c.cubicTo(27.6375f, 27.8036f, 27.8036f, 27.6375f, 27.9021f, 27.4315f);
        this.f37302c.lineTo(33.4021f, 15.9315f);
        this.f37302c.close();
        this.f37302c.moveTo(17.6246f, 30.3754f);
        this.f37302c.lineTo(21.2923f, 22.7065f);
        this.f37302c.lineTo(25.2935f, 26.7077f);
        this.f37302c.lineTo(17.6246f, 30.3754f);
        this.f37302c.close();
        this.f37302c.moveTo(22.7065f, 21.2923f);
        this.f37302c.lineTo(30.3754f, 17.6246f);
        this.f37302c.lineTo(26.7077f, 25.2935f);
        this.f37302c.lineTo(22.7065f, 21.2923f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38439d = new Paint();
        Path path = new Path();
        this.f38440e = path;
        path.moveTo(24.0f, 6.0f);
        this.f38440e.cubicTo(19.0409f, 6.0f, 14.5486f, 8.00674f, 11.2941f, 11.2501f);
        this.f38440e.cubicTo(8.02491f, 14.5081f, 6.0f, 19.0185f, 6.0f, 24.0f);
        this.f38440e.cubicTo(6.0f, 33.9411f, 14.0589f, 42.0f, 24.0f, 42.0f);
        this.f38440e.cubicTo(28.9815f, 42.0f, 33.4919f, 39.9751f, 36.7499f, 36.7059f);
        this.f38440e.cubicTo(39.9933f, 33.4514f, 42.0f, 28.9591f, 42.0f, 24.0f);
        this.f38440e.cubicTo(42.0f, 14.0589f, 33.9411f, 6.0f, 24.0f, 6.0f);
        this.f38440e.close();
        this.f38440e.moveTo(12.7059f, 12.6667f);
        this.f38440e.cubicTo(15.6008f, 9.78171f, 19.5914f, 8.0f, 24.0f, 8.0f);
        this.f38440e.cubicTo(32.8366f, 8.0f, 40.0f, 15.1634f, 40.0f, 24.0f);
        this.f38440e.cubicTo(40.0f, 28.4086f, 38.2183f, 32.3992f, 35.3333f, 35.2941f);
        this.f38440e.cubicTo(32.4352f, 38.2022f, 28.4285f, 40.0f, 24.0f, 40.0f);
        this.f38440e.cubicTo(15.1634f, 40.0f, 8.0f, 32.8366f, 8.0f, 24.0f);
        this.f38440e.cubicTo(8.0f, 19.5715f, 9.79784f, 15.5648f, 12.7059f, 12.6667f);
        this.f38440e.close();
        this.f38440e.setFillType(Path.FillType.EVEN_ODD);
        this.f38439d.setStyle(Paint.Style.FILL);
        this.f38439d.setColor(-16777216);
        this.f37300a.add(this.f38439d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38440e, this.f38439d);
    }
}
