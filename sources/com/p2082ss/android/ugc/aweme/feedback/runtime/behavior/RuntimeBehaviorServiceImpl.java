package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl */
public class RuntimeBehaviorServiceImpl implements IRuntimeBehaviorService {

    /* renamed from: a */
    private IRuntimeBehaviorService f116880a = C50580b.f116886a;

    static {
        Covode.recordClassIndex(59727);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: b */
    public final Map<String, String> mo85868b() {
        return this.f116880a.mo85868b();
    }

    /* renamed from: c */
    public static IRuntimeBehaviorService m94812c() {
        MethodCollector.m26663i(3183);
        Object a = C81908b.m141854a(IRuntimeBehaviorService.class, false);
        if (a != null) {
            IRuntimeBehaviorService iRuntimeBehaviorService = (IRuntimeBehaviorService) a;
            MethodCollector.m26664o(3183);
            return iRuntimeBehaviorService;
        }
        if (C81908b.f183236bm == null) {
            synchronized (IRuntimeBehaviorService.class) {
                try {
                    if (C81908b.f183236bm == null) {
                        C81908b.f183236bm = new RuntimeBehaviorServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3183);
                    throw th;
                }
            }
        }
        RuntimeBehaviorServiceImpl runtimeBehaviorServiceImpl = (RuntimeBehaviorServiceImpl) C81908b.f183236bm;
        MethodCollector.m26664o(3183);
        return runtimeBehaviorServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: a */
    public final boolean mo85867a() {
        return this.f116880a.mo85867a();
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: a */
    public final void mo85864a(Context context) {
        this.f116880a.mo85864a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: a */
    public final void mo85865a(String str) {
        this.f116880a.mo85865a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: a */
    public final void mo85866a(String str, String str2) {
        this.f116880a.mo85866a(str, str2);
    }
}
