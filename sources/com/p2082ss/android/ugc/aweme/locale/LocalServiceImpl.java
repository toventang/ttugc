package com.p2082ss.android.ugc.aweme.locale;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;

/* renamed from: com.ss.android.ugc.aweme.locale.LocalServiceImpl */
public class LocalServiceImpl implements ILocalService {
    static {
        Covode.recordClassIndex(69266);
    }

    /* renamed from: a */
    public static ILocalService m108272a() {
        MethodCollector.m26663i(7780);
        Object a = C81908b.m141854a(ILocalService.class, false);
        if (a != null) {
            ILocalService iLocalService = (ILocalService) a;
            MethodCollector.m26664o(7780);
            return iLocalService;
        }
        if (C81908b.f183295cs == null) {
            synchronized (ILocalService.class) {
                try {
                    if (C81908b.f183295cs == null) {
                        C81908b.f183295cs = new LocalServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7780);
                    throw th;
                }
            }
        }
        LocalServiceImpl localServiceImpl = (LocalServiceImpl) C81908b.f183295cs;
        MethodCollector.m26664o(7780);
        return localServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.locale.ILocalService
    /* renamed from: a */
    public final String mo96421a(Context context) {
        String language = C53457c.m98651a(context).getLanguage();
        if (TextUtils.equals(language, "in")) {
            language = "id";
        }
        if (TextUtils.equals(language, "pt")) {
            language = "pt_BR";
        }
        if (TextUtils.equals(language, "zh")) {
            language = "zh_Hant";
        }
        if (TextUtils.equals(language, "km")) {
            return "en";
        }
        return language;
    }
}
