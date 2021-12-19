package com.p2082ss.android.ugc.aweme.services.function;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.services.function.FunctionSupportServiceImpl */
public class FunctionSupportServiceImpl implements IFunctionSupportService {
    static {
        Covode.recordClassIndex(79887);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.function.IFunctionSupportService
    public boolean notSupport(IFunctionKey iFunctionKey) {
        return false;
    }

    public static IFunctionSupportService createIFunctionSupportServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(6464);
        Object a = C81908b.m141854a(IFunctionSupportService.class, z);
        if (a != null) {
            IFunctionSupportService iFunctionSupportService = (IFunctionSupportService) a;
            MethodCollector.m26664o(6464);
            return iFunctionSupportService;
        }
        if (C81908b.f183305dB == null) {
            synchronized (IFunctionSupportService.class) {
                try {
                    if (C81908b.f183305dB == null) {
                        C81908b.f183305dB = new FunctionSupportServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6464);
                    throw th;
                }
            }
        }
        FunctionSupportServiceImpl functionSupportServiceImpl = (FunctionSupportServiceImpl) C81908b.f183305dB;
        MethodCollector.m26664o(6464);
        return functionSupportServiceImpl;
    }
}
