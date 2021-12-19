package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;

/* renamed from: com.facebook.drawee.e.i */
public final class C24219i extends C24217g {

    /* renamed from: a */
    final Matrix f57376a;

    /* renamed from: b */
    private int f57377b;

    /* renamed from: c */
    private int f57378c;

    /* renamed from: d */
    private final Matrix f57379d = new Matrix();

    /* renamed from: e */
    private final RectF f57380e = new RectF();

    static {
        Covode.recordClassIndex(28350);
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final int getIntrinsicHeight() {
        int i = this.f57378c;
        if (i == 5 || i == 7 || this.f57377b % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final int getIntrinsicWidth() {
        int i = this.f57378c;
        if (i == 5 || i == 7 || this.f57377b % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final void draw(Canvas canvas) {
        int i;
        if (this.f57377b > 0 || !((i = this.f57378c) == 0 || i == 1)) {
            int save = canvas.save();
            canvas.concat(this.f57376a);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.p1854e.C24217g, com.facebook.drawee.p1854e.AbstractC24243s
    public final void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        if (!this.f57376a.isIdentity()) {
            matrix.preConcat(this.f57376a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.drawee.p1854e.C24217g
    public final void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        int i2 = this.f57377b;
        if (i2 > 0 || !((i = this.f57378c) == 0 || i == 1)) {
            int i3 = this.f57378c;
            if (i3 == 2) {
                this.f57376a.setScale(-1.0f, 1.0f);
            } else if (i3 == 7) {
                this.f57376a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f57376a.postScale(-1.0f, 1.0f);
            } else if (i3 == 4) {
                this.f57376a.setScale(1.0f, -1.0f);
            } else if (i3 != 5) {
                this.f57376a.setRotate((float) i2, (float) rect.centerX(), (float) rect.centerY());
            } else {
                this.f57376a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f57376a.postScale(1.0f, -1.0f);
            }
            this.f57379d.reset();
            this.f57376a.invert(this.f57379d);
            this.f57380e.set(rect);
            this.f57379d.mapRect(this.f57380e);
            current.setBounds((int) this.f57380e.left, (int) this.f57380e.top, (int) this.f57380e.right, (int) this.f57380e.bottom);
            return;
        }
        current.setBounds(rect);
    }

    public C24219i(Drawable drawable, int i, int i2) {
        super(drawable);
        boolean z;
        boolean z2 = true;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        C24091i.m45620a((i2 < 0 || i2 > 8) ? false : z2);
        this.f57376a = new Matrix();
        this.f57377b = i;
        this.f57378c = i2;
    }
}
