package com.p2082ss.android.ugc.aweme.comment.widget;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentTranslationBlock$1 */
class CommentTranslationBlock$1 extends ForegroundColorSpan {

    /* renamed from: a */
    final /* synthetic */ C37297b f87947a;

    static {
        Covode.recordClassIndex(44659);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(false);
        textPaint.setUnderlineText(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommentTranslationBlock$1(C37297b bVar, int i) {
        super(i);
        this.f87947a = bVar;
    }
}
