package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.instrumentation.interceptor.AddHeaderInterceptor;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventFactory;
import com.bytedance.covode.number.Covode;
import okhttp3.C90208y;

public class OkHttp3Instrumentation {
    static {
        Covode.recordClassIndex(14031);
    }

    public static C90208y init() {
        C90208y.C90210a a = new C90208y.C90210a().mo145096a(new AddHeaderInterceptor());
        a.f204937g = new OkHttpEventFactory(null);
        return a.mo145103d();
    }

    public static C90208y build(C90208y.C90210a aVar) {
        C90208y d = aVar.mo145103d();
        C90208y.C90210a a = aVar.mo145096a(new AddHeaderInterceptor());
        a.f204937g = new OkHttpEventFactory(d.f204911i);
        return a.mo145103d();
    }
}
