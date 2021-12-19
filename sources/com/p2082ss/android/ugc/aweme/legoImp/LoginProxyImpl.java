package com.p2082ss.android.ugc.aweme.legoImp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34542e;
import com.p2082ss.android.ugc.aweme.login.ILoginProxy;
import com.p2082ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;

/* renamed from: com.ss.android.ugc.aweme.legoImp.LoginProxyImpl */
public final class LoginProxyImpl implements ILoginProxy {
    static {
        Covode.recordClassIndex(68343);
    }

    @Override // com.p2082ss.android.ugc.aweme.login.ILoginProxy
    /* renamed from: a */
    public final AbstractC34542e mo95711a() {
        return new I18nLoginActivityComponent();
    }

    /* renamed from: b */
    public static ILoginProxy m105236b() {
        MethodCollector.m26663i(1578);
        Object a = C81908b.m141854a(ILoginProxy.class, false);
        if (a != null) {
            ILoginProxy iLoginProxy = (ILoginProxy) a;
            MethodCollector.m26664o(1578);
            return iLoginProxy;
        }
        if (C81908b.f183284ch == null) {
            synchronized (ILoginProxy.class) {
                try {
                    if (C81908b.f183284ch == null) {
                        C81908b.f183284ch = new LoginProxyImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1578);
                    throw th;
                }
            }
        }
        LoginProxyImpl loginProxyImpl = (LoginProxyImpl) C81908b.f183284ch;
        MethodCollector.m26664o(1578);
        return loginProxyImpl;
    }
}
