package com.p2082ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo */
public final class ComposerBeautyBuriedInfo implements AbstractC34803a {
    @AbstractC27891c(mo46611a = "beautify_info")
    private final List<BeautifyInfo> beautifyInfo;
    @AbstractC27891c(mo46611a = "beautify_used")
    private final int beautifyUsed;
    @AbstractC27891c(mo46611a = "beautify_on")
    private final int beautyStatus;
    @AbstractC27891c(mo46611a = "is_composer")
    private final int modeChosen;

    static {
        Covode.recordClassIndex(41801);
    }

    public ComposerBeautyBuriedInfo() {
        this(0, 0, 0, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_beauty_ComposerBeautyBuriedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m71106xec84b5d7(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerBeautyBuriedInfo copy$default(ComposerBeautyBuriedInfo composerBeautyBuriedInfo, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = composerBeautyBuriedInfo.beautifyUsed;
        }
        if ((i4 & 2) != 0) {
            i2 = composerBeautyBuriedInfo.getModeChosen();
        }
        if ((i4 & 4) != 0) {
            i3 = composerBeautyBuriedInfo.getBeautyStatus();
        }
        if ((i4 & 8) != 0) {
            list = composerBeautyBuriedInfo.beautifyInfo;
        }
        return composerBeautyBuriedInfo.copy(i, i2, i3, list);
    }

    public final int component1() {
        return this.beautifyUsed;
    }

    public final int component2() {
        return getModeChosen();
    }

    public final int component3() {
        return getBeautyStatus();
    }

    public final List<BeautifyInfo> component4() {
        return this.beautifyInfo;
    }

    public final ComposerBeautyBuriedInfo copy(int i, int i2, int i3, List<BeautifyInfo> list) {
        C89219l.m154721d(list, "");
        return new ComposerBeautyBuriedInfo(i, i2, i3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeautyBuriedInfo)) {
            return false;
        }
        ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) obj;
        return this.beautifyUsed == composerBeautyBuriedInfo.beautifyUsed && getModeChosen() == composerBeautyBuriedInfo.getModeChosen() && getBeautyStatus() == composerBeautyBuriedInfo.getBeautyStatus() && C89219l.m154714a(this.beautifyInfo, composerBeautyBuriedInfo.beautifyInfo);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_beauty_ComposerBeautyBuriedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((m71106xec84b5d7(this.beautifyUsed) * 31) + m71106xec84b5d7(getModeChosen())) * 31) + m71106xec84b5d7(getBeautyStatus())) * 31;
        List<BeautifyInfo> list = this.beautifyInfo;
        return com_ss_android_ugc_aweme_beauty_ComposerBeautyBuriedInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ComposerBeautyBuriedInfo(beautifyUsed=" + this.beautifyUsed + ", modeChosen=" + getModeChosen() + ", beautyStatus=" + getBeautyStatus() + ", beautifyInfo=" + this.beautifyInfo + ")";
    }

    public final List<BeautifyInfo> getBeautifyInfo() {
        return this.beautifyInfo;
    }

    public final int getBeautifyUsed() {
        return this.beautifyUsed;
    }

    @Override // com.p2082ss.android.ugc.aweme.beauty.AbstractC34803a
    public final int getBeautyStatus() {
        return this.beautyStatus;
    }

    public final int getModeChosen() {
        return this.modeChosen;
    }

    public ComposerBeautyBuriedInfo(int i, int i2, int i3, List<BeautifyInfo> list) {
        C89219l.m154721d(list, "");
        this.beautifyUsed = i;
        this.modeChosen = i2;
        this.beautyStatus = i3;
        this.beautifyInfo = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposerBeautyBuriedInfo(int i, int i2, int i3, List list, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new ArrayList() : list);
    }
}
