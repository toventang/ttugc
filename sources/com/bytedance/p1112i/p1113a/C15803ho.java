package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ho */
public class C15803ho extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18069);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(40.0f, 24.0f);
        this.f37302c.cubicTo(40.0f, 26.2025f, 38.7299f, 28.6054f, 35.8483f, 30.6226f);
        this.f37302c.cubicTo(32.9793f, 32.6308f, 28.8028f, 34.0f, 24.0f, 34.0f);
        this.f37302c.cubicTo(19.1972f, 34.0f, 15.0207f, 32.6308f, 12.1517f, 30.6226f);
        this.f37302c.cubicTo(9.27012f, 28.6054f, 8.0f, 26.2025f, 8.0f, 24.0f);
        this.f37302c.cubicTo(8.0f, 21.7975f, 9.27012f, 19.3946f, 12.1517f, 17.3774f);
        this.f37302c.cubicTo(15.0207f, 15.3692f, 19.1972f, 14.0f, 24.0f, 14.0f);
        this.f37302c.cubicTo(28.8028f, 14.0f, 32.9793f, 15.3692f, 35.8483f, 17.3774f);
        this.f37302c.cubicTo(38.7299f, 19.3946f, 40.0f, 21.7975f, 40.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.moveTo(44.0f, 24.0f);
        this.f37302c.cubicTo(44.0f, 31.732f, 35.0457f, 38.0f, 24.0f, 38.0f);
        this.f37302c.cubicTo(12.9543f, 38.0f, 4.0f, 31.732f, 4.0f, 24.0f);
        this.f37302c.cubicTo(4.0f, 16.268f, 12.9543f, 10.0f, 24.0f, 10.0f);
        this.f37302c.cubicTo(35.0457f, 10.0f, 44.0f, 16.268f, 44.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.moveTo(27.0f, 24.0f);
        this.f37302c.cubicTo(27.0f, 25.6569f, 25.6569f, 27.0f, 24.0f, 27.0f);
        this.f37302c.cubicTo(22.3431f, 27.0f, 21.0f, 25.6569f, 21.0f, 24.0f);
        this.f37302c.cubicTo(21.0f, 22.3431f, 22.3431f, 21.0f, 24.0f, 21.0f);
        this.f37302c.cubicTo(25.6569f, 21.0f, 27.0f, 22.3431f, 27.0f, 24.0f);
        this.f37302c.close();
        this.f37302c.moveTo(31.0f, 24.0f);
        this.f37302c.cubicTo(31.0f, 27.866f, 27.866f, 31.0f, 24.0f, 31.0f);
        this.f37302c.cubicTo(20.134f, 31.0f, 17.0f, 27.866f, 17.0f, 24.0f);
        this.f37302c.cubicTo(17.0f, 20.134f, 20.134f, 17.0f, 24.0f, 17.0f);
        this.f37302c.cubicTo(27.866f, 17.0f, 31.0f, 20.134f, 31.0f, 24.0f);
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
