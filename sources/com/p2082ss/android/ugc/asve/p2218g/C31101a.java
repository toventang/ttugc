package com.p2082ss.android.ugc.asve.p2218g;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.model.BefTextLayout;

/* renamed from: com.ss.android.ugc.asve.g.a */
public final class C31101a {

    /* renamed from: a */
    public int f74520a;

    /* renamed from: b */
    public int f74521b;

    /* renamed from: c */
    public int f74522c;

    /* renamed from: d */
    private TextPaint f74523d;

    /* renamed from: e */
    private int f74524e;

    /* renamed from: f */
    private int f74525f;

    /* renamed from: g */
    private long f74526g;

    /* renamed from: h */
    private long f74527h;

    /* renamed from: i */
    private int f74528i;

    /* renamed from: j */
    private float f74529j;

    /* renamed from: k */
    private String f74530k;

    static {
        Covode.recordClassIndex(37740);
    }

    public C31101a(BefTextLayout befTextLayout) {
        this.f74520a = befTextLayout.getLineWidth();
        this.f74524e = befTextLayout.getLineCount();
        this.f74529j = befTextLayout.getLineHeight();
        this.f74525f = befTextLayout.getSplit();
        this.f74528i = befTextLayout.getCharSize();
        this.f74526g = befTextLayout.getBackColor();
        this.f74527h = befTextLayout.getTextColor();
        this.f74530k = befTextLayout.getFamilyName();
        TextPaint textPaint = new TextPaint();
        this.f74523d = textPaint;
        textPaint.setAntiAlias(true);
        this.f74523d.setTextSize((float) befTextLayout.getCharSize());
        this.f74523d.setTypeface(Typeface.create(this.f74530k, 0));
        TextPaint textPaint2 = this.f74523d;
        long j = this.f74527h;
        textPaint2.setColor(((((int) j) << 24) & -16777216) | ((((int) j) >> 8) & 16777215));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f74523d.setLetterSpacing((float) befTextLayout.getLetterSpacing());
        }
        this.f74523d.setTextAlign(Paint.Align.LEFT);
    }

    /* renamed from: a */
    public final Bitmap mo56520a(String str) {
        StaticLayout staticLayout;
        MethodCollector.m26663i(6255);
        if (this.f74525f != 2) {
            staticLayout = new StaticLayout(str, this.f74523d, this.f74520a, Layout.Alignment.ALIGN_NORMAL, this.f74529j, 0.0f, false);
        } else {
            staticLayout = new StaticLayout(str, 0, str.length(), this.f74523d, this.f74520a, Layout.Alignment.ALIGN_NORMAL, this.f74529j, 0.0f, false, TextUtils.TruncateAt.END, this.f74520a * this.f74524e);
        }
        int i = this.f74524e;
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.f74522c = Math.min(i, staticLayout.getLineCount());
        Bitmap createBitmap = Bitmap.createBitmap(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        long j = this.f74526g;
        canvas.drawColor(((((int) j) << 24) & -16777216) | ((((int) j) >> 8) & 16777215));
        staticLayout.draw(canvas);
        int min = Math.min(Math.round((((float) this.f74522c) * this.f74529j * ((float) this.f74528i)) + this.f74523d.getFontMetrics().descent), createBitmap.getHeight());
        this.f74521b = min;
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, this.f74520a, min);
        MethodCollector.m26664o(6255);
        return createBitmap2;
    }
}
