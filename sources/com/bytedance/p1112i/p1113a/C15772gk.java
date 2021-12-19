package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.gk */
public class C15772gk extends AbstractC15287a {

    /* renamed from: d */
    Paint f38357d;

    /* renamed from: e */
    Path f38358e;

    /* renamed from: f */
    Paint f38359f;

    /* renamed from: g */
    Path f38360g;

    /* renamed from: h */
    Paint f38361h;

    /* renamed from: i */
    Path f38362i;

    static {
        Covode.recordClassIndex(18038);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.addCircle(24.0f, 24.0f, 22.0f, Path.Direction.CW);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-4965);
        this.f38357d = new Paint();
        Path path = new Path();
        this.f38358e = path;
        path.addCircle(24.0f, 24.0f, 17.0f, Path.Direction.CW);
        this.f38357d.setStyle(Paint.Style.FILL);
        this.f38357d.setColor(-340459);
        this.f37300a.add(this.f38357d);
        this.f38359f = new Paint();
        Path path2 = new Path();
        this.f38360g = path2;
        path2.moveTo(40.9347f, 25.5f);
        this.f38360g.cubicTo(40.9779f, 25.0058f, 41.0f, 24.5055f, 41.0f, 24.0f);
        this.f38360g.cubicTo(41.0f, 14.6112f, 33.3888f, 7.0f, 24.0f, 7.0f);
        this.f38360g.cubicTo(14.6112f, 7.0f, 7.0f, 14.6112f, 7.0f, 24.0f);
        this.f38360g.cubicTo(7.0f, 24.5055f, 7.02206f, 25.0058f, 7.06527f, 25.5f);
        this.f38360g.cubicTo(7.82466f, 16.8137f, 15.1166f, 10.0f, 24.0f, 10.0f);
        this.f38360g.cubicTo(32.8834f, 10.0f, 40.1753f, 16.8137f, 40.9347f, 25.5f);
        this.f38360g.close();
        this.f38360g.setFillType(Path.FillType.EVEN_ODD);
        this.f38359f.setStyle(Paint.Style.FILL);
        this.f38359f.setColor(-345067);
        this.f37300a.add(this.f38359f);
        this.f38361h = new Paint();
        Path path3 = new Path();
        this.f38362i = path3;
        path3.moveTo(33.0f, 19.0f);
        this.f38362i.cubicTo(30.2041f, 19.0f, 27.9375f, 16.7614f, 27.9375f, 14.0f);
        this.f38362i.lineTo(24.5625f, 14.0f);
        this.f38362i.lineTo(24.5625f, 27.6111f);
        this.f38362i.cubicTo(24.5625f, 29.2986f, 23.1774f, 30.6667f, 21.4688f, 30.6667f);
        this.f38362i.cubicTo(19.7601f, 30.6667f, 18.375f, 29.2986f, 18.375f, 27.6111f);
        this.f38362i.cubicTo(18.375f, 25.9236f, 19.7601f, 24.5556f, 21.4688f, 24.5556f);
        this.f38362i.cubicTo(21.722f, 24.5556f, 21.9659f, 24.5853f, 22.1981f, 24.6406f);
        this.f38362i.cubicTo(22.2365f, 24.6497f, 22.2747f, 24.6596f, 22.3125f, 24.6701f);
        this.f38362i.lineTo(22.3125f, 21.2763f);
        this.f38362i.cubicTo(22.0358f, 21.2406f, 21.7541f, 21.2222f, 21.4688f, 21.2222f);
        this.f38362i.cubicTo(17.8962f, 21.2222f, 15.0f, 24.0826f, 15.0f, 27.6111f);
        this.f38362i.cubicTo(15.0f, 31.1396f, 17.8962f, 34.0f, 21.4688f, 34.0f);
        this.f38362i.cubicTo(25.0413f, 34.0f, 27.9375f, 31.1396f, 27.9375f, 27.6111f);
        this.f38362i.lineTo(27.9375f, 20.6673f);
        this.f38362i.cubicTo(29.3477f, 21.7134f, 31.1005f, 22.3333f, 33.0f, 22.3333f);
        this.f38362i.lineTo(33.0f, 19.0f);
        this.f38362i.close();
        this.f38362i.setFillType(Path.FillType.WINDING);
        this.f38361h.setStyle(Paint.Style.FILL);
        this.f38361h.setColor(-68147);
        this.f37300a.add(this.f38361h);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38358e, this.f38357d);
        canvas.drawPath(this.f38360g, this.f38359f);
        canvas.drawPath(this.f38362i, this.f38361h);
    }
}
