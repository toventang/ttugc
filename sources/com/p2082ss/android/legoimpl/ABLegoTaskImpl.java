package com.p2082ss.android.legoimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.legoapi.abtest.IABLegoTaskApi;
import com.p2082ss.android.sdk.app.AbTestSdkInitTask;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.legoImp.task.ABTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.AsyncABAndPreloadRepoTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadInstanceOnAttachTask;

/* renamed from: com.ss.android.legoimpl.ABLegoTaskImpl */
public final class ABLegoTaskImpl implements IABLegoTaskApi {
    static {
        Covode.recordClassIndex(36374);
    }

    @Override // com.p2082ss.android.legoapi.abtest.IABLegoTaskApi
    /* renamed from: a */
    public final AbstractC58264w mo52298a() {
        return new ABTask();
    }

    @Override // com.p2082ss.android.legoapi.abtest.IABLegoTaskApi
    /* renamed from: b */
    public final AbstractC58264w mo52299b() {
        return new AbTestSdkInitTask();
    }

    @Override // com.p2082ss.android.legoapi.abtest.IABLegoTaskApi
    /* renamed from: c */
    public final AbstractC58264w mo52300c() {
        return new AsyncABAndPreloadRepoTask();
    }

    @Override // com.p2082ss.android.legoapi.abtest.IABLegoTaskApi
    /* renamed from: d */
    public final AbstractC58264w mo52301d() {
        return new PreloadInstanceOnAttachTask();
    }

    /* renamed from: e */
    public static IABLegoTaskApi m60405e() {
        MethodCollector.m26663i(3722);
        Object a = C81908b.m141854a(IABLegoTaskApi.class, false);
        if (a != null) {
            IABLegoTaskApi iABLegoTaskApi = (IABLegoTaskApi) a;
            MethodCollector.m26664o(3722);
            return iABLegoTaskApi;
        }
        if (C81908b.f183400i == null) {
            synchronized (IABLegoTaskApi.class) {
                try {
                    if (C81908b.f183400i == null) {
                        C81908b.f183400i = new ABLegoTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3722);
                    throw th;
                }
            }
        }
        ABLegoTaskImpl aBLegoTaskImpl = (ABLegoTaskImpl) C81908b.f183400i;
        MethodCollector.m26664o(3722);
        return aBLegoTaskImpl;
    }
}
