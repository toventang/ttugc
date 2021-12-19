package com.p2082ss.android.ugc.aweme.dependence.beauty.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy */
public final class ComposerBeautyBuriedInfoCopy {
    @AbstractC27891c(mo46611a = "beautify_info")
    private final List<BeautifyInfo> beautifyInfo;
    @AbstractC27891c(mo46611a = "beautify_used")
    private final int beautifyUsed;
    @AbstractC27891c(mo46611a = "beautify_on")
    private final int beautyStatus;
    @AbstractC27891c(mo46611a = "is_composer")
    private final int modeChosen;

    static {
        Covode.recordClassIndex(48974);
    }

    public ComposerBeautyBuriedInfoCopy() {
        this(0, 0, 0, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerBeautyBuriedInfoCopy copy$default(ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = composerBeautyBuriedInfoCopy.beautifyUsed;
        }
        if ((i4 & 2) != 0) {
            i2 = composerBeautyBuriedInfoCopy.getModeChosen();
        }
        if ((i4 & 4) != 0) {
            i3 = composerBeautyBuriedInfoCopy.getBeautyStatus();
        }
        if ((i4 & 8) != 0) {
            list = composerBeautyBuriedInfoCopy.beautifyInfo;
        }
        return composerBeautyBuriedInfoCopy.copy(i, i2, i3, list);
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

    public final ComposerBeautyBuriedInfoCopy copy(int i, int i2, int i3, List<BeautifyInfo> list) {
        C89219l.m154721d(list, "");
        return new ComposerBeautyBuriedInfoCopy(i, i2, i3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeautyBuriedInfoCopy)) {
            return false;
        }
        ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy = (ComposerBeautyBuriedInfoCopy) obj;
        return this.beautifyUsed == composerBeautyBuriedInfoCopy.beautifyUsed && getModeChosen() == composerBeautyBuriedInfoCopy.getModeChosen() && getBeautyStatus() == composerBeautyBuriedInfoCopy.getBeautyStatus() && C89219l.m154714a(this.beautifyInfo, composerBeautyBuriedInfoCopy.beautifyInfo);
    }

    public final int hashCode() {
        int modeChosen2 = ((((this.beautifyUsed * 31) + getModeChosen()) * 31) + getBeautyStatus()) * 31;
        List<BeautifyInfo> list = this.beautifyInfo;
        return modeChosen2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ComposerBeautyBuriedInfoCopy(beautifyUsed=" + this.beautifyUsed + ", modeChosen=" + getModeChosen() + ", beautyStatus=" + getBeautyStatus() + ", beautifyInfo=" + this.beautifyInfo + ")";
    }

    public final List<BeautifyInfo> getBeautifyInfo() {
        return this.beautifyInfo;
    }

    public final int getBeautifyUsed() {
        return this.beautifyUsed;
    }

    public final int getBeautyStatus() {
        return this.beautyStatus;
    }

    public final int getModeChosen() {
        return this.modeChosen;
    }

    public ComposerBeautyBuriedInfoCopy(int i, int i2, int i3, List<BeautifyInfo> list) {
        C89219l.m154721d(list, "");
        this.beautifyUsed = i;
        this.modeChosen = i2;
        this.beautyStatus = i3;
        this.beautifyInfo = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposerBeautyBuriedInfoCopy(int i, int i2, int i3, List list, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new ArrayList() : list);
    }
}
