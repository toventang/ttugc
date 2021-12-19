package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.p2082ss.android.ugc.aweme.shortvideo.p3895y.C74325a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ActivityRouterServiceImpl */
public final class ActivityRouterServiceImpl implements IActivityRouterService {
    static {
        Covode.recordClassIndex(37914);
    }

    @Override // com.p2082ss.android.ugc.aweme.IActivityRouterService
    /* renamed from: a */
    public final Class<? extends Activity> mo57026a() {
        return DeepLinkActivityV2.class;
    }

    /* renamed from: b */
    public static IActivityRouterService m65216b() {
        MethodCollector.m26663i(5933);
        Object a = C81908b.m141854a(IActivityRouterService.class, false);
        if (a != null) {
            IActivityRouterService iActivityRouterService = (IActivityRouterService) a;
            MethodCollector.m26664o(5933);
            return iActivityRouterService;
        }
        if (C81908b.f183403l == null) {
            synchronized (IActivityRouterService.class) {
                try {
                    if (C81908b.f183403l == null) {
                        C81908b.f183403l = new ActivityRouterServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5933);
                    throw th;
                }
            }
        }
        ActivityRouterServiceImpl activityRouterServiceImpl = (ActivityRouterServiceImpl) C81908b.f183403l;
        MethodCollector.m26664o(5933);
        return activityRouterServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.IActivityRouterService
    /* renamed from: a */
    public final Intent mo57025a(Context context, Uri uri) {
        Intent a = C40520b.m81719a(context, uri);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.IActivityRouterService
    /* renamed from: a */
    public final void mo57027a(Activity activity, Uri uri) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        C74325a.m130797a(activity, uri);
    }
}
