package com.p2082ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.app.services.IRegionService;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.util.o */
public final class C33046o {

    /* renamed from: a */
    public static final C33046o f78596a = new C33046o();

    private C33046o() {
    }

    static {
        Covode.recordClassIndex(39853);
    }

    /* renamed from: a */
    public static String m67682a(String str) {
        C89219l.m154721d(str, "");
        return "https://www.tiktok.com/in_app/redirect?region=" + ((IRegionService) C31291a.m65463a(IRegionService.class)).mo60087a() + "&language=" + ((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a() + "&projectKey=" + str;
    }
}
