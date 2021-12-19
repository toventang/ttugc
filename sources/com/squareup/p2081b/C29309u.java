package com.squareup.p2081b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.C29299t;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.u */
public final class C29309u extends BitmapDrawable {

    /* renamed from: e */
    private static final Paint f69549e = new Paint();

    /* renamed from: a */
    Drawable f69550a;

    /* renamed from: b */
    long f69551b;

    /* renamed from: c */
    boolean f69552c;

    /* renamed from: d */
    int f69553d = 255;

    /* renamed from: f */
    private final boolean f69554f;

    /* renamed from: g */
    private final float f69555g;

    /* renamed from: h */
    private final C29299t.EnumC29305d f69556h;

    static {
        Covode.recordClassIndex(35658);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f69550a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i) {
        this.f69553d = i;
        Drawable drawable = this.f69550a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f69550a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        if (!this.f69552c) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f69551b)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f69552c = false;
                this.f69550a = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f69550a;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f69553d) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f69553d);
                int i = Build.VERSION.SDK_INT;
            }
        }
        if (this.f69554f) {
            Paint paint = f69549e;
            paint.setColor(-1);
            canvas.drawPath(m58699a(new Point(0, 0), (int) (this.f69555g * 16.0f)), paint);
            paint.setColor(this.f69556h.f69546a);
            canvas.drawPath(m58699a(new Point(0, 0), (int) (this.f69555g * 15.0f)), paint);
        }
    }

    /* renamed from: a */
    private static Path m58699a(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    /* renamed from: a */
    static void m58701a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    /* renamed from: a */
    static void m58700a(ImageView imageView, Context context, Bitmap bitmap, C29299t.EnumC29305d dVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new C29309u(context, bitmap, drawable, dVar, z, z2));
    }

    private C29309u(Context context, Bitmap bitmap, Drawable drawable, C29299t.EnumC29305d dVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f69554f = z2;
        this.f69555g = context.getResources().getDisplayMetrics().density;
        this.f69556h = dVar;
        if (dVar != C29299t.EnumC29305d.MEMORY && !z) {
            this.f69550a = drawable;
            this.f69552c = true;
            this.f69551b = SystemClock.uptimeMillis();
        }
    }
}
