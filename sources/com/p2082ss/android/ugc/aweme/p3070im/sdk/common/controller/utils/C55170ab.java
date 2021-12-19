package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ab */
public final class C55170ab {

    /* renamed from: a */
    public static final C55170ab f126222a = new C55170ab();

    private C55170ab() {
    }

    static {
        Covode.recordClassIndex(64915);
    }

    /* renamed from: a */
    public static final SpannableStringBuilder m100878a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2) {
        C89219l.m154721d(spannableStringBuilder, "");
        C89219l.m154721d(textPaint, "");
        C89219l.m154721d(spannableStringBuilder, "");
        C89219l.m154721d(textPaint, "");
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        float measureText = ((float) i) - (textPaint.measureText("...") + 0.0f);
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        while (lineStart < spannableStringBuilder.length() - 0 && '\n' != spannableStringBuilder.charAt(lineStart)) {
            int i3 = lineStart + 1;
            measureText -= textPaint.measureText(spannableStringBuilder, lineStart, i3);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i3;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - 0, spannableStringBuilder.length());
        C89219l.m154716b(subSequence, "");
        C17191a.C17192a aVar = new C17191a.C17192a();
        CharSequence subSequence2 = spannableStringBuilder.subSequence(0, lineStart);
        C89219l.m154716b(subSequence2, "");
        return new SpannableStringBuilder(aVar.mo27177a(subSequence2).mo27180c("...").mo27177a(" ").mo27180c(subSequence).f40973a);
    }
}
