package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.core.JSProxy;

/* renamed from: com.lynx.jsbridge.b */
public class C28357b {

    /* renamed from: a */
    private final String f66604a;

    /* renamed from: b */
    private final JSProxy f66605b;

    static {
        Covode.recordClassIndex(34332);
    }

    public C28357b(String str, JSProxy jSProxy) {
        this.f66604a = str;
        this.f66605b = jSProxy;
    }

    /* renamed from: a */
    public final void mo48479a(String str, JavaOnlyArray javaOnlyArray) {
        MethodCollector.m26663i(1913);
        JSProxy jSProxy = this.f66605b;
        String str2 = this.f66604a;
        jSProxy.f67787d.readLock().lock();
        if (jSProxy.f67784a != 0) {
            jSProxy.nativeCallJSFunction(jSProxy.f67784a, str2, str, javaOnlyArray);
        }
        jSProxy.f67787d.readLock().unlock();
        MethodCollector.m26664o(1913);
    }
}
