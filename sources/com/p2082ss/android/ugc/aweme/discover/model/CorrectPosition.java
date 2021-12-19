package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CorrectPosition */
public final class CorrectPosition implements Serializable {
    private final int begin;
    private final int end;

    static {
        Covode.recordClassIndex(50444);
    }

    /* renamed from: com_ss_android_ugc_aweme_discover_model_CorrectPosition_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m84888x9d861ef6(int i) {
        return i;
    }

    public static /* synthetic */ CorrectPosition copy$default(CorrectPosition correctPosition, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = correctPosition.begin;
        }
        if ((i3 & 2) != 0) {
            i2 = correctPosition.end;
        }
        return correctPosition.copy(i, i2);
    }

    public final int component1() {
        return this.begin;
    }

    public final int component2() {
        return this.end;
    }

    public final CorrectPosition copy(int i, int i2) {
        return new CorrectPosition(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CorrectPosition)) {
            return false;
        }
        CorrectPosition correctPosition = (CorrectPosition) obj;
        return this.begin == correctPosition.begin && this.end == correctPosition.end;
    }

    public final int hashCode() {
        return (m84888x9d861ef6(this.begin) * 31) + m84888x9d861ef6(this.end);
    }

    public final String toString() {
        return "CorrectPosition(begin=" + this.begin + ", end=" + this.end + ")";
    }

    public final int getBegin() {
        return this.begin;
    }

    public final int getEnd() {
        return this.end;
    }

    public final boolean isValid() {
        if (this.end >= this.begin) {
            return true;
        }
        return false;
    }

    public CorrectPosition(int i, int i2) {
        this.begin = i;
        this.end = i2;
    }
}
