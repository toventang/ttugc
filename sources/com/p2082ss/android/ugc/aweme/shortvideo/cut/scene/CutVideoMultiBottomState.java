package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomState */
public final class CutVideoMultiBottomState implements AbstractC20368af {
    private final Boolean visible;

    static {
        Covode.recordClassIndex(82555);
    }

    public CutVideoMultiBottomState() {
        this(null, 1, null);
    }

    public static /* synthetic */ CutVideoMultiBottomState copy$default(CutVideoMultiBottomState cutVideoMultiBottomState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cutVideoMultiBottomState.visible;
        }
        return cutVideoMultiBottomState.copy(bool);
    }

    public final Boolean component1() {
        return this.visible;
    }

    public final CutVideoMultiBottomState copy(Boolean bool) {
        return new CutVideoMultiBottomState(bool);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CutVideoMultiBottomState) && C89219l.m154714a(this.visible, ((CutVideoMultiBottomState) obj).visible);
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.visible;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CutVideoMultiBottomState(visible=" + this.visible + ")";
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public CutVideoMultiBottomState(Boolean bool) {
        this.visible = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoMultiBottomState(Boolean bool, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
