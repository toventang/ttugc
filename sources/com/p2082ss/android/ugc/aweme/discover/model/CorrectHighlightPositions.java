package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CorrectHighlightPositions */
public final class CorrectHighlightPositions implements Serializable {
    private final List<CorrectPosition> positions;

    static {
        Covode.recordClassIndex(50443);
    }

    public CorrectHighlightPositions() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.CorrectHighlightPositions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CorrectHighlightPositions copy$default(CorrectHighlightPositions correctHighlightPositions, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = correctHighlightPositions.positions;
        }
        return correctHighlightPositions.copy(list);
    }

    public final List<CorrectPosition> component1() {
        return this.positions;
    }

    public final CorrectHighlightPositions copy(List<CorrectPosition> list) {
        C89219l.m154721d(list, "");
        return new CorrectHighlightPositions(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CorrectHighlightPositions) && C89219l.m154714a(this.positions, ((CorrectHighlightPositions) obj).positions);
        }
        return true;
    }

    public final int hashCode() {
        List<CorrectPosition> list = this.positions;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CorrectHighlightPositions(positions=" + this.positions + ")";
    }

    public final List<CorrectPosition> getPositions() {
        return this.positions;
    }

    public final boolean hasHighlightPosition() {
        if (!this.positions.isEmpty()) {
            return true;
        }
        return false;
    }

    public CorrectHighlightPositions(List<CorrectPosition> list) {
        C89219l.m154721d(list, "");
        this.positions = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CorrectHighlightPositions(List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
