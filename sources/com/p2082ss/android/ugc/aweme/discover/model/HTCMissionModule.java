package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HTCMissionModule */
public final class HTCMissionModule implements Serializable {
    @AbstractC27891c(mo46611a = "is_eligible_user")
    private final Boolean isEligibleUser;
    @AbstractC27891c(mo46611a = "mission_id")
    private final String missionId;
    @AbstractC27891c(mo46611a = "mission_stage")
    private final Integer missionLabelType;
    @AbstractC27891c(mo46611a = "open_url")
    private final String openUrl;
    @AbstractC27891c(mo46611a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(50456);
    }

    public HTCMissionModule() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ HTCMissionModule copy$default(HTCMissionModule hTCMissionModule, String str, String str2, String str3, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hTCMissionModule.missionId;
        }
        if ((i & 2) != 0) {
            str2 = hTCMissionModule.text;
        }
        if ((i & 4) != 0) {
            str3 = hTCMissionModule.openUrl;
        }
        if ((i & 8) != 0) {
            bool = hTCMissionModule.isEligibleUser;
        }
        if ((i & 16) != 0) {
            num = hTCMissionModule.missionLabelType;
        }
        return hTCMissionModule.copy(str, str2, str3, bool, num);
    }

    public final String component1() {
        return this.missionId;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.openUrl;
    }

    public final Boolean component4() {
        return this.isEligibleUser;
    }

    public final Integer component5() {
        return this.missionLabelType;
    }

    public final HTCMissionModule copy(String str, String str2, String str3, Boolean bool, Integer num) {
        return new HTCMissionModule(str, str2, str3, bool, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTCMissionModule)) {
            return false;
        }
        HTCMissionModule hTCMissionModule = (HTCMissionModule) obj;
        return C89219l.m154714a(this.missionId, hTCMissionModule.missionId) && C89219l.m154714a(this.text, hTCMissionModule.text) && C89219l.m154714a(this.openUrl, hTCMissionModule.openUrl) && C89219l.m154714a(this.isEligibleUser, hTCMissionModule.isEligibleUser) && C89219l.m154714a(this.missionLabelType, hTCMissionModule.missionLabelType);
    }

    public final int hashCode() {
        String str = this.missionId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.openUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.isEligibleUser;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.missionLabelType;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "HTCMissionModule(missionId=" + this.missionId + ", text=" + this.text + ", openUrl=" + this.openUrl + ", isEligibleUser=" + this.isEligibleUser + ", missionLabelType=" + this.missionLabelType + ")";
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public final Integer getMissionLabelType() {
        return this.missionLabelType;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final Boolean isEligibleUser() {
        return this.isEligibleUser;
    }

    public HTCMissionModule(String str, String str2, String str3, Boolean bool, Integer num) {
        this.missionId = str;
        this.text = str2;
        this.openUrl = str3;
        this.isEligibleUser = bool;
        this.missionLabelType = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HTCMissionModule(String str, String str2, String str3, Boolean bool, Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : bool, (i & 16) == 0 ? num : null);
    }
}
