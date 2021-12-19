package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.shadow.text.C28566n;
import com.lynx.tasm.utils.C28915b;

/* renamed from: com.lynx.tasm.behavior.shadow.text.l */
public final class C28562l {
    static {
        Covode.recordClassIndex(34578);
    }

    /* renamed from: a */
    public static TextPaint m57134a(AbstractC28520j jVar, C28561k kVar) {
        return m57135a(kVar, m57136b(jVar, kVar));
    }

    /* renamed from: b */
    public static Typeface m57136b(AbstractC28520j jVar, C28561k kVar) {
        String str = kVar.f67207q;
        if (!TextUtils.isEmpty(str)) {
            return C28573r.m57141a(jVar, str, kVar.mo49178a());
        }
        return null;
    }

    /* renamed from: a */
    public static TextPaint m57135a(C28561k kVar, Typeface typeface) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(kVar.f67204n);
        String str = kVar.f67207q;
        if (!TextUtils.isEmpty(str)) {
            if (typeface != null) {
                textPaint.setTypeface(typeface);
            } else {
                throw new C28566n.C28567a(str);
            }
        } else if (C28915b.m57915a()) {
            textPaint.setTypeface(C28915b.m57916b());
        }
        if (kVar.f67197g == 1) {
            textPaint.setFakeBoldText(true);
        }
        if (kVar.f67202l != 1.0E21f && Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(kVar.f67202l / textPaint.getTextSize());
        }
        if ((kVar.f67209s & 1) != 0) {
            textPaint.setUnderlineText(true);
        }
        if ((kVar.f67209s & 2) != 0) {
            textPaint.setStrikeThruText(true);
        }
        if (kVar.f67208r != null) {
            textPaint.setShadowLayer(kVar.f67208r.f67345d, kVar.f67208r.f67343b, kVar.f67208r.f67344c, kVar.f67208r.f67342a);
        }
        return textPaint;
    }
}
