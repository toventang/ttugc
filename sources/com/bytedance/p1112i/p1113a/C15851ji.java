package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ji */
public class C15851ji extends AbstractC15287a {

    /* renamed from: d */
    Paint f38447d;

    /* renamed from: e */
    Path f38448e;

    /* renamed from: f */
    Paint f38449f;

    /* renamed from: g */
    Path f38450g;

    /* renamed from: h */
    Paint f38451h;

    /* renamed from: i */
    Path f38452i;

    static {
        Covode.recordClassIndex(18117);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f38447d = new Paint();
        Path path = new Path();
        this.f38448e = path;
        path.addRect(0.0f, 0.0f, 72.0f, 72.0f, Path.Direction.CW);
        this.f37302c.moveTo(36.6664f, 18.8333f);
        this.f37302c.cubicTo(33.5039f, 18.8333f, 31.2172f, 21.1943f, 30.0897f, 24.5767f);
        this.f37302c.lineTo(27.2437f, 23.628f);
        this.f37302c.cubicTo(28.5777f, 19.626f, 31.6724f, 15.8333f, 36.6664f, 15.8333f);
        this.f37302c.cubicTo(41.5731f, 15.8333f, 45.5508f, 19.811f, 45.5508f, 24.7177f);
        this.f37302c.cubicTo(45.5508f, 27.3775f, 43.9024f, 29.7605f, 41.9221f, 31.4018f);
        this.f37302c.cubicTo(39.9272f, 33.0554f, 37.2923f, 34.2175f, 34.8203f, 34.2175f);
        this.f37302c.lineTo(34.8203f, 31.2175f);
        this.f37302c.cubicTo(36.4266f, 31.2175f, 38.407f, 30.4188f, 40.0077f, 29.0921f);
        this.f37302c.cubicTo(41.6231f, 27.7531f, 42.5508f, 26.1362f, 42.5508f, 24.7177f);
        this.f37302c.cubicTo(42.5508f, 21.4679f, 39.9163f, 18.8333f, 36.6664f, 18.8333f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38449f = new Paint();
        Path path2 = new Path();
        this.f38450g = path2;
        path2.moveTo(38.4444f, 41.7778f);
        this.f38450g.cubicTo(38.4444f, 43.1278f, 37.35f, 44.2222f, 36.0f, 44.2222f);
        this.f38450g.cubicTo(34.65f, 44.2222f, 33.5555f, 43.1278f, 33.5555f, 41.7778f);
        this.f38450g.cubicTo(33.5555f, 40.4277f, 34.65f, 39.3333f, 36.0f, 39.3333f);
        this.f38450g.cubicTo(37.35f, 39.3333f, 38.4444f, 40.4277f, 38.4444f, 41.7778f);
        this.f38450g.close();
        this.f38450g.setFillType(Path.FillType.WINDING);
        this.f38449f.setStyle(Paint.Style.FILL);
        this.f38449f.setColor(-16777216);
        this.f37300a.add(this.f38449f);
        this.f38451h = new Paint();
        Path path3 = new Path();
        this.f38452i = path3;
        path3.moveTo(1.5f, 8.625f);
        this.f38452i.cubicTo(1.5f, 5.5184f, 4.0184f, 3.0f, 7.125f, 3.0f);
        this.f38452i.lineTo(64.875f, 3.0f);
        this.f38452i.cubicTo(67.9817f, 3.0f, 70.5f, 5.51841f, 70.5f, 8.625f);
        this.f38452i.lineTo(70.5f, 51.9375f);
        this.f38452i.cubicTo(70.5f, 55.0441f, 67.9817f, 57.5625f, 64.875f, 57.5625f);
        this.f38452i.lineTo(18.0588f, 57.5625f);
        this.f38452i.lineTo(4.06066f, 71.5607f);
        this.f38452i.cubicTo(3.63166f, 71.9897f, 2.98649f, 72.118f, 2.42597f, 71.8858f);
        this.f38452i.cubicTo(1.86546f, 71.6536f, 1.5f, 71.1067f, 1.5f, 70.5f);
        this.f38452i.lineTo(1.5f, 8.625f);
        this.f38452i.close();
        this.f38452i.moveTo(4.5f, 66.8787f);
        this.f38452i.lineTo(16.3768f, 55.0018f);
        this.f38452i.cubicTo(16.6582f, 54.7205f, 17.0397f, 54.5625f, 17.4375f, 54.5625f);
        this.f38452i.lineTo(64.875f, 54.5625f);
        this.f38452i.cubicTo(66.3248f, 54.5625f, 67.5f, 53.3873f, 67.5f, 51.9375f);
        this.f38452i.lineTo(67.5f, 8.625f);
        this.f38452i.cubicTo(67.5f, 7.17524f, 66.3248f, 6.0f, 64.875f, 6.0f);
        this.f38452i.lineTo(7.125f, 6.0f);
        this.f38452i.cubicTo(5.67525f, 6.0f, 4.5f, 7.17525f, 4.5f, 8.625f);
        this.f38452i.lineTo(4.5f, 66.8787f);
        this.f38452i.close();
        this.f38452i.setFillType(Path.FillType.EVEN_ODD);
        this.f38451h.setStyle(Paint.Style.FILL);
        this.f38451h.setColor(-16777216);
        this.f37300a.add(this.f38451h);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 72.0f);
        canvas.clipPath(this.f38448e);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38450g, this.f38449f);
        canvas.drawPath(this.f38452i, this.f38451h);
    }
}
