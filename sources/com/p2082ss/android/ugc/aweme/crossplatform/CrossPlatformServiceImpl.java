package com.p2082ss.android.ugc.aweme.crossplatform;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.sdk.webview.C30265i;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.aweme.web.p4238b.C81536b;
import com.p2082ss.android.ugc.aweme.web.p4238b.C81537c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.CrossPlatformServiceImpl */
public class CrossPlatformServiceImpl implements ICrossPlatformService {
    static {
        Covode.recordClassIndex(48329);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.ICrossPlatformService
    /* renamed from: a */
    public final Class<? extends Activity> mo69601a() {
        return CrossPlatformActivity.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.ICrossPlatformService
    /* renamed from: b */
    public final String mo69603b() {
        return C81631k.f182525a.mo125297c();
    }

    /* renamed from: c */
    public static ICrossPlatformService m81709c() {
        MethodCollector.m26663i(3944);
        Object a = C81908b.m141854a(ICrossPlatformService.class, false);
        if (a != null) {
            ICrossPlatformService iCrossPlatformService = (ICrossPlatformService) a;
            MethodCollector.m26664o(3944);
            return iCrossPlatformService;
        }
        if (C81908b.f183164aT == null) {
            synchronized (ICrossPlatformService.class) {
                try {
                    if (C81908b.f183164aT == null) {
                        C81908b.f183164aT = new CrossPlatformServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3944);
                    throw th;
                }
            }
        }
        CrossPlatformServiceImpl crossPlatformServiceImpl = (CrossPlatformServiceImpl) C81908b.f183164aT;
        MethodCollector.m26664o(3944);
        return crossPlatformServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.ICrossPlatformService
    /* renamed from: a */
    public final void mo69602a(Context context, Map<String, String> map) {
        C81537c a = C81537c.m141403a();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            a.f182334b = applicationContext;
        }
        a.f182333a = map;
        C30265i.m61248a().mo53720a(new C81536b());
    }
}
