package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.bx */
public class C15650bx extends AbstractC15287a {

    /* renamed from: d */
    Paint f38115d;

    /* renamed from: e */
    Path f38116e;

    static {
        Covode.recordClassIndex(17916);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 42.5682f);
        this.f37302c.cubicTo(34.2549f, 42.5682f, 42.5682f, 34.2549f, 42.5682f, 24.0f);
        this.f37302c.cubicTo(42.5682f, 13.7451f, 34.2549f, 5.43182f, 24.0f, 5.43182f);
        this.f37302c.cubicTo(13.7451f, 5.43182f, 5.43182f, 13.7451f, 5.43182f, 24.0f);
        this.f37302c.cubicTo(5.43182f, 34.2549f, 13.7451f, 42.5682f, 24.0f, 42.5682f);
        this.f37302c.close();
        this.f37302c.moveTo(45.5f, 24.0f);
        this.f37302c.cubicTo(45.5f, 35.8741f, 35.8741f, 45.5f, 24.0f, 45.5f);
        this.f37302c.cubicTo(12.1259f, 45.5f, 2.5f, 35.8741f, 2.5f, 24.0f);
        this.f37302c.cubicTo(2.5f, 12.1259f, 12.1259f, 2.5f, 24.0f, 2.5f);
        this.f37302c.cubicTo(35.8741f, 2.5f, 45.5f, 12.1259f, 45.5f, 24.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38115d = new Paint();
        Path path = new Path();
        this.f38116e = path;
        path.moveTo(25.5f, 13.25f);
        this.f38116e.cubicTo(25.5f, 12.8358f, 25.1642f, 12.5f, 24.75f, 12.5f);
        this.f38116e.lineTo(23.25f, 12.5f);
        this.f38116e.cubicTo(22.8358f, 12.5f, 22.5f, 12.8358f, 22.5f, 13.25f);
        this.f38116e.lineTo(22.5f, 22.5f);
        this.f38116e.lineTo(13.25f, 22.5f);
        this.f38116e.cubicTo(12.8358f, 22.5f, 12.5f, 22.8358f, 12.5f, 23.25f);
        this.f38116e.lineTo(12.5f, 24.75f);
        this.f38116e.cubicTo(12.5f, 25.1642f, 12.8358f, 25.5f, 13.25f, 25.5f);
        this.f38116e.lineTo(22.5f, 25.5f);
        this.f38116e.lineTo(22.5f, 34.75f);
        this.f38116e.cubicTo(22.5f, 35.1642f, 22.8358f, 35.5f, 23.25f, 35.5f);
        this.f38116e.lineTo(24.75f, 35.5f);
        this.f38116e.cubicTo(25.1642f, 35.5f, 25.5f, 35.1642f, 25.5f, 34.75f);
        this.f38116e.lineTo(25.5f, 25.5f);
        this.f38116e.lineTo(34.75f, 25.5f);
        this.f38116e.cubicTo(35.1642f, 25.5f, 35.5f, 25.1642f, 35.5f, 24.75f);
        this.f38116e.lineTo(35.5f, 23.25f);
        this.f38116e.cubicTo(35.5f, 22.8358f, 35.1642f, 22.5f, 34.75f, 22.5f);
        this.f38116e.lineTo(25.5f, 22.5f);
        this.f38116e.lineTo(25.5f, 13.25f);
        this.f38116e.close();
        this.f38116e.setFillType(Path.FillType.EVEN_ODD);
        this.f38115d.setStyle(Paint.Style.FILL);
        this.f38115d.setColor(-16777216);
        this.f37300a.add(this.f38115d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38116e, this.f38115d);
    }
}
