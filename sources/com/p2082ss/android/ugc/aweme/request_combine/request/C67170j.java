package com.p2082ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.p2082ss.android.ugc.aweme.simkit.model.p3912a.C74675a;
import com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p2082ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80680f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.j */
public final class C67170j extends AbstractC67146b {

    /* renamed from: a */
    private VideoBitRateABManager f150589a;

    /* renamed from: b */
    private C67116a f150590b;

    static {
        Covode.recordClassIndex(78773);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150590b;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        if (C80680f.m139906a()) {
            return "/aweme/v1/rate/settings/";
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        this.f150589a = VideoBitRateABManager.f180314a;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        RateSettingCombineModel rateSettingCombineModel;
        RateSettingsResponse<C74675a> rateSetting;
        SettingCombineDataModel data;
        this.f150589a = VideoBitRateABManager.f180314a;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            rateSettingCombineModel = null;
        } else {
            rateSettingCombineModel = data.getRateSettingCombineModel();
        }
        if (!(rateSettingCombineModel == null || (rateSetting = rateSettingCombineModel.getRateSetting()) == null || rateSetting.status_code != 0)) {
            this.f150590b = rateSettingCombineModel;
            if (rateSettingCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
