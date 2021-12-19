package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ChallengeExtraAttrStruct */
public final class ChallengeExtraAttrStruct implements Serializable {
    @AbstractC27891c(mo46611a = "is_live")
    private final boolean isLive;

    static {
        Covode.recordClassIndex(50436);
    }

    public ChallengeExtraAttrStruct() {
        this(false, 1, null);
    }

    public static /* synthetic */ ChallengeExtraAttrStruct copy$default(ChallengeExtraAttrStruct challengeExtraAttrStruct, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = challengeExtraAttrStruct.isLive;
        }
        return challengeExtraAttrStruct.copy(z);
    }

    public final boolean component1() {
        return this.isLive;
    }

    public final ChallengeExtraAttrStruct copy(boolean z) {
        return new ChallengeExtraAttrStruct(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ChallengeExtraAttrStruct) && this.isLive == ((ChallengeExtraAttrStruct) obj).isLive;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.isLive;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ChallengeExtraAttrStruct(isLive=" + this.isLive + ")";
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public ChallengeExtraAttrStruct(boolean z) {
        this.isLive = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeExtraAttrStruct(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z);
    }
}
