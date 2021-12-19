package com.p2082ss.android.ugc.aweme.legoImpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.legoapi.IAccountInitializerTaskApi;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.legoImpl.task.AccountRegisterTask;
import com.p2082ss.android.ugc.aweme.legoImpl.task.ApiGuardInitTask;
import com.p2082ss.android.ugc.aweme.legoImpl.task.LoginProxyTask;
import com.p2082ss.android.ugc.aweme.legoImpl.task.RegisterSessionReceiver;
import com.p2082ss.android.ugc.aweme.legoImpl.task.TokenSdkTask;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl */
public final class AccountInitializerTaskImpl implements IAccountInitializerTaskApi {
    static {
        Covode.recordClassIndex(68718);
    }

    @Override // com.p2082ss.android.legoapi.IAccountInitializerTaskApi
    /* renamed from: a */
    public final /* synthetic */ AbstractC58264w mo52278a() {
        return new RegisterSessionReceiver();
    }

    @Override // com.p2082ss.android.legoapi.IAccountInitializerTaskApi
    /* renamed from: b */
    public final /* synthetic */ AbstractC58264w mo52279b() {
        return new ApiGuardInitTask();
    }

    @Override // com.p2082ss.android.legoapi.IAccountInitializerTaskApi
    /* renamed from: c */
    public final /* synthetic */ AbstractC58264w mo52280c() {
        return new TokenSdkTask();
    }

    @Override // com.p2082ss.android.legoapi.IAccountInitializerTaskApi
    /* renamed from: d */
    public final /* synthetic */ AbstractC58264w mo52281d() {
        return new LoginProxyTask();
    }

    @Override // com.p2082ss.android.legoapi.IAccountInitializerTaskApi
    /* renamed from: e */
    public final /* synthetic */ AbstractC58264w mo52282e() {
        return new AccountRegisterTask();
    }

    /* renamed from: f */
    public static IAccountInitializerTaskApi m107036f() {
        MethodCollector.m26663i(3277);
        Object a = C81908b.m141854a(IAccountInitializerTaskApi.class, false);
        if (a != null) {
            IAccountInitializerTaskApi iAccountInitializerTaskApi = (IAccountInitializerTaskApi) a;
            MethodCollector.m26664o(3277);
            return iAccountInitializerTaskApi;
        }
        if (C81908b.f183291co == null) {
            synchronized (IAccountInitializerTaskApi.class) {
                try {
                    if (C81908b.f183291co == null) {
                        C81908b.f183291co = new AccountInitializerTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3277);
                    throw th;
                }
            }
        }
        AccountInitializerTaskImpl accountInitializerTaskImpl = (AccountInitializerTaskImpl) C81908b.f183291co;
        MethodCollector.m26664o(3277);
        return accountInitializerTaskImpl;
    }
}
