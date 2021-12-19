package com.p2082ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.AbTestCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3679b.C67147a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.f */
public final class C67166f extends AbstractC67146b {

    /* renamed from: a */
    private C67116a f150585a;

    static {
        Covode.recordClassIndex(78769);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        return "/aweme/v1/abtest/param/";
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150585a;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo95701b((AbstractC58259r) new C67147a());
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        AbTestCombineModel abTestCombineModel;
        AbstractC28019l abTestResponse;
        AbstractC28019l c;
        SettingCombineDataModel data;
        Integer num = null;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            abTestCombineModel = null;
        } else {
            abTestCombineModel = data.getAbTestCombineModel();
        }
        if (abTestCombineModel == null || (abTestResponse = abTestCombineModel.getAbTestResponse()) == null || !(abTestResponse instanceof C28022o)) {
            num = -1;
        } else {
            AbstractC28019l abTestResponse2 = abTestCombineModel.getAbTestResponse();
            if (!(abTestResponse2 == null || (c = abTestResponse2.mo46789j().mo46803c("status_code")) == null)) {
                num = Integer.valueOf(c.mo46694g());
            }
        }
        if (num == null || num.intValue() != 0) {
            return false;
        }
        this.f150585a = abTestCombineModel;
        if (abTestCombineModel != null) {
            if (abTestCombineModel.httpCode == 200) {
                AbTestManagerImpl.m104980b().mo95587a(abTestCombineModel.getAbTestResponse());
            }
            if (abTestCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
