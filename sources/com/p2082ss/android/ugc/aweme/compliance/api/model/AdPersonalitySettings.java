package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings */
public final class AdPersonalitySettings implements Serializable {
    @AbstractC27891c(mo46611a = "popup_business")
    private final String business;
    @AbstractC27891c(mo46611a = "pop_up_copywriting")
    private final CopyWritingInfo copyWriting;
    @AbstractC27891c(mo46611a = "description")
    private final String description;
    @AbstractC27891c(mo46611a = "is_follow_sys_config")
    private final Boolean isFollowSystemConfig;
    @AbstractC27891c(mo46611a = "is_show_settings")
    private final Boolean isShowSettings;
    @AbstractC27891c(mo46611a = "limit_ad_tracking")
    private final Boolean lat;
    @AbstractC27891c(mo46611a = "mode")
    private final Integer mode;
    @AbstractC27891c(mo46611a = "need_pop_up")
    private final Boolean needPopUp;
    @AbstractC27891c(mo46611a = "new_pers_ad_settings")
    private final NewPersAdSettings newPersAdSettings;
    @AbstractC27891c(mo46611a = "pers_ad_main_mode_title")
    private final String paMainTitle;
    @AbstractC27891c(mo46611a = "pers_ad_data_received_partner_mode")
    private final Integer partnerAdMode;
    @AbstractC27891c(mo46611a = "personalization_data_text")
    private final PersonalizationDataText personalizationDataText;
    @AbstractC27891c(mo46611a = "popup_check_text_style")
    private final Integer promptStyle;
    @AbstractC27891c(mo46611a = "setting_type")
    private final Integer settingType;
    @AbstractC27891c(mo46611a = "pers_ad_show_interest_label")
    private final Boolean showInterestLabel;
    @AbstractC27891c(mo46611a = "pers_ad_show_data_received_partner")
    private final Boolean showPartnerAd;
    @AbstractC27891c(mo46611a = "pers_ad_show_third_party_networks")
    private final Boolean showThirdAd;
    @AbstractC27891c(mo46611a = "pers_ad_show_third_part_measurement")
    private final Boolean showThirdPartyMeasurement;
    @AbstractC27891c(mo46611a = "pers_ad_third_party_networks_mode")
    private final Integer thirdAdMode;

    static {
        Covode.recordClassIndex(46876);
    }

    public AdPersonalitySettings() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ AdPersonalitySettings copy$default(AdPersonalitySettings adPersonalitySettings, Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str3, PersonalizationDataText personalizationDataText2, Integer num4, NewPersAdSettings newPersAdSettings2, Integer num5, int i, Object obj) {
        Boolean bool9 = bool;
        Integer num6 = num;
        Integer num7 = num2;
        Boolean bool10 = bool3;
        Boolean bool11 = bool2;
        String str4 = str;
        String str5 = str2;
        CopyWritingInfo copyWritingInfo2 = copyWritingInfo;
        Boolean bool12 = bool8;
        Boolean bool13 = bool7;
        Integer num8 = num3;
        Boolean bool14 = bool4;
        Boolean bool15 = bool5;
        Boolean bool16 = bool6;
        String str6 = str3;
        Integer num9 = num5;
        PersonalizationDataText personalizationDataText3 = personalizationDataText2;
        Integer num10 = num4;
        NewPersAdSettings newPersAdSettings3 = newPersAdSettings2;
        if ((i & 1) != 0) {
            num6 = adPersonalitySettings.mode;
        }
        if ((i & 2) != 0) {
            bool9 = adPersonalitySettings.needPopUp;
        }
        if ((i & 4) != 0) {
            bool11 = adPersonalitySettings.isFollowSystemConfig;
        }
        if ((i & 8) != 0) {
            str4 = adPersonalitySettings.description;
        }
        if ((i & 16) != 0) {
            str5 = adPersonalitySettings.paMainTitle;
        }
        if ((i & 32) != 0) {
            copyWritingInfo2 = adPersonalitySettings.copyWriting;
        }
        if ((i & 64) != 0) {
            bool10 = adPersonalitySettings.isShowSettings;
        }
        if ((i & 128) != 0) {
            num7 = adPersonalitySettings.thirdAdMode;
        }
        if ((i & 256) != 0) {
            num8 = adPersonalitySettings.partnerAdMode;
        }
        if ((i & 512) != 0) {
            bool14 = adPersonalitySettings.showThirdAd;
        }
        if ((i & 1024) != 0) {
            bool15 = adPersonalitySettings.showPartnerAd;
        }
        if ((i & 2048) != 0) {
            bool16 = adPersonalitySettings.showInterestLabel;
        }
        if ((i & 4096) != 0) {
            bool13 = adPersonalitySettings.showThirdPartyMeasurement;
        }
        if ((i & 8192) != 0) {
            bool12 = adPersonalitySettings.lat;
        }
        if ((i & 16384) != 0) {
            str6 = adPersonalitySettings.business;
        }
        if ((32768 & i) != 0) {
            personalizationDataText3 = adPersonalitySettings.personalizationDataText;
        }
        if ((65536 & i) != 0) {
            num10 = adPersonalitySettings.settingType;
        }
        if ((131072 & i) != 0) {
            newPersAdSettings3 = adPersonalitySettings.newPersAdSettings;
        }
        if ((i & 262144) != 0) {
            num9 = adPersonalitySettings.promptStyle;
        }
        return adPersonalitySettings.copy(num6, bool9, bool11, str4, str5, copyWritingInfo2, bool10, num7, num8, bool14, bool15, bool16, bool13, bool12, str6, personalizationDataText3, num10, newPersAdSettings3, num9);
    }

    public final Integer component1() {
        return this.mode;
    }

    public final Boolean component10() {
        return this.showThirdAd;
    }

    public final Boolean component11() {
        return this.showPartnerAd;
    }

    public final Boolean component12() {
        return this.showInterestLabel;
    }

    public final Boolean component13() {
        return this.showThirdPartyMeasurement;
    }

    public final Boolean component14() {
        return this.lat;
    }

    public final String component15() {
        return this.business;
    }

    public final PersonalizationDataText component16() {
        return this.personalizationDataText;
    }

    public final Integer component17() {
        return this.settingType;
    }

    public final NewPersAdSettings component18() {
        return this.newPersAdSettings;
    }

    public final Integer component19() {
        return this.promptStyle;
    }

    public final Boolean component2() {
        return this.needPopUp;
    }

    public final Boolean component3() {
        return this.isFollowSystemConfig;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.paMainTitle;
    }

    public final CopyWritingInfo component6() {
        return this.copyWriting;
    }

    public final Boolean component7() {
        return this.isShowSettings;
    }

    public final Integer component8() {
        return this.thirdAdMode;
    }

    public final Integer component9() {
        return this.partnerAdMode;
    }

    public final AdPersonalitySettings copy(Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str3, PersonalizationDataText personalizationDataText2, Integer num4, NewPersAdSettings newPersAdSettings2, Integer num5) {
        return new AdPersonalitySettings(num, bool, bool2, str, str2, copyWritingInfo, bool3, num2, num3, bool4, bool5, bool6, bool7, bool8, str3, personalizationDataText2, num4, newPersAdSettings2, num5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdPersonalitySettings)) {
            return false;
        }
        AdPersonalitySettings adPersonalitySettings = (AdPersonalitySettings) obj;
        return C89219l.m154714a(this.mode, adPersonalitySettings.mode) && C89219l.m154714a(this.needPopUp, adPersonalitySettings.needPopUp) && C89219l.m154714a(this.isFollowSystemConfig, adPersonalitySettings.isFollowSystemConfig) && C89219l.m154714a(this.description, adPersonalitySettings.description) && C89219l.m154714a(this.paMainTitle, adPersonalitySettings.paMainTitle) && C89219l.m154714a(this.copyWriting, adPersonalitySettings.copyWriting) && C89219l.m154714a(this.isShowSettings, adPersonalitySettings.isShowSettings) && C89219l.m154714a(this.thirdAdMode, adPersonalitySettings.thirdAdMode) && C89219l.m154714a(this.partnerAdMode, adPersonalitySettings.partnerAdMode) && C89219l.m154714a(this.showThirdAd, adPersonalitySettings.showThirdAd) && C89219l.m154714a(this.showPartnerAd, adPersonalitySettings.showPartnerAd) && C89219l.m154714a(this.showInterestLabel, adPersonalitySettings.showInterestLabel) && C89219l.m154714a(this.showThirdPartyMeasurement, adPersonalitySettings.showThirdPartyMeasurement) && C89219l.m154714a(this.lat, adPersonalitySettings.lat) && C89219l.m154714a(this.business, adPersonalitySettings.business) && C89219l.m154714a(this.personalizationDataText, adPersonalitySettings.personalizationDataText) && C89219l.m154714a(this.settingType, adPersonalitySettings.settingType) && C89219l.m154714a(this.newPersAdSettings, adPersonalitySettings.newPersAdSettings) && C89219l.m154714a(this.promptStyle, adPersonalitySettings.promptStyle);
    }

    public final int hashCode() {
        Integer num = this.mode;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.needPopUp;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isFollowSystemConfig;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.description;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.paMainTitle;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        CopyWritingInfo copyWritingInfo = this.copyWriting;
        int hashCode6 = (hashCode5 + (copyWritingInfo != null ? copyWritingInfo.hashCode() : 0)) * 31;
        Boolean bool3 = this.isShowSettings;
        int hashCode7 = (hashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Integer num2 = this.thirdAdMode;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.partnerAdMode;
        int hashCode9 = (hashCode8 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool4 = this.showThirdAd;
        int hashCode10 = (hashCode9 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.showPartnerAd;
        int hashCode11 = (hashCode10 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.showInterestLabel;
        int hashCode12 = (hashCode11 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Boolean bool7 = this.showThirdPartyMeasurement;
        int hashCode13 = (hashCode12 + (bool7 != null ? bool7.hashCode() : 0)) * 31;
        Boolean bool8 = this.lat;
        int hashCode14 = (hashCode13 + (bool8 != null ? bool8.hashCode() : 0)) * 31;
        String str3 = this.business;
        int hashCode15 = (hashCode14 + (str3 != null ? str3.hashCode() : 0)) * 31;
        PersonalizationDataText personalizationDataText2 = this.personalizationDataText;
        int hashCode16 = (hashCode15 + (personalizationDataText2 != null ? personalizationDataText2.hashCode() : 0)) * 31;
        Integer num4 = this.settingType;
        int hashCode17 = (hashCode16 + (num4 != null ? num4.hashCode() : 0)) * 31;
        NewPersAdSettings newPersAdSettings2 = this.newPersAdSettings;
        int hashCode18 = (hashCode17 + (newPersAdSettings2 != null ? newPersAdSettings2.hashCode() : 0)) * 31;
        Integer num5 = this.promptStyle;
        if (num5 != null) {
            i = num5.hashCode();
        }
        return hashCode18 + i;
    }

    public final String toString() {
        return "AdPersonalitySettings(mode=" + this.mode + ", needPopUp=" + this.needPopUp + ", isFollowSystemConfig=" + this.isFollowSystemConfig + ", description=" + this.description + ", paMainTitle=" + this.paMainTitle + ", copyWriting=" + this.copyWriting + ", isShowSettings=" + this.isShowSettings + ", thirdAdMode=" + this.thirdAdMode + ", partnerAdMode=" + this.partnerAdMode + ", showThirdAd=" + this.showThirdAd + ", showPartnerAd=" + this.showPartnerAd + ", showInterestLabel=" + this.showInterestLabel + ", showThirdPartyMeasurement=" + this.showThirdPartyMeasurement + ", lat=" + this.lat + ", business=" + this.business + ", personalizationDataText=" + this.personalizationDataText + ", settingType=" + this.settingType + ", newPersAdSettings=" + this.newPersAdSettings + ", promptStyle=" + this.promptStyle + ")";
    }

    public final String getBusiness() {
        return this.business;
    }

    public final CopyWritingInfo getCopyWriting() {
        return this.copyWriting;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getLat() {
        return this.lat;
    }

    public final Integer getMode() {
        return this.mode;
    }

    public final Boolean getNeedPopUp() {
        return this.needPopUp;
    }

    public final NewPersAdSettings getNewPersAdSettings() {
        return this.newPersAdSettings;
    }

    public final String getPaMainTitle() {
        return this.paMainTitle;
    }

    public final Integer getPartnerAdMode() {
        return this.partnerAdMode;
    }

    public final PersonalizationDataText getPersonalizationDataText() {
        return this.personalizationDataText;
    }

    public final Integer getPromptStyle() {
        return this.promptStyle;
    }

    public final Integer getSettingType() {
        return this.settingType;
    }

    public final Boolean getShowInterestLabel() {
        return this.showInterestLabel;
    }

    public final Boolean getShowPartnerAd() {
        return this.showPartnerAd;
    }

    public final Boolean getShowThirdAd() {
        return this.showThirdAd;
    }

    public final Boolean getShowThirdPartyMeasurement() {
        return this.showThirdPartyMeasurement;
    }

    public final Integer getThirdAdMode() {
        return this.thirdAdMode;
    }

    public final Boolean isFollowSystemConfig() {
        return this.isFollowSystemConfig;
    }

    public final Boolean isShowSettings() {
        return this.isShowSettings;
    }

    public AdPersonalitySettings(Integer num, Boolean bool, Boolean bool2, String str, String str2, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str3, PersonalizationDataText personalizationDataText2, Integer num4, NewPersAdSettings newPersAdSettings2, Integer num5) {
        this.mode = num;
        this.needPopUp = bool;
        this.isFollowSystemConfig = bool2;
        this.description = str;
        this.paMainTitle = str2;
        this.copyWriting = copyWritingInfo;
        this.isShowSettings = bool3;
        this.thirdAdMode = num2;
        this.partnerAdMode = num3;
        this.showThirdAd = bool4;
        this.showPartnerAd = bool5;
        this.showInterestLabel = bool6;
        this.showThirdPartyMeasurement = bool7;
        this.lat = bool8;
        this.business = str3;
        this.personalizationDataText = personalizationDataText2;
        this.settingType = num4;
        this.newPersAdSettings = newPersAdSettings2;
        this.promptStyle = num5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AdPersonalitySettings(java.lang.Integer r23, java.lang.Boolean r24, java.lang.Boolean r25, java.lang.String r26, java.lang.String r27, com.p2082ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo r28, java.lang.Boolean r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Boolean r32, java.lang.Boolean r33, java.lang.Boolean r34, java.lang.Boolean r35, java.lang.Boolean r36, java.lang.String r37, com.p2082ss.android.ugc.aweme.compliance.api.model.PersonalizationDataText r38, java.lang.Integer r39, com.p2082ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings r40, java.lang.Integer r41, int r42, p4600h.p4611f.p4613b.C89214g r43) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.PersonalizationDataText, java.lang.Integer, com.ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings, java.lang.Integer, int, h.f.b.g):void");
    }
}
