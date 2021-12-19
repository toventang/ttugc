package com.bytedance.tux.p1719f.p1720a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.f.a.e */
public class C23135e<T extends View> extends ReplacementSpan {

    /* renamed from: a */
    public int f54754a;

    /* renamed from: b */
    public int f54755b;

    /* renamed from: c */
    public final T f54756c;

    static {
        Covode.recordClassIndex(27064);
    }

    public C23135e(T t) {
        C89219l.m154719c(t, "");
        this.f54756c = t;
        t.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i = Build.VERSION.SDK_INT;
        Context context = t.getContext();
        C89219l.m154709a((Object) context, "");
        t.setLayoutDirection(C23163i.m43663a(context) ? 1 : 0);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C89219l.m154719c(paint, "");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(10000, Integer.MIN_VALUE);
        this.f54756c.measure(makeMeasureSpec, makeMeasureSpec);
        T t = this.f54756c;
        t.layout(0, 0, t.getMeasuredWidth(), this.f54756c.getMeasuredHeight());
        return this.f54756c.getMeasuredWidth() + this.f54754a + this.f54755b;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        C89219l.m154719c(canvas, "");
        C89219l.m154719c(paint, "");
        if (C23163i.m43664a(this.f54756c)) {
            i6 = this.f54755b;
        } else {
            i6 = this.f54754a;
        }
        float f2 = f + ((float) i6);
        float measuredHeight = ((float) i3) + (((float) ((i5 - i3) - this.f54756c.getMeasuredHeight())) / 2.0f);
        canvas.translate(f2, measuredHeight);
        this.f54756c.draw(canvas);
        canvas.translate(-f2, -measuredHeight);
    }
}
