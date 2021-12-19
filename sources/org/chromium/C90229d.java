package org.chromium;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;

/* renamed from: org.chromium.d */
public class C90229d implements ICronetDepend {

    /* renamed from: a */
    private static volatile C90229d f204966a;

    /* renamed from: b */
    private ICronetDepend f204967b;

    static {
        Covode.recordClassIndex(106488);
    }

    private C90229d() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public String getSsCookieKey() {
        ICronetDepend iCronetDepend = this.f204967b;
        if (iCronetDepend != null) {
            return iCronetDepend.getSsCookieKey();
        }
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        ICronetDepend iCronetDepend = this.f204967b;
        if (iCronetDepend != null) {
            return iCronetDepend.loggerDebug();
        }
        return false;
    }

    /* renamed from: a */
    public static C90229d m156924a() {
        MethodCollector.m26663i(6613);
        if (f204966a == null) {
            synchronized (C90229d.class) {
                try {
                    if (f204966a == null) {
                        f204966a = new C90229d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6613);
                    throw th;
                }
            }
        }
        C90229d dVar = f204966a;
        MethodCollector.m26664o(6613);
        return dVar;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void setAdapter(ICronetDepend iCronetDepend) {
        this.f204967b = iCronetDepend;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void loggerD(String str, String str2) {
        ICronetDepend iCronetDepend = this.f204967b;
        if (iCronetDepend != null) {
            iCronetDepend.loggerD(str, str2);
        }
    }
}
