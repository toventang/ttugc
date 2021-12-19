package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AppRawData */
public final class AppRawData implements Serializable {
    @AbstractC27891c(mo46611a = "download_mode")
    private final int downloadMode;
    @AbstractC27891c(mo46611a = "download_url")
    private final String downloadUrl;
    @AbstractC27891c(mo46611a = "event_tag")
    private final String eventTag;
    @AbstractC27891c(mo46611a = "group_id")
    private final String groupId;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private final String f114475id;
    @AbstractC27891c(mo46611a = "is_ad")
    private final int isAd;
    @AbstractC27891c(mo46611a = "log_extra")
    private final String logExtra;
    @AbstractC27891c(mo46611a = StringSet.name)
    private final String name;
    @AbstractC27891c(mo46611a = "pkg_name")
    private final String pkgName;
    @AbstractC27891c(mo46611a = "quick_app_url")
    private final String quickAppUrl;

    static {
        Covode.recordClassIndex(58610);
    }

    public AppRawData() {
        this(null, null, null, null, null, null, 0, null, null, 0, 1023, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_AppRawData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93157x7f04389(int i) {
        return i;
    }

    public static /* synthetic */ AppRawData copy$default(AppRawData appRawData, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = appRawData.f114475id;
        }
        if ((i3 & 2) != 0) {
            str2 = appRawData.name;
        }
        if ((i3 & 4) != 0) {
            str3 = appRawData.pkgName;
        }
        if ((i3 & 8) != 0) {
            str4 = appRawData.downloadUrl;
        }
        if ((i3 & 16) != 0) {
            str5 = appRawData.eventTag;
        }
        if ((i3 & 32) != 0) {
            str6 = appRawData.groupId;
        }
        if ((i3 & 64) != 0) {
            i = appRawData.isAd;
        }
        if ((i3 & 128) != 0) {
            str7 = appRawData.logExtra;
        }
        if ((i3 & 256) != 0) {
            str8 = appRawData.quickAppUrl;
        }
        if ((i3 & 512) != 0) {
            i2 = appRawData.downloadMode;
        }
        return appRawData.copy(str, str2, str3, str4, str5, str6, i, str7, str8, i2);
    }

    public final String component1() {
        return this.f114475id;
    }

    public final int component10() {
        return this.downloadMode;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.pkgName;
    }

    public final String component4() {
        return this.downloadUrl;
    }

    public final String component5() {
        return this.eventTag;
    }

    public final String component6() {
        return this.groupId;
    }

    public final int component7() {
        return this.isAd;
    }

    public final String component8() {
        return this.logExtra;
    }

    public final String component9() {
        return this.quickAppUrl;
    }

    public final AppRawData copy(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2) {
        return new AppRawData(str, str2, str3, str4, str5, str6, i, str7, str8, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppRawData)) {
            return false;
        }
        AppRawData appRawData = (AppRawData) obj;
        return C89219l.m154714a(this.f114475id, appRawData.f114475id) && C89219l.m154714a(this.name, appRawData.name) && C89219l.m154714a(this.pkgName, appRawData.pkgName) && C89219l.m154714a(this.downloadUrl, appRawData.downloadUrl) && C89219l.m154714a(this.eventTag, appRawData.eventTag) && C89219l.m154714a(this.groupId, appRawData.groupId) && this.isAd == appRawData.isAd && C89219l.m154714a(this.logExtra, appRawData.logExtra) && C89219l.m154714a(this.quickAppUrl, appRawData.quickAppUrl) && this.downloadMode == appRawData.downloadMode;
    }

    public final int hashCode() {
        String str = this.f114475id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.pkgName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.downloadUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.eventTag;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.groupId;
        int hashCode6 = (((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + m93157x7f04389(this.isAd)) * 31;
        String str7 = this.logExtra;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.quickAppUrl;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return ((hashCode7 + i) * 31) + m93157x7f04389(this.downloadMode);
    }

    public final String toString() {
        return "AppRawData(id=" + this.f114475id + ", name=" + this.name + ", pkgName=" + this.pkgName + ", downloadUrl=" + this.downloadUrl + ", eventTag=" + this.eventTag + ", groupId=" + this.groupId + ", isAd=" + this.isAd + ", logExtra=" + this.logExtra + ", quickAppUrl=" + this.quickAppUrl + ", downloadMode=" + this.downloadMode + ")";
    }

    public final int getDownloadMode() {
        return this.downloadMode;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getEventTag() {
        return this.eventTag;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getId() {
        return this.f114475id;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPkgName() {
        return this.pkgName;
    }

    public final String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public final int isAd() {
        return this.isAd;
    }

    public AppRawData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2) {
        this.f114475id = str;
        this.name = str2;
        this.pkgName = str3;
        this.downloadUrl = str4;
        this.eventTag = str5;
        this.groupId = str6;
        this.isAd = i;
        this.logExtra = str7;
        this.quickAppUrl = str8;
        this.downloadMode = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppRawData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? null : str7, (i3 & 256) == 0 ? str8 : null, (i3 & 512) == 0 ? i2 : 0);
    }
}
