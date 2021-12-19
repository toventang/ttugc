package com.p2082ss.android.ugc.aweme.commercialize.p2534ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17174a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.DescTextView */
public final class DescTextView extends DmtTextView {

    /* renamed from: a */
    private String f88847a;

    /* renamed from: b */
    private boolean f88848b;

    /* renamed from: c */
    private int f88849c;

    /* renamed from: e */
    private String f88850e;

    /* renamed from: f */
    private int f88851f;

    static {
        Covode.recordClassIndex(45006);
    }

    public DescTextView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public DescTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getImageSpanXAxisAdjust() {
        return this.f88851f;
    }

    public final String getMoreString() {
        return this.f88850e;
    }

    private final int getDotWidth() {
        return (int) getPaint().measureText(this.f88847a);
    }

    private final int getSpanWidth() {
        Drawable drawable = new C17174a(getContext(), this.f88849c).getDrawable();
        C89219l.m154716b(drawable, "");
        return drawable.getIntrinsicWidth();
    }

    public final void setDescLightDrawable(int i) {
        this.f88849c = i;
    }

    public final void setImageSpanXAxisAdjust(int i) {
        this.f88851f = i;
    }

    public final void setMoreString(String str) {
        C89219l.m154721d(str, "");
        this.f88850e = str;
        invalidate();
    }

    public final void setViewLineHeight(int i) {
        int fontMetricsInt;
        if (i >= 0 && i != (fontMetricsInt = getPaint().getFontMetricsInt(null))) {
            setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: a */
    private final SpannableString m75848a(String str) {
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
        String sb2 = sb.append(C89361p.m154924d((CharSequence) str).toString()).append(' ').toString();
        if (this.f88848b) {
            sb2 = sb2 + ' ';
        }
        SpannableString spannableString = new SpannableString(sb2);
        C17174a aVar = new C17174a(getContext(), this.f88849c);
        aVar.f40918a = this.f88851f;
        spannableString.setSpan(aVar, sb2.length() - 1, sb2.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    private final String m75849a(String str, int i) {
        int i2 = i;
        TextPaint paint = getPaint();
        if (i2 < 0) {
            i2 = 0;
        }
        StaticLayout staticLayout = new StaticLayout(str, paint, i2, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        int lineStart = staticLayout.getLineStart(getMaxLines() - 1);
        int lineEnd = staticLayout.getLineEnd(getMaxLines() - 1);
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(lineStart, lineEnd);
        C89219l.m154716b(substring, "");
        return substring;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        SpannableString a;
        int size = View.MeasureSpec.getSize(i);
        String obj = getText().toString();
        TextPaint paint = getPaint();
        if (size < 0) {
            i3 = 0;
        } else {
            i3 = size;
        }
        if (new StaticLayout(obj, paint, i3, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding()).getLineCount() < getMaxLines()) {
            a = m75848a(getText().toString());
        } else {
            if (((float) size) > ((float) getSpanWidth()) + getPaint().measureText(m75849a(getText().toString(), size))) {
                a = m75848a(getText().toString());
            } else {
                StringBuilder sb = new StringBuilder();
                String obj2 = getText().toString();
                TextPaint paint2 = getPaint();
                if (size < 0) {
                    i4 = 0;
                } else {
                    i4 = size;
                }
                int lineStart = new StaticLayout(obj2, paint2, i4, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding()).getLineStart(getMaxLines() - 1);
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.String");
                String substring = obj2.substring(0, lineStart);
                C89219l.m154716b(substring, "");
                StringBuilder append = sb.append(substring);
                String obj3 = getText().toString();
                int dotWidth = (size - getDotWidth()) - (getSpanWidth() * 2);
                String a2 = m75849a(obj3, size);
                TextPaint paint3 = getPaint();
                if (dotWidth <= 0) {
                    dotWidth = 0;
                }
                StaticLayout staticLayout = new StaticLayout(a2, paint3, dotWidth, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
                int lineStart2 = staticLayout.getLineStart(0);
                int lineEnd = staticLayout.getLineEnd(0);
                StringBuilder sb2 = new StringBuilder();
                String a3 = m75849a(obj3, size);
                Objects.requireNonNull(a3, "null cannot be cast to non-null type java.lang.String");
                String substring2 = a3.substring(lineStart2, lineEnd);
                C89219l.m154716b(substring2, "");
                a = m75848a(append.append(sb2.append(substring2).append(this.f88847a).toString()).toString());
            }
        }
        setText(a);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DescTextView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f88847a = "...";
        this.f88849c = 2131232045;
        this.f88850e = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ DescTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
