package com.p2082ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.ComplianceSettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67129a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.d */
public final class C67163d extends AbstractC67146b {

    /* renamed from: a */
    private final String f150581a = "/aweme/v1/compliance/settings/";

    /* renamed from: b */
    private C67116a f150582b;

    static {
        Covode.recordClassIndex(78766);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        return this.f150581a;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150582b;
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.d$a */
    static final class CallableC67164a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ComplianceSettingCombineModel f150583a;

        static {
            Covode.recordClassIndex(78767);
        }

        CallableC67164a(ComplianceSettingCombineModel complianceSettingCombineModel) {
            this.f150583a = complianceSettingCombineModel;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            IComplianceSettingsService j = C39223a.m79596j();
            ComplianceSetting complianceSetting = this.f150583a.getComplianceSetting();
            if (complianceSetting == null) {
                C89219l.m154715b();
            }
            j.mo68699a(complianceSetting);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo95701b((AbstractC58259r) new C67129a(EnumC58147aa.IDLE));
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        ComplianceSettingCombineModel complianceSettingCombineModel;
        ComplianceSetting complianceSetting;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            complianceSettingCombineModel = null;
        } else {
            complianceSettingCombineModel = data.getComplianceSetting();
        }
        if (!(complianceSettingCombineModel == null || (complianceSetting = complianceSettingCombineModel.getComplianceSetting()) == null || complianceSetting.status_code != 0)) {
            this.f150582b = complianceSettingCombineModel;
            if (complianceSettingCombineModel.getComplianceSetting() != null) {
                C1731i.m5640b(new CallableC67164a(complianceSettingCombineModel), C1731i.f5562a);
            }
            C67116a aVar = this.f150582b;
            if (aVar == null || aVar.httpCode != 200) {
                return false;
            }
            return true;
        }
        return false;
    }
}
