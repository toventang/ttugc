package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ChallengeElasticLayer */
public final class ChallengeElasticLayer implements Serializable {
    @AbstractC27891c(mo46611a = "desc")
    private final String desc;
    @AbstractC27891c(mo46611a = "tag")
    private final String tag;

    static {
        Covode.recordClassIndex(50435);
    }

    public ChallengeElasticLayer() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ChallengeElasticLayer copy$default(ChallengeElasticLayer challengeElasticLayer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeElasticLayer.tag;
        }
        if ((i & 2) != 0) {
            str2 = challengeElasticLayer.desc;
        }
        return challengeElasticLayer.copy(str, str2);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.desc;
    }

    public final ChallengeElasticLayer copy(String str, String str2) {
        return new ChallengeElasticLayer(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeElasticLayer)) {
            return false;
        }
        ChallengeElasticLayer challengeElasticLayer = (ChallengeElasticLayer) obj;
        return C89219l.m154714a(this.tag, challengeElasticLayer.tag) && C89219l.m154714a(this.desc, challengeElasticLayer.desc);
    }

    public final int hashCode() {
        String str = this.tag;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ChallengeElasticLayer(tag=" + this.tag + ", desc=" + this.desc + ")";
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getTag() {
        return this.tag;
    }

    public ChallengeElasticLayer(String str, String str2) {
        this.tag = str;
        this.desc = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeElasticLayer(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
