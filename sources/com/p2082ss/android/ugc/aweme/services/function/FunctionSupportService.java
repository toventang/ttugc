package com.p2082ss.android.ugc.aweme.services.function;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.function.FunctionSupportService */
public final class FunctionSupportService implements IFunctionSupportService {
    public static final FunctionSupportService INSTANCE = new FunctionSupportService();
    private final /* synthetic */ IFunctionSupportService $$delegate_0;

    @Override // com.p2082ss.android.ugc.aweme.services.function.IFunctionSupportService
    public final boolean notSupport(IFunctionKey iFunctionKey) {
        return this.$$delegate_0.notSupport(iFunctionKey);
    }

    static {
        Covode.recordClassIndex(79886);
    }

    private FunctionSupportService() {
        IFunctionSupportService createIFunctionSupportServicebyMonsterPlugin = FunctionSupportServiceImpl.createIFunctionSupportServicebyMonsterPlugin(false);
        C89219l.m154716b(createIFunctionSupportServicebyMonsterPlugin, "");
        this.$$delegate_0 = createIFunctionSupportServicebyMonsterPlugin;
    }
}
