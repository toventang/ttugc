package com.p2082ss.android.ugc.aweme.question.sticker;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.sticker.QuestionStickerView */
public final class QuestionStickerView extends CommentStickerView {
    static {
        Covode.recordClassIndex(78120);
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView
    public final int getMLayoutId() {
        return R.layout.ar1;
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView
    public final int getMReplyTextId() {
        return R.string.d7;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuestionStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }
}
