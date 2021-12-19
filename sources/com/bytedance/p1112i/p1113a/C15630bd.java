package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.bd */
public class C15630bd extends AbstractC15287a {

    /* renamed from: d */
    Paint f38079d;

    /* renamed from: e */
    Path f38080e;

    /* renamed from: f */
    Paint f38081f;

    /* renamed from: g */
    Path f38082g;

    /* renamed from: h */
    Paint f38083h;

    /* renamed from: i */
    Path f38084i;

    static {
        Covode.recordClassIndex(17896);
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
        this.f38079d = new Paint();
        Path path = new Path();
        this.f38080e = path;
        path.moveTo(17.0f, 23.0f);
        this.f38080e.cubicTo(18.6569f, 23.0f, 20.0f, 21.2091f, 20.0f, 19.0f);
        this.f38080e.cubicTo(20.0f, 16.7909f, 18.6569f, 15.0f, 17.0f, 15.0f);
        this.f38080e.cubicTo(15.3431f, 15.0f, 14.0f, 16.7909f, 14.0f, 19.0f);
        this.f38080e.cubicTo(14.0f, 21.2091f, 15.3431f, 23.0f, 17.0f, 23.0f);
        this.f38080e.close();
        this.f38080e.setFillType(Path.FillType.EVEN_ODD);
        this.f38079d.setStyle(Paint.Style.FILL);
        this.f38079d.setColor(-16777216);
        this.f37300a.add(this.f38079d);
        this.f38081f = new Paint();
        Path path2 = new Path();
        this.f38082g = path2;
        path2.moveTo(31.0f, 23.0f);
        this.f38082g.cubicTo(32.6569f, 23.0f, 34.0f, 21.2091f, 34.0f, 19.0f);
        this.f38082g.cubicTo(34.0f, 16.7909f, 32.6569f, 15.0f, 31.0f, 15.0f);
        this.f38082g.cubicTo(29.3431f, 15.0f, 28.0f, 16.7909f, 28.0f, 19.0f);
        this.f38082g.cubicTo(28.0f, 21.2091f, 29.3431f, 23.0f, 31.0f, 23.0f);
        this.f38082g.close();
        this.f38082g.setFillType(Path.FillType.EVEN_ODD);
        this.f38081f.setStyle(Paint.Style.FILL);
        this.f38081f.setColor(-16777216);
        this.f37300a.add(this.f38081f);
        this.f38083h = new Paint();
        Path path3 = new Path();
        this.f38084i = path3;
        path3.moveTo(16.0f, 28.3431f);
        this.f38084i.cubicTo(16.0f, 31.4673f, 19.5817f, 36.0f, 24.0f, 36.0f);
        this.f38084i.cubicTo(28.4183f, 36.0f, 32.0f, 31.4673f, 32.0f, 28.3431f);
        this.f38084i.cubicTo(32.0f, 25.219f, 16.0f, 25.219f, 16.0f, 28.3431f);
        this.f38084i.close();
        this.f38084i.setFillType(Path.FillType.EVEN_ODD);
        this.f38083h.setStyle(Paint.Style.FILL);
        this.f38083h.setColor(-16777216);
        this.f37300a.add(this.f38083h);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38080e, this.f38079d);
        canvas.drawPath(this.f38082g, this.f38081f);
        canvas.drawPath(this.f38084i, this.f38083h);
    }
}
