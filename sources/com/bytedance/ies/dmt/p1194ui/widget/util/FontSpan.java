package com.bytedance.ies.dmt.p1194ui.widget.util;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.FontSpan */
public class FontSpan extends TypefaceSpan {

    /* renamed from: a */
    private final Typeface f41550a;

    static {
        Covode.recordClassIndex(19783);
    }

    public void updateDrawState(TextPaint textPaint) {
        m32028a(textPaint, this.f41550a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m32028a(textPaint, this.f41550a);
    }

    public FontSpan(String str) {
        super(str);
        this.f41550a = C17301b.m32033a().mo27611a(str);
    }

    /* renamed from: a */
    private void m32027a(Paint paint) {
        int style;
        String family = getFamily();
        Typeface typeface = paint.getTypeface();
        if (typeface == null) {
            style = 0;
        } else {
            style = typeface.getStyle();
        }
        Typeface create = Typeface.create(family, style);
        int style2 = style & (create.getStyle() ^ -1);
        if ((style2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(create);
    }

    /* renamed from: a */
    private void m32028a(Paint paint, Typeface typeface) {
        int style;
        if (typeface == null) {
            m32027a(paint);
            return;
        }
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            style = 0;
        } else {
            style = typeface2.getStyle();
        }
        int style2 = style & (typeface.getStyle() ^ -1);
        if ((style2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if (C17303d.f41568b.equals(getFamily())) {
            paint.setFakeBoldText(true);
        }
        if ((style2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
