package com.p2082ss.android.ugc.aweme.account.login;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nLoginViewV2$getBottomText$1 */
public final class I18nLoginViewV2$getBottomText$1 extends ForegroundColorSpan {

    /* renamed from: a */
    final /* synthetic */ int f75940a;

    static {
        Covode.recordClassIndex(38505);
    }

    public final void updateDrawState(TextPaint textPaint) {
        C89219l.m154721d(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    I18nLoginViewV2$getBottomText$1(int i, int i2) {
        super(i2);
        this.f75940a = i;
    }
}
