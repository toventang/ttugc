package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17272c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.DrawableTopLeftTextView */
public final class DrawableTopLeftTextView extends C17272c {
    static {
        Covode.recordClassIndex(59112);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        if (!TextUtils.isEmpty(getText())) {
            m93868a(getCompoundDrawables());
            int i = Build.VERSION.SDK_INT;
            m93868a(getCompoundDrawablesRelative());
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private final void m93868a(Drawable[] drawableArr) {
        Drawable drawable;
        if (drawableArr != null && (drawable = drawableArr[0]) != null) {
            TextPaint paint = getPaint();
            C89219l.m154716b(paint, "");
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            Rect rect = new Rect();
            getPaint().getTextBounds(getText().toString(), 0, length(), rect);
            int height = (((getHeight() - drawable.getIntrinsicHeight()) / 2) - (rect.top - fontMetricsInt.top)) - (getPaddingTop() / 2);
            drawable.setBounds(0, -height, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() - height);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawableTopLeftTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }
}
