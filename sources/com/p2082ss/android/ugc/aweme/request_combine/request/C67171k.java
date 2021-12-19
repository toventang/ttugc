package com.p2082ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.ShareSettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67135d;
import com.p2082ss.android.ugc.aweme.setting.C68056ch;
import com.p2082ss.android.ugc.aweme.setting.model.C68188p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.k */
public final class C67171k extends AbstractC67146b {

    /* renamed from: a */
    private C67116a f150591a;

    static {
        Covode.recordClassIndex(78774);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        return "/aweme/v2/platform/share/settings/";
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150591a;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo95701b((AbstractC58259r) new C67135d());
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        ShareSettingCombineModel shareSettingCombineModel;
        C68188p shareSetting;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            shareSettingCombineModel = null;
        } else {
            shareSettingCombineModel = data.getShareSettingCombineModel();
        }
        if (!(shareSettingCombineModel == null || (shareSetting = shareSettingCombineModel.getShareSetting()) == null || shareSetting.status_code != 0)) {
            this.f150591a = shareSettingCombineModel;
            if (shareSettingCombineModel.httpCode == 200) {
                C68056ch.m120361a().mo108674a((Object) shareSettingCombineModel.getShareSetting());
            }
            if (shareSettingCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
