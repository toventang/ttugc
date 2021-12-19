package com.p2082ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.c */
public final class C50509c extends ReplacementSpan {

    /* renamed from: a */
    public float f116731a;

    /* renamed from: b */
    private final Context f116732b;

    /* renamed from: c */
    private final String f116733c;

    /* renamed from: d */
    private final String f116734d;

    /* renamed from: e */
    private final int f116735e;

    /* renamed from: f */
    private final String f116736f;

    /* renamed from: g */
    private final String f116737g;

    /* renamed from: h */
    private final int f116738h;

    /* renamed from: i */
    private final float f116739i;

    /* renamed from: j */
    private float f116740j;

    /* renamed from: k */
    private float f116741k;

    /* renamed from: l */
    private final float f116742l;

    /* renamed from: m */
    private float f116743m;

    /* renamed from: n */
    private Paint f116744n;

    /* renamed from: o */
    private Paint f116745o;

    /* renamed from: p */
    private WeakReference<Drawable> f116746p;

    static {
        Covode.recordClassIndex(59656);
    }

    /* renamed from: b */
    private final Drawable m94693b() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f116746p;
        if (weakReference != null && (drawable = weakReference.get()) != null) {
            return drawable;
        }
        Drawable c = m94694c();
        this.f116746p = new WeakReference<>(c);
        return c;
    }

    /* renamed from: c */
    private Drawable m94694c() {
        Drawable drawable = this.f116732b.getResources().getDrawable(this.f116735e);
        C89219l.m154716b(drawable, "");
        return drawable;
    }

    /* renamed from: a */
    private final void m94690a() {
        if (!TextUtils.isEmpty(this.f116733c) && this.f116745o == null) {
            this.f116745o = new TextPaint();
            try {
                if (TextUtils.isEmpty(this.f116734d)) {
                    Paint paint = this.f116745o;
                    if (paint == null) {
                        C89219l.m154715b();
                    }
                    paint.setColor(this.f116738h);
                } else {
                    Paint paint2 = this.f116745o;
                    if (paint2 == null) {
                        C89219l.m154715b();
                    }
                    paint2.setColor(Color.parseColor(this.f116734d));
                }
            } catch (Exception unused) {
                Paint paint3 = this.f116745o;
                if (paint3 == null) {
                    C89219l.m154715b();
                }
                paint3.setColor(this.f116738h);
            }
            Paint paint4 = this.f116745o;
            if (paint4 == null) {
                C89219l.m154715b();
            }
            paint4.setTextSize(this.f116743m);
            Paint paint5 = this.f116745o;
            if (paint5 == null) {
                C89219l.m154715b();
            }
            paint5.setAntiAlias(true);
        }
    }

    /* renamed from: a */
    private final float m94689a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        m94690a();
        Rect rect = new Rect();
        Paint paint = this.f116745o;
        if (paint == null) {
            C89219l.m154715b();
        }
        if (str == null) {
            C89219l.m154715b();
        }
        paint.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (this.f116742l * 4.0f * 3.0f) + ((float) m94693b().getIntrinsicWidth());
    }

    /* renamed from: a */
    private final void m94691a(Canvas canvas, float f, float f2) {
        String str;
        if (this.f116745o != null && (str = this.f116733c) != null) {
            float intrinsicWidth = f + (this.f116742l * 6.0f) + ((float) m94693b().getIntrinsicWidth());
            float f3 = f2 - (this.f116742l * 1.0f);
            Paint paint = this.f116745o;
            if (paint != null) {
                canvas.drawText(str, intrinsicWidth, f3, paint);
            }
        }
    }

    /* renamed from: a */
    private final void m94692a(Canvas canvas, float f, int i) {
        Paint paint = this.f116745o;
        if (paint != null && this.f116744n != null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f2 = (float) i;
            float f3 = fontMetrics.ascent + f2;
            float f4 = f2 + fontMetrics.descent;
            float min = Math.min(Math.min(f3, ((float) canvas.getHeight()) - f4), (this.f116740j - (f4 - f3)) * 0.5f);
            float f5 = this.f116742l;
            RectF rectF = new RectF(f, (f3 - min) - (f5 * 1.0f), this.f116739i + f, (f4 + min) - (f5 * 1.0f));
            float f6 = this.f116741k;
            Paint paint2 = this.f116744n;
            if (paint2 != null) {
                canvas.drawRoundRect(rectF, f6, f6, paint2);
            }
        }
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C89219l.m154721d(paint, "");
        return (int) this.f116739i;
    }

    public C50509c(Context context, String str, String str2, int i, String str3, String str4, int i2, int i3) {
        C89219l.m154721d(context, "");
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154716b(applicationContext, "");
        this.f116732b = applicationContext;
        this.f116738h = Color.parseColor("#FACE15");
        Resources resources = applicationContext.getResources();
        C89219l.m154716b(resources, "");
        float applyDimension = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.f116742l = applyDimension;
        this.f116743m = ((float) i2) * applyDimension;
        this.f116740j = ((float) i3) * applyDimension;
        this.f116741k = applyDimension * 2.0f;
        this.f116733c = str;
        this.f116734d = str2;
        this.f116735e = i;
        this.f116736f = str3;
        this.f116737g = str4;
        this.f116739i = m94689a(str);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(paint, "");
        if (!TextUtils.isEmpty(this.f116737g) && this.f116744n == null) {
            Paint paint2 = new Paint();
            this.f116744n = paint2;
            try {
                paint2.setColor(Color.parseColor(this.f116737g));
            } catch (Exception unused) {
                Paint paint3 = this.f116744n;
                if (paint3 == null) {
                    C89219l.m154715b();
                }
                paint3.setColor(-1);
            }
            Paint paint4 = this.f116744n;
            if (paint4 == null) {
                C89219l.m154715b();
            }
            paint4.setStyle(Paint.Style.FILL);
            Paint paint5 = this.f116744n;
            if (paint5 == null) {
                C89219l.m154715b();
            }
            paint5.setAntiAlias(true);
        }
        m94690a();
        m94692a(canvas, f, i4);
        m94691a(canvas, f, (float) i4);
        Drawable b = m94693b();
        if (!(b instanceof BitmapDrawable)) {
            b = null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) b;
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint6 = new Paint();
            try {
                if (TextUtils.isEmpty(this.f116736f)) {
                    i6 = this.f116738h;
                } else {
                    i6 = Color.parseColor(this.f116736f);
                }
            } catch (Exception unused2) {
                i6 = this.f116738h;
            }
            paint6.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_ATOP));
            paint6.setAntiAlias(true);
            canvas.drawBitmap(bitmap, f + C13628n.m24520b(this.f116732b, 4.0f), ((float) (i4 - bitmapDrawable.getMinimumHeight())) + C13628n.m24520b(this.f116732b, 1.0f) + this.f116731a, paint6);
        }
    }
}
