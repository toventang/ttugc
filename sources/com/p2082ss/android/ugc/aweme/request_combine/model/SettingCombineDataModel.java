package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.request_combine.PortraitCombineModel;
import com.p2082ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel */
public final class SettingCombineDataModel {
    @AbstractC27891c(mo46611a = "/aweme/v1/abtest/param/")
    private AbTestCombineModel abTestCombineModel;
    @AbstractC27891c(mo46611a = "/aweme/v2/activity/settings/")
    private ActivitySettingCombineModel activitySetting;
    @AbstractC27891c(mo46611a = "/aweme/v1/settings/")
    private AwemeSettingCombineModel awemeSetting;
    @AbstractC27891c(mo46611a = "/aweme/v1/commerce/settings/")
    private CommerceSettingCombineModel commerceSettingCombineModel;
    @AbstractC27891c(mo46611a = "/aweme/v1/compliance/settings/")
    private ComplianceSettingCombineModel complianceSetting;
    @AbstractC27891c(mo46611a = "/webcast/setting/")
    private LiveSettingCombineModel liveSetting;
    @AbstractC27891c(mo46611a = "/aweme/v1/notice/count/")
    private NoticeCountCombineModel noticeCountModel;
    @AbstractC27891c(mo46611a = "/tiktok/v1/efficiency_portrait/")
    private final PortraitCombineModel portraitCombineModel;
    @AbstractC27891c(mo46611a = "/aweme/v1/rate/settings/")
    private RateSettingCombineModel rateSettingCombineModel;
    @AbstractC27891c(mo46611a = "/aweme/v2/platform/share/settings/")
    private ShareSettingCombineModel shareSettingCombineModel;
    @AbstractC27891c(mo46611a = "/service/settings/v3/")
    private UnifiedSettingCombineModel unifiedSetting;
    @AbstractC27891c(mo46611a = "/aweme/v1/user/settings/")
    private UserSettingCombineModel userSettingCombineModel;

    static {
        Covode.recordClassIndex(78724);
    }

    public static /* synthetic */ SettingCombineDataModel copy$default(SettingCombineDataModel settingCombineDataModel, UnifiedSettingCombineModel unifiedSettingCombineModel, AwemeSettingCombineModel awemeSettingCombineModel, UserSettingCombineModel userSettingCombineModel2, CommerceSettingCombineModel commerceSettingCombineModel2, AbTestCombineModel abTestCombineModel2, ShareSettingCombineModel shareSettingCombineModel2, RateSettingCombineModel rateSettingCombineModel2, NoticeCountCombineModel noticeCountCombineModel, LiveSettingCombineModel liveSettingCombineModel, ComplianceSettingCombineModel complianceSettingCombineModel, ActivitySettingCombineModel activitySettingCombineModel, PortraitCombineModel portraitCombineModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            unifiedSettingCombineModel = settingCombineDataModel.unifiedSetting;
        }
        if ((i & 2) != 0) {
            awemeSettingCombineModel = settingCombineDataModel.awemeSetting;
        }
        if ((i & 4) != 0) {
            userSettingCombineModel2 = settingCombineDataModel.userSettingCombineModel;
        }
        if ((i & 8) != 0) {
            commerceSettingCombineModel2 = settingCombineDataModel.commerceSettingCombineModel;
        }
        if ((i & 16) != 0) {
            abTestCombineModel2 = settingCombineDataModel.abTestCombineModel;
        }
        if ((i & 32) != 0) {
            shareSettingCombineModel2 = settingCombineDataModel.shareSettingCombineModel;
        }
        if ((i & 64) != 0) {
            rateSettingCombineModel2 = settingCombineDataModel.rateSettingCombineModel;
        }
        if ((i & 128) != 0) {
            noticeCountCombineModel = settingCombineDataModel.noticeCountModel;
        }
        if ((i & 256) != 0) {
            liveSettingCombineModel = settingCombineDataModel.liveSetting;
        }
        if ((i & 512) != 0) {
            complianceSettingCombineModel = settingCombineDataModel.complianceSetting;
        }
        if ((i & 1024) != 0) {
            activitySettingCombineModel = settingCombineDataModel.activitySetting;
        }
        if ((i & 2048) != 0) {
            portraitCombineModel2 = settingCombineDataModel.portraitCombineModel;
        }
        return settingCombineDataModel.copy(unifiedSettingCombineModel, awemeSettingCombineModel, userSettingCombineModel2, commerceSettingCombineModel2, abTestCombineModel2, shareSettingCombineModel2, rateSettingCombineModel2, noticeCountCombineModel, liveSettingCombineModel, complianceSettingCombineModel, activitySettingCombineModel, portraitCombineModel2);
    }

    public final UnifiedSettingCombineModel component1() {
        return this.unifiedSetting;
    }

    public final ComplianceSettingCombineModel component10() {
        return this.complianceSetting;
    }

    public final ActivitySettingCombineModel component11() {
        return this.activitySetting;
    }

    public final PortraitCombineModel component12() {
        return this.portraitCombineModel;
    }

    public final AwemeSettingCombineModel component2() {
        return this.awemeSetting;
    }

    public final UserSettingCombineModel component3() {
        return this.userSettingCombineModel;
    }

    public final CommerceSettingCombineModel component4() {
        return this.commerceSettingCombineModel;
    }

    public final AbTestCombineModel component5() {
        return this.abTestCombineModel;
    }

    public final ShareSettingCombineModel component6() {
        return this.shareSettingCombineModel;
    }

    public final RateSettingCombineModel component7() {
        return this.rateSettingCombineModel;
    }

    public final NoticeCountCombineModel component8() {
        return this.noticeCountModel;
    }

    public final LiveSettingCombineModel component9() {
        return this.liveSetting;
    }

    public final SettingCombineDataModel copy(UnifiedSettingCombineModel unifiedSettingCombineModel, AwemeSettingCombineModel awemeSettingCombineModel, UserSettingCombineModel userSettingCombineModel2, CommerceSettingCombineModel commerceSettingCombineModel2, AbTestCombineModel abTestCombineModel2, ShareSettingCombineModel shareSettingCombineModel2, RateSettingCombineModel rateSettingCombineModel2, NoticeCountCombineModel noticeCountCombineModel, LiveSettingCombineModel liveSettingCombineModel, ComplianceSettingCombineModel complianceSettingCombineModel, ActivitySettingCombineModel activitySettingCombineModel, PortraitCombineModel portraitCombineModel2) {
        C89219l.m154721d(awemeSettingCombineModel, "");
        C89219l.m154721d(userSettingCombineModel2, "");
        C89219l.m154721d(commerceSettingCombineModel2, "");
        C89219l.m154721d(abTestCombineModel2, "");
        C89219l.m154721d(shareSettingCombineModel2, "");
        C89219l.m154721d(rateSettingCombineModel2, "");
        C89219l.m154721d(noticeCountCombineModel, "");
        C89219l.m154721d(liveSettingCombineModel, "");
        C89219l.m154721d(complianceSettingCombineModel, "");
        C89219l.m154721d(activitySettingCombineModel, "");
        C89219l.m154721d(portraitCombineModel2, "");
        return new SettingCombineDataModel(unifiedSettingCombineModel, awemeSettingCombineModel, userSettingCombineModel2, commerceSettingCombineModel2, abTestCombineModel2, shareSettingCombineModel2, rateSettingCombineModel2, noticeCountCombineModel, liveSettingCombineModel, complianceSettingCombineModel, activitySettingCombineModel, portraitCombineModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingCombineDataModel)) {
            return false;
        }
        SettingCombineDataModel settingCombineDataModel = (SettingCombineDataModel) obj;
        return C89219l.m154714a(this.unifiedSetting, settingCombineDataModel.unifiedSetting) && C89219l.m154714a(this.awemeSetting, settingCombineDataModel.awemeSetting) && C89219l.m154714a(this.userSettingCombineModel, settingCombineDataModel.userSettingCombineModel) && C89219l.m154714a(this.commerceSettingCombineModel, settingCombineDataModel.commerceSettingCombineModel) && C89219l.m154714a(this.abTestCombineModel, settingCombineDataModel.abTestCombineModel) && C89219l.m154714a(this.shareSettingCombineModel, settingCombineDataModel.shareSettingCombineModel) && C89219l.m154714a(this.rateSettingCombineModel, settingCombineDataModel.rateSettingCombineModel) && C89219l.m154714a(this.noticeCountModel, settingCombineDataModel.noticeCountModel) && C89219l.m154714a(this.liveSetting, settingCombineDataModel.liveSetting) && C89219l.m154714a(this.complianceSetting, settingCombineDataModel.complianceSetting) && C89219l.m154714a(this.activitySetting, settingCombineDataModel.activitySetting) && C89219l.m154714a(this.portraitCombineModel, settingCombineDataModel.portraitCombineModel);
    }

    public final int hashCode() {
        UnifiedSettingCombineModel unifiedSettingCombineModel = this.unifiedSetting;
        int i = 0;
        int hashCode = (unifiedSettingCombineModel != null ? unifiedSettingCombineModel.hashCode() : 0) * 31;
        AwemeSettingCombineModel awemeSettingCombineModel = this.awemeSetting;
        int hashCode2 = (hashCode + (awemeSettingCombineModel != null ? awemeSettingCombineModel.hashCode() : 0)) * 31;
        UserSettingCombineModel userSettingCombineModel2 = this.userSettingCombineModel;
        int hashCode3 = (hashCode2 + (userSettingCombineModel2 != null ? userSettingCombineModel2.hashCode() : 0)) * 31;
        CommerceSettingCombineModel commerceSettingCombineModel2 = this.commerceSettingCombineModel;
        int hashCode4 = (hashCode3 + (commerceSettingCombineModel2 != null ? commerceSettingCombineModel2.hashCode() : 0)) * 31;
        AbTestCombineModel abTestCombineModel2 = this.abTestCombineModel;
        int hashCode5 = (hashCode4 + (abTestCombineModel2 != null ? abTestCombineModel2.hashCode() : 0)) * 31;
        ShareSettingCombineModel shareSettingCombineModel2 = this.shareSettingCombineModel;
        int hashCode6 = (hashCode5 + (shareSettingCombineModel2 != null ? shareSettingCombineModel2.hashCode() : 0)) * 31;
        RateSettingCombineModel rateSettingCombineModel2 = this.rateSettingCombineModel;
        int hashCode7 = (hashCode6 + (rateSettingCombineModel2 != null ? rateSettingCombineModel2.hashCode() : 0)) * 31;
        NoticeCountCombineModel noticeCountCombineModel = this.noticeCountModel;
        int hashCode8 = (hashCode7 + (noticeCountCombineModel != null ? noticeCountCombineModel.hashCode() : 0)) * 31;
        LiveSettingCombineModel liveSettingCombineModel = this.liveSetting;
        int hashCode9 = (hashCode8 + (liveSettingCombineModel != null ? liveSettingCombineModel.hashCode() : 0)) * 31;
        ComplianceSettingCombineModel complianceSettingCombineModel = this.complianceSetting;
        int hashCode10 = (hashCode9 + (complianceSettingCombineModel != null ? complianceSettingCombineModel.hashCode() : 0)) * 31;
        ActivitySettingCombineModel activitySettingCombineModel = this.activitySetting;
        int hashCode11 = (hashCode10 + (activitySettingCombineModel != null ? activitySettingCombineModel.hashCode() : 0)) * 31;
        PortraitCombineModel portraitCombineModel2 = this.portraitCombineModel;
        if (portraitCombineModel2 != null) {
            i = portraitCombineModel2.hashCode();
        }
        return hashCode11 + i;
    }

    public final String toString() {
        return "SettingCombineDataModel(unifiedSetting=" + this.unifiedSetting + ", awemeSetting=" + this.awemeSetting + ", userSettingCombineModel=" + this.userSettingCombineModel + ", commerceSettingCombineModel=" + this.commerceSettingCombineModel + ", abTestCombineModel=" + this.abTestCombineModel + ", shareSettingCombineModel=" + this.shareSettingCombineModel + ", rateSettingCombineModel=" + this.rateSettingCombineModel + ", noticeCountModel=" + this.noticeCountModel + ", liveSetting=" + this.liveSetting + ", complianceSetting=" + this.complianceSetting + ", activitySetting=" + this.activitySetting + ", portraitCombineModel=" + this.portraitCombineModel + ")";
    }

    public final AbTestCombineModel getAbTestCombineModel() {
        return this.abTestCombineModel;
    }

    public final ActivitySettingCombineModel getActivitySetting() {
        return this.activitySetting;
    }

    public final AwemeSettingCombineModel getAwemeSetting() {
        return this.awemeSetting;
    }

    public final CommerceSettingCombineModel getCommerceSettingCombineModel() {
        return this.commerceSettingCombineModel;
    }

    public final ComplianceSettingCombineModel getComplianceSetting() {
        return this.complianceSetting;
    }

    public final LiveSettingCombineModel getLiveSetting() {
        return this.liveSetting;
    }

    public final NoticeCountCombineModel getNoticeCountModel() {
        return this.noticeCountModel;
    }

    public final PortraitCombineModel getPortraitCombineModel() {
        return this.portraitCombineModel;
    }

    public final RateSettingCombineModel getRateSettingCombineModel() {
        return this.rateSettingCombineModel;
    }

    public final ShareSettingCombineModel getShareSettingCombineModel() {
        return this.shareSettingCombineModel;
    }

    public final UnifiedSettingCombineModel getUnifiedSetting() {
        return this.unifiedSetting;
    }

    public final UserSettingCombineModel getUserSettingCombineModel() {
        return this.userSettingCombineModel;
    }

    public final void setUnifiedSetting(UnifiedSettingCombineModel unifiedSettingCombineModel) {
        this.unifiedSetting = unifiedSettingCombineModel;
    }

    public final void setAbTestCombineModel(AbTestCombineModel abTestCombineModel2) {
        C89219l.m154721d(abTestCombineModel2, "");
        this.abTestCombineModel = abTestCombineModel2;
    }

    public final void setActivitySetting(ActivitySettingCombineModel activitySettingCombineModel) {
        C89219l.m154721d(activitySettingCombineModel, "");
        this.activitySetting = activitySettingCombineModel;
    }

    public final void setAwemeSetting(AwemeSettingCombineModel awemeSettingCombineModel) {
        C89219l.m154721d(awemeSettingCombineModel, "");
        this.awemeSetting = awemeSettingCombineModel;
    }

    public final void setCommerceSettingCombineModel(CommerceSettingCombineModel commerceSettingCombineModel2) {
        C89219l.m154721d(commerceSettingCombineModel2, "");
        this.commerceSettingCombineModel = commerceSettingCombineModel2;
    }

    public final void setComplianceSetting(ComplianceSettingCombineModel complianceSettingCombineModel) {
        C89219l.m154721d(complianceSettingCombineModel, "");
        this.complianceSetting = complianceSettingCombineModel;
    }

    public final void setLiveSetting(LiveSettingCombineModel liveSettingCombineModel) {
        C89219l.m154721d(liveSettingCombineModel, "");
        this.liveSetting = liveSettingCombineModel;
    }

    public final void setNoticeCountModel(NoticeCountCombineModel noticeCountCombineModel) {
        C89219l.m154721d(noticeCountCombineModel, "");
        this.noticeCountModel = noticeCountCombineModel;
    }

    public final void setRateSettingCombineModel(RateSettingCombineModel rateSettingCombineModel2) {
        C89219l.m154721d(rateSettingCombineModel2, "");
        this.rateSettingCombineModel = rateSettingCombineModel2;
    }

    public final void setShareSettingCombineModel(ShareSettingCombineModel shareSettingCombineModel2) {
        C89219l.m154721d(shareSettingCombineModel2, "");
        this.shareSettingCombineModel = shareSettingCombineModel2;
    }

    public final void setUserSettingCombineModel(UserSettingCombineModel userSettingCombineModel2) {
        C89219l.m154721d(userSettingCombineModel2, "");
        this.userSettingCombineModel = userSettingCombineModel2;
    }

    public SettingCombineDataModel(UnifiedSettingCombineModel unifiedSettingCombineModel, AwemeSettingCombineModel awemeSettingCombineModel, UserSettingCombineModel userSettingCombineModel2, CommerceSettingCombineModel commerceSettingCombineModel2, AbTestCombineModel abTestCombineModel2, ShareSettingCombineModel shareSettingCombineModel2, RateSettingCombineModel rateSettingCombineModel2, NoticeCountCombineModel noticeCountCombineModel, LiveSettingCombineModel liveSettingCombineModel, ComplianceSettingCombineModel complianceSettingCombineModel, ActivitySettingCombineModel activitySettingCombineModel, PortraitCombineModel portraitCombineModel2) {
        C89219l.m154721d(awemeSettingCombineModel, "");
        C89219l.m154721d(userSettingCombineModel2, "");
        C89219l.m154721d(commerceSettingCombineModel2, "");
        C89219l.m154721d(abTestCombineModel2, "");
        C89219l.m154721d(shareSettingCombineModel2, "");
        C89219l.m154721d(rateSettingCombineModel2, "");
        C89219l.m154721d(noticeCountCombineModel, "");
        C89219l.m154721d(liveSettingCombineModel, "");
        C89219l.m154721d(complianceSettingCombineModel, "");
        C89219l.m154721d(activitySettingCombineModel, "");
        C89219l.m154721d(portraitCombineModel2, "");
        this.unifiedSetting = unifiedSettingCombineModel;
        this.awemeSetting = awemeSettingCombineModel;
        this.userSettingCombineModel = userSettingCombineModel2;
        this.commerceSettingCombineModel = commerceSettingCombineModel2;
        this.abTestCombineModel = abTestCombineModel2;
        this.shareSettingCombineModel = shareSettingCombineModel2;
        this.rateSettingCombineModel = rateSettingCombineModel2;
        this.noticeCountModel = noticeCountCombineModel;
        this.liveSetting = liveSettingCombineModel;
        this.complianceSetting = complianceSettingCombineModel;
        this.activitySetting = activitySettingCombineModel;
        this.portraitCombineModel = portraitCombineModel2;
    }
}
