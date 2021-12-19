package com.lynx.tasm.behavior.p2052ui.text;

import android.text.Layout;
import android.text.Spanned;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2048a.AbstractC28464a;
import com.lynx.tasm.behavior.shadow.text.C28556f;

/* renamed from: com.lynx.tasm.behavior.ui.text.b */
public final class C28677b {
    static {
        Covode.recordClassIndex(34752);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x0074 */
    /* renamed from: a */
    public static AbstractC28464a m57395a(float f, float f2, AbstractC28464a aVar, Layout layout, Spanned spanned) {
        C28556f[] fVarArr;
        if (layout != null && f <= ((float) layout.getWidth()) && f2 <= ((float) layout.getHeight())) {
            int lineForVertical = layout.getLineForVertical((int) f2);
            if (f2 <= ((float) layout.getLineBottom(lineForVertical)) && f2 >= ((float) layout.getLineTop(lineForVertical)) && f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) ((int) f));
                if (!(spanned == null || (fVarArr = (C28556f[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, C28556f.class)) == null || fVarArr.length == 0)) {
                    int length = spanned.length();
                    int length2 = fVarArr.length;
                    int i = 0;
                    C28556f fVar = aVar;
                    int i2 = 0;
                    while (i < length2) {
                        C28556f fVar2 = fVarArr[i];
                        fVar2.f67185a = aVar;
                        int spanStart = spanned.getSpanStart(fVar2);
                        int spanEnd = spanned.getSpanEnd(fVar2);
                        if (offsetForHorizontal >= spanStart && offsetForHorizontal <= spanEnd && spanStart >= i2 && spanEnd <= length) {
                            fVar2.f67185a = aVar;
                            fVar = fVar2;
                        }
                        i++;
                        i2 = spanStart;
                        length = spanEnd;
                    }
                    return fVar;
                }
            }
        }
        return aVar;
    }
}
