package com.p2082ss.android.ugc.aweme.tools.beauty.data;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.data.BeautySyncData */
public final class BeautySyncData {
    private String categoryId;
    private String effectId;
    private String parentId;
    private String resourceId;

    static {
        Covode.recordClassIndex(90970);
    }

    public static /* synthetic */ BeautySyncData copy$default(BeautySyncData beautySyncData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautySyncData.effectId;
        }
        if ((i & 2) != 0) {
            str2 = beautySyncData.resourceId;
        }
        if ((i & 4) != 0) {
            str3 = beautySyncData.categoryId;
        }
        if ((i & 8) != 0) {
            str4 = beautySyncData.parentId;
        }
        return beautySyncData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.effectId;
    }

    public final String component2() {
        return this.resourceId;
    }

    public final String component3() {
        return this.categoryId;
    }

    public final String component4() {
        return this.parentId;
    }

    public final BeautySyncData copy(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new BeautySyncData(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautySyncData)) {
            return false;
        }
        BeautySyncData beautySyncData = (BeautySyncData) obj;
        return C89219l.m154714a(this.effectId, beautySyncData.effectId) && C89219l.m154714a(this.resourceId, beautySyncData.resourceId) && C89219l.m154714a(this.categoryId, beautySyncData.categoryId) && C89219l.m154714a(this.parentId, beautySyncData.parentId);
    }

    public final int hashCode() {
        String str = this.effectId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.resourceId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.categoryId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.parentId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "BeautySyncData(effectId=" + this.effectId + ", resourceId=" + this.resourceId + ", categoryId=" + this.categoryId + ", parentId=" + this.parentId + ")";
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setEffectId(String str) {
        C89219l.m154721d(str, "");
        this.effectId = str;
    }

    public final void setResourceId(String str) {
        C89219l.m154721d(str, "");
        this.resourceId = str;
    }

    public BeautySyncData(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.effectId = str;
        this.resourceId = str2;
        this.categoryId = str3;
        this.parentId = str4;
    }
}
