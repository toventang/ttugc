package com.p2082ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.core.upload.SmartSliceModel */
public final class SmartSliceModel {
    public static final C65515a Companion = new C65515a((byte) 0);
    @AbstractC27891c(mo46611a = "base_number")
    private final int baseNumber;
    @AbstractC27891c(mo46611a = "max_slice_size")
    private final int maxSliceSize;
    @AbstractC27891c(mo46611a = "min_slice_size")
    private final int minSliceSize;
    @AbstractC27891c(mo46611a = "nearest_upper")
    private final boolean nearestUpper;
    @AbstractC27891c(mo46611a = "package_url")
    private final String packageUrl;
    @AbstractC27891c(mo46611a = "scene")
    private final String scene;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(77004);
    }

    /* renamed from: com_ss_android_ugc_aweme_publish_core_upload_SmartSliceModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m117245xa71b9a33(int i) {
        return i;
    }

    public static /* synthetic */ SmartSliceModel copy$default(SmartSliceModel smartSliceModel, String str, int i, String str2, boolean z, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = smartSliceModel.scene;
        }
        if ((i5 & 2) != 0) {
            i = smartSliceModel.type;
        }
        if ((i5 & 4) != 0) {
            str2 = smartSliceModel.packageUrl;
        }
        if ((i5 & 8) != 0) {
            z = smartSliceModel.nearestUpper;
        }
        if ((i5 & 16) != 0) {
            i2 = smartSliceModel.minSliceSize;
        }
        if ((i5 & 32) != 0) {
            i3 = smartSliceModel.maxSliceSize;
        }
        if ((i5 & 64) != 0) {
            i4 = smartSliceModel.baseNumber;
        }
        return smartSliceModel.copy(str, i, str2, z, i2, i3, i4);
    }

    public final String component1() {
        return this.scene;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.packageUrl;
    }

    public final boolean component4() {
        return this.nearestUpper;
    }

    public final int component5() {
        return this.minSliceSize;
    }

    public final int component6() {
        return this.maxSliceSize;
    }

    public final int component7() {
        return this.baseNumber;
    }

    public final SmartSliceModel copy(String str, int i, String str2, boolean z, int i2, int i3, int i4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new SmartSliceModel(str, i, str2, z, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartSliceModel)) {
            return false;
        }
        SmartSliceModel smartSliceModel = (SmartSliceModel) obj;
        return C89219l.m154714a(this.scene, smartSliceModel.scene) && this.type == smartSliceModel.type && C89219l.m154714a(this.packageUrl, smartSliceModel.packageUrl) && this.nearestUpper == smartSliceModel.nearestUpper && this.minSliceSize == smartSliceModel.minSliceSize && this.maxSliceSize == smartSliceModel.maxSliceSize && this.baseNumber == smartSliceModel.baseNumber;
    }

    public final int hashCode() {
        String str = this.scene;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + m117245xa71b9a33(this.type)) * 31;
        String str2 = this.packageUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.nearestUpper;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return ((((((i2 + i3) * 31) + m117245xa71b9a33(this.minSliceSize)) * 31) + m117245xa71b9a33(this.maxSliceSize)) * 31) + m117245xa71b9a33(this.baseNumber);
    }

    public final String toString() {
        return "SmartSliceModel(scene=" + this.scene + ", type=" + this.type + ", packageUrl=" + this.packageUrl + ", nearestUpper=" + this.nearestUpper + ", minSliceSize=" + this.minSliceSize + ", maxSliceSize=" + this.maxSliceSize + ", baseNumber=" + this.baseNumber + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.upload.SmartSliceModel$a */
    public static final class C65515a {
        static {
            Covode.recordClassIndex(77005);
        }

        private C65515a() {
        }

        public /* synthetic */ C65515a(byte b) {
            this();
        }
    }

    public final int getBaseNumber() {
        return this.baseNumber;
    }

    public final int getMaxSliceSize() {
        return this.maxSliceSize;
    }

    public final int getMinSliceSize() {
        return this.minSliceSize;
    }

    public final boolean getNearestUpper() {
        return this.nearestUpper;
    }

    public final String getPackageUrl() {
        return this.packageUrl;
    }

    public final String getScene() {
        return this.scene;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValidMaxSliceSize() {
        int i = this.maxSliceSize;
        if (i <= 0) {
            return 4096;
        }
        return i;
    }

    public final int getValidMinSliceSize() {
        int i = this.minSliceSize;
        if (i <= 0) {
            return 256;
        }
        return i;
    }

    public final int getValidTimesBaseNumber() {
        int i = this.baseNumber;
        if (i <= 0) {
            return 16;
        }
        return i;
    }

    public SmartSliceModel(String str, int i, String str2, boolean z, int i2, int i3, int i4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.scene = str;
        this.type = i;
        this.packageUrl = str2;
        this.nearestUpper = z;
        this.minSliceSize = i2;
        this.maxSliceSize = i3;
        this.baseNumber = i4;
    }
}
