package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.RecommendFriendsConfig */
public final class RecommendFriendsConfig {
    private final Boolean collapse;
    private final boolean enable;
    @AbstractC27891c(mo46611a = "message_max_show_count")
    private final Integer messageMaxShowCount;
    @AbstractC27891c(mo46611a = "module_auto_hidden_days")
    private final Integer moduleAutoHiddenDays;
    @AbstractC27891c(mo46611a = "module_delete_hidden_days")
    private final Integer moduleDeleteHiddenDays;
    @AbstractC27891c(mo46611a = "module_location")
    private final Integer moduleLocation;
    @AbstractC27891c(mo46611a = "module_max_exposure_count")
    private final Integer moduleMaxExposureCount;
    @AbstractC27891c(mo46611a = "scroll_to")
    private final Integer scrollTo;

    static {
        Covode.recordClassIndex(55276);
    }

    public RecommendFriendsConfig() {
        this(false, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ RecommendFriendsConfig copy$default(RecommendFriendsConfig recommendFriendsConfig, boolean z, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recommendFriendsConfig.enable;
        }
        if ((i & 2) != 0) {
            bool = recommendFriendsConfig.collapse;
        }
        if ((i & 4) != 0) {
            num = recommendFriendsConfig.moduleLocation;
        }
        if ((i & 8) != 0) {
            num2 = recommendFriendsConfig.scrollTo;
        }
        if ((i & 16) != 0) {
            num3 = recommendFriendsConfig.messageMaxShowCount;
        }
        if ((i & 32) != 0) {
            num4 = recommendFriendsConfig.moduleMaxExposureCount;
        }
        if ((i & 64) != 0) {
            num5 = recommendFriendsConfig.moduleAutoHiddenDays;
        }
        if ((i & 128) != 0) {
            num6 = recommendFriendsConfig.moduleDeleteHiddenDays;
        }
        return recommendFriendsConfig.copy(z, bool, num, num2, num3, num4, num5, num6);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final Boolean component2() {
        return this.collapse;
    }

    public final Integer component3() {
        return this.moduleLocation;
    }

    public final Integer component4() {
        return this.scrollTo;
    }

    public final Integer component5() {
        return this.messageMaxShowCount;
    }

    public final Integer component6() {
        return this.moduleMaxExposureCount;
    }

    public final Integer component7() {
        return this.moduleAutoHiddenDays;
    }

    public final Integer component8() {
        return this.moduleDeleteHiddenDays;
    }

    public final RecommendFriendsConfig copy(boolean z, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        return new RecommendFriendsConfig(z, bool, num, num2, num3, num4, num5, num6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendFriendsConfig)) {
            return false;
        }
        RecommendFriendsConfig recommendFriendsConfig = (RecommendFriendsConfig) obj;
        return this.enable == recommendFriendsConfig.enable && C89219l.m154714a(this.collapse, recommendFriendsConfig.collapse) && C89219l.m154714a(this.moduleLocation, recommendFriendsConfig.moduleLocation) && C89219l.m154714a(this.scrollTo, recommendFriendsConfig.scrollTo) && C89219l.m154714a(this.messageMaxShowCount, recommendFriendsConfig.messageMaxShowCount) && C89219l.m154714a(this.moduleMaxExposureCount, recommendFriendsConfig.moduleMaxExposureCount) && C89219l.m154714a(this.moduleAutoHiddenDays, recommendFriendsConfig.moduleAutoHiddenDays) && C89219l.m154714a(this.moduleDeleteHiddenDays, recommendFriendsConfig.moduleDeleteHiddenDays);
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        Boolean bool = this.collapse;
        int i5 = 0;
        int hashCode = (i4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.moduleLocation;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.scrollTo;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.messageMaxShowCount;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.moduleMaxExposureCount;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.moduleAutoHiddenDays;
        int hashCode6 = (hashCode5 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.moduleDeleteHiddenDays;
        if (num6 != null) {
            i5 = num6.hashCode();
        }
        return hashCode6 + i5;
    }

    public final String toString() {
        return "RecommendFriendsConfig(enable=" + this.enable + ", collapse=" + this.collapse + ", moduleLocation=" + this.moduleLocation + ", scrollTo=" + this.scrollTo + ", messageMaxShowCount=" + this.messageMaxShowCount + ", moduleMaxExposureCount=" + this.moduleMaxExposureCount + ", moduleAutoHiddenDays=" + this.moduleAutoHiddenDays + ", moduleDeleteHiddenDays=" + this.moduleDeleteHiddenDays + ")";
    }

    public final Boolean getCollapse() {
        return this.collapse;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final Integer getMessageMaxShowCount() {
        return this.messageMaxShowCount;
    }

    public final Integer getModuleAutoHiddenDays() {
        return this.moduleAutoHiddenDays;
    }

    public final Integer getModuleDeleteHiddenDays() {
        return this.moduleDeleteHiddenDays;
    }

    public final Integer getModuleLocation() {
        return this.moduleLocation;
    }

    public final Integer getModuleMaxExposureCount() {
        return this.moduleMaxExposureCount;
    }

    public final Integer getScrollTo() {
        return this.scrollTo;
    }

    public RecommendFriendsConfig(boolean z, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.enable = z;
        this.collapse = bool;
        this.moduleLocation = num;
        this.scrollTo = num2;
        this.messageMaxShowCount = num3;
        this.moduleMaxExposureCount = num4;
        this.moduleAutoHiddenDays = num5;
        this.moduleDeleteHiddenDays = num6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendFriendsConfig(boolean z, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : bool, (i & 4) != 0 ? 0 : num, (i & 8) == 0 ? num2 : 0, (i & 16) != 0 ? -1 : num3, (i & 32) != 0 ? -1 : num4, (i & 64) != 0 ? -1 : num5, (i & 128) != 0 ? -1 : num6);
    }
}
