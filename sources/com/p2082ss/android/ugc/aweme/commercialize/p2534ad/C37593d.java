package com.p2082ss.android.ugc.aweme.commercialize.p2534ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.d */
public final class C37593d extends ReplacementSpan {

    /* renamed from: a */
    public float f88861a;

    /* renamed from: b */
    public float f88862b;

    /* renamed from: c */
    public float f88863c;

    /* renamed from: d */
    public int f88864d;

    /* renamed from: e */
    public final boolean f88865e;

    /* renamed from: f */
    private final TextExtraStruct f88866f;

    /* renamed from: g */
    private final int f88867g;

    /* renamed from: h */
    private final int f88868h;

    /* renamed from: i */
    private float f88869i;

    /* renamed from: j */
    private final Context f88870j;

    /* renamed from: k */
    private String f88871k;

    /* renamed from: l */
    private float f88872l;

    /* renamed from: m */
    private int f88873m;

    /* renamed from: n */
    private Bitmap f88874n;

    /* renamed from: o */
    private Rect f88875o;

    static {
        Covode.recordClassIndex(45010);
    }

    /* renamed from: a */
    private final String m75852a(String str, Paint paint, float f, float f2) {
        int measureText = (int) (paint.measureText(str) + f2);
        if (f == 0.0f || ((float) measureText) <= f) {
            return str;
        }
        if (f > C13628n.m24520b(this.f88870j, 5.0f)) {
            f -= C13628n.m24520b(this.f88870j, 5.0f);
        }
        while (true) {
            int length = str.length();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            str = C89361p.m154892a(str, str.length() - 1, length).toString();
            if (((float) ((int) (paint.measureText(str + "…") + f2))) <= f && !Character.isHighSurrogate(str.charAt(str.length() - 1))) {
                return str + "…";
            }
        }
    }

    public /* synthetic */ C37593d(Context context, float f, int i, int i2, TextExtraStruct textExtraStruct) {
        this(context, f, i, i2, textExtraStruct, false);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C89219l.m154721d(paint, "");
        if (i + 1 >= i2) {
            return 0;
        }
        float f = this.f88861a;
        if (f != -1.0f) {
            paint.setTextSize(f);
        }
        String valueOf = String.valueOf(charSequence);
        Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String substring = valueOf.substring(i, i2);
        C89219l.m154716b(substring, "");
        String a = m75852a(substring, paint, this.f88869i, this.f88862b);
        this.f88871k = a;
        int measureText = (int) (paint.measureText(a) + this.f88862b);
        this.f88864d = measureText;
        return measureText;
    }

    public C37593d(Context context, float f, int i, int i2, TextExtraStruct textExtraStruct, boolean z) {
        int i3;
        C89219l.m154721d(context, "");
        C89219l.m154721d(textExtraStruct, "");
        MethodCollector.m26663i(14124);
        this.f88865e = z;
        this.f88866f = textExtraStruct;
        this.f88867g = i;
        this.f88868h = i2;
        this.f88869i = f;
        this.f88870j = context;
        this.f88861a = -1.0f;
        this.f88871k = "";
        this.f88873m = -1;
        this.f88875o = new Rect();
        int subtype = textExtraStruct.getSubtype();
        if (subtype != 2) {
            if (subtype != 3) {
                if (subtype == 4) {
                    i3 = 2131232261;
                } else if (!(subtype == 5 || subtype == 7)) {
                    i3 = -1;
                }
            }
            if (z) {
                i3 = 2131232399;
            } else {
                i3 = 2131232398;
            }
        } else if (z) {
            i3 = 2131232217;
        } else {
            i3 = 2131232216;
        }
        this.f88873m = i3;
        if (i3 != -1) {
            this.f88874n = BitmapFactory.decodeResource(context.getResources(), this.f88873m);
        }
        MethodCollector.m26664o(14124);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(paint, "");
        if (i + 1 < i2) {
            if (((float) this.f88864d) + f > this.f88869i) {
                this.f88866f.setClickable(false);
                canvas.drawText("…", f, (float) i4, paint);
            } else if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i || charSequence.charAt(i) != 8230) {
                this.f88866f.setClickable(true);
                Typeface a = C17301b.m32033a().mo27611a(C17303d.f41573g);
                if (a != null) {
                    try {
                        paint.setTypeface(a);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                float f2 = this.f88861a;
                if (f2 != -1.0f) {
                    paint.setTextSize(f2);
                }
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                paint.setColor(this.f88867g);
                float f3 = (float) i4;
                float f4 = fontMetrics.top + f3;
                float f5 = fontMetrics.bottom + f3;
                RectF rectF = new RectF(f, f4, ((float) this.f88864d) + f, f5);
                float f6 = this.f88863c;
                canvas.drawRoundRect(rectF, f6, f6, paint);
                if (this.f88871k.charAt(0) == '@') {
                    this.f88872l = paint.measureText(String.valueOf(this.f88871k.charAt(0)));
                    String str = this.f88871k;
                    int length = str.length();
                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                    String substring = str.substring(1, length);
                    C89219l.m154716b(substring, "");
                    this.f88871k = substring;
                }
                paint.setColor(this.f88868h);
                canvas.drawText(this.f88871k, (this.f88862b / 2.0f) + f + this.f88872l, f3 - C13628n.m24520b(this.f88870j, 1.0f), paint);
                if (this.f88873m != -1) {
                    int i6 = (int) f4;
                    int i7 = (int) f5;
                    Bitmap bitmap = this.f88874n;
                    if (bitmap != null) {
                        int i8 = i7 - i6;
                        int i9 = i8 / 4;
                        int i10 = i8 / 5;
                        int i11 = i6 + i10;
                        int i12 = i7 - i10;
                        int i13 = (int) (f + ((float) i9));
                        this.f88875o.set(i13, i11, (i13 + i12) - i11, i12);
                        canvas.drawBitmap(bitmap, (Rect) null, this.f88875o, paint);
                    }
                } else if (!TextUtils.isEmpty(this.f88866f.getAwemeId())) {
                    int i14 = (int) f4;
                    int i15 = (int) f5;
                    if (C89219l.m154714a((Object) Boolean.valueOf(this.f88865e), (Object) true)) {
                        paint.setColor(-16777216);
                    } else {
                        paint.setColor(-1);
                    }
                    paint.setPathEffect(new CornerPathEffect(C13628n.m24520b(this.f88870j, 2.0f)));
                    Path path = new Path();
                    float b = C13628n.m24520b(this.f88870j, 10.0f);
                    float f7 = ((float) (i15 + i14)) / 2.0f;
                    float sqrt = (float) Math.sqrt((Math.pow((double) b, 2.0d) * 3.0d) / 4.0d);
                    float f8 = b / 2.0f;
                    path.moveTo((this.f88862b / 2.0f) + f, f7 + f8);
                    path.lineTo((this.f88862b / 2.0f) + f + sqrt, f7);
                    path.lineTo(f + (this.f88862b / 2.0f), f7 - f8);
                    path.close();
                    canvas.drawPath(path, paint);
                }
            } else {
                this.f88866f.setClickable(false);
                canvas.drawText("…", f, (float) i4, paint);
            }
        }
    }
}
