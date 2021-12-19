package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderRestrict */
public final class ShoutoutsOrderRestrict {
    @AbstractC27891c(mo46611a = "opening")
    private final boolean opening;
    @AbstractC27891c(mo46611a = "other_restrict")
    private final boolean otherRestrict;
    @AbstractC27891c(mo46611a = "reason")
    private final String reason;
    @AbstractC27891c(mo46611a = "restrict_type")
    private final int restrictType;

    static {
        Covode.recordClassIndex(87214);
    }

    /* renamed from: com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsOrderRestrict_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m130887x649c8232(int i) {
        return i;
    }

    public static /* synthetic */ ShoutoutsOrderRestrict copy$default(ShoutoutsOrderRestrict shoutoutsOrderRestrict, boolean z, boolean z2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = shoutoutsOrderRestrict.opening;
        }
        if ((i2 & 2) != 0) {
            z2 = shoutoutsOrderRestrict.otherRestrict;
        }
        if ((i2 & 4) != 0) {
            str = shoutoutsOrderRestrict.reason;
        }
        if ((i2 & 8) != 0) {
            i = shoutoutsOrderRestrict.restrictType;
        }
        return shoutoutsOrderRestrict.copy(z, z2, str, i);
    }

    public final boolean component1() {
        return this.opening;
    }

    public final boolean component2() {
        return this.otherRestrict;
    }

    public final String component3() {
        return this.reason;
    }

    public final int component4() {
        return this.restrictType;
    }

    public final ShoutoutsOrderRestrict copy(boolean z, boolean z2, String str, int i) {
        return new ShoutoutsOrderRestrict(z, z2, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsOrderRestrict)) {
            return false;
        }
        ShoutoutsOrderRestrict shoutoutsOrderRestrict = (ShoutoutsOrderRestrict) obj;
        return this.opening == shoutoutsOrderRestrict.opening && this.otherRestrict == shoutoutsOrderRestrict.otherRestrict && C89219l.m154714a(this.reason, shoutoutsOrderRestrict.reason) && this.restrictType == shoutoutsOrderRestrict.restrictType;
    }

    public final int hashCode() {
        boolean z = this.opening;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.otherRestrict) {
            i = 0;
        }
        int i6 = (i5 + i) * 31;
        String str = this.reason;
        return ((i6 + (str != null ? str.hashCode() : 0)) * 31) + m130887x649c8232(this.restrictType);
    }

    public final String toString() {
        return "ShoutoutsOrderRestrict(opening=" + this.opening + ", otherRestrict=" + this.otherRestrict + ", reason=" + this.reason + ", restrictType=" + this.restrictType + ")";
    }

    public final boolean getOpening() {
        return this.opening;
    }

    public final boolean getOtherRestrict() {
        return this.otherRestrict;
    }

    public final String getReason() {
        return this.reason;
    }

    public final int getRestrictType() {
        return this.restrictType;
    }

    public ShoutoutsOrderRestrict(boolean z, boolean z2, String str, int i) {
        this.opening = z;
        this.otherRestrict = z2;
        this.reason = str;
        this.restrictType = i;
    }
}
