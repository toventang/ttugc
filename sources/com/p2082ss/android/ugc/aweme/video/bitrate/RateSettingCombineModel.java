package com.p2082ss.android.ugc.aweme.video.bitrate;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.p2082ss.android.ugc.aweme.simkit.model.p3912a.C74675a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel */
public final class RateSettingCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private RateSettingsResponse<C74675a> rateSetting;

    static {
        Covode.recordClassIndex(93992);
    }

    public final RateSettingsResponse<C74675a> getRateSetting() {
        return this.rateSetting;
    }

    public final void setRateSetting(RateSettingsResponse<C74675a> rateSettingsResponse) {
        C89219l.m154721d(rateSettingsResponse, "");
        this.rateSetting = rateSettingsResponse;
    }

    public RateSettingCombineModel(RateSettingsResponse<C74675a> rateSettingsResponse) {
        C89219l.m154721d(rateSettingsResponse, "");
        this.rateSetting = rateSettingsResponse;
    }
}
