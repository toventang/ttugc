package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionStickerPanelState */
public final class CommentAndQuestionStickerPanelState extends UiState {
    private C20391d<CommentVideoModel> clickCommentStickerEvent;
    private final C20391d<QaStruct> clickQaStickerEvent;
    private C20526p removeRecordCommentStickerView;
    private C20521k replaceStickerModelEvent;

    /* renamed from: ui */
    private final AbstractC23517a f88111ui;

    static {
        Covode.recordClassIndex(44725);
    }

    public CommentAndQuestionStickerPanelState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionStickerPanelState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentAndQuestionStickerPanelState copy$default(CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState, C20521k kVar, C20526p pVar, C20391d dVar, C20391d dVar2, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = commentAndQuestionStickerPanelState.replaceStickerModelEvent;
        }
        if ((i & 2) != 0) {
            pVar = commentAndQuestionStickerPanelState.removeRecordCommentStickerView;
        }
        if ((i & 4) != 0) {
            dVar = commentAndQuestionStickerPanelState.clickCommentStickerEvent;
        }
        if ((i & 8) != 0) {
            dVar2 = commentAndQuestionStickerPanelState.clickQaStickerEvent;
        }
        if ((i & 16) != 0) {
            aVar = commentAndQuestionStickerPanelState.getUi();
        }
        return commentAndQuestionStickerPanelState.copy(kVar, pVar, dVar, dVar2, aVar);
    }

    public final C20521k component1() {
        return this.replaceStickerModelEvent;
    }

    public final C20526p component2() {
        return this.removeRecordCommentStickerView;
    }

    public final C20391d<CommentVideoModel> component3() {
        return this.clickCommentStickerEvent;
    }

    public final C20391d<QaStruct> component4() {
        return this.clickQaStickerEvent;
    }

    public final AbstractC23517a component5() {
        return getUi();
    }

    public final CommentAndQuestionStickerPanelState copy(C20521k kVar, C20526p pVar, C20391d<CommentVideoModel> dVar, C20391d<QaStruct> dVar2, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new CommentAndQuestionStickerPanelState(kVar, pVar, dVar, dVar2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentAndQuestionStickerPanelState)) {
            return false;
        }
        CommentAndQuestionStickerPanelState commentAndQuestionStickerPanelState = (CommentAndQuestionStickerPanelState) obj;
        return C89219l.m154714a(this.replaceStickerModelEvent, commentAndQuestionStickerPanelState.replaceStickerModelEvent) && C89219l.m154714a(this.removeRecordCommentStickerView, commentAndQuestionStickerPanelState.removeRecordCommentStickerView) && C89219l.m154714a(this.clickCommentStickerEvent, commentAndQuestionStickerPanelState.clickCommentStickerEvent) && C89219l.m154714a(this.clickQaStickerEvent, commentAndQuestionStickerPanelState.clickQaStickerEvent) && C89219l.m154714a(getUi(), commentAndQuestionStickerPanelState.getUi());
    }

    public final int hashCode() {
        C20521k kVar = this.replaceStickerModelEvent;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        C20526p pVar = this.removeRecordCommentStickerView;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20391d<CommentVideoModel> dVar = this.clickCommentStickerEvent;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C20391d<QaStruct> dVar2 = this.clickQaStickerEvent;
        int hashCode4 = (hashCode3 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CommentAndQuestionStickerPanelState(replaceStickerModelEvent=" + this.replaceStickerModelEvent + ", removeRecordCommentStickerView=" + this.removeRecordCommentStickerView + ", clickCommentStickerEvent=" + this.clickCommentStickerEvent + ", clickQaStickerEvent=" + this.clickQaStickerEvent + ", ui=" + getUi() + ")";
    }

    public final C20391d<CommentVideoModel> getClickCommentStickerEvent() {
        return this.clickCommentStickerEvent;
    }

    public final C20391d<QaStruct> getClickQaStickerEvent() {
        return this.clickQaStickerEvent;
    }

    public final C20526p getRemoveRecordCommentStickerView() {
        return this.removeRecordCommentStickerView;
    }

    public final C20521k getReplaceStickerModelEvent() {
        return this.replaceStickerModelEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f88111ui;
    }

    public final void setClickCommentStickerEvent(C20391d<CommentVideoModel> dVar) {
        this.clickCommentStickerEvent = dVar;
    }

    public final void setRemoveRecordCommentStickerView(C20526p pVar) {
        this.removeRecordCommentStickerView = pVar;
    }

    public final void setReplaceStickerModelEvent(C20521k kVar) {
        this.replaceStickerModelEvent = kVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentAndQuestionStickerPanelState(C20521k kVar, C20526p pVar, C20391d<CommentVideoModel> dVar, C20391d<QaStruct> dVar2, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.replaceStickerModelEvent = kVar;
        this.removeRecordCommentStickerView = pVar;
        this.clickCommentStickerEvent = dVar;
        this.clickQaStickerEvent = dVar2;
        this.f88111ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentAndQuestionStickerPanelState(C20521k kVar, C20526p pVar, C20391d dVar, C20391d dVar2, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : kVar, (i & 2) != 0 ? null : pVar, (i & 4) != 0 ? null : dVar, (i & 8) == 0 ? dVar2 : null, (i & 16) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
