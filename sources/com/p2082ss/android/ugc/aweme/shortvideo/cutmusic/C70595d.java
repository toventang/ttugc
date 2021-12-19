package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.d */
public final class C70595d {

    /* renamed from: a */
    public int f157970a;

    /* renamed from: b */
    int f157971b;

    /* renamed from: c */
    int f157972c;

    /* renamed from: d */
    public int f157973d;

    /* renamed from: e */
    int f157974e;

    /* renamed from: f */
    int f157975f;

    /* renamed from: g */
    int f157976g;

    /* renamed from: h */
    public float[] f157977h;

    /* renamed from: i */
    public boolean f157978i;

    /* renamed from: j */
    private int f157979j;

    /* renamed from: k */
    private Paint f157980k;

    /* renamed from: l */
    private Paint f157981l;

    /* renamed from: m */
    private int f157982m;

    /* renamed from: n */
    private Paint f157983n;

    static {
        Covode.recordClassIndex(83061);
    }

    public C70595d() {
        this.f157977h = new float[0];
        this.f157982m = -1;
        this.f157978i = true;
    }

    public C70595d(Context context) {
        C89219l.m154721d(context, "");
        this.f157977h = new float[0];
        this.f157982m = -1;
        this.f157978i = true;
        mo111393a(context);
    }

    /* renamed from: a */
    public final void mo111391a(int i) {
        this.f157982m = i;
        Paint paint = this.f157980k;
        if (paint == null) {
            C89219l.m154710a("mPaint");
        }
        paint.setColor(i);
        Paint paint2 = this.f157981l;
        if (paint2 == null) {
            C89219l.m154710a("mOuterPaint");
        }
        paint2.setColor(i);
    }

    /* renamed from: a */
    public final void mo111395a(float[] fArr) {
        if (C70612k.C70614b.m124761a(fArr)) {
            if (fArr == null) {
                C89219l.m154715b();
            }
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            C89219l.m154716b(copyOf, "");
            this.f157977h = copyOf;
        }
    }

    /* renamed from: a */
    public final void mo111393a(Context context) {
        C89219l.m154721d(context, "");
        Paint paint = new Paint();
        this.f157980k = paint;
        paint.setColor(this.f157982m);
        Paint paint2 = this.f157980k;
        if (paint2 == null) {
            C89219l.m154710a("mPaint");
        }
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = this.f157980k;
        if (paint3 == null) {
            C89219l.m154710a("mPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f157981l = paint4;
        paint4.setColor(this.f157982m);
        Paint paint5 = this.f157981l;
        if (paint5 == null) {
            C89219l.m154710a("mOuterPaint");
        }
        paint5.setStyle(Paint.Style.FILL);
        Paint paint6 = this.f157981l;
        if (paint6 == null) {
            C89219l.m154710a("mOuterPaint");
        }
        paint6.setAntiAlias(true);
        Paint paint7 = this.f157981l;
        if (paint7 == null) {
            C89219l.m154710a("mOuterPaint");
        }
        paint7.setAlpha(127);
        Paint paint8 = new Paint();
        this.f157983n = paint8;
        paint8.setColor(C0643b.m2378c(context, R.color.v));
        Paint paint9 = this.f157983n;
        if (paint9 == null) {
            C89219l.m154710a("centerLinePaint");
        }
        paint9.setStrokeWidth((float) ((int) C13628n.m24520b(context, 1.0f)));
        Paint paint10 = this.f157983n;
        if (paint10 == null) {
            C89219l.m154710a("centerLinePaint");
        }
        paint10.setStyle(Paint.Style.FILL);
        Paint paint11 = this.f157983n;
        if (paint11 == null) {
            C89219l.m154710a("centerLinePaint");
        }
        paint11.setAntiAlias(true);
        this.f157976g = (int) C13628n.m24520b(context, 3.0f);
        this.f157970a = (int) C13628n.m24520b(context, 3.0f);
        this.f157971b = (int) C13628n.m24520b(context, 2.0f);
    }

    /* renamed from: a */
    public final void mo111394a(Canvas canvas) {
        Paint paint;
        int i;
        C89219l.m154721d(canvas, "");
        if (this.f157978i) {
            int i2 = this.f157972c;
            int i3 = this.f157973d;
            float f = (float) ((i2 / 2) + i3);
            float f2 = (float) this.f157979j;
            float f3 = (float) ((i2 / 2) + i3);
            Paint paint2 = this.f157983n;
            if (paint2 == null) {
                C89219l.m154710a("centerLinePaint");
            }
            canvas.drawLine(0.0f, f, f2, f3, paint2);
        }
        int length = this.f157977h.length;
        for (int i4 = 0; i4 < length; i4++) {
            float f4 = this.f157977h[i4];
            int i5 = this.f157972c;
            int i6 = (int) (f4 * ((float) i5));
            int i7 = this.f157971b;
            int i8 = this.f157970a;
            int i9 = (i7 + i8) * i4;
            int i10 = this.f157975f;
            if (i10 > 0 && i10 > this.f157974e) {
                i8 = 0;
            }
            int i11 = i9 + i8;
            int i12 = ((i5 - i6) / 2) + this.f157973d;
            int i13 = i7 + i11;
            RectF rectF = new RectF((float) i11, (float) i12, (float) i13, (float) (i6 + i12));
            int i14 = this.f157976g;
            float f5 = (float) i14;
            float f6 = (float) i14;
            int i15 = this.f157975f;
            if (i15 <= 0 || i15 <= (i = this.f157974e) || (i13 > i && i11 < i15)) {
                paint = this.f157980k;
                if (paint == null) {
                    C89219l.m154710a("mPaint");
                }
            } else {
                paint = this.f157981l;
                if (paint == null) {
                    C89219l.m154710a("mOuterPaint");
                }
            }
            canvas.drawRoundRect(rectF, f5, f6, paint);
        }
    }

    /* renamed from: a */
    public final void mo111392a(int i, int i2) {
        this.f157979j = i;
        this.f157972c = i2;
        this.f157972c = i2 - (this.f157973d * 2);
    }
}
