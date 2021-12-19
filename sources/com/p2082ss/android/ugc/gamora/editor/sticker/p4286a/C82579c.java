package com.p2082ss.android.ugc.gamora.editor.sticker.p4286a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionStickerPanelState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.c */
final /* synthetic */ class C82579c extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f184679a = new C82579c();

    static {
        Covode.recordClassIndex(96424);
    }

    C82579c() {
        super(CommentAndQuestionStickerPanelState.class, "clickCommentStickerEvent", "getClickCommentStickerEvent()Lcom/bytedance/jedi/arch/Event;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((CommentAndQuestionStickerPanelState) obj).getClickCommentStickerEvent();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((CommentAndQuestionStickerPanelState) obj).setClickCommentStickerEvent((C20391d) obj2);
    }
}
