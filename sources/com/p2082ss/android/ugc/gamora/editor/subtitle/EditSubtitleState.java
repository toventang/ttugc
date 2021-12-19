package com.p2082ss.android.ugc.gamora.editor.subtitle;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.subtitle.EditSubtitleState */
public final class EditSubtitleState extends UiState {
    private C20391d<? extends List<C75313h>> captionsChangeEvent;

    /* renamed from: ui */
    private final AbstractC23517a f185619ui;

    static {
        Covode.recordClassIndex(96941);
    }

    public EditSubtitleState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.subtitle.EditSubtitleState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditSubtitleState copy$default(EditSubtitleState editSubtitleState, AbstractC23517a aVar, C20391d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = editSubtitleState.getUi();
        }
        if ((i & 2) != 0) {
            dVar = editSubtitleState.captionsChangeEvent;
        }
        return editSubtitleState.copy(aVar, dVar);
    }

    public final AbstractC23517a component1() {
        return getUi();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.bytedance.jedi.arch.d<? extends java.util.List<com.ss.android.ugc.aweme.sticker.data.h>>, com.bytedance.jedi.arch.d<java.util.List<com.ss.android.ugc.aweme.sticker.data.h>> */
    public final C20391d<List<C75313h>> component2() {
        return this.captionsChangeEvent;
    }

    public final EditSubtitleState copy(AbstractC23517a aVar, C20391d<? extends List<C75313h>> dVar) {
        C89219l.m154721d(aVar, "");
        return new EditSubtitleState(aVar, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditSubtitleState)) {
            return false;
        }
        EditSubtitleState editSubtitleState = (EditSubtitleState) obj;
        return C89219l.m154714a(getUi(), editSubtitleState.getUi()) && C89219l.m154714a(this.captionsChangeEvent, editSubtitleState.captionsChangeEvent);
    }

    public final int hashCode() {
        AbstractC23517a ui = getUi();
        int i = 0;
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        C20391d<? extends List<C75313h>> dVar = this.captionsChangeEvent;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditSubtitleState(ui=" + getUi() + ", captionsChangeEvent=" + this.captionsChangeEvent + ")";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.bytedance.jedi.arch.d<? extends java.util.List<com.ss.android.ugc.aweme.sticker.data.h>>, com.bytedance.jedi.arch.d<java.util.List<com.ss.android.ugc.aweme.sticker.data.h>> */
    public final C20391d<List<C75313h>> getCaptionsChangeEvent() {
        return this.captionsChangeEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f185619ui;
    }

    public final void setCaptionsChangeEvent(C20391d<? extends List<C75313h>> dVar) {
        this.captionsChangeEvent = dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditSubtitleState(AbstractC23517a aVar, C20391d<? extends List<C75313h>> dVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.f185619ui = aVar;
        this.captionsChangeEvent = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditSubtitleState(AbstractC23517a aVar, C20391d dVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? new AbstractC23517a.C23518a() : aVar, (i & 2) != 0 ? null : dVar);
    }
}
