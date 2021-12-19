package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedState */
public final class CutVideoSpeedState implements AbstractC20368af {
    private final Boolean enable;
    private final Boolean visible;

    static {
        Covode.recordClassIndex(82569);
    }

    public CutVideoSpeedState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CutVideoSpeedState copy$default(CutVideoSpeedState cutVideoSpeedState, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cutVideoSpeedState.enable;
        }
        if ((i & 2) != 0) {
            bool2 = cutVideoSpeedState.visible;
        }
        return cutVideoSpeedState.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final Boolean component2() {
        return this.visible;
    }

    public final CutVideoSpeedState copy(Boolean bool, Boolean bool2) {
        return new CutVideoSpeedState(bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoSpeedState)) {
            return false;
        }
        CutVideoSpeedState cutVideoSpeedState = (CutVideoSpeedState) obj;
        return C89219l.m154714a(this.enable, cutVideoSpeedState.enable) && C89219l.m154714a(this.visible, cutVideoSpeedState.visible);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.visible;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CutVideoSpeedState(enable=" + this.enable + ", visible=" + this.visible + ")";
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public CutVideoSpeedState(Boolean bool, Boolean bool2) {
        this.enable = bool;
        this.visible = bool2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoSpeedState(Boolean bool, Boolean bool2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
