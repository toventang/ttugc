package com.lynx.devtoolwrapper;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import java.lang.ref.WeakReference;

public class LynxInspectorManager {

    /* renamed from: a */
    private WeakReference<AbstractC28330a> f66533a;

    static {
        Covode.recordClassIndex(34289);
    }

    private native long nativeCreateInspectorManager(LynxInspectorManager lynxInspectorManager);

    private native void nativeDestroy(long j);

    private native long nativeGetFirstPerfContainer(long j);

    private native long nativeGetFunction(long j, int i);

    private native long nativeGetTemplateApiDefaultProcessor(long j);

    private native long nativeGetTemplateApiProcessorMap(long j);

    private native void nativeOnTASMCreated(long j, long j2);

    private native void nativeRunOnJSThread(long j, long j2);

    private native void nativeSetLynxEnv(long j, String str, boolean z);

    public long getJavascriptDebugger() {
        if (this.f66533a.get() != null) {
            return this.f66533a.get().mo48413c();
        }
        return 0;
    }

    public long getLepusDebugger() {
        AbstractC28330a aVar = this.f66533a.get();
        if (aVar != null) {
            return aVar.mo48414d();
        }
        return 0;
    }

    public long createInspectorRuntimeManager() {
        if (!LynxEnv.m56706b().f66640g || !LynxEnv.m56706b().mo48571d() || this.f66533a.get() == null) {
            return 0;
        }
        return this.f66533a.get().mo48412b();
    }

    public long getLynxDevtoolFunction(int i) {
        if (this.f66533a.get() != null) {
            return this.f66533a.get().mo48411a();
        }
        return 0;
    }

    public void call(String str, String str2) {
        if (this.f66533a.get() != null) {
            this.f66533a.get();
        }
    }

    public void sendConsoleMessage(String str, int i, long j) {
        if (this.f66533a.get() != null) {
            this.f66533a.get();
        }
    }
}
