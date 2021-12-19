package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;

/* renamed from: com.ss.android.ugc.aweme.utils.LanguageService */
public final class LanguageService implements LanguageProvider {
    static {
        Covode.recordClassIndex(93430);
    }

    /* renamed from: a */
    public static LanguageProvider m138959a() {
        MethodCollector.m26663i(7676);
        Object a = C81908b.m141854a(LanguageProvider.class, false);
        if (a != null) {
            LanguageProvider languageProvider = (LanguageProvider) a;
            MethodCollector.m26664o(7676);
            return languageProvider;
        }
        if (C81908b.f183394ex == null) {
            synchronized (LanguageProvider.class) {
                try {
                    if (C81908b.f183394ex == null) {
                        C81908b.f183394ex = new LanguageService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7676);
                    throw th;
                }
            }
        }
        LanguageService languageService = (LanguageService) C81908b.f183394ex;
        MethodCollector.m26664o(7676);
        return languageService;
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.LanguageProvider
    /* renamed from: a */
    public final void mo123623a(Activity activity) {
        C53438a.m98620a(activity);
    }
}
