package com.p2082ss.android.ugc.aweme.legacy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.request.C67151c;
import com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a;
import com.p2082ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner;

/* renamed from: com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl */
public class ColdLaunchRequestCombinerImpl implements IColdLaunchRequestCombiner {

    /* renamed from: a */
    private final IColdLaunchRequestCombiner f132327a = C67151c.f150563d;

    static {
        Covode.recordClassIndex(68138);
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    /* renamed from: a */
    public final boolean mo95594a() {
        return this.f132327a.mo95594a();
    }

    /* renamed from: b */
    public static IColdLaunchRequestCombiner m104985b() {
        MethodCollector.m26663i(6733);
        Object a = C81908b.m141854a(IColdLaunchRequestCombiner.class, false);
        if (a != null) {
            IColdLaunchRequestCombiner iColdLaunchRequestCombiner = (IColdLaunchRequestCombiner) a;
            MethodCollector.m26664o(6733);
            return iColdLaunchRequestCombiner;
        }
        if (C81908b.f183280cd == null) {
            synchronized (IColdLaunchRequestCombiner.class) {
                try {
                    if (C81908b.f183280cd == null) {
                        C81908b.f183280cd = new ColdLaunchRequestCombinerImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6733);
                    throw th;
                }
            }
        }
        ColdLaunchRequestCombinerImpl coldLaunchRequestCombinerImpl = (ColdLaunchRequestCombinerImpl) C81908b.f183280cd;
        MethodCollector.m26664o(6733);
        return coldLaunchRequestCombinerImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    /* renamed from: a */
    public final C67116a mo95592a(String str) {
        return this.f132327a.mo95592a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    /* renamed from: a */
    public final void mo95593a(AbstractC67176a aVar) {
        this.f132327a.mo95593a(aVar);
    }
}
