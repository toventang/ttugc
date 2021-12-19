package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.MainMixActivityContainer;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider */
public class MixActivityContainerProvider implements IMixActivityContainerProvider {
    static {
        Covode.recordClassIndex(48401);
    }

    /* renamed from: a */
    public static IMixActivityContainerProvider m81898a() {
        MethodCollector.m26663i(6409);
        Object a = C81908b.m141854a(IMixActivityContainerProvider.class, false);
        if (a != null) {
            IMixActivityContainerProvider iMixActivityContainerProvider = (IMixActivityContainerProvider) a;
            MethodCollector.m26664o(6409);
            return iMixActivityContainerProvider;
        }
        if (C81908b.f183165aU == null) {
            synchronized (IMixActivityContainerProvider.class) {
                try {
                    if (C81908b.f183165aU == null) {
                        C81908b.f183165aU = new MixActivityContainerProvider();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6409);
                    throw th;
                }
            }
        }
        MixActivityContainerProvider mixActivityContainerProvider = (MixActivityContainerProvider) C81908b.f183165aU;
        MethodCollector.m26664o(6409);
        return mixActivityContainerProvider;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider
    /* renamed from: a */
    public final MixActivityContainer mo69717a(Activity activity, C40618a aVar) {
        return new MainMixActivityContainer(activity, aVar);
    }
}
