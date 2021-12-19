package com.bytedance.p1084h;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.bytedance.h.a */
public abstract class AbstractC15287a extends Drawable {

    /* renamed from: a */
    protected final LinkedList<Paint> f37300a;

    /* renamed from: b */
    protected final Paint f37301b;

    /* renamed from: c */
    protected final Path f37302c = new Path();

    static {
        Covode.recordClassIndex(17517);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24794a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24795a(Canvas canvas);

    public int getOpacity() {
        return -1;
    }

    public AbstractC15287a() {
        LinkedList<Paint> linkedList = new LinkedList<>();
        this.f37300a = linkedList;
        Paint paint = new Paint();
        this.f37301b = paint;
        linkedList.add(paint);
        mo24794a();
        Iterator<Paint> it = linkedList.iterator();
        while (it.hasNext()) {
            it.next().setAntiAlias(true);
        }
    }

    public void draw(Canvas canvas) {
        canvas.save();
        mo24795a(canvas);
        canvas.restore();
    }

    /* renamed from: a */
    public final void mo24798a(Xfermode xfermode) {
        Iterator<Paint> it = this.f37300a.iterator();
        while (it.hasNext()) {
            it.next().setXfermode(xfermode);
        }
        invalidateSelf();
    }

    public void setAlpha(int i) {
        Iterator<Paint> it = this.f37300a.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Iterator<Paint> it = this.f37300a.iterator();
        while (it.hasNext()) {
            it.next().setColorFilter(colorFilter);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24796a(Canvas canvas, float f) {
        mo24797a(canvas, f, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24797a(Canvas canvas, float f, float f2) {
        canvas.translate((float) getBounds().left, (float) getBounds().top);
        canvas.scale(((float) getBounds().width()) / f, ((float) getBounds().height()) / f2);
    }
}
