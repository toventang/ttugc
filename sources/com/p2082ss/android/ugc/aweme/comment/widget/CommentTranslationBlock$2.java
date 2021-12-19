package com.p2082ss.android.ugc.aweme.comment.widget;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentTranslationBlock$2 */
class CommentTranslationBlock$2 extends ForegroundColorSpan {

    /* renamed from: a */
    final /* synthetic */ C37297b f87948a;

    static {
        Covode.recordClassIndex(44660);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
        textPaint.setUnderlineText(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommentTranslationBlock$2(C37297b bVar, int i) {
        super(i);
        this.f87948a = bVar;
    }
}
