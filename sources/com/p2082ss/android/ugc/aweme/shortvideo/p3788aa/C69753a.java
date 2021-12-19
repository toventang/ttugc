package com.p2082ss.android.ugc.aweme.shortvideo.p3788aa;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.a */
public final class C69753a extends ReplacementSpan {

    /* renamed from: a */
    private int f155886a;

    /* renamed from: b */
    private final float f155887b = 22.0f;

    /* renamed from: c */
    private final float f155888c = 15.0f;

    /* renamed from: d */
    private final float f155889d = 17.0f;

    /* renamed from: e */
    private final float f155890e = 10.0f;

    /* renamed from: f */
    private final float f155891f = 5.0f;

    /* renamed from: g */
    private String f155892g = "";

    /* renamed from: h */
    private final Context f155893h;

    /* renamed from: i */
    private final View f155894i;

    static {
        Covode.recordClassIndex(82159);
    }

    public C69753a(Context context, View view) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        this.f155893h = context;
        this.f155894i = view;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str = "";
        C89219l.m154721d(paint, str);
        C89219l.m154721d(charSequence, str);
        int i3 = i + 1;
        if (i3 >= i2) {
            return 0;
        }
        paint.setTextSize(C13628n.m24520b(this.f155893h, this.f155888c - 2.0f));
        int measureText = (int) (paint.measureText(charSequence, i3, i2) + C13628n.m24520b(this.f155893h, this.f155887b));
        this.f155886a = measureText;
        View view = this.f155894i;
        if ((view instanceof AbstractC69754b) && measureText >= ((AbstractC69754b) view).getHookAtMaxWidth()) {
            int hookAtMaxWidth = ((AbstractC69754b) this.f155894i).getHookAtMaxWidth();
            float b = C13628n.m24520b(this.f155893h, this.f155887b + 2.0f);
            C89219l.m154721d(charSequence, str);
            C89219l.m154721d(paint, str);
            String obj = charSequence.subSequence(i3, i2).toString();
            int measureText2 = (int) (paint.measureText(obj) + b);
            if (hookAtMaxWidth != 0 && measureText2 > hookAtMaxWidth) {
                while (true) {
                    if (obj.length() != 1) {
                        int length = obj.length();
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                        obj = C89361p.m154892a(obj, obj.length() - 1, length).toString();
                        if (((int) (paint.measureText(obj + "…") + b)) <= hookAtMaxWidth && !Character.isHighSurrogate(obj.charAt(obj.length() - 1))) {
                            str = obj + "…";
                            break;
                        }
                    } else {
                        str = "…";
                        break;
                    }
                }
            }
            this.f155892g = str;
            this.f155886a = (int) (paint.measureText(str) + C13628n.m24520b(this.f155893h, this.f155887b));
        }
        return this.f155886a;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(paint, "");
        int i6 = i + 1;
        if (i6 < i2) {
            if (((float) this.f155886a) + f > ((float) this.f155894i.getWidth())) {
                canvas.drawText("…", f, (float) i4, paint);
            } else if (charSequence.length() <= i || charSequence.charAt(i) != 8230) {
                paint.setAntiAlias(true);
                int color = paint.getColor();
                PathEffect pathEffect = paint.getPathEffect();
                paint.setTextSize(C13628n.m24520b(this.f155893h, this.f155888c));
                paint.setColor(Color.parseColor("#0B161823"));
                paint.setPathEffect(new CornerPathEffect(C13628n.m24520b(this.f155893h, 2.0f)));
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                float f2 = fontMetrics.top;
                float f3 = fontMetrics.bottom;
                float f4 = (float) i4;
                float f5 = f4 + f2;
                canvas.drawRect(new RectF(f, f5, ((float) this.f155886a) + f, f4 + f3), paint);
                paint.setColor(color);
                float f6 = f3 - f2;
                float b = C13628n.m24520b(this.f155893h, this.f155890e);
                float b2 = C13628n.m24520b(this.f155893h, this.f155891f);
                Path path = new Path();
                float f7 = b2 + f;
                float f8 = f5 + ((f6 - b) / 2.0f);
                path.moveTo(f7, f8);
                path.lineTo(f7, f8 + b);
                path.lineTo(f7 + (0.86f * b), f8 + (b / 2.0f));
                path.close();
                canvas.drawPath(path, paint);
                paint.setPathEffect(pathEffect);
                paint.setFakeBoldText(true);
                paint.setTextSize(C13628n.m24520b(this.f155893h, this.f155888c - 2.0f));
                if (TextUtils.isEmpty(this.f155892g)) {
                    canvas.drawText(charSequence, i6, i2, f + C13628n.m24520b(this.f155893h, this.f155889d), f4 - C13628n.m24520b(this.f155893h, 1.0f), paint);
                } else {
                    canvas.drawText(this.f155892g, f + C13628n.m24520b(this.f155893h, this.f155889d), f4 - C13628n.m24520b(this.f155893h, 1.0f), paint);
                }
            } else {
                canvas.drawText("…", f, (float) i4, paint);
            }
        }
    }
}
