package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVState */
public final class RecordMVState implements AbstractC20368af {
    private final Boolean relayout;
    private final Boolean topMargin;

    static {
        Covode.recordClassIndex(91984);
    }

    public RecordMVState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RecordMVState copy$default(RecordMVState recordMVState, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = recordMVState.relayout;
        }
        if ((i & 2) != 0) {
            bool2 = recordMVState.topMargin;
        }
        return recordMVState.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.relayout;
    }

    public final Boolean component2() {
        return this.topMargin;
    }

    public final RecordMVState copy(Boolean bool, Boolean bool2) {
        return new RecordMVState(bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordMVState)) {
            return false;
        }
        RecordMVState recordMVState = (RecordMVState) obj;
        return C89219l.m154714a(this.relayout, recordMVState.relayout) && C89219l.m154714a(this.topMargin, recordMVState.topMargin);
    }

    public final int hashCode() {
        Boolean bool = this.relayout;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.topMargin;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RecordMVState(relayout=" + this.relayout + ", topMargin=" + this.topMargin + ")";
    }

    public final Boolean getRelayout() {
        return this.relayout;
    }

    public final Boolean getTopMargin() {
        return this.topMargin;
    }

    public RecordMVState(Boolean bool, Boolean bool2) {
        this.relayout = bool;
        this.topMargin = bool2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecordMVState(Boolean bool, Boolean bool2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
