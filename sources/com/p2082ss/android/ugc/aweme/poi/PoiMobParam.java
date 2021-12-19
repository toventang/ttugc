package com.p2082ss.android.ugc.aweme.poi;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.poi.PoiMobParam */
public final class PoiMobParam implements Serializable {
    private final String contentType;
    private final String creationId;
    private String enterMethod;
    private final String shootWay;

    static {
        Covode.recordClassIndex(73975);
    }

    public PoiMobParam() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ PoiMobParam copy$default(PoiMobParam poiMobParam, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiMobParam.creationId;
        }
        if ((i & 2) != 0) {
            str2 = poiMobParam.contentType;
        }
        if ((i & 4) != 0) {
            str3 = poiMobParam.shootWay;
        }
        if ((i & 8) != 0) {
            str4 = poiMobParam.enterMethod;
        }
        return poiMobParam.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.creationId;
    }

    public final String component2() {
        return this.contentType;
    }

    public final String component3() {
        return this.shootWay;
    }

    public final String component4() {
        return this.enterMethod;
    }

    public final PoiMobParam copy(String str, String str2, String str3, String str4) {
        return new PoiMobParam(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiMobParam)) {
            return false;
        }
        PoiMobParam poiMobParam = (PoiMobParam) obj;
        return C89219l.m154714a(this.creationId, poiMobParam.creationId) && C89219l.m154714a(this.contentType, poiMobParam.contentType) && C89219l.m154714a(this.shootWay, poiMobParam.shootWay) && C89219l.m154714a(this.enterMethod, poiMobParam.enterMethod);
    }

    public final int hashCode() {
        String str = this.creationId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.contentType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.shootWay;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.enterMethod;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "PoiMobParam(creationId=" + this.creationId + ", contentType=" + this.contentType + ", shootWay=" + this.shootWay + ", enterMethod=" + this.enterMethod + ")";
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public PoiMobParam(String str, String str2, String str3, String str4) {
        this.creationId = str;
        this.contentType = str2;
        this.shootWay = str3;
        this.enterMethod = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoiMobParam(String str, String str2, String str3, String str4, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
