package com.p2082ss.android.ugc.aweme.base.utils;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.utils.r */
public final class C34734r {

    /* renamed from: a */
    public static final C34734r f82024a = new C34734r();

    private C34734r() {
    }

    static {
        Covode.recordClassIndex(41726);
    }

    /* renamed from: a */
    public static SpannableStringBuilder m70964a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        C89219l.m154721d(spannableStringBuilder, "");
        C89219l.m154721d(textPaint, "");
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        float measureText = ((float) i) - (textPaint.measureText("... ") + ((float) i4));
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        while (lineStart < spannableStringBuilder.length() - i3 && '\n' != spannableStringBuilder.charAt(lineStart)) {
            int i5 = lineStart + 1;
            measureText -= textPaint.measureText(spannableStringBuilder, lineStart, i5);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i5;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
        C89219l.m154716b(subSequence, "");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
        spannableStringBuilder2.append((CharSequence) "... ");
        spannableStringBuilder2.append(subSequence);
        return spannableStringBuilder2;
    }
}
