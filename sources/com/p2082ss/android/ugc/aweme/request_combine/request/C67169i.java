package com.p2082ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.PortraitCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.i */
public final class C67169i extends AbstractC67146b {

    /* renamed from: a */
    private C67116a f150588a;

    static {
        Covode.recordClassIndex(78772);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        return "/tiktok/v1/efficiency_portrait/";
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150588a;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        ServerPortraitCollections.m118773d();
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final Map<String, String> mo106077a(Context context) {
        C89219l.m154721d(context, "");
        HashMap hashMap = new HashMap();
        hashMap.put("group_list", "bitrate_selection");
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        PortraitCombineModel portraitCombineModel;
        SettingCombineDataModel data;
        C28022o oVar = null;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            portraitCombineModel = null;
        } else {
            portraitCombineModel = data.getPortraitCombineModel();
            if (portraitCombineModel != null) {
                oVar = portraitCombineModel.getPortraitData();
            }
        }
        if (oVar == null) {
            return false;
        }
        this.f150588a = portraitCombineModel;
        ServerPortraitCollections.m118773d();
        if (portraitCombineModel == null || portraitCombineModel.httpCode != 200) {
            return false;
        }
        return true;
    }
}
