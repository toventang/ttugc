package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService;
import com.p2082ss.android.ugc.aweme.setting.services.ISettingService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.IAVSettingServiceImpl */
public final class IAVSettingServiceImpl implements IAVSettingService {
    private final ISettingService settingService = SettingServiceImpl.m120782v();

    static {
        Covode.recordClassIndex(79619);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService
    public final String getAppLanguage() {
        return this.settingService.mo108872h();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService
    public final String getAppLogRegion() {
        return this.settingService.mo108878n();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService
    public final Locale getCountryLocale() {
        return this.settingService.mo108881q();
    }

    public final List<AbstractC58069b> getI18nItems() {
        return this.settingService.mo108873i();
    }

    public final Map<String, AbstractC58069b> getLocaleMap() {
        return this.settingService.mo108874j();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService
    public final String getRegion() {
        return this.settingService.mo108877m();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService
    public final String getSysLanguage() {
        return this.settingService.mo108875k();
    }

    public final String getSysRegion() {
        return this.settingService.mo108876l();
    }

    public final void installCommonParams() {
        this.settingService.mo108882r();
    }

    public final boolean isIndonesiaByMcc() {
        return this.settingService.mo108879o();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService
    public final boolean isKorean() {
        return this.settingService.mo108880p();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService
    public final boolean getSaveAtPost() {
        return SettingsManager.m29616a().mo25400a("disable_save_at_post", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService
    public final AbstractC58069b getCurrentI18nItem(Context context) {
        C89219l.m154721d(context, "");
        return this.settingService.mo108857a(context);
    }

    public final String getLanguage(Locale locale) {
        C89219l.m154721d(locale, "");
        return this.settingService.mo108859a(locale);
    }

    public final Locale getLocale(String str) {
        C89219l.m154721d(str, "");
        return this.settingService.mo108861a(str);
    }

    public final boolean isArabicLang(Context context) {
        C89219l.m154721d(context, "");
        return this.settingService.mo108866b(context);
    }

    public static IAVSettingService createIAVSettingServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(5502);
        Object a = C81908b.m141854a(IAVSettingService.class, z);
        if (a != null) {
            IAVSettingService iAVSettingService = (IAVSettingService) a;
            MethodCollector.m26664o(5502);
            return iAVSettingService;
        }
        if (C81908b.f183347dr == null) {
            synchronized (IAVSettingService.class) {
                try {
                    if (C81908b.f183347dr == null) {
                        C81908b.f183347dr = new IAVSettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5502);
                    throw th;
                }
            }
        }
        IAVSettingServiceImpl iAVSettingServiceImpl = (IAVSettingServiceImpl) C81908b.f183347dr;
        MethodCollector.m26664o(5502);
        return iAVSettingServiceImpl;
    }

    public final void switchLocale(String str, String str2, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(context, "");
        this.settingService.mo108863a(str, str2, context);
    }
}
