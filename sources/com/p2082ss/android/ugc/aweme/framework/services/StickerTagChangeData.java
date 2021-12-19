package com.p2082ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.framework.services.StickerTagChangeData */
public final class StickerTagChangeData {
    private final String panel;
    private final String tabKey;
    private final String tabName;

    static {
        Covode.recordClassIndex(60683);
    }

    public static /* synthetic */ StickerTagChangeData copy$default(StickerTagChangeData stickerTagChangeData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickerTagChangeData.panel;
        }
        if ((i & 2) != 0) {
            str2 = stickerTagChangeData.tabName;
        }
        if ((i & 4) != 0) {
            str3 = stickerTagChangeData.tabKey;
        }
        return stickerTagChangeData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.panel;
    }

    public final String component2() {
        return this.tabName;
    }

    public final String component3() {
        return this.tabKey;
    }

    public final StickerTagChangeData copy(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new StickerTagChangeData(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerTagChangeData)) {
            return false;
        }
        StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) obj;
        return C89219l.m154714a(this.panel, stickerTagChangeData.panel) && C89219l.m154714a(this.tabName, stickerTagChangeData.tabName) && C89219l.m154714a(this.tabKey, stickerTagChangeData.tabKey);
    }

    public final int hashCode() {
        String str = this.panel;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tabName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.tabKey;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "StickerTagChangeData(panel=" + this.panel + ", tabName=" + this.tabName + ", tabKey=" + this.tabKey + ")";
    }

    public final String getPanel() {
        return this.panel;
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public StickerTagChangeData(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.panel = str;
        this.tabName = str2;
        this.tabKey = str3;
    }
}
