package com.p2082ss.android.ugc.aweme.settingsrequest;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67136e;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz;
import com.p2082ss.android.ugc.aweme.setting.ISettingManagerService;
import com.p2082ss.android.ugc.aweme.settingsrequest.api.C68776g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl */
public final class SettingManagerServiceImpl implements ISettingManagerService {
    static {
        Covode.recordClassIndex(81039);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.ISettingManagerService
    /* renamed from: a */
    public final void mo108577a() {
        C58221f.m105153e().mo95704a(new C68776g()).mo95706a();
    }

    /* renamed from: b */
    public static ISettingManagerService m121205b() {
        MethodCollector.m26663i(11746);
        Object a = C81908b.m141854a(ISettingManagerService.class, false);
        if (a != null) {
            ISettingManagerService iSettingManagerService = (ISettingManagerService) a;
            MethodCollector.m26664o(11746);
            return iSettingManagerService;
        }
        if (C81908b.f183320dQ == null) {
            synchronized (ISettingManagerService.class) {
                try {
                    if (C81908b.f183320dQ == null) {
                        C81908b.f183320dQ = new SettingManagerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11746);
                    throw th;
                }
            }
        }
        SettingManagerServiceImpl settingManagerServiceImpl = (SettingManagerServiceImpl) C81908b.f183320dQ;
        MethodCollector.m26664o(11746);
        return settingManagerServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.ISettingManagerService
    /* renamed from: a */
    public final void mo108579a(Context context) {
        C89219l.m154721d(context, "");
        AbstractC68041bz.f152407a.mo108656a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.ISettingManagerService
    /* renamed from: a */
    public final void mo108578a(int i) {
        C58221f.m105153e().mo95704a(new C67136e(i)).mo95706a();
    }
}
