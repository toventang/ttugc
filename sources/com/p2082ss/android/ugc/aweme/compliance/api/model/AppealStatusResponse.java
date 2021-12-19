package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse */
public final class AppealStatusResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "appeal_type")
    private final int appealType;
    @AbstractC27891c(mo46611a = "appeal_url")
    private final String appealUrl;
    @AbstractC27891c(mo46611a = "ban_time")
    private final long banTime;
    @AbstractC27891c(mo46611a = "ban_type")
    private final int banType;
    @AbstractC27891c(mo46611a = "button_list")
    private final List<C39251l> buttonList;
    @AbstractC27891c(mo46611a = "pop_content")
    private final String popContent;
    @AbstractC27891c(mo46611a = "pop_title")
    private final String popTitle;
    @AbstractC27891c(mo46611a = "status")
    private final int status;

    static {
        Covode.recordClassIndex(46880);
    }

    public AppealStatusResponse() {
        this(0, 0, 0, 0, null, null, null, null, 255, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m79635xf63e2322(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m79636xf63e2322(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppealStatusResponse copy$default(AppealStatusResponse appealStatusResponse, int i, int i2, long j, int i3, String str, String str2, String str3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = appealStatusResponse.status;
        }
        if ((i4 & 2) != 0) {
            i2 = appealStatusResponse.banType;
        }
        if ((i4 & 4) != 0) {
            j = appealStatusResponse.banTime;
        }
        if ((i4 & 8) != 0) {
            i3 = appealStatusResponse.appealType;
        }
        if ((i4 & 16) != 0) {
            str = appealStatusResponse.popTitle;
        }
        if ((i4 & 32) != 0) {
            str2 = appealStatusResponse.popContent;
        }
        if ((i4 & 64) != 0) {
            str3 = appealStatusResponse.appealUrl;
        }
        if ((i4 & 128) != 0) {
            list = appealStatusResponse.buttonList;
        }
        return appealStatusResponse.copy(i, i2, j, i3, str, str2, str3, list);
    }

    public final int component1() {
        return this.status;
    }

    public final int component2() {
        return this.banType;
    }

    public final long component3() {
        return this.banTime;
    }

    public final int component4() {
        return this.appealType;
    }

    public final String component5() {
        return this.popTitle;
    }

    public final String component6() {
        return this.popContent;
    }

    public final String component7() {
        return this.appealUrl;
    }

    public final List<C39251l> component8() {
        return this.buttonList;
    }

    public final AppealStatusResponse copy(int i, int i2, long j, int i3, String str, String str2, String str3, List<C39251l> list) {
        return new AppealStatusResponse(i, i2, j, i3, str, str2, str3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppealStatusResponse)) {
            return false;
        }
        AppealStatusResponse appealStatusResponse = (AppealStatusResponse) obj;
        return this.status == appealStatusResponse.status && this.banType == appealStatusResponse.banType && this.banTime == appealStatusResponse.banTime && this.appealType == appealStatusResponse.appealType && C89219l.m154714a(this.popTitle, appealStatusResponse.popTitle) && C89219l.m154714a(this.popContent, appealStatusResponse.popContent) && C89219l.m154714a(this.appealUrl, appealStatusResponse.appealUrl) && C89219l.m154714a(this.buttonList, appealStatusResponse.buttonList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((m79635xf63e2322(this.status) * 31) + m79635xf63e2322(this.banType)) * 31) + m79636xf63e2322(this.banTime)) * 31) + m79635xf63e2322(this.appealType)) * 31;
        String str = this.popTitle;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.popContent;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appealUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<C39251l> list = this.buttonList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AppealStatusResponse(status=" + this.status + ", banType=" + this.banType + ", banTime=" + this.banTime + ", appealType=" + this.appealType + ", popTitle=" + this.popTitle + ", popContent=" + this.popContent + ", appealUrl=" + this.appealUrl + ", buttonList=" + this.buttonList + ")";
    }

    public final int getAppealType() {
        return this.appealType;
    }

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public final long getBanTime() {
        return this.banTime;
    }

    public final int getBanType() {
        return this.banType;
    }

    public final List<C39251l> getButtonList() {
        return this.buttonList;
    }

    public final String getPopContent() {
        return this.popContent;
    }

    public final String getPopTitle() {
        return this.popTitle;
    }

    public final int getStatus() {
        return this.status;
    }

    public AppealStatusResponse(int i, int i2, long j, int i3, String str, String str2, String str3, List<C39251l> list) {
        this.status = i;
        this.banType = i2;
        this.banTime = j;
        this.appealType = i3;
        this.popTitle = str;
        this.popContent = str2;
        this.appealUrl = str3;
        this.buttonList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppealStatusResponse(int i, int i2, long j, int i3, String str, String str2, String str3, List list, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? 0 : j, (i4 & 8) == 0 ? i3 : -1, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : str3, (i4 & 128) == 0 ? list : null);
    }
}
