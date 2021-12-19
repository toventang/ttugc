package com.p2082ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.publish.HotSpotTagPublishModel */
public final class HotSpotTagPublishModel {

    /* renamed from: id */
    private final String f152056id;
    private final String tag;

    static {
        Covode.recordClassIndex(79934);
    }

    public static /* synthetic */ HotSpotTagPublishModel copy$default(HotSpotTagPublishModel hotSpotTagPublishModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotSpotTagPublishModel.tag;
        }
        if ((i & 2) != 0) {
            str2 = hotSpotTagPublishModel.f152056id;
        }
        return hotSpotTagPublishModel.copy(str, str2);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.f152056id;
    }

    public final HotSpotTagPublishModel copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new HotSpotTagPublishModel(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotSpotTagPublishModel)) {
            return false;
        }
        HotSpotTagPublishModel hotSpotTagPublishModel = (HotSpotTagPublishModel) obj;
        return C89219l.m154714a(this.tag, hotSpotTagPublishModel.tag) && C89219l.m154714a(this.f152056id, hotSpotTagPublishModel.f152056id);
    }

    public final int hashCode() {
        String str = this.tag;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f152056id;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "HotSpotTagPublishModel(tag=" + this.tag + ", id=" + this.f152056id + ")";
    }

    public final String getId() {
        return this.f152056id;
    }

    public final String getTag() {
        return this.tag;
    }

    public HotSpotTagPublishModel(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.tag = str;
        this.f152056id = str2;
    }
}
