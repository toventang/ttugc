package com.p2082ss.android.ugc.gamora.editor.gesture;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20525o;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.gesture.EditGestureState */
public final class EditGestureState extends UiState {
    private final C20524n<Float, Long> gestureAnimEvent;
    private final Boolean gestureEnable;
    private final C20525o<Float, Float, Float> gestureLayoutEvent;

    /* renamed from: ui */
    private final AbstractC23517a f184005ui;

    static {
        Covode.recordClassIndex(96081);
    }

    public EditGestureState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.gesture.EditGestureState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditGestureState copy$default(EditGestureState editGestureState, Boolean bool, C20524n nVar, C20525o oVar, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = editGestureState.gestureEnable;
        }
        if ((i & 2) != 0) {
            nVar = editGestureState.gestureAnimEvent;
        }
        if ((i & 4) != 0) {
            oVar = editGestureState.gestureLayoutEvent;
        }
        if ((i & 8) != 0) {
            aVar = editGestureState.getUi();
        }
        return editGestureState.copy(bool, nVar, oVar, aVar);
    }

    public final Boolean component1() {
        return this.gestureEnable;
    }

    public final C20524n<Float, Long> component2() {
        return this.gestureAnimEvent;
    }

    public final C20525o<Float, Float, Float> component3() {
        return this.gestureLayoutEvent;
    }

    public final AbstractC23517a component4() {
        return getUi();
    }

    public final EditGestureState copy(Boolean bool, C20524n<Float, Long> nVar, C20525o<Float, Float, Float> oVar, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new EditGestureState(bool, nVar, oVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditGestureState)) {
            return false;
        }
        EditGestureState editGestureState = (EditGestureState) obj;
        return C89219l.m154714a(this.gestureEnable, editGestureState.gestureEnable) && C89219l.m154714a(this.gestureAnimEvent, editGestureState.gestureAnimEvent) && C89219l.m154714a(this.gestureLayoutEvent, editGestureState.gestureLayoutEvent) && C89219l.m154714a(getUi(), editGestureState.getUi());
    }

    public final int hashCode() {
        Boolean bool = this.gestureEnable;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        C20524n<Float, Long> nVar = this.gestureAnimEvent;
        int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C20525o<Float, Float, Float> oVar = this.gestureLayoutEvent;
        int hashCode3 = (hashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "EditGestureState(gestureEnable=" + this.gestureEnable + ", gestureAnimEvent=" + this.gestureAnimEvent + ", gestureLayoutEvent=" + this.gestureLayoutEvent + ", ui=" + getUi() + ")";
    }

    public final C20524n<Float, Long> getGestureAnimEvent() {
        return this.gestureAnimEvent;
    }

    public final Boolean getGestureEnable() {
        return this.gestureEnable;
    }

    public final C20525o<Float, Float, Float> getGestureLayoutEvent() {
        return this.gestureLayoutEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f184005ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditGestureState(Boolean bool, C20524n<Float, Long> nVar, C20525o<Float, Float, Float> oVar, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.gestureEnable = bool;
        this.gestureAnimEvent = nVar;
        this.gestureLayoutEvent = oVar;
        this.f184005ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditGestureState(Boolean bool, C20524n nVar, C20525o oVar, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : nVar, (i & 4) != 0 ? null : oVar, (i & 8) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
