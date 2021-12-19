package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.views.C38805a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.IAdLightWebPageOpen;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageOpenUtils */
public final class AdLightWebPageOpenUtils implements IAdLightWebPageOpen {
    static {
        Covode.recordClassIndex(46337);
    }

    /* renamed from: a */
    public static IAdLightWebPageOpen m78719a() {
        MethodCollector.m26663i(8178);
        Object a = C81908b.m141854a(IAdLightWebPageOpen.class, false);
        if (a != null) {
            IAdLightWebPageOpen iAdLightWebPageOpen = (IAdLightWebPageOpen) a;
            MethodCollector.m26664o(8178);
            return iAdLightWebPageOpen;
        }
        if (C81908b.f183192av == null) {
            synchronized (IAdLightWebPageOpen.class) {
                try {
                    if (C81908b.f183192av == null) {
                        C81908b.f183192av = new AdLightWebPageOpenUtils();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8178);
                    throw th;
                }
            }
        }
        AdLightWebPageOpenUtils adLightWebPageOpenUtils = (AdLightWebPageOpenUtils) C81908b.f183192av;
        MethodCollector.m26664o(8178);
        return adLightWebPageOpenUtils;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IAdLightWebPageOpen
    /* renamed from: a */
    public final void mo59123a(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C38805a.C38809d dVar = C38805a.f91639n;
        boolean unused = C38805a.C38809d.m78760a(activity, str, C38805a.f91638m);
    }
}
