package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class DebugToolState implements Serializable {
    @AbstractC27891c(mo46611a = "can_debug_tool")
    private Boolean canDebugTool;

    static {
        Covode.recordClassIndex(13365);
    }

    public DebugToolState() {
        this(null, 1, null);
    }

    public static /* synthetic */ DebugToolState copy$default(DebugToolState debugToolState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = debugToolState.canDebugTool;
        }
        return debugToolState.copy(bool);
    }

    public final Boolean component1() {
        return this.canDebugTool;
    }

    public final DebugToolState copy(Boolean bool) {
        return new DebugToolState(bool);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DebugToolState) && C89219l.m154714a(this.canDebugTool, ((DebugToolState) obj).canDebugTool);
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.canDebugTool;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DebugToolState(canDebugTool=" + this.canDebugTool + ")";
    }

    public final Boolean getCanDebugTool() {
        return this.canDebugTool;
    }

    public final void setCanDebugTool(Boolean bool) {
        this.canDebugTool = bool;
    }

    public DebugToolState(Boolean bool) {
        this.canDebugTool = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DebugToolState(Boolean bool, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
