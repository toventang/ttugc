package com.p2082ss.android.ugc.aweme.pendant.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.pendant.setting.ShredConfigurationData */
public final class ShredConfigurationData {
    @AbstractC27891c(mo46611a = "fragment_display_switch")
    private final boolean twinkleEnabled;
    @AbstractC27891c(mo46611a = "vv_of_fragments")
    private final int[] vvList;

    static {
        Covode.recordClassIndex(73648);
    }

    public static /* synthetic */ ShredConfigurationData copy$default(ShredConfigurationData shredConfigurationData, boolean z, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shredConfigurationData.twinkleEnabled;
        }
        if ((i & 2) != 0) {
            iArr = shredConfigurationData.vvList;
        }
        return shredConfigurationData.copy(z, iArr);
    }

    public final boolean component1() {
        return this.twinkleEnabled;
    }

    public final int[] component2() {
        return this.vvList;
    }

    public final ShredConfigurationData copy(boolean z, int[] iArr) {
        C89219l.m154721d(iArr, "");
        return new ShredConfigurationData(z, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShredConfigurationData)) {
            return false;
        }
        ShredConfigurationData shredConfigurationData = (ShredConfigurationData) obj;
        return this.twinkleEnabled == shredConfigurationData.twinkleEnabled && C89219l.m154714a(this.vvList, shredConfigurationData.vvList);
    }

    public final int hashCode() {
        boolean z = this.twinkleEnabled;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        int[] iArr = this.vvList;
        return i4 + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }

    public final String toString() {
        return "ShredConfigurationData(twinkleEnabled=" + this.twinkleEnabled + ", vvList=" + Arrays.toString(this.vvList) + ")";
    }

    public final boolean getTwinkleEnabled() {
        return this.twinkleEnabled;
    }

    public final int[] getVvList() {
        return this.vvList;
    }

    public ShredConfigurationData(boolean z, int[] iArr) {
        C89219l.m154721d(iArr, "");
        this.twinkleEnabled = z;
        this.vvList = iArr;
    }
}
