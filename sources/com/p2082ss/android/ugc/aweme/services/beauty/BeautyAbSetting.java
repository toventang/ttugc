package com.p2082ss.android.ugc.aweme.services.beauty;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.services.beauty.BeautyAbSetting */
public final class BeautyAbSetting {
    private final int abGroup;
    private final boolean isDataSync;

    static {
        Covode.recordClassIndex(79747);
    }

    public BeautyAbSetting() {
        this(false, 0, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_beauty_BeautyAbSetting_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m120120x77119032(int i) {
        return i;
    }

    public static /* synthetic */ BeautyAbSetting copy$default(BeautyAbSetting beautyAbSetting, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = beautyAbSetting.isDataSync;
        }
        if ((i2 & 2) != 0) {
            i = beautyAbSetting.abGroup;
        }
        return beautyAbSetting.copy(z, i);
    }

    public final boolean component1() {
        return this.isDataSync;
    }

    public final int component2() {
        return this.abGroup;
    }

    public final BeautyAbSetting copy(boolean z, int i) {
        return new BeautyAbSetting(z, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautyAbSetting)) {
            return false;
        }
        BeautyAbSetting beautyAbSetting = (BeautyAbSetting) obj;
        return this.isDataSync == beautyAbSetting.isDataSync && this.abGroup == beautyAbSetting.abGroup;
    }

    public final int hashCode() {
        boolean z = this.isDataSync;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (i * 31) + m120120x77119032(this.abGroup);
    }

    public final String toString() {
        return "BeautyAbSetting(isDataSync=" + this.isDataSync + ", abGroup=" + this.abGroup + ")";
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final boolean isDataSync() {
        return this.isDataSync;
    }

    public BeautyAbSetting(boolean z, int i) {
        this.isDataSync = z;
        this.abGroup = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautyAbSetting(boolean z, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
