package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.C28601c;

/* renamed from: com.lynx.tasm.behavior.shadow.text.i */
public class C28559i extends CharacterStyle {

    /* renamed from: a */
    private final C28601c f67190a;

    static {
        Covode.recordClassIndex(34575);
    }

    public C28559i(C28601c cVar) {
        this.f67190a = cVar;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f67190a.f67345d, this.f67190a.f67343b, this.f67190a.f67344c, this.f67190a.f67342a);
    }
}
