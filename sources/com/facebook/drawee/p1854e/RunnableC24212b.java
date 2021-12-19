package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;

/* renamed from: com.facebook.drawee.e.b */
public final class RunnableC24212b extends C24217g implements Runnable {

    /* renamed from: a */
    public boolean f57354a;

    /* renamed from: b */
    float f57355b;

    /* renamed from: c */
    private int f57356c;

    /* renamed from: d */
    private boolean f57357d;

    static {
        Covode.recordClassIndex(28343);
    }

    public final void run() {
        this.f57357d = false;
        this.f57355b += (float) ((int) ((20.0f / ((float) this.f57356c)) * 360.0f));
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f57355b;
        if (!this.f57354a) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (float) (bounds.left + (i / 2)), (float) (bounds.top + (i2 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.f57357d) {
            this.f57357d = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public RunnableC24212b(Drawable drawable, int i) {
        this(drawable, i, (byte) 0);
    }

    private RunnableC24212b(Drawable drawable, int i, byte b) {
        super((Drawable) C24091i.m45617a(drawable));
        this.f57355b = 0.0f;
        this.f57357d = false;
        this.f57356c = i;
        this.f57354a = true;
    }
}
