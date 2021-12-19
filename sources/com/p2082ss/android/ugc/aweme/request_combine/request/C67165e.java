package com.p2082ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.settings.C58760c;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.LiveSettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67131b;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.e */
public final class C67165e extends AbstractC67146b {

    /* renamed from: a */
    private C67116a f150584a;

    static {
        Covode.recordClassIndex(78768);
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final String mo106076a() {
        return "/webcast/setting/";
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: b */
    public final C67116a mo106080b() {
        return this.f150584a;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final void mo106078a(C58221f.C58223b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo95701b((AbstractC58259r) new C67131b());
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final Map<String, String> mo106077a(Context context) {
        C89219l.m154721d(context, "");
        HashMap hashMap = new HashMap();
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95831e();
        ILiveOuterService s2 = LiveOuterService.m107269s();
        C89219l.m154716b(s2, "");
        s2.mo95831e().mo95858a(hashMap);
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b
    /* renamed from: a */
    public final boolean mo106079a(SettingCombineModel settingCombineModel) {
        LiveSettingCombineModel liveSettingCombineModel;
        C58760c liveSetting;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            liveSettingCombineModel = null;
        } else {
            liveSettingCombineModel = data.getLiveSetting();
        }
        if (!(liveSettingCombineModel == null || (liveSetting = liveSettingCombineModel.getLiveSetting()) == null || liveSetting.status_code != 0)) {
            this.f150584a = liveSettingCombineModel;
            if (liveSettingCombineModel.httpCode == 200) {
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                s.mo95837k().mo95880a(liveSettingCombineModel.getLiveSetting());
            }
            C67116a aVar = this.f150584a;
            if (aVar == null || aVar.httpCode != 200 || liveSettingCombineModel.getLiveSetting() == null || liveSettingCombineModel.getLiveSetting().status_code != 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
