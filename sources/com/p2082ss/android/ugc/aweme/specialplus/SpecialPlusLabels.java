package com.p2082ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specialplus.SpecialPlusLabels */
public final class SpecialPlusLabels {
    @AbstractC27891c(mo46611a = "effect_ids")
    private String[] effectIds = new String[0];
    @AbstractC27891c(mo46611a = "eligible_effect_ids")
    private String[] eligibleEffectIds = new String[0];

    static {
        Covode.recordClassIndex(88082);
    }

    public final String[] getEffectIds() {
        return this.effectIds;
    }

    public final String[] getEligibleEffectIds() {
        return this.eligibleEffectIds;
    }

    public final void setEffectIds(String[] strArr) {
        C89219l.m154721d(strArr, "");
        this.effectIds = strArr;
    }

    public final void setEligibleEffectIds(String[] strArr) {
        C89219l.m154721d(strArr, "");
        this.eligibleEffectIds = strArr;
    }
}
