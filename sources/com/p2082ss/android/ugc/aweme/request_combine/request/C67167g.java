package com.p2082ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16083j;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58452y;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.AwemeSettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3679b.C67148b;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.g */
public final class C67167g extends AbstractC67146b {

    /* renamed from: a */
    private C67116a f150586a;

    static {
        Covode.recordClassIndex(78770);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        return "/aweme/v1/settings/";
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150586a;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final Map<String, String> mo106077a(Context context) {
        String str;
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        HashMap hashMap = new HashMap();
        if (C67128a.m118792a(context, "phone") != null) {
            Object a = C67128a.m118792a(context, "phone");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            if (((TelephonyManager) a).getPhoneType() == 2) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_cdma", str);
        }
        String a2 = C58452y.m107035a();
        if (a2 != null) {
            hashMap.put("cpu_model", a2);
        }
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo95701b((AbstractC58259r) new C67148b());
        C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = true, is_v3 = " + C16083j.m29874a().mo25538c() + ", is_v3_api = false");
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        AwemeSettingCombineModel awemeSettingCombineModel;
        Integer num;
        AbstractC28019l awemeSetting;
        AbstractC28019l c;
        String c2;
        AbstractC28019l awemeSetting2;
        AbstractC28019l c3;
        SettingCombineDataModel data;
        String str = null;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            awemeSettingCombineModel = null;
        } else {
            awemeSettingCombineModel = data.getAwemeSetting();
        }
        if (awemeSettingCombineModel == null || (awemeSetting2 = awemeSettingCombineModel.getAwemeSetting()) == null || !(awemeSetting2 instanceof C28022o)) {
            num = -1;
        } else {
            AbstractC28019l awemeSetting3 = awemeSettingCombineModel.getAwemeSetting();
            if (awemeSetting3 == null || (c3 = awemeSetting3.mo46789j().mo46803c("status_code")) == null) {
                num = null;
            } else {
                num = Integer.valueOf(c3.mo46694g());
            }
        }
        if (num == null || num.intValue() != 0) {
            return false;
        }
        this.f150586a = awemeSettingCombineModel;
        if (awemeSettingCombineModel != null && awemeSettingCombineModel.httpCode == 200) {
            AbstractC68041bz.f152407a.mo108659a((Object) awemeSettingCombineModel.getAwemeSetting(), true);
        }
        C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_finished, success = true, is_combine = true, is_v3 = " + C16083j.m29874a().mo25538c() + ", is_v3_api = false");
        String str2 = "";
        if (awemeSettingCombineModel != null) {
            try {
                AbstractC28019l awemeSetting4 = awemeSettingCombineModel.getAwemeSetting();
                if (!(awemeSetting4 == null || (c = awemeSetting4.mo46789j().mo46803c("creator_fund_setting_entry_schema")) == null || (c2 = c.mo46689c()) == null)) {
                    str2 = c2;
                }
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
        StringBuilder sb = new StringBuilder("CombinedAwemeSettingsRequest /aweme/v1/settings/ awemeSetting = ");
        if (!(awemeSettingCombineModel == null || (awemeSetting = awemeSettingCombineModel.getAwemeSetting()) == null)) {
            str = awemeSetting.mo46789j().toString();
        }
        C51423a.m95787a(sb.append(str).toString());
        C89379q.m157068constructorimpl(C89391z.f203057a);
        C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_success, content = ".concat(String.valueOf(str2)));
        if (awemeSettingCombineModel == null || awemeSettingCombineModel.httpCode != 200) {
            return false;
        }
        return true;
    }
}
