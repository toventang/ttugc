package com.p2082ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.p2082ss.android.ugc.aweme.kids.setting.api.ISettingService;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.C57878a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.SettingServiceImpl */
public final class SettingServiceImpl implements ISettingService {
    static {
        Covode.recordClassIndex(67798);
    }

    /* renamed from: a */
    public static ISettingService m104509a() {
        MethodCollector.m26663i(12749);
        Object a = C81908b.m141854a(ISettingService.class, false);
        if (a != null) {
            ISettingService iSettingService = (ISettingService) a;
            MethodCollector.m26664o(12749);
            return iSettingService;
        }
        if (C81908b.f183219bV == null) {
            synchronized (ISettingService.class) {
                try {
                    if (C81908b.f183219bV == null) {
                        C81908b.f183219bV = new SettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12749);
                    throw th;
                }
            }
        }
        SettingServiceImpl settingServiceImpl = (SettingServiceImpl) C81908b.f183219bV;
        MethodCollector.m26664o(12749);
        return settingServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.api.ISettingService
    /* renamed from: a */
    public final void mo95124a(Activity activity) {
        C89219l.m154721d(activity, "");
        Intent intent = new Intent(activity, KidsSettingActivity.class);
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.api.ISettingService
    /* renamed from: a */
    public final void mo95125a(KidsComplianceSettings kidsComplianceSettings) {
        int i;
        C89219l.m154721d(kidsComplianceSettings, "");
        C89219l.m154721d(kidsComplianceSettings, "");
        Integer timeLockSelfInMin = kidsComplianceSettings.getTimeLockSelfInMin();
        if (timeLockSelfInMin != null) {
            i = timeLockSelfInMin.intValue();
        } else {
            i = 0;
        }
        TeenageModeSetting teenageModeSetting = new TeenageModeSetting(i);
        C57878a.f131951a = teenageModeSetting;
        C57878a.m104637a(teenageModeSetting);
    }
}
